package cd;

import java.util.Map;
public final class a implements Map.Entry, Cloneable {
    public String f5188a;
    public String f5189b;
    public c f5190c;

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
            String str = aVar.f5188a;
            String str2 = this.f5188a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f5189b;
            String str4 = aVar.f5189b;
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
        return this.f5188a;
    }

    @Override
    public final Object getValue() {
        return this.f5189b;
    }

    @Override
    public final int hashCode() {
        int i7;
        String str = this.f5188a;
        int i10 = 0;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        String str2 = this.f5189b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        c cVar = this.f5190c;
        String str3 = this.f5188a;
        int f10 = cVar.f(str3);
        String str4 = "";
        if (f10 != -1 && (str = cVar.f5196c[f10]) != null) {
            str4 = str;
        }
        int f11 = cVar.f(str3);
        if (f11 != -1) {
            cVar.f5196c[f11] = str2;
        }
        this.f5189b = str2;
        return str4;
    }
}
