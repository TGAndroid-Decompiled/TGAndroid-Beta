package a2;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f50a;
    public final int f51b;
    public final int f52c;

    public d(String str, int i3, int i10) {
        this.f50a = str;
        this.f51b = i3;
        this.f52c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i3 = dVar.f52c;
        String str = dVar.f50a;
        int i10 = dVar.f51b;
        int i11 = this.f52c;
        String str2 = this.f50a;
        int i12 = this.f51b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i3) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i11 == i3) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f50a, Integer.valueOf(this.f52c));
    }
}
