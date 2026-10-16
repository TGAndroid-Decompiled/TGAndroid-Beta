package ji;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class s1 implements ti {
    public final vi f13511a;
    public final d2 f13512b;

    public s1(d2 d2Var, vi viVar) {
        this.f13512b = d2Var;
        this.f13511a = viVar;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.f13511a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29684j0;
        d2 d2Var = this.f13512b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = d2Var.P;
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
        viVar.dismiss(true);
    }

    @Override
    public final boolean r0() {
        return false;
    }

    @Override
    public final void v(hh hhVar) {
        NotificationCenter.getInstance(this.f13512b.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void J(Object obj) {
    }

    @Override
    public final void U(TLRPC.User user) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
