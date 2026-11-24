package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class si1 extends i49 {
    public final byte a;
    public final Object b;
    public final Object c;

    public si1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 3:
                hf3 hf3Var = (hf3) obj2;
                gf3[] gf3VarArr = hf3Var.f;
                ((i49) obj).a(recyclerView, i);
                if (i != 1) {
                    int i2 = (int) (-hf3.k0(hf3Var).getTranslationY());
                    int currentActionBarHeight = a.getCurrentActionBarHeight();
                    if (i2 != 0 && i2 != currentActionBarHeight) {
                        if (i2 < currentActionBarHeight / 2) {
                            int i3 = -i2;
                            gf3VarArr[0].d.x0(0, i3, null);
                            ns9 ns9Var = gf3VarArr[0].e;
                            if (ns9Var != null) {
                                ns9Var.x0(0, i3, null);
                                return;
                            }
                            return;
                        }
                        int i4 = currentActionBarHeight - i2;
                        gf3VarArr[0].d.x0(0, i4, null);
                        ns9 ns9Var2 = gf3VarArr[0].e;
                        if (ns9Var2 != null) {
                            ns9Var2.x0(0, i4, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((i49) obj).a(recyclerView, i);
                ((my6) obj2).D.getClass();
                return;
            case 6:
                b68 b68Var = (b68) obj2;
                ((i49) obj).a(recyclerView, i);
                if (i != 1) {
                    int i5 = (int) (-b68.i0(b68Var).getTranslationY());
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight();
                    if (i5 != 0 && i5 != currentActionBarHeight2) {
                        int i6 = currentActionBarHeight2 / 2;
                        a68[] a68VarArr = b68Var.n;
                        if (i5 < i6) {
                            ((o39) a68VarArr[0].f).x0(0, -i5, null);
                            return;
                        } else {
                            ((o39) a68VarArr[0].f).x0(0, currentActionBarHeight2 - i5, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (i == 0) {
                    ((ye9) obj2).v3.U();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        View F;
        byte b = this.a;
        float f = 0.0f;
        int i6 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                q5c q5cVar = ((ti1) obj2).a;
                if (q5cVar.canScrollVertically(1)) {
                    while (i6 < q5cVar.getChildCount()) {
                        if (!(q5cVar.getChildAt(i6) instanceof pi4)) {
                            i6++;
                        }
                    }
                    return;
                }
                ((eg) obj).run();
                return;
            case 1:
                mu1 mu1Var = (mu1) obj2;
                if (recyclerView.getScrollState() == 1) {
                    gl.t1(mu1Var.m1);
                }
                int M0 = ((t26) obj).M0();
                if (M0 == -1) {
                    i3 = 0;
                } else {
                    i3 = M0;
                }
                if (i3 > 0 && M0 > mu1Var.b4.h - 5) {
                    if (mu1Var.g4 == 7) {
                        if (!mu1Var.Y6 && !mu1Var.U6[0]) {
                            mu1Var.Y6 = true;
                            mu1Var.z6.add(Integer.valueOf(mu1Var.n6));
                            i4 = ((d) mu1Var).currentAccount;
                            cd5 a = cd5.a(i4);
                            String str = mu1Var.J3;
                            i5 = ((d) mu1Var).classGuid;
                            int i7 = mu1Var.d4;
                            int i8 = mu1Var.n6;
                            mu1Var.n6 = i8 + 1;
                            a.e(i5, i7, i8, str);
                            return;
                        }
                        return;
                    }
                    mu1Var.getMediaDataController().Q0();
                    return;
                }
                return;
            case 2:
                if (((it2) obj2).X.J1) {
                    gl.t1((FrameLayout) obj);
                    return;
                }
                return;
            case 3:
                ((i49) obj).b(recyclerView, i, i2);
                hf3 hf3Var = (hf3) obj2;
                gf3 gf3Var = hf3Var.f[0];
                if (recyclerView == gf3Var.d || recyclerView == gf3Var.e) {
                    float translationY = hf3.l0(hf3Var).getTranslationY();
                    float f2 = translationY - i2;
                    if (f2 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f2 <= 0.0f) {
                        f = f2;
                    }
                    if (f != translationY) {
                        hf3Var.o0(f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                yh6 yh6Var = (yh6) obj2;
                if (yh6Var.c0 && !yh6Var.X) {
                    if (yh6Var.Y - ((zr) obj).M0() < 10) {
                        yh6Var.h0(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((i49) obj).b(recyclerView, i, i2);
                ((my6) obj2).D.b(recyclerView, i, i2);
                return;
            case 6:
                ((i49) obj).b(recyclerView, i, i2);
                b68 b68Var = (b68) obj2;
                if (recyclerView == ((o39) b68Var.n[0].f)) {
                    float translationY2 = b68.j0(b68Var).getTranslationY();
                    float f3 = translationY2 - i2;
                    if (f3 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f3 <= 0.0f) {
                        f = f3;
                    }
                    if (f != translationY2) {
                        b68Var.m0(f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                d dVar = (d) obj;
                yf8 yf8Var = (yf8) obj2;
                q5c q5cVar2 = yf8Var.c;
                if (TextUtils.isEmpty(yf8Var.x)) {
                    arrayList = yf8Var.e;
                } else {
                    arrayList = yf8Var.n;
                }
                if (!arrayList.isEmpty()) {
                    if (q5cVar2.canScrollVertically(1)) {
                        for (int i9 = 0; i9 < q5cVar2.getChildCount(); i9++) {
                            if (!(q5cVar2.getChildAt(i9) instanceof pi4)) {
                            }
                        }
                    }
                    yf8Var.a(false);
                }
                if (q5cVar2.J1 && !yf8Var.R && dVar.getParentActivity() != null) {
                    gl.t1(dVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                pq8 pq8Var = (pq8) obj2;
                va vaVar = pq8Var.f;
                if (pq8Var.isAttachedToWindow()) {
                    if (vaVar.canScrollVertically(1)) {
                        while (i6 < vaVar.getChildCount()) {
                            if (!(vaVar.getChildAt(i6) instanceof pi4)) {
                                i6++;
                            }
                        }
                    }
                    pq8Var.e.a();
                }
                ((lca) obj).p();
                return;
            case 9:
                rv8 rv8Var = (rv8) obj;
                float translationY3 = rv8Var.getTranslationY();
                float f4 = ((gw8) obj2).e0;
                if (translationY3 != f4) {
                    rv8Var.setTranslationY(f4);
                    rv8Var.invalidate();
                    return;
                }
                return;
            case 10:
                c29 c29Var = (c29) obj2;
                b29 b29Var = (b29) obj;
                if (!b29Var.h && !b29Var.i) {
                    if ((c29Var.c.g3.E.size() - 1) - c29Var.c.f3.L0() < 5) {
                        b29Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ye9 ye9Var = (ye9) obj2;
                ((we9) obj).x(i2);
                ye9Var.v3.F();
                mc9 mc9Var = ye9Var.T3;
                if (mc9Var != null && (F = ye9Var.F(mc9Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= ye9Var.getHeight()) {
                        ye9Var.T3 = null;
                        mc9Var.clearFocus();
                        gl.t1(ye9Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
