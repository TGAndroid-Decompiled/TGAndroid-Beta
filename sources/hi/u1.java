package hi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;
public final class u1 implements wi {
    public final yi f9883a;
    public final g2 f9884b;

    public u1(g2 g2Var, yi yiVar) {
        this.f9884b = g2Var;
        this.f9883a = yiVar;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f9883a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
        g2 g2Var = this.f9884b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            z3 z3Var = g2Var.P;
            a aVar = z3Var.f9993b4;
            z3Var.f9993b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        g2Var.P.S1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        g2Var.P.e2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        g2Var.P.f9993b4 = null;
        yiVar.dismiss(true);
    }

    @Override
    public final boolean R1() {
        return false;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(jh jhVar) {
        NotificationCenter.getInstance(this.f9884b.getCurrentAccount()).doOnIdle(jhVar);
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
