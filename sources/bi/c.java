package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ha;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.xb;
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
public final class c implements wi {
    public final yi f3893a;
    public final String f3894b;
    public final z f3895c;

    public c(z zVar, yi yiVar, String str) {
        this.f3895c = zVar;
        this.f3893a = yiVar;
        this.f3894b = str;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        kc kcVar;
        z zVar = this.f3895c;
        long j11 = zVar.d;
        yi yiVar = this.f3893a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33240j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    l8 l4 = l8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3894b;
                    l4.K0 = str;
                    l4.A();
                    lc D = lc.D(zVar.f3940a.getParentActivity(), zVar.f3941b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f5465c;
                    WindowManager windowManager = D.f5476f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f5526v0 = j11;
                            D.f5530w0 = str;
                            D.f5523u0 = false;
                            D.f5472e = false;
                            D.B2 = false;
                            if (windowManager != null && (kcVar = D.f5499n) != null && kcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f5499n, layoutParams);
                                windowManager.addView(D.f5499n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f5517s0.f4727g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f5512r.c();
                            xb xbVar = D.f5483h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            xbVar.setBackgroundColor(i13);
                            D.f5512r.setTranslationX(0.0f);
                            D.f5512r.setTranslationY(0.0f);
                            D.f5512r.b(0.0f);
                            D.f5512r.setScaleX(1.0f);
                            D.f5512r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f5461b, 1);
                            l8 l8Var = D.K1;
                            if (l8Var != null) {
                                D.f5467c1.setText(l8Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f5463b1.b(false, false);
                            D.f5463b1.b(true, true);
                            D.f(1.0f, true, new ha(D, 6));
                            D.d();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a0(yiVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean Y1() {
        return true;
    }

    @Override
    public final void f0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final void a1(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
