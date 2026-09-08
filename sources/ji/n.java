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
public final class n implements ti {
    public final vi f14093a;
    public final r f14094b;

    public n(r rVar, vi viVar) {
        this.f14094b = rVar;
        this.f14093a = viVar;
    }

    @Override
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.f14094b.f14158n).doOnIdle(hhVar);
    }

    @Override
    public final boolean D0() {
        return false;
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f14093a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31318j0;
        v3 v3Var = this.f14094b.f14159r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = v3Var.f14267b4;
            v3Var.f14267b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        v3Var.S1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        v3Var.e2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        v3Var.f14267b4 = null;
        viVar.dismiss(true);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void K(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
