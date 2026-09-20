package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12605a;
    public final j f12606b;
    public final Object f12607c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12605a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12606b = jVar;
        this.f12607c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12606b;
        jVar.getClass();
        return (LogSessionId) jVar.f12604b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12605a, kVar.f12605a) && Objects.equals(this.f12606b, kVar.f12606b) && Objects.equals(this.f12607c, kVar.f12607c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12605a, this.f12606b, this.f12607c);
    }
}
