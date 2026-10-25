package li;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class m implements ri {
    public final ti f17351a;
    public final q f17352b;

    public m(q qVar, ti tiVar) {
        this.f17352b = qVar;
        this.f17351a = tiVar;
    }

    @Override
    public final void A(gh ghVar) {
        NotificationCenter.getInstance(this.f17352b.f17417n).doOnIdle(ghVar);
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f17351a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33030j0;
        v3 v3Var = this.f17352b.f17418r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = v3Var.f17550j4;
            v3Var.f17550j4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        v3Var.Z1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        v3Var.l2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        v3Var.f17550j4 = null;
        tiVar.dismiss(true);
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
