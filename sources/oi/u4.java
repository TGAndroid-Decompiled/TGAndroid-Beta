package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class u4 implements fs {
    public final int f22531a;
    public final h6.m f22532b;
    public fj f22533c;
    public d20 d;
    public String f22534e;
    public boolean f22535f;
    public boolean h;
    public boolean f22536n;

    public u4(int i7, ef efVar, h6.m mVar) {
        this.f22531a = i7;
        this.f22532b = mVar;
    }

    public static boolean c(ef efVar) {
        ArrayList arrayList;
        if (!efVar.f27963b) {
            ArrayList arrayList2 = efVar.f27976q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = efVar.f27976q;
            } else {
                arrayList = efVar.f27975p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    b20 b20Var = (b20) arrayList.get(i7);
                    if (b20Var != null) {
                        if (b20Var.f23124a == 0) {
                            byte b10 = b20Var.f23126b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = b20Var.f23133k;
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
        if (!this.f22536n && !this.h) {
            this.h = true;
            if (this.f22533c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22533c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22536n) {
            return;
        }
        this.f22536n = true;
        d();
        h6.m mVar = this.f22532b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.f22487i4;
        s sVar = (s) mVar.f13931b;
        identityHashMap.remove(sVar);
        sVar.f22421a = 3;
        t3Var.t4((a) mVar.f13932c, sVar);
        t3Var.f22495p3.onContentChanged();
    }

    public final void d() {
        ks f10 = ks.f(this.f22531a);
        f10.n(this, ks.f25181a2);
        f10.n(this, ks.f25188b2);
        f10.n(this, ks.f25194c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22532b;
        a aVar = (a) mVar.f13932c;
        s sVar = (s) mVar.f13931b;
        t3 t3Var = (t3) mVar.d;
        if (!this.h && !this.f22536n && i10 == this.f22531a && objArr.length != 0 && objArr[0] == this.f22533c) {
            if (i7 == ks.f25188b2) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f22425f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof s4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22536n = true;
                    d();
                    String str = this.f22534e;
                    d20 d20Var = this.d;
                    int i11 = d20Var.f23597k;
                    int i12 = d20Var.f23598l;
                    int ceil = (int) Math.ceil(d20Var.f23604r / 1000.0d);
                    t3Var.f22487i4.remove(sVar);
                    sVar.f22422b = true;
                    sVar.f22424e = str;
                    if (i11 > 0) {
                        sVar.f22428j = i11;
                    }
                    if (i12 > 0) {
                        sVar.f22429k = i12;
                    }
                    sVar.f22430l = 0;
                    sVar.f22431m = 0;
                    sVar.f22425f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) mVar.f13932c, sVar, str, true, sVar.f22428j, sVar.f22429k, ceil);
                }
            } else if (i7 == ks.f25194c2) {
                b();
            }
        }
    }
}
