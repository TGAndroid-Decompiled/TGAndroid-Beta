package jh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
import kh.ib;
import kh.v9;
import kh.vb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
public final class c implements ii {
    public final ki f14343a;
    public final String f14344b;
    public final u f14345c;

    public c(u uVar, ki kiVar, String str) {
        this.f14345c = uVar;
        this.f14343a = kiVar;
        this.f14344b = str;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        int i12;
        vb vbVar;
        u uVar = this.f14345c;
        long j12 = uVar.d;
        ki kiVar = this.f14343a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    a8 l10 = a8.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f14344b;
                    l10.K0 = str;
                    l10.A();
                    wb E = wb.E(uVar.f14378a.getParentActivity(), uVar.f14379b);
                    RectF rectF = E.D;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i13 = E.f16253c;
                    WindowManager windowManager = E.f16264f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i13).isFrozen()) {
                            org.telegram.ui.b.b(i13);
                        } else {
                            E.f16301r0 = j12;
                            E.f16305s0 = str;
                            E.f16297q0 = false;
                            E.f16260e = false;
                            E.f16324x2 = false;
                            if (windowManager != null && (vbVar = E.f16287n) != null && vbVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f16287n, layoutParams);
                                windowManager.addView(E.f16287n, layoutParams);
                                E.g0();
                            }
                            E.G1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.K1 = l10.K ? 1 : 0;
                            E.f16291o0.f15884g = false;
                            E.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.C = AndroidUtilities.dp(8.0f);
                            E.f16300r.c();
                            ib ibVar = E.f16257d0;
                            int i14 = E.F;
                            if (i14 != 1 && i14 != 0) {
                                i12 = -14737633;
                            } else {
                                i12 = 0;
                            }
                            ibVar.setBackgroundColor(i12);
                            E.f16300r.setTranslationX(0.0f);
                            E.f16300r.setTranslationY(0.0f);
                            E.f16300r.b(0.0f);
                            E.f16300r.setScaleX(1.0f);
                            E.f16300r.setScaleY(1.0f);
                            E.G = 0.0f;
                            AndroidUtilities.lockOrientation(E.f16249b, 1);
                            a8 a8Var = E.G1;
                            if (a8Var != null) {
                                E.Y0.setText(a8Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.X0.b(false, false);
                            E.X0.b(true, true);
                            E.g(1.0f, true, new v9(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ih.g(kiVar, 23), 400L);
                }
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final boolean t0() {
        return true;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
