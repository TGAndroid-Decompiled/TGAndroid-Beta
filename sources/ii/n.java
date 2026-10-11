package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;
public final class n implements wi {
    public final yi f12577a;
    public final r f12578b;

    public n(r rVar, yi yiVar) {
        this.f12578b = rVar;
        this.f12577a = yiVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f12577a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33228j0;
        x3 x3Var = this.f12578b.f12649r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = x3Var.Z3;
            x3Var.Z3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        x3Var.U1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        x3Var.g2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        x3Var.Z3 = null;
        yiVar.dismiss(true);
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void f0(jh jhVar) {
        NotificationCenter.getInstance(this.f12578b.f12648n).doOnIdle(jhVar);
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final void a1(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
