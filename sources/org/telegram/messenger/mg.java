package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f25034a;
    public final Object f25035b;
    public final Object f25036c;
    public final Object d;

    public mg(Object obj, Object obj2, Object obj3, int i7) {
        this.f25034a = i7;
        this.f25036c = obj;
        this.f25035b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f25036c;
        TLRPC.Document document = (TLRPC.Document) this.f25035b;
        gj gjVar = (gj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28057id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, gjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f25036c;
        lg.f fVar = (lg.f) this.f25035b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27314w.remove(i7Var.f24335r);
            fVar.b(i7Var.f24319j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f25036c;
        File file = (File) this.f25035b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23455c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23279a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23280b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23281c);
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
        String str = (String) this.f25035b;
        i7 i7Var = (i7) this.d;
        fc fcVar = ((pb) this.f25036c).f25921b;
        HashMap hashMap = fcVar.h;
        ConcurrentHashMap concurrentHashMap = fcVar.f23469i;
        tb tbVar = (tb) hashMap.remove(str);
        if (tbVar != null) {
            ArrayList arrayList = tbVar.v;
            fcVar.f23468g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) tbVar.f26663x.get(i7);
                String str3 = (String) tbVar.f26664y.get(i7);
                int intValue = ((Integer) tbVar.f26665z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) tbVar.f26662w.get(i7)).intValue();
                tb tbVar2 = (tb) concurrentHashMap.get(str2);
                if (tbVar2 == null) {
                    tbVar2 = new tb(fcVar);
                    tbVar2.f26643a = tbVar.f26643a;
                    tbVar2.h = tbVar.h;
                    tbVar2.f26655o = tbVar.f26655o;
                    tbVar2.f26656p = i7Var.g();
                    tbVar2.f26650j = tbVar.f26650j;
                    tbVar2.f26645c = tbVar.f26645c;
                    tbVar2.d = str2;
                    tbVar2.f26649i = tbVar.f26649i;
                    tbVar2.f26653m = intValue;
                    tbVar2.f26648g = tbVar.f26648g;
                    tbVar2.f26658r = tbVar.f26658r;
                    tbVar2.f26661u = new ub(fcVar, tbVar2);
                    tbVar2.f26647f = str3;
                    tbVar2.f26652l = tbVar.f26652l;
                    tbVar2.f26654n = tbVar.f26654n;
                    concurrentHashMap.put(str2, tbVar2);
                    fcVar.f23470j.add(fc.n(str2));
                    arrayList2.add(tbVar2.f26661u);
                }
                tbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ub ubVar = (ub) arrayList2.get(i10);
                tb tbVar3 = ubVar.f26800c;
                if (tbVar3.f26653m == 1) {
                    fcVar.f23477q.c(ubVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = fcVar.f23476p;
                    int i11 = tbVar3.f26643a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        ubVar = new of.b(i11, ubVar);
                    }
                    ((of.a) b0Var.f6206b).execute(ubVar);
                }
            }
        }
    }

    private final void f() {
        ((ub) this.f25036c).f26800c.c((Drawable) this.f25035b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f25036c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f25035b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        rd rdVar = (rd) this.f25036c;
        qd qdVar = (qd) this.f25035b;
        qd qdVar2 = (qd) this.d;
        ArrayList arrayList = rdVar.J;
        if (qdVar != null) {
            arrayList.remove(qdVar);
        }
        arrayList.add(qdVar2);
        rdVar.K.k(qdVar2, qdVar2.f26078a);
        rd.q();
        ns.e().k(ns.D4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mg.run():void");
    }

    public mg(TLObject tLObject, z10 z10Var, TLRPC.TL_error tL_error) {
        this.f25034a = 12;
        this.d = tLObject;
        this.f25036c = z10Var;
        this.f25035b = tL_error;
    }
}
