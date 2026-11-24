package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class zg4 extends m59 {
    public final Context r;
    public final yg4 s = new yg4(this);
    public final ch4 w;

    public zg4(ch4 ch4Var, Context context) {
        this.w = ch4Var;
        this.r = context;
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
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i = 0;
        if (ch4Var.f.isEmpty() || (arrayList.isEmpty() && ch4Var.N)) {
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
            ((l55) view).setText(jb6.e0(((k47) ((ArrayList) ch4Var.r.get((String) arrayList.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, u69 u69Var) {
        return true;
    }

    @Override
    public final void W(int i, int i2, u69 u69Var) {
        boolean z;
        ch4 ch4Var = this.w;
        ArrayList arrayList = ch4Var.n;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 2) {
            ArrayList arrayList2 = (ArrayList) ch4Var.r.get((String) arrayList.get(i));
            int i4 = u69Var.f;
            boolean z2 = false;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (i != 0) {
                        i2--;
                    }
                    lda ldaVar = (lda) view;
                    k47 k47Var = (k47) arrayList2.get(i2);
                    if (ldaVar.getMessage() != null && ldaVar.getMessage().e1() == k47Var.e1()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 != arrayList2.size() - 1 || (i == arrayList.size() - 1 && ch4Var.N)) {
                        z2 = true;
                    }
                    ldaVar.E = z2;
                    ldaVar.e();
                    ldaVar.c0 = k47Var;
                    ldaVar.requestLayout();
                    ldaVar.getViewTreeObserver().addOnPreDrawListener(new n42(this, ldaVar, k47Var, z, (byte) 4));
                    return;
                }
                return;
            }
            ((l55) view).setText(jb6.e0(((k47) arrayList2.get(0)).k.date, false));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setViewType(5);
                tk4Var.setIsSingleCell(true);
                l55Var = tk4Var;
            } else {
                lda ldaVar = new lda(1, null, context);
                ldaVar.setDelegate(this.s);
                l55Var = ldaVar;
            }
        } else {
            l55Var = new l55(context, null);
        }
        return kt6.h(l55Var, l55Var, -1, -2);
    }
}
