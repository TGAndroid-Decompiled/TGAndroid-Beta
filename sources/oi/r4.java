package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.ff;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class r4 implements is {
    public final int f21981a;
    public final h6.m f21982b;
    public gj f21983c;
    public g20 d;
    public String f21984e;
    public boolean f21985f;
    public boolean h;
    public boolean f21986n;

    public r4(int i7, ff ffVar, h6.m mVar) {
        this.f21981a = i7;
        this.f21982b = mVar;
    }

    public static boolean c(ff ffVar) {
        ArrayList arrayList;
        if (!ffVar.f27710b) {
            ArrayList arrayList2 = ffVar.f27723q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = ffVar.f27723q;
            } else {
                arrayList = ffVar.f27722p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    e20 e20Var = (e20) arrayList.get(i7);
                    if (e20Var != null) {
                        if (e20Var.f23231a == 0) {
                            byte b10 = e20Var.f23232b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = e20Var.f23239k;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!this.f21986n && !this.h) {
            this.h = true;
            if (this.f21983c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f21983c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f21986n) {
            return;
        }
        this.f21986n = true;
        d();
        h6.m mVar = this.f21982b;
        q3 q3Var = (q3) mVar.d;
        IdentityHashMap identityHashMap = q3Var.f21923i4;
        r rVar = (r) mVar.f13624b;
        identityHashMap.remove(rVar);
        rVar.f21957a = 3;
        q3Var.t4((a) mVar.f13625c, rVar);
        q3Var.f21931p3.onContentChanged();
    }

    public final void d() {
        ns f10 = ns.f(this.f21981a);
        f10.n(this, ns.f25466a2);
        f10.n(this, ns.f25472b2);
        f10.n(this, ns.f25478c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f21982b;
        a aVar = (a) mVar.f13625c;
        r rVar = (r) mVar.f13624b;
        q3 q3Var = (q3) mVar.d;
        if (!this.h && !this.f21986n && i10 == this.f21981a && objArr.length != 0 && objArr[0] == this.f21983c) {
            if (i7 == ns.f25472b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f21961f = ((Float) objArr[4]).floatValue();
                View C1 = q3Var.C1(aVar);
                if (C1 instanceof p4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f21986n = true;
                    d();
                    String str = this.f21984e;
                    g20 g20Var = this.d;
                    int i11 = g20Var.f23644k;
                    int i12 = g20Var.f23645l;
                    int ceil = (int) Math.ceil(g20Var.f23651r / 1000.0d);
                    q3Var.f21923i4.remove(rVar);
                    rVar.f21958b = true;
                    rVar.f21960e = str;
                    if (i11 > 0) {
                        rVar.f21964j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f21965k = i12;
                    }
                    rVar.f21966l = 0;
                    rVar.f21967m = 0;
                    rVar.f21961f = 0.0f;
                    q3Var.q4(aVar);
                    q3Var.O4((a) mVar.f13625c, rVar, str, true, rVar.f21964j, rVar.f21965k, ceil);
                }
            } else if (i7 == ns.f25478c2) {
                b();
            }
        }
    }
}
