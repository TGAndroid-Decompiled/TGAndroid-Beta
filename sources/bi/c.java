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
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;
public final class c implements ui {
    public final wi f3555a;
    public final String f3556b;
    public final z f3557c;

    public c(z zVar, wi wiVar, String str) {
        this.f3557c = zVar;
        this.f3555a = wiVar;
        this.f3556b = str;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        kc kcVar;
        z zVar = this.f3557c;
        long j11 = zVar.d;
        wi wiVar = this.f3555a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f30018j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    l8 l4 = l8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3556b;
                    l4.K0 = str;
                    l4.A();
                    lc E = lc.E(zVar.f3599a.getParentActivity(), zVar.f3600b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f5033c;
                    WindowManager windowManager = E.f5043f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f5093v0 = j11;
                            E.f5097w0 = str;
                            E.f5090u0 = false;
                            E.e = false;
                            E.B2 = false;
                            if (windowManager != null && (kcVar = E.f5066n) != null && kcVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f5066n, layoutParams);
                                windowManager.addView(E.f5066n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f5084s0.f4349g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f5079r.c();
                            xb xbVar = E.f5050h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            xbVar.setBackgroundColor(i13);
                            E.f5079r.setTranslationX(0.0f);
                            E.f5079r.setTranslationY(0.0f);
                            E.f5079r.b(0.0f);
                            E.f5079r.setScaleX(1.0f);
                            E.f5079r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f5029b, 1);
                            l8 l8Var = E.K1;
                            if (l8Var != null) {
                                E.f5035c1.setText(l8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f5031b1.b(false, false);
                            E.f5031b1.b(true, true);
                            E.g(1.0f, true, new ha(E, 6));
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
