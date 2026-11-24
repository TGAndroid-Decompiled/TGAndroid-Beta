package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class pq3 extends q59 {
    public final ylb c;
    public final int d;
    public final boolean e;
    public final ArrayList f;
    public final nj8 h;
    public int n;
    public kq3 r;
    public final boolean s;

    public pq3(int i, ylb ylbVar) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = ylbVar;
        nj8 nj8Var = new nj8(cmb.Bk, cmb.Ck, cmb.Dk, cmb.Ek, ylbVar);
        this.h = nj8Var;
        nj8Var.o = 0.0f;
        nj8Var.p = 0.0f;
        nj8Var.q = 1.0f;
        oc7 r1 = oc7.r1(i);
        String M0 = jb6.M0(2131749136, null);
        gs gsVar = r1.l4;
        arrayList.add(new qq3(gsVar.l3.f(), gsVar.m3.f(), M0, jb6.a0(null, null, 2131749137, Integer.valueOf(gsVar.m3.f()))));
        String M02 = jb6.M0(2131746981, null);
        vs2 vs2Var = gsVar.e1;
        arrayList.add(new qq3(gsVar.d1.f(), vs2Var.f(), M02, jb6.a0(null, null, 2131746982, Integer.valueOf(vs2Var.f()))));
        String M03 = jb6.M0(2131746322, null);
        vs2 vs2Var2 = gsVar.f1;
        arrayList.add(new qq3(gsVar.h3.f(), vs2Var2.f(), M03, jb6.a0(null, null, 2131746323, Integer.valueOf(vs2Var2.f()))));
        String M04 = jb6.M0(2131745636, null);
        vs2 vs2Var3 = gsVar.U0;
        arrayList.add(new qq3(gsVar.T0.f(), vs2Var3.f(), M04, jb6.a0(null, null, 2131745637, Integer.valueOf(vs2Var3.f()))));
        String M05 = jb6.M0(2131750776, null);
        vs2 vs2Var4 = gsVar.W0;
        arrayList.add(new qq3(gsVar.V0.f(), vs2Var4.f(), M05, jb6.a0(null, null, 2131750777, Integer.valueOf(vs2Var4.f()))));
        arrayList.add(new qq3(gsVar.k1.f(), gsVar.l1.f(), jb6.M0(2131753684, null), jb6.a0(null, null, 2131753685, Integer.valueOf(vs2Var4.f()))));
        arrayList.add(new qq3(gsVar.g1.f(), gsVar.h1.f(), jb6.M0(2131752507, null), jb6.a0(null, null, 2131752508, Integer.valueOf(vs2Var4.f()))));
        String M06 = jb6.M0(2131750543, null);
        vs2 vs2Var5 = gsVar.a1;
        arrayList.add(new qq3(gsVar.Z0.f(), vs2Var5.f(), M06, jb6.a0(null, null, 2131750544, Integer.valueOf(vs2Var5.f()))));
        String M07 = jb6.M0(2131752152, null);
        vs2 vs2Var6 = gsVar.c1;
        arrayList.add(new qq3(gsVar.b1.f(), vs2Var6.f(), M07, jb6.a0(null, null, 2131752153, Integer.valueOf(vs2Var6.f()))));
        arrayList.add(new qq3(3, 4, jb6.M0(2131751747, null), jb6.a0(null, null, 2131751748, 4)));
        String M08 = jb6.M0(2131745049, null);
        vs2 vs2Var7 = gsVar.R1;
        arrayList.add(new qq3(gsVar.Q1.f(), vs2Var7.f(), M08, jb6.a0(null, null, 2131745050, Integer.valueOf(vs2Var7.f()))));
        this.d = 1;
        this.e = true;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 0) {
            rq3 rq3Var = (rq3) u69Var.a;
            int i2 = i - (this.e ? 1 : 0);
            ArrayList arrayList = this.f;
            rq3Var.a((qq3) arrayList.get(i2));
            LimitPreviewView limitPreviewView = rq3Var.c;
            limitPreviewView.G = ((qq3) arrayList.get(i2)).e;
            limitPreviewView.c = this.n;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ak4 ak4Var;
        Context context = viewGroup.getContext();
        ylb ylbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                ?? rq3Var = new rq3(context, ylbVar);
                kq3 kq3Var = this.r;
                LimitPreviewView limitPreviewView = rq3Var.c;
                limitPreviewView.setParentViewForGradien(kq3Var);
                limitPreviewView.setStaticGradinet(this.h);
                ak4Var = rq3Var;
            } else {
                ak4Var = new ak4(context, 16, (byte) 0);
            }
        } else if (this.s) {
            ?? a6Var = new a6(context, (byte) 12);
            LinearLayout i2 = hg9.i(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(oj8.c(context.getDrawable(2131232488), oj8.d().a));
            i2.addView(imageView, qoe.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(jb6.M0(2131751286, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            anb.X(textView, cmb.F6, ylbVar);
            textView.setTypeface(gm.o());
            i2.addView(textView, qoe.e(-2, -2, 16));
            a6Var.addView(i2, qoe.e(-2, -2, 17));
            ak4Var = a6Var;
        } else {
            ak4Var = new ak4(context, 64, (byte) 0);
        }
        return kt6.h(ak4Var, ak4Var, -1, -2);
    }
}
