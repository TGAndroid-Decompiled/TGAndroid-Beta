package m5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f16786a;
    public final u5.a f16787b;
    public final u5.a f16788c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16786a = context;
            if (aVar != null) {
                this.f16787b = aVar;
                if (aVar2 != null) {
                    this.f16788c = aVar2;
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
            if (this.f16786a.equals(bVar.f16786a) && this.f16787b.equals(bVar.f16787b) && this.f16788c.equals(bVar.f16788c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16786a.hashCode() ^ 1000003) * 1000003) ^ this.f16787b.hashCode()) * 1000003) ^ this.f16788c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16786a);
        sb2.append(", wallClock=");
        sb2.append(this.f16787b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16788c);
        sb2.append(", backendName=");
        return g.s(sb2, this.d, "}");
    }
}
