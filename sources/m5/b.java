package m5;

import android.content.Context;
public final class b extends c {
    public final Context f16315a;
    public final u5.a f16316b;
    public final u5.a f16317c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16315a = context;
            if (aVar != null) {
                this.f16316b = aVar;
                if (aVar2 != null) {
                    this.f16317c = aVar2;
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
            if (this.f16315a.equals(bVar.f16315a) && this.f16316b.equals(bVar.f16316b) && this.f16317c.equals(bVar.f16317c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16315a.hashCode() ^ 1000003) * 1000003) ^ this.f16316b.hashCode()) * 1000003) ^ this.f16317c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16315a);
        sb2.append(", wallClock=");
        sb2.append(this.f16316b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16317c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
