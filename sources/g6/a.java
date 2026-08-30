package g6;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.common.api.n;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f6475a;
    public final boolean f6476b;
    public final String f6477c;
    public final String d;

    public a(ArrayList arrayList, boolean z4, String str, String str2) {
        m.h(arrayList);
        this.f6475a = arrayList;
        this.f6476b = z4;
        this.f6477c = str;
        this.d = str2;
    }

    public static a e(List list, boolean z4) {
        TreeSet treeSet = new TreeSet(b.f6478a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z4, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f6476b != aVar.f6476b || !m.l(this.f6475a, aVar.f6475a) || !m.l(this.f6477c, aVar.f6477c) || !m.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6476b), this.f6475a, this.f6477c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.p(parcel, 1, this.f6475a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f6476b ? 1 : 0);
        f5.l(parcel, 3, this.f6477c);
        f5.l(parcel, 4, this.d);
        f5.r(parcel, q10);
    }
}
