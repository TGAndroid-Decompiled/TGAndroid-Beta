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
public final class m implements bi {
    public final di f18693a;
    public final p f18694b;

    public m(p pVar, di diVar) {
        this.f18694b = pVar;
        this.f18693a = diVar;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void c0(qg qgVar) {
        qs.f(this.f18694b.f18759n).d(qgVar);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar = this.f18693a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32932a2;
        t3 t3Var = this.f18694b.f18760r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = t3Var.f18882i4;
            t3Var.f18882i4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof gf) {
                    if (aVar != null) {
                        t3Var.X1(aVar, (gf) obj);
                    } else {
                        t3Var.i2((gf) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        t3Var.f18882i4 = null;
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
