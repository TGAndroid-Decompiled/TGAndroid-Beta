package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class wp3 extends c79 {
    public final vnb c;
    public final int d;
    public final boolean e;
    public final ArrayList f;
    public final al8 h;
    public int n;
    public rp3 r;
    public final boolean s;

    public wp3(int i, vnb vnbVar) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = vnbVar;
        al8 al8Var = new al8(aob.Ck, aob.Dk, aob.Ek, aob.Fk, vnbVar);
        this.h = al8Var;
        al8Var.o = 0.0f;
        al8Var.p = 0.0f;
        al8Var.q = 1.0f;
        uc7 s1 = uc7.s1(i);
        String M0 = ob6.M0(2131749133, null);
        hr hrVar = s1.k4;
        arrayList.add(new xp3(hrVar.t3.f(), hrVar.u3.f(), M0, ob6.a0(null, null, 2131749134, Integer.valueOf(hrVar.u3.f()))));
        String M02 = ob6.M0(2131746975, null);
        ds2 ds2Var = hrVar.m1;
        arrayList.add(new xp3(hrVar.l1.f(), ds2Var.f(), M02, ob6.a0(null, null, 2131746976, Integer.valueOf(ds2Var.f()))));
        String M03 = ob6.M0(2131746316, null);
        ds2 ds2Var2 = hrVar.n1;
        arrayList.add(new xp3(hrVar.p3.f(), ds2Var2.f(), M03, ob6.a0(null, null, 2131746317, Integer.valueOf(ds2Var2.f()))));
        String M04 = ob6.M0(2131745630, null);
        ds2 ds2Var3 = hrVar.c1;
        arrayList.add(new xp3(hrVar.b1.f(), ds2Var3.f(), M04, ob6.a0(null, null, 2131745631, Integer.valueOf(ds2Var3.f()))));
        String M05 = ob6.M0(2131750804, null);
        ds2 ds2Var4 = hrVar.e1;
        arrayList.add(new xp3(hrVar.d1.f(), ds2Var4.f(), M05, ob6.a0(null, null, 2131750805, Integer.valueOf(ds2Var4.f()))));
        arrayList.add(new xp3(hrVar.s1.f(), hrVar.t1.f(), ob6.M0(2131753712, null), ob6.a0(null, null, 2131753713, Integer.valueOf(ds2Var4.f()))));
        arrayList.add(new xp3(hrVar.o1.f(), hrVar.p1.f(), ob6.M0(2131752535, null), ob6.a0(null, null, 2131752536, Integer.valueOf(ds2Var4.f()))));
        String M06 = ob6.M0(2131750571, null);
        ds2 ds2Var5 = hrVar.i1;
        arrayList.add(new xp3(hrVar.h1.f(), ds2Var5.f(), M06, ob6.a0(null, null, 2131750572, Integer.valueOf(ds2Var5.f()))));
        String M07 = ob6.M0(2131752180, null);
        ds2 ds2Var6 = hrVar.k1;
        arrayList.add(new xp3(hrVar.j1.f(), ds2Var6.f(), M07, ob6.a0(null, null, 2131752181, Integer.valueOf(ds2Var6.f()))));
        arrayList.add(new xp3(3, 4, ob6.M0(2131751775, null), ob6.a0(null, null, 2131751776, 4)));
        String M08 = ob6.M0(2131745043, null);
        ds2 ds2Var7 = hrVar.Z1;
        arrayList.add(new xp3(hrVar.Y1.f(), ds2Var7.f(), M08, ob6.a0(null, null, 2131745044, Integer.valueOf(ds2Var7.f()))));
        this.d = 1;
        this.e = true;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(f89 f89Var) {
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
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            yp3 yp3Var = (yp3) f89Var.a;
            int i2 = i - (this.e ? 1 : 0);
            ArrayList arrayList = this.f;
            yp3Var.a((xp3) arrayList.get(i2));
            LimitPreviewView limitPreviewView = yp3Var.c;
            limitPreviewView.G = ((xp3) arrayList.get(i2)).e;
            limitPreviewView.c = this.n;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ak4 ak4Var;
        Context context = viewGroup.getContext();
        vnb vnbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                ?? yp3Var = new yp3(context, vnbVar);
                rp3 rp3Var = this.r;
                LimitPreviewView limitPreviewView = yp3Var.c;
                limitPreviewView.setParentViewForGradien(rp3Var);
                limitPreviewView.setStaticGradinet(this.h);
                ak4Var = yp3Var;
            } else {
                ak4Var = new ak4(context, 16, (byte) 0);
            }
        } else if (this.s) {
            ?? b6Var = new b6(context, (byte) 12);
            LinearLayout j = uh9.j(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(bl8.c(context.getDrawable(2131232487), bl8.d().a));
            j.addView(imageView, tre.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(ob6.M0(2131751314, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            yob.X(textView, aob.G6, vnbVar);
            textView.setTypeface(hl.o());
            j.addView(textView, tre.e(-2, -2, 16));
            b6Var.addView(j, tre.e(-2, -2, 17));
            ak4Var = b6Var;
        } else {
            ak4Var = new ak4(context, 64, (byte) 0);
        }
        return qu6.h(ak4Var, ak4Var, -1, -2);
    }
}
