package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class ip {
    public final String f16319a;
    public final String[] f16320b;
    public final String f16321c;
    public int d;

    public ip(String str, String[] strArr, String str2) {
        this.f16319a = str;
        this.f16320b = strArr;
        this.f16321c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ip)) {
            return false;
        }
        return this.f16319a.equals(((ip) obj).f16319a);
    }

    public final String toString() {
        int i10;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f16319a);
        String[] strArr = this.f16320b;
        if (strArr != null) {
            i10 = strArr.length;
        } else {
            i10 = 0;
        }
        serializedData.writeInt32(i10);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.f16321c);
        return Utilities.f(serializedData.toByteArray());
    }
}
