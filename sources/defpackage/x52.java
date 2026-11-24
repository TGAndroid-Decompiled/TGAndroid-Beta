package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class x52 implements v02 {
    public final d a;
    public final p8c b;
    public final x31 c;

    public x52(x31 x31Var, p8c p8cVar, d dVar) {
        this.a = dVar;
        this.b = p8cVar;
        this.c = x31Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x31 x31Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x31Var.d2;
        p8c p8cVar = this.b;
        if (i == 15) {
            d dVar = this.a;
            ij.d0(dVar.getContext(), dVar.getResourceProvider(), null, null, new w52(p8cVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof jm6) {
                    jm6 jm6Var = (jm6) obj;
                    String str2 = jm6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = jm6Var.I;
                    }
                    obj2.e = jm6Var.c;
                    obj2.f = jm6Var.g;
                    obj2.k = jm6Var.s;
                    obj2.p = jm6Var.d();
                    obj2.z = jm6Var.m;
                    obj2.q = true;
                    obj2.o = jm6Var.b;
                    CharSequence charSequence = jm6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jm6Var.n;
                    obj2.j = jm6Var.r;
                    obj2.h = jm6Var.x;
                    obj2.v = jm6Var.S;
                    obj2.y = jm6Var;
                } else if (obj instanceof nm6) {
                    nm6 nm6Var = (nm6) obj;
                    String str3 = nm6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = nm6Var;
                    }
                    obj2.e = nm6Var.c;
                    obj2.f = nm6Var.g;
                    obj2.k = nm6Var.s;
                    CharSequence charSequence2 = nm6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = nm6Var.n;
                    obj2.j = nm6Var.r;
                    obj2.h = nm6Var.x;
                    TLRPC.BotInlineResult botInlineResult = nm6Var.N;
                    if (botInlineResult != null && nm6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = nm6Var.O;
                    }
                    System.currentTimeMillis();
                }
                p8cVar.a(new pd8(obj2));
            }
        }
        x31Var.a(true);
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
        kk7.f(this.a.getCurrentAccount()).d(vq0Var);
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
