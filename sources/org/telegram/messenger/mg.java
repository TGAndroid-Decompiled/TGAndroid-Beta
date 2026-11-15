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
    public final int f25028a;
    public final Object f25029b;
    public final Object f25030c;
    public final Object d;

    public mg(Object obj, Object obj2, Object obj3, int i7) {
        this.f25028a = i7;
        this.f25030c = obj;
        this.f25029b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f25030c;
        TLRPC.Document document = (TLRPC.Document) this.f25029b;
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
        w7 w7Var = (w7) this.f25030c;
        lg.f fVar = (lg.f) this.f25029b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27315w.remove(i7Var.f24335r);
            fVar.b(i7Var.f24319j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f25030c;
        File file = (File) this.f25029b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23452c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23272a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23273b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23274c);
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
        String str = (String) this.f25029b;
        i7 i7Var = (i7) this.d;
        fc fcVar = ((pb) this.f25030c).f25919b;
        HashMap hashMap = fcVar.h;
        ConcurrentHashMap concurrentHashMap = fcVar.f23466i;
        tb tbVar = (tb) hashMap.remove(str);
        if (tbVar != null) {
            ArrayList arrayList = tbVar.v;
            fcVar.f23465g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) tbVar.f26654x.get(i7);
                String str3 = (String) tbVar.f26655y.get(i7);
                int intValue = ((Integer) tbVar.f26656z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) tbVar.f26653w.get(i7)).intValue();
                tb tbVar2 = (tb) concurrentHashMap.get(str2);
                if (tbVar2 == null) {
                    tbVar2 = new tb(fcVar);
                    tbVar2.f26634a = tbVar.f26634a;
                    tbVar2.h = tbVar.h;
                    tbVar2.f26646o = tbVar.f26646o;
                    tbVar2.f26647p = i7Var.g();
                    tbVar2.f26641j = tbVar.f26641j;
                    tbVar2.f26636c = tbVar.f26636c;
                    tbVar2.d = str2;
                    tbVar2.f26640i = tbVar.f26640i;
                    tbVar2.f26644m = intValue;
                    tbVar2.f26639g = tbVar.f26639g;
                    tbVar2.f26649r = tbVar.f26649r;
                    tbVar2.f26652u = new ub(fcVar, tbVar2);
                    tbVar2.f26638f = str3;
                    tbVar2.f26643l = tbVar.f26643l;
                    tbVar2.f26645n = tbVar.f26645n;
                    concurrentHashMap.put(str2, tbVar2);
                    fcVar.f23467j.add(fc.n(str2));
                    arrayList2.add(tbVar2.f26652u);
                }
                tbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ub ubVar = (ub) arrayList2.get(i10);
                tb tbVar3 = ubVar.f26798c;
                if (tbVar3.f26644m == 1) {
                    fcVar.f23474q.c(ubVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = fcVar.f23473p;
                    int i11 = tbVar3.f26634a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        ubVar = new of.b(i11, ubVar);
                    }
                    ((of.a) b0Var.f6203b).execute(ubVar);
                }
            }
        }
    }

    private final void f() {
        ((ub) this.f25030c).f26798c.c((Drawable) this.f25029b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f25030c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f25029b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        rd rdVar = (rd) this.f25030c;
        qd qdVar = (qd) this.f25029b;
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
        this.f25028a = 12;
        this.d = tLObject;
        this.f25030c = z10Var;
        this.f25029b = tL_error;
    }
}
