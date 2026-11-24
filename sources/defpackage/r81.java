package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class r81 extends i81 {
    public jd4 n;
    public final ArrayList r;
    public sn2 s;
    public final w81 w;

    public r81(w81 w81Var) {
        super(w81Var, 1);
        this.w = w81Var;
        this.r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z;
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i < arrayList2.size()) {
                String path = ((p81) arrayList2.get(i)).d.a.getPath();
                if (((p81) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new jo6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        if (this.s == null) {
            sn2 sn2Var = new sn2(new ColorDrawable(cmb.w0(null, cmb.W9, false)), cmb.Q4);
            this.s = sn2Var;
            sn2Var.x = true;
        }
        sha shaVar = (sha) u69Var.a;
        b81 b81Var = ((p81) this.e.get(i)).d;
        Object tag = shaVar.getTag();
        ImageReceiver imageReceiver = shaVar.c;
        if (b81Var == tag) {
            z = true;
        } else {
            z = false;
        }
        shaVar.setTag(b81Var);
        int max = (int) Math.max(100.0f, gm.b1().x / gm.p);
        byte b = b81Var.d;
        File file = b81Var.a;
        if (b == 1) {
            imageReceiver.d0(gn5.g("vthumb://0:" + file.getAbsolutePath()), td4.n(max, max, "_"), this.s, null, null, 0);
            shaVar.m(gm.i0(b81Var.c, false, false), true);
        } else {
            imageReceiver.d0(gn5.g("thumb://0:" + file.getAbsolutePath()), td4.n(max, max, "_"), this.s, null, null, 0);
            shaVar.m(gm.i0(b81Var.c, false, false), false);
        }
        shaVar.i(this.w.h.j.contains(b81Var), z);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        if (this.n == null) {
            this.n = new jd4(viewGroup.getContext(), null);
        }
        q81 q81Var = new q81(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        q81Var.setStyle(1);
        return new u69(q81Var);
    }
}
