package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class fe6 implements RequestDelegate {
    public final byte a;
    public final qe6 b;
    public final TLRPC.TL_auth_signIn c;

    public fe6(qe6 qe6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = qe6Var;
        this.c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final qe6 qe6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                gl.c3(new Runnable() {
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
                        final qe6 qe6Var2 = qe6Var;
                        switch (b) {
                            case 0:
                                byte b2 = qe6Var2.i0;
                                mf6 mf6Var = qe6Var2.v0;
                                qe6Var2.y(false);
                                if (tL_error2 == null) {
                                    qe6Var2.g0 = false;
                                    mf6Var.J1(false, true);
                                    qe6Var2.t();
                                    qe6Var2.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mf6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", qe6Var2.d);
                                        bundle.putString("phoneHash", qe6Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        qe6Var2.o(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b3 = r3;
                                                Bundle bundle2 = bundle;
                                                qe6 qe6Var3 = qe6Var2;
                                                switch (b3) {
                                                    case 0:
                                                        qe6Var3.v0.I1(5, true, bundle2, false);
                                                        return;
                                                    default:
                                                        qe6Var3.v0.I1(6, true, bundle2, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        qe6Var2.o(new kz5(qe6Var2, tLObject2, (byte) 23));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    qe6Var2.h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((d) mf6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new fe6(qe6Var2, tL_auth_signIn2, (byte) 1), 10);
                                        qe6Var2.t();
                                        qe6Var2.s();
                                    } else {
                                        qe6Var2.g0 = false;
                                        mf6Var.J1(false, true);
                                        if ((b2 == 3 && ((i3 = qe6Var2.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b2 == 2 && ((i2 = qe6Var2.j0) == 4 || i2 == 3)) || (b2 == 4 && ((i = qe6Var2.j0) == 2 || i == 17 || i == 16)))) {
                                            qe6Var2.r();
                                        }
                                        if (b2 == 15) {
                                            kk7.e().a(qe6Var2, 260);
                                        } else if (b2 == 2) {
                                            gl.y3(true);
                                            kk7.e().a(qe6Var2, 260);
                                        } else if (b2 == 3) {
                                            gl.x3(true);
                                            kk7.e().a(qe6Var2, 261);
                                            gl.c3(new ql3((byte) 27));
                                        }
                                        qe6Var2.f0 = true;
                                        if (b2 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    qe6Var2.d(true);
                                                    mf6Var.I1(0, true, null, true);
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                                                } else {
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                qe6Var2.w();
                                                return;
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                fj2 fj2Var = qe6Var2.f;
                                                sj2[] sj2VarArr = fj2Var.f;
                                                if (i5 < sj2VarArr.length) {
                                                    sj2VarArr[i5].setText("");
                                                    i5++;
                                                } else {
                                                    fj2Var.e = false;
                                                    sj2VarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (b2 == 3) {
                                    gl.T();
                                    gl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                qe6Var2.g0 = false;
                                mf6 mf6Var2 = qe6Var2.v0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", qe6Var2.d);
                                    bundle2.putString("phoneHash", qe6Var2.c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    qe6Var2.o(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b3 = r3;
                                            Bundle bundle22 = bundle2;
                                            qe6 qe6Var3 = qe6Var2;
                                            switch (b3) {
                                                case 0:
                                                    qe6Var3.v0.I1(5, true, bundle22, false);
                                                    return;
                                                default:
                                                    qe6Var3.v0.I1(6, true, bundle22, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final qe6 qe6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                gl.c3(new Runnable() {
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
                        final qe6 qe6Var22 = qe6Var2;
                        switch (b) {
                            case 0:
                                byte b2 = qe6Var22.i0;
                                mf6 mf6Var = qe6Var22.v0;
                                qe6Var22.y(false);
                                if (tL_error2 == null) {
                                    qe6Var22.g0 = false;
                                    mf6Var.J1(false, true);
                                    qe6Var22.t();
                                    qe6Var22.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mf6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", qe6Var22.d);
                                        bundle.putString("phoneHash", qe6Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        qe6Var22.o(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b3 = r3;
                                                Bundle bundle22 = bundle;
                                                qe6 qe6Var3 = qe6Var22;
                                                switch (b3) {
                                                    case 0:
                                                        qe6Var3.v0.I1(5, true, bundle22, false);
                                                        return;
                                                    default:
                                                        qe6Var3.v0.I1(6, true, bundle22, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        qe6Var22.o(new kz5(qe6Var22, tLObject2, (byte) 23));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    qe6Var22.h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((d) mf6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new fe6(qe6Var22, tL_auth_signIn22, (byte) 1), 10);
                                        qe6Var22.t();
                                        qe6Var22.s();
                                    } else {
                                        qe6Var22.g0 = false;
                                        mf6Var.J1(false, true);
                                        if ((b2 == 3 && ((i3 = qe6Var22.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b2 == 2 && ((i2 = qe6Var22.j0) == 4 || i2 == 3)) || (b2 == 4 && ((i = qe6Var22.j0) == 2 || i == 17 || i == 16)))) {
                                            qe6Var22.r();
                                        }
                                        if (b2 == 15) {
                                            kk7.e().a(qe6Var22, 260);
                                        } else if (b2 == 2) {
                                            gl.y3(true);
                                            kk7.e().a(qe6Var22, 260);
                                        } else if (b2 == 3) {
                                            gl.x3(true);
                                            kk7.e().a(qe6Var22, 261);
                                            gl.c3(new ql3((byte) 27));
                                        }
                                        qe6Var22.f0 = true;
                                        if (b2 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    qe6Var22.d(true);
                                                    mf6Var.I1(0, true, null, true);
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                                                } else {
                                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                qe6Var22.w();
                                                return;
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                fj2 fj2Var = qe6Var22.f;
                                                sj2[] sj2VarArr = fj2Var.f;
                                                if (i5 < sj2VarArr.length) {
                                                    sj2VarArr[i5].setText("");
                                                    i5++;
                                                } else {
                                                    fj2Var.e = false;
                                                    sj2VarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (b2 == 3) {
                                    gl.T();
                                    gl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                qe6Var22.g0 = false;
                                mf6 mf6Var2 = qe6Var22.v0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", qe6Var22.d);
                                    bundle2.putString("phoneHash", qe6Var22.c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    qe6Var22.o(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b3 = r3;
                                            Bundle bundle22 = bundle2;
                                            qe6 qe6Var3 = qe6Var22;
                                            switch (b3) {
                                                case 0:
                                                    qe6Var3.v0.I1(5, true, bundle22, false);
                                                    return;
                                                default:
                                                    qe6Var3.v0.I1(6, true, bundle22, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
