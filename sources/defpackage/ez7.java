package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class ez7 {
    public final TLRPC.SecureValueType a;
    public final boolean b;
    public final int c;
    public final xz7 d;

    public ez7(xz7 xz7Var, TLRPC.SecureValueType secureValueType, boolean z, int i) {
        this.d = xz7Var;
        this.a = secureValueType;
        this.b = z;
        this.c = i;
    }

    public static TLRPC.InputSecureFile a(xw9 xw9Var) {
        if (xw9Var.d != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = xw9Var.d;
            tL_inputSecureFileUploaded.id = tL_inputFile.id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = xw9Var.f;
            tL_inputSecureFileUploaded.secret = xw9Var.e;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = xw9Var.b;
        tL_inputSecureFile.id = tL_secureFile.id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public static void b(xw9 xw9Var, TLRPC.TL_secureFile tL_secureFile) {
        bc4.G(z8c.t0);
        File I = bc4.I(xw9Var);
        bc4.G(z8c.t0);
        File I2 = bc4.I(tL_secureFile);
        I.renameTo(I2);
        fn5.z().O(xw9Var.b.dc_id + "_" + xw9Var.b.id, tL_secureFile.dc_id + "_" + tL_secureFile.id, null);
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, xw9 xw9Var, ArrayList arrayList2, xw9 xw9Var2, xw9 xw9Var3, Runnable runnable, wm4 wm4Var) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i;
        boolean isEmpty = TextUtils.isEmpty(str2);
        xz7 xz7Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            sm2 d1 = xz7Var.d1(gm.g1(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) d1.d;
            tL_secureData.data_hash = (byte[]) d1.e;
            tL_secureData.secret = (byte[]) d1.b;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.a;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                TLRPC.TL_securePlainEmail tL_securePlainEmail = new TLRPC.TL_securePlainEmail();
                tL_securePlainEmail.email = str;
                tL_securePlainPhone = tL_securePlainEmail;
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                TLRPC.TL_securePlainPhone tL_securePlainPhone2 = new TLRPC.TL_securePlainPhone();
                tL_securePlainPhone2.phone = str;
                tL_securePlainPhone = tL_securePlainPhone2;
            } else {
                return;
            }
            TLRPC.TL_inputSecureValue tL_inputSecureValue3 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue3.type = tL_secureRequiredType.type;
            tL_inputSecureValue3.flags |= 32;
            tL_inputSecureValue3.plain_data = tL_securePlainPhone;
            tL_inputSecureValue = tL_inputSecureValue3;
        } else {
            tL_inputSecureValue = null;
        }
        boolean z = this.b;
        if (!z && tL_inputSecureValue == null) {
            if (wm4Var != null) {
                wm4Var.b0(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                sm2 d12 = xz7Var.d1(gm.g1(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) d12.d;
                tL_secureData2.data_hash = (byte[]) d12.e;
                tL_secureData2.secret = (byte[]) d12.b;
            }
            if (xw9Var2 != null) {
                tL_inputSecureValue4.front_side = a(xw9Var2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (xw9Var3 != null) {
                tL_inputSecureValue4.reverse_side = a(xw9Var3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (xw9Var != null) {
                tL_inputSecureValue4.selfie = a(xw9Var);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tL_inputSecureValue4.translation.add(a((xw9) arrayList2.get(i2)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    tL_inputSecureValue4.files.add(a((xw9) arrayList.get(i3)));
                }
            }
            if (z) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = xz7Var.c1;
                i = ((d) xz7Var).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(savesecurevalue, new dz7(this, wm4Var, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, xw9Var, xw9Var2, xw9Var3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = xz7Var.c1;
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(savesecurevalue2, new dz7(this, wm4Var, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, xw9Var, xw9Var2, xw9Var3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
