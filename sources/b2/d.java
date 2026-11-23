package b2;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f2827a;
    public final int f2828b;
    public final int f2829c;

    public d(String str, int i7, int i10) {
        this.f2827a = str;
        this.f2828b = i7;
        this.f2829c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i7 = dVar.f2829c;
        String str = dVar.f2827a;
        int i10 = dVar.f2828b;
        int i11 = this.f2829c;
        String str2 = this.f2827a;
        int i12 = this.f2828b;
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
        return Objects.hash(this.f2827a, Integer.valueOf(this.f2829c));
    }
}
