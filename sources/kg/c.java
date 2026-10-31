package kg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.sk0;
import w7.b6;
public final class c extends sk0 {
    public final p6 f11009c;
    public final int d;
    public final int e;
    public final ArrayList f11010f;
    public final k1 h;
    public int f11011n;
    public b f11012r;
    public final boolean f11013s;

    public c(int i10, p6 p6Var) {
        ArrayList arrayList = new ArrayList();
        this.f11010f = arrayList;
        this.f11013s = true;
        this.f11009c = p6Var;
        k1 k1Var = new k1(t6.zk, t6.Ak, t6.Bk, t6.Ck, p6Var);
        this.h = k1Var;
        k1Var.f11150o = 0.0f;
        k1Var.f11151p = 0.0f;
        k1Var.f11152q = 1.0f;
        vp r12 = vp.r1(i10);
        arrayList.add(new d(r12.E4, r12.F4, cd.L0(2131749388, null), cd.a0(null, null, 2131749389, Integer.valueOf(r12.F4))));
        arrayList.add(new d(r12.Q4, r12.R4, cd.L0(2131747264, null), cd.a0(null, null, 2131747265, Integer.valueOf(r12.R4))));
        arrayList.add(new d(r12.S4, r12.T4, cd.L0(2131746604, null), cd.a0(null, null, 2131746605, Integer.valueOf(r12.T4))));
        arrayList.add(new d(r12.G4, r12.H4, cd.L0(2131745919, null), cd.a0(null, null, 2131745920, Integer.valueOf(r12.H4))));
        arrayList.add(new d(r12.I4, r12.J4, cd.L0(2131750840, null), cd.a0(null, null, 2131750841, Integer.valueOf(r12.J4))));
        arrayList.add(new d(r12.Y4, r12.Z4, cd.L0(2131753719, null), cd.a0(null, null, 2131753720, Integer.valueOf(r12.J4))));
        arrayList.add(new d(r12.U4, r12.V4, cd.L0(2131752554, null), cd.a0(null, null, 2131752555, Integer.valueOf(r12.J4))));
        arrayList.add(new d(r12.M4, r12.N4, cd.L0(2131750612, null), cd.a0(null, null, 2131750613, Integer.valueOf(r12.N4))));
        arrayList.add(new d(r12.O4, r12.P4, cd.L0(2131752215, null), cd.a0(null, null, 2131752216, Integer.valueOf(r12.P4))));
        arrayList.add(new d(3, 4, cd.L0(2131751810, null), cd.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(r12.f18945x4, r12.f18954y4, cd.L0(2131745333, null), cd.a0(null, null, 2131745334, Integer.valueOf(r12.f18954y4))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f47901f == 0) {
            e eVar = (e) c1Var.f47898a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f11010f;
            eVar.a((d) arrayList.get(i11));
            LimitPreviewView limitPreviewView = eVar.f11042c;
            limitPreviewView.F = ((d) arrayList.get(i11)).e;
            limitPreviewView.f24101c = this.f11011n;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        x3 x3Var;
        Context context = viewGroup.getContext();
        p6 p6Var = this.f11009c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? eVar = new e(context, p6Var);
                b bVar = this.f11012r;
                LimitPreviewView limitPreviewView = eVar.f11042c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                x3Var = eVar;
            } else {
                x3Var = new x3(context, 16);
            }
        } else if (this.f11013s) {
            ?? a5Var = new a5(context, 6);
            LinearLayout f7 = m5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ea.f.c(context.getDrawable(2131232470), (k1) ea.f.d().f6474b));
            f7.addView(imageView, b6.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(cd.L0(2131751350, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            a7.V(textView, t6.G6, p6Var);
            textView.setTypeface(org.telegram.messenger.i0.o());
            f7.addView(textView, b6.e(-2, -2, 16));
            a5Var.addView(f7, b6.e(-2, -2, 17));
            x3Var = a5Var;
        } else {
            x3Var = new x3(context, 64);
        }
        return sc.e.o(x3Var, x3Var, -1, -2);
    }
}
