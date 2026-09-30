package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14969a;
    public final u5.a f14970b;
    public final u5.a f14971c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14969a = context;
            if (aVar != null) {
                this.f14970b = aVar;
                if (aVar2 != null) {
                    this.f14971c = aVar2;
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
            if (this.f14969a.equals(bVar.f14969a) && this.f14970b.equals(bVar.f14970b) && this.f14971c.equals(bVar.f14971c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14969a.hashCode() ^ 1000003) * 1000003) ^ this.f14970b.hashCode()) * 1000003) ^ this.f14971c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14969a);
        sb2.append(", wallClock=");
        sb2.append(this.f14970b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14971c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
