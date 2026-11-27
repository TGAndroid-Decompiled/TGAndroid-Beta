package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class n62 implements l12 {
    public final e a;
    public final pcc b;
    public final f41 c;

    public n62(f41 f41Var, pcc pccVar, e eVar) {
        this.a = eVar;
        this.b = pccVar;
        this.c = f41Var;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        jn7.f(this.a.getCurrentAccount()).d(vq0Var);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        f41 f41Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = f41Var.d2;
        pcc pccVar = this.b;
        if (i == 15) {
            e eVar = this.a;
            jj.d0(eVar.getContext(), eVar.getResourceProvider(), null, null, new m62(pccVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                ?? obj2 = new Object();
                String str = null;
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str2 = no6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = no6Var.I;
                    }
                    obj2.e = no6Var.c;
                    obj2.f = no6Var.g;
                    obj2.k = no6Var.s;
                    obj2.p = no6Var.d();
                    obj2.z = no6Var.m;
                    obj2.q = true;
                    obj2.o = no6Var.b;
                    CharSequence charSequence = no6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                    obj2.v = no6Var.S;
                    obj2.y = no6Var;
                } else if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    String str3 = ro6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = ro6Var;
                    }
                    obj2.e = ro6Var.c;
                    obj2.f = ro6Var.g;
                    obj2.k = ro6Var.s;
                    CharSequence charSequence2 = ro6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = ro6Var.n;
                    obj2.j = ro6Var.r;
                    obj2.h = ro6Var.x;
                    TLRPC.BotInlineResult botInlineResult = ro6Var.N;
                    if (botInlineResult != null && ro6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = ro6Var.O;
                    }
                    System.currentTimeMillis();
                }
                pccVar.a(new dh8(obj2));
            }
        }
        f41Var.a(true);
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
