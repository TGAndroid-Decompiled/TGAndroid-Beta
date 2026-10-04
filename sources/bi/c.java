package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ga;
import ci.jc;
import ci.k8;
import ci.kc;
import ci.wb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;
public final class c implements vi {
    public final xi f3843a;
    public final String f3844b;
    public final z f3845c;

    public c(z zVar, xi xiVar, String str) {
        this.f3845c = zVar;
        this.f3843a = xiVar;
        this.f3844b = str;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        jc jcVar;
        z zVar = this.f3845c;
        long j11 = zVar.d;
        xi xiVar = this.f3843a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f32825j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    k8 l4 = k8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3844b;
                    l4.K0 = str;
                    l4.A();
                    kc E = kc.E(zVar.f3890a.getParentActivity(), zVar.f3891b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f5380c;
                    WindowManager windowManager = E.f5391f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f5441v0 = j11;
                            E.f5445w0 = str;
                            E.f5438u0 = false;
                            E.f5387e = false;
                            E.B2 = false;
                            if (windowManager != null && (jcVar = E.f5414n) != null && jcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f5414n, layoutParams);
                                windowManager.addView(E.f5414n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f5432s0.f4703g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f5427r.c();
                            wb wbVar = E.f5398h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            wbVar.setBackgroundColor(i13);
                            E.f5427r.setTranslationX(0.0f);
                            E.f5427r.setTranslationY(0.0f);
                            E.f5427r.b(0.0f);
                            E.f5427r.setScaleX(1.0f);
                            E.f5427r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f5376b, 1);
                            k8 k8Var = E.K1;
                            if (k8Var != null) {
                                E.f5382c1.setText(k8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f5378b1.b(false, false);
                            E.f5378b1.b(true, true);
                            E.g(1.0f, true, new ga(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a0(xiVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean S1() {
        return true;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(ih ihVar) {
        ihVar.run();
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
