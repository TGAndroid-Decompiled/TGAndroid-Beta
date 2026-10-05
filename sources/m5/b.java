package m5;

import android.content.Context;
public final class b extends c {
    public final Context f16325a;
    public final u5.a f16326b;
    public final u5.a f16327c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16325a = context;
            if (aVar != null) {
                this.f16326b = aVar;
                if (aVar2 != null) {
                    this.f16327c = aVar2;
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
            if (this.f16325a.equals(bVar.f16325a) && this.f16326b.equals(bVar.f16326b) && this.f16327c.equals(bVar.f16327c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16325a.hashCode() ^ 1000003) * 1000003) ^ this.f16326b.hashCode()) * 1000003) ^ this.f16327c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16325a);
        sb2.append(", wallClock=");
        sb2.append(this.f16326b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16327c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
