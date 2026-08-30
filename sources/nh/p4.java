package nh;

import android.text.TextUtils;
import j$.util.Objects;
public final class p4 {
    public boolean f15746a = true;
    public boolean f15747b;
    public String f15748c;

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (obj != null && p4.class == obj.getClass()) {
                p4 p4Var = (p4) obj;
                if ((TextUtils.isEmpty(this.f15748c) && TextUtils.isEmpty(p4Var.f15748c)) || Objects.equals(this.f15748c, p4Var.f15748c)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f15746a != p4Var.f15746a || this.f15747b != p4Var.f15747b || !z4) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15746a), Boolean.valueOf(this.f15747b), this.f15748c);
    }
}
