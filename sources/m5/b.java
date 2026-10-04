package m5;

import android.content.Context;
public final class b extends c {
    public final Context f16316a;
    public final u5.a f16317b;
    public final u5.a f16318c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16316a = context;
            if (aVar != null) {
                this.f16317b = aVar;
                if (aVar2 != null) {
                    this.f16318c = aVar2;
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
            if (this.f16316a.equals(bVar.f16316a) && this.f16317b.equals(bVar.f16317b) && this.f16318c.equals(bVar.f16318c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16316a.hashCode() ^ 1000003) * 1000003) ^ this.f16317b.hashCode()) * 1000003) ^ this.f16318c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16316a);
        sb2.append(", wallClock=");
        sb2.append(this.f16317b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16318c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
