package dd;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f8300a;
    public String f8301b;
    public c f8302c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f8300a;
            String str2 = this.f8300a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f8301b;
            String str4 = aVar.f8301b;
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
        return this.f8300a;
    }

    @Override
    public final Object getValue() {
        return this.f8301b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f8300a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f8301b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f8302c;
        String str3 = this.f8300a;
        int i10 = cVar.i(str3);
        String str4 = "";
        if (i10 != -1 && (str = cVar.f8308c[i10]) != null) {
            str4 = str;
        }
        int i11 = cVar.i(str3);
        if (i11 != -1) {
            cVar.f8308c[i11] = str2;
        }
        this.f8301b = str2;
        return str4;
    }
}
