package df;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import c2.p;
import c5.j;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b {
    public final int f4328a;
    public final e f4329b;

    public b(e eVar, int i10) {
        this.f4328a = i10;
        this.f4329b = eVar;
    }

    public final void a(boolean z4) {
        Bitmap bitmap;
        switch (this.f4328a) {
            case 0:
                final e eVar = this.f4329b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f4334a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f4334a);
                                    return;
                                }
                                eVar2.f4340j.f1817a.b().removeView(eVar2.f4337f);
                                eVar2.f4339i = null;
                                eVar2.f4337f = null;
                                eVar2.f4338g = null;
                                g gVar = eVar2.e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar2.e = null;
                                }
                                g gVar2 = eVar2.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar2.d = null;
                                }
                                j jVar = eVar2.h;
                                if (((f) jVar.e) != null) {
                                    ((View) jVar.f2152a).setBackground(null);
                                    jVar.e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap2 = (Bitmap) jVar.f2154c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2154c = null;
                                }
                                eVar2.f4334a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f4344n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f4334a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f4334a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f4340j.f1821g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f4334a = 2;
                                if (!eVar3.f4344n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                bf.f fVar = eVar4.f4340j;
                                if (eVar4.f4334a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f4334a);
                                    return;
                                }
                                fVar.f1821g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f4337f.invalidate();
                                eVar4.f4334a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f1823j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f4329b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f4334a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f4334a);
                                    return;
                                }
                                eVar22.f4340j.f1817a.b().removeView(eVar22.f4337f);
                                eVar22.f4339i = null;
                                eVar22.f4337f = null;
                                eVar22.f4338g = null;
                                g gVar = eVar22.e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar = eVar22.h;
                                if (((f) jVar.e) != null) {
                                    ((View) jVar.f2152a).setBackground(null);
                                    jVar.e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap2 = (Bitmap) jVar.f2154c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2154c = null;
                                }
                                eVar22.f4334a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f4344n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f4334a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f4334a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f4340j.f1821g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f4334a = 2;
                                if (!eVar3.f4344n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                bf.f fVar = eVar4.f4340j;
                                if (eVar4.f4334a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f4334a);
                                    return;
                                }
                                fVar.f1821g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f4337f.invalidate();
                                eVar4.f4334a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f1823j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                j jVar = this.f4329b.h;
                if (((f) jVar.e) != null) {
                    ((View) jVar.f2152a).setBackground(null);
                    jVar.e = null;
                }
                if (((f) jVar.d) == null && ((f) jVar.e) == null && (bitmap = (Bitmap) jVar.f2154c) != null) {
                    bitmap.recycle();
                    jVar.f2154c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z4);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z4);
                j jVar2 = this.f4329b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new ag.d(jVar2, 21));
                return;
            default:
                final e eVar3 = this.f4329b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f4334a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f4334a);
                                    return;
                                }
                                eVar22.f4340j.f1817a.b().removeView(eVar22.f4337f);
                                eVar22.f4339i = null;
                                eVar22.f4337f = null;
                                eVar22.f4338g = null;
                                g gVar = eVar22.e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar3 = eVar22.h;
                                if (((f) jVar3.e) != null) {
                                    ((View) jVar3.f2152a).setBackground(null);
                                    jVar3.e = null;
                                }
                                if (((f) jVar3.d) == null && ((f) jVar3.e) == null && (bitmap2 = (Bitmap) jVar3.f2154c) != null) {
                                    bitmap2.recycle();
                                    jVar3.f2154c = null;
                                }
                                eVar22.f4334a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f4344n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f4334a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f4334a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.A();
                                eVar32.f4340j.f1821g.e(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f4334a = 2;
                                if (!eVar32.f4344n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                bf.f fVar = eVar4.f4340j;
                                if (eVar4.f4334a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f4334a);
                                    return;
                                }
                                fVar.f1821g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f4337f.invalidate();
                                eVar4.f4334a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f1823j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
