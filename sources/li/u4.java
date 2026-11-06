package li;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.h20;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class u4 implements ls {
    public final int f18916a;
    public final h6.m f18917b;
    public ij f18918c;
    public j20 d;
    public String f18919e;
    public boolean f18920f;
    public boolean h;
    public boolean f18921n;

    public u4(int i7, gf gfVar, h6.m mVar) {
        this.f18916a = i7;
        this.f18917b = mVar;
    }

    public static boolean c(gf gfVar) {
        ArrayList arrayList;
        if (!gfVar.f26824b) {
            ArrayList arrayList2 = gfVar.f26837q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = gfVar.f26837q;
            } else {
                arrayList = gfVar.f26836p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    h20 h20Var = (h20) arrayList.get(i7);
                    if (h20Var != null) {
                        if (h20Var.f22800a == 0) {
                            byte b10 = h20Var.f22801b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = h20Var.f22808k;
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
        if (!this.f18921n && !this.h) {
            this.h = true;
            if (this.f18918c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f18918c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f18921n) {
            return;
        }
        this.f18921n = true;
        d();
        h6.m mVar = this.f18917b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.f18878h4;
        s sVar = (s) mVar.f14264b;
        identityHashMap.remove(sVar);
        sVar.f18811a = 3;
        t3Var.t4((a) mVar.f14265c, sVar);
        t3Var.f18887o3.onContentChanged();
    }

    public final void d() {
        qs f10 = qs.f(this.f18916a);
        f10.n(this, qs.f24952a2);
        f10.n(this, qs.f24958b2);
        f10.n(this, qs.f24964c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f18917b;
        a aVar = (a) mVar.f14265c;
        s sVar = (s) mVar.f14264b;
        t3 t3Var = (t3) mVar.d;
        if (!this.h && !this.f18921n && i10 == this.f18916a && objArr.length != 0 && objArr[0] == this.f18918c) {
            if (i7 == qs.f24958b2) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f18815f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof s4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f18921n = true;
                    d();
                    String str = this.f18919e;
                    j20 j20Var = this.d;
                    int i11 = j20Var.f23453k;
                    int i12 = j20Var.f23454l;
                    int ceil = (int) Math.ceil(j20Var.f23460r / 1000.0d);
                    t3Var.f18878h4.remove(sVar);
                    sVar.f18812b = true;
                    sVar.f18814e = str;
                    if (i11 > 0) {
                        sVar.f18818j = i11;
                    }
                    if (i12 > 0) {
                        sVar.f18819k = i12;
                    }
                    sVar.f18820l = 0;
                    sVar.f18821m = 0;
                    sVar.f18815f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) mVar.f14265c, sVar, str, true, sVar.f18818j, sVar.f18819k, ceil);
                }
            } else if (i7 == qs.f24964c2) {
                b();
            }
        }
    }
}
