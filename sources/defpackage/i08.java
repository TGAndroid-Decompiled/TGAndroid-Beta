package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class i08 implements RequestDelegate {
    public final um4 a;
    public final String b;
    public final TL_account.saveSecureValue c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f;
    public final oy9 g;
    public final oy9 h;
    public final oy9 i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final Runnable m;
    public final j08 n;
    public final TLRPC.TL_inputSecureValue o;
    public final j08 p;

    public i08(j08 j08Var, um4 um4Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, oy9 oy9Var, oy9 oy9Var2, oy9 oy9Var3, ArrayList arrayList2, String str2, String str3, Runnable runnable, j08 j08Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = j08Var;
        this.a = um4Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = oy9Var;
        this.h = oy9Var2;
        this.i = oy9Var3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = j08Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        j08 j08Var = this.p;
        final boolean z = j08Var.b;
        final int i = j08Var.c;
        final um4 um4Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final oy9 oy9Var = this.g;
        final oy9 oy9Var2 = this.h;
        final oy9 oy9Var3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        hl.c3(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i2;
                b18 b18Var = i08.this.p.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    um4 um4Var2 = um4Var;
                    if (um4Var2 != null) {
                        um4Var2.Z(tL_error2.text, str4);
                    }
                    i2 = ((e) b18Var).currentAccount;
                    jj.c0(i2, tL_error2, b18Var, savesecurevalue, str4);
                    return;
                }
                boolean z2 = z;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z2) {
                    if (tL_secureRequiredType4 != null) {
                        b18Var.K1(tL_secureRequiredType4);
                    } else {
                        b18Var.K1(tL_secureRequiredType5);
                    }
                } else {
                    b18Var.K1(tL_secureRequiredType5);
                    b18Var.K1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    b18Var.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    b18Var.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        oy9 oy9Var4 = (oy9) arrayList3.get(i3);
                        if (oy9Var4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i4);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(oy9Var4.e, tL_secureFile.secret, 0)) {
                                        j08.b(oy9Var4, tL_secureFile);
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
                oy9 oy9Var5 = oy9Var;
                if (oy9Var5 != null && oy9Var5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(oy9Var5.e, tL_secureFile2.secret, 0)) {
                            j08.b(oy9Var5, tL_secureFile2);
                        }
                    }
                }
                oy9 oy9Var6 = oy9Var2;
                if (oy9Var6 != null && oy9Var6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(oy9Var6.e, tL_secureFile3.secret, 0)) {
                            j08.b(oy9Var6, tL_secureFile3);
                        }
                    }
                }
                oy9 oy9Var7 = oy9Var3;
                if (oy9Var7 != null && oy9Var7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(oy9Var7.e, tL_secureFile4.secret, 0)) {
                            j08.b(oy9Var7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        oy9 oy9Var8 = (oy9) arrayList4.get(i5);
                        if (oy9Var8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size4) {
                                    TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i6);
                                    if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                        TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                        if (Utilities.d(oy9Var8.e, tL_secureFile5.secret, 0)) {
                                            j08.b(oy9Var8, tL_secureFile5);
                                            break;
                                        }
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                }
                b18Var.O1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z2, i);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i08 i08Var;
        int i;
        int i2;
        b18 b18Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i2 = ((e) b18Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(sendverifyemailcode, new in0(this, this.b, this.e, this.n, this.a, (byte) 12));
                return;
            }
            i08Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                hl.c3(new fd7(i08Var.a, tL_error, str, (byte) 18));
                return;
            }
        } else {
            i08Var = this;
            TLRPC.TL_inputSecureValue tL_inputSecureValue = i08Var.o;
            if (tL_inputSecureValue != null) {
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = b18Var.c1;
                i = ((e) b18Var).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(savesecurevalue, new ol7(i08Var, (TLRPC.TL_secureValue) tLObject, (byte) 2));
                return;
            }
        }
        i08Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
