package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class r71 extends j71 {
    public gd4 n;
    public final ArrayList r;
    public zm2 s;
    public final w71 w;

    public r71(w71 w71Var) {
        super(w71Var, 1);
        this.w = w71Var;
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
                String path = ((p71) arrayList2.get(i)).d.a.getPath();
                if (((p71) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new no6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        if (this.s == null) {
            zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.X9, false)), aob.R4);
            this.s = zm2Var;
            zm2Var.x = true;
        }
        jja jjaVar = (jja) f89Var.a;
        c71 c71Var = ((p71) this.e.get(i)).d;
        Object tag = jjaVar.getTag();
        ImageReceiver imageReceiver = jjaVar.c;
        if (c71Var == tag) {
            z = true;
        } else {
            z = false;
        }
        jjaVar.setTag(c71Var);
        int max = (int) Math.max(100.0f, hl.b1().x / hl.p);
        byte b = c71Var.d;
        File file = c71Var.a;
        if (b == 1) {
            imageReceiver.d0(jn5.g("vthumb://0:" + file.getAbsolutePath()), qd4.m(max, max, "_"), this.s, null, null, 0);
            jjaVar.m(hl.i0(c71Var.c, false, false), true);
        } else {
            imageReceiver.d0(jn5.g("thumb://0:" + file.getAbsolutePath()), qd4.m(max, max, "_"), this.s, null, null, 0);
            jjaVar.m(hl.i0(c71Var.c, false, false), false);
        }
        jjaVar.i(this.w.h.j.contains(c71Var), z);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        if (this.n == null) {
            this.n = new gd4(viewGroup.getContext(), null);
        }
        q71 q71Var = new q71(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        q71Var.setStyle(1);
        return new f89(q71Var);
    }
}
