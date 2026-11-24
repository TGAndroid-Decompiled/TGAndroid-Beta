package defpackage;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class se6 implements Runnable {
    public final byte a = 0;
    public final ze6 b;
    public final TLRPC.TL_error c;
    public final TLObject d;
    public final String e;

    public se6(ze6 ze6Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ze6Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        final ze6 ze6Var = this.b;
        switch (b) {
            case 0:
                xe6 xe6Var = ze6Var.a;
                mh6 mh6Var = ze6Var.a0;
                mh6Var.y1(false, true);
                if (tL_error == null) {
                    ze6Var.F = false;
                    mh6Var.K1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ze6Var.J);
                    bundle.putString("ephone", ze6Var.K);
                    bundle.putString("phoneFormated", ze6Var.M);
                    bundle.putString("phoneHash", ze6Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            mh6Var.s0 = tL_help_termsOfService;
                        }
                        ze6Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                Bundle bundle2 = bundle;
                                ze6 ze6Var2 = ze6Var;
                                switch (b2) {
                                    case 0:
                                        ze6Var2.a0.J1(5, true, bundle2, false);
                                        return;
                                    default:
                                        ze6Var2.a0.J1(6, true, bundle2, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ze6Var.n(new dt5(ze6Var, tLObject, bundle, (byte) 21));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((d) mh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new qe6(ze6Var, str, (byte) 1), 10);
                } else {
                    ze6Var.F = false;
                    mh6Var.K1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751141, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751137, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751134, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            mh6Var.J1(0, true, null, true);
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                        } else {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error.text);
                        }
                    } else {
                        te6 te6Var = ze6Var.T;
                        ye6 ye6Var = ze6Var.R;
                        try {
                            xe6Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i2 = 0;
                        while (true) {
                            gl2[] gl2VarArr = xe6Var.f;
                            if (i2 < gl2VarArr.length) {
                                gl2VarArr[i2].setText("");
                                xe6Var.f[i2].A(1.0f);
                                i2++;
                            } else {
                                if (ye6Var.getCurrentView() == ze6Var.e) {
                                    ye6Var.showNext();
                                    gm.T3(ze6Var.h, false, 1.0f, true, true);
                                }
                                xe6Var.f[0].requestFocus();
                                gm.A3(10.0f, xe6Var, new te6(ze6Var, (byte) 3));
                                ze6Var.removeCallbacks(te6Var);
                                ze6Var.postDelayed(te6Var, 5000L);
                                ze6Var.S = true;
                            }
                        }
                    }
                    if (xe6Var.f != null) {
                        int i3 = 0;
                        while (true) {
                            gl2[] gl2VarArr2 = xe6Var.f;
                            if (i3 < gl2VarArr2.length) {
                                gl2VarArr2[i3].setText("");
                                i3++;
                            } else {
                                gl2VarArr2[0].requestFocus();
                            }
                        }
                    }
                    xe6Var.e = false;
                }
                ze6Var.G = null;
                return;
            default:
                ze6Var.F = false;
                mh6 mh6Var2 = ze6Var.a0;
                mh6Var2.K1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.b0(password, true)) {
                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ze6Var.M);
                    bundle2.putString("phoneHash", ze6Var.N);
                    bundle2.putString("code", str);
                    ze6Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            Bundle bundle22 = bundle2;
                            ze6 ze6Var2 = ze6Var;
                            switch (b2) {
                                case 0:
                                    ze6Var2.a0.J1(5, true, bundle22, false);
                                    return;
                                default:
                                    ze6Var2.a0.J1(6, true, bundle22, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                mh6Var2.z1(jb6.M0(2131745804, null), tL_error.text);
                return;
        }
    }

    public se6(ze6 ze6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ze6Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
