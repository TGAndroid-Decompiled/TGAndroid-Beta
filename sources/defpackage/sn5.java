package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class sn5 implements g22 {
    public final wn5 a;

    public sn5(wn5 wn5Var) {
        this.a = wn5Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var;
        wn5 wn5Var = this.a;
        d dVar = wn5Var.a;
        if (dVar != null && dVar.getParentActivity() != null && (i22Var = wn5Var.c) != null) {
            if (i != 8 && i != 7) {
                i22Var.I(i);
                if (i == 0) {
                    wn5Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = i22Var.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = wn5Var.c.d2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                ?? obj2 = new Object();
                arrayList.add(obj2);
                String str = null;
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    String str2 = jo6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = jo6Var.I;
                    }
                    obj2.e = jo6Var.c;
                    obj2.f = jo6Var.g;
                    obj2.k = jo6Var.s;
                    obj2.p = jo6Var.d();
                    obj2.o = jo6Var.b;
                    obj2.z = jo6Var.m;
                    obj2.q = true;
                    CharSequence charSequence = jo6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jo6Var.n;
                    obj2.j = jo6Var.r;
                    obj2.h = jo6Var.x;
                    TLRPC.VideoSize videoSize = jo6Var.S;
                    obj2.v = videoSize;
                    z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str3 = no6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = no6Var;
                    }
                    obj2.e = no6Var.c;
                    obj2.f = no6Var.g;
                    obj2.k = no6Var.s;
                    CharSequence charSequence2 = no6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                    TLRPC.BotInlineResult botInlineResult = no6Var.N;
                    if (botInlineResult != null && no6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = no6Var.O;
                    }
                    System.currentTimeMillis();
                }
            }
            wn5Var.e(arrayList, z5);
            if (i != 8) {
                wn5Var.c.a(true);
            }
        }
    }

    @Override
    public final void I() {
        this.a.q();
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override
    public final void b0() {
        gm.t1(this.a.a.getFragmentView().findFocus());
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
