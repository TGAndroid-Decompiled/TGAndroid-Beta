package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12593a;
    public final j f12594b;
    public final Object f12595c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12593a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12594b = jVar;
        this.f12595c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12594b;
        jVar.getClass();
        return (LogSessionId) jVar.f12592b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12593a, kVar.f12593a) && Objects.equals(this.f12594b, kVar.f12594b) && Objects.equals(this.f12595c, kVar.f12595c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12593a, this.f12594b, this.f12595c);
    }
}
