package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class n implements ti {
    public final vi f11508a;
    public final r f11509b;

    public n(r rVar, vi viVar) {
        this.f11509b = rVar;
        this.f11508a = viVar;
    }

    @Override
    public final void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f11508a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29108j0;
        w3 w3Var = this.f11509b.f11592r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = w3Var.f11707b4;
            w3Var.f11707b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        w3Var.U1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        w3Var.g2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        w3Var.f11707b4 = null;
        viVar.dismiss(true);
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void y0(gh ghVar) {
        NotificationCenter.getInstance(this.f11509b.f11591n).doOnIdle(ghVar);
    }

    @Override
    public final void V0(Object obj) {
    }

    @Override
    public final void k1(TLRPC.User user) {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
