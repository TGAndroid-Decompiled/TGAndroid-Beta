package m5;

import android.content.Context;
public final class b extends c {
    public final Context f16119a;
    public final u5.a f16120b;
    public final u5.a f16121c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f16119a = context;
            if (aVar != null) {
                this.f16120b = aVar;
                if (aVar2 != null) {
                    this.f16121c = aVar2;
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
            if (this.f16119a.equals(bVar.f16119a) && this.f16120b.equals(bVar.f16120b) && this.f16121c.equals(bVar.f16121c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16119a.hashCode() ^ 1000003) * 1000003) ^ this.f16120b.hashCode()) * 1000003) ^ this.f16121c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16119a);
        sb2.append(", wallClock=");
        sb2.append(this.f16120b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16121c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
