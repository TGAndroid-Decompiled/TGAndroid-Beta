package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class hg6 implements RequestDelegate {
    public final byte a;
    public final tg6 b;
    public final TLRPC.TL_auth_signIn c;

    public hg6(tg6 tg6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final tg6 tg6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final tg6 tg6Var2 = tg6Var;
                        switch (b) {
                            case 0:
                                byte b2 = tg6Var2.i0;
                                qh6 qh6Var = tg6Var2.v0;
                                tg6Var2.y(false);
                                if (tL_error2 == null) {
                                    tg6Var2.g0 = false;
                                    qh6Var.K1(false, true);
                                    tg6Var2.t();
                                    tg6Var2.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", tg6Var2.d);
                                        bundle.putString("phoneHash", tg6Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        tg6Var2.o(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b3 = r3;
                                                Bundle bundle2 = bundle;
                                                tg6 tg6Var3 = tg6Var2;
                                                switch (b3) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle2, false);
                                                        return;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle2, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        tg6Var2.o(new z56(tg6Var2, tLObject2, (byte) 20));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    tg6Var2.h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new hg6(tg6Var2, tL_auth_signIn2, (byte) 1), 10);
                                        tg6Var2.t();
                                        tg6Var2.s();
                                    } else {
                                        tg6Var2.g0 = false;
                                        qh6Var.K1(false, true);
                                        if ((b2 == 3 && ((i3 = tg6Var2.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b2 == 2 && ((i2 = tg6Var2.j0) == 4 || i2 == 3)) || (b2 == 4 && ((i = tg6Var2.j0) == 2 || i == 17 || i == 16)))) {
                                            tg6Var2.r();
                                        }
                                        if (b2 == 15) {
                                            jn7.e().a(tg6Var2, 261);
                                        } else if (b2 == 2) {
                                            hl.y3(true);
                                            jn7.e().a(tg6Var2, 261);
                                        } else if (b2 == 3) {
                                            hl.x3(true);
                                            jn7.e().a(tg6Var2, 262);
                                            hl.c3(new jm3((byte) 29));
                                        }
                                        tg6Var2.f0 = true;
                                        if (b2 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    tg6Var2.c(true);
                                                    qh6Var.J1(0, true, null, true);
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                                } else {
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                tg6Var2.w();
                                                return;
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                bk2 bk2Var = tg6Var2.f;
                                                ok2[] ok2VarArr = bk2Var.f;
                                                if (i5 < ok2VarArr.length) {
                                                    ok2VarArr[i5].setText("");
                                                    i5++;
                                                } else {
                                                    bk2Var.e = false;
                                                    ok2VarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (b2 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                tg6Var2.g0 = false;
                                qh6 qh6Var2 = tg6Var2.v0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", tg6Var2.d);
                                    bundle2.putString("phoneHash", tg6Var2.c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    tg6Var2.o(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b3 = r3;
                                            Bundle bundle22 = bundle2;
                                            tg6 tg6Var3 = tg6Var2;
                                            switch (b3) {
                                                case 0:
                                                    tg6Var3.v0.J1(5, true, bundle22, false);
                                                    return;
                                                default:
                                                    tg6Var3.v0.J1(6, true, bundle22, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final tg6 tg6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final tg6 tg6Var22 = tg6Var2;
                        switch (b) {
                            case 0:
                                byte b2 = tg6Var22.i0;
                                qh6 qh6Var = tg6Var22.v0;
                                tg6Var22.y(false);
                                if (tL_error2 == null) {
                                    tg6Var22.g0 = false;
                                    qh6Var.K1(false, true);
                                    tg6Var22.t();
                                    tg6Var22.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", tg6Var22.d);
                                        bundle.putString("phoneHash", tg6Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        tg6Var22.o(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b3 = r3;
                                                Bundle bundle22 = bundle;
                                                tg6 tg6Var3 = tg6Var22;
                                                switch (b3) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle22, false);
                                                        return;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle22, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        tg6Var22.o(new z56(tg6Var22, tLObject2, (byte) 20));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    tg6Var22.h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new hg6(tg6Var22, tL_auth_signIn22, (byte) 1), 10);
                                        tg6Var22.t();
                                        tg6Var22.s();
                                    } else {
                                        tg6Var22.g0 = false;
                                        qh6Var.K1(false, true);
                                        if ((b2 == 3 && ((i3 = tg6Var22.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b2 == 2 && ((i2 = tg6Var22.j0) == 4 || i2 == 3)) || (b2 == 4 && ((i = tg6Var22.j0) == 2 || i == 17 || i == 16)))) {
                                            tg6Var22.r();
                                        }
                                        if (b2 == 15) {
                                            jn7.e().a(tg6Var22, 261);
                                        } else if (b2 == 2) {
                                            hl.y3(true);
                                            jn7.e().a(tg6Var22, 261);
                                        } else if (b2 == 3) {
                                            hl.x3(true);
                                            jn7.e().a(tg6Var22, 262);
                                            hl.c3(new jm3((byte) 29));
                                        }
                                        tg6Var22.f0 = true;
                                        if (b2 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    tg6Var22.c(true);
                                                    qh6Var.J1(0, true, null, true);
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                                } else {
                                                    qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                tg6Var22.w();
                                                return;
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                bk2 bk2Var = tg6Var22.f;
                                                ok2[] ok2VarArr = bk2Var.f;
                                                if (i5 < ok2VarArr.length) {
                                                    ok2VarArr[i5].setText("");
                                                    i5++;
                                                } else {
                                                    bk2Var.e = false;
                                                    ok2VarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (b2 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                tg6Var22.g0 = false;
                                qh6 qh6Var2 = tg6Var22.v0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", tg6Var22.d);
                                    bundle2.putString("phoneHash", tg6Var22.c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    tg6Var22.o(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b3 = r3;
                                            Bundle bundle22 = bundle2;
                                            tg6 tg6Var3 = tg6Var22;
                                            switch (b3) {
                                                case 0:
                                                    tg6Var3.v0.J1(5, true, bundle22, false);
                                                    return;
                                                default:
                                                    tg6Var3.v0.J1(6, true, bundle22, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
