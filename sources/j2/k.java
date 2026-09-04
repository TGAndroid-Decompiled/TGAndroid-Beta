package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13209a;
    public final j f13210b;
    public final Object f13211c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13209a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13210b = jVar;
        this.f13211c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13210b;
        jVar.getClass();
        return (LogSessionId) jVar.f13208b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13209a, kVar.f13209a) && Objects.equals(this.f13210b, kVar.f13210b) && Objects.equals(this.f13211c, kVar.f13211c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13209a, this.f13210b, this.f13211c);
    }
}
