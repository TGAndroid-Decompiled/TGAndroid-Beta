package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12604a;
    public final j f12605b;
    public final Object f12606c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12604a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12605b = jVar;
        this.f12606c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12605b;
        jVar.getClass();
        return (LogSessionId) jVar.f12603b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12604a, kVar.f12604a) && Objects.equals(this.f12605b, kVar.f12605b) && Objects.equals(this.f12606c, kVar.f12606c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12604a, this.f12605b, this.f12606c);
    }
}
