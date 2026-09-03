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
import ph.g8;
import ph.p9;
import ph.t6;
public final class c implements ji {
    public final li f16561a;
    public final String f16562b;
    public final v f16563c;

    public c(v vVar, li liVar, String str) {
        this.f16563c = vVar;
        this.f16561a = liVar;
        this.f16562b = str;
    }

    @Override
    public final void C0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        int i13;
        ca caVar;
        v vVar = this.f16563c;
        long j12 = vVar.d;
        li liVar = this.f16561a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    t6 l10 = t6.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f16562b;
                    l10.K0 = str;
                    l10.A();
                    da E = da.E(vVar.f16595a.getParentActivity(), vVar.f16596b);
                    RectF rectF = E.E;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f41517c;
                    WindowManager windowManager = E.f41527f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.c.b(i14);
                        } else {
                            E.f41568s0 = j12;
                            E.f41571t0 = str;
                            E.f41564r0 = false;
                            E.e = false;
                            E.f41591y2 = false;
                            if (windowManager != null && (caVar = E.f41550n) != null && caVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f41550n, layoutParams);
                                windowManager.addView(E.f41550n, layoutParams);
                                E.g0();
                            }
                            E.H1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.L1 = l10.K ? 1 : 0;
                            E.f41557p0.f41818g = false;
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                            E.f41563r.c();
                            p9 p9Var = E.f41524e0;
                            int i15 = E.G;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            p9Var.setBackgroundColor(i13);
                            E.f41563r.setTranslationX(0.0f);
                            E.f41563r.setTranslationY(0.0f);
                            E.f41563r.b(0.0f);
                            E.f41563r.setScaleX(1.0f);
                            E.f41563r.setScaleY(1.0f);
                            E.H = 0.0f;
                            AndroidUtilities.lockOrientation(E.f41513b, 1);
                            t6 t6Var = E.H1;
                            if (t6Var != null) {
                                E.Z0.setText(t6Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.Y0.b(false, false);
                            E.Y0.b(true, true);
                            E.g(1.0f, true, new g8(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new n5(liVar, 16), 400L);
                }
            }
        }
    }

    @Override
    public final boolean X1() {
        return true;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
