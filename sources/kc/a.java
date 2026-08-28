package kc;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f14750a;
    public String f14751b;
    public c f14752c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f14750a;
            String str2 = this.f14750a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f14751b;
            String str4 = aVar.f14751b;
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
        return this.f14750a;
    }

    @Override
    public final Object getValue() {
        return this.f14751b;
    }

    @Override
    public final int hashCode() {
        int i9;
        String str = this.f14750a;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = i9 * 31;
        String str2 = this.f14751b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f14752c;
        String str3 = this.f14750a;
        int i9 = cVar.i(str3);
        String str4 = "";
        if (i9 != -1 && (str = cVar.f14758c[i9]) != null) {
            str4 = str;
        }
        int i10 = cVar.i(str3);
        if (i10 != -1) {
            cVar.f14758c[i10] = str2;
        }
        this.f14751b = str2;
        return str4;
    }
}
