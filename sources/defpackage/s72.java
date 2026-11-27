package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class s72 implements l12 {
    public final n12 a;
    public final v72 b;

    public s72(v72 v72Var, n12 n12Var) {
        this.b = v72Var;
        this.a = n12Var;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        jn7.f(this.b.n).d(vq0Var);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        pi9 pi9Var = this.b.r;
        n12 n12Var = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            mk0 mk0Var = pi9Var.j4;
            pi9Var.j4 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                if (obj instanceof no6) {
                    if (mk0Var != null) {
                        pi9Var.Q1(mk0Var, (no6) obj);
                    } else {
                        pi9Var.b2((no6) obj);
                    }
                } else {
                    i4++;
                }
            }
        }
        pi9Var.j4 = null;
        n12Var.a(true);
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
