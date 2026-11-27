package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class bj1 extends v79 {
    public final byte a;
    public final Object b;
    public final Object c;

    public bj1(Object obj, Object obj2, byte b) {
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
                bg3 bg3Var = (bg3) obj2;
                ag3[] ag3VarArr = bg3Var.f;
                ((v79) obj).a(recyclerView, i);
                if (i != 1) {
                    int i2 = (int) (-bg3.d0(bg3Var).getTranslationY());
                    int currentActionBarHeight = a.getCurrentActionBarHeight();
                    if (i2 != 0 && i2 != currentActionBarHeight) {
                        if (i2 < currentActionBarHeight / 2) {
                            int i3 = -i2;
                            ag3VarArr[0].d.y0(0, i3, null);
                            gw9 gw9Var = ag3VarArr[0].e;
                            if (gw9Var != null) {
                                gw9Var.y0(0, i3, null);
                                return;
                            }
                            return;
                        }
                        int i4 = currentActionBarHeight - i2;
                        ag3VarArr[0].d.y0(0, i4, null);
                        gw9 gw9Var2 = ag3VarArr[0].e;
                        if (gw9Var2 != null) {
                            gw9Var2.y0(0, i4, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((v79) obj).a(recyclerView, i);
                ((t07) obj2).D.getClass();
                return;
            case 6:
                s98 s98Var = (s98) obj2;
                ((v79) obj).a(recyclerView, i);
                if (i != 1) {
                    int i5 = (int) (-s98.b0(s98Var).getTranslationY());
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight();
                    if (i5 != 0 && i5 != currentActionBarHeight2) {
                        int i6 = currentActionBarHeight2 / 2;
                        r98[] r98VarArr = s98Var.n;
                        if (i5 < i6) {
                            ((d79) r98VarArr[0].f).y0(0, -i5, null);
                            return;
                        } else {
                            ((d79) r98VarArr[0].f).y0(0, currentActionBarHeight2 - i5, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (i == 0) {
                    ((pi9) obj2).v3.U();
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
        View G;
        byte b = this.a;
        float f = 0.0f;
        int i6 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                q9c q9cVar = ((cj1) obj2).a;
                if (q9cVar.canScrollVertically(1)) {
                    while (i6 < q9cVar.getChildCount()) {
                        if (!(q9cVar.getChildAt(i6) instanceof tk4)) {
                            i6++;
                        }
                    }
                    return;
                }
                ((zd) obj).run();
                return;
            case 1:
                zu1 zu1Var = (zu1) obj2;
                if (recyclerView.getScrollState() == 1) {
                    hl.t1(zu1Var.m1);
                }
                int M0 = ((x46) obj).M0();
                if (M0 == -1) {
                    i3 = 0;
                } else {
                    i3 = M0;
                }
                if (i3 > 0 && M0 > zu1Var.b4.h - 5) {
                    if (zu1Var.g4 == 7) {
                        if (!zu1Var.Y6 && !zu1Var.U6[0]) {
                            zu1Var.Y6 = true;
                            zu1Var.z6.add(Integer.valueOf(zu1Var.n6));
                            i4 = ((e) zu1Var).currentAccount;
                            df5 a = df5.a(i4);
                            String str = zu1Var.J3;
                            i5 = ((e) zu1Var).classGuid;
                            int i7 = zu1Var.d4;
                            int i8 = zu1Var.n6;
                            zu1Var.n6 = i8 + 1;
                            a.e(i5, i7, i8, str);
                            return;
                        }
                        return;
                    }
                    zu1Var.getMediaDataController().Q0();
                    return;
                }
                return;
            case 2:
                if (((cu2) obj2).X.J1) {
                    hl.t1((FrameLayout) obj);
                    return;
                }
                return;
            case 3:
                ((v79) obj).b(recyclerView, i, i2);
                bg3 bg3Var = (bg3) obj2;
                ag3 ag3Var = bg3Var.f[0];
                if (recyclerView == ag3Var.d || recyclerView == ag3Var.e) {
                    float translationY = bg3.e0(bg3Var).getTranslationY();
                    float f2 = translationY - i2;
                    if (f2 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f2 <= 0.0f) {
                        f = f2;
                    }
                    if (f != translationY) {
                        bg3Var.o0(f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ck6 ck6Var = (ck6) obj2;
                if (ck6Var.c0 && !ck6Var.X) {
                    if (ck6Var.Y - ((as) obj).M0() < 10) {
                        ck6Var.h0(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((v79) obj).b(recyclerView, i, i2);
                ((t07) obj2).D.b(recyclerView, i, i2);
                return;
            case 6:
                ((v79) obj).b(recyclerView, i, i2);
                s98 s98Var = (s98) obj2;
                if (recyclerView == ((d79) s98Var.n[0].f)) {
                    float translationY2 = s98.c0(s98Var).getTranslationY();
                    float f3 = translationY2 - i2;
                    if (f3 < (-a.getCurrentActionBarHeight())) {
                        f = -a.getCurrentActionBarHeight();
                    } else if (f3 <= 0.0f) {
                        f = f3;
                    }
                    if (f != translationY2) {
                        s98Var.m0(f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                e eVar = (e) obj;
                mj8 mj8Var = (mj8) obj2;
                q9c q9cVar2 = mj8Var.c;
                if (TextUtils.isEmpty(mj8Var.x)) {
                    arrayList = mj8Var.e;
                } else {
                    arrayList = mj8Var.n;
                }
                if (!arrayList.isEmpty()) {
                    if (q9cVar2.canScrollVertically(1)) {
                        for (int i9 = 0; i9 < q9cVar2.getChildCount(); i9++) {
                            if (!(q9cVar2.getChildAt(i9) instanceof tk4)) {
                            }
                        }
                    }
                    mj8Var.a(false);
                }
                if (q9cVar2.J1 && !mj8Var.R && eVar.getParentActivity() != null) {
                    hl.t1(eVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                au8 au8Var = (au8) obj2;
                wa waVar = au8Var.f;
                if (au8Var.isAttachedToWindow()) {
                    if (waVar.canScrollVertically(1)) {
                        while (i6 < waVar.getChildCount()) {
                            if (!(waVar.getChildAt(i6) instanceof tk4)) {
                                i6++;
                            }
                        }
                    }
                    au8Var.e.a();
                }
                ((cga) obj).p();
                return;
            case 9:
                cz8 cz8Var = (cz8) obj;
                float translationY3 = cz8Var.getTranslationY();
                float f4 = ((rz8) obj2).e0;
                if (translationY3 != f4) {
                    cz8Var.setTranslationY(f4);
                    cz8Var.invalidate();
                    return;
                }
                return;
            case 10:
                r59 r59Var = (r59) obj2;
                q59 q59Var = (q59) obj;
                if (!q59Var.h && !q59Var.i) {
                    if ((r59Var.c.g3.E.size() - 1) - r59Var.c.f3.L0() < 5) {
                        q59Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                pi9 pi9Var = (pi9) obj2;
                ((ni9) obj).E(i2);
                pi9Var.v3.F();
                dg9 dg9Var = pi9Var.T3;
                if (dg9Var != null && (G = pi9Var.G(dg9Var)) != null) {
                    if (G.getBottom() <= 0 || G.getTop() >= pi9Var.getHeight()) {
                        pi9Var.T3 = null;
                        dg9Var.clearFocus();
                        hl.t1(pi9Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
