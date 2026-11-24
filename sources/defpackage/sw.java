package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class sw implements Runnable {
    public static final sw b = new sw((byte) 14);
    public final byte a;

    public sw(x59 x59Var, int i) {
        this.a = (byte) 1;
    }

    @Override
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ArrayList arrayList = op3.j;
                if (arrayList != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = op3.j;
                    op3.j = null;
                    if (op3.k == null) {
                        int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                        ?? obj = new Object();
                        obj.a = new ArrayList(10);
                        obj.b = new SparseIntArray();
                        obj.c = new ArrayList(10);
                        obj.i = new o1(obj, (byte) 24);
                        obj.d = max;
                        obj.f = Utilities.b.nextInt();
                        op3.k = obj;
                    }
                    Utilities.e.c(new sf(arrayList2, (byte) 4));
                    return;
                }
                op3.j = null;
                return;
            case 7:
                try {
                    int i = ozb.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (wx3.j == null) {
                        z = false;
                    }
                    if (z) {
                        wx3.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = ozb.a;
                    Trace.endSection();
                    throw th;
                }
            case 8:
                return;
            case 9:
                String[] strArr = MediaController.W1;
                return;
            case 10:
                Utilities.b.nextInt();
                j15[] j15VarArr = y4b.a;
                nm7.f(z8c.t0).k(2, 0);
                gm.d3(y4b.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 11:
                cmb.j = false;
                cmb.l(false);
                return;
            case 12:
                cmb.k = false;
                cmb.l(true);
                return;
            case 13:
                yic yicVar = yic.U;
                if (yicVar != null) {
                    xic xicVar = yicVar.b;
                    int i3 = xic.h;
                    gm.r(xicVar.f.O);
                    return;
                }
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                return;
        }
    }

    public sw(i63 i63Var, String str, Bundle bundle, byte b2) {
        this.a = b2;
    }

    public sw(Binder binder, Object obj, byte b2) {
        this.a = b2;
    }

    public sw(Object obj, byte b2) {
        this.a = b2;
    }

    public sw(byte b2) {
        this.a = b2;
    }

    public sw(i63 i63Var, int i, Bundle bundle) {
        this.a = (byte) 2;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
