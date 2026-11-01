package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.ff;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.mg;
public final class q implements ai {
    public final bi f3289a;
    public final t f3290b;

    public q(t tVar, bi biVar) {
        this.f3290b = tVar;
        this.f3289a = biVar;
    }

    @Override
    public final void C(mg mgVar) {
        at.f(this.f3290b.f3349n).d(mgVar);
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.f3289a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        d4 d4Var = this.f3290b.f3350r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = d4Var.f2931i4;
            d4Var.f2931i4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof ff) {
                    if (aVar != null) {
                        d4Var.W1(aVar, (ff) obj);
                    } else {
                        d4Var.i2((ff) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        d4Var.f2931i4 = null;
        biVar.a(true);
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void N() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void n0(Object obj) {
    }

    @Override
    public final void v0(TLRPC.User user) {
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
