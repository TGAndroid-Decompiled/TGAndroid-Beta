package o2;

import android.text.TextUtils;
import b2.r0;
import b2.t0;
import b2.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements t0 {
    public final String f19076a;
    public final String f19077b;
    public final List f19078c;

    public s(String str, String str2, List list) {
        this.f19076a = str;
        this.f19077b = str2;
        this.f19078c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f19076a, sVar.f19076a) && TextUtils.equals(this.f19077b, sVar.f19077b) && this.f19078c.equals(sVar.f19078c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f19076a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f19077b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f19078c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f19076a;
        if (str2 != null) {
            str = a1.g.s(a1.g.v(" [", str2, ", "), this.f19077b, "]");
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
