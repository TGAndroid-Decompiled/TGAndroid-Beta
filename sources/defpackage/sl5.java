package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class sl5 implements v02 {
    public final wl5 a;

    public sl5(wl5 wl5Var) {
        this.a = wl5Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var;
        wl5 wl5Var = this.a;
        d dVar = wl5Var.a;
        if (dVar != null && dVar.getParentActivity() != null && (x02Var = wl5Var.c) != null) {
            if (i != 8 && i != 7) {
                x02Var.J(i);
                if (i == 0) {
                    wl5Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = x02Var.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = wl5Var.c.d2.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                ?? obj2 = new Object();
                arrayList.add(obj2);
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
                    obj2.o = jm6Var.b;
                    obj2.z = jm6Var.m;
                    obj2.q = true;
                    CharSequence charSequence = jm6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jm6Var.n;
                    obj2.j = jm6Var.r;
                    obj2.h = jm6Var.x;
                    TLRPC.VideoSize videoSize = jm6Var.S;
                    obj2.v = videoSize;
                    z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            wl5Var.e(arrayList, z5);
            if (i != 8) {
                wl5Var.c.a(true);
            }
        }
    }

    @Override
    public final void I0() {
        gl.t1(this.a.a.getFragmentView().findFocus());
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
    public final void z0() {
        this.a.q();
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
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
