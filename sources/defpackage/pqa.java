package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.z;
public final class pqa implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;

    public pqa(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override
    public final void run() {
        mbb mbbVar;
        byte b = this.a;
        int i = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((y0) obj).a(Long.valueOf(j));
                return;
            case 1:
                d31.b0((nza) obj).I(2131624221, ob6.M0(2131750180, null), ob6.H(',', "Gift2Converted", (int) j)).k(true);
                return;
            case 2:
                d31.b0((w1b) obj).I(2131624221, ob6.M0(2131750180, null), ob6.H(',', "Gift2ConvertedChannel", (int) j)).k(true);
                return;
            case 3:
                e d0 = w1b.d0(uc7.s1(((c6b) obj).a).M0(Long.valueOf(-j)), true);
                e Q = LaunchActivity.Q();
                if (Q != 0) {
                    rbb rbbVar = rbb.G2;
                    if (rbbVar != null && rbbVar.d) {
                        ?? obj2 = new Object();
                        obj2.a = true;
                        Q.showAsSheet(d0, obj2);
                        return;
                    }
                    Q.presentFragment(d0);
                    return;
                }
                return;
            case 4:
                jf7 jf7Var = ((o6b) obj).b;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            case 5:
                r9b r9bVar = (r9b) obj;
                Context context = r9bVar.getContext();
                w9b w9bVar = r9bVar.a0;
                e eVar = w9bVar.i1;
                int i2 = w9b.X1;
                jj.P(context, eVar, w9bVar.J0, new i02(r9bVar, j, (byte) 11));
                return;
            case 6:
                rbb rbbVar2 = (rbb) obj;
                mbb mbbVar2 = rbbVar2.G;
                if (mbbVar2 != null) {
                    mbbVar2.f(true);
                    rbbVar2.G = null;
                }
                ibb ibbVar = rbbVar2.y;
                if (ibbVar != null) {
                    mbbVar = ibbVar.b(j);
                } else {
                    mbbVar = null;
                }
                rbbVar2.G = mbbVar;
                if (mbbVar != null) {
                    rbbVar2.K = mbbVar.a;
                    rbbVar2.r.c();
                    ebb ebbVar = rbbVar2.i0;
                    boolean z = rbbVar2.K;
                    if (!z && z) {
                        i = -14737633;
                    }
                    ebbVar.setBackgroundColor(i);
                    rbbVar2.I.set(rbbVar2.G.c);
                    mbb mbbVar3 = rbbVar2.G;
                    rbbVar2.H = mbbVar3.b;
                    mbbVar3.e();
                    if (xea.o() > 1) {
                        i86.e(360928);
                    }
                }
                rbbVar2.y = null;
                Activity activity = rbbVar2.b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).y0.post(new bab(rbbVar2, (byte) 4));
                    return;
                } else {
                    rbbVar2.o(true);
                    return;
                }
            case 7:
                esb esbVar = ((ksb) obj).a;
                if (esbVar != null) {
                    esbVar.C(j, false);
                    return;
                }
                return;
            case 8:
                ((VideoPlayerHolderBase) obj).lambda$seekTo$11(j);
                return;
            default:
                z zVar = (z) obj;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    zVar.c.d(j);
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
