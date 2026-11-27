package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf6 implements Runnable {
    public final byte a = 0;
    public final sf6 b;
    public final TLRPC.TL_error c;
    public final Bundle d;
    public final TLObject e;

    public pf6(sf6 sf6Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = sf6Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.c;
        sf6 sf6Var = this.b;
        switch (b) {
            case 0:
                qh6 qh6Var = sf6Var.b0;
                sf6Var.N = false;
                sf6Var.w.invalidate();
                if (tLObject != null) {
                    sf6Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    sf6Var.U = tL_auth_sentCode;
                    qh6Var.q1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            sf6Var.c(true);
                            qh6Var.J1(0, true, null, true);
                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = ob6.M0(2131745798, null);
                            qh6Var.z1(M0, ob6.M0(2131751070, null) + "\n" + tL_error.text);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                qh6 qh6Var2 = sf6Var.b0;
                sf6Var.S = false;
                if (tL_error == null) {
                    qh6Var2.q1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                sf6Var.c(true);
                                qh6Var2.J1(0, true, null, true);
                                qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = ob6.M0(2131745798, null);
                                qh6Var2.z1(M02, ob6.M0(2131751070, null) + "\n" + tL_error.text);
                            }
                        } else {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, null));
                        }
                    }
                }
                qh6Var2.y1(false, true);
                return;
        }
    }

    public pf6(sf6 sf6Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = sf6Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
