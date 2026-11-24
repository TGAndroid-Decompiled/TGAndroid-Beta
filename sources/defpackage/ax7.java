package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class ax7 implements RequestDelegate {
    public final wk4 a;
    public final String b;
    public final TL_account.saveSecureValue c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f;
    public final uu9 g;
    public final uu9 h;
    public final uu9 i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final Runnable m;
    public final bx7 n;
    public final TLRPC.TL_inputSecureValue o;
    public final bx7 p;

    public ax7(bx7 bx7Var, wk4 wk4Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, uu9 uu9Var, uu9 uu9Var2, uu9 uu9Var3, ArrayList arrayList2, String str2, String str3, Runnable runnable, bx7 bx7Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = bx7Var;
        this.a = wk4Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = uu9Var;
        this.h = uu9Var2;
        this.i = uu9Var3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = bx7Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        bx7 bx7Var = this.p;
        final boolean z = bx7Var.b;
        final int i = bx7Var.c;
        final wk4 wk4Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final uu9 uu9Var = this.g;
        final uu9 uu9Var2 = this.h;
        final uu9 uu9Var3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        gl.c3(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i2;
                vx7 vx7Var = ax7.this.p.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    wk4 wk4Var2 = wk4Var;
                    if (wk4Var2 != null) {
                        wk4Var2.a0(tL_error2.text, str4);
                    }
                    i2 = ((d) vx7Var).currentAccount;
                    ij.c0(i2, tL_error2, vx7Var, savesecurevalue, str4);
                    return;
                }
                boolean z2 = z;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z2) {
                    if (tL_secureRequiredType4 != null) {
                        vx7Var.J1(tL_secureRequiredType4);
                    } else {
                        vx7Var.J1(tL_secureRequiredType5);
                    }
                } else {
                    vx7Var.J1(tL_secureRequiredType5);
                    vx7Var.J1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    vx7Var.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    vx7Var.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        uu9 uu9Var4 = (uu9) arrayList3.get(i3);
                        if (uu9Var4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i4);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(uu9Var4.e, tL_secureFile.secret, 0)) {
                                        bx7.b(uu9Var4, tL_secureFile);
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
                uu9 uu9Var5 = uu9Var;
                if (uu9Var5 != null && uu9Var5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(uu9Var5.e, tL_secureFile2.secret, 0)) {
                            bx7.b(uu9Var5, tL_secureFile2);
                        }
                    }
                }
                uu9 uu9Var6 = uu9Var2;
                if (uu9Var6 != null && uu9Var6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(uu9Var6.e, tL_secureFile3.secret, 0)) {
                            bx7.b(uu9Var6, tL_secureFile3);
                        }
                    }
                }
                uu9 uu9Var7 = uu9Var3;
                if (uu9Var7 != null && uu9Var7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(uu9Var7.e, tL_secureFile4.secret, 0)) {
                            bx7.b(uu9Var7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        uu9 uu9Var8 = (uu9) arrayList4.get(i5);
                        if (uu9Var8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size4) {
                                    TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i6);
                                    if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                        TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                        if (Utilities.d(uu9Var8.e, tL_secureFile5.secret, 0)) {
                                            bx7.b(uu9Var8, tL_secureFile5);
                                            break;
                                        }
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                }
                vx7Var.N1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z2, i);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ax7 ax7Var;
        int i;
        int i2;
        vx7 vx7Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i2 = ((d) vx7Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(sendverifyemailcode, new fn0(this, this.b, this.e, this.n, this.a, (byte) 12));
                return;
            }
            ax7Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                gl.c3(new pc7(ax7Var.a, tL_error, str, (byte) 10));
                return;
            }
        } else {
            ax7Var = this;
            TLRPC.TL_inputSecureValue tL_inputSecureValue = ax7Var.o;
            if (tL_inputSecureValue != null) {
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = vx7Var.c1;
                i = ((d) vx7Var).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(savesecurevalue, new hj7(ax7Var, (TLRPC.TL_secureValue) tLObject, (byte) 1));
                return;
            }
        }
        ax7Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
