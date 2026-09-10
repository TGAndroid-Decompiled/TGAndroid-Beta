package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class f3 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public gg.g E;
    public Utilities.CallbackReturn F;
    public String f2691b;
    public int f2692c;
    public final l1 d;
    public final m1 e;
    public final p1 f2693f;
    public final e3 h;
    public float f2694n;
    public final boolean f2695r;
    public final boolean f2696s;
    public boolean v;
    public ai.c0 f2697w;
    public float f2698x;
    public Utilities.Callback3Return f2699y;

    public f3(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(1, context, f6Var, true);
        int i10;
        this.f2691b = null;
        this.f2692c = -1;
        this.d = new TLRPC.Document();
        this.e = new TLRPC.Document();
        this.f2694n = -1.0f;
        this.f2695r = z10;
        this.f2696s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new r1(this, context);
        p1 p1Var = new p1(this, context, 0);
        this.f2693f = p1Var;
        if (z10) {
            i10 = 0;
        } else {
            i10 = G;
        }
        p1Var.f27886b = i10;
        p1Var.setAdapter(new q1(this, z10, context));
        this.containerView.addView(p1Var, w7.a6.e(-1, -1, 87));
        new b5(this.containerView, false, new j1(this, 0));
        if (!z10) {
            e3 e3Var = new e3(context);
            this.h = e3Var;
            e3Var.G = new j1(this, 1);
            e3Var.F = p1Var.f27886b;
            e3Var.invalidate();
            this.containerView.addView(e3Var, w7.a6.e(-1, -2, 87));
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

    public static int D(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static int E(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static int H(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f6 I(f3 f3Var) {
        return f3Var.resourcesProvider;
    }

    public static int T(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static int V(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static int W(f3 f3Var) {
        return f3Var.currentAccount;
    }

    public static ViewGroup b0(f3 f3Var) {
        return f3Var.containerView;
    }

    public static void m(f3 f3Var) {
        boolean z10 = f3Var.v;
        boolean z11 = f3Var.keyboardVisible;
        if (z10 != z11) {
            f3Var.v = z11;
            f3Var.container.clearAnimation();
            float f7 = 0.0f;
            if (f3Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = f3Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - f3Var.f2698x, (-i11) / 3.0f));
            }
            f3Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f18592w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f2693f.getTranslationY() >= ((int) this.f2694n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f2693f.getViewPages()) {
                if (view instanceof q2) {
                    q2 q2Var = (q2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((q2Var.f3035a == 0 && ((Integer) objArr[0]).intValue() == 5) || (q2Var.f3035a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        p2 p2Var = q2Var.f3443c;
                        if (p2Var.H == null) {
                            p2Var.D(null);
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
        return (int) (this.containerView.getMeasuredHeight() - this.f2693f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(s sVar) {
        return true;
    }

    public final void o0() {
        View[] viewPages;
        x2 x2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f18592w).start();
        for (View view : this.f2693f.getViewPages()) {
            if (view instanceof q2) {
                x2 x2Var2 = ((q2) view).f3444f;
                if (x2Var2 != null) {
                    AndroidUtilities.hideKeyboard(x2Var2.d);
                }
            } else if ((view instanceof k2) && (x2Var = ((k2) view).d) != null) {
                AndroidUtilities.hideKeyboard(x2Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new s(this, i10, 2))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.F = callbackReturn;
        for (View view : this.f2693f.getViewPages()) {
            if (view instanceof q2) {
                p2 p2Var = ((q2) view).f3443c;
                if (p2Var.H == null) {
                    p2Var.D(null);
                }
            }
        }
    }
}
