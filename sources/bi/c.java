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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.yi;
public final class c implements yi {
    public final aj f3892a;
    public final String f3893b;
    public final z f3894c;

    public c(z zVar, aj ajVar, String str) {
        this.f3894c = zVar;
        this.f3892a = ajVar;
        this.f3893b = str;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        kc kcVar;
        z zVar = this.f3894c;
        long j11 = zVar.d;
        aj ajVar = this.f3892a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ajVar.f24354j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    l8 l4 = l8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3893b;
                    l4.K0 = str;
                    l4.A();
                    lc D = lc.D(zVar.f3939a.getParentActivity(), zVar.f3940b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f5463c;
                    WindowManager windowManager = D.f5474f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f5524v0 = j11;
                            D.f5528w0 = str;
                            D.f5521u0 = false;
                            D.f5470e = false;
                            D.B2 = false;
                            if (windowManager != null && (kcVar = D.f5497n) != null && kcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f5497n, layoutParams);
                                windowManager.addView(D.f5497n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f5515s0.f4725g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f5510r.c();
                            xb xbVar = D.f5481h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            xbVar.setBackgroundColor(i13);
                            D.f5510r.setTranslationX(0.0f);
                            D.f5510r.setTranslationY(0.0f);
                            D.f5510r.b(0.0f);
                            D.f5510r.setScaleX(1.0f);
                            D.f5510r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f5459b, 1);
                            l8 l8Var = D.K1;
                            if (l8Var != null) {
                                D.f5465c1.setText(l8Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f5461b1.b(false, false);
                            D.f5461b1.b(true, true);
                            D.f(1.0f, true, new ha(D, 6));
                            D.d();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a0(ajVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean Y1() {
        return true;
    }

    @Override
    public final void d0(lh lhVar) {
        lhVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
