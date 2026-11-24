package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class x35 implements e39, no7, NativeInstance.AudioLevelsCallback, k8, m7 {
    public final byte a;
    public final h75 b;

    public x35(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        int keyboardHeight;
        sxc sxcVar = vxcVar.a;
        io5 f = sxcVar.f(647);
        io5 f2 = sxcVar.f(8);
        h75 h75Var = this.b;
        o55 o55Var = h75Var.A1;
        if (!o55Var.O && !o55Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = o55Var.getKeyboardHeight();
        }
        int max = Math.max(f2.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = h75Var.U3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f.d;
        }
        if (o55Var.getEmojiView() != null) {
            o55Var.getEmojiView().setBottomInset(f.d);
        }
        ViewGroup viewGroup = h75Var.b;
        int i = h75Var.u0;
        viewGroup.setPadding(f.a + i, f.b, i + f.c, f.d);
        h75Var.b.requestLayout();
        if (max == 0 && !o55Var.O && !o55Var.e && !o55Var.P) {
            o55Var.j();
        }
        if (max > 0) {
            t09 t09Var = h75Var.D1;
            if (t09Var == null) {
                d Q = LaunchActivity.Q();
                t09Var = null;
                if (Q != null) {
                    t09 t09Var2 = new t09(1, h75Var.a, h75Var.J0, h75Var.getContext(), Q);
                    h75Var.D1 = t09Var2;
                    t09Var2.setDelegate(new o65(h75Var));
                    h75Var.b.addView(h75Var.D1, nme.e(-2, 52, 81));
                    h75Var.D1.m(null, null, false);
                    h75Var.z1.bringToFront();
                    h75Var.y1.bringToFront();
                    t09Var = h75Var.D1;
                }
            }
            h75Var.D1 = t09Var;
        }
        o55Var.L(f2.d, false);
        h75Var.w3.j(vxcVar);
        return vxc.b;
    }

    @Override
    public final boolean d(int i, View view) {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                if (h75Var.A1(view)) {
                    try {
                        h75Var.J1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                if (view instanceof o75) {
                    return h75Var.A1(view);
                }
                if (!(view instanceof y95)) {
                    return false;
                }
                h75Var.E1();
                ry8 ry8Var = ((y95) view).f;
                if (!ry8Var.isEnabled()) {
                    return false;
                }
                ry8Var.callOnClick();
                return true;
        }
    }

    @Override
    public final void h(int i) {
        this.b.H1.getActionBarMenuOnItemClick().b(i);
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        h75 h75Var;
        m65 m65Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m65Var = (h75Var = this.b).U4) != null && m65Var.isShowing()) {
            h75Var.U4.dismiss();
        }
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        s49 K;
        h75 h75Var = this.b;
        a55 a55Var = h75Var.e4;
        e55 e55Var = h75Var.T3;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) h75Var.T2.p.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (!e55Var.b) {
                    if (h75Var.l2) {
                        arrayList = h75Var.x2;
                    } else {
                        arrayList = h75Var.T2.g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = h75Var.J1.K(indexOf + h75Var.I1.d)) != null) {
                        View view = K.a;
                        if (view instanceof y95) {
                            ((y95) view).setAmplitude(fArr[i] * 15.0f);
                            if (view == h75Var.M4 && !h75Var.d4) {
                                h75Var.b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < a55Var.getChildCount(); i2++) {
                        m75 m75Var = (m75) a55Var.getChildAt(i2);
                        if (k27.B1(m75Var.getParticipant().peer) == k27.B1(groupCallParticipant.peer)) {
                            m75Var.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                e55Var.i(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }
}
