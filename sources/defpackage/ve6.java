package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class ve6 implements RequestDelegate {
    public final byte a;
    public final df6 b;
    public final Bundle c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public ve6(df6 df6Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, byte b) {
        this.a = b;
        this.b = df6Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final df6 df6Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                hl.c3(new Runnable() {
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
                        df6 df6Var2 = df6Var;
                        switch (b) {
                            case 0:
                                qh6 qh6Var = df6Var2.a0;
                                if (qh6Var.getParentActivity() != null) {
                                    df6Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        qh6Var.q1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df6Var2.getContext());
                                            String M0 = ob6.M0(2131748483, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            f78 f = f78.f();
                                            idVar.U = hl.S2(ob6.a0(null, null, 2131748484, ob6.a(f.e("+" + df6Var2.M))));
                                            c00.u(null, 2131747558, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((e) qh6Var).currentAccount;
                                            jj.c0(i, tL_error2, qh6Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            qh6Var.J1(0, true, null, true);
                                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                qh6 qh6Var2 = df6Var2.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = df6Var2.E.getString("emailPattern");
                                        df6Var2.y = true;
                                    }
                                    qh6Var2.q1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((e) qh6Var2).currentAccount;
                                        jj.c0(i2, tL_error2, qh6Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    qh6Var2.J1(0, true, null, true);
                                    qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final df6 df6Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                hl.c3(new Runnable() {
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
                        df6 df6Var22 = df6Var2;
                        switch (b) {
                            case 0:
                                qh6 qh6Var = df6Var22.a0;
                                if (qh6Var.getParentActivity() != null) {
                                    df6Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        qh6Var.q1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df6Var22.getContext());
                                            String M0 = ob6.M0(2131748483, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            f78 f = f78.f();
                                            idVar.U = hl.S2(ob6.a0(null, null, 2131748484, ob6.a(f.e("+" + df6Var22.M))));
                                            c00.u(null, 2131747558, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((e) qh6Var).currentAccount;
                                            jj.c0(i, tL_error2, qh6Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            qh6Var.J1(0, true, null, true);
                                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                qh6 qh6Var2 = df6Var22.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = df6Var22.E.getString("emailPattern");
                                        df6Var22.y = true;
                                    }
                                    qh6Var2.q1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((e) qh6Var2).currentAccount;
                                        jj.c0(i2, tL_error2, qh6Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    qh6Var2.J1(0, true, null, true);
                                    qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
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
