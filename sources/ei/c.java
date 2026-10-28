package ei;

import android.graphics.RectF;
import android.view.WindowManager;
import di.s8;
import fi.eb;
import fi.p9;
import fi.rb;
import fi.sb;
import fi.w7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class c implements ri {
    public final ti f9978a;
    public final String f9979b;
    public final v f9980c;

    public c(v vVar, ti tiVar, String str) {
        this.f9980c = vVar;
        this.f9978a = tiVar;
        this.f9979b = str;
    }

    @Override
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        rb rbVar;
        v vVar = this.f9980c;
        long j12 = vVar.d;
        ti tiVar = this.f9978a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33002j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    w7 l4 = w7.l((MediaController.PhotoEntry) next);
                    l4.J0 = j12;
                    String str = this.f9979b;
                    l4.K0 = str;
                    l4.A();
                    sb D = sb.D(vVar.f10014a.getParentActivity(), vVar.f10015b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f11611c;
                    WindowManager windowManager = D.f11621f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f11671v0 = j12;
                            D.f11675w0 = str;
                            D.f11668u0 = false;
                            D.e = false;
                            D.B2 = false;
                            if (windowManager != null && (rbVar = D.f11644n) != null && rbVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f11644n, layoutParams);
                                windowManager.addView(D.f11644n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j12;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f11662s0.f11305g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f11657r.c();
                            eb ebVar = D.f11628h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            ebVar.setBackgroundColor(i13);
                            D.f11657r.setTranslationX(0.0f);
                            D.f11657r.setTranslationY(0.0f);
                            D.f11657r.b(0.0f);
                            D.f11657r.setScaleX(1.0f);
                            D.f11657r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f11607b, 1);
                            w7 w7Var = D.K1;
                            if (w7Var != null) {
                                D.f11613c1.setText(w7Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f11609b1.b(false, false);
                            D.f11609b1.b(true, true);
                            D.f(1.0f, true, new p9(D, 6));
                            D.d();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new s8(tiVar, 7), 400L);
                }
            }
        }
    }

    @Override
    public final boolean x0() {
        return true;
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
