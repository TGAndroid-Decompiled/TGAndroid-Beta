package o2;

import android.text.TextUtils;
import b2.r0;
import b2.t0;
import b2.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements t0 {
    public final String f16575a;
    public final String f16576b;
    public final List f16577c;

    public s(String str, String str2, List list) {
        this.f16575a = str;
        this.f16576b = str2;
        this.f16577c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f16575a, sVar.f16575a) && TextUtils.equals(this.f16576b, sVar.f16576b) && this.f16577c.equals(sVar.f16577c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f16575a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f16576b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f16577c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f16575a;
        if (str2 != null) {
            str = a1.g.s(a1.g.v(" [", str2, ", "), this.f16576b, "]");
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
