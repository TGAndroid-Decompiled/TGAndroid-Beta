package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
public final class ms6 extends IOException {
    public final g83 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public ms6(g83 g83Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = g83Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
