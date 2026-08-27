package g9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class m implements c {

    public static final Charset f6822c = Charset.forName("UTF-8");

    public final File f6823a;

    public k f6824b;

    public m(File file) {
        this.f6823a = file;
    }

    @Override
    public final void a() {
        f9.h.c(this.f6824b, "There was a problem closing the Crashlytics log file.");
        this.f6824b = null;
    }

    @Override
    public final String c() {
        l lVar;
        byte[] bArr;
        File file = this.f6823a;
        if (file.exists()) {
            if (this.f6824b == null) {
                try {
                    this.f6824b = new k(file);
                } catch (IOException e9) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e9);
                }
            }
            k kVar = this.f6824b;
            if (kVar == null) {
                lVar = null;
            } else {
                int[] iArr = {0};
                int i10 = 16;
                if (kVar.f6817c != 0) {
                    h hVar = kVar.f6818e;
                    int i11 = hVar.f6810a;
                    int i12 = hVar.f6811b;
                    int i13 = kVar.d.f6810a;
                    i10 = i11 >= i13 ? 16 + (i11 - i13) + 4 + i12 : (((i11 + 4) + i12) + kVar.f6816b) - i13;
                }
                byte[] bArr2 = new byte[i10];
                try {
                    kVar.a(new e(bArr2, iArr));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                lVar = new l(bArr2, iArr[0]);
            }
        } else {
            lVar = null;
        }
        if (lVar == null) {
            bArr = null;
        } else {
            int i14 = lVar.f6820a;
            bArr = new byte[i14];
            System.arraycopy(lVar.f6821b, 0, bArr, 0, i14);
        }
        if (bArr != null) {
            return new String(bArr, f6822c);
        }
        return null;
    }
}
