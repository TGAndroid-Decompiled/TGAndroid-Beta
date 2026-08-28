package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ai1;
public final class b8 implements Utilities.Callback2 {
    public final int f15005a;
    public final Object f15006b;

    public b8(Object obj, int i9) {
        this.f15005a = i9;
        this.f15006b = obj;
    }

    private final void a(Object obj, Object obj2) {
        boolean z10;
        pf.w0 w0Var = (pf.w0) this.f15006b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        String string = LocaleController.getString(R.string.BusinessLocation);
        String string2 = LocaleController.getString(R.string.BusinessLocationInfo);
        int i9 = R.raw.biz_map;
        l41 l41Var = new l41(2);
        l41Var.f30339l = string;
        l41Var.f30342o = string2;
        l41Var.f30338k = i9;
        arrayList.add(l41Var);
        arrayList.add(l41.k(w0Var.f45805e));
        arrayList.add(l41.B(null));
        l41 i10 = l41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
        boolean z11 = false;
        if (w0Var.f45811x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i10.K(z10);
        arrayList.add(i10);
        if (w0Var.f45811x != null) {
            arrayList.add(l41.k(w0Var.h));
        }
        arrayList.add(l41.B(null));
        if (w0Var.f45810w != null && (w0Var.f45811x != null || !TextUtils.isEmpty(w0Var.f45812y))) {
            z11 = true;
        }
        w0Var.C = z11;
        if (z11) {
            l41 e10 = l41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
            e10.f30345r = true;
            arrayList.add(e10);
            arrayList.add(l41.B(null));
        }
        w0Var.T(true);
    }

    private final void b(Object obj, Object obj2) {
        pf.a1 a1Var = (pf.a1) this.f15006b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = a1Var.f45560b;
        String string = LocaleController.getString(R.string.BusinessHoursDayOpen);
        l41 l41Var = new l41(9);
        l41Var.d = -1;
        l41Var.f30339l = string;
        l41Var.K(a1Var.f45565r);
        arrayList.add(l41Var);
        arrayList.add(l41.B(null));
        if (a1Var.f45565r) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (i9 > 0) {
                    arrayList.add(l41.B(null));
                }
                pf.x0 x0Var = (pf.x0) arrayList2.get(i9);
                if (!a1Var.T()) {
                    int i10 = i9 * 3;
                    arrayList.add(l41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), pf.x0.a(x0Var.f45825a), i10));
                    arrayList.add(l41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), pf.x0.a(x0Var.f45826b), i10 + 1));
                    l41 e10 = l41.e(i10 + 2, LocaleController.getString(R.string.Remove));
                    e10.f30345r = true;
                    arrayList.add(e10);
                }
            }
            if (a1Var.U()) {
                arrayList.add(l41.B(null));
                l41 c10 = l41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                c10.f30344q = true;
                arrayList.add(c10);
            }
            org.telegram.ui.Cells.j2.y(R.string.BusinessHoursDayInfo, arrayList);
        }
    }

    private final void c(Object obj, Object obj2) {
        pf.t1.U((pf.t1) this.f15006b, (ArrayList) obj, (z41) obj2);
    }

    private final void d(Object obj, Object obj2) {
        int i9;
        int i10;
        ph.a aVar = (ph.a) this.f15006b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        arrayList.add(l41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(l41.j(1, aVar.V));
        arrayList.add(l41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        if (z10) {
            i9 = R.string.CommunityChatVisibilityVisibleBotInfo;
        } else {
            i9 = R.string.CommunityChatVisibilityVisibleInfo;
        }
        l41 x10 = l41.x(151, string, LocaleController.getString(i9));
        x10.K(true ^ aVar.U);
        arrayList.add(x10);
        String string2 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
        if (z10) {
            i10 = R.string.CommunityChatVisibilityHiddenBotInfo;
        } else {
            i10 = R.string.CommunityChatVisibilityHiddenInfo;
        }
        l41 x11 = l41.x(150, string2, LocaleController.getString(i10));
        x11.K(aVar.U);
        arrayList.add(x11);
        arrayList.add(l41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    private final void e(Object obj, Object obj2) {
        z41 z41Var = (z41) obj2;
        ((ArrayList) obj).add(l41.j(0, ((ph.b) this.f15006b).T));
    }

    private final void f(Object obj, Object obj2) {
        String str = (String) obj;
        Utilities.themeQueue.postRunnable(new ai1(19, (String[]) this.f15006b, (Utilities.Callback2) obj2));
    }

    private final void g(Object obj, Object obj2) {
        qh.v vVar = (qh.v) this.f15006b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        arrayList.add(l41.j(1, vVar.W));
        arrayList.add(l41.j(3, vVar.Z));
        if (vVar.f46749e0 != null) {
            arrayList.add(l41.j(2, vVar.X));
        }
    }

    private final void h(Object obj, Object obj2) {
        qh.o3.I1((qh.o3[]) this.f15006b, (ArrayList) obj, (z41) obj2);
    }

    @Override
    public final void run(java.lang.Object r31, java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: kh.b8.run(java.lang.Object, java.lang.Object):void");
    }
}
