package o2;

import android.text.TextUtils;
import b2.m0;
import b2.o0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements o0 {
    public final String f17106a;
    public final String f17107b;
    public final List f17108c;

    public s(String str, String str2, List list) {
        this.f17106a = str;
        this.f17107b = str2;
        this.f17108c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f17106a, sVar.f17106a) && TextUtils.equals(this.f17107b, sVar.f17107b) && this.f17108c.equals(sVar.f17108c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17106a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f17107b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f17108c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f17106a;
        if (str2 != null) {
            str = a4.a.t(a4.a.w(" [", str2, ", "), this.f17107b, "]");
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
