package li;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.qg;
public final class q1 implements bi {
    public final di f18782a;
    public final b2 f18783b;

    public q1(b2 b2Var, di diVar) {
        this.f18783b = b2Var;
        this.f18782a = diVar;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        qs.f(this.f18783b.getCurrentAccount()).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar = this.f18782a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32895a2;
        b2 b2Var = this.f18783b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            t3 t3Var = b2Var.P;
            a aVar = t3Var.f18879i4;
            t3Var.f18879i4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof gf) {
                    if (aVar != null) {
                        b2Var.P.X1(aVar, (gf) obj);
                    } else {
                        b2Var.P.i2((gf) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        b2Var.P.f18879i4 = null;
        diVar.a(true);
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void M0(Object obj) {
    }

    @Override
    public final void Y0(TLRPC.User user) {
    }

    @Override
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
