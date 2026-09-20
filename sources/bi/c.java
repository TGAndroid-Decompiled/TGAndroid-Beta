package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ac;
import ci.ka;
import ci.nc;
import ci.o8;
import ci.oc;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class c implements ti {
    public final vi f3563a;
    public final String f3564b;
    public final z f3565c;

    public c(z zVar, vi viVar, String str) {
        this.f3565c = zVar;
        this.f3563a = viVar;
        this.f3564b = str;
    }

    @Override
    public final void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        nc ncVar;
        z zVar = this.f3565c;
        long j11 = zVar.d;
        vi viVar = this.f3563a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29110j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    o8 l4 = o8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3564b;
                    l4.K0 = str;
                    l4.A();
                    oc E = oc.E(zVar.f3607a.getParentActivity(), zVar.f3608b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f5212c;
                    WindowManager windowManager = E.f5222f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f5272v0 = j11;
                            E.f5276w0 = str;
                            E.f5269u0 = false;
                            E.e = false;
                            E.B2 = false;
                            if (windowManager != null && (ncVar = E.f5245n) != null && ncVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f5245n, layoutParams);
                                windowManager.addView(E.f5245n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f5263s0.f4435g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f5258r.c();
                            ac acVar = E.f5229h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            acVar.setBackgroundColor(i13);
                            E.f5258r.setTranslationX(0.0f);
                            E.f5258r.setTranslationY(0.0f);
                            E.f5258r.b(0.0f);
                            E.f5258r.setScaleX(1.0f);
                            E.f5258r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f5208b, 1);
                            o8 o8Var = E.K1;
                            if (o8Var != null) {
                                E.f5214c1.setText(o8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f5210b1.b(false, false);
                            E.f5210b1.b(true, true);
                            E.g(1.0f, true, new ka(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a0(viVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean S1() {
        return true;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void y0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final void V0(Object obj) {
    }

    @Override
    public final void k1(TLRPC.User user) {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
