package o2;

import android.text.TextUtils;
import b2.q0;
import b2.s0;
import b2.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements s0 {
    public final String f17665a;
    public final String f17666b;
    public final List f17667c;

    public s(String str, String str2, List list) {
        this.f17665a = str;
        this.f17666b = str2;
        this.f17667c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f17665a, sVar.f17665a) && TextUtils.equals(this.f17666b, sVar.f17666b) && this.f17667c.equals(sVar.f17667c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17665a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17666b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f17667c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f17665a;
        if (str2 != null) {
            str = a1.g.s(a1.g.v(" [", str2, ", "), this.f17666b, "]");
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
