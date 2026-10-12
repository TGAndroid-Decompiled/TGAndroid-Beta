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
    public final vi f4755a;
    public final String f4756b;
    public final y f4757c;

    public c(y yVar, vi viVar, String str) {
        this.f4757c = yVar;
        this.f4755a = viVar;
        this.f4756b = str;
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        jc jcVar;
        y yVar = this.f4757c;
        long j12 = yVar.d;
        vi viVar = this.f4755a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f30013j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    k8 l4 = k8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j12;
                    String str = this.f4756b;
                    l4.K0 = str;
                    l4.A();
                    kc D = kc.D(yVar.f4796a.getParentActivity(), yVar.f4797b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f7241c;
                    WindowManager windowManager = D.f7251f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f7301v0 = j12;
                            D.f7305w0 = str;
                            D.f7298u0 = false;
                            D.e = false;
                            D.B2 = false;
                            if (windowManager != null && (jcVar = D.f7274n) != null && jcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f7274n, layoutParams);
                                windowManager.addView(D.f7274n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j12;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f7292s0.f8186g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f7287r.c();
                            wb wbVar = D.f7258h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            wbVar.setBackgroundColor(i13);
                            D.f7287r.setTranslationX(0.0f);
                            D.f7287r.setTranslationY(0.0f);
                            D.f7287r.b(0.0f);
                            D.f7287r.setScaleX(1.0f);
                            D.f7287r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f7237b, 1);
                            k8 k8Var = D.K1;
                            if (k8Var != null) {
                                D.f7243c1.setText(k8Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f7239b1.b(false, false);
                            D.f7239b1.b(true, true);
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
    public final boolean p0() {
        return true;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void U(Object obj) {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
