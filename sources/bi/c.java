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
    public final vi f3562a;
    public final String f3563b;
    public final z f3564c;

    public c(z zVar, vi viVar, String str) {
        this.f3564c = zVar;
        this.f3562a = viVar;
        this.f3563b = str;
    }

    @Override
    public final void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        nc ncVar;
        z zVar = this.f3564c;
        long j11 = zVar.d;
        vi viVar = this.f3562a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29108j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    o8 l4 = o8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f3563b;
                    l4.K0 = str;
                    l4.A();
                    oc E = oc.E(zVar.f3606a.getParentActivity(), zVar.f3607b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f5210c;
                    WindowManager windowManager = E.f5220f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f5270v0 = j11;
                            E.f5274w0 = str;
                            E.f5267u0 = false;
                            E.e = false;
                            E.B2 = false;
                            if (windowManager != null && (ncVar = E.f5243n) != null && ncVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f5243n, layoutParams);
                                windowManager.addView(E.f5243n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f5261s0.f4433g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f5256r.c();
                            ac acVar = E.f5227h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            acVar.setBackgroundColor(i13);
                            E.f5256r.setTranslationX(0.0f);
                            E.f5256r.setTranslationY(0.0f);
                            E.f5256r.b(0.0f);
                            E.f5256r.setScaleX(1.0f);
                            E.f5256r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f5206b, 1);
                            o8 o8Var = E.K1;
                            if (o8Var != null) {
                                E.f5212c1.setText(o8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f5208b1.b(false, false);
                            E.f5208b1.b(true, true);
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
