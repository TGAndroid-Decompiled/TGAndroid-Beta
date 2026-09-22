package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14961a;
    public final u5.a f14962b;
    public final u5.a f14963c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14961a = context;
            if (aVar != null) {
                this.f14962b = aVar;
                if (aVar2 != null) {
                    this.f14963c = aVar2;
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
            if (this.f14961a.equals(bVar.f14961a) && this.f14962b.equals(bVar.f14962b) && this.f14963c.equals(bVar.f14963c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14961a.hashCode() ^ 1000003) * 1000003) ^ this.f14962b.hashCode()) * 1000003) ^ this.f14963c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14961a);
        sb2.append(", wallClock=");
        sb2.append(this.f14962b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14963c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
