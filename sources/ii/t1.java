package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;
public final class t1 implements ui {
    public final wi f11623a;
    public final e2 f11624b;

    public t1(e2 e2Var, wi wiVar) {
        this.f11624b = e2Var;
        this.f11623a = wiVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        wi wiVar = this.f11623a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29677j0;
        e2 e2Var = this.f11624b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = e2Var.P;
            a aVar = x3Var.f11720b4;
            x3Var.f11720b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        e2Var.P.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        e2Var.P.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        e2Var.P.f11720b4 = null;
        wiVar.dismiss(true);
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
    public final void x0(gh ghVar) {
        NotificationCenter.getInstance(this.f11624b.getCurrentAccount()).doOnIdle(ghVar);
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
