package fd;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f10425a;
    public String f10426b;
    public c f10427c;

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
            String str = aVar.f10425a;
            String str2 = this.f10425a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f10426b;
            String str4 = aVar.f10426b;
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
        return this.f10425a;
    }

    @Override
    public final Object getValue() {
        return this.f10426b;
    }

    @Override
    public final int hashCode() {
        int i10;
        String str = this.f10425a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f10426b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f10427c;
        String str3 = this.f10425a;
        int h = cVar.h(str3);
        String str4 = "";
        if (h != -1 && (str = cVar.f10433c[h]) != null) {
            str4 = str;
        }
        int h10 = cVar.h(str3);
        if (h10 != -1) {
            cVar.f10433c[h10] = str2;
        }
        this.f10426b = str2;
        return str4;
    }
}
