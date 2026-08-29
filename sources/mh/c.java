package mh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import lh.m5;
import nh.fb;
import nh.g9;
import nh.gb;
import nh.o7;
import nh.ta;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;
public final class c implements li {
    public final ni f17019a;
    public final String f17020b;
    public final v f17021c;

    public c(v vVar, ni niVar, String str) {
        this.f17021c = vVar;
        this.f17019a = niVar;
        this.f17020b = str;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        fb fbVar;
        v vVar = this.f17021c;
        long j12 = vVar.d;
        ni niVar = this.f17019a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    o7 l10 = o7.l((MediaController.PhotoEntry) next);
                    l10.J0 = j12;
                    String str = this.f17020b;
                    l10.K0 = str;
                    l10.A();
                    gb E = gb.E(vVar.f17056a.getParentActivity(), vVar.f17057b);
                    RectF rectF = E.D;
                    WindowManager.LayoutParams layoutParams = E.h;
                    int i14 = E.f17743c;
                    WindowManager windowManager = E.f17754f;
                    if (!E.d) {
                        if (MessagesController.getInstance(i14).isFrozen()) {
                            org.telegram.ui.c.b(i14);
                        } else {
                            E.f17791r0 = j12;
                            E.f17795s0 = str;
                            E.f17787q0 = false;
                            E.f17750e = false;
                            E.f17814x2 = false;
                            if (windowManager != null && (fbVar = E.f17777n) != null && fbVar.getParent() == null) {
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f17777n, layoutParams);
                                windowManager.addView(E.f17777n, layoutParams);
                                E.g0();
                            }
                            E.G1 = l10;
                            l10.J0 = j12;
                            l10.K0 = str;
                            E.K1 = l10.K ? 1 : 0;
                            E.f17781o0.f17598g = false;
                            E.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.C = AndroidUtilities.dp(8.0f);
                            E.f17790r.c();
                            ta taVar = E.f17747d0;
                            int i15 = E.F;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            taVar.setBackgroundColor(i13);
                            E.f17790r.setTranslationX(0.0f);
                            E.f17790r.setTranslationY(0.0f);
                            E.f17790r.b(0.0f);
                            E.f17790r.setScaleX(1.0f);
                            E.f17790r.setScaleY(1.0f);
                            E.G = 0.0f;
                            AndroidUtilities.lockOrientation(E.f17739b, 1);
                            o7 o7Var = E.G1;
                            if (o7Var != null) {
                                E.Y0.setText(o7Var.C0);
                            }
                            E.K(1, false);
                            E.l0(-1, false, false);
                            E.X0.b(false, false);
                            E.X0.b(true, true);
                            E.g(1.0f, true, new g9(E, 6));
                            E.e();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new m5(niVar, 14), 400L);
                }
            }
        }
    }

    @Override
    public final boolean T1() {
        return true;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
