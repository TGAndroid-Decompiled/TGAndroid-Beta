package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui;
public final class l implements si {
    public final ui f22213a;
    public final o f22214b;

    public l(o oVar, ui uiVar) {
        this.f22214b = oVar;
        this.f22213a = uiVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        ks.f(this.f22214b.f22266n).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = this.f22213a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40386e2;
        t3 t3Var = this.f22214b.f22267r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = t3Var.f22418j4;
            t3Var.f22418j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ef) {
                    if (aVar != null) {
                        t3Var.X1(aVar, (ef) obj);
                    } else {
                        t3Var.i2((ef) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        t3Var.f22418j4 = null;
        uiVar.a(true);
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
