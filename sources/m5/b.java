package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14703a;
    public final u5.a f14704b;
    public final u5.a f14705c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14703a = context;
            if (aVar != null) {
                this.f14704b = aVar;
                if (aVar2 != null) {
                    this.f14705c = aVar2;
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
            if (this.f14703a.equals(bVar.f14703a) && this.f14704b.equals(bVar.f14704b) && this.f14705c.equals(bVar.f14705c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14703a.hashCode() ^ 1000003) * 1000003) ^ this.f14704b.hashCode()) * 1000003) ^ this.f14705c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14703a);
        sb2.append(", wallClock=");
        sb2.append(this.f14704b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14705c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
