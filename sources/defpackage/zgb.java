package defpackage;

import android.view.ViewGroup;
public final class zgb extends ViewGroup.MarginLayoutParams {
    public bhb a;
    public bhb b;

    public zgb() {
        super(-2, -2);
        bhb bhbVar = bhb.e;
        this.a = bhbVar;
        this.b = bhbVar;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = bhbVar;
        this.b = bhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zgb.class != obj.getClass()) {
            return false;
        }
        zgb zgbVar = (zgb) obj;
        if (this.b.equals(zgbVar.b) && this.a.equals(zgbVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
