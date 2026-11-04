package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;
public final class to {
    public final String f25574a;
    public final String[] f25575b;
    public final String f25576c;
    public int d;

    public to(String str, String[] strArr, String str2) {
        this.f25574a = str;
        this.f25575b = strArr;
        this.f25576c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof to)) {
            return false;
        }
        return this.f25574a.equals(((to) obj).f25574a);
    }

    public final String toString() {
        int i3;
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.f25574a);
        String[] strArr = this.f25575b;
        if (strArr != null) {
            i3 = strArr.length;
        } else {
            i3 = 0;
        }
        serializedData.writeInt32(i3);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.f25576c);
        return Utilities.f(serializedData.toByteArray());
    }
}
