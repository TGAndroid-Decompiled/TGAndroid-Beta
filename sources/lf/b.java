package lf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.o;
import j$.util.Objects;
import jh.g;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
public final class b {
    public final int f11812a;
    public final e f11813b;

    public b(e eVar, int i10) {
        this.f11812a = i10;
        this.f11813b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f11812a) {
            case 0:
                final e eVar = this.f11813b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f11818a != 4) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f11818a);
                                    return;
                                }
                                eVar2.f11824j.f9863a.p().removeView(eVar2.f11821f);
                                eVar2.f11823i = null;
                                eVar2.f11821f = null;
                                eVar2.f11822g = null;
                                f fVar = eVar2.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                bh.d dVar = eVar2.h;
                                if (((g) dVar.e) != null) {
                                    ((View) dVar.f2777a).setBackground(null);
                                    dVar.e = null;
                                }
                                if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap2 = (Bitmap) dVar.f2779c) != null) {
                                    bitmap2.recycle();
                                    dVar.f2779c = null;
                                }
                                eVar2.f11818a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f11828n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f11818a != 1) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f11818a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.L();
                                eVar3.f11824j.f9867g.c(new o(w0.d, new b(eVar3, 2), 400L));
                                eVar3.f11818a = 2;
                                if (!eVar3.f11828n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                jf.f fVar3 = eVar4.f11824j;
                                if (eVar4.f11818a != 3) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f11818a);
                                    return;
                                }
                                fVar3.f9867g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                eVar4.f11821f.invalidate();
                                eVar4.f11818a = 4;
                                i0.K(fVar3.f9869j, new o(w0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f11813b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f11818a != 4) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f11818a);
                                    return;
                                }
                                eVar22.f11824j.f9863a.p().removeView(eVar22.f11821f);
                                eVar22.f11823i = null;
                                eVar22.f11821f = null;
                                eVar22.f11822g = null;
                                f fVar = eVar22.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                bh.d dVar = eVar22.h;
                                if (((g) dVar.e) != null) {
                                    ((View) dVar.f2777a).setBackground(null);
                                    dVar.e = null;
                                }
                                if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap2 = (Bitmap) dVar.f2779c) != null) {
                                    bitmap2.recycle();
                                    dVar.f2779c = null;
                                }
                                eVar22.f11818a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f11828n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f11818a != 1) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f11818a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.L();
                                eVar3.f11824j.f9867g.c(new o(w0.d, new b(eVar3, 2), 400L));
                                eVar3.f11818a = 2;
                                if (!eVar3.f11828n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                jf.f fVar3 = eVar4.f11824j;
                                if (eVar4.f11818a != 3) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f11818a);
                                    return;
                                }
                                fVar3.f9867g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                eVar4.f11821f.invalidate();
                                eVar4.f11818a = 4;
                                i0.K(fVar3.f9869j, new o(w0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                bh.d dVar = this.f11813b.h;
                if (((g) dVar.e) != null) {
                    ((View) dVar.f2777a).setBackground(null);
                    dVar.e = null;
                }
                if (((g) dVar.d) == null && ((g) dVar.e) == null && (bitmap = (Bitmap) dVar.f2779c) != null) {
                    bitmap.recycle();
                    dVar.f2779c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                bh.d dVar2 = this.f11813b.h;
                Objects.requireNonNull(dVar2);
                i0.g3(new gg.c(dVar2, 28));
                return;
            default:
                final e eVar3 = this.f11813b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f11818a != 4) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f11818a);
                                    return;
                                }
                                eVar22.f11824j.f9863a.p().removeView(eVar22.f11821f);
                                eVar22.f11823i = null;
                                eVar22.f11821f = null;
                                eVar22.f11822g = null;
                                f fVar = eVar22.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                bh.d dVar3 = eVar22.h;
                                if (((g) dVar3.e) != null) {
                                    ((View) dVar3.f2777a).setBackground(null);
                                    dVar3.e = null;
                                }
                                if (((g) dVar3.d) == null && ((g) dVar3.e) == null && (bitmap2 = (Bitmap) dVar3.f2779c) != null) {
                                    bitmap2.recycle();
                                    dVar3.f2779c = null;
                                }
                                eVar22.f11818a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f11828n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f11818a != 1) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f11818a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.L();
                                eVar32.f11824j.f9867g.c(new o(w0.d, new b(eVar32, 2), 400L));
                                eVar32.f11818a = 2;
                                if (!eVar32.f11828n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                jf.f fVar3 = eVar4.f11824j;
                                if (eVar4.f11818a != 3) {
                                    f8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f11818a);
                                    return;
                                }
                                fVar3.f9867g.g(new o(w0.d, new b(eVar4, 3), 400L));
                                eVar4.f11821f.invalidate();
                                eVar4.f11818a = 4;
                                i0.K(fVar3.f9869j, new o(w0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
