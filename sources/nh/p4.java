package nh;

import android.text.TextUtils;
import j$.util.Objects;
public final class p4 {
    public boolean f15726a = true;
    public boolean f15727b;
    public String f15728c;

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (obj != null && p4.class == obj.getClass()) {
                p4 p4Var = (p4) obj;
                if ((TextUtils.isEmpty(this.f15728c) && TextUtils.isEmpty(p4Var.f15728c)) || Objects.equals(this.f15728c, p4Var.f15728c)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f15726a != p4Var.f15726a || this.f15727b != p4Var.f15727b || !z4) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15726a), Boolean.valueOf(this.f15727b), this.f15728c);
    }
}
