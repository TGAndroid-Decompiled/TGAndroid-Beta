package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.z;
public final class sma implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;

    public sma(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override
    public final void run() {
        o7b o7bVar;
        byte b = this.a;
        int i = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((x0) obj).a(Long.valueOf(j));
                return;
            case 1:
                u21.b0((jva) obj).I(2131624221, k96.M0(2131750205, null), k96.H(',', "Gift2Converted", (int) j)).k(true);
                return;
            case 2:
                u21.b0((uxa) obj).I(2131624221, k96.M0(2131750205, null), k96.H(',', "Gift2ConvertedChannel", (int) j)).k(true);
                return;
            case 3:
                d d0 = uxa.d0(na7.q1(((g2b) obj).a).K0(Long.valueOf(-j)), true);
                d Q = LaunchActivity.Q();
                if (Q != 0) {
                    t7b t7bVar = t7b.G2;
                    if (t7bVar != null && t7bVar.d) {
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
                ad7 ad7Var = ((s2b) obj).b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            case 5:
                t5b t5bVar = (t5b) obj;
                Context context = t5bVar.getContext();
                y5b y5bVar = t5bVar.a0;
                d dVar = y5bVar.i1;
                int i2 = y5b.X1;
                ij.P(context, dVar, y5bVar.J0, new rz1(t5bVar, j, (byte) 11));
                return;
            case 6:
                t7b t7bVar2 = (t7b) obj;
                o7b o7bVar2 = t7bVar2.G;
                if (o7bVar2 != null) {
                    o7bVar2.f(true);
                    t7bVar2.G = null;
                }
                k7b k7bVar = t7bVar2.y;
                if (k7bVar != null) {
                    o7bVar = k7bVar.b(j);
                } else {
                    o7bVar = null;
                }
                t7bVar2.G = o7bVar;
                if (o7bVar != null) {
                    t7bVar2.K = o7bVar.a;
                    t7bVar2.r.c();
                    g7b g7bVar = t7bVar2.i0;
                    boolean z = t7bVar2.K;
                    if (!z && z) {
                        i = -14737633;
                    }
                    g7bVar.setBackgroundColor(i);
                    t7bVar2.I.set(t7bVar2.G.c);
                    o7b o7bVar3 = t7bVar2.G;
                    t7bVar2.H = o7bVar3.b;
                    o7bVar3.e();
                    if (gba.o() > 1) {
                        e66.e(360928);
                    }
                }
                t7bVar2.y = null;
                Activity activity = t7bVar2.b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).y0.post(new d6b(t7bVar2, (byte) 5));
                    return;
                } else {
                    t7bVar2.o(true);
                    return;
                }
            case 7:
                eob eobVar = ((kob) obj).a;
                if (eobVar != null) {
                    eobVar.z(j, false);
                    return;
                }
                return;
            case 8:
                ((VideoCapturerDevice) obj).lambda$init$3(j);
                return;
            case 9:
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
