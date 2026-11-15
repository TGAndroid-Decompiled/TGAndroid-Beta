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
public final class l implements ii {
    public final ki f21781a;
    public final o f21782b;

    public l(o oVar, ki kiVar) {
        this.f21782b = oVar;
        this.f21781a = kiVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(vg vgVar) {
        ns.f(this.f21782b.f21847n).d(vgVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar = this.f21781a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36447e2;
        q3 q3Var = this.f21782b.f21848r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                        q3Var.X1(aVar, (ff) obj);
                    } else {
                        q3Var.i2((ff) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        q3Var.f21924j4 = null;
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
