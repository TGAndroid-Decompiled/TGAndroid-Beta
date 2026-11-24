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
public final class kd6 implements RequestDelegate {
    public final byte a;
    public final qd6 b;
    public final TLRPC.TL_auth_signIn c;

    public kd6(qd6 qd6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = qd6Var;
        this.c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final qd6 qd6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qd6 qd6Var2 = qd6Var;
                        switch (b) {
                            case 0:
                                byte b2 = qd6Var2.a;
                                l7 l7Var = qd6Var2.c;
                                mf6 mf6Var = qd6Var2.b0;
                                mf6Var.x1(false, true);
                                if (tL_error2 == null) {
                                    qd6Var2.S = false;
                                    mf6Var.J1(false, true);
                                    qd6Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mf6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", qd6Var2.H);
                                        bundle.putString("phoneHash", qd6Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        mf6Var.I1(5, true, bundle, false);
                                    } else {
                                        mf6Var.B1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mf6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new kd6(qd6Var2, tL_auth_signIn2, (byte) 1), 10);
                                    qd6Var2.q();
                                } else {
                                    qd6Var2.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                qd6Var2.d(true);
                                                mf6Var.I1(0, true, null, true);
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                                            } else {
                                                String M0 = k96.M0(2131745878, null);
                                                mf6Var.y1(M0, k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            qd6Var2.r(false);
                                            l7Var.post(new od6(qd6Var2, (byte) 0));
                                            return;
                                        }
                                        l7Var.setText("");
                                        l7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    gl.T();
                                    gl.y3(false);
                                    return;
                                }
                                return;
                            default:
                                qd6Var2.S = false;
                                mf6 mf6Var2 = qd6Var2.b0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", qd6Var2.H);
                                    bundle2.putString("phoneHash", qd6Var2.I);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    mf6Var2.I1(6, true, bundle2, false);
                                    return;
                                }
                                mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final qd6 qd6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qd6 qd6Var22 = qd6Var2;
                        switch (b) {
                            case 0:
                                byte b2 = qd6Var22.a;
                                l7 l7Var = qd6Var22.c;
                                mf6 mf6Var = qd6Var22.b0;
                                mf6Var.x1(false, true);
                                if (tL_error2 == null) {
                                    qd6Var22.S = false;
                                    mf6Var.J1(false, true);
                                    qd6Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mf6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", qd6Var22.H);
                                        bundle.putString("phoneHash", qd6Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        mf6Var.I1(5, true, bundle, false);
                                    } else {
                                        mf6Var.B1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mf6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new kd6(qd6Var22, tL_auth_signIn22, (byte) 1), 10);
                                    qd6Var22.q();
                                } else {
                                    qd6Var22.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                qd6Var22.d(true);
                                                mf6Var.I1(0, true, null, true);
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                                            } else {
                                                String M0 = k96.M0(2131745878, null);
                                                mf6Var.y1(M0, k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            qd6Var22.r(false);
                                            l7Var.post(new od6(qd6Var22, (byte) 0));
                                            return;
                                        }
                                        l7Var.setText("");
                                        l7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    gl.T();
                                    gl.y3(false);
                                    return;
                                }
                                return;
                            default:
                                qd6Var22.S = false;
                                mf6 mf6Var2 = qd6Var22.b0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", qd6Var22.H);
                                    bundle2.putString("phoneHash", qd6Var22.I);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    mf6Var2.I1(6, true, bundle2, false);
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
