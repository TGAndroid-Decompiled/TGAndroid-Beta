package m5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f16323a;
    public final u5.a f16324b;
    public final u5.a f16325c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16323a = context;
            if (aVar != null) {
                this.f16324b = aVar;
                if (aVar2 != null) {
                    this.f16325c = aVar2;
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
            if (this.f16323a.equals(bVar.f16323a) && this.f16324b.equals(bVar.f16324b) && this.f16325c.equals(bVar.f16325c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16323a.hashCode() ^ 1000003) * 1000003) ^ this.f16324b.hashCode()) * 1000003) ^ this.f16325c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16323a);
        sb2.append(", wallClock=");
        sb2.append(this.f16324b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16325c);
        sb2.append(", backendName=");
        return g.t(sb2, this.d, "}");
    }
}
