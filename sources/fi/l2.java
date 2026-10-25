package fi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
public class l2 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static int H = 1;
    public Utilities.Callback3Return E;
    public jg.g F;
    public Utilities.CallbackReturn G;
    public String f11156b;
    public int f11157c;
    public final f1 d;
    public final g1 e;
    public final h1 f11158f;
    public final k2 h;
    public float f11159n;
    public final boolean f11160r;
    public final boolean f11161s;
    public boolean v;
    public int f11162w;
    public ai.e f11163x;
    public float f11164y;

    public l2(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(1, context, u6Var, true);
        int i10;
        this.f11156b = null;
        this.f11157c = -1;
        this.d = new TLRPC.Document();
        this.e = new TLRPC.Document();
        this.f11159n = -1.0f;
        this.f11160r = z10;
        this.f11161s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, u6Var));
        this.f11162w = this.navBarColor;
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new j1(this, context);
        h1 h1Var = new h1(this, context, 0);
        this.f11158f = h1Var;
        if (z10) {
            i10 = 0;
        } else {
            i10 = H;
        }
        h1Var.f33314b = i10;
        h1Var.setAdapter(new i1(this, z10, context));
        this.containerView.addView(h1Var, gb1.i(-1, -1, 87));
        new z3(this.containerView, false, new d1(this, 0));
        if (!z10) {
            k2 k2Var = new k2(context);
            this.h = k2Var;
            k2Var.G = new d1(this, 1);
            k2Var.F = h1Var.f33314b;
            k2Var.invalidate();
            this.containerView.addView(k2Var, gb1.i(-1, -2, 87));
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

    public static int D(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static int F(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static boolean G(l2 l2Var) {
        return l2Var.keyboardVisible;
    }

    public static int H(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.u6 I(l2 l2Var) {
        return l2Var.resourcesProvider;
    }

    public static ViewGroup J(l2 l2Var) {
        return l2Var.containerView;
    }

    public static boolean K(l2 l2Var) {
        return l2Var.keyboardVisible;
    }

    public static int V(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static int X(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static int Y(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static int Z(l2 l2Var) {
        return l2Var.currentAccount;
    }

    public static ViewGroup d0(l2 l2Var) {
        return l2Var.containerView;
    }

    public static void m(l2 l2Var) {
        boolean z10 = l2Var.v;
        boolean z11 = l2Var.keyboardVisible;
        if (z10 != z11) {
            l2Var.v = z11;
            l2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (l2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = l2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - l2Var.f11164y, (-i11) / 3.0f));
            }
            l2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f22961w).start();
        }
    }

    public static ViewGroup t(l2 l2Var) {
        return l2Var.containerView;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f11158f.getTranslationY() >= ((int) this.f11159n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f11158f.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((z1Var.f11780a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.f11780a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.f12051c;
                        if (y1Var.H == null) {
                            y1Var.D(null);
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
        q0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.f11158f.getY());
    }

    public boolean n0(Integer num) {
        return true;
    }

    public boolean o0(Integer num) {
        return true;
    }

    @Override
    public final void onThemeColorsChanged() {
        int w02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColorKey < 0 && this.navBarColor == this.f11162w && (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, this.resourcesProvider)) != this.navBarColor) {
                this.navBarColor = w02;
                this.f11162w = w02;
                setOverlayNavBarColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean p0(Runnable runnable) {
        return true;
    }

    public final void q0() {
        View[] viewPages;
        f2 f2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f22961w).start();
        for (View view : this.f11158f.getViewPages()) {
            if (view instanceof z1) {
                f2 f2Var2 = ((z1) view).f12052f;
                if (f2Var2 != null) {
                    AndroidUtilities.hideKeyboard(f2Var2.e);
                }
            } else if ((view instanceof u1) && (f2Var = ((u1) view).d) != null) {
                AndroidUtilities.hideKeyboard(f2Var.e);
            }
        }
    }

    public final void r0(int i10) {
        if (n0(Integer.valueOf(i10))) {
            if ((i10 != 1 || p0(new ag.r0(this, i10, 8))) && ((Boolean) this.G.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void s0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.G = callbackReturn;
        for (View view : this.f11158f.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).f12051c;
                if (y1Var.H == null) {
                    y1Var.D(null);
                }
            }
        }
    }
}
