package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class hc7 {
    public final String a;
    public final String[] b;
    public final String c;
    public int d;

    public hc7(String str, String[] strArr, String str2) {
        this.a = str;
        this.b = strArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc7)) {
            return false;
        }
        return this.a.equals(((hc7) obj).a);
    }

    public final String toString() {
        int i;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.a);
        String[] strArr = this.b;
        if (strArr != null) {
            i = strArr.length;
        } else {
            i = 0;
        }
        serializedData.writeInt32(i);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.c);
        return Utilities.f(serializedData.toByteArray());
    }
}
