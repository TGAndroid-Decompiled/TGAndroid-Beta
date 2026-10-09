package m5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f16259a;
    public final u5.a f16260b;
    public final u5.a f16261c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16259a = context;
            if (aVar != null) {
                this.f16260b = aVar;
                if (aVar2 != null) {
                    this.f16261c = aVar2;
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
            if (this.f16259a.equals(bVar.f16259a) && this.f16260b.equals(bVar.f16260b) && this.f16261c.equals(bVar.f16261c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16259a.hashCode() ^ 1000003) * 1000003) ^ this.f16260b.hashCode()) * 1000003) ^ this.f16261c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16259a);
        sb2.append(", wallClock=");
        sb2.append(this.f16260b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16261c);
        sb2.append(", backendName=");
        return g.t(sb2, this.d, "}");
    }
}
