package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fg implements Runnable {
    public final int f22486a;
    public final Object f22487b;
    public final Object f22488c;
    public final Object d;

    public fg(Object obj, Object obj2, Object obj3, int i3) {
        this.f22486a = i3;
        this.f22488c = obj;
        this.f22487b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f22488c;
        TLRPC.Document document = (TLRPC.Document) this.f22487b;
        zi ziVar = (zi) this.d;
        int i3 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f27007id));
            if (num != null) {
                i3 = num.intValue();
            }
        }
        w7Var.Z(document, null, null, null, null, ziVar, null, 0L, i3, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f22488c;
        mg.f fVar = (mg.f) this.f22487b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f26174w.remove(i7Var.f23501r);
            fVar.b(i7Var.f23485j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f22488c;
        File file = (File) this.f22487b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f22463c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f22324a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f22325b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f22326c);
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

    private final void e() {
        String str = (String) this.f22487b;
        i7 i7Var = (i7) this.d;
        zb zbVar = ((jb) this.f22488c).f23659b;
        HashMap hashMap = zbVar.h;
        ConcurrentHashMap concurrentHashMap = zbVar.f26763i;
        nb nbVar = (nb) hashMap.remove(str);
        if (nbVar != null) {
            ArrayList arrayList = nbVar.v;
            zbVar.f26762g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                String str2 = (String) nbVar.f24360x.get(i3);
                String str3 = (String) nbVar.f24361y.get(i3);
                int intValue = ((Integer) nbVar.f24362z.get(i3)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i3);
                int intValue2 = ((Integer) nbVar.f24359w.get(i3)).intValue();
                nb nbVar2 = (nb) concurrentHashMap.get(str2);
                if (nbVar2 == null) {
                    nbVar2 = new nb(zbVar);
                    nbVar2.f24340a = nbVar.f24340a;
                    nbVar2.h = nbVar.h;
                    nbVar2.f24352o = nbVar.f24352o;
                    nbVar2.f24353p = i7Var.g();
                    nbVar2.f24347j = nbVar.f24347j;
                    nbVar2.f24342c = nbVar.f24342c;
                    nbVar2.d = str2;
                    nbVar2.f24346i = nbVar.f24346i;
                    nbVar2.f24350m = intValue;
                    nbVar2.f24345g = nbVar.f24345g;
                    nbVar2.f24355r = nbVar.f24355r;
                    nbVar2.f24358u = new ob(zbVar, nbVar2);
                    nbVar2.f24344f = str3;
                    nbVar2.f24349l = nbVar.f24349l;
                    nbVar2.f24351n = nbVar.f24351n;
                    concurrentHashMap.put(str2, nbVar2);
                    zbVar.f26764j.add(zb.n(str2));
                    arrayList2.add(nbVar2.f24358u);
                }
                nbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ob obVar = (ob) arrayList2.get(i10);
                nb nbVar3 = obVar.f24518c;
                if (nbVar3.f24350m == 1) {
                    zbVar.f26771q.c(obVar);
                } else {
                    com.google.android.gms.internal.cast.c0 c0Var = zbVar.f26770p;
                    int i11 = nbVar3.f24340a;
                    if (i11 != 1) {
                        c0Var.getClass();
                        obVar = new lf.b(i11, obVar);
                    }
                    ((lf.a) c0Var.f6882b).execute(obVar);
                }
            }
        }
    }

    private final void f() {
        ((ob) this.f22488c).f24518c.c((Drawable) this.f22487b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f22488c;
        Runnable runnable = (Runnable) this.d;
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 >= ((int[]) this.f22487b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        ld ldVar = (ld) this.f22488c;
        kd kdVar = (kd) this.f22487b;
        kd kdVar2 = (kd) this.d;
        ArrayList arrayList = ldVar.J;
        if (kdVar != null) {
            arrayList.remove(kdVar);
        }
        arrayList.add(kdVar2);
        ldVar.K.k(kdVar2, kdVar2.f23810a);
        ld.q();
        hs.e().k(hs.D4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fg.run():void");
    }

    public fg(TLObject tLObject, u10 u10Var, TLRPC.TL_error tL_error) {
        this.f22486a = 12;
        this.d = tLObject;
        this.f22488c = u10Var;
        this.f22487b = tL_error;
    }
}
