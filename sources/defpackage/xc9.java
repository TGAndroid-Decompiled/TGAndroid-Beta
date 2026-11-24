package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class xc9 implements v02 {
    public final x02 a;
    public final hd9 b;

    public xc9(hd9 hd9Var, x02 x02Var) {
        this.b = hd9Var;
        this.a = x02Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        hd9 hd9Var = this.b;
        if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            ye9 ye9Var = hd9Var.Q;
            lk0 lk0Var = ye9Var.j4;
            ye9Var.j4 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                if (obj instanceof jm6) {
                    ye9 ye9Var2 = hd9Var.Q;
                    if (lk0Var != null) {
                        ye9Var2.P1(lk0Var, (jm6) obj);
                    } else {
                        ye9Var2.a2((jm6) obj);
                    }
                } else {
                    i4++;
                }
            }
        }
        hd9Var.Q.j4 = null;
        x02Var.a(true);
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void z2(vq0 vq0Var) {
        kk7.f(this.b.getCurrentAccount()).d(vq0Var);
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void y0() {
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
