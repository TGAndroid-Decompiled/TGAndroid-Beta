package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class s2 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public hg.h E;
    public Utilities.CallbackReturn F;
    public String f5472b;
    public int f5473c;
    public final g1 d;
    public final h1 e;
    public final i1 f5474f;
    public final r2 h;
    public float f5475n;
    public final boolean f5476r;
    public final boolean f5477s;
    public boolean v;
    public bi.v f5478w;
    public float f5479x;
    public Utilities.Callback3Return f5480y;

    public s2(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(1, context, d6Var, true);
        int i10;
        this.f5472b = null;
        this.f5473c = -1;
        this.d = new TLRPC.Document();
        this.e = new TLRPC.Document();
        this.f5475n = -1.0f;
        this.f5476r = z10;
        this.f5477s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19130h5, d6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new k1(this, context);
        i1 i1Var = new i1(this, context, 0);
        this.f5474f = i1Var;
        if (z10) {
            i10 = 0;
        } else {
            i10 = G;
        }
        i1Var.f29934b = i10;
        i1Var.setAdapter(new j1(this, z10, context));
        this.containerView.addView(i1Var, w7.y5.e(-1, -1, 87));
        new i4(this.containerView, false, new e1(this, 0));
        if (!z10) {
            r2 r2Var = new r2(context);
            this.h = r2Var;
            r2Var.G = new e1(this, 1);
            r2Var.F = i1Var.f29934b;
            r2Var.invalidate();
            this.containerView.addView(r2Var, w7.y5.e(-1, -2, 87));
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

    public static int E(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static int F(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static int H(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d6 I(s2 s2Var) {
        return s2Var.resourcesProvider;
    }

    public static int T(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static int V(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static int W(s2 s2Var) {
        return s2Var.currentAccount;
    }

    public static ViewGroup b0(s2 s2Var) {
        return s2Var.containerView;
    }

    public static void m(s2 s2Var) {
        boolean z10 = s2Var.v;
        boolean z11 = s2Var.keyboardVisible;
        if (z10 != z11) {
            s2Var.v = z11;
            s2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (s2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = s2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - s2Var.f5479x, (-i11) / 3.0f));
            }
            s2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f19669w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f5474f.getTranslationY() >= ((int) this.f5475n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f5474f.getViewPages()) {
                if (view instanceof e2) {
                    e2 e2Var = (e2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((e2Var.f4338a == 0 && ((Integer) objArr[0]).intValue() == 5) || (e2Var.f4338a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        d2 d2Var = e2Var.f4595c;
                        if (d2Var.H == null) {
                            d2Var.D(null);
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
        o0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.f5474f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(ai.o8 o8Var) {
        return true;
    }

    public final void o0() {
        View[] viewPages;
        l2 l2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f19669w).start();
        for (View view : this.f5474f.getViewPages()) {
            if (view instanceof e2) {
                l2 l2Var2 = ((e2) view).f4596f;
                if (l2Var2 != null) {
                    AndroidUtilities.hideKeyboard(l2Var2.d);
                }
            } else if ((view instanceof z1) && (l2Var = ((z1) view).d) != null) {
                AndroidUtilities.hideKeyboard(l2Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new ai.o8(this, i10, 4))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.F = callbackReturn;
        for (View view : this.f5474f.getViewPages()) {
            if (view instanceof e2) {
                d2 d2Var = ((e2) view).f4595c;
                if (d2Var.H == null) {
                    d2Var.D(null);
                }
            }
        }
    }
}
