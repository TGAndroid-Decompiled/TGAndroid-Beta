package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class w55 implements h59, qq7, NativeInstance.AudioLevelsCallback, k8, m7 {
    public final byte a;
    public final g95 b;

    public w55(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        int keyboardHeight;
        tzc tzcVar = wzcVar.a;
        iq5 f = tzcVar.f(647);
        iq5 f2 = tzcVar.f(8);
        g95 g95Var = this.b;
        m75 m75Var = g95Var.A1;
        if (!m75Var.O && !m75Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = m75Var.getKeyboardHeight();
        }
        int max = Math.max(f2.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = g95Var.U3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f.d;
        }
        if (m75Var.getEmojiView() != null) {
            m75Var.getEmojiView().setBottomInset(f.d);
        }
        ViewGroup viewGroup = g95Var.b;
        int i = g95Var.u0;
        viewGroup.setPadding(f.a + i, f.b, i + f.c, f.d);
        g95Var.b.requestLayout();
        if (max == 0 && !m75Var.O && !m75Var.e && !m75Var.P) {
            m75Var.j();
        }
        if (max > 0) {
            v29 v29Var = g95Var.D1;
            if (v29Var == null) {
                d Q = LaunchActivity.Q();
                v29Var = null;
                if (Q != null) {
                    v29 v29Var2 = new v29(1, g95Var.a, g95Var.J0, g95Var.getContext(), Q);
                    g95Var.D1 = v29Var2;
                    v29Var2.setDelegate(new m85(g95Var));
                    g95Var.b.addView(g95Var.D1, qoe.e(-2, 52, 81));
                    g95Var.D1.m(null, null, false);
                    g95Var.z1.bringToFront();
                    g95Var.y1.bringToFront();
                    v29Var = g95Var.D1;
                }
            }
            g95Var.D1 = v29Var;
        }
        m75Var.L(f2.d, false);
        g95Var.w3.j(wzcVar);
        return wzc.b;
    }

    @Override
    public final boolean g(int i, View view) {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                if (g95Var.A1(view)) {
                    try {
                        g95Var.J1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                if (view instanceof n95) {
                    return g95Var.A1(view);
                }
                if (!(view instanceof wb5)) {
                    return false;
                }
                g95Var.E1();
                s09 s09Var = ((wb5) view).f;
                if (!s09Var.isEnabled()) {
                    return false;
                }
                s09Var.callOnClick();
                return true;
        }
    }

    @Override
    public final void h(int i) {
        this.b.H1.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        g95 g95Var;
        k85 k85Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k85Var = (g95Var = this.b).U4) != null && k85Var.isShowing()) {
            g95Var.U4.dismiss();
        }
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        u69 K;
        g95 g95Var = this.b;
        y65 y65Var = g95Var.e4;
        c75 c75Var = g95Var.T3;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) g95Var.T2.p.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (!c75Var.b) {
                    if (g95Var.l2) {
                        arrayList = g95Var.x2;
                    } else {
                        arrayList = g95Var.T2.g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = g95Var.J1.K(indexOf + g95Var.I1.d)) != null) {
                        View view = K.a;
                        if (view instanceof wb5) {
                            ((wb5) view).setAmplitude(fArr[i] * 15.0f);
                            if (view == g95Var.M4 && !g95Var.d4) {
                                g95Var.b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < y65Var.getChildCount(); i2++) {
                        l95 l95Var = (l95) y65Var.getChildAt(i2);
                        if (k47.B1(l95Var.getParticipant().peer) == k47.B1(groupCallParticipant.peer)) {
                            l95Var.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                c75Var.i(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }
}
