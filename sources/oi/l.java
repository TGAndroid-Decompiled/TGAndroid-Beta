package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ff;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui;
public final class l implements si {
    public final ui f22167a;
    public final o f22168b;

    public l(o oVar, ui uiVar) {
        this.f22168b = oVar;
        this.f22167a = uiVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        ls.f(this.f22168b.f22236n).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = this.f22167a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40363e2;
        s3 s3Var = this.f22168b.f22237r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = s3Var.f22358j4;
            s3Var.f22358j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ff) {
                    if (aVar != null) {
                        s3Var.X1(aVar, (ff) obj);
                    } else {
                        s3Var.i2((ff) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        s3Var.f22358j4 = null;
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
