package o2;

import android.text.TextUtils;
import b2.q0;
import b2.s0;
import b2.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements s0 {
    public final String f17729a;
    public final String f17730b;
    public final List f17731c;

    public s(String str, String str2, List list) {
        this.f17729a = str;
        this.f17730b = str2;
        this.f17731c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final w a() {
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
            if (TextUtils.equals(this.f17729a, sVar.f17729a) && TextUtils.equals(this.f17730b, sVar.f17730b) && this.f17731c.equals(sVar.f17731c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17729a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17730b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f17731c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f17729a;
        if (str2 != null) {
            str = a1.g.s(a1.g.v(" [", str2, ", "), this.f17730b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
