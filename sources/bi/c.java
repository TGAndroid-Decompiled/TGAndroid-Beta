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
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;
public final class c implements ui {
    public final wi f3557a;
    public final String f3558b;
    public final z f3559c;

    public c(z zVar, wi wiVar, String str) {
        this.f3559c = zVar;
        this.f3557a = wiVar;
        this.f3558b = str;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        jc jcVar;
        z zVar = this.f3559c;
        long j11 = zVar.d;
        wi wiVar = this.f3557a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29974j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    k8 l4 = k8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3558b;
                    l4.K0 = str;
                    l4.A();
                    kc E = kc.E(zVar.f3601a.getParentActivity(), zVar.f3602b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f4989c;
                    WindowManager windowManager = E.f4999f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f5049v0 = j11;
                            E.f5053w0 = str;
                            E.f5046u0 = false;
                            E.e = false;
                            E.B2 = false;
                            if (windowManager != null && (jcVar = E.f5022n) != null && jcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f5022n, layoutParams);
                                windowManager.addView(E.f5022n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f5040s0.f4351g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f5035r.c();
                            wb wbVar = E.f5006h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            wbVar.setBackgroundColor(i13);
                            E.f5035r.setTranslationX(0.0f);
                            E.f5035r.setTranslationY(0.0f);
                            E.f5035r.b(0.0f);
                            E.f5035r.setScaleX(1.0f);
                            E.f5035r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f4985b, 1);
                            k8 k8Var = E.K1;
                            if (k8Var != null) {
                                E.f4991c1.setText(k8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f4987b1.b(false, false);
                            E.f4987b1.b(true, true);
                            E.g(1.0f, true, new ga(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a0(wiVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean S1() {
        return true;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(hh hhVar) {
        hhVar.run();
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
