package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13685a;
    public final j f13686b;
    public final Object f13687c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13685a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13686b = jVar;
        this.f13687c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13686b;
        jVar.getClass();
        return (LogSessionId) jVar.f13684b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13685a, kVar.f13685a) && Objects.equals(this.f13686b, kVar.f13686b) && Objects.equals(this.f13687c, kVar.f13687c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13685a, this.f13686b, this.f13687c);
    }
}
