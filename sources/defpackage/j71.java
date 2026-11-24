package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class j71 extends b71 {
    public jb4 n;
    public final ArrayList r;
    public fm2 s;
    public final o71 w;

    public j71(o71 o71Var) {
        super(o71Var, 1);
        this.w = o71Var;
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
                String path = ((h71) arrayList2.get(i)).d.a.getPath();
                if (((h71) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new jm6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        if (this.s == null) {
            fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.W9, false)), bkb.Q4);
            this.s = fm2Var;
            fm2Var.x = true;
        }
        qfa qfaVar = (qfa) s49Var.a;
        u61 u61Var = ((h71) this.e.get(i)).d;
        Object tag = qfaVar.getTag();
        ImageReceiver imageReceiver = qfaVar.c;
        if (u61Var == tag) {
            z = true;
        } else {
            z = false;
        }
        qfaVar.setTag(u61Var);
        int max = (int) Math.max(100.0f, gl.b1().x / gl.p);
        byte b = u61Var.d;
        File file = u61Var.a;
        if (b == 1) {
            imageReceiver.d0(gl5.g("vthumb://0:" + file.getAbsolutePath()), tb4.m(max, max, "_"), this.s, null, null, 0);
            qfaVar.m(gl.i0(u61Var.c, false, false), true);
        } else {
            imageReceiver.d0(gl5.g("thumb://0:" + file.getAbsolutePath()), tb4.m(max, max, "_"), this.s, null, null, 0);
            qfaVar.m(gl.i0(u61Var.c, false, false), false);
        }
        qfaVar.i(this.w.h.j.contains(u61Var), z);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        if (this.n == null) {
            this.n = new jb4(viewGroup.getContext(), null);
        }
        i71 i71Var = new i71(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        i71Var.setStyle(1);
        return new s49(i71Var);
    }
}
