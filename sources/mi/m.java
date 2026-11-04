package mi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.zh;
public final class m implements zh {
    public final bi f19737a;
    public final p f19738b;

    public m(p pVar, bi biVar) {
        this.f19738b = pVar;
        this.f19737a = biVar;
    }

    @Override
    public final boolean L1() {
        return false;
    }

    @Override
    public final void Y(ng ngVar) {
        hs.f(this.f19738b.f19792n).d(ngVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.f19737a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
        t3 t3Var = this.f19738b.f19793r;
        if (i3 == 7 || i3 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = t3Var.f19909j4;
            t3Var.f19909j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ye) {
                    if (aVar != null) {
                        t3Var.X1(aVar, (ye) obj);
                    } else {
                        t3Var.i2((ye) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        t3Var.f19909j4 = null;
        biVar.a(true);
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void I0(Object obj) {
    }

    @Override
    public final void a1(TLRPC.User user) {
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
