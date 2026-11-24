package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class fda {
    public bw8 a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public fda(bw8 bw8Var) {
        this.a = bw8Var;
    }

    public static fda a(int i, SerializedData serializedData) {
        long j;
        long j2;
        i66 a = bw8.a();
        boolean z = false;
        String readString = serializedData.readString(false);
        String str = "";
        if (readString == null) {
            readString = "";
        }
        a.c = readString;
        a.b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a.e = readString3;
        String readString4 = serializedData.readString(false);
        if (readString4 != null) {
            str = readString4;
        }
        a.f = str;
        int i2 = 2;
        if (i >= 2) {
            j = serializedData.readInt64(false);
            j2 = serializedData.readInt64(false);
        } else {
            j = 0;
            j2 = 0;
        }
        if (i >= 3) {
            a.o(bw8.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i2 = 1;
            }
            a.o(i2);
        }
        fda fdaVar = new fda(a.c());
        fdaVar.e = j2;
        fdaVar.b = j;
        if (j > 0) {
            z = true;
        }
        fdaVar.d = z;
        return fdaVar;
    }
}
