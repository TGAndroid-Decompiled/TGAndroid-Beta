package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13235a;
    public final j f13236b;
    public final Object f13237c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13235a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13236b = jVar;
        this.f13237c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13236b;
        jVar.getClass();
        return (LogSessionId) jVar.f13234b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13235a, kVar.f13235a) && Objects.equals(this.f13236b, kVar.f13236b) && Objects.equals(this.f13237c, kVar.f13237c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13235a, this.f13236b, this.f13237c);
    }
}
