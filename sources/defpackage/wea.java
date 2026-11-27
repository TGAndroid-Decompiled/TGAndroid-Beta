package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;
public final class wea {
    public jx8 a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public wea(jx8 jx8Var) {
        this.a = jx8Var;
    }

    public static wea a(int i, SerializedData serializedData) {
        long j;
        long j2;
        m66 a = jx8.a();
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
            a.o(jx8.f(serializedData.readInt32(false)));
        } else {
            if (TextUtils.isEmpty(readString4)) {
                i2 = 1;
            }
            a.o(i2);
        }
        wea weaVar = new wea(a.c());
        weaVar.e = j2;
        weaVar.b = j;
        if (j > 0) {
            z = true;
        }
        weaVar.d = z;
        return weaVar;
    }
}
