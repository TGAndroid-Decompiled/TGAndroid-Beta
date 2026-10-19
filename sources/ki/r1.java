package ki;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class r1 implements ri {
    public final ti f15482a;
    public final d2 f15483b;

    public r1(d2 d2Var, ti tiVar) {
        this.f15483b = d2Var;
        this.f15482a = tiVar;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f15482a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30546j0;
        d2 d2Var = this.f15483b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            w3 w3Var = d2Var.P;
            a aVar = w3Var.Z3;
            w3Var.Z3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        d2Var.P.U1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        d2Var.P.g2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        d2Var.P.Z3 = null;
        tiVar.dismiss(true);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final void u(gh ghVar) {
        NotificationCenter.getInstance(this.f15483b.getCurrentAccount()).doOnIdle(ghVar);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
