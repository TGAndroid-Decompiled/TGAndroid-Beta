package mi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
public final class v4 implements cs {
    public final int f19980a;
    public final k4.j f19981b;
    public zi f19982c;
    public b20 d;
    public String f19983e;
    public boolean f19984f;
    public boolean h;
    public boolean f19985n;

    public v4(int i3, ye yeVar, k4.j jVar) {
        this.f19980a = i3;
        this.f19981b = jVar;
    }

    public static boolean c(ye yeVar) {
        ArrayList arrayList;
        if (!yeVar.f25310b) {
            ArrayList arrayList2 = yeVar.f25323q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = yeVar.f25323q;
            } else {
                arrayList = yeVar.f25322p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    z10 z10Var = (z10) arrayList.get(i3);
                    if (z10Var != null) {
                        if (z10Var.f26703a == 0) {
                            byte b10 = z10Var.f26704b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = z10Var.f26711k;
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
        if (!this.f19985n && !this.h) {
            this.h = true;
            if (this.f19982c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f19982c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f19985n) {
            return;
        }
        this.f19985n = true;
        d();
        k4.j jVar = this.f19981b;
        t3 t3Var = (t3) jVar.f16871c;
        IdentityHashMap identityHashMap = t3Var.f19908i4;
        s sVar = (s) jVar.f16869a;
        identityHashMap.remove(sVar);
        sVar.f19859a = 3;
        t3Var.t4((a) jVar.f16870b, sVar);
        t3Var.f19916p3.onContentChanged();
    }

    public final void d() {
        hs f10 = hs.f(this.f19980a);
        f10.n(this, hs.f23198a2);
        f10.n(this, hs.f23204b2);
        f10.n(this, hs.c2);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        k4.j jVar = this.f19981b;
        a aVar = (a) jVar.f16870b;
        s sVar = (s) jVar.f16869a;
        t3 t3Var = (t3) jVar.f16871c;
        if (!this.h && !this.f19985n && i10 == this.f19980a && objArr.length != 0 && objArr[0] == this.f19982c) {
            if (i3 == hs.f23204b2) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f19863f = ((Float) objArr[4]).floatValue();
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof t4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f19985n = true;
                    d();
                    String str = this.f19983e;
                    b20 b20Var = this.d;
                    int i11 = b20Var.f21718k;
                    int i12 = b20Var.f21719l;
                    int ceil = (int) Math.ceil(b20Var.f21725r / 1000.0d);
                    t3Var.f19908i4.remove(sVar);
                    sVar.f19860b = true;
                    sVar.f19862e = str;
                    if (i11 > 0) {
                        sVar.f19866j = i11;
                    }
                    if (i12 > 0) {
                        sVar.f19867k = i12;
                    }
                    sVar.f19868l = 0;
                    sVar.f19869m = 0;
                    sVar.f19863f = 0.0f;
                    t3Var.q4(aVar);
                    t3Var.O4((a) jVar.f16870b, sVar, str, true, sVar.f19866j, sVar.f19867k, ceil);
                }
            } else if (i3 == hs.c2) {
                b();
            }
        }
    }
}
