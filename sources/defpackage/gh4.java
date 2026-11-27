package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class gh4 extends ka {
    public CharSequence c;
    public ac7 d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh4)) {
            return false;
        }
        gh4 gh4Var = (gh4) obj;
        int i = gh4Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.c, gh4Var.c)) {
            return false;
        }
        int i3 = this.a;
        if (i3 == 2) {
            ac7 ac7Var = this.d;
            if (ac7Var == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ac7 ac7Var2 = gh4Var.d;
            if (ac7Var2 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                return false;
            }
            if (ac7Var != null && ac7Var.a != ac7Var2.a) {
                return false;
            }
        }
        if (i3 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            if (tL_dialogFilterSuggested == null) {
                z = true;
            } else {
                z = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = gh4Var.e;
            if (tL_dialogFilterSuggested2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.id != tL_dialogFilterSuggested2.filter.id) {
                return false;
            }
        }
        return true;
    }
}
