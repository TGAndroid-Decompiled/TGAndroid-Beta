package kh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class n2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int C = 1;
    public pf.h A;
    public Utilities.CallbackReturn B;
    public String f15733b;
    public int f15734c;
    public final h1 d;
    public final i1 f15735e;
    public final j1 f15736f;
    public final m2 h;
    public float f15737n;
    public final boolean f15738r;
    public final boolean f15739s;
    public boolean v;
    public yf.w0 f15740w;
    public float f15741x;
    public Utilities.Callback3Return f15742y;

    public n2(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context, b6Var, true, false);
        int i9;
        this.f15733b = null;
        this.f15734c = -1;
        this.d = new TLRPC.Document();
        this.f15735e = new TLRPC.Document();
        this.f15737n = -1.0f;
        this.f15738r = z10;
        this.f15739s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new l1(this, context);
        j1 j1Var = new j1(this, context, 0);
        this.f15736f = j1Var;
        if (z10) {
            i9 = 0;
        } else {
            i9 = C;
        }
        j1Var.f31033b = i9;
        j1Var.setAdapter(new k1(this, z10, context));
        this.containerView.addView(j1Var, g7.e6.e(-1, -1, 87));
        new b4(this.containerView, false, new e1(this, 0));
        if (!z10) {
            m2 m2Var = new m2(context);
            this.h = m2Var;
            m2Var.C = new e1(this, 1);
            m2Var.B = j1Var.f31033b;
            m2Var.invalidate();
            this.containerView.addView(m2Var, g7.e6.e(-1, -2, 87));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        FileLog.disableGson(true);
        if (!z10) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        }
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(7, false, true, false);
    }

    public static int D(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static int E(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static int G(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.b6 H(n2 n2Var) {
        return n2Var.resourcesProvider;
    }

    public static int S(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static int U(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static int V(n2 n2Var) {
        return n2Var.currentAccount;
    }

    public static ViewGroup a0(n2 n2Var) {
        return n2Var.containerView;
    }

    public static void m(n2 n2Var) {
        boolean z10 = n2Var.v;
        boolean z11 = n2Var.keyboardVisible;
        if (z10 != z11) {
            n2Var.v = z11;
            n2Var.container.clearAnimation();
            float f10 = 0.0f;
            if (n2Var.keyboardVisible) {
                int i9 = AndroidUtilities.displaySize.y;
                int i10 = n2Var.keyboardHeight;
                f10 = Math.min(0.0f, Math.max(((i9 - i10) * 0.3f) - n2Var.f15741x, (-i10) / 3.0f));
            }
            n2Var.container.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23713w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f15736f.getTranslationY() >= ((int) this.f15737n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        View[] viewPages;
        if (i9 == NotificationCenter.stickersDidLoad || i9 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f15736f.getViewPages()) {
                if (view instanceof b2) {
                    b2 b2Var = (b2) view;
                    if (i9 == NotificationCenter.groupStickersDidLoad || ((b2Var.f16337a == 0 && ((Integer) objArr[0]).intValue() == 5) || (b2Var.f16337a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        a2 a2Var = b2Var.f14983c;
                        if (a2Var.D == null) {
                            a2Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        n0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.f15736f.getY());
    }

    public boolean k0(Integer num) {
        return true;
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(bg.c2 c2Var) {
        return true;
    }

    public final void n0() {
        View[] viewPages;
        g2 g2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23713w).start();
        for (View view : this.f15736f.getViewPages()) {
            if (view instanceof b2) {
                g2 g2Var2 = ((b2) view).f14985f;
                if (g2Var2 != null) {
                    AndroidUtilities.hideKeyboard(g2Var2.d);
                }
            } else if ((view instanceof w1) && (g2Var = ((w1) view).d) != null) {
                AndroidUtilities.hideKeyboard(g2Var.d);
            }
        }
    }

    public final void o0(int i9) {
        if (k0(Integer.valueOf(i9))) {
            if ((i9 != 1 || m0(new bg.c2(this, i9, 9))) && ((Boolean) this.B.run(Integer.valueOf(i9))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void p0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.B = callbackReturn;
        for (View view : this.f15736f.getViewPages()) {
            if (view instanceof b2) {
                a2 a2Var = ((b2) view).f14983c;
                if (a2Var.D == null) {
                    a2Var.D(null);
                }
            }
        }
    }
}
