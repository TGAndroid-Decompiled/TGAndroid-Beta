package m5;

import android.content.Context;
public final class b extends c {
    public final Context f16320a;
    public final u5.a f16321b;
    public final u5.a f16322c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16320a = context;
            if (aVar != null) {
                this.f16321b = aVar;
                if (aVar2 != null) {
                    this.f16322c = aVar2;
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
            if (this.f16320a.equals(bVar.f16320a) && this.f16321b.equals(bVar.f16321b) && this.f16322c.equals(bVar.f16322c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16320a.hashCode() ^ 1000003) * 1000003) ^ this.f16321b.hashCode()) * 1000003) ^ this.f16322c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16320a);
        sb2.append(", wallClock=");
        sb2.append(this.f16321b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16322c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
