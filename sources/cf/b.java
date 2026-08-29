package cf;

import a5.j;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import c2.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b {
    public final int f3038a;
    public final e f3039b;

    public b(e eVar, int i10) {
        this.f3038a = i10;
        this.f3039b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f3038a) {
            case 0:
                final e eVar = this.f3039b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f3044a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f3044a);
                                    return;
                                }
                                eVar2.f3051j.f397a.b().removeView(eVar2.f3048f);
                                eVar2.f3050i = null;
                                eVar2.f3048f = null;
                                eVar2.f3049g = null;
                                g gVar = eVar2.f3047e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar2.f3047e = null;
                                }
                                g gVar2 = eVar2.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar2.d = null;
                                }
                                j jVar = eVar2.h;
                                if (((f) jVar.f214e) != null) {
                                    ((View) jVar.f211a).setBackground(null);
                                    jVar.f214e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.f214e) == null && (bitmap2 = (Bitmap) jVar.f213c) != null) {
                                    bitmap2.recycle();
                                    jVar.f213c = null;
                                }
                                eVar2.f3044a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f3055n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f3044a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f3044a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.t();
                                eVar3.f3051j.f402g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f3044a = 2;
                                if (!eVar3.f3055n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                af.g gVar3 = eVar4.f3051j;
                                if (eVar4.f3044a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f3044a);
                                    return;
                                }
                                gVar3.f402g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f3048f.invalidate();
                                eVar4.f3044a = 4;
                                AndroidUtilities.doOnPreDraw(gVar3.f404j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f3039b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f3044a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f3044a);
                                    return;
                                }
                                eVar22.f3051j.f397a.b().removeView(eVar22.f3048f);
                                eVar22.f3050i = null;
                                eVar22.f3048f = null;
                                eVar22.f3049g = null;
                                g gVar = eVar22.f3047e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.f3047e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar = eVar22.h;
                                if (((f) jVar.f214e) != null) {
                                    ((View) jVar.f211a).setBackground(null);
                                    jVar.f214e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.f214e) == null && (bitmap2 = (Bitmap) jVar.f213c) != null) {
                                    bitmap2.recycle();
                                    jVar.f213c = null;
                                }
                                eVar22.f3044a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f3055n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f3044a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f3044a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.t();
                                eVar3.f3051j.f402g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f3044a = 2;
                                if (!eVar3.f3055n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                af.g gVar3 = eVar4.f3051j;
                                if (eVar4.f3044a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f3044a);
                                    return;
                                }
                                gVar3.f402g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f3048f.invalidate();
                                eVar4.f3044a = 4;
                                AndroidUtilities.doOnPreDraw(gVar3.f404j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                j jVar = this.f3039b.h;
                if (((f) jVar.f214e) != null) {
                    ((View) jVar.f211a).setBackground(null);
                    jVar.f214e = null;
                }
                if (((f) jVar.d) == null && ((f) jVar.f214e) == null && (bitmap = (Bitmap) jVar.f213c) != null) {
                    bitmap.recycle();
                    jVar.f213c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                j jVar2 = this.f3039b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new a4.g(jVar2, 25));
                return;
            default:
                final e eVar3 = this.f3039b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f3044a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f3044a);
                                    return;
                                }
                                eVar22.f3051j.f397a.b().removeView(eVar22.f3048f);
                                eVar22.f3050i = null;
                                eVar22.f3048f = null;
                                eVar22.f3049g = null;
                                g gVar = eVar22.f3047e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.f3047e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar3 = eVar22.h;
                                if (((f) jVar3.f214e) != null) {
                                    ((View) jVar3.f211a).setBackground(null);
                                    jVar3.f214e = null;
                                }
                                if (((f) jVar3.d) == null && ((f) jVar3.f214e) == null && (bitmap2 = (Bitmap) jVar3.f213c) != null) {
                                    bitmap2.recycle();
                                    jVar3.f213c = null;
                                }
                                eVar22.f3044a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f3055n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f3044a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f3044a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.t();
                                eVar32.f3051j.f402g.e(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f3044a = 2;
                                if (!eVar32.f3055n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                af.g gVar3 = eVar4.f3051j;
                                if (eVar4.f3044a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f3044a);
                                    return;
                                }
                                gVar3.f402g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f3048f.invalidate();
                                eVar4.f3044a = 4;
                                AndroidUtilities.doOnPreDraw(gVar3.f404j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
