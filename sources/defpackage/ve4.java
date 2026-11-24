package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ve4 extends j39 {
    public final Context r;
    public final byte s;
    public final af4 w;

    public ve4(af4 af4Var, Context context, int i) {
        this.w = af4Var;
        this.r = context;
        this.s = i;
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
    public final int P(int i, int i2) {
        if (i >= this.w.n.size()) {
            return 2;
        }
        if (i != 0 && i2 == 0) {
            return 0;
        }
        byte b = this.s;
        if (b != 2 && b != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i = 0;
        if (arrayList.isEmpty()) {
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
            l35 l35Var = (l35) view;
            l35Var.setText(k96.e0(((k27) ((ArrayList) af4Var.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        if (i != 0 && i2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        boolean z;
        boolean z2;
        af4 af4Var = this.w;
        ArrayList arrayList = af4Var.n;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) af4Var.r.get((String) arrayList.get(i));
            int i4 = s49Var.f;
            boolean z3 = false;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i != 0) {
                            i2--;
                        }
                        eba ebaVar = (eba) view;
                        k27 k27Var = (k27) arrayList2.get(i2);
                        if (ebaVar.getMessage() != null && ebaVar.getMessage().e1() == k27Var.e1()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                            z3 = true;
                        }
                        ebaVar.f(k27Var, z3);
                        ebaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, ebaVar, k27Var, z2, (byte) 3));
                        return;
                    }
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                iba ibaVar = (iba) view;
                k27 k27Var2 = (k27) arrayList2.get(i2);
                if (ibaVar.getMessage() != null && ibaVar.getMessage().e1() == k27Var2.e1()) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && af4Var.N)) {
                    z = true;
                }
                ibaVar.c(k27Var2, z);
                ibaVar.getViewTreeObserver().addOnPreDrawListener(new b32(this, ibaVar, k27Var2, z3, (byte) 2));
                return;
            }
            ((l35) view).setText(k96.e0(((k27) arrayList2.get(0)).k.date, false));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout l35Var;
        FrameLayout frameLayout;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new ue4(this, context);
                } else {
                    pi4 pi4Var = new pi4(context, null);
                    byte b = this.s;
                    if (b != 2 && b != 4) {
                        pi4Var.setViewType(3);
                    } else {
                        pi4Var.setViewType(4);
                    }
                    pi4Var.setIsSingleCell(true);
                    frameLayout = pi4Var;
                }
                return ls6.h(frameLayout, frameLayout, -1, -2);
            }
            l35Var = new iba(2, null, context);
        } else {
            l35Var = new l35(context, null);
        }
        frameLayout = l35Var;
        return ls6.h(frameLayout, frameLayout, -1, -2);
    }
}
