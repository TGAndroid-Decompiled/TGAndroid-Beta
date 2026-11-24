package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
public final class pa3 implements dfc {
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

    public final fm4 e(fm4 fm4Var) {
        String str;
        if (this.a && ((eef) this.c).h(fm4Var)) {
            em4 a = fm4Var.a();
            String str2 = fm4Var.l;
            a.s = ud7.n("application/x-media3-cues");
            a.T = ((eef) this.c).y(fm4Var);
            StringBuilder sb = new StringBuilder();
            sb.append(fm4Var.t);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.k = sb.toString();
            a.x = Long.MAX_VALUE;
            return new fm4(a);
        }
        return fm4Var;
    }
}
