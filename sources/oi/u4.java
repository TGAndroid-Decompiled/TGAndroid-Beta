package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.f20;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class u4 implements gs {
    public final int f22464a;
    public final h6.m f22465b;
    public gj f22466c;
    public f20 d;
    public String f22467e;
    public boolean f22468f;
    public boolean h;
    public boolean f22469n;

    public u4(int i7, ff ffVar, h6.m mVar) {
        this.f22464a = i7;
        this.f22465b = mVar;
    }

    public static boolean c(ff ffVar) {
        ArrayList arrayList;
        if (!ffVar.f28059b) {
            ArrayList arrayList2 = ffVar.f28072q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = ffVar.f28072q;
            } else {
                arrayList = ffVar.f28071p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    d20 d20Var = (d20) arrayList.get(i7);
                    if (d20Var != null) {
                        if (d20Var.f23478a == 0) {
                            byte b10 = d20Var.f23479b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = d20Var.f23486k;
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
        if (!this.f22469n && !this.h) {
            this.h = true;
            if (this.f22466c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22466c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22469n) {
            return;
        }
        this.f22469n = true;
        d();
        h6.m mVar = this.f22465b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.f22420i4;
        r rVar = (r) mVar.f13968b;
        identityHashMap.remove(rVar);
        rVar.f22344a = 3;
        t3Var.t4((a) mVar.f13969c, rVar);
        t3Var.f22428p3.onContentChanged();
    }

    public final void d() {
        ls f10 = ls.f(this.f22464a);
        f10.n(this, ls.f25276a2);
        f10.n(this, ls.f25283b2);
        f10.n(this, ls.f25289c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22465b;
        a aVar = (a) mVar.f13969c;
        r rVar = (r) mVar.f13968b;
        t3 t3Var = (t3) mVar.d;
        if (!this.h && !this.f22469n && i10 == this.f22464a && objArr.length != 0 && objArr[0] == this.f22466c) {
            if (i7 == ls.f25283b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f22348f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof s4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22469n = true;
                    d();
                    String str = this.f22467e;
                    f20 f20Var = this.d;
                    int i11 = f20Var.f23836k;
                    int i12 = f20Var.f23837l;
                    int ceil = (int) Math.ceil(f20Var.f23843r / 1000.0d);
                    t3Var.f22420i4.remove(rVar);
                    rVar.f22345b = true;
                    rVar.f22347e = str;
                    if (i11 > 0) {
                        rVar.f22351j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f22352k = i12;
                    }
                    rVar.f22353l = 0;
                    rVar.f22354m = 0;
                    rVar.f22348f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) mVar.f13969c, rVar, str, true, rVar.f22351j, rVar.f22352k, ceil);
                }
            } else if (i7 == ls.f25289c2) {
                b();
            }
        }
    }
}
