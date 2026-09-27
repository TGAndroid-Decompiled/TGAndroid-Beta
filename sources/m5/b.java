package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14980a;
    public final u5.a f14981b;
    public final u5.a f14982c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14980a = context;
            if (aVar != null) {
                this.f14981b = aVar;
                if (aVar2 != null) {
                    this.f14982c = aVar2;
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
            if (this.f14980a.equals(bVar.f14980a) && this.f14981b.equals(bVar.f14981b) && this.f14982c.equals(bVar.f14982c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14980a.hashCode() ^ 1000003) * 1000003) ^ this.f14981b.hashCode()) * 1000003) ^ this.f14982c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14980a);
        sb2.append(", wallClock=");
        sb2.append(this.f14981b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14982c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
