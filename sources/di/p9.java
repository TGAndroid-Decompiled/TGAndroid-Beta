package di;

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
public final class p9 implements j4 {
    public final z6 f8931a;
    public final ArrayList f8932b;
    public final Context f8933c;
    public final y9 d;

    public p9(y9 y9Var, z6 z6Var, ArrayList arrayList, Context context) {
        this.d = y9Var;
        this.f8931a = z6Var;
        this.f8932b = arrayList;
        this.f8933c = context;
    }

    public final void a(int i10, long j10) {
        y9 y9Var = this.d;
        if (y9Var.J == i10 && y9Var.I == j10) {
            return;
        }
        y9Var.I = j10;
        y9Var.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        y9 y9Var = this.d;
        org.telegram.ui.ActionBar.r2 r2Var = y9Var.f9428f;
        if (y9Var.f9418b) {
            if (!y9Var.f9421c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(r2Var.getParentActivity(), r2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = y9Var.f9452r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            y9Var.f9443n.updateViewLayout(y9Var.f9455s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, p4 p4Var) {
        String uri2;
        String uri3;
        long j11;
        x9 x9Var;
        y9 y9Var = this.d;
        ArrayList arrayList = y9Var.M0;
        if (!y9Var.H0 && y9Var.U >= 0.9f) {
            Uri uri4 = y9Var.F0;
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
            if (equals && (x9Var = y9Var.f9471z0) != null) {
                if (equals) {
                    y9Var.G0 = p4Var;
                    p4Var.f8901c = x9Var;
                    p4Var.f8900b = null;
                    x9Var.setSpeed(y9.B1);
                    p4 p4Var2 = y9Var.G0;
                    p4Var2.f8899a = y9Var.f9471z0.firstFrameRendered;
                    p4Var2.e = y9Var.f9470y0;
                    p4Var2.f8902f = y9Var.B0;
                    p4Var2.d = y9Var.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                y9Var.F0 = uri;
                fi.b4 b4Var = y9Var.D0;
                if (b4Var != null) {
                    b4Var.d(0L, null);
                }
                h1 h1Var = y9Var.A0;
                if (h1Var != null) {
                    if (h1Var.f8607n) {
                        h1Var.s(null);
                    } else {
                        h1Var.e();
                    }
                    y9Var.A0 = null;
                }
                x9 x9Var2 = y9Var.f9471z0;
                if (x9Var2 != null) {
                    x9Var2.release(null);
                    y9Var.f9471z0 = null;
                }
                p4 p4Var3 = y9Var.G0;
                if (p4Var3 != null) {
                    p4Var3.f8901c = null;
                    p4Var3.f8900b = null;
                    p4Var3.f8899a = false;
                    p4Var3.e = null;
                    p4Var3.f8902f = null;
                    p4Var3.d = null;
                    p4Var3.b();
                    y9Var.G0 = null;
                }
                if (uri != null) {
                    y9Var.G0 = p4Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((x9) arrayList.get(i10)).uri.equals(uri)) {
                            y9Var.f9471z0 = (x9) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (y9Var.f9471z0 == null) {
                        x9 x9Var3 = new x9(y9Var, y9Var.C0, y9Var.B0);
                        y9Var.f9471z0 = x9Var3;
                        x9Var3.document = document;
                    }
                    x9 x9Var4 = y9Var.f9471z0;
                    x9Var4.uri = uri;
                    x9Var4.setSpeed(y9.B1);
                    p4 p4Var4 = y9Var.G0;
                    x9 x9Var5 = y9Var.f9471z0;
                    p4Var4.f8901c = x9Var5;
                    p4Var4.f8899a = false;
                    p4Var4.e = y9Var.f9470y0;
                    p4Var4.f8902f = y9Var.B0;
                    p4Var4.d = y9Var.C0;
                    p4Var4.f8900b = null;
                    FileStreamLoadOperation.setPriorityForDocument(x9Var5.document, 3);
                    FileLoader.getInstance(y9Var.h).changePriority(3, y9Var.f9471z0.document, null, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = y9Var.f9459t1;
                        if (j12 != 0) {
                            y9Var.G0.f8899a = true;
                            j11 = j12;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((x9) y9Var.G0.f8901c).start(false, y9Var.x(), uri, j11, y9.D1, y9.B1);
                            y9Var.G0.b();
                        }
                    }
                    j11 = j10;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((x9) y9Var.G0.f8901c).start(false, y9Var.x(), uri, j11, y9.D1, y9.B1);
                    y9Var.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            y9Var.f9459t1 = 0L;
            y9Var.Q();
            return;
        }
        fi.b4 b4Var2 = y9Var.D0;
        if (b4Var2 != null) {
            b4Var2.d(0L, null);
        }
        h1 h1Var2 = y9Var.A0;
        if (h1Var2 != null) {
            if (h1Var2.f8607n) {
                h1Var2.s(null);
            } else {
                h1Var2.e();
            }
            y9Var.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + y9Var.H0 + ", " + y9Var.U);
        p4Var.f8899a = false;
        p4Var.f8901c = null;
        p4Var.f8900b = null;
    }

    public final void d(float f7) {
        y9 y9Var = this.d;
        if (y9Var.f9453r0 != f7) {
            y9Var.f9453r0 = f7;
            y9Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f9442m1 = false;
    }

    public final void f(boolean z10) {
        x9 x9Var;
        y9 y9Var = this.d;
        if (!y9Var.f9430f1 && z10 && y9Var.f9439k0) {
            y9Var.f9439k0 = false;
            p4 p4Var = y9Var.G0;
            if (p4Var != null && (x9Var = (x9) p4Var.f8901c) != null) {
                x9Var.setSeeking(false);
            }
            q4 u10 = y9Var.u();
            if (u10 != null) {
                u10.invalidate();
            }
        }
        y9Var.f9430f1 = z10;
        y9Var.Q();
    }

    public final void g(boolean z10) {
        y9 y9Var = this.d;
        y9Var.X0 = z10;
        y9Var.Q();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        y9 y9Var = this.d;
        fi.b4 b4Var = y9Var.D0;
        int i12 = 8;
        if (b4Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b4Var.setVisibility(i11);
        }
        SurfaceView surfaceView = y9Var.C0;
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
        q9 q9Var = y9Var.B0;
        if (q9Var != null) {
            if (!z10) {
                i12 = 0;
            }
            q9Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        y9 y9Var = this.d;
        z6 z6Var = this.f8931a;
        if (z6Var != null) {
            if (y9Var.f9444n0.f8563x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(y9Var.f9444n0.f8563x0);
            if (y9Var.f9444n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(y9Var.f9444n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!y9Var.f9444n0.E(true)) {
                    y9Var.q(false);
                    return;
                }
                y9Var.f9444n0.G0 = new a3.l0(this, z6Var, arrayList, 27);
                return;
            }
            y9Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f8932b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(y9Var.f9444n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!y9Var.f9444n0.E(true)) {
                y9Var.q(false);
                return;
            }
            y9Var.f9444n0.G0 = new ai.h0(this, arrayList2, indexOf2, 8);
            return;
        }
        y9Var.q(false);
    }
}
