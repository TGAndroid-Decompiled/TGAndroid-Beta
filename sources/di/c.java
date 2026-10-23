package di;

import android.graphics.RectF;
import android.view.WindowManager;
import ei.a8;
import ei.hb;
import ei.t9;
import ei.ub;
import ei.vb;
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
    public final ti f8039a;
    public final String f8040b;
    public final v f8041c;

    public c(v vVar, ti tiVar, String str) {
        this.f8041c = vVar;
        this.f8039a = tiVar;
        this.f8040b = str;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        ub ubVar;
        v vVar = this.f8041c;
        long j12 = vVar.d;
        ti tiVar = this.f8039a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30742j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    a8 l4 = a8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j12;
                    String str = this.f8040b;
                    l4.K0 = str;
                    l4.A();
                    vb D = vb.D(vVar.f8075a.getParentActivity(), vVar.f8076b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f9971c;
                    WindowManager windowManager = D.f9981f;
                    if (!D.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f10031v0 = j12;
                            D.f10035w0 = str;
                            D.f10028u0 = false;
                            D.e = false;
                            D.B2 = false;
                            if (windowManager != null && (ubVar = D.f10004n) != null && ubVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f10004n, layoutParams);
                                windowManager.addView(D.f10004n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j12;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f10022s0.f9663g = false;
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                            D.f10017r.c();
                            hb hbVar = D.f9988h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            hbVar.setBackgroundColor(i13);
                            D.f10017r.setTranslationX(0.0f);
                            D.f10017r.setTranslationY(0.0f);
                            D.f10017r.b(0.0f);
                            D.f10017r.setScaleX(1.0f);
                            D.f10017r.setScaleY(1.0f);
                            D.K = 0.0f;
                            AndroidUtilities.lockOrientation(D.f9967b, 1);
                            a8 a8Var = D.K1;
                            if (a8Var != null) {
                                D.f9973c1.setText(a8Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f9969b1.b(false, false);
                            D.f9969b1.b(true, true);
                            D.f(1.0f, true, new t9(D, 6));
                            D.d();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(tiVar, 2), 400L);
                }
            }
        }
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void r(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void O(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
