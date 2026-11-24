package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ah4 extends q59 {
    public final Context c;
    public final ch4 d;

    public ah4(ch4 ch4Var, Context context) {
        this.d = ch4Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        ch4 ch4Var = this.d;
        ArrayList arrayList = ch4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / ch4Var.s)) + (!ch4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        ch4 ch4Var = this.d;
        if (i < ((int) Math.ceil(ch4Var.f.size() / ch4Var.s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        ch4 ch4Var = this.d;
        ug4 ug4Var = ch4Var.T;
        ArrayList arrayList = ch4Var.f;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z3 = true;
        if (i2 == 0) {
            tha thaVar = (tha) view;
            thaVar.setItemsCount(ch4Var.s);
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            thaVar.setIsFirst(z2);
            int i3 = 0;
            while (true) {
                byte b = ch4Var.s;
                if (i3 < b) {
                    int i4 = (b * i) + i3;
                    if (i4 < arrayList.size()) {
                        k47 k47Var = (k47) arrayList.get(i4);
                        thaVar.c(i3, arrayList.indexOf(k47Var), k47Var);
                        if (ch4Var.p0.u()) {
                            int e1 = k47Var.e1();
                            ug4Var.a = k47.B0(k47Var.k);
                            ug4Var.b = e1;
                            thaVar.b(i3, ch4Var.p0.e(ug4Var), true);
                        } else {
                            thaVar.b(i3, false, true);
                        }
                    } else {
                        thaVar.c(i3, i4, null);
                    }
                    i3++;
                } else {
                    thaVar.requestLayout();
                    return;
                }
            }
        } else if (i2 == 3) {
            hg3 hg3Var = (hg3) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            hg3Var.t2 = z;
            k47 k47Var2 = (k47) arrayList.get(i);
            if (hg3Var.getMessage() == null || hg3Var.getMessage().e1() != k47Var2.e1()) {
                z3 = false;
            }
            hg3Var.P = ch4Var.q0;
            hg3Var.e0(k47.B0(k47Var2.k), k47Var2, k47Var2.k.date, false, false);
            if (ch4Var.p0.u()) {
                int e12 = k47Var2.e1();
                ug4Var.a = k47.B0(k47Var2.k);
                ug4Var.b = e12;
                hg3Var.d0(ch4Var.p0.e(ug4Var), z3);
                return;
            }
            hg3Var.d0(false, z3);
        } else if (i2 == 1) {
            byte b2 = ch4Var.s;
            ((tk4) view).w = b2 - ((((int) Math.ceil(arrayList.size() / ch4Var.s)) * b2) - arrayList.size());
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        pg4 pg4Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                pg4Var = new pg4((byte) 1, context, this);
                pg4Var.setIsSingleCell(true);
                pg4Var.setViewType(2);
            } else {
                ?? l55Var = new l55(context, null);
                l55Var.setBackgroundColor(cmb.w0(null, cmb.d7, false) & (-218103809));
                pg4Var = l55Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.n = paint;
            frameLayout.s = z8c.t0;
            frameLayout.r = true;
            paint.setColor(cmb.w0(null, cmb.Bi, false));
            frameLayout.b = new k47[6];
            frameLayout.a = new pha[6];
            frameLayout.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                frameLayout.a[i2] = new pha(frameLayout, context);
                frameLayout.addView(frameLayout.a[i2]);
                frameLayout.a[i2].setVisibility(4);
                frameLayout.a[i2].setTag(Integer.valueOf(i2));
                frameLayout.a[i2].setOnClickListener(new oha(frameLayout, (byte) 0));
                frameLayout.a[i2].setOnLongClickListener(new au(frameLayout, (byte) 17));
            }
            frameLayout.setDelegate(new sz4(this));
            pg4Var = frameLayout;
        }
        return kt6.h(pg4Var, pg4Var, -1, -2);
    }
}
