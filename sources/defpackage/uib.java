package defpackage;

import android.view.ViewGroup;
public final class uib extends ViewGroup.MarginLayoutParams {
    public wib a;
    public wib b;

    public uib() {
        super(-2, -2);
        wib wibVar = wib.e;
        this.a = wibVar;
        this.b = wibVar;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = wibVar;
        this.b = wibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uib.class != obj.getClass()) {
            return false;
        }
        uib uibVar = (uib) obj;
        if (this.b.equals(uibVar.b) && this.a.equals(uibVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
