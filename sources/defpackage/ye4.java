package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ye4 extends n39 {
    public final Context c;
    public final af4 d;

    public ye4(af4 af4Var, Context context) {
        this.d = af4Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        af4 af4Var = this.d;
        ArrayList arrayList = af4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / af4Var.s)) + (!af4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        af4 af4Var = this.d;
        if (i < ((int) Math.ceil(af4Var.f.size() / af4Var.s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        af4 af4Var = this.d;
        se4 se4Var = af4Var.T;
        ArrayList arrayList = af4Var.f;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z3 = true;
        if (i2 == 0) {
            rfa rfaVar = (rfa) view;
            rfaVar.setItemsCount(af4Var.s);
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rfaVar.setIsFirst(z2);
            int i3 = 0;
            while (true) {
                byte b = af4Var.s;
                if (i3 < b) {
                    int i4 = (b * i) + i3;
                    if (i4 < arrayList.size()) {
                        k27 k27Var = (k27) arrayList.get(i4);
                        rfaVar.c(i3, arrayList.indexOf(k27Var), k27Var);
                        if (af4Var.p0.t()) {
                            int e1 = k27Var.e1();
                            se4Var.a = k27.B0(k27Var.k);
                            se4Var.b = e1;
                            rfaVar.b(i3, af4Var.p0.b(se4Var), true);
                        } else {
                            rfaVar.b(i3, false, true);
                        }
                    } else {
                        rfaVar.c(i3, i4, null);
                    }
                    i3++;
                } else {
                    rfaVar.requestLayout();
                    return;
                }
            }
        } else if (i2 == 3) {
            ue3 ue3Var = (ue3) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            ue3Var.t2 = z;
            k27 k27Var2 = (k27) arrayList.get(i);
            if (ue3Var.getMessage() == null || ue3Var.getMessage().e1() != k27Var2.e1()) {
                z3 = false;
            }
            ue3Var.P = af4Var.q0;
            ue3Var.f0(k27.B0(k27Var2.k), k27Var2, k27Var2.k.date, false, false);
            if (af4Var.p0.t()) {
                int e12 = k27Var2.e1();
                se4Var.a = k27.B0(k27Var2.k);
                se4Var.b = e12;
                ue3Var.e0(af4Var.p0.b(se4Var), z3);
                return;
            }
            ue3Var.e0(false, z3);
        } else if (i2 == 1) {
            byte b2 = af4Var.s;
            ((pi4) view).w = b2 - ((((int) Math.ceil(arrayList.size() / af4Var.s)) * b2) - arrayList.size());
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ne4 ne4Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                ne4Var = new ne4((byte) 1, context, this);
                ne4Var.setIsSingleCell(true);
                ne4Var.setViewType(2);
            } else {
                ?? l35Var = new l35(context, null);
                l35Var.setBackgroundColor(bkb.w0(null, bkb.d7, false) & (-218103809));
                ne4Var = l35Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.n = paint;
            frameLayout.s = y6c.t0;
            frameLayout.r = true;
            paint.setColor(bkb.w0(null, bkb.Bi, false));
            frameLayout.b = new k27[6];
            frameLayout.a = new ofa[6];
            frameLayout.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                frameLayout.a[i2] = new ofa(frameLayout, context);
                frameLayout.addView(frameLayout.a[i2]);
                frameLayout.a[i2].setVisibility(4);
                frameLayout.a[i2].setTag(Integer.valueOf(i2));
                frameLayout.a[i2].setOnClickListener(new ik8(frameLayout, (byte) 27));
                frameLayout.a[i2].setOnLongClickListener(new zs(frameLayout, (byte) 17));
            }
            frameLayout.setDelegate(new gi3(this));
            ne4Var = frameLayout;
        }
        return ls6.h(ne4Var, ne4Var, -1, -2);
    }
}
