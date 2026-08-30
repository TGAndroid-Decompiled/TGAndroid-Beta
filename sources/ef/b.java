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
    public final int f5188a;
    public final f f5189b;

    public b(f fVar, int i10) {
        this.f5188a = i10;
        this.f5189b = fVar;
    }

    public final void a(boolean z4) {
        Bitmap bitmap;
        switch (this.f5188a) {
            case 0:
                final f fVar = this.f5189b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                f fVar2 = fVar;
                                if (fVar2.f5196a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar2.f5196a);
                                    return;
                                }
                                fVar2.f5202j.f2295a.b().removeView(fVar2.f5199f);
                                fVar2.f5201i = null;
                                fVar2.f5199f = null;
                                fVar2.f5200g = null;
                                h hVar = fVar2.e;
                                if (hVar != null) {
                                    hVar.b();
                                    fVar2.e = null;
                                }
                                h hVar2 = fVar2.d;
                                if (hVar2 != null) {
                                    hVar2.b();
                                    fVar2.d = null;
                                }
                                j jVar = fVar2.h;
                                if (((g) jVar.e) != null) {
                                    ((View) jVar.f2129a).setBackground(null);
                                    jVar.e = null;
                                }
                                if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap2 = (Bitmap) jVar.f2131c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2131c = null;
                                }
                                fVar2.f5196a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (fVar2.f5206n) {
                                    fVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                f fVar3 = fVar;
                                if (fVar3.f5196a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar3.f5196a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                fVar3.h.A();
                                fVar3.f5202j.f2299g.e(new p(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
                                fVar3.f5196a = 2;
                                if (!fVar3.f5206n) {
                                    fVar3.h();
                                    return;
                                }
                                return;
                            default:
                                f fVar4 = fVar;
                                cf.f fVar5 = fVar4.f5202j;
                                if (fVar4.f5196a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.f5196a);
                                    return;
                                }
                                fVar5.f2299g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                fVar4.f5199f.invalidate();
                                fVar4.f5196a = 4;
                                AndroidUtilities.doOnPreDraw(fVar5.f2301j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final f fVar2 = this.f5189b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                f fVar22 = fVar2;
                                if (fVar22.f5196a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar22.f5196a);
                                    return;
                                }
                                fVar22.f5202j.f2295a.b().removeView(fVar22.f5199f);
                                fVar22.f5201i = null;
                                fVar22.f5199f = null;
                                fVar22.f5200g = null;
                                h hVar = fVar22.e;
                                if (hVar != null) {
                                    hVar.b();
                                    fVar22.e = null;
                                }
                                h hVar2 = fVar22.d;
                                if (hVar2 != null) {
                                    hVar2.b();
                                    fVar22.d = null;
                                }
                                j jVar = fVar22.h;
                                if (((g) jVar.e) != null) {
                                    ((View) jVar.f2129a).setBackground(null);
                                    jVar.e = null;
                                }
                                if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap2 = (Bitmap) jVar.f2131c) != null) {
                                    bitmap2.recycle();
                                    jVar.f2131c = null;
                                }
                                fVar22.f5196a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (fVar22.f5206n) {
                                    fVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                f fVar3 = fVar2;
                                if (fVar3.f5196a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar3.f5196a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                fVar3.h.A();
                                fVar3.f5202j.f2299g.e(new p(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
                                fVar3.f5196a = 2;
                                if (!fVar3.f5206n) {
                                    fVar3.h();
                                    return;
                                }
                                return;
                            default:
                                f fVar4 = fVar2;
                                cf.f fVar5 = fVar4.f5202j;
                                if (fVar4.f5196a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.f5196a);
                                    return;
                                }
                                fVar5.f2299g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                fVar4.f5199f.invalidate();
                                fVar4.f5196a = 4;
                                AndroidUtilities.doOnPreDraw(fVar5.f2301j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                j jVar = this.f5189b.h;
                if (((g) jVar.e) != null) {
                    ((View) jVar.f2129a).setBackground(null);
                    jVar.e = null;
                }
                if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap = (Bitmap) jVar.f2131c) != null) {
                    bitmap.recycle();
                    jVar.f2131c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z4);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z4);
                j jVar2 = this.f5189b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new e(jVar2, 0));
                return;
            default:
                final f fVar3 = this.f5189b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                f fVar22 = fVar3;
                                if (fVar22.f5196a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar22.f5196a);
                                    return;
                                }
                                fVar22.f5202j.f2295a.b().removeView(fVar22.f5199f);
                                fVar22.f5201i = null;
                                fVar22.f5199f = null;
                                fVar22.f5200g = null;
                                h hVar = fVar22.e;
                                if (hVar != null) {
                                    hVar.b();
                                    fVar22.e = null;
                                }
                                h hVar2 = fVar22.d;
                                if (hVar2 != null) {
                                    hVar2.b();
                                    fVar22.d = null;
                                }
                                j jVar3 = fVar22.h;
                                if (((g) jVar3.e) != null) {
                                    ((View) jVar3.f2129a).setBackground(null);
                                    jVar3.e = null;
                                }
                                if (((g) jVar3.d) == null && ((g) jVar3.e) == null && (bitmap2 = (Bitmap) jVar3.f2131c) != null) {
                                    bitmap2.recycle();
                                    jVar3.f2131c = null;
                                }
                                fVar22.f5196a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (fVar22.f5206n) {
                                    fVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                f fVar32 = fVar3;
                                if (fVar32.f5196a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar32.f5196a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                fVar32.h.A();
                                fVar32.f5202j.f2299g.e(new p(ApplicationLoader.applicationHandler, new b(fVar32, 2), 400L));
                                fVar32.f5196a = 2;
                                if (!fVar32.f5206n) {
                                    fVar32.h();
                                    return;
                                }
                                return;
                            default:
                                f fVar4 = fVar3;
                                cf.f fVar5 = fVar4.f5202j;
                                if (fVar4.f5196a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.f5196a);
                                    return;
                                }
                                fVar5.f2299g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                fVar4.f5199f.invalidate();
                                fVar4.f5196a = 4;
                                AndroidUtilities.doOnPreDraw(fVar5.f2301j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
