package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12596a;
    public final j f12597b;
    public final Object f12598c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12596a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12597b = jVar;
        this.f12598c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12597b;
        jVar.getClass();
        return (LogSessionId) jVar.f12595b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12596a, kVar.f12596a) && Objects.equals(this.f12597b, kVar.f12597b) && Objects.equals(this.f12598c, kVar.f12598c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12596a, this.f12597b, this.f12598c);
    }
}
