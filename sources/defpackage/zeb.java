package defpackage;

import android.view.ViewGroup;
public final class zeb extends ViewGroup.MarginLayoutParams {
    public bfb a;
    public bfb b;

    public zeb() {
        super(-2, -2);
        bfb bfbVar = bfb.e;
        this.a = bfbVar;
        this.b = bfbVar;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = bfbVar;
        this.b = bfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zeb.class != obj.getClass()) {
            return false;
        }
        zeb zebVar = (zeb) obj;
        if (this.b.equals(zebVar.b) && this.a.equals(zebVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
