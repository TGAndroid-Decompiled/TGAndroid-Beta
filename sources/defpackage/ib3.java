package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
public final class ib3 implements cjc {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public boolean a;
    public byte b;
    public Object c;

    public static void d(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 < 7) {
                if (d[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override
    public final void a() {
        this.a = true;
    }

    @Override
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    public final ko4 e(ko4 ko4Var) {
        String str;
        if (this.a && ((uif) this.c).j(ko4Var)) {
            jo4 a = ko4Var.a();
            String str2 = ko4Var.l;
            a.s = eg7.n("application/x-media3-cues");
            a.T = ((uif) this.c).y(ko4Var);
            StringBuilder sb = new StringBuilder();
            sb.append(ko4Var.t);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.k = sb.toString();
            a.x = Long.MAX_VALUE;
            return new ko4(a);
        }
        return ko4Var;
    }
}
