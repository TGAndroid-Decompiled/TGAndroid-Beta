package ai;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.be;
import bi.ce;
import bi.kd;
import bi.r9;
import bi.tb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;
public final class f implements wi {
    public final yi f437a;
    public final String f438b;
    public final g0 f439c;

    public f(g0 g0Var, yi yiVar, String str) {
        this.f439c = g0Var;
        this.f437a = yiVar;
        this.f438b = str;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        be beVar;
        g0 g0Var = this.f439c;
        long j11 = g0Var.d;
        yi yiVar = this.f437a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    r9 l4 = r9.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f438b;
                    l4.K0 = str;
                    l4.A();
                    ce E = ce.E(g0Var.f442a.getParentActivity(), g0Var.f443b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f2437c;
                    WindowManager windowManager = E.f2447f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f2497v0 = j11;
                            E.f2501w0 = str;
                            E.f2494u0 = false;
                            E.e = false;
                            E.B2 = false;
                            if (windowManager != null && (beVar = E.f2470n) != null && beVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f2470n, layoutParams);
                                windowManager.addView(E.f2470n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f2488s0.f2555g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f2483r.c();
                            kd kdVar = E.f2454h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            kdVar.setBackgroundColor(i13);
                            E.f2483r.setTranslationX(0.0f);
                            E.f2483r.setTranslationY(0.0f);
                            E.f2483r.b(0.0f);
                            E.f2483r.setScaleX(1.0f);
                            E.f2483r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f2433b, 1);
                            r9 r9Var = E.K1;
                            if (r9Var != null) {
                                E.f2439c1.setText(r9Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f2435b1.b(false, false);
                            E.f2435b1.b(true, true);
                            E.g(1.0f, true, new tb(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a3.d(yiVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean R1() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
