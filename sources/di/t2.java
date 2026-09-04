package di;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class t2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public ig.g E;
    public Utilities.CallbackReturn F;
    public String f8167b;
    public int f8168c;
    public final g1 d;
    public final h1 f8169e;
    public final i1 f8170f;
    public final s2 h;
    public float f8171n;
    public final boolean f8172r;
    public final boolean f8173s;
    public boolean v;
    public ci.u f8174w;
    public float f8175x;
    public Utilities.Callback3Return f8176y;

    public t2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(1, context, f6Var, true);
        int i10;
        this.f8167b = null;
        this.f8168c = -1;
        this.d = new TLRPC.Document();
        this.f8169e = new TLRPC.Document();
        this.f8171n = -1.0f;
        this.f8172r = z10;
        this.f8173s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new k1(this, context);
        i1 i1Var = new i1(this, context, 0);
        this.f8170f = i1Var;
        if (z10) {
            i10 = 0;
        } else {
            i10 = G;
        }
        i1Var.f27015b = i10;
        i1Var.setAdapter(new j1(this, z10, context));
        this.containerView.addView(i1Var, w7.x5.e(-1, -1, 87));
        new j4(this.containerView, false, new e1(this, 0));
        if (!z10) {
            s2 s2Var = new s2(context);
            this.h = s2Var;
            s2Var.G = new e1(this, 1);
            s2Var.F = i1Var.f27015b;
            s2Var.invalidate();
            this.containerView.addView(s2Var, w7.x5.e(-1, -2, 87));
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

    public static int D(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static int F(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static int H(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f6 I(t2 t2Var) {
        return t2Var.resourcesProvider;
    }

    public static int T(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static int V(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static int W(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static int X(t2 t2Var) {
        return t2Var.currentAccount;
    }

    public static ViewGroup b0(t2 t2Var) {
        return t2Var.containerView;
    }

    public static void m(t2 t2Var) {
        boolean z10 = t2Var.v;
        boolean z11 = t2Var.keyboardVisible;
        if (z10 != z11) {
            t2Var.v = z11;
            t2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (t2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = t2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - t2Var.f8175x, (-i11) / 3.0f));
            }
            t2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21275w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f8170f.getTranslationY() >= ((int) this.f8171n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f8170f.getViewPages()) {
                if (view instanceof e2) {
                    e2 e2Var = (e2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((e2Var.f6898a == 0 && ((Integer) objArr[0]).intValue() == 5) || (e2Var.f6898a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        d2 d2Var = e2Var.f7155c;
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
        return (int) (this.containerView.getMeasuredHeight() - this.f8170f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(ah.g gVar) {
        return true;
    }

    public final void o0() {
        View[] viewPages;
        l2 l2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21275w).start();
        for (View view : this.f8170f.getViewPages()) {
            if (view instanceof e2) {
                l2 l2Var2 = ((e2) view).f7157f;
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
            if ((i10 != 1 || n0(new ah.g(this, i10, 5))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.F = callbackReturn;
        for (View view : this.f8170f.getViewPages()) {
            if (view instanceof e2) {
                d2 d2Var = ((e2) view).f7155c;
                if (d2Var.H == null) {
                    d2Var.D(null);
                }
            }
        }
    }
}
