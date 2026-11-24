package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mf6 implements Runnable {
    public final byte a = 0;
    public final pf6 b;
    public final TLRPC.TL_error c;
    public final Bundle d;
    public final TLObject e;

    public mf6(pf6 pf6Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = pf6Var;
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
        pf6 pf6Var = this.b;
        switch (b) {
            case 0:
                mh6 mh6Var = pf6Var.b0;
                pf6Var.N = false;
                pf6Var.w.invalidate();
                if (tLObject != null) {
                    pf6Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    pf6Var.U = tL_auth_sentCode;
                    mh6Var.q1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            pf6Var.d(true);
                            mh6Var.J1(0, true, null, true);
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = jb6.M0(2131745804, null);
                            mh6Var.z1(M0, jb6.M0(2131751042, null) + "\n" + tL_error.text);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                mh6 mh6Var2 = pf6Var.b0;
                pf6Var.S = false;
                if (tL_error == null) {
                    mh6Var2.q1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                pf6Var.d(true);
                                mh6Var2.J1(0, true, null, true);
                                mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = jb6.M0(2131745804, null);
                                mh6Var2.z1(M02, jb6.M0(2131751042, null) + "\n" + tL_error.text);
                            }
                        } else {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, null));
                        }
                    }
                }
                mh6Var2.y1(false, true);
                return;
        }
    }

    public mf6(pf6 pf6Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = pf6Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
