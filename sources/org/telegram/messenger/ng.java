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
    public final int f17291a;
    public final Object f17292b;
    public final Object f17293c;
    public final Object d;

    public ng(Object obj, Object obj2, Object obj3, int i10) {
        this.f17291a = i10;
        this.f17293c = obj;
        this.f17292b = obj2;
        this.d = obj3;
    }

    private final void a() {
        b8 b8Var = (b8) this.f17293c;
        TLRPC.Document document = (TLRPC.Document) this.f17292b;
        kj kjVar = (kj) this.d;
        int i10 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = x8.H;
        } else {
            Integer num = (Integer) x8.I.get(Long.valueOf(document.f19800id));
            if (num != null) {
                i10 = num.intValue();
            }
        }
        b8Var.Z(document, null, null, null, null, kjVar, null, 0L, i10, b8.M, 0L, false, 0);
    }

    private final void b() {
        b8 b8Var = (b8) this.f17293c;
        bg.h hVar = (bg.h) this.f17292b;
        m7 m7Var = (m7) this.d;
        if (((ArrayList) hVar.d).remove(m7Var)) {
            b8Var.f14946w.remove(m7Var.f17082r);
            hVar.b(m7Var.f17066j);
        }
    }

    private final void c() {
        k8 k8Var = (k8) this.f17293c;
        File file = (File) this.f17292b;
        j8 j8Var = (j8) this.d;
        k8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = k8Var.f16580c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, j8Var.f16422a);
                sQLitePreparedStatement.bindInteger(3, j8Var.f16423b);
                sQLitePreparedStatement.bindInteger(4, j8Var.f16424c);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                f8.g(e, true);
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
        String str = (String) this.f17292b;
        m7 m7Var = (m7) this.d;
        ic icVar = ((sb) this.f17293c).f18077b;
        HashMap hashMap = icVar.h;
        ConcurrentHashMap concurrentHashMap = icVar.f16251i;
        wb wbVar = (wb) hashMap.remove(str);
        if (wbVar != null) {
            ArrayList arrayList = wbVar.v;
            icVar.f16250g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String str2 = (String) wbVar.f19028x.get(i10);
                String str3 = (String) wbVar.f19029y.get(i10);
                int intValue = ((Integer) wbVar.f19030z.get(i10)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
                int intValue2 = ((Integer) wbVar.f19027w.get(i10)).intValue();
                wb wbVar2 = (wb) concurrentHashMap.get(str2);
                if (wbVar2 == null) {
                    wbVar2 = new wb(icVar);
                    wbVar2.f19009a = wbVar.f19009a;
                    wbVar2.h = wbVar.h;
                    wbVar2.f19020o = wbVar.f19020o;
                    wbVar2.f19021p = m7Var.g();
                    wbVar2.f19015j = wbVar.f19015j;
                    wbVar2.f19011c = wbVar.f19011c;
                    wbVar2.d = str2;
                    wbVar2.f19014i = wbVar.f19014i;
                    wbVar2.f19018m = intValue;
                    wbVar2.f19013g = wbVar.f19013g;
                    wbVar2.f19023r = wbVar.f19023r;
                    wbVar2.f19026u = new xb(icVar, wbVar2);
                    wbVar2.f19012f = str3;
                    wbVar2.f19017l = wbVar.f19017l;
                    wbVar2.f19019n = wbVar.f19019n;
                    concurrentHashMap.put(str2, wbVar2);
                    icVar.f16252j.add(ic.n(str2));
                    arrayList2.add(wbVar2.f19026u);
                }
                wbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                xb xbVar = (xb) arrayList2.get(i11);
                wb wbVar3 = xbVar.f19422c;
                if (wbVar3.f19018m == 1) {
                    icVar.f16259q.c(xbVar);
                } else {
                    com.google.android.gms.internal.cast.c0 c0Var = icVar.f16258p;
                    int i12 = wbVar3.f19009a;
                    if (i12 != 1) {
                        c0Var.getClass();
                        xbVar = new ze.b(i12, xbVar);
                    }
                    ((ze.a) c0Var.f4585b).execute(xbVar);
                }
            }
        }
    }

    private final void f() {
        ((xb) this.f17293c).f19422c.c((Drawable) this.f17292b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f17293c;
        Runnable runnable = (Runnable) this.d;
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 >= ((int[]) this.f17292b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        od odVar = (od) this.f17293c;
        nd ndVar = (nd) this.f17292b;
        nd ndVar2 = (nd) this.d;
        ArrayList arrayList = odVar.I;
        if (ndVar != null) {
            arrayList.remove(ndVar);
        }
        arrayList.add(ndVar2);
        odVar.J.k(ndVar2, ndVar2.f17282a);
        od.q();
        at.e().k(at.D4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ng.run():void");
    }

    public ng(TLObject tLObject, r20 r20Var, TLRPC.TL_error tL_error) {
        this.f17291a = 12;
        this.d = tLObject;
        this.f17293c = r20Var;
        this.f17292b = tL_error;
    }
}
