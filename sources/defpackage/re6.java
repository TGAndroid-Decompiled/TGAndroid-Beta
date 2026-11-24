package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class re6 implements RequestDelegate {
    public final byte a;
    public final ze6 b;
    public final Bundle c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public re6(ze6 ze6Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, byte b) {
        this.a = b;
        this.b = ze6Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ze6 ze6Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                gm.c3(new Runnable() {
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
                        ze6 ze6Var2 = ze6Var;
                        switch (b) {
                            case 0:
                                mh6 mh6Var = ze6Var2.a0;
                                if (mh6Var.getParentActivity() != null) {
                                    ze6Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        mh6Var.q1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ze6Var2.getContext());
                                            String M0 = jb6.M0(2131748486, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            r58 f = r58.f();
                                            heVar.U = gm.S2(jb6.a0(null, null, 2131748487, jb6.a(f.e("+" + ze6Var2.M))));
                                            b10.t(null, 2131747564, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((d) mh6Var).currentAccount;
                                            ik.c0(i, tL_error2, mh6Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            mh6Var.J1(0, true, null, true);
                                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mh6 mh6Var2 = ze6Var2.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ze6Var2.E.getString("emailPattern");
                                        ze6Var2.y = true;
                                    }
                                    mh6Var2.q1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((d) mh6Var2).currentAccount;
                                        ik.c0(i2, tL_error2, mh6Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    mh6Var2.J1(0, true, null, true);
                                    mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ze6 ze6Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                gm.c3(new Runnable() {
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
                        ze6 ze6Var22 = ze6Var2;
                        switch (b) {
                            case 0:
                                mh6 mh6Var = ze6Var22.a0;
                                if (mh6Var.getParentActivity() != null) {
                                    ze6Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        mh6Var.q1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ze6Var22.getContext());
                                            String M0 = jb6.M0(2131748486, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            r58 f = r58.f();
                                            heVar.U = gm.S2(jb6.a0(null, null, 2131748487, jb6.a(f.e("+" + ze6Var22.M))));
                                            b10.t(null, 2131747564, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i = ((d) mh6Var).currentAccount;
                                            ik.c0(i, tL_error2, mh6Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            mh6Var.J1(0, true, null, true);
                                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mh6 mh6Var2 = ze6Var22.a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ze6Var22.E.getString("emailPattern");
                                        ze6Var22.y = true;
                                    }
                                    mh6Var2.q1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i2 = ((d) mh6Var2).currentAccount;
                                        ik.c0(i2, tL_error2, mh6Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    mh6Var2.J1(0, true, null, true);
                                    mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
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
