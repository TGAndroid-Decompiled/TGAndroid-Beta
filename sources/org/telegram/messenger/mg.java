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
    public final int f16949a;
    public final Object f16950b;
    public final Object f16951c;
    public final Object d;

    public mg(Object obj, Object obj2, Object obj3, int i10) {
        this.f16949a = i10;
        this.f16951c = obj;
        this.f16950b = obj2;
        this.d = obj3;
    }

    private final void a() {
        b8 b8Var = (b8) this.f16951c;
        TLRPC.Document document = (TLRPC.Document) this.f16950b;
        jj jjVar = (jj) this.d;
        int i10 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = x8.H;
        } else {
            Integer num = (Integer) x8.I.get(Long.valueOf(document.f19799id));
            if (num != null) {
                i10 = num.intValue();
            }
        }
        b8Var.Z(document, null, null, null, null, jjVar, null, 0L, i10, b8.M, 0L, false, 0);
    }

    private final void b() {
        b8 b8Var = (b8) this.f16951c;
        bg.h hVar = (bg.h) this.f16950b;
        m7 m7Var = (m7) this.d;
        if (((ArrayList) hVar.d).remove(m7Var)) {
            b8Var.f14746w.remove(m7Var.f16912r);
            hVar.b(m7Var.f16896j);
        }
    }

    private final void c() {
        k8 k8Var = (k8) this.f16951c;
        File file = (File) this.f16950b;
        j8 j8Var = (j8) this.d;
        k8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = k8Var.f16546c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, j8Var.f16227a);
                sQLitePreparedStatement.bindInteger(3, j8Var.f16228b);
                sQLitePreparedStatement.bindInteger(4, j8Var.f16229c);
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
        String str = (String) this.f16950b;
        m7 m7Var = (m7) this.d;
        hc hcVar = ((rb) this.f16951c).f17713b;
        HashMap hashMap = hcVar.h;
        ConcurrentHashMap concurrentHashMap = hcVar.f15858i;
        vb vbVar = (vb) hashMap.remove(str);
        if (vbVar != null) {
            ArrayList arrayList = vbVar.v;
            hcVar.f15857g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String str2 = (String) vbVar.f18506x.get(i10);
                String str3 = (String) vbVar.f18507y.get(i10);
                int intValue = ((Integer) vbVar.f18508z.get(i10)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
                int intValue2 = ((Integer) vbVar.f18505w.get(i10)).intValue();
                vb vbVar2 = (vb) concurrentHashMap.get(str2);
                if (vbVar2 == null) {
                    vbVar2 = new vb(hcVar);
                    vbVar2.f18487a = vbVar.f18487a;
                    vbVar2.h = vbVar.h;
                    vbVar2.f18498o = vbVar.f18498o;
                    vbVar2.f18499p = m7Var.g();
                    vbVar2.f18493j = vbVar.f18493j;
                    vbVar2.f18489c = vbVar.f18489c;
                    vbVar2.d = str2;
                    vbVar2.f18492i = vbVar.f18492i;
                    vbVar2.f18496m = intValue;
                    vbVar2.f18491g = vbVar.f18491g;
                    vbVar2.f18501r = vbVar.f18501r;
                    vbVar2.f18504u = new wb(hcVar, vbVar2);
                    vbVar2.f18490f = str3;
                    vbVar2.f18495l = vbVar.f18495l;
                    vbVar2.f18497n = vbVar.f18497n;
                    concurrentHashMap.put(str2, vbVar2);
                    hcVar.f15859j.add(hc.n(str2));
                    arrayList2.add(vbVar2.f18504u);
                }
                vbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                wb wbVar = (wb) arrayList2.get(i11);
                vb vbVar3 = wbVar.f19079c;
                if (vbVar3.f18496m == 1) {
                    hcVar.f15866q.c(wbVar);
                } else {
                    com.google.android.gms.internal.cast.c0 c0Var = hcVar.f15865p;
                    int i12 = vbVar3.f18487a;
                    if (i12 != 1) {
                        c0Var.getClass();
                        wbVar = new ze.b(i12, wbVar);
                    }
                    ((ze.a) c0Var.f4585b).execute(wbVar);
                }
            }
        }
    }

    private final void f() {
        ((wb) this.f16951c).f19079c.c((Drawable) this.f16950b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f16951c;
        Runnable runnable = (Runnable) this.d;
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 >= ((int[]) this.f16950b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        nd ndVar = (nd) this.f16951c;
        md mdVar = (md) this.f16950b;
        md mdVar2 = (md) this.d;
        ArrayList arrayList = ndVar.I;
        if (mdVar != null) {
            arrayList.remove(mdVar);
        }
        arrayList.add(mdVar2);
        ndVar.J.k(mdVar2, mdVar2.f16940a);
        nd.q();
        zs.e().k(zs.D4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mg.run():void");
    }

    public mg(TLObject tLObject, q20 q20Var, TLRPC.TL_error tL_error) {
        this.f16949a = 12;
        this.d = tLObject;
        this.f16951c = q20Var;
        this.f16950b = tL_error;
    }
}
