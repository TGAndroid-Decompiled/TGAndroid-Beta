package g5;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class m0 implements n0 {
    public static final c4.e d = new c4.e(0, -9223372036854775807L, false);
    public static final c4.e e = new c4.e(2, -9223372036854775807L, false);
    public static final c4.e f6391f = new c4.e(3, -9223372036854775807L, false);
    public final ExecutorService f6392a;
    public i0 f6393b;
    public IOException f6394c;

    public m0(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = h5.d0.f6924a;
        this.f6392a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(concat, 1));
    }

    @Override
    public final void a() {
        IOException iOException = this.f6394c;
        if (iOException == null) {
            i0 i0Var = this.f6393b;
            if (i0Var != null) {
                int i10 = i0Var.f6381a;
                IOException iOException2 = i0Var.e;
                if (iOException2 != null && i0Var.f6384f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        i0 i0Var = this.f6393b;
        h5.a.j(i0Var);
        i0Var.a(false);
    }

    public final boolean c() {
        if (this.f6394c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f6393b != null) {
            return true;
        }
        return false;
    }

    public final void e(k0 k0Var) {
        i0 i0Var = this.f6393b;
        if (i0Var != null) {
            i0Var.a(true);
        }
        ExecutorService executorService = this.f6392a;
        if (k0Var != null) {
            executorService.execute(new androidx.activity.i(k0Var, 20));
        }
        executorService.shutdown();
    }

    public final long f(j0 j0Var, h0 h0Var, int i10) {
        boolean z4;
        Looper myLooper = Looper.myLooper();
        h5.a.j(myLooper);
        this.f6394c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i0 i0Var = new i0(this, myLooper, j0Var, h0Var, i10, elapsedRealtime);
        if (this.f6393b == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        this.f6393b = i0Var;
        i0Var.e = null;
        this.f6392a.execute(i0Var);
        return elapsedRealtime;
    }
}
