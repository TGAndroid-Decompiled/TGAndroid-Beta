package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ng implements Runnable {
    public final int f24184a;
    public final Object f24185b;
    public final Object f24186c;
    public final Object d;

    public ng(Object obj, Object obj2, Object obj3, int i7) {
        this.f24184a = i7;
        this.f24186c = obj;
        this.f24185b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f24186c;
        TLRPC.Document document = (TLRPC.Document) this.f24185b;
        ij ijVar = (ij) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.H;
        } else {
            Integer num = (Integer) s8.I.get(Long.valueOf(document.f26959id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, ijVar, null, 0L, i7, w7.M, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f24186c;
        lg.f fVar = (lg.f) this.f24185b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f26268w.remove(i7Var.f23118r);
            fVar.b(i7Var.f23102j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f24186c;
        File file = (File) this.f24185b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f22361c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f22172a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f22173b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f22174c);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void d() {
        String str = (String) this.f24185b;
        i7 i7Var = (i7) this.d;
        gc gcVar = ((qb) this.f24186c).f24684b;
        HashMap hashMap = gcVar.h;
        ConcurrentHashMap concurrentHashMap = gcVar.f22622i;
        ub ubVar = (ub) hashMap.remove(str);
        if (ubVar != null) {
            ArrayList arrayList = ubVar.v;
            gcVar.f22621g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) ubVar.f25761x.get(i7);
                String str3 = (String) ubVar.f25762y.get(i7);
                int intValue = ((Integer) ubVar.f25763z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) ubVar.f25760w.get(i7)).intValue();
                ub ubVar2 = (ub) concurrentHashMap.get(str2);
                if (ubVar2 == null) {
                    ubVar2 = new ub(gcVar);
                    ubVar2.f25741a = ubVar.f25741a;
                    ubVar2.h = ubVar.h;
                    ubVar2.f25753o = ubVar.f25753o;
                    ubVar2.f25754p = i7Var.g();
                    ubVar2.f25748j = ubVar.f25748j;
                    ubVar2.f25743c = ubVar.f25743c;
                    ubVar2.d = str2;
                    ubVar2.f25747i = ubVar.f25747i;
                    ubVar2.f25751m = intValue;
                    ubVar2.f25746g = ubVar.f25746g;
                    ubVar2.f25756r = ubVar.f25756r;
                    ubVar2.f25759u = new vb(gcVar, ubVar2);
                    ubVar2.f25745f = str3;
                    ubVar2.f25750l = ubVar.f25750l;
                    ubVar2.f25752n = ubVar.f25752n;
                    concurrentHashMap.put(str2, ubVar2);
                    gcVar.f22623j.add(gc.n(str2));
                    arrayList2.add(ubVar2.f25759u);
                }
                ubVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                vb vbVar = (vb) arrayList2.get(i10);
                ub ubVar3 = vbVar.f25962c;
                if (ubVar3.f25751m == 1) {
                    gcVar.f22630q.c(vbVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = gcVar.f22629p;
                    int i11 = ubVar3.f25741a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        vbVar = new of.b(i11, vbVar);
                    }
                    ((of.a) b0Var.f6814b).execute(vbVar);
                }
            }
        }
    }

    private final void f() {
        ((vb) this.f24186c).f25962c.c((Drawable) this.f24185b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f24186c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f24185b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        sd sdVar = (sd) this.f24186c;
        rd rdVar = (rd) this.f24185b;
        rd rdVar2 = (rd) this.d;
        ArrayList arrayList = sdVar.I;
        if (rdVar != null) {
            arrayList.remove(rdVar);
        }
        arrayList.add(rdVar2);
        sdVar.J.k(rdVar2, rdVar2.f25273a);
        sd.q();
        qs.e().k(qs.D4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ng.run():void");
    }

    public ng(TLObject tLObject, c20 c20Var, TLRPC.TL_error tL_error) {
        this.f24184a = 12;
        this.d = tLObject;
        this.f24186c = c20Var;
        this.f24185b = tL_error;
    }
}
