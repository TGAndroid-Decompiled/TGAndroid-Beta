package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13722a;
    public final j f13723b;
    public final Object f13724c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13722a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13723b = jVar;
        this.f13724c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13723b;
        jVar.getClass();
        return (LogSessionId) jVar.f13721b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13722a, kVar.f13722a) && Objects.equals(this.f13723b, kVar.f13723b) && Objects.equals(this.f13724c, kVar.f13724c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13722a, this.f13723b, this.f13724c);
    }
}
