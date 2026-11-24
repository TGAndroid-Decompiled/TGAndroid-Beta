package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class bk1 extends k69 {
    public final byte a;
    public final Object b;
    public final Object c;

    public bk1(Object obj, Object obj2, byte b) {
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
                ug3 ug3Var = (ug3) obj2;
                tg3[] tg3VarArr = ug3Var.f;
                ((k69) obj).a(recyclerView, i);
                if (i != 1) {
                    int i2 = (int) (-ug3.l0(ug3Var).getTranslationY());
                    int currentActionBarHeight = a.getCurrentActionBarHeight();
                    if (i2 != 0 && i2 != currentActionBarHeight) {
                        if (i2 < currentActionBarHeight / 2) {
                            int i3 = -i2;
                            tg3VarArr[0].d.x0(0, i3, null);
                            pu9 pu9Var = tg3VarArr[0].e;
                            if (pu9Var != null) {
                                pu9Var.x0(0, i3, null);
                                return;
                            }
                            return;
                        }
                        int i4 = currentActionBarHeight - i2;
                        tg3VarArr[0].d.x0(0, i4, null);
                        pu9 pu9Var2 = tg3VarArr[0].e;
                        if (pu9Var2 != null) {
                            pu9Var2.x0(0, i4, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((k69) obj).a(recyclerView, i);
                ((m07) obj2).D.getClass();
                return;
            case 6:
                d88 d88Var = (d88) obj2;
                ((k69) obj).a(recyclerView, i);
                if (i != 1) {
                    int i5 = (int) (-d88.j0(d88Var).getTranslationY());
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight();
                    if (i5 != 0 && i5 != currentActionBarHeight2) {
                        int i6 = currentActionBarHeight2 / 2;
                        c88[] c88VarArr = d88Var.n;
                        if (i5 < i6) {
                            ((r59) c88VarArr[0].f).x0(0, -i5, null);
                            return;
                        } else {
                            ((r59) c88VarArr[0].f).x0(0, currentActionBarHeight2 - i5, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (i == 0) {
                    ((ch9) obj2).v3.U();
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
                q7c q7cVar = ((ck1) obj2).a;
                if (q7cVar.canScrollVertically(1)) {
                    while (i6 < q7cVar.getChildCount()) {
                        if (!(q7cVar.getChildAt(i6) instanceof tk4)) {
                            i6++;
                        }
                    }
                    return;
                }
                ((eh) obj).run();
                return;
            case 1:
                yv1 yv1Var = (yv1) obj2;
                if (recyclerView.getScrollState() == 1) {
                    gm.t1(yv1Var.m1);
                }
                int M0 = ((u46) obj).M0();
                if (M0 == -1) {
                    i3 = 0;
                } else {
                    i3 = M0;
                }
                if (i3 > 0 && M0 > yv1Var.b4.h - 5) {
                    if (yv1Var.g4 == 7) {
                        if (!yv1Var.Y6 && !yv1Var.U6[0]) {
                            yv1Var.Y6 = true;
                            yv1Var.z6.add(Integer.valueOf(yv1Var.n6));
                            i4 = ((d) yv1Var).currentAccount;
                            af5 a = af5.a(i4);
                            String str = yv1Var.J3;
                            i5 = ((d) yv1Var).classGuid;
                            int i7 = yv1Var.d4;
                            int i8 = yv1Var.n6;
                            yv1Var.n6 = i8 + 1;
                            a.e(i5, i7, i8, str);
                            return;
                        }
                        return;
                    }
                    yv1Var.getMediaDataController().Q0();
                    return;
                }
                return;
            case 2:
                if (((tu2) obj2).X.J1) {
                    gm.t1((FrameLayout) obj);
                    return;
                }
                return;
            case 3:
                ((k69) obj).b(recyclerView, i, i2);
                ug3 ug3Var = (ug3) obj2;
                tg3 tg3Var = ug3Var.f[0];
                if (recyclerView == tg3Var.d || recyclerView == tg3Var.e) {
                    float translationY = ug3.m0(ug3Var).getTranslationY();
                    float f2 = translationY - i2;
                    if (f2 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f2 <= 0.0f) {
                        f = f2;
                    }
                    if (f != translationY) {
                        ug3Var.p0(f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ak6 ak6Var = (ak6) obj2;
                if (ak6Var.c0 && !ak6Var.X) {
                    if (ak6Var.Y - ((zs) obj).M0() < 10) {
                        ak6Var.i0(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((k69) obj).b(recyclerView, i, i2);
                ((m07) obj2).D.b(recyclerView, i, i2);
                return;
            case 6:
                ((k69) obj).b(recyclerView, i, i2);
                d88 d88Var = (d88) obj2;
                if (recyclerView == ((r59) d88Var.n[0].f)) {
                    float translationY2 = d88.k0(d88Var).getTranslationY();
                    float f3 = translationY2 - i2;
                    if (f3 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f3 <= 0.0f) {
                        f = f3;
                    }
                    if (f != translationY2) {
                        d88Var.n0(f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                d dVar = (d) obj;
                ai8 ai8Var = (ai8) obj2;
                q7c q7cVar2 = ai8Var.c;
                if (TextUtils.isEmpty(ai8Var.x)) {
                    arrayList = ai8Var.e;
                } else {
                    arrayList = ai8Var.n;
                }
                if (!arrayList.isEmpty()) {
                    if (q7cVar2.canScrollVertically(1)) {
                        for (int i9 = 0; i9 < q7cVar2.getChildCount(); i9++) {
                            if (!(q7cVar2.getChildAt(i9) instanceof tk4)) {
                            }
                        }
                    }
                    ai8Var.a(false);
                }
                if (q7cVar2.J1 && !ai8Var.R && dVar.getParentActivity() != null) {
                    gm.t1(dVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                rs8 rs8Var = (rs8) obj2;
                va vaVar = rs8Var.f;
                if (rs8Var.isAttachedToWindow()) {
                    if (vaVar.canScrollVertically(1)) {
                        while (i6 < vaVar.getChildCount()) {
                            if (!(vaVar.getChildAt(i6) instanceof tk4)) {
                                i6++;
                            }
                        }
                    }
                    rs8Var.e.a();
                }
                ((lea) obj).p();
                return;
            case 9:
                sx8 sx8Var = (sx8) obj;
                float translationY3 = sx8Var.getTranslationY();
                float f4 = ((iy8) obj2).e0;
                if (translationY3 != f4) {
                    sx8Var.setTranslationY(f4);
                    sx8Var.invalidate();
                    return;
                }
                return;
            case 10:
                g49 g49Var = (g49) obj2;
                f49 f49Var = (f49) obj;
                if (!f49Var.h && !f49Var.i) {
                    if ((g49Var.c.g3.E.size() - 1) - g49Var.c.f3.L0() < 5) {
                        f49Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ch9 ch9Var = (ch9) obj2;
                ((ah9) obj).u(i2);
                ch9Var.v3.F();
                ne9 ne9Var = ch9Var.T3;
                if (ne9Var != null && (F = ch9Var.F(ne9Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= ch9Var.getHeight()) {
                        ch9Var.T3 = null;
                        ne9Var.clearFocus();
                        gm.t1(ch9Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
