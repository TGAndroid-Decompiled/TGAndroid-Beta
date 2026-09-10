package m5;

import android.content.Context;
public final class b extends c {
    public final Context f13570a;
    public final u5.a f13571b;
    public final u5.a f13572c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f13570a = context;
            if (aVar != null) {
                this.f13571b = aVar;
                if (aVar2 != null) {
                    this.f13572c = aVar2;
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
            if (this.f13570a.equals(bVar.f13570a) && this.f13571b.equals(bVar.f13571b) && this.f13572c.equals(bVar.f13572c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13570a.hashCode() ^ 1000003) * 1000003) ^ this.f13571b.hashCode()) * 1000003) ^ this.f13572c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f13570a);
        sb2.append(", wallClock=");
        sb2.append(this.f13571b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f13572c);
        sb2.append(", backendName=");
        return a4.a.s(sb2, this.d, "}");
    }
}
