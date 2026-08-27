package kh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import lh.fb;
import lh.rb;
import lh.s9;
import lh.sb;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;

public final class d implements ei {

    public final gi f15194a;

    public final String f15195b;

    public final v f15196c;

    public d(v vVar, gi giVar, String str) {
        this.f15196c = vVar;
        this.f15194a = giVar;
        this.f15195b = str;
    }

    @Override
    public final boolean N0() {
        return true;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        rb rbVar;
        v vVar = this.f15196c;
        long j12 = vVar.d;
        gi giVar = this.f15194a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof MediaController.PhotoEntry) {
            z7 z7VarL = z7.l((MediaController.PhotoEntry) next);
            z7VarL.J0 = j12;
            String str = this.f15195b;
            z7VarL.K0 = str;
            z7VarL.A();
            sb sbVarE = sb.E(vVar.f15229a.getParentActivity(), vVar.f15230b);
            RectF rectF = sbVarE.D;
            WindowManager.LayoutParams layoutParams = sbVarE.h;
            int i13 = sbVarE.f16749c;
            WindowManager windowManager = sbVarE.f16760f;
            if (!sbVarE.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    sbVarE.f16797r0 = j12;
                    sbVarE.f16801s0 = str;
                    sbVarE.f16793q0 = false;
                    sbVarE.f16756e = false;
                    sbVarE.f16820x2 = false;
                    if (windowManager != null && (rbVar = sbVarE.f16783n) != null && rbVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, sbVarE.f16783n, layoutParams);
                        windowManager.addView(sbVarE.f16783n, layoutParams);
                        sbVarE.g0();
                    }
                    sbVarE.G1 = z7VarL;
                    z7VarL.J0 = j12;
                    z7VarL.K0 = str;
                    sbVarE.K1 = z7VarL.K ? 1 : 0;
                    sbVarE.f16787o0.f16531g = false;
                    sbVarE.F = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    sbVarE.C = AndroidUtilities.dp(8.0f);
                    sbVarE.f16796r.c();
                    fb fbVar = sbVarE.f16753d0;
                    int i14 = sbVarE.F;
                    fbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    sbVarE.f16796r.setTranslationX(0.0f);
                    sbVarE.f16796r.setTranslationY(0.0f);
                    sbVarE.f16796r.b(0.0f);
                    sbVarE.f16796r.setScaleX(1.0f);
                    sbVarE.f16796r.setScaleY(1.0f);
                    sbVarE.G = 0.0f;
                    AndroidUtilities.lockOrientation(sbVarE.f16745b, 1);
                    z7 z7Var = sbVarE.G1;
                    if (z7Var != null) {
                        sbVarE.Y0.setText(z7Var.C0);
                    }
                    sbVarE.K(1, false);
                    sbVarE.l0(-1, false, false);
                    sbVarE.X0.b(false, false);
                    sbVarE.X0.b(true, true);
                    sbVarE.g(1.0f, true, new s9(sbVarE, 6));
                    sbVarE.e();
                }
            }
            AndroidUtilities.runOnUIThread(new c(giVar, 0), 400L);
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void F() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
