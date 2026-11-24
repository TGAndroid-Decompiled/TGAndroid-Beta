package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class hf4 extends ja {
    public CharSequence c;
    public t97 d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hf4)) {
            return false;
        }
        hf4 hf4Var = (hf4) obj;
        int i = hf4Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.c, hf4Var.c)) {
            return false;
        }
        int i3 = this.a;
        if (i3 == 2) {
            t97 t97Var = this.d;
            if (t97Var == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            t97 t97Var2 = hf4Var.d;
            if (t97Var2 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                return false;
            }
            if (t97Var != null && t97Var.a != t97Var2.a) {
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
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = hf4Var.e;
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
