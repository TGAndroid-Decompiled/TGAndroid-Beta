package bi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ef;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.v20;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
public final class h5 implements us {
    public final int f3059a;
    public final android.support.v4.media.session.a0 f3060b;
    public jj f3061c;
    public x20 d;
    public String e;
    public boolean f3062f;
    public boolean h;
    public boolean f3063n;

    public h5(int i10, ef efVar, android.support.v4.media.session.a0 a0Var) {
        this.f3059a = i10;
        this.f3060b = a0Var;
    }

    public static boolean c(ef efVar) {
        ArrayList arrayList;
        if (!efVar.f19507b) {
            ArrayList arrayList2 = efVar.f19519q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = efVar.f19519q;
            } else {
                arrayList = efVar.f19518p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v20 v20Var = (v20) arrayList.get(i10);
                    if (v20Var != null) {
                        if (v20Var.f18455a == 0) {
                            byte b10 = v20Var.f18456b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = v20Var.f18462k;
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
        if (!this.f3063n && !this.h) {
            this.h = true;
            if (this.f3061c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f3061c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f3063n) {
            return;
        }
        this.f3063n = true;
        d();
        android.support.v4.media.session.a0 a0Var = this.f3060b;
        d4 d4Var = (d4) a0Var.d;
        IdentityHashMap identityHashMap = d4Var.f2930h4;
        w wVar = (w) a0Var.f875b;
        identityHashMap.remove(wVar);
        wVar.f3416a = 3;
        d4Var.t4((a) a0Var.f876c, wVar);
        d4Var.f2938o3.onContentChanged();
    }

    public final void d() {
        zs f7 = zs.f(this.f3059a);
        f7.n(this, zs.a2);
        f7.n(this, zs.f19586b2);
        f7.n(this, zs.f19592c2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        android.support.v4.media.session.a0 a0Var = this.f3060b;
        a aVar = (a) a0Var.f876c;
        w wVar = (w) a0Var.f875b;
        d4 d4Var = (d4) a0Var.d;
        if (!this.h && !this.f3063n && i11 == this.f3059a && objArr.length != 0 && objArr[0] == this.f3061c) {
            if (i10 == zs.f19586b2) {
                long longValue = ((Long) objArr[3]).longValue();
                wVar.f3419f = ((Float) objArr[4]).floatValue();
                View C1 = d4Var.C1(aVar);
                if (C1 instanceof f5) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f3063n = true;
                    d();
                    String str = this.e;
                    x20 x20Var = this.d;
                    int i12 = x20Var.f19192k;
                    int i13 = x20Var.f19193l;
                    int ceil = (int) Math.ceil(x20Var.f19199r / 1000.0d);
                    d4Var.f2930h4.remove(wVar);
                    wVar.f3417b = true;
                    wVar.e = str;
                    if (i12 > 0) {
                        wVar.f3422j = i12;
                    }
                    if (i13 > 0) {
                        wVar.f3423k = i13;
                    }
                    wVar.f3424l = 0;
                    wVar.f3425m = 0;
                    wVar.f3419f = 0.0f;
                    d4Var.q4(aVar);
                    d4Var.O4((a) a0Var.f876c, wVar, str, true, wVar.f3422j, wVar.f3423k, ceil);
                }
            } else if (i10 == zs.f19592c2) {
                b();
            }
        }
    }
}
