package oh;

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
public final class z8 implements z3 {
    public final l6 f18010a;
    public final ArrayList f18011b;
    public final Context f18012c;
    public final i9 d;

    public z8(i9 i9Var, l6 l6Var, ArrayList arrayList, Context context) {
        this.d = i9Var;
        this.f18010a = l6Var;
        this.f18011b = arrayList;
        this.f18012c = context;
    }

    public final void a(int i10, long j10) {
        i9 i9Var = this.d;
        if (i9Var.G == i10 && i9Var.F == j10) {
            return;
        }
        i9Var.F = j10;
        i9Var.G = i10;
    }

    public final void b(boolean z4) {
        int i10;
        i9 i9Var = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = i9Var.f17268f;
        if (i9Var.f17257b) {
            if (!i9Var.f17260c) {
                if (z4) {
                    AndroidUtilities.requestAdjustNothing(p2Var.getParentActivity(), p2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = i9Var.f17292r;
        if (z4) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            i9Var.f17283n.updateViewLayout(i9Var.f17295s, layoutParams);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, e4 e4Var) {
        String uri2;
        String uri3;
        long j11;
        h9 h9Var;
        i9 i9Var = this.d;
        ArrayList arrayList = i9Var.J0;
        if (!i9Var.E0 && i9Var.R >= 0.9f) {
            Uri uri4 = i9Var.C0;
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
            boolean z4 = true;
            if (equals && (h9Var = i9Var.f17303w0) != null) {
                if (equals) {
                    i9Var.D0 = e4Var;
                    e4Var.f17022b = h9Var;
                    e4Var.f17021a = null;
                    h9Var.setSpeed(i9.f17252y1);
                    e4 e4Var2 = i9Var.D0;
                    e4Var2.f17025f = i9Var.f17303w0.firstFrameRendered;
                    e4Var2.d = i9Var.f17301v0;
                    e4Var2.f17024e = i9Var.f17307y0;
                    e4Var2.f17023c = i9Var.f17308z0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                i9Var.C0 = uri;
                qh.j3 j3Var = i9Var.A0;
                if (j3Var != null) {
                    j3Var.d(0L, null);
                }
                e1 e1Var = i9Var.f17305x0;
                if (e1Var != null) {
                    if (e1Var.f17009n) {
                        e1Var.s(null);
                    } else {
                        e1Var.e();
                    }
                    i9Var.f17305x0 = null;
                }
                h9 h9Var2 = i9Var.f17303w0;
                if (h9Var2 != null) {
                    h9Var2.release(null);
                    i9Var.f17303w0 = null;
                }
                e4 e4Var3 = i9Var.D0;
                if (e4Var3 != null) {
                    e4Var3.f17022b = null;
                    e4Var3.f17021a = null;
                    e4Var3.f17025f = false;
                    e4Var3.d = null;
                    e4Var3.f17024e = null;
                    e4Var3.f17023c = null;
                    e4Var3.a();
                    i9Var.D0 = null;
                }
                if (uri != null) {
                    i9Var.D0 = e4Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((h9) arrayList.get(i10)).uri.equals(uri)) {
                            i9Var.f17303w0 = (h9) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i9Var.f17303w0 == null) {
                        h9 h9Var3 = new h9(i9Var, i9Var.f17308z0, i9Var.f17307y0);
                        i9Var.f17303w0 = h9Var3;
                        h9Var3.document = document;
                    }
                    h9 h9Var4 = i9Var.f17303w0;
                    h9Var4.uri = uri;
                    h9Var4.setSpeed(i9.f17252y1);
                    e4 e4Var4 = i9Var.D0;
                    h9 h9Var5 = i9Var.f17303w0;
                    e4Var4.f17022b = h9Var5;
                    e4Var4.f17025f = false;
                    e4Var4.d = i9Var.f17301v0;
                    e4Var4.f17024e = i9Var.f17307y0;
                    e4Var4.f17023c = i9Var.f17308z0;
                    e4Var4.f17021a = null;
                    FileStreamLoadOperation.setPriorityForDocument(h9Var5.document, 3);
                    FileLoader.getInstance(i9Var.h).changePriority(3, i9Var.f17303w0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = i9Var.f17291q1;
                        if (j12 != 0) {
                            i9Var.D0.f17025f = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            i9Var.D0.f17022b.start(false, i9Var.w(), uri, j11, i9.A1, i9.f17252y1);
                            i9Var.D0.a();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    i9Var.D0.f17022b.start(false, i9Var.w(), uri, j11, i9.A1, i9.f17252y1);
                    i9Var.D0.a();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z4 = false;
            }
            i(false, z4);
            i9Var.f17291q1 = 0L;
            i9Var.P();
            return;
        }
        qh.j3 j3Var2 = i9Var.A0;
        if (j3Var2 != null) {
            j3Var2.d(0L, null);
        }
        e1 e1Var2 = i9Var.f17305x0;
        if (e1Var2 != null) {
            if (e1Var2.f17009n) {
                e1Var2.s(null);
            } else {
                e1Var2.e();
            }
            i9Var.f17305x0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + i9Var.E0 + ", " + i9Var.R);
        e4Var.f17025f = false;
        e4Var.f17022b = null;
        e4Var.f17021a = null;
    }

    public final void d(float f10) {
        i9 i9Var = this.d;
        if (i9Var.f17286o0 != f10) {
            i9Var.f17286o0 = f10;
            i9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f17278j1 = false;
    }

    public final void f(boolean z4) {
        h9 h9Var;
        i9 i9Var = this.d;
        if (!i9Var.f17262c1 && z4 && i9Var.f17273h0) {
            i9Var.f17273h0 = false;
            e4 e4Var = i9Var.D0;
            if (e4Var != null && (h9Var = e4Var.f17022b) != null) {
                h9Var.setSeeking(false);
            }
            f4 t6 = i9Var.t();
            if (t6 != null) {
                t6.invalidate();
            }
        }
        i9Var.f17262c1 = z4;
        i9Var.P();
    }

    public final void g(boolean z4) {
        i9 i9Var = this.d;
        i9Var.U0 = z4;
        i9Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z4, boolean z10) {
        int i10;
        int i11;
        i9 i9Var = this.d;
        qh.j3 j3Var = i9Var.A0;
        int i12 = 8;
        if (j3Var != null) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            j3Var.setVisibility(i11);
        }
        SurfaceView surfaceView = i9Var.f17308z0;
        if (surfaceView != null) {
            if (z4) {
                i10 = 8;
            } else if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            surfaceView.setVisibility(i10);
        }
        a9 a9Var = i9Var.f17307y0;
        if (a9Var != null) {
            if (!z4) {
                i12 = 0;
            }
            a9Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        i9 i9Var = this.d;
        l6 l6Var = this.f18010a;
        if (l6Var != null) {
            if (i9Var.f17279k0.f17696u0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(i9Var.f17279k0.f17696u0);
            if (i9Var.f17279k0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(i9Var.f17279k0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!i9Var.f17279k0.E(true)) {
                    i9Var.q(false);
                    return;
                }
                i9Var.f17279k0.D0 = new mh.p6(this, l6Var, arrayList, 10);
                return;
            }
            i9Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f18011b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(i9Var.f17279k0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!i9Var.f17279k0.E(true)) {
                i9Var.q(false);
                return;
            }
            i9Var.f17279k0.D0 = new bh.a(this, arrayList2, indexOf2, 15);
            return;
        }
        i9Var.q(false);
    }
}
