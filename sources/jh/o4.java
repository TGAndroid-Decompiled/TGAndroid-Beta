package jh;

import android.text.TextUtils;
import j$.util.Objects;

public final class o4 {

    public boolean f13745a = true;

    public boolean f13746b;

    public String f13747c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o4.class == obj.getClass()) {
                o4 o4Var = (o4) obj;
                boolean z10 = (TextUtils.isEmpty(this.f13747c) && TextUtils.isEmpty(o4Var.f13747c)) || Objects.equals(this.f13747c, o4Var.f13747c);
                if (this.f13745a != o4Var.f13745a || this.f13746b != o4Var.f13746b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f13745a), Boolean.valueOf(this.f13746b), this.f13747c);
    }
}
