package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13686a;
    public final j f13687b;
    public final Object f13688c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13686a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13687b = jVar;
        this.f13688c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13687b;
        jVar.getClass();
        return (LogSessionId) jVar.f13685b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13686a, kVar.f13686a) && Objects.equals(this.f13687b, kVar.f13687b) && Objects.equals(this.f13688c, kVar.f13688c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13686a, this.f13687b, this.f13688c);
    }
}
