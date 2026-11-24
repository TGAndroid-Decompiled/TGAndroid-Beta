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
public final class tc6 implements Runnable {
    public final byte a = 0;
    public final ad6 b;
    public final TLRPC.TL_error c;
    public final TLObject d;
    public final String e;

    public tc6(ad6 ad6Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ad6Var;
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
        final ad6 ad6Var = this.b;
        switch (b) {
            case 0:
                yc6 yc6Var = ad6Var.a;
                mf6 mf6Var = ad6Var.a0;
                mf6Var.x1(false, true);
                if (tL_error == null) {
                    ad6Var.F = false;
                    mf6Var.J1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ad6Var.J);
                    bundle.putString("ephone", ad6Var.K);
                    bundle.putString("phoneFormated", ad6Var.M);
                    bundle.putString("phoneHash", ad6Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            mf6Var.s0 = tL_help_termsOfService;
                        }
                        ad6Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                Bundle bundle2 = bundle;
                                ad6 ad6Var2 = ad6Var;
                                switch (b2) {
                                    case 0:
                                        ad6Var2.a0.I1(5, true, bundle2, false);
                                        return;
                                    default:
                                        ad6Var2.a0.I1(6, true, bundle2, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ad6Var.n(new sx5((byte) 19, ad6Var, bundle, tLObject));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((d) mf6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new rc6(ad6Var, str, (byte) 1), 10);
                } else {
                    ad6Var.F = false;
                    mf6Var.J1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751192, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751188, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751185, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            mf6Var.I1(0, true, null, true);
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                        } else {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error.text);
                        }
                    } else {
                        uc6 uc6Var = ad6Var.T;
                        zc6 zc6Var = ad6Var.R;
                        try {
                            yc6Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i2 = 0;
                        while (true) {
                            sj2[] sj2VarArr = yc6Var.f;
                            if (i2 < sj2VarArr.length) {
                                sj2VarArr[i2].setText("");
                                yc6Var.f[i2].A(1.0f);
                                i2++;
                            } else {
                                if (zc6Var.getCurrentView() == ad6Var.e) {
                                    zc6Var.showNext();
                                    gl.U3(ad6Var.h, false, 1.0f, true, true);
                                }
                                yc6Var.f[0].requestFocus();
                                gl.B3(10.0f, yc6Var, new uc6(ad6Var, (byte) 3));
                                ad6Var.removeCallbacks(uc6Var);
                                ad6Var.postDelayed(uc6Var, 5000L);
                                ad6Var.S = true;
                            }
                        }
                    }
                    if (yc6Var.f != null) {
                        int i3 = 0;
                        while (true) {
                            sj2[] sj2VarArr2 = yc6Var.f;
                            if (i3 < sj2VarArr2.length) {
                                sj2VarArr2[i3].setText("");
                                i3++;
                            } else {
                                sj2VarArr2[0].requestFocus();
                            }
                        }
                    }
                    yc6Var.e = false;
                }
                ad6Var.G = null;
                return;
            default:
                ad6Var.F = false;
                mf6 mf6Var2 = ad6Var.a0;
                mf6Var2.J1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.a0(password, true)) {
                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ad6Var.M);
                    bundle2.putString("phoneHash", ad6Var.N);
                    bundle2.putString("code", str);
                    ad6Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            Bundle bundle22 = bundle2;
                            ad6 ad6Var2 = ad6Var;
                            switch (b2) {
                                case 0:
                                    ad6Var2.a0.I1(5, true, bundle22, false);
                                    return;
                                default:
                                    ad6Var2.a0.I1(6, true, bundle22, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                mf6Var2.y1(k96.M0(2131745878, null), tL_error.text);
                return;
        }
    }

    public tc6(ad6 ad6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ad6Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
