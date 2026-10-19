package ed;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f8603a;
    public String f8604b;
    public c f8605c;

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
            String str = aVar.f8603a;
            String str2 = this.f8603a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f8604b;
            String str4 = aVar.f8604b;
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
        return this.f8603a;
    }

    @Override
    public final Object getValue() {
        return this.f8604b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f8603a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f8604b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f8605c;
        String str3 = this.f8603a;
        int h = cVar.h(str3);
        String str4 = "";
        if (h != -1 && (str = cVar.f8611c[h]) != null) {
            str4 = str;
        }
        int h10 = cVar.h(str3);
        if (h10 != -1) {
            cVar.f8611c[h10] = str2;
        }
        this.f8604b = str2;
        return str4;
    }
}
