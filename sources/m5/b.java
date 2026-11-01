package m5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f13007a;
    public final u5.a f13008b;
    public final u5.a f13009c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f13007a = context;
            if (aVar != null) {
                this.f13008b = aVar;
                if (aVar2 != null) {
                    this.f13009c = aVar2;
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
            if (this.f13007a.equals(bVar.f13007a) && this.f13008b.equals(bVar.f13008b) && this.f13009c.equals(bVar.f13009c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13007a.hashCode() ^ 1000003) * 1000003) ^ this.f13008b.hashCode()) * 1000003) ^ this.f13009c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f13007a);
        sb2.append(", wallClock=");
        sb2.append(this.f13008b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f13009c);
        sb2.append(", backendName=");
        return g.r(sb2, this.d, "}");
    }
}
