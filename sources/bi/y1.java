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
public final class y1 implements ai {
    public final bi f3459a;
    public final k2 f3460b;

    public y1(k2 k2Var, bi biVar) {
        this.f3460b = k2Var;
        this.f3459a = biVar;
    }

    @Override
    public final void C(mg mgVar) {
        at.f(this.f3460b.getCurrentAccount()).d(mgVar);
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.f3459a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        k2 k2Var = this.f3460b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            d4 d4Var = k2Var.P;
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
                        k2Var.P.W1(aVar, (ff) obj);
                    } else {
                        k2Var.P.i2((ff) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        k2Var.P.f2931i4 = null;
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
