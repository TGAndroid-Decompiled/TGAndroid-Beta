package o2;

import android.text.TextUtils;
import b2.m0;
import b2.o0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements o0 {
    public final String f17051a;
    public final String f17052b;
    public final List f17053c;

    public s(String str, String str2, List list) {
        this.f17051a = str;
        this.f17052b = str2;
        this.f17053c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final b2.s a() {
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
            if (TextUtils.equals(this.f17051a, sVar.f17051a) && TextUtils.equals(this.f17052b, sVar.f17052b) && this.f17053c.equals(sVar.f17053c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17051a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17052b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f17053c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f17051a;
        if (str2 != null) {
            str = a1.g.t(a1.g.w(" [", str2, ", "), this.f17052b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
