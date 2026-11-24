package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
public final class bc3 implements dhc {
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

    public final go4 e(go4 go4Var) {
        String str;
        if (this.a && ((fgf) this.c).h(go4Var)) {
            fo4 a = go4Var.a();
            String str2 = go4Var.l;
            a.s = wf7.n("application/x-media3-cues");
            a.T = ((fgf) this.c).C(go4Var);
            StringBuilder sb = new StringBuilder();
            sb.append(go4Var.t);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.k = sb.toString();
            a.x = Long.MAX_VALUE;
            return new go4(a);
        }
        return go4Var;
    }
}
