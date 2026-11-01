package o2;

import android.text.TextUtils;
import b2.r0;
import b2.t0;
import b2.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements t0 {
    public final String f14067a;
    public final String f14068b;
    public final List f14069c;

    public s(String str, String str2, List list) {
        this.f14067a = str;
        this.f14068b = str2;
        this.f14069c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f14067a, sVar.f14067a) && TextUtils.equals(this.f14068b, sVar.f14068b) && this.f14069c.equals(sVar.f14069c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f14067a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f14068b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f14069c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f14067a;
        if (str2 != null) {
            str = a1.g.r(a1.g.u(" [", str2, ", "), this.f14068b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
