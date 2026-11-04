package o5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f20908a;
    public final w5.a f20909b;
    public final w5.a f20910c;
    public final String d;

    public b(Context context, w5.a aVar, w5.a aVar2, String str) {
        if (context != null) {
            this.f20908a = context;
            if (aVar != null) {
                this.f20909b = aVar;
                if (aVar2 != null) {
                    this.f20910c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f20908a.equals(bVar.f20908a) && this.f20909b.equals(bVar.f20909b) && this.f20910c.equals(bVar.f20910c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f20908a.hashCode() ^ 1000003) * 1000003) ^ this.f20909b.hashCode()) * 1000003) ^ this.f20910c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f20908a);
        sb2.append(", wallClock=");
        sb2.append(this.f20909b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f20910c);
        sb2.append(", backendName=");
        return g.s(sb2, this.d, "}");
    }
}
