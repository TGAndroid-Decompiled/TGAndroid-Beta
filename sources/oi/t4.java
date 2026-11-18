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
public final class t4 implements fs {
    public final int f22372a;
    public final h6.m f22373b;
    public fj f22374c;
    public e20 d;
    public String f22375e;
    public boolean f22376f;
    public boolean h;
    public boolean f22377n;

    public t4(int i7, ef efVar, h6.m mVar) {
        this.f22372a = i7;
        this.f22373b = mVar;
    }

    public static boolean c(ef efVar) {
        ArrayList arrayList;
        if (!efVar.f27847b) {
            ArrayList arrayList2 = efVar.f27860q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = efVar.f27860q;
            } else {
                arrayList = efVar.f27859p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    c20 c20Var = (c20) arrayList.get(i7);
                    if (c20Var != null) {
                        if (c20Var.f23229a == 0) {
                            byte b10 = c20Var.f23230b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = c20Var.f23237k;
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
        if (!this.f22377n && !this.h) {
            this.h = true;
            if (this.f22374c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22374c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22377n) {
            return;
        }
        this.f22377n = true;
        d();
        h6.m mVar = this.f22373b;
        s3 s3Var = (s3) mVar.d;
        IdentityHashMap identityHashMap = s3Var.f22326i4;
        r rVar = (r) mVar.f13936b;
        identityHashMap.remove(rVar);
        rVar.f22258a = 3;
        s3Var.t4((a) mVar.f13937c, rVar);
        s3Var.f22334p3.onContentChanged();
    }

    public final void d() {
        ks f10 = ks.f(this.f22372a);
        f10.n(this, ks.f25082a2);
        f10.n(this, ks.f25089b2);
        f10.n(this, ks.f25095c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22373b;
        a aVar = (a) mVar.f13937c;
        r rVar = (r) mVar.f13936b;
        s3 s3Var = (s3) mVar.d;
        if (!this.h && !this.f22377n && i10 == this.f22372a && objArr.length != 0 && objArr[0] == this.f22374c) {
            if (i7 == ks.f25089b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f22262f = ((Float) objArr[4]).floatValue();
                View C1 = s3Var.C1(aVar);
                if (C1 instanceof r4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22377n = true;
                    d();
                    String str = this.f22375e;
                    e20 e20Var = this.d;
                    int i11 = e20Var.f23644k;
                    int i12 = e20Var.f23645l;
                    int ceil = (int) Math.ceil(e20Var.f23651r / 1000.0d);
                    s3Var.f22326i4.remove(rVar);
                    rVar.f22259b = true;
                    rVar.f22261e = str;
                    if (i11 > 0) {
                        rVar.f22265j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f22266k = i12;
                    }
                    rVar.f22267l = 0;
                    rVar.f22268m = 0;
                    rVar.f22262f = 0.0f;
                    s3Var.q4(aVar);
                    s3Var.O4((a) mVar.f13937c, rVar, str, true, rVar.f22265j, rVar.f22266k, ceil);
                }
            } else if (i7 == ks.f25095c2) {
                b();
            }
        }
    }
}
