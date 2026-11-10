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
    public final int f18922a;
    public final h6.m f18923b;
    public ij f18924c;
    public j20 d;
    public String f18925e;
    public boolean f18926f;
    public boolean h;
    public boolean f18927n;

    public u4(int i7, gf gfVar, h6.m mVar) {
        this.f18922a = i7;
        this.f18923b = mVar;
    }

    public static boolean c(gf gfVar) {
        ArrayList arrayList;
        if (!gfVar.f26849b) {
            ArrayList arrayList2 = gfVar.f26862q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = gfVar.f26862q;
            } else {
                arrayList = gfVar.f26861p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    h20 h20Var = (h20) arrayList.get(i7);
                    if (h20Var != null) {
                        if (h20Var.f22817a == 0) {
                            byte b10 = h20Var.f22818b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = h20Var.f22825k;
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
        if (!this.f18927n && !this.h) {
            this.h = true;
            if (this.f18924c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f18924c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f18927n) {
            return;
        }
        this.f18927n = true;
        d();
        h6.m mVar = this.f18923b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.f18884h4;
        s sVar = (s) mVar.f14266b;
        identityHashMap.remove(sVar);
        sVar.f18817a = 3;
        t3Var.t4((a) mVar.f14267c, sVar);
        t3Var.f18893o3.onContentChanged();
    }

    public final void d() {
        qs f10 = qs.f(this.f18922a);
        f10.n(this, qs.f24973a2);
        f10.n(this, qs.f24979b2);
        f10.n(this, qs.f24985c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f18923b;
        a aVar = (a) mVar.f14267c;
        s sVar = (s) mVar.f14266b;
        t3 t3Var = (t3) mVar.d;
        if (!this.h && !this.f18927n && i10 == this.f18922a && objArr.length != 0 && objArr[0] == this.f18924c) {
            if (i7 == qs.f24979b2) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f18821f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof s4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f18927n = true;
                    d();
                    String str = this.f18925e;
                    j20 j20Var = this.d;
                    int i11 = j20Var.f23485k;
                    int i12 = j20Var.f23486l;
                    int ceil = (int) Math.ceil(j20Var.f23492r / 1000.0d);
                    t3Var.f18884h4.remove(sVar);
                    sVar.f18818b = true;
                    sVar.f18820e = str;
                    if (i11 > 0) {
                        sVar.f18824j = i11;
                    }
                    if (i12 > 0) {
                        sVar.f18825k = i12;
                    }
                    sVar.f18826l = 0;
                    sVar.f18827m = 0;
                    sVar.f18821f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) mVar.f14267c, sVar, str, true, sVar.f18824j, sVar.f18825k, ceil);
                }
            } else if (i7 == qs.f24985c2) {
                b();
            }
        }
    }
}
