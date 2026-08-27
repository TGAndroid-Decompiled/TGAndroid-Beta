package lc;

import java.util.Map;

public final class a implements Map.Entry, Cloneable {

    public String f15531a;

    public String f15532b;

    public b f15533c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f15531a;
            String str2 = this.f15531a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f15532b;
            String str4 = aVar.f15532b;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15531a;
    }

    @Override
    public final Object getValue() {
        return this.f15532b;
    }

    @Override
    public final int hashCode() {
        String str = this.f15531a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15532b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        b bVar = this.f15533c;
        String str3 = this.f15531a;
        int i10 = bVar.i(str3);
        String str4 = "";
        if (i10 != -1 && (str = bVar.f15536c[i10]) != null) {
            str4 = str;
        }
        int i11 = bVar.i(str3);
        if (i11 != -1) {
            bVar.f15536c[i11] = str2;
        }
        this.f15532b = str2;
        return str4;
    }
}
