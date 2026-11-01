package bi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.ff;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.messenger.w20;
import org.telegram.messenger.y20;
public final class h5 implements vs {
    public final int f3059a;
    public final android.support.v4.media.session.a0 f3060b;
    public kj f3061c;
    public y20 d;
    public String e;
    public boolean f3062f;
    public boolean h;
    public boolean f3063n;

    public h5(int i10, ff ffVar, android.support.v4.media.session.a0 a0Var) {
        this.f3059a = i10;
        this.f3060b = a0Var;
    }

    public static boolean c(ff ffVar) {
        ArrayList arrayList;
        if (!ffVar.f14603b) {
            ArrayList arrayList2 = ffVar.f14615q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = ffVar.f14615q;
            } else {
                arrayList = ffVar.f14614p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    w20 w20Var = (w20) arrayList.get(i10);
                    if (w20Var != null) {
                        if (w20Var.f18970a == 0) {
                            byte b10 = w20Var.f18971b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = w20Var.f18977k;
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
        at f7 = at.f(this.f3059a);
        f7.n(this, at.a2);
        f7.n(this, at.f14682b2);
        f7.n(this, at.f14688c2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        android.support.v4.media.session.a0 a0Var = this.f3060b;
        a aVar = (a) a0Var.f876c;
        w wVar = (w) a0Var.f875b;
        d4 d4Var = (d4) a0Var.d;
        if (!this.h && !this.f3063n && i11 == this.f3059a && objArr.length != 0 && objArr[0] == this.f3061c) {
            if (i10 == at.f14682b2) {
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
                    y20 y20Var = this.d;
                    int i12 = y20Var.f19535k;
                    int i13 = y20Var.f19536l;
                    int ceil = (int) Math.ceil(y20Var.f19542r / 1000.0d);
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
            } else if (i10 == at.f14688c2) {
                b();
            }
        }
    }
}
