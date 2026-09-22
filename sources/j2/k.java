package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12603a;
    public final j f12604b;
    public final Object f12605c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12603a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12604b = jVar;
        this.f12605c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12604b;
        jVar.getClass();
        return (LogSessionId) jVar.f12602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12603a, kVar.f12603a) && Objects.equals(this.f12604b, kVar.f12604b) && Objects.equals(this.f12605c, kVar.f12605c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12603a, this.f12604b, this.f12605c);
    }
}
