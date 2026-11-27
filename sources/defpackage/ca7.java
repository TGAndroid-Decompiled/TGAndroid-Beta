package defpackage;

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ca7 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final fn7 d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public ca7(fn7 fn7Var, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, byte b) {
        this.a = b;
        this.d = fn7Var;
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
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) fn7Var;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                e eVar = (e) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.InputUser inputUser = (TLRPC.InputUser) obj;
                if (((gc7) obj5) == null) {
                    int i = uc7Var.currentAccount;
                    if (z3 && !z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jj.c0(i, tL_error, eVar, tLObject, Boolean.valueOf(z));
                }
                if (z3 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    uc7Var.getNotificationCenter().k(2, 8192);
                    return;
                }
                return;
            default:
                zu1 zu1Var = (zu1) fn7Var;
                String str = (String) obj5;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                r47 r47Var = (r47) obj3;
                wb2 wb2Var = (wb2) obj2;
                tu0 tu0Var = (tu0) obj;
                if (str.startsWith("video?")) {
                    zu1Var.m6(characterStyle, false, r47Var, wb2Var);
                    return;
                } else if (z3 && !z2) {
                    tu0Var.run();
                    zu1Var.getParentActivity();
                    m01.p(str);
                    return;
                } else {
                    zu1Var.Z9(r47Var, false, false);
                    tu0Var.run();
                    zu1Var.pa(characterStyle, str, false, wb2Var, r47Var);
                    return;
                }
        }
    }
}
