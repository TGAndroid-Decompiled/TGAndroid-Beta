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
public final class o1 implements qi {
    public final si f22216a;
    public final z1 f22217b;

    public o1(z1 z1Var, si siVar) {
        this.f22217b = z1Var;
        this.f22216a = siVar;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(eh ehVar) {
        ks.f(this.f22217b.getCurrentAccount()).d(ehVar);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        si siVar = this.f22216a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
        z1 z1Var = this.f22217b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            s3 s3Var = z1Var.Q;
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
                        z1Var.Q.X1(aVar, (ef) obj);
                    } else {
                        z1Var.Q.i2((ef) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        z1Var.Q.f22330j4 = null;
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
