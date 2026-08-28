package ih;

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
public final class d9 implements c4 {
    public final n6 f11341a;
    public final ArrayList f11342b;
    public final Context f11343c;
    public final m9 d;

    public d9(m9 m9Var, n6 n6Var, ArrayList arrayList, Context context) {
        this.d = m9Var;
        this.f11341a = n6Var;
        this.f11342b = arrayList;
        this.f11343c = context;
    }

    public final void a(int i9, long j10) {
        m9 m9Var = this.d;
        if (m9Var.F == i9 && m9Var.E == j10) {
            return;
        }
        m9Var.E = j10;
        m9Var.F = i9;
    }

    public final void b(boolean z10) {
        int i9;
        m9 m9Var = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = m9Var.f11797f;
        if (m9Var.f11786b) {
            if (!m9Var.f11789c) {
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
        WindowManager.LayoutParams layoutParams = m9Var.f11821r;
        if (z10) {
            i9 = 48;
        } else {
            i9 = 16;
        }
        layoutParams.softInputMode = i9;
        try {
            m9Var.f11812n.updateViewLayout(m9Var.f11824s, layoutParams);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, h4 h4Var) {
        String uri2;
        String uri3;
        long j11;
        l9 l9Var;
        m9 m9Var = this.d;
        ArrayList arrayList = m9Var.I0;
        if (!m9Var.D0 && m9Var.Q >= 0.9f) {
            Uri uri4 = m9Var.B0;
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
            if (equals && (l9Var = m9Var.f11829v0) != null) {
                if (equals) {
                    m9Var.C0 = h4Var;
                    h4Var.f11501b = l9Var;
                    h4Var.f11500a = null;
                    l9Var.setSpeed(m9.f11780x1);
                    h4 h4Var2 = m9Var.C0;
                    h4Var2.f11504f = m9Var.f11829v0.firstFrameRendered;
                    h4Var2.d = m9Var.f11828u0;
                    h4Var2.f11503e = m9Var.f11833x0;
                    h4Var2.f11502c = m9Var.f11835y0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                m9Var.B0 = uri;
                kh.d4 d4Var = m9Var.f11836z0;
                if (d4Var != null) {
                    d4Var.d(0L, null);
                }
                f1 f1Var = m9Var.f11831w0;
                if (f1Var != null) {
                    if (f1Var.f11403n) {
                        f1Var.s(null);
                    } else {
                        f1Var.e();
                    }
                    m9Var.f11831w0 = null;
                }
                l9 l9Var2 = m9Var.f11829v0;
                if (l9Var2 != null) {
                    l9Var2.release(null);
                    m9Var.f11829v0 = null;
                }
                h4 h4Var3 = m9Var.C0;
                if (h4Var3 != null) {
                    h4Var3.f11501b = null;
                    h4Var3.f11500a = null;
                    h4Var3.f11504f = false;
                    h4Var3.d = null;
                    h4Var3.f11503e = null;
                    h4Var3.f11502c = null;
                    h4Var3.a();
                    m9Var.C0 = null;
                }
                if (uri != null) {
                    m9Var.C0 = h4Var;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        } else if (((l9) arrayList.get(i9)).uri.equals(uri)) {
                            m9Var.f11829v0 = (l9) arrayList.remove(i9);
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (m9Var.f11829v0 == null) {
                        l9 l9Var3 = new l9(m9Var, m9Var.f11835y0, m9Var.f11833x0);
                        m9Var.f11829v0 = l9Var3;
                        l9Var3.document = document;
                    }
                    l9 l9Var4 = m9Var.f11829v0;
                    l9Var4.uri = uri;
                    l9Var4.setSpeed(m9.f11780x1);
                    h4 h4Var4 = m9Var.C0;
                    l9 l9Var5 = m9Var.f11829v0;
                    h4Var4.f11501b = l9Var5;
                    h4Var4.f11504f = false;
                    h4Var4.d = m9Var.f11828u0;
                    h4Var4.f11503e = m9Var.f11833x0;
                    h4Var4.f11502c = m9Var.f11835y0;
                    h4Var4.f11500a = null;
                    FileStreamLoadOperation.setPriorityForDocument(l9Var5.document, 3);
                    FileLoader.getInstance(m9Var.h).changePriority(3, m9Var.f11829v0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = m9Var.f11818p1;
                        if (j12 != 0) {
                            m9Var.C0.f11504f = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            m9Var.C0.f11501b.start(false, m9Var.w(), uri, j11, m9.f11782z1, m9.f11780x1);
                            m9Var.C0.a();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    m9Var.C0.f11501b.start(false, m9Var.w(), uri, j11, m9.f11782z1, m9.f11780x1);
                    m9Var.C0.a();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            m9Var.f11818p1 = 0L;
            m9Var.P();
            return;
        }
        kh.d4 d4Var2 = m9Var.f11836z0;
        if (d4Var2 != null) {
            d4Var2.d(0L, null);
        }
        f1 f1Var2 = m9Var.f11831w0;
        if (f1Var2 != null) {
            if (f1Var2.f11403n) {
                f1Var2.s(null);
            } else {
                f1Var2.e();
            }
            m9Var.f11831w0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + m9Var.D0 + ", " + m9Var.Q);
        h4Var.f11504f = false;
        h4Var.f11501b = null;
        h4Var.f11500a = null;
    }

    public final void d(float f10) {
        m9 m9Var = this.d;
        if (m9Var.f11813n0 != f10) {
            m9Var.f11813n0 = f10;
            m9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f11805i1 = false;
    }

    public final void f(boolean z10) {
        l9 l9Var;
        m9 m9Var = this.d;
        if (!m9Var.f11788b1 && z10 && m9Var.f11800g0) {
            m9Var.f11800g0 = false;
            h4 h4Var = m9Var.C0;
            if (h4Var != null && (l9Var = h4Var.f11501b) != null) {
                l9Var.setSeeking(false);
            }
            i4 t10 = m9Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        m9Var.f11788b1 = z10;
        m9Var.P();
    }

    public final void g(boolean z10) {
        m9 m9Var = this.d;
        m9Var.T0 = z10;
        m9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i9;
        int i10;
        m9 m9Var = this.d;
        kh.d4 d4Var = m9Var.f11836z0;
        int i11 = 8;
        if (d4Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d4Var.setVisibility(i10);
        }
        SurfaceView surfaceView = m9Var.f11835y0;
        if (surfaceView != null) {
            if (z10) {
                i9 = 8;
            } else if (z11) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            surfaceView.setVisibility(i9);
        }
        e9 e9Var = m9Var.f11833x0;
        if (e9Var != null) {
            if (!z10) {
                i11 = 0;
            }
            e9Var.setVisibility(i11);
        }
    }

    public final void j() {
        int indexOf;
        m9 m9Var = this.d;
        n6 n6Var = this.f11341a;
        if (n6Var != null) {
            if (m9Var.f11806j0.f12203t0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(m9Var.f11806j0.f12203t0);
            if (m9Var.f11806j0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(m9Var.f11806j0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!m9Var.f11806j0.E(true)) {
                    m9Var.q(false);
                    return;
                }
                m9Var.f11806j0.C0 = new h3(this, n6Var, arrayList, 6);
                return;
            }
            m9Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f11342b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(m9Var.f11806j0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!m9Var.f11806j0.E(true)) {
                m9Var.q(false);
                return;
            }
            m9Var.f11806j0.C0 = new d5.i(this, arrayList2, indexOf2, 10);
            return;
        }
        m9Var.q(false);
    }
}
