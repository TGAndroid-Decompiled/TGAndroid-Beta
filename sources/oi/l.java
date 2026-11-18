package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.si;
public final class l implements qi {
    public final si f22141a;
    public final o f22142b;

    public l(o oVar, si siVar) {
        this.f22142b = oVar;
        this.f22141a = siVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(eh ehVar) {
        ks.f(this.f22142b.f22209n).d(ehVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        si siVar = this.f22141a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
        s3 s3Var = this.f22142b.f22210r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = s3Var.f22330j4;
            s3Var.f22330j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof ef) {
                    if (aVar != null) {
                        s3Var.X1(aVar, (ef) obj);
                    } else {
                        s3Var.i2((ef) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        s3Var.f22330j4 = null;
        siVar.a(true);
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
