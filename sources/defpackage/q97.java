package defpackage;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class q97 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final jm7 d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public q97(jm7 jm7Var, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.e = obj;
        this.f = obj2;
        this.h = obj3;
        this.n = obj4;
        this.b = z;
        this.c = z2;
        this.r = obj5;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        Object obj = this.r;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                d dVar = (d) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.InputUser inputUser = (TLRPC.InputUser) obj;
                if (((ac7) obj5) == null) {
                    int i = oc7Var.currentAccount;
                    if (z3 && !z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ik.c0(i, tL_error, dVar, tLObject, Boolean.valueOf(z));
                }
                if (z3 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    oc7Var.getNotificationCenter().k(2, 8192);
                    return;
                }
                return;
            default:
                yv1 yv1Var = (yv1) jm7Var;
                String str = (String) obj5;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                k47 k47Var = (k47) obj3;
                rc2 rc2Var = (rc2) obj2;
                tv0 tv0Var = (tv0) obj;
                if (str.startsWith("video?")) {
                    yv1Var.m6(characterStyle, false, k47Var, rc2Var);
                    return;
                } else if (z3 && !z2) {
                    tv0Var.run();
                    yv1Var.getParentActivity();
                    l11.p(str);
                    return;
                } else {
                    yv1Var.Y9(k47Var, false, false);
                    tv0Var.run();
                    yv1Var.oa(characterStyle, str, false, rc2Var, k47Var);
                    return;
                }
        }
    }
}
