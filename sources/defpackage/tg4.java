package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class tg4 extends y69 {
    public final Context r;
    public final byte s;
    public final yg4 w;

    public tg4(yg4 yg4Var, Context context, int i) {
        this.w = yg4Var;
        this.r = context;
        this.s = i;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        int i2 = 1;
        if (i >= arrayList.size()) {
            return 1;
        }
        int size = ((ArrayList) yg4Var.r.get(arrayList.get(i))).size();
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
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !yg4Var.O) {
            i = 1;
        }
        return size + i;
    }

    @Override
    public final View T(int i, View view) {
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        if (view == null) {
            view = new p55(this.r, null);
            view.setBackgroundColor(aob.w0(null, aob.e7, false) & (-218103809));
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < arrayList.size()) {
            view.setAlpha(1.0f);
            p55 p55Var = (p55) view;
            p55Var.setText(ob6.e0(((r47) ((ArrayList) yg4Var.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, f89 f89Var) {
        if (i != 0 && i2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i, int i2, f89 f89Var) {
        boolean z;
        boolean z2;
        yg4 yg4Var = this.w;
        ArrayList arrayList = yg4Var.n;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) yg4Var.r.get((String) arrayList.get(i));
            int i4 = f89Var.f;
            boolean z3 = false;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i != 0) {
                            i2--;
                        }
                        vea veaVar = (vea) view;
                        r47 r47Var = (r47) arrayList2.get(i2);
                        if (veaVar.getMessage() != null && veaVar.getMessage().e1() == r47Var.e1()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && yg4Var.N)) {
                            z3 = true;
                        }
                        veaVar.f(r47Var, z3);
                        veaVar.getViewTreeObserver().addOnPreDrawListener(new s32(this, veaVar, r47Var, z2, (byte) 3));
                        return;
                    }
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                zea zeaVar = (zea) view;
                r47 r47Var2 = (r47) arrayList2.get(i2);
                if (zeaVar.getMessage() != null && zeaVar.getMessage().e1() == r47Var2.e1()) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && yg4Var.N)) {
                    z = true;
                }
                zeaVar.c(r47Var2, z);
                zeaVar.getViewTreeObserver().addOnPreDrawListener(new s32(this, zeaVar, r47Var2, z3, (byte) 2));
                return;
            }
            ((p55) view).setText(ob6.e0(((r47) arrayList2.get(0)).k.date, false));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout p55Var;
        FrameLayout frameLayout;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new sg4(this, context);
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
                return qu6.h(frameLayout, frameLayout, -1, -2);
            }
            p55Var = new zea(2, null, context);
        } else {
            p55Var = new p55(context, null);
        }
        frameLayout = p55Var;
        return qu6.h(frameLayout, frameLayout, -1, -2);
    }
}
