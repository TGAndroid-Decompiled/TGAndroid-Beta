package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class f86 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final u63 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public f86(e86 e86Var) {
        this.a = e86Var.a;
        this.b = e86Var.b;
        this.c = e86Var.d;
        this.d = e86Var.e;
        this.e = e86Var.c;
        this.f = e86Var.f;
        this.g = e86Var.g;
    }

    public final e86 a() {
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
