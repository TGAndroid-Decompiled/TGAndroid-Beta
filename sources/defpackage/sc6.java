package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class sc6 implements RequestDelegate {
    public final byte a;
    public final ad6 b;
    public final Bundle c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public sc6(ad6 ad6Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, byte b) {
        this.a = b;
        this.b = ad6Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ad6 ad6Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i;
                        String str2;
                        int i2;
                        byte b = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        ad6 ad6Var2 = ad6Var;
                        switch (b) {
                            case 0:
                                mf6 mf6Var = ad6Var2.a0;
                                if (mf6Var.getParentActivity() != null) {
                                    ad6Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        mf6Var.p1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ad6Var2.getContext());
                                            String M0 = k96.M0(2131748537, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            p38 f = p38.f();
                                            hdVar.U = gl.T2(k96.a0(null, null, 2131748538, k96.a(f.e("+" + ad6Var2.M))));
                                            b00.t(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((d) mf6Var).currentAccount;
                                            ij.c0(i, tL_error2, mf6Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            mf6Var.I1(0, true, null, true);
                                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mf6 mf6Var2 = ad6Var2.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ad6Var2.E.getString("emailPattern");
                                        ad6Var2.y = true;
                                    }
                                    mf6Var2.p1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((d) mf6Var2).currentAccount;
                                        ij.c0(i2, tL_error2, mf6Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    mf6Var2.I1(0, true, null, true);
                                    mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ad6 ad6Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i;
                        String str2;
                        int i2;
                        byte b = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        ad6 ad6Var22 = ad6Var2;
                        switch (b) {
                            case 0:
                                mf6 mf6Var = ad6Var22.a0;
                                if (mf6Var.getParentActivity() != null) {
                                    ad6Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        mf6Var.p1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ad6Var22.getContext());
                                            String M0 = k96.M0(2131748537, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            p38 f = p38.f();
                                            hdVar.U = gl.T2(k96.a0(null, null, 2131748538, k96.a(f.e("+" + ad6Var22.M))));
                                            b00.t(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((d) mf6Var).currentAccount;
                                            ij.c0(i, tL_error2, mf6Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            mf6Var.I1(0, true, null, true);
                                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mf6 mf6Var2 = ad6Var22.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ad6Var22.E.getString("emailPattern");
                                        ad6Var22.y = true;
                                    }
                                    mf6Var2.p1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((d) mf6Var2).currentAccount;
                                        ij.c0(i2, tL_error2, mf6Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    mf6Var2.I1(0, true, null, true);
                                    mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
