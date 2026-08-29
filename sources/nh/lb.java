package nh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class lb {
    public int f18057a;
    public boolean f18058b;
    public ob f18059c;
    public String d;
    public long f18060e;
    public long f18061f;
    public float f18062g;
    public float h;
    public float f18063i;
    public final RectF f18064j = new RectF();
    public final org.telegram.ui.Components.d6 f18065k;
    public final qb f18066l;

    public lb(qb qbVar) {
        this.f18066l = qbVar;
        this.f18065k = new org.telegram.ui.Components.d6(qbVar, 360L, jr.h);
    }

    public static void a(lb lbVar, boolean z10) {
        qb qbVar = lbVar.f18066l;
        if (qbVar.getMeasuredWidth() > 0) {
            ob obVar = lbVar.f18059c;
            if (obVar == null || z10) {
                Long l10 = null;
                if (obVar != null) {
                    obVar.b();
                    lbVar.f18059c = null;
                }
                qb qbVar2 = lbVar.f18066l;
                boolean z11 = lbVar.f18058b;
                String str = lbVar.d;
                int i10 = qbVar2.f18453r1;
                int i11 = qbVar2.f18460u1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = lbVar.f18060e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                lbVar.f18059c = new ob(qbVar2, z11, str, i12, dp, l10, qbVar.getMaxScrollDuration(), qbVar.V0, qbVar.W0, new m6(lbVar, 10));
            }
        }
    }

    public static void b(lb lbVar) {
        qb qbVar = lbVar.f18066l;
        int i10 = lbVar.f18057a;
        if (i10 >= 0) {
            ArrayList arrayList = qbVar.f18451r;
            if (i10 < arrayList.size()) {
                jb jbVar = (jb) arrayList.get(lbVar.f18057a);
                if (qbVar.getMeasuredWidth() > 0 && jbVar == null) {
                    if (jbVar != null) {
                        jbVar.a();
                    }
                    arrayList.set(lbVar.f18057a, new jb(qbVar, lbVar.d, (qbVar.getMeasuredWidth() - qbVar.getPaddingLeft()) - qbVar.getPaddingRight()));
                }
            }
        }
    }
}
