package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

public class l2 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static int C = 1;
    public qf.i A;
    public Utilities.CallbackReturn B;

    public String f16285b;

    public int f16286c;
    public final f1 d;

    public final g1 f16287e;

    public final h1 f16288f;
    public final k2 h;

    public float f16289n;

    public final boolean f16290r;

    public final boolean f16291s;
    public boolean v;

    public zf.w0 f16292w;

    public float f16293x;

    public Utilities.Callback3Return f16294y;

    public l2(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, c6Var, true, false);
        this.f16285b = null;
        this.f16286c = -1;
        this.d = new f1();
        this.f16287e = new g1();
        this.f16289n = -1.0f;
        this.f16290r = z10;
        this.f16291s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new j1(this, context);
        h1 h1Var = new h1(this, context, 0);
        this.f16288f = h1Var;
        h1Var.f31543b = z10 ? 0 : C;
        h1Var.setAdapter(new i1(this, z10, context));
        this.containerView.addView(h1Var, h7.z5.e(-1, -1, 87));
        new a4(this.containerView, false, new d1(this, 0));
        if (!z10) {
            k2 k2Var = new k2(context);
            this.h = k2Var;
            k2Var.C = new d1(this, 1);
            k2Var.B = h1Var.f31543b;
            k2Var.invalidate();
            this.containerView.addView(k2Var, h7.z5.e(-1, -2, 87));
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

    public static void m(l2 l2Var) {
        boolean z10 = l2Var.v;
        boolean z11 = l2Var.keyboardVisible;
        if (z10 != z11) {
            l2Var.v = z11;
            l2Var.container.clearAnimation();
            float fMin = 0.0f;
            if (l2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = l2Var.keyboardHeight;
                fMin = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - l2Var.f16293x, (-i11) / 3.0f));
            }
            l2Var.container.animate().translationY(fMin).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return this.f16288f.getTranslationY() >= ((float) ((int) this.f16289n));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f16288f.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((z1Var.f16935a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.f16935a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.f17174c;
                        if (y1Var.D == null) {
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
        o0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.f16288f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(cg.w1 w1Var) {
        return true;
    }

    public final void o0() {
        e2 e2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
        for (View view : this.f16288f.getViewPages()) {
            if (view instanceof z1) {
                e2 e2Var2 = ((z1) view).f17176f;
                if (e2Var2 != null) {
                    AndroidUtilities.hideKeyboard(e2Var2.d);
                }
            } else if ((view instanceof u1) && (e2Var = ((u1) view).d) != null) {
                AndroidUtilities.hideKeyboard(e2Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new cg.w1(this, i10, 9))) && ((Boolean) this.B.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        this.B = callbackReturn;
        for (View view : this.f16288f.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).f17174c;
                if (y1Var.D == null) {
                    y1Var.D(null);
                }
            }
        }
    }
}
