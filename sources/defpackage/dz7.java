package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class dz7 implements RequestDelegate {
    public final wm4 a;
    public final String b;
    public final TL_account.saveSecureValue c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f;
    public final xw9 g;
    public final xw9 h;
    public final xw9 i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final Runnable m;
    public final ez7 n;
    public final TLRPC.TL_inputSecureValue o;
    public final ez7 p;

    public dz7(ez7 ez7Var, wm4 wm4Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, xw9 xw9Var, xw9 xw9Var2, xw9 xw9Var3, ArrayList arrayList2, String str2, String str3, Runnable runnable, ez7 ez7Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = ez7Var;
        this.a = wm4Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = xw9Var;
        this.h = xw9Var2;
        this.i = xw9Var3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = ez7Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        ez7 ez7Var = this.p;
        final boolean z = ez7Var.b;
        final int i = ez7Var.c;
        final wm4 wm4Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final xw9 xw9Var = this.g;
        final xw9 xw9Var2 = this.h;
        final xw9 xw9Var3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        gm.c3(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i2;
                xz7 xz7Var = dz7.this.p.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    wm4 wm4Var2 = wm4Var;
                    if (wm4Var2 != null) {
                        wm4Var2.b0(tL_error2.text, str4);
                    }
                    i2 = ((d) xz7Var).currentAccount;
                    ik.c0(i2, tL_error2, xz7Var, savesecurevalue, str4);
                    return;
                }
                boolean z2 = z;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z2) {
                    if (tL_secureRequiredType4 != null) {
                        xz7Var.K1(tL_secureRequiredType4);
                    } else {
                        xz7Var.K1(tL_secureRequiredType5);
                    }
                } else {
                    xz7Var.K1(tL_secureRequiredType5);
                    xz7Var.K1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    xz7Var.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    xz7Var.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        xw9 xw9Var4 = (xw9) arrayList3.get(i3);
                        if (xw9Var4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i4);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(xw9Var4.e, tL_secureFile.secret, 0)) {
                                        ez7.b(xw9Var4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i4++;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i3++;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                xw9 xw9Var5 = xw9Var;
                if (xw9Var5 != null && xw9Var5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(xw9Var5.e, tL_secureFile2.secret, 0)) {
                            ez7.b(xw9Var5, tL_secureFile2);
                        }
                    }
                }
                xw9 xw9Var6 = xw9Var2;
                if (xw9Var6 != null && xw9Var6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(xw9Var6.e, tL_secureFile3.secret, 0)) {
                            ez7.b(xw9Var6, tL_secureFile3);
                        }
                    }
                }
                xw9 xw9Var7 = xw9Var3;
                if (xw9Var7 != null && xw9Var7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(xw9Var7.e, tL_secureFile4.secret, 0)) {
                            ez7.b(xw9Var7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        xw9 xw9Var8 = (xw9) arrayList4.get(i5);
                        if (xw9Var8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size4) {
                                    TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i6);
                                    if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                        TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                        if (Utilities.d(xw9Var8.e, tL_secureFile5.secret, 0)) {
                                            ez7.b(xw9Var8, tL_secureFile5);
                                            break;
                                        }
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                }
                xz7Var.O1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z2, i);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        dz7 dz7Var;
        int i;
        int i2;
        xz7 xz7Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i2 = ((d) xz7Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(sendverifyemailcode, new fo0(this, this.b, this.e, this.n, this.a, (byte) 12));
                return;
            }
            dz7Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                gm.c3(new ud7((byte) 13, dz7Var.a, tL_error, str));
                return;
            }
        } else {
            dz7Var = this;
            TLRPC.TL_inputSecureValue tL_inputSecureValue = dz7Var.o;
            if (tL_inputSecureValue != null) {
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = xz7Var.c1;
                i = ((d) xz7Var).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(savesecurevalue, new jl7(dz7Var, (TLRPC.TL_secureValue) tLObject, (byte) 1));
                return;
            }
        }
        dz7Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
