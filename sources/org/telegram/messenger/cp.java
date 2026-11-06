package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class cp {
    public final String f21883a;
    public final String[] f21884b;
    public final String f21885c;
    public int d;

    public cp(String str, String[] strArr, String str2) {
        this.f21883a = str;
        this.f21884b = strArr;
        this.f21885c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cp)) {
            return false;
        }
        return this.f21883a.equals(((cp) obj).f21883a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f21883a);
        String[] strArr = this.f21884b;
        if (strArr != null) {
            i7 = strArr.length;
        } else {
            i7 = 0;
        }
        serializedData.writeInt32(i7);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.f21885c);
        return Utilities.f(serializedData.toByteArray());
    }
}
