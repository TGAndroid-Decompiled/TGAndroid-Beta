package b2;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f2857a;
    public final int f2858b;
    public final int f2859c;

    public d(String str, int i7, int i10) {
        this.f2857a = str;
        this.f2858b = i7;
        this.f2859c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i7 = dVar.f2859c;
        String str = dVar.f2857a;
        int i10 = dVar.f2858b;
        int i11 = this.f2859c;
        String str2 = this.f2857a;
        int i12 = this.f2858b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i7) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i11 == i7) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f2857a, Integer.valueOf(this.f2859c));
    }
}
