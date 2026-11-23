package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class q1 implements ri {
    public final ti f22393a;
    public final b2 f22394b;

    public q1(b2 b2Var, ti tiVar) {
        this.f22394b = b2Var;
        this.f22393a = tiVar;
    }

    @Override
    public final void S(fh fhVar) {
        ks.f(this.f22394b.getCurrentAccount()).d(fhVar);
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ti tiVar = this.f22393a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
        b2 b2Var = this.f22394b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            t3 t3Var = b2Var.Q;
            a aVar = t3Var.f22488j4;
            t3Var.f22488j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ef) {
                    if (aVar != null) {
                        b2Var.Q.X1(aVar, (ef) obj);
                    } else {
                        b2Var.Q.i2((ef) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        b2Var.Q.f22488j4 = null;
        tiVar.a(true);
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void O0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
