package ef;

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
    public final int f5030a;
    public final e f5031b;

    public b(e eVar, int i10) {
        this.f5030a = i10;
        this.f5031b = eVar;
    }

    public final void a(boolean z4) {
        Bitmap bitmap;
        switch (this.f5030a) {
            case 0:
                final e eVar = this.f5031b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f5036a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f5036a);
                                    return;
                                }
                                eVar2.f5043j.f2491a.b().removeView(eVar2.f5040f);
                                eVar2.f5042i = null;
                                eVar2.f5040f = null;
                                eVar2.f5041g = null;
                                g gVar = eVar2.f5039e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar2.f5039e = null;
                                }
                                g gVar2 = eVar2.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar2.d = null;
                                }
                                j jVar = eVar2.h;
                                if (((f) jVar.f2318e) != null) {
                                    ((View) jVar.f2315a).setBackground(null);
                                    jVar.f2318e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.f2318e) == null && (bitmap2 = (Bitmap) jVar.f2317c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2317c = null;
                                }
                                eVar2.f5036a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f5047n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f5036a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f5036a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f5043j.f2496g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f5036a = 2;
                                if (!eVar3.f5047n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                cf.f fVar = eVar4.f5043j;
                                if (eVar4.f5036a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f5036a);
                                    return;
                                }
                                fVar.f2496g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f5040f.invalidate();
                                eVar4.f5036a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f2498j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f5031b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f5036a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f5036a);
                                    return;
                                }
                                eVar22.f5043j.f2491a.b().removeView(eVar22.f5040f);
                                eVar22.f5042i = null;
                                eVar22.f5040f = null;
                                eVar22.f5041g = null;
                                g gVar = eVar22.f5039e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.f5039e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar = eVar22.h;
                                if (((f) jVar.f2318e) != null) {
                                    ((View) jVar.f2315a).setBackground(null);
                                    jVar.f2318e = null;
                                }
                                if (((f) jVar.d) == null && ((f) jVar.f2318e) == null && (bitmap2 = (Bitmap) jVar.f2317c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2317c = null;
                                }
                                eVar22.f5036a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f5047n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f5036a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f5036a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f5043j.f2496g.e(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f5036a = 2;
                                if (!eVar3.f5047n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                cf.f fVar = eVar4.f5043j;
                                if (eVar4.f5036a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f5036a);
                                    return;
                                }
                                fVar.f2496g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f5040f.invalidate();
                                eVar4.f5036a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f2498j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                j jVar = this.f5031b.h;
                if (((f) jVar.f2318e) != null) {
                    ((View) jVar.f2315a).setBackground(null);
                    jVar.f2318e = null;
                }
                if (((f) jVar.d) == null && ((f) jVar.f2318e) == null && (bitmap = (Bitmap) jVar.f2317c) != null) {
                    bitmap.recycle();
                    jVar.f2317c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z4);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z4);
                j jVar2 = this.f5031b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new ag.e(jVar2, 23));
                return;
            default:
                final e eVar3 = this.f5031b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f5036a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f5036a);
                                    return;
                                }
                                eVar22.f5043j.f2491a.b().removeView(eVar22.f5040f);
                                eVar22.f5042i = null;
                                eVar22.f5040f = null;
                                eVar22.f5041g = null;
                                g gVar = eVar22.f5039e;
                                if (gVar != null) {
                                    gVar.b();
                                    eVar22.f5039e = null;
                                }
                                g gVar2 = eVar22.d;
                                if (gVar2 != null) {
                                    gVar2.b();
                                    eVar22.d = null;
                                }
                                j jVar3 = eVar22.h;
                                if (((f) jVar3.f2318e) != null) {
                                    ((View) jVar3.f2315a).setBackground(null);
                                    jVar3.f2318e = null;
                                }
                                if (((f) jVar3.d) == null && ((f) jVar3.f2318e) == null && (bitmap2 = (Bitmap) jVar3.f2317c) != null) {
                                    bitmap2.recycle();
                                    jVar3.f2317c = null;
                                }
                                eVar22.f5036a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f5047n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f5036a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f5036a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.A();
                                eVar32.f5043j.f2496g.e(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f5036a = 2;
                                if (!eVar32.f5047n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                cf.f fVar = eVar4.f5043j;
                                if (eVar4.f5036a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f5036a);
                                    return;
                                }
                                fVar.f2496g.a(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f5040f.invalidate();
                                eVar4.f5036a = 4;
                                AndroidUtilities.doOnPreDraw(fVar.f2498j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
