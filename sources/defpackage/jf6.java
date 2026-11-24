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
public final class jf6 implements RequestDelegate {
    public final byte a;
    public final pf6 b;
    public final TLRPC.TL_auth_signIn c;

    public jf6(pf6 pf6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = pf6Var;
        this.c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final pf6 pf6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pf6 pf6Var2 = pf6Var;
                        switch (b) {
                            case 0:
                                byte b2 = pf6Var2.a;
                                l7 l7Var = pf6Var2.c;
                                mh6 mh6Var = pf6Var2.b0;
                                mh6Var.y1(false, true);
                                if (tL_error2 == null) {
                                    pf6Var2.S = false;
                                    mh6Var.K1(false, true);
                                    pf6Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", pf6Var2.H);
                                        bundle.putString("phoneHash", pf6Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        mh6Var.J1(5, true, bundle, false);
                                    } else {
                                        mh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mh6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jf6(pf6Var2, tL_auth_signIn2, (byte) 1), 10);
                                    pf6Var2.q();
                                } else {
                                    pf6Var2.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                pf6Var2.d(true);
                                                mh6Var.J1(0, true, null, true);
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                                            } else {
                                                String M0 = jb6.M0(2131745804, null);
                                                mh6Var.z1(M0, jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            pf6Var2.r(false);
                                            l7Var.post(new nf6(pf6Var2, (byte) 0));
                                            return;
                                        }
                                        l7Var.setText("");
                                        l7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    gm.T();
                                    gm.x3(false);
                                    return;
                                }
                                return;
                            default:
                                pf6Var2.S = false;
                                mh6 mh6Var2 = pf6Var2.b0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", pf6Var2.H);
                                    bundle2.putString("phoneHash", pf6Var2.I);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    mh6Var2.J1(6, true, bundle2, false);
                                    return;
                                }
                                mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final pf6 pf6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pf6 pf6Var22 = pf6Var2;
                        switch (b) {
                            case 0:
                                byte b2 = pf6Var22.a;
                                l7 l7Var = pf6Var22.c;
                                mh6 mh6Var = pf6Var22.b0;
                                mh6Var.y1(false, true);
                                if (tL_error2 == null) {
                                    pf6Var22.S = false;
                                    mh6Var.K1(false, true);
                                    pf6Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", pf6Var22.H);
                                        bundle.putString("phoneHash", pf6Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        mh6Var.J1(5, true, bundle, false);
                                    } else {
                                        mh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mh6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jf6(pf6Var22, tL_auth_signIn22, (byte) 1), 10);
                                    pf6Var22.q();
                                } else {
                                    pf6Var22.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                pf6Var22.d(true);
                                                mh6Var.J1(0, true, null, true);
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                                            } else {
                                                String M0 = jb6.M0(2131745804, null);
                                                mh6Var.z1(M0, jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            pf6Var22.r(false);
                                            l7Var.post(new nf6(pf6Var22, (byte) 0));
                                            return;
                                        }
                                        l7Var.setText("");
                                        l7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    gm.T();
                                    gm.x3(false);
                                    return;
                                }
                                return;
                            default:
                                pf6Var22.S = false;
                                mh6 mh6Var2 = pf6Var22.b0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", pf6Var22.H);
                                    bundle2.putString("phoneHash", pf6Var22.I);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    mh6Var2.J1(6, true, bundle2, false);
                                    return;
                                }
                                mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
