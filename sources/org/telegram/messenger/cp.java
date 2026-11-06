package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class cp {
    public final String f21877a;
    public final String[] f21878b;
    public final String f21879c;
    public int d;

    public cp(String str, String[] strArr, String str2) {
        this.f21877a = str;
        this.f21878b = strArr;
        this.f21879c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cp)) {
            return false;
        }
        return this.f21877a.equals(((cp) obj).f21877a);
    }

    public final String toString() {
        int i7;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f21877a);
        String[] strArr = this.f21878b;
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
        serializedData.writeString(this.f21879c);
        return Utilities.f(serializedData.toByteArray());
    }
}
