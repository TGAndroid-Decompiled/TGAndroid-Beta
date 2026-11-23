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
public final class p1 implements si {
    public final ui f22265a;
    public final a2 f22266b;

    public p1(a2 a2Var, ui uiVar) {
        this.f22266b = a2Var;
        this.f22265a = uiVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(gh ghVar) {
        ls.f(this.f22266b.getCurrentAccount()).d(ghVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = this.f22265a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40363e2;
        a2 a2Var = this.f22266b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            s3 s3Var = a2Var.Q;
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
                        a2Var.Q.X1(aVar, (ff) obj);
                    } else {
                        a2Var.Q.i2((ff) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        a2Var.Q.f22358j4 = null;
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
