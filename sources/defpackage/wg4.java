package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class wg4 extends c79 {
    public final Context c;
    public final yg4 d;

    public wg4(yg4 yg4Var, Context context) {
        this.d = yg4Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        yg4 yg4Var = this.d;
        ArrayList arrayList = yg4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / yg4Var.s)) + (!yg4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        yg4 yg4Var = this.d;
        if (i < ((int) Math.ceil(yg4Var.f.size() / yg4Var.s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        yg4 yg4Var = this.d;
        qg4 qg4Var = yg4Var.T;
        ArrayList arrayList = yg4Var.f;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z3 = true;
        if (i2 == 0) {
            kja kjaVar = (kja) view;
            kjaVar.setItemsCount(yg4Var.s);
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            kjaVar.setIsFirst(z2);
            int i3 = 0;
            while (true) {
                byte b = yg4Var.s;
                if (i3 < b) {
                    int i4 = (b * i) + i3;
                    if (i4 < arrayList.size()) {
                        r47 r47Var = (r47) arrayList.get(i4);
                        kjaVar.c(i3, arrayList.indexOf(r47Var), r47Var);
                        if (yg4Var.p0.u()) {
                            int e1 = r47Var.e1();
                            qg4Var.a = r47.B0(r47Var.k);
                            qg4Var.b = e1;
                            kjaVar.b(i3, yg4Var.p0.d(qg4Var), true);
                        } else {
                            kjaVar.b(i3, false, true);
                        }
                    } else {
                        kjaVar.c(i3, i4, null);
                    }
                    i3++;
                } else {
                    kjaVar.requestLayout();
                    return;
                }
            }
        } else if (i2 == 3) {
            of3 of3Var = (of3) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            of3Var.t2 = z;
            r47 r47Var2 = (r47) arrayList.get(i);
            if (of3Var.getMessage() == null || of3Var.getMessage().e1() != r47Var2.e1()) {
                z3 = false;
            }
            of3Var.P = yg4Var.q0;
            of3Var.e0(r47.B0(r47Var2.k), r47Var2, r47Var2.k.date, false, false);
            if (yg4Var.p0.u()) {
                int e12 = r47Var2.e1();
                qg4Var.a = r47.B0(r47Var2.k);
                qg4Var.b = e12;
                of3Var.d0(yg4Var.p0.d(qg4Var), z3);
                return;
            }
            of3Var.d0(false, z3);
        } else if (i2 == 1) {
            byte b2 = yg4Var.s;
            ((tk4) view).w = b2 - ((((int) Math.ceil(arrayList.size() / yg4Var.s)) * b2) - arrayList.size());
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        lg4 lg4Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                lg4Var = new lg4((byte) 1, context, this);
                lg4Var.setIsSingleCell(true);
                lg4Var.setViewType(2);
            } else {
                ?? p55Var = new p55(context, null);
                p55Var.setBackgroundColor(aob.w0(null, aob.e7, false) & (-218103809));
                lg4Var = p55Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.n = paint;
            frameLayout.s = yac.t0;
            frameLayout.r = true;
            paint.setColor(aob.w0(null, aob.Ci, false));
            frameLayout.b = new r47[6];
            frameLayout.a = new fja[6];
            frameLayout.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                frameLayout.a[i2] = new fja(frameLayout, context);
                frameLayout.addView(frameLayout.a[i2]);
                frameLayout.a[i2].setVisibility(4);
                frameLayout.a[i2].setTag(Integer.valueOf(i2));
                frameLayout.a[i2].setOnClickListener(new jn8(frameLayout, (byte) 29));
                frameLayout.a[i2].setOnLongClickListener(new zs(frameLayout, (byte) 17));
            }
            frameLayout.setDelegate(new wz4(this));
            lg4Var = frameLayout;
        }
        return qu6.h(lg4Var, lg4Var, -1, -2);
    }
}
