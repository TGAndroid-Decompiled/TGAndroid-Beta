package oh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;
import ph.ca;
import ph.da;
import ph.h8;
import ph.p9;
import ph.u6;
public final class c implements ji {
    public final li f16581a;
    public final String f16582b;
    public final v f16583c;

    public c(v vVar, li liVar, String str) {
        this.f16583c = vVar;
        this.f16581a = liVar;
        this.f16582b = str;
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        int i13;
        ca caVar;
        v vVar = this.f16583c;
        long j12 = vVar.d;
        li liVar = this.f16581a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26702g0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    u6 l10 = u6.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f16582b;
                    l10.K0 = str;
                    l10.A();
                    da E = da.E(vVar.f16615a.getParentActivity(), vVar.f16616b);
                    RectF rectF = E.E;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f41479c;
                    WindowManager windowManager = E.f41489f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.c.b(i14);
                        } else {
                            E.f41530s0 = j12;
                            E.f41533t0 = str;
                            E.f41526r0 = false;
                            E.e = false;
                            E.f41553y2 = false;
                            if (windowManager != null && (caVar = E.f41512n) != null && caVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f41512n, layoutParams);
                                windowManager.addView(E.f41512n, layoutParams);
                                E.g0();
                            }
                            E.H1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.L1 = l10.K ? 1 : 0;
                            E.f41519p0.f41859g = false;
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                            E.f41525r.c();
                            p9 p9Var = E.f41486e0;
                            int i15 = E.G;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            p9Var.setBackgroundColor(i13);
                            E.f41525r.setTranslationX(0.0f);
                            E.f41525r.setTranslationY(0.0f);
                            E.f41525r.b(0.0f);
                            E.f41525r.setScaleX(1.0f);
                            E.f41525r.setScaleY(1.0f);
                            E.H = 0.0f;
                            AndroidUtilities.lockOrientation(E.f41475b, 1);
                            u6 u6Var = E.H1;
                            if (u6Var != null) {
                                E.Z0.setText(u6Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.Y0.b(false, false);
                            E.Y0.b(true, true);
                            E.g(1.0f, true, new h8(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new n5(liVar, 16), 400L);
                }
            }
        }
    }

    @Override
    public final boolean V() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void C() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void D(Object obj) {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
