package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
public final class v20 {
    public final i30 b;
    public boolean g;
    public boolean h;
    public boolean i;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Object c = new Object();
    public final HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public int f = 1;

    public v20(Context context, File file, sn6 sn6Var) {
        d30 d30Var = new d30(context, (byte) 0);
        d30Var.c = file;
        f30 f30Var = (f30) phd.c.a();
        if (f30Var != null) {
            d30Var.d = f30Var;
            d30Var.a = false;
            d30Var.e = new qx6(this, sn6Var, (byte) 5);
            d30Var.f = new lh2(this, sn6Var, false, (byte) 6);
            d30Var.g = new sjf((byte) 13);
            this.b = new i30(d30Var);
            return;
        }
        lq5.j("Noise suppression mode is required");
        throw null;
    }

    public final boolean a() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        n20 n20Var = null;
        byte[] bArr = null;
        n20Var = null;
        n20Var = null;
        n20Var = null;
        n20Var = null;
        if (i30Var.G == 5 && i30Var.z != null && i30Var.r == 0 && i30Var.s == i30Var.j()) {
            i30Var.p();
            g30 g30Var = i30Var.z;
            long j = i30Var.j();
            long length = g30Var.b.length();
            i30Var.a(g30Var, length);
            synchronized (i30Var.l) {
                if (g30Var.d && !g30Var.e) {
                    g30Var.e = true;
                    i30Var.k.execute(new w20(i30Var, g30Var, length, j, (byte) 0));
                    File file = g30Var.b;
                    byte[] bArr2 = i30Var.B;
                    if (bArr2 != null) {
                        bArr = (byte[]) bArr2.clone();
                    }
                    i30Var.C = new n20(file, j, bArr);
                    i30Var.s(8);
                    i30Var.c();
                    i30Var.t();
                    i30Var.l("detached_preview");
                    n20Var = i30Var.C;
                }
            }
        }
        if (n20Var == null) {
            return false;
        }
        this.b.o();
        this.h = true;
        return true;
    }

    public final boolean b() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        if (i30Var.e().a == 5) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        if (i30Var.G != 1) {
            return false;
        }
        File file = i30Var.b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            i30Var.h.b("start requested");
            i30Var.d();
            i30Var.s(2);
            i30Var.u(0L, -1L, null);
            return true;
        }
        i30Var.g(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }
}
