package n5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f18718a;
    public final v5.a f18719b;
    public final v5.a f18720c;
    public final String d;

    public b(Context context, v5.a aVar, v5.a aVar2, String str) {
        if (context != null) {
            this.f18718a = context;
            if (aVar != null) {
                this.f18719b = aVar;
                if (aVar2 != null) {
                    this.f18720c = aVar2;
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
            if (this.f18718a.equals(bVar.f18718a) && this.f18719b.equals(bVar.f18719b) && this.f18720c.equals(bVar.f18720c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f18718a.hashCode() ^ 1000003) * 1000003) ^ this.f18719b.hashCode()) * 1000003) ^ this.f18720c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f18718a);
        sb2.append(", wallClock=");
        sb2.append(this.f18719b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f18720c);
        sb2.append(", backendName=");
        return g.s(sb2, this.d, "}");
    }
}
