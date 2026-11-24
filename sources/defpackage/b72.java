package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class b72 implements v02 {
    public final x02 a;
    public final e72 b;

    public b72(e72 e72Var, x02 x02Var) {
        this.b = e72Var;
        this.a = x02Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        ye9 ye9Var = this.b.r;
        x02 x02Var = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            lk0 lk0Var = ye9Var.j4;
            ye9Var.j4 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                if (obj instanceof jm6) {
                    if (lk0Var != null) {
                        ye9Var.P1(lk0Var, (jm6) obj);
                    } else {
                        ye9Var.a2((jm6) obj);
                    }
                } else {
                    i4++;
                }
            }
        }
        ye9Var.j4 = null;
        x02Var.a(true);
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void z2(vq0 vq0Var) {
        kk7.f(this.b.n).d(vq0Var);
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
