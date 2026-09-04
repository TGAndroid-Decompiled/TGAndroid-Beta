package ci;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.oa;
import di.bc;
import di.ka;
import di.o8;
import di.oc;
import di.pc;
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
    public final vi f4804a;
    public final String f4805b;
    public final y f4806c;

    public c(y yVar, vi viVar, String str) {
        this.f4806c = yVar;
        this.f4804a = viVar;
        this.f4805b = str;
    }

    @Override
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        int i13;
        oc ocVar;
        y yVar = this.f4806c;
        long j11 = yVar.d;
        vi viVar = this.f4804a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31291j0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    o8 l4 = o8.l((MediaController.PhotoEntry) next);
                    l4.J0 = j11;
                    String str = this.f4805b;
                    l4.K0 = str;
                    l4.A();
                    pc E = pc.E(yVar.f4848a.getParentActivity(), yVar.f4849b);
                    RectF rectF = E.H;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f7848c;
                    WindowManager windowManager = E.f7859f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            E.f7909v0 = j11;
                            E.f7913w0 = str;
                            E.f7906u0 = false;
                            E.f7855e = false;
                            E.B2 = false;
                            if (windowManager != null && (ocVar = E.f7882n) != null && ocVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f7882n, layoutParams);
                                windowManager.addView(E.f7882n, layoutParams);
                                E.g0();
                            }
                            E.K1 = l4;
                            l4.J0 = j11;
                            l4.K0 = str;
                            E.O1 = l4.K ? 1 : 0;
                            E.f7900s0.f6994g = false;
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                            E.f7895r.c();
                            bc bcVar = E.f7866h0;
                            int i15 = E.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            bcVar.setBackgroundColor(i13);
                            E.f7895r.setTranslationX(0.0f);
                            E.f7895r.setTranslationY(0.0f);
                            E.f7895r.b(0.0f);
                            E.f7895r.setScaleX(1.0f);
                            E.f7895r.setScaleY(1.0f);
                            E.K = 0.0f;
                            AndroidUtilities.lockOrientation(E.f7844b, 1);
                            o8 o8Var = E.K1;
                            if (o8Var != null) {
                                E.f7850c1.setText(o8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.f7846b1.b(false, false);
                            E.f7846b1.b(true, true);
                            E.g(1.0f, true, new ka(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new oa(viVar, 6), 400L);
                }
            }
        }
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void K(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
