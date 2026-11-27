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
public final class mf6 implements RequestDelegate {
    public final byte a;
    public final sf6 b;
    public final TLRPC.TL_auth_signIn c;

    public mf6(sf6 sf6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = sf6Var;
        this.c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final sf6 sf6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        sf6 sf6Var2 = sf6Var;
                        switch (b) {
                            case 0:
                                byte b2 = sf6Var2.a;
                                m7 m7Var = sf6Var2.c;
                                qh6 qh6Var = sf6Var2.b0;
                                qh6Var.y1(false, true);
                                if (tL_error2 == null) {
                                    sf6Var2.S = false;
                                    qh6Var.K1(false, true);
                                    sf6Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf6Var2.H);
                                        bundle.putString("phoneHash", sf6Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        qh6Var.J1(5, true, bundle, false);
                                    } else {
                                        qh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) qh6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new mf6(sf6Var2, tL_auth_signIn2, (byte) 1), 10);
                                    sf6Var2.q();
                                } else {
                                    sf6Var2.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                sf6Var2.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                String M0 = ob6.M0(2131745798, null);
                                                qh6Var.z1(M0, ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            sf6Var2.r(false);
                                            m7Var.post(new qf6(sf6Var2, (byte) 0));
                                            return;
                                        }
                                        m7Var.setText("");
                                        m7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                sf6Var2.S = false;
                                qh6 qh6Var2 = sf6Var2.b0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", sf6Var2.H);
                                    bundle2.putString("phoneHash", sf6Var2.I);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    qh6Var2.J1(6, true, bundle2, false);
                                    return;
                                }
                                qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final sf6 sf6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        byte b = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        sf6 sf6Var22 = sf6Var2;
                        switch (b) {
                            case 0:
                                byte b2 = sf6Var22.a;
                                m7 m7Var = sf6Var22.c;
                                qh6 qh6Var = sf6Var22.b0;
                                qh6Var.y1(false, true);
                                if (tL_error2 == null) {
                                    sf6Var22.S = false;
                                    qh6Var.K1(false, true);
                                    sf6Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf6Var22.H);
                                        bundle.putString("phoneHash", sf6Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        qh6Var.J1(5, true, bundle, false);
                                    } else {
                                        qh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) qh6Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new mf6(sf6Var22, tL_auth_signIn22, (byte) 1), 10);
                                    sf6Var22.q();
                                } else {
                                    sf6Var22.S = false;
                                    if (b2 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                sf6Var22.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                String M0 = ob6.M0(2131745798, null);
                                                qh6Var.z1(M0, ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            sf6Var22.r(false);
                                            m7Var.post(new qf6(sf6Var22, (byte) 0));
                                            return;
                                        }
                                        m7Var.setText("");
                                        m7Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (b2 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    return;
                                }
                                return;
                            default:
                                sf6Var22.S = false;
                                qh6 qh6Var2 = sf6Var22.b0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", sf6Var22.H);
                                    bundle2.putString("phoneHash", sf6Var22.I);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    qh6Var2.J1(6, true, bundle2, false);
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
