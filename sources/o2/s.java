package o2;

import android.text.TextUtils;
import b2.q0;
import b2.s0;
import b2.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements s0 {
    public final String f17662a;
    public final String f17663b;
    public final List f17664c;

    public s(String str, String str2, List list) {
        this.f17662a = str;
        this.f17663b = str2;
        this.f17664c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f17662a, sVar.f17662a) && TextUtils.equals(this.f17663b, sVar.f17663b) && this.f17664c.equals(sVar.f17664c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17662a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17663b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f17664c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f17662a;
        if (str2 != null) {
            str = a1.g.s(a1.g.v(" [", str2, ", "), this.f17663b, "]");
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
