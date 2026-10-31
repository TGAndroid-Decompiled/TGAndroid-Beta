package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class hp {
    public final String f15926a;
    public final String[] f15927b;
    public final String f15928c;
    public int d;

    public hp(String str, String[] strArr, String str2) {
        this.f15926a = str;
        this.f15927b = strArr;
        this.f15928c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hp)) {
            return false;
        }
        return this.f15926a.equals(((hp) obj).f15926a);
    }

    public final String toString() {
        int i10;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f15926a);
        String[] strArr = this.f15927b;
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
        serializedData.writeString(this.f15928c);
        return Utilities.f(serializedData.toByteArray());
    }
}
