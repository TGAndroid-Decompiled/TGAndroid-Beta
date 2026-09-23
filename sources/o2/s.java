package o2;

import android.text.TextUtils;
import b2.m0;
import b2.o0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements o0 {
    public final String f15431a;
    public final String f15432b;
    public final List f15433c;

    public s(String str, String str2, List list) {
        this.f15431a = str;
        this.f15432b = str2;
        this.f15433c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f15431a, sVar.f15431a) && TextUtils.equals(this.f15432b, sVar.f15432b) && this.f15433c.equals(sVar.f15433c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f15431a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f15432b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f15433c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f15431a;
        if (str2 != null) {
            str = a4.a.t(a4.a.w(" [", str2, ", "), this.f15432b, "]");
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
