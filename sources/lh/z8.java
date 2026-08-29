package lh;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.tgnet.TLRPC;
public final class z8 implements x3 {
    public final k6 f16478a;
    public final ArrayList f16479b;
    public final Context f16480c;
    public final i9 d;

    public z8(i9 i9Var, k6 k6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.f16478a = k6Var;
        this.f16479b = arrayList;
        this.f16480c = context;
    }

    public final void a(int i10, long j10) {
        i9 i9Var = this.d;
        if (i9Var.F == i10 && i9Var.E == j10) {
            return;
        }
        i9Var.E = j10;
        i9Var.F = i10;
    }

    public final void b(boolean z10) {
        int i10;
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = i9Var.f15756f;
        if (i9Var.f15745b) {
            if (!i9Var.f15748c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(o2Var.getParentActivity(), o2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = i9Var.f15780r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            i9Var.f15771n.updateViewLayout(i9Var.f15783s, layoutParams);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, c4 c4Var) {
        String uri2;
        String uri3;
        long j11;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.I0;
        if (!i9Var.D0 && i9Var.Q >= 0.9f) {
            Uri uri4 = i9Var.B0;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            if (uri == null) {
                uri3 = null;
            } else {
                uri3 = uri.toString();
            }
            boolean equals = TextUtils.equals(uri2, uri3);
            boolean z10 = true;
            if (equals && (h9Var = i9Var.f15788v0) != null) {
                if (equals) {
                    i9Var.C0 = c4Var;
                    c4Var.f15427b = h9Var;
                    c4Var.f15426a = null;
                    h9Var.setSpeed(i9.f15739x1);
                    c4 c4Var2 = i9Var.C0;
                    c4Var2.f15430f = i9Var.f15788v0.firstFrameRendered;
                    c4Var2.d = i9Var.f15787u0;
                    c4Var2.f15429e = i9Var.f15792x0;
                    c4Var2.f15428c = i9Var.f15794y0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                i9Var.B0 = uri;
                nh.y3 y3Var = i9Var.f15795z0;
                if (y3Var != null) {
                    y3Var.d(0L, null);
                }
                d1 d1Var = i9Var.f15790w0;
                if (d1Var != null) {
                    if (d1Var.f15458n) {
                        d1Var.s(null);
                    } else {
                        d1Var.e();
                    }
                    i9Var.f15790w0 = null;
                }
                h9 h9Var2 = i9Var.f15788v0;
                if (h9Var2 != null) {
                    h9Var2.release(null);
                    i9Var.f15788v0 = null;
                }
                c4 c4Var3 = i9Var.C0;
                if (c4Var3 != null) {
                    c4Var3.f15427b = null;
                    c4Var3.f15426a = null;
                    c4Var3.f15430f = false;
                    c4Var3.d = null;
                    c4Var3.f15429e = null;
                    c4Var3.f15428c = null;
                    c4Var3.a();
                    i9Var.C0 = null;
                }
                if (uri != null) {
                    i9Var.C0 = c4Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((h9) arrayList.get(i10)).uri.equals(uri)) {
                            i9Var.f15788v0 = (h9) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i9Var.f15788v0 == null) {
                        h9 h9Var3 = new h9(i9Var, i9Var.f15794y0, i9Var.f15792x0);
                        i9Var.f15788v0 = h9Var3;
                        h9Var3.document = document;
                    }
                    h9 h9Var4 = i9Var.f15788v0;
                    h9Var4.uri = uri;
                    h9Var4.setSpeed(i9.f15739x1);
                    c4 c4Var4 = i9Var.C0;
                    h9 h9Var5 = i9Var.f15788v0;
                    c4Var4.f15427b = h9Var5;
                    c4Var4.f15430f = false;
                    c4Var4.d = i9Var.f15787u0;
                    c4Var4.f15429e = i9Var.f15792x0;
                    c4Var4.f15428c = i9Var.f15794y0;
                    c4Var4.f15426a = null;
                    FileStreamLoadOperation.setPriorityForDocument(h9Var5.document, 3);
                    FileLoader.getInstance(i9Var.h).changePriority(3, i9Var.f15788v0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = i9Var.f15777p1;
                        if (j12 != 0) {
                            i9Var.C0.f15430f = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            i9Var.C0.f15427b.start(false, i9Var.w(), uri, j11, i9.f15741z1, i9.f15739x1);
                            i9Var.C0.a();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    i9Var.C0.f15427b.start(false, i9Var.w(), uri, j11, i9.f15741z1, i9.f15739x1);
                    i9Var.C0.a();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            i9Var.f15777p1 = 0L;
            i9Var.P();
            return;
        }
        nh.y3 y3Var2 = i9Var.f15795z0;
        if (y3Var2 != null) {
            y3Var2.d(0L, null);
        }
        d1 d1Var2 = i9Var.f15790w0;
        if (d1Var2 != null) {
            if (d1Var2.f15458n) {
                d1Var2.s(null);
            } else {
                d1Var2.e();
            }
            i9Var.f15790w0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + i9Var.D0 + ", " + i9Var.Q);
        c4Var.f15430f = false;
        c4Var.f15427b = null;
        c4Var.f15426a = null;
    }

    public final void d(float f9) {
        i9 i9Var = this.d;
        if (i9Var.f15772n0 != f9) {
            i9Var.f15772n0 = f9;
            i9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f15764i1 = false;
    }

    public final void f(boolean z10) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.f15747b1 && z10 && i9Var.f15759g0) {
            i9Var.f15759g0 = false;
            c4 c4Var = i9Var.C0;
            if (c4Var != null && (h9Var = c4Var.f15427b) != null) {
                h9Var.setSeeking(false);
            }
            d4 t10 = i9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        i9Var.f15747b1 = z10;
        i9Var.P();
    }

    public final void g(boolean z10) {
        i9 i9Var = this.d;
        i9Var.T0 = z10;
        i9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        i9 i9Var = this.d;
        nh.y3 y3Var = i9Var.f15795z0;
        int i12 = 8;
        if (y3Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y3Var.setVisibility(i11);
        }
        SurfaceView surfaceView = i9Var.f15794y0;
        if (surfaceView != null) {
            if (z10) {
                i10 = 8;
            } else if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            surfaceView.setVisibility(i10);
        }
        a9 a9Var = i9Var.f15792x0;
        if (a9Var != null) {
            if (!z10) {
                i12 = 0;
            }
            a9Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        i9 i9Var = this.d;
        k6 k6Var = this.f16478a;
        if (k6Var != null) {
            if (i9Var.f15765j0.f16179t0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(i9Var.f15765j0.f16179t0);
            if (i9Var.f15765j0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(i9Var.f15765j0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!i9Var.f15765j0.E(true)) {
                    i9Var.q(false);
                    return;
                }
                i9Var.f15765j0.C0 = new l3.m(this, k6Var, arrayList, 8);
                return;
            }
            i9Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f16479b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(i9Var.f15765j0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!i9Var.f15765j0.E(true)) {
                i9Var.q(false);
                return;
            }
            i9Var.f15765j0.C0 = new ag.v0(this, arrayList2, indexOf2, 12);
            return;
        }
        i9Var.q(false);
    }
}
