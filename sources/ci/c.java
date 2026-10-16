package ci;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.la;
import di.ga;
import di.jc;
import di.k8;
import di.kc;
import di.wb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class c implements ti {
    public final vi f4758a;
    public final String f4759b;
    public final y f4760c;

    public c(y yVar, vi viVar, String str) {
        this.f4760c = yVar;
        this.f4758a = viVar;
        this.f4759b = str;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        jc jcVar;
        y yVar = this.f4760c;
        long j12 = yVar.d;
        vi viVar = this.f4758a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29684j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    k8 l4 = k8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j12;
                    String str = this.f4759b;
                    l4.K0 = str;
                    l4.A();
                    kc D = kc.D(yVar.f4799a.getParentActivity(), yVar.f4800b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f7244c;
                    WindowManager windowManager = D.f7254f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f7304v0 = j12;
                            D.f7308w0 = str;
                            D.f7301u0 = false;
                            D.e = false;
                            D.B2 = false;
                            if (windowManager != null && (jcVar = D.f7277n) != null && jcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f7277n, layoutParams);
                                windowManager.addView(D.f7277n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j12;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f7295s0.f8189g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f7290r.c();
                            wb wbVar = D.f7261h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            wbVar.setBackgroundColor(i13);
                            D.f7290r.setTranslationX(0.0f);
                            D.f7290r.setTranslationY(0.0f);
                            D.f7290r.b(0.0f);
                            D.f7290r.setScaleX(1.0f);
                            D.f7290r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f7240b, 1);
                            k8 k8Var = D.K1;
                            if (k8Var != null) {
                                D.f7246c1.setText(k8Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f7242b1.b(false, false);
                            D.f7242b1.b(true, true);
                            D.f(1.0f, true, new ga(D, 6));
                            D.d();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new la(viVar, 9), 400L);
                }
            }
        }
    }

    @Override
    public final boolean r0() {
        return true;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void J(Object obj) {
    }

    @Override
    public final void U(TLRPC.User user) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
