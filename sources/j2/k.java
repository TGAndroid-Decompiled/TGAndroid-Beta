package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13720a;
    public final j f13721b;
    public final Object f13722c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13720a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13721b = jVar;
        this.f13722c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13721b;
        jVar.getClass();
        return (LogSessionId) jVar.f13719b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13720a, kVar.f13720a) && Objects.equals(this.f13721b, kVar.f13721b) && Objects.equals(this.f13722c, kVar.f13722c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13720a, this.f13721b, this.f13722c);
    }
}
