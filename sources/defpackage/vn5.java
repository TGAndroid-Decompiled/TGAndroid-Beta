package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class vn5 implements l12 {
    public final zn5 a;

    public vn5(zn5 zn5Var) {
        this.a = zn5Var;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void R() {
        this.a.q();
    }

    @Override
    public final void V() {
        hl.t1(this.a.a.getFragmentView().findFocus());
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var;
        zn5 zn5Var = this.a;
        e eVar = zn5Var.a;
        if (eVar != null && eVar.getParentActivity() != null && (n12Var = zn5Var.c) != null) {
            if (i != 8 && i != 7) {
                n12Var.I(i);
                if (i == 0) {
                    zn5Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = n12Var.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = zn5Var.c.d2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.o = no6Var.b;
                    obj2.z = no6Var.m;
                    obj2.q = true;
                    CharSequence charSequence = no6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                    TLRPC.VideoSize videoSize = no6Var.S;
                    obj2.v = videoSize;
                    z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            zn5Var.e(arrayList, z5);
            if (i != 8) {
                zn5Var.c.a(true);
            }
        }
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
