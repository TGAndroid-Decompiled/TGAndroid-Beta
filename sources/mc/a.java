package mc;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f16971a;
    public String f16972b;
    public b f16973c;

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
            String str = aVar.f16971a;
            String str2 = this.f16971a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f16972b;
            String str4 = aVar.f16972b;
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
        return this.f16971a;
    }

    @Override
    public final Object getValue() {
        return this.f16972b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f16971a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f16972b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        b bVar = this.f16973c;
        String str3 = this.f16971a;
        int i10 = bVar.i(str3);
        String str4 = "";
        if (i10 != -1 && (str = bVar.f16976c[i10]) != null) {
            str4 = str;
        }
        int i11 = bVar.i(str3);
        if (i11 != -1) {
            bVar.f16976c[i11] = str2;
        }
        this.f16972b = str2;
        return str4;
    }
}
