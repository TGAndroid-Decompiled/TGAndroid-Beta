package m5;

import a1.g;
import android.content.Context;
public final class b extends c {
    public final Context f15694a;
    public final u5.a f15695b;
    public final u5.a f15696c;
    public final String d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context != null) {
            this.f15694a = context;
            if (aVar != null) {
                this.f15695b = aVar;
                if (aVar2 != null) {
                    this.f15696c = aVar2;
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
            if (this.f15694a.equals(bVar.f15694a) && this.f15695b.equals(bVar.f15695b) && this.f15696c.equals(bVar.f15696c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f15694a.hashCode() ^ 1000003) * 1000003) ^ this.f15695b.hashCode()) * 1000003) ^ this.f15696c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f15694a);
        sb2.append(", wallClock=");
        sb2.append(this.f15695b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f15696c);
        sb2.append(", backendName=");
        return g.s(sb2, this.d, "}");
    }
}
