package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class xg4 extends m59 {
    public final Context r;
    public final byte s;
    public final ch4 w;

    public xg4(ch4 ch4Var, Context context, int i) {
        this.w = ch4Var;
        this.r = context;
        this.s = i;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i2 = 1;
        if (i >= arrayList.size()) {
            return 1;
        }
        int size = ((ArrayList) ch4Var.r.get(arrayList.get(i))).size();
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
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !ch4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override
    public final View T(int i, View view) {
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        if (view == null) {
            view = new l55(this.r, null);
            view.setBackgroundColor(cmb.w0(null, cmb.d7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            l55 l55Var = (l55) view;
            l55Var.setText(jb6.e0(((k47) ((ArrayList) ch4Var.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, u69 u69Var) {
        if (i != 0 && i2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i, int i2, u69 u69Var) {
        boolean z;
        boolean z2;
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) ch4Var.r.get((String) arrayList.get(i));
            int i4 = u69Var.f;
            boolean z3 = false;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i != 0) {
                            i2--;
                        }
                        eda edaVar = (eda) view;
                        k47 k47Var = (k47) arrayList2.get(i2);
                        if (edaVar.getMessage() != null && edaVar.getMessage().e1() == k47Var.e1()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                            z3 = true;
                        }
                        edaVar.f(k47Var, z3);
                        edaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, edaVar, k47Var, z2, (byte) 3));
                        return;
                    }
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                ida idaVar = (ida) view;
                k47 k47Var2 = (k47) arrayList2.get(i2);
                if (idaVar.getMessage() != null && idaVar.getMessage().e1() == k47Var2.e1()) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                    z = true;
                }
                idaVar.c(k47Var2, z);
                idaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, idaVar, k47Var2, z3, (byte) 2));
                return;
            }
            ((l55) view).setText(jb6.e0(((k47) arrayList2.get(0)).k.date, false));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout l55Var;
        FrameLayout frameLayout;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new wg4(this, context);
                } else {
                    tk4 tk4Var = new tk4(context, null);
                    byte b = this.s;
                    if (b != 2 && b != 4) {
                        tk4Var.setViewType(3);
                    } else {
                        tk4Var.setViewType(4);
                    }
                    tk4Var.setIsSingleCell(true);
                    frameLayout = tk4Var;
                }
                return kt6.h(frameLayout, frameLayout, -1, -2);
            }
            l55Var = new ida(2, null, context);
        } else {
            l55Var = new l55(context, null);
        }
        frameLayout = l55Var;
        return kt6.h(frameLayout, frameLayout, -1, -2);
    }
}
