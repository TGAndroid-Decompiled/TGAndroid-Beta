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
public final class t4 implements gs {
    public final int f22401a;
    public final h6.m f22402b;
    public gj f22403c;
    public f20 d;
    public String f22404e;
    public boolean f22405f;
    public boolean h;
    public boolean f22406n;

    public t4(int i7, ff ffVar, h6.m mVar) {
        this.f22401a = i7;
        this.f22402b = mVar;
    }

    public static boolean c(ff ffVar) {
        ArrayList arrayList;
        if (!ffVar.f28023b) {
            ArrayList arrayList2 = ffVar.f28036q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = ffVar.f28036q;
            } else {
                arrayList = ffVar.f28035p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    d20 d20Var = (d20) arrayList.get(i7);
                    if (d20Var != null) {
                        if (d20Var.f23442a == 0) {
                            byte b10 = d20Var.f23443b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = d20Var.f23450k;
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
        if (!this.f22406n && !this.h) {
            this.h = true;
            if (this.f22403c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22403c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22406n) {
            return;
        }
        this.f22406n = true;
        d();
        h6.m mVar = this.f22402b;
        s3 s3Var = (s3) mVar.d;
        IdentityHashMap identityHashMap = s3Var.f22357i4;
        r rVar = (r) mVar.f13931b;
        identityHashMap.remove(rVar);
        rVar.f22289a = 3;
        s3Var.t4((a) mVar.f13932c, rVar);
        s3Var.f22365p3.onContentChanged();
    }

    public final void d() {
        ls f10 = ls.f(this.f22401a);
        f10.n(this, ls.f25240a2);
        f10.n(this, ls.f25247b2);
        f10.n(this, ls.f25253c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22402b;
        a aVar = (a) mVar.f13932c;
        r rVar = (r) mVar.f13931b;
        s3 s3Var = (s3) mVar.d;
        if (!this.h && !this.f22406n && i10 == this.f22401a && objArr.length != 0 && objArr[0] == this.f22403c) {
            if (i7 == ls.f25247b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f22293f = ((Float) objArr[4]).floatValue();
                View C1 = s3Var.C1(aVar);
                if (C1 instanceof r4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22406n = true;
                    d();
                    String str = this.f22404e;
                    f20 f20Var = this.d;
                    int i11 = f20Var.f23800k;
                    int i12 = f20Var.f23801l;
                    int ceil = (int) Math.ceil(f20Var.f23807r / 1000.0d);
                    s3Var.f22357i4.remove(rVar);
                    rVar.f22290b = true;
                    rVar.f22292e = str;
                    if (i11 > 0) {
                        rVar.f22296j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f22297k = i12;
                    }
                    rVar.f22298l = 0;
                    rVar.f22299m = 0;
                    rVar.f22293f = 0.0f;
                    s3Var.q4(aVar);
                    s3Var.O4((a) mVar.f13932c, rVar, str, true, rVar.f22296j, rVar.f22297k, ceil);
                }
            } else if (i7 == ls.f25253c2) {
                b();
            }
        }
    }
}
