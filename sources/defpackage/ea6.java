package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class ea6 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final g83 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public ea6(da6 da6Var) {
        this.a = da6Var.a;
        this.b = da6Var.b;
        this.c = da6Var.d;
        this.d = da6Var.e;
        this.e = da6Var.c;
        this.f = da6Var.f;
        this.g = da6Var.g;
    }

    public final da6 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.d = this.c;
        obj.e = this.d;
        obj.c = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }
}
