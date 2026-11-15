package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ff;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vg;
public final class o1 implements ii {
    public final ki f21854a;
    public final z1 f21855b;

    public o1(z1 z1Var, ki kiVar) {
        this.f21855b = z1Var;
        this.f21854a = kiVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(vg vgVar) {
        ns.f(this.f21855b.getCurrentAccount()).d(vgVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar = this.f21854a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
        z1 z1Var = this.f21855b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            q3 q3Var = z1Var.Q;
            a aVar = q3Var.f21924j4;
            q3Var.f21924j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ff) {
                    if (aVar != null) {
                        z1Var.Q.X1(aVar, (ff) obj);
                    } else {
                        z1Var.Q.i2((ff) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        z1Var.Q.f21924j4 = null;
        kiVar.a(true);
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void h1(TLRPC.User user) {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
