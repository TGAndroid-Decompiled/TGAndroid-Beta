package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class fp3 extends n39 {
    public final wjb c;
    public final int d;
    public final boolean e;
    public final ArrayList f;
    public final mh8 h;
    public int n;
    public ap3 r;
    public final boolean s;

    public fp3(int i, wjb wjbVar) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = wjbVar;
        mh8 mh8Var = new mh8(bkb.Bk, bkb.Ck, bkb.Dk, bkb.Ek, wjbVar);
        this.h = mh8Var;
        mh8Var.o = 0.0f;
        mh8Var.p = 0.0f;
        mh8Var.q = 1.0f;
        na7 q1 = na7.q1(i);
        String M0 = k96.M0(2131749187, null);
        gr grVar = q1.k4;
        arrayList.add(new gp3(grVar.l3.f(), grVar.m3.f(), M0, k96.a0(null, null, 2131749188, Integer.valueOf(grVar.m3.f()))));
        String M02 = k96.M0(2131747055, null);
        kr2 kr2Var = grVar.e1;
        arrayList.add(new gp3(grVar.d1.f(), kr2Var.f(), M02, k96.a0(null, null, 2131747056, Integer.valueOf(kr2Var.f()))));
        String M03 = k96.M0(2131746396, null);
        kr2 kr2Var2 = grVar.f1;
        arrayList.add(new gp3(grVar.h3.f(), kr2Var2.f(), M03, k96.a0(null, null, 2131746397, Integer.valueOf(kr2Var2.f()))));
        String M04 = k96.M0(2131745710, null);
        kr2 kr2Var3 = grVar.U0;
        arrayList.add(new gp3(grVar.T0.f(), kr2Var3.f(), M04, k96.a0(null, null, 2131745711, Integer.valueOf(kr2Var3.f()))));
        String M05 = k96.M0(2131750827, null);
        kr2 kr2Var4 = grVar.W0;
        arrayList.add(new gp3(grVar.V0.f(), kr2Var4.f(), M05, k96.a0(null, null, 2131750828, Integer.valueOf(kr2Var4.f()))));
        arrayList.add(new gp3(grVar.k1.f(), grVar.l1.f(), k96.M0(2131753716, null), k96.a0(null, null, 2131753717, Integer.valueOf(kr2Var4.f()))));
        arrayList.add(new gp3(grVar.g1.f(), grVar.h1.f(), k96.M0(2131752542, null), k96.a0(null, null, 2131752543, Integer.valueOf(kr2Var4.f()))));
        String M06 = k96.M0(2131750594, null);
        kr2 kr2Var5 = grVar.a1;
        arrayList.add(new gp3(grVar.Z0.f(), kr2Var5.f(), M06, k96.a0(null, null, 2131750595, Integer.valueOf(kr2Var5.f()))));
        String M07 = k96.M0(2131752203, null);
        kr2 kr2Var6 = grVar.c1;
        arrayList.add(new gp3(grVar.b1.f(), kr2Var6.f(), M07, k96.a0(null, null, 2131752204, Integer.valueOf(kr2Var6.f()))));
        arrayList.add(new gp3(3, 4, k96.M0(2131751798, null), k96.a0(null, null, 2131751799, 4)));
        String M08 = k96.M0(2131745123, null);
        kr2 kr2Var7 = grVar.R1;
        arrayList.add(new gp3(grVar.Q1.f(), kr2Var7.f(), M08, k96.a0(null, null, 2131745124, Integer.valueOf(kr2Var7.f()))));
        this.d = 1;
        this.e = true;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 0) {
            hp3 hp3Var = (hp3) s49Var.a;
            int i2 = i - (this.e ? 1 : 0);
            ArrayList arrayList = this.f;
            hp3Var.a((gp3) arrayList.get(i2));
            LimitPreviewView limitPreviewView = hp3Var.c;
            limitPreviewView.G = ((gp3) arrayList.get(i2)).e;
            limitPreviewView.c = this.n;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wh4 wh4Var;
        Context context = viewGroup.getContext();
        wjb wjbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                ?? hp3Var = new hp3(context, wjbVar);
                ap3 ap3Var = this.r;
                LimitPreviewView limitPreviewView = hp3Var.c;
                limitPreviewView.setParentViewForGradien(ap3Var);
                limitPreviewView.setStaticGradinet(this.h);
                wh4Var = hp3Var;
            } else {
                wh4Var = new wh4(context, 16, (byte) 0);
            }
        } else if (this.s) {
            ?? a6Var = new a6(context, (byte) 12);
            LinearLayout j = de9.j(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(nh8.c(context.getDrawable(2131232476), nh8.d().a));
            j.addView(imageView, nme.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(k96.M0(2131751337, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            zkb.X(textView, bkb.F6, wjbVar);
            textView.setTypeface(gl.o());
            j.addView(textView, nme.e(-2, -2, 16));
            a6Var.addView(j, nme.e(-2, -2, 17));
            wh4Var = a6Var;
        } else {
            wh4Var = new wh4(context, 64, (byte) 0);
        }
        return ls6.h(wh4Var, wh4Var, -1, -2);
    }
}
