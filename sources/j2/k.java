package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;
public final class k {
    public final String f13723a;
    public final j f13724b;
    public final Object f13725c;

    static {
        new k("");
    }

    public k(String str) {
        j jVar;
        this.f13723a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13724b = jVar;
        this.f13725c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13724b;
        jVar.getClass();
        return (LogSessionId) jVar.f13722b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f13723a, kVar.f13723a) && Objects.equals(this.f13724b, kVar.f13724b) && Objects.equals(this.f13725c, kVar.f13725c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13723a, this.f13724b, this.f13725c);
    }
}
