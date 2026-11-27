package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class a65 implements t69, nr7, NativeInstance.AudioLevelsCallback, l8, n7 {
    public final byte a;
    public final j95 b;

    public a65(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        int keyboardHeight;
        i2d i2dVar = l2dVar.a;
        mq5 f = i2dVar.f(647);
        mq5 f2 = i2dVar.f(8);
        j95 j95Var = this.b;
        q75 q75Var = j95Var.A1;
        if (!q75Var.O && !q75Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = q75Var.getKeyboardHeight();
        }
        int max = Math.max(f2.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = j95Var.U3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f.d;
        }
        if (q75Var.getEmojiView() != null) {
            q75Var.getEmojiView().setBottomInset(f.d);
        }
        ViewGroup viewGroup = j95Var.b;
        int i = j95Var.u0;
        viewGroup.setPadding(f.a + i, f.b, i + f.c, f.d);
        j95Var.b.requestLayout();
        if (max == 0 && !q75Var.O && !q75Var.e && !q75Var.P) {
            q75Var.j();
        }
        if (max > 0) {
            i49 i49Var = j95Var.D1;
            if (i49Var == null) {
                e Q = LaunchActivity.Q();
                i49Var = null;
                if (Q != null) {
                    i49 i49Var2 = new i49(1, j95Var.a, j95Var.J0, j95Var.getContext(), Q);
                    j95Var.D1 = i49Var2;
                    i49Var2.setDelegate(new q85(j95Var));
                    j95Var.b.addView(j95Var.D1, tre.e(-2, 52, 81));
                    j95Var.D1.m(null, null, false);
                    j95Var.z1.bringToFront();
                    j95Var.y1.bringToFront();
                    i49Var = j95Var.D1;
                }
            }
            j95Var.D1 = i49Var;
        }
        q75Var.L(f2.d, false);
        j95Var.w3.j(l2dVar);
        return l2d.b;
    }

    @Override
    public final boolean e(int i, View view) {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                if (j95Var.B1(view)) {
                    try {
                        j95Var.J1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                if (view instanceof q95) {
                    return j95Var.B1(view);
                }
                if (!(view instanceof zb5)) {
                    return false;
                }
                j95Var.F1();
                e29 e29Var = ((zb5) view).f;
                if (!e29Var.isEnabled()) {
                    return false;
                }
                e29Var.callOnClick();
                return true;
        }
    }

    @Override
    public final void g(int i) {
        this.b.H1.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        j95 j95Var;
        o85 o85Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o85Var = (j95Var = this.b).U4) != null && o85Var.isShowing()) {
            j95Var.U4.dismiss();
        }
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        f89 L;
        j95 j95Var = this.b;
        c75 c75Var = j95Var.e4;
        g75 g75Var = j95Var.T3;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) j95Var.T2.p.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (!g75Var.b) {
                    if (j95Var.l2) {
                        arrayList = j95Var.x2;
                    } else {
                        arrayList = j95Var.T2.g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (L = j95Var.J1.L(indexOf + j95Var.I1.d)) != null) {
                        View view = L.a;
                        if (view instanceof zb5) {
                            ((zb5) view).setAmplitude(fArr[i] * 15.0f);
                            if (view == j95Var.M4 && !j95Var.d4) {
                                j95Var.b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < c75Var.getChildCount(); i2++) {
                        o95 o95Var = (o95) c75Var.getChildAt(i2);
                        if (r47.B1(o95Var.getParticipant().peer) == r47.B1(groupCallParticipant.peer)) {
                            o95Var.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                g75Var.i(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }
}
