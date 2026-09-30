package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f12608a;
    public final j f12609b;
    public final Object f12610c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f12608a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12609b = jVar;
        this.f12610c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12609b;
        jVar.getClass();
        return (LogSessionId) jVar.f12607b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f12608a, kVar.f12608a) && Objects.equals(this.f12609b, kVar.f12609b) && Objects.equals(this.f12610c, kVar.f12610c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12608a, this.f12609b, this.f12610c);
    }
}
