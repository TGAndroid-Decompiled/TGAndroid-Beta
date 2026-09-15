package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12601a;
    public final j f12602b;
    public final Object f12603c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12601a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12602b = jVar;
        this.f12603c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12602b;
        jVar.getClass();
        return (LogSessionId) jVar.f12600b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12601a, kVar.f12601a) && Objects.equals(this.f12602b, kVar.f12602b) && Objects.equals(this.f12603c, kVar.f12603c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12601a, this.f12602b, this.f12603c);
    }
}
