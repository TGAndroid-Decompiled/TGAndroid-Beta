package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14726a;
    public final u5.a f14727b;
    public final u5.a f14728c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14726a = context;
            if (aVar != null) {
                this.f14727b = aVar;
                if (aVar2 != null) {
                    this.f14728c = aVar2;
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
            if (this.f14726a.equals(bVar.f14726a) && this.f14727b.equals(bVar.f14727b) && this.f14728c.equals(bVar.f14728c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14726a.hashCode() ^ 1000003) * 1000003) ^ this.f14727b.hashCode()) * 1000003) ^ this.f14728c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14726a);
        sb2.append(", wallClock=");
        sb2.append(this.f14727b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14728c);
        sb2.append(", backendName=");
        return a4.a.t(sb2, this.d, "}");
    }
}
