package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class cp {
    public final String f21916a;
    public final String[] f21917b;
    public final String f21918c;
    public int d;

    public cp(String str, String[] strArr, String str2) {
        this.f21916a = str;
        this.f21917b = strArr;
        this.f21918c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cp)) {
            return false;
        }
        return this.f21916a.equals(((cp) obj).f21916a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f21916a);
        String[] strArr = this.f21917b;
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
        serializedData.writeString(this.f21918c);
        return Utilities.f(serializedData.toByteArray());
    }
}
