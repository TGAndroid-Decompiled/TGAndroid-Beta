package defpackage;

import java.util.Map;
public final class ey implements Map.Entry, Cloneable {
    public String a;
    public String b;
    public fy c;

    public final Object clone() {
        try {
            return (ey) super.clone();
        } catch (CloneNotSupportedException e) {
            sdb.b(e);
            return null;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ey.class == obj.getClass()) {
            ey eyVar = (ey) obj;
            String str = this.a;
            String str2 = eyVar.a;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.b;
            String str4 = eyVar.b;
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
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        fy fyVar = this.c;
        String str3 = this.a;
        int h = fyVar.h(str3);
        String str4 = "";
        if (h != -1 && (str = fyVar.c[h]) != null) {
            str4 = str;
        }
        int h2 = fyVar.h(str3);
        if (h2 != -1) {
            fyVar.c[h2] = str2;
        }
        this.b = str2;
        return str4;
    }
}
