package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class m82 implements g22 {
    public final i22 a;
    public final p82 b;

    public m82(p82 p82Var, i22 i22Var) {
        this.b = p82Var;
        this.a = i22Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        ch9 ch9Var = this.b.r;
        i22 i22Var = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            ll0 ll0Var = ch9Var.j4;
            ch9Var.j4 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                if (obj instanceof jo6) {
                    if (ll0Var != null) {
                        ch9Var.P1(ll0Var, (jo6) obj);
                    } else {
                        ch9Var.a2((jo6) obj);
                    }
                } else {
                    i4++;
                }
            }
        }
        ch9Var.j4 = null;
        i22Var.a(true);
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        nm7.f(this.b.n).d(vr0Var);
    }

    @Override
    public final void I() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
