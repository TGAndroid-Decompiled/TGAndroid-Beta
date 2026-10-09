package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String f3311e;
    public final boolean f3312b;
    public final boolean f3313c;

    static {
        String str = e2.d0.f8532a;
        d = Integer.toString(1, 36);
        f3311e = Integer.toString(2, 36);
    }

    public f1() {
        this.f3312b = false;
        this.f3313c = false;
    }

    @Override
    public final boolean b() {
        return this.f3312b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3263a, 3);
        bundle.putBoolean(d, this.f3312b);
        bundle.putBoolean(f3311e, this.f3313c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f3313c == f1Var.f3313c && this.f3312b == f1Var.f3312b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3312b), Boolean.valueOf(this.f3313c));
    }

    public f1(boolean z10) {
        this.f3312b = true;
        this.f3313c = z10;
    }
}
