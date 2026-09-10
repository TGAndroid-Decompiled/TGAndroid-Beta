package cd;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f4631a;
    public String f4632b;
    public c f4633c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f4631a;
            String str2 = this.f4631a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f4632b;
            String str4 = aVar.f4632b;
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
        return this.f4631a;
    }

    @Override
    public final Object getValue() {
        return this.f4632b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f4631a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f4632b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f4633c;
        String str3 = this.f4631a;
        int i10 = cVar.i(str3);
        String str4 = "";
        if (i10 != -1 && (str = cVar.f4639c[i10]) != null) {
            str4 = str;
        }
        int i11 = cVar.i(str3);
        if (i11 != -1) {
            cVar.f4639c[i11] = str2;
        }
        this.f4632b = str2;
        return str4;
    }
}
