package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f11492a;
    public final j f11493b;
    public final Object f11494c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f11492a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f11493b = jVar;
        this.f11494c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f11493b;
        jVar.getClass();
        return (LogSessionId) jVar.f11491b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f11492a, kVar.f11492a) && Objects.equals(this.f11493b, kVar.f11493b) && Objects.equals(this.f11494c, kVar.f11494c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11492a, this.f11493b, this.f11494c);
    }
}
