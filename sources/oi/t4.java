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
    public final int f22375a;
    public final h6.m f22376b;
    public fj f22377c;
    public e20 d;
    public String f22378e;
    public boolean f22379f;
    public boolean h;
    public boolean f22380n;

    public t4(int i7, ef efVar, h6.m mVar) {
        this.f22375a = i7;
        this.f22376b = mVar;
    }

    public static boolean c(ef efVar) {
        ArrayList arrayList;
        if (!efVar.f27849b) {
            ArrayList arrayList2 = efVar.f27862q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = efVar.f27862q;
            } else {
                arrayList = efVar.f27861p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    c20 c20Var = (c20) arrayList.get(i7);
                    if (c20Var != null) {
                        if (c20Var.f23232a == 0) {
                            byte b10 = c20Var.f23233b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = c20Var.f23240k;
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
        if (!this.f22380n && !this.h) {
            this.h = true;
            if (this.f22377c != null && this.d != null) {
                try {
                    MediaController.B().i(this.f22377c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f22380n) {
            return;
        }
        this.f22380n = true;
        d();
        h6.m mVar = this.f22376b;
        s3 s3Var = (s3) mVar.d;
        IdentityHashMap identityHashMap = s3Var.f22329i4;
        r rVar = (r) mVar.f13939b;
        identityHashMap.remove(rVar);
        rVar.f22261a = 3;
        s3Var.t4((a) mVar.f13940c, rVar);
        s3Var.f22337p3.onContentChanged();
    }

    public final void d() {
        ks f10 = ks.f(this.f22375a);
        f10.n(this, ks.f25085a2);
        f10.n(this, ks.f25091b2);
        f10.n(this, ks.f25097c2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.f22376b;
        a aVar = (a) mVar.f13940c;
        r rVar = (r) mVar.f13939b;
        s3 s3Var = (s3) mVar.d;
        if (!this.h && !this.f22380n && i10 == this.f22375a && objArr.length != 0 && objArr[0] == this.f22377c) {
            if (i7 == ks.f25091b2) {
                long longValue = ((Long) objArr[3]).longValue();
                rVar.f22265f = ((Float) objArr[4]).floatValue();
                View C1 = s3Var.C1(aVar);
                if (C1 instanceof r4) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.f22380n = true;
                    d();
                    String str = this.f22378e;
                    e20 e20Var = this.d;
                    int i11 = e20Var.f23647k;
                    int i12 = e20Var.f23648l;
                    int ceil = (int) Math.ceil(e20Var.f23654r / 1000.0d);
                    s3Var.f22329i4.remove(rVar);
                    rVar.f22262b = true;
                    rVar.f22264e = str;
                    if (i11 > 0) {
                        rVar.f22268j = i11;
                    }
                    if (i12 > 0) {
                        rVar.f22269k = i12;
                    }
                    rVar.f22270l = 0;
                    rVar.f22271m = 0;
                    rVar.f22265f = 0.0f;
                    s3Var.q4(aVar);
                    s3Var.O4((a) mVar.f13940c, rVar, str, true, rVar.f22268j, rVar.f22269k, ceil);
                }
            } else if (i7 == ks.f25097c2) {
                b();
            }
        }
    }
}
