package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class xe4 extends j39 {
    public final Context r;
    public final we4 s = new we4(this);
    public final af4 w;

    public xe4(af4 af4Var, Context context) {
        this.w = af4Var;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i2 = 1;
        if (i >= arrayList.size()) {
            return 1;
        }
        int size = ((ArrayList) af4Var.r.get(arrayList.get(i))).size();
        if (i == 0) {
            i2 = 0;
        }
        return size + i2;
    }

    @Override
    public final Object O(int i, int i2) {
        return null;
    }

    @Override
    public final int P(int i, int i2) {
        if (i < this.w.n.size()) {
            if (i != 0 && i2 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i = 0;
        if (af4Var.f.isEmpty() || (arrayList.isEmpty() && af4Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !af4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override
    public final View T(int i, View view) {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        if (view == null) {
            view = new l35(this.r, null);
            view.setBackgroundColor(bkb.w0(null, bkb.d7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            ((l35) view).setText(k96.e0(((k27) ((ArrayList) af4Var.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        return true;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        boolean z;
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) af4Var.r.get((String) arrayList.get(i));
            int i4 = s49Var.f;
            boolean z2 = false;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (i != 0) {
                        i2--;
                    }
                    lba lbaVar = (lba) view;
                    k27 k27Var = (k27) arrayList2.get(i2);
                    if (lbaVar.getMessage() != null && lbaVar.getMessage().e1() == k27Var.e1()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                        z2 = true;
                    }
                    lbaVar.E = z2;
                    lbaVar.e();
                    lbaVar.c0 = k27Var;
                    lbaVar.requestLayout();
                    lbaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, lbaVar, k27Var, z, (byte) 4));
                    return;
                }
                return;
            }
            ((l35) view).setText(k96.e0(((k27) arrayList2.get(0)).k.date, false));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setViewType(5);
                pi4Var.setIsSingleCell(true);
                l35Var = pi4Var;
            } else {
                lba lbaVar = new lba(1, null, context);
                lbaVar.setDelegate(this.s);
                l35Var = lbaVar;
            }
        } else {
            l35Var = new l35(context, null);
        }
        return ls6.h(l35Var, l35Var, -1, -2);
    }
}
