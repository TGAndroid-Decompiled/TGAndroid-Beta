package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14954a;
    public final u5.a f14955b;
    public final u5.a f14956c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14954a = context;
            if (aVar != null) {
                this.f14955b = aVar;
                if (aVar2 != null) {
                    this.f14956c = aVar2;
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
            if (this.f14954a.equals(bVar.f14954a) && this.f14955b.equals(bVar.f14955b) && this.f14956c.equals(bVar.f14956c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14954a.hashCode() ^ 1000003) * 1000003) ^ this.f14955b.hashCode()) * 1000003) ^ this.f14956c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14954a);
        sb2.append(", wallClock=");
        sb2.append(this.f14955b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14956c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
