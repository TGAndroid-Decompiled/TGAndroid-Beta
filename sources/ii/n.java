package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;
public final class n implements vi {
    public final xi f11516a;
    public final r f11517b;

    public n(r rVar, xi xiVar) {
        this.f11517b = rVar;
        this.f11516a = xiVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.f11516a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f30282j0;
        x3 x3Var = this.f11517b.f11586r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = x3Var.f11741i4;
            x3Var.f11741i4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        x3Var.V1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        x3Var.h2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        x3Var.f11741i4 = null;
        xiVar.dismiss(true);
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(ih ihVar) {
        NotificationCenter.getInstance(this.f11517b.f11585n).doOnIdle(ihVar);
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
