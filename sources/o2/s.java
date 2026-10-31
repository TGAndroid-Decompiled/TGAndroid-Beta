package o2;

import android.text.TextUtils;
import b2.r0;
import b2.t0;
import b2.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements t0 {
    public final String f14066a;
    public final String f14067b;
    public final List f14068c;

    public s(String str, String str2, List list) {
        this.f14066a = str;
        this.f14067b = str2;
        this.f14068c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f14066a, sVar.f14066a) && TextUtils.equals(this.f14067b, sVar.f14067b) && this.f14068c.equals(sVar.f14068c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f14066a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f14067b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f14068c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f14066a;
        if (str2 != null) {
            str = a1.g.r(a1.g.u(" [", str2, ", "), this.f14067b, "]");
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
