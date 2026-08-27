package af;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class b {

    public final int f250a;

    public final f f251b;

    public b(f fVar, int i10) {
        this.f250a = i10;
        this.f251b = fVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f250a) {
            case 0:
                final int i10 = 2;
                final f fVar = this.f251b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                f fVar2 = fVar;
                                if (fVar2.f258a == 4) {
                                    fVar2.f265j.f49860a.b().removeView(fVar2.f262f);
                                    fVar2.f264i = null;
                                    fVar2.f262f = null;
                                    fVar2.f263g = null;
                                    i iVar = fVar2.f261e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar2.f261e = null;
                                    }
                                    i iVar2 = fVar2.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar2.d = null;
                                    }
                                    h hVar = fVar2.h;
                                    if (((g) hVar.f277e) != null) {
                                        ((View) hVar.f274a).setBackground(null);
                                        hVar.f277e = null;
                                    }
                                    if (((g) hVar.d) == null && ((g) hVar.f277e) == null && (bitmap2 = (Bitmap) hVar.f276c) != null) {
                                        bitmap2.recycle();
                                        hVar.f276c = null;
                                    }
                                    fVar2.f258a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar2.f269n) {
                                        fVar2.g();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar2.f258a);
                                }
                                break;
                            case 1:
                                f fVar3 = fVar;
                                if (fVar3.f258a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar3.h.B();
                                    fVar3.f265j.f49865g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
                                    fVar3.f258a = 2;
                                    if (!fVar3.f269n) {
                                        fVar3.h();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar3.f258a);
                                }
                                break;
                            default:
                                f fVar4 = fVar;
                                ye.d dVar = fVar4.f265j;
                                if (fVar4.f258a == 3) {
                                    dVar.f49865g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f262f.invalidate();
                                    fVar4.f258a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.f49867j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.f258a);
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final f fVar2 = this.f251b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                f fVar3 = fVar2;
                                if (fVar3.f258a == 4) {
                                    fVar3.f265j.f49860a.b().removeView(fVar3.f262f);
                                    fVar3.f264i = null;
                                    fVar3.f262f = null;
                                    fVar3.f263g = null;
                                    i iVar = fVar3.f261e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar3.f261e = null;
                                    }
                                    i iVar2 = fVar3.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar3.d = null;
                                    }
                                    h hVar = fVar3.h;
                                    if (((g) hVar.f277e) != null) {
                                        ((View) hVar.f274a).setBackground(null);
                                        hVar.f277e = null;
                                    }
                                    if (((g) hVar.d) == null && ((g) hVar.f277e) == null && (bitmap2 = (Bitmap) hVar.f276c) != null) {
                                        bitmap2.recycle();
                                        hVar.f276c = null;
                                    }
                                    fVar3.f258a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar3.f269n) {
                                        fVar3.g();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar3.f258a);
                                }
                                break;
                            case 1:
                                f fVar4 = fVar2;
                                if (fVar4.f258a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar4.h.B();
                                    fVar4.f265j.f49865g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 2), 400L));
                                    fVar4.f258a = 2;
                                    if (!fVar4.f269n) {
                                        fVar4.h();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar4.f258a);
                                }
                                break;
                            default:
                                f fVar5 = fVar2;
                                ye.d dVar = fVar5.f265j;
                                if (fVar5.f258a == 3) {
                                    dVar.f49865g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar5, 3), 400L));
                                    fVar5.f262f.invalidate();
                                    fVar5.f258a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.f49867j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar5, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar5.f258a);
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                h hVar = this.f251b.h;
                if (((g) hVar.f277e) != null) {
                    ((View) hVar.f274a).setBackground(null);
                    hVar.f277e = null;
                }
                if (((g) hVar.d) == null && ((g) hVar.f277e) == null && (bitmap = (Bitmap) hVar.f276c) != null) {
                    bitmap.recycle();
                    hVar.f276c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                h hVar2 = this.f251b.h;
                Objects.requireNonNull(hVar2);
                AndroidUtilities.runOnUIThread(new e(hVar2, 0));
                break;
            default:
                final int i12 = 0;
                final f fVar3 = this.f251b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i12) {
                            case 0:
                                f fVar4 = fVar3;
                                if (fVar4.f258a == 4) {
                                    fVar4.f265j.f49860a.b().removeView(fVar4.f262f);
                                    fVar4.f264i = null;
                                    fVar4.f262f = null;
                                    fVar4.f263g = null;
                                    i iVar = fVar4.f261e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar4.f261e = null;
                                    }
                                    i iVar2 = fVar4.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar4.d = null;
                                    }
                                    h hVar3 = fVar4.h;
                                    if (((g) hVar3.f277e) != null) {
                                        ((View) hVar3.f274a).setBackground(null);
                                        hVar3.f277e = null;
                                    }
                                    if (((g) hVar3.d) == null && ((g) hVar3.f277e) == null && (bitmap2 = (Bitmap) hVar3.f276c) != null) {
                                        bitmap2.recycle();
                                        hVar3.f276c = null;
                                    }
                                    fVar4.f258a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar4.f269n) {
                                        fVar4.g();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar4.f258a);
                                }
                                break;
                            case 1:
                                f fVar5 = fVar3;
                                if (fVar5.f258a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar5.h.B();
                                    fVar5.f265j.f49865g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar5, 2), 400L));
                                    fVar5.f258a = 2;
                                    if (!fVar5.f269n) {
                                        fVar5.h();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar5.f258a);
                                }
                                break;
                            default:
                                f fVar6 = fVar3;
                                ye.d dVar = fVar6.f265j;
                                if (fVar6.f258a == 3) {
                                    dVar.f49865g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar6, 3), 400L));
                                    fVar6.f262f.invalidate();
                                    fVar6.f258a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.f49867j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar6, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar6.f258a);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
