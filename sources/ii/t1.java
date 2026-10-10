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
public final class t1 implements wi {
    public final yi f12702a;
    public final e2 f12703b;

    public t1(e2 e2Var, yi yiVar) {
        this.f12703b = e2Var;
        this.f12702a = yiVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f12702a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33247j0;
        e2 e2Var = this.f12703b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = e2Var.P;
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
                        e2Var.P.U1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        e2Var.P.g2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        e2Var.P.Z3 = null;
        yiVar.dismiss(true);
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void f0(jh jhVar) {
        NotificationCenter.getInstance(this.f12703b.getCurrentAccount()).doOnIdle(jhVar);
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
