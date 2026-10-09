package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class r2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public hg.h E;
    public Utilities.CallbackReturn F;
    public String f5882b;
    public int f5883c;
    public final f1 d;
    public final g1 f5884e;
    public final h1 f5885f;
    public final q2 h;
    public float f5886n;
    public final boolean f5887r;
    public final boolean f5888s;
    public boolean v;
    public bi.v f5889w;
    public float f5890x;
    public Utilities.Callback3Return f5891y;

    public r2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        int i10;
        this.f5882b = null;
        this.f5883c = -1;
        this.d = new TLRPC.Document();
        this.f5884e = new TLRPC.Document();
        this.f5886n = -1.0f;
        this.f5887r = z10;
        this.f5888s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new j1(this, context);
        h1 h1Var = new h1(this, context, 0);
        this.f5885f = h1Var;
        if (z10) {
            i10 = 0;
        } else {
            i10 = G;
        }
        h1Var.f29427b = i10;
        h1Var.setAdapter(new i1(this, z10, context));
        this.containerView.addView(h1Var, w7.x5.e(-1, -1, 87));
        new h4(this.containerView, false, new d1(this, 0));
        if (!z10) {
            q2 q2Var = new q2(context);
            this.h = q2Var;
            q2Var.G = new d1(this, 1);
            q2Var.F = h1Var.f29427b;
            q2Var.invalidate();
            this.containerView.addView(q2Var, w7.x5.e(-1, -2, 87));
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

    public static int F(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static int G(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static int I(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.e6 J(r2 r2Var) {
        return r2Var.resourcesProvider;
    }

    public static int U(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static int W(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static int X(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static int Y(r2 r2Var) {
        return r2Var.currentAccount;
    }

    public static void o(r2 r2Var) {
        boolean z10 = r2Var.v;
        boolean z11 = r2Var.keyboardVisible;
        if (z10 != z11) {
            r2Var.v = z11;
            r2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (r2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = r2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - r2Var.f5890x, (-i11) / 3.0f));
            }
            r2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21455w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f5885f.getTranslationY() >= ((int) this.f5886n)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f5885f.getViewPages()) {
                if (view instanceof d2) {
                    d2 d2Var = (d2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((d2Var.f6415a == 0 && ((Integer) objArr[0]).intValue() == 5) || (d2Var.f6415a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        c2 c2Var = d2Var.f4896c;
                        if (c2Var.H == null) {
                            c2Var.D(null);
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
        p0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        if (this.containerView.getMeasuredHeight() <= 0) {
            return AndroidUtilities.displaySize.y;
        }
        return (int) (this.containerView.getMeasuredHeight() - this.f5885f.getY());
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(Integer num) {
        return true;
    }

    public boolean o0(Runnable runnable) {
        return true;
    }

    public final void p0() {
        View[] viewPages;
        k2 k2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21455w).start();
        for (View view : this.f5885f.getViewPages()) {
            if (view instanceof d2) {
                k2 k2Var2 = ((d2) view).f4898f;
                if (k2Var2 != null) {
                    AndroidUtilities.hideKeyboard(k2Var2.d);
                }
            } else if ((view instanceof y1) && (k2Var = ((y1) view).d) != null) {
                AndroidUtilities.hideKeyboard(k2Var.d);
            }
        }
    }

    public final void q0(int i10) {
        if (m0(Integer.valueOf(i10))) {
            if ((i10 != 1 || o0(new ai.p8(this, i10, 4))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void r0(Utilities.CallbackReturn callbackReturn) {
        View[] viewPages;
        this.F = callbackReturn;
        for (View view : this.f5885f.getViewPages()) {
            if (view instanceof d2) {
                c2 c2Var = ((d2) view).f4896c;
                if (c2Var.H == null) {
                    c2Var.D(null);
                }
            }
        }
    }
}
