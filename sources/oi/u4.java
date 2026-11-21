package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class u4 implements fs {
    public final int f22461a;
    public final h6.m f22462b;
    public fj f22463c;
    public e20 d;
    public String f22464e;
    public boolean f22465f;
    public boolean h;
    public boolean f22466n;

    public u4(int i7, ef efVar, h6.m mVar) {
        this.f22461a = i7;
        this.f22462b = mVar;
    }

    public static boolean c(ef efVar) {
        ArrayList arrayList;
        if (!efVar.f27875b) {
            ArrayList arrayList2 = efVar.f27888q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = efVar.f27888q;
            } else {
                arrayList = efVar.f27887p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    c20 c20Var = (c20) arrayList.get(i7);
                    if (c20Var != null) {
                        if (c20Var.f23257a == 0) {
                            byte b10 = c20Var.f23258b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = c20Var.f23265k;
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
        if (!this.f22466n && !this.h) {
            this.h = true;
            if (this.f22463c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22463c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22466n) {
            return;
        }
        this.f22466n = true;
        d();
        h6.m mVar = this.f22462b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.f22417i4;
        r rVar = (r) mVar.f13965b;
        identityHashMap.remove(rVar);
        rVar.f22341a = 3;
        t3Var.t4((a) mVar.f13966c, rVar);
        t3Var.f22425p3.onContentChanged();
    }

    public final void d() {
        ks f10 = ks.f(this.f22461a);
        f10.n(this, ks.f25110a2);
        f10.n(this, ks.f25117b2);
        f10.n(this, ks.f25123c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22462b;
        a aVar = (a) mVar.f13966c;
        r rVar = (r) mVar.f13965b;
        t3 t3Var = (t3) mVar.d;
        if (!this.h && !this.f22466n && i10 == this.f22461a && objArr.length != 0 && objArr[0] == this.f22463c) {
            if (i7 == ks.f25117b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f22345f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof s4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22466n = true;
                    d();
                    String str = this.f22464e;
                    e20 e20Var = this.d;
                    int i11 = e20Var.f23672k;
                    int i12 = e20Var.f23673l;
                    int ceil = (int) Math.ceil(e20Var.f23679r / 1000.0d);
                    t3Var.f22417i4.remove(rVar);
                    rVar.f22342b = true;
                    rVar.f22344e = str;
                    if (i11 > 0) {
                        rVar.f22348j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f22349k = i12;
                    }
                    rVar.f22350l = 0;
                    rVar.f22351m = 0;
                    rVar.f22345f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) mVar.f13966c, rVar, str, true, rVar.f22348j, rVar.f22349k, ceil);
                }
            } else if (i7 == ks.f25123c2) {
                b();
            }
        }
    }
}
