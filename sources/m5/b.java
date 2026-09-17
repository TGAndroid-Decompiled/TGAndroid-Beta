package m5;

import android.content.Context;
public final class b extends c {
    public final Context f14738a;
    public final u5.a f14739b;
    public final u5.a f14740c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f14738a = context;
            if (aVar != null) {
                this.f14739b = aVar;
                if (aVar2 != null) {
                    this.f14740c = aVar2;
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
            if (this.f14738a.equals(bVar.f14738a) && this.f14739b.equals(bVar.f14739b) && this.f14740c.equals(bVar.f14740c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14738a.hashCode() ^ 1000003) * 1000003) ^ this.f14739b.hashCode()) * 1000003) ^ this.f14740c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14738a);
        sb2.append(", wallClock=");
        sb2.append(this.f14739b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14740c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
