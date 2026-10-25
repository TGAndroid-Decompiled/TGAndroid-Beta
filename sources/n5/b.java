package n5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f18719a;
    public final v5.a f18720b;
    public final v5.a f18721c;
    public final String d;

    public b(Context context, v5.a aVar, v5.a aVar2, String str) {
        if (context != null) {
            this.f18719a = context;
            if (aVar != null) {
                this.f18720b = aVar;
                if (aVar2 != null) {
                    this.f18721c = aVar2;
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
            if (this.f18719a.equals(bVar.f18719a) && this.f18720b.equals(bVar.f18720b) && this.f18721c.equals(bVar.f18721c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f18719a.hashCode() ^ 1000003) * 1000003) ^ this.f18720b.hashCode()) * 1000003) ^ this.f18721c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f18719a);
        sb2.append(", wallClock=");
        sb2.append(this.f18720b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f18721c);
        sb2.append(", backendName=");
        return g.s(sb2, this.d, "}");
    }
}
