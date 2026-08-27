package k1;

import androidx.lifecycle.k0;
import h7.i6;
import h7.j6;
import h7.j8;
import h7.k6;
import id.c0;
import id.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class z implements f {

    public static final LinkedHashSet f14329r = new LinkedHashSet();

    public static final Object f14330s = new Object();

    public final k0 f14331a;

    public final w9.d f14332b;

    public final k5.i f14333c;
    public final String d = ".tmp";

    public final pc.g f14334e = j6.a(new k0(this, 1));

    public final ld.m f14335f = new ld.m(b0.f14259a);
    public List h;

    public final com.google.firebase.messaging.t f14336n;

    public z(k0 k0Var, List list, w9.d dVar, c0 c0Var) {
        this.f14331a = k0Var;
        this.f14332b = dVar;
        rc.c cVar = null;
        this.f14333c = new k5.i(new n(this, cVar, 1), 23);
        this.h = qc.g.m(list);
        this.f14336n = new com.google.firebase.messaging.t(c0Var, new m(this, 0), new n(this, cVar, 0));
    }

    public static final java.lang.Object a(k1.z r8, k1.j r9, tc.c r10) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.a(k1.z, k1.j, tc.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.f14334e.a();
    }

    @Override
    public final Object c(ad.p pVar, tc.c cVar) throws Throwable {
        id.t tVarA = f0.a();
        this.f14336n.E(new j(pVar, tVarA, (a0) this.f14335f.b(), cVar.getContext()));
        Object objH = tVarA.h(cVar);
        sc.a aVar = sc.a.f47847a;
        return objH;
    }

    public final Object d(tc.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        q qVar;
        rd.a aVarA;
        kotlin.jvm.internal.q qVar2;
        z zVar;
        kotlin.jvm.internal.q qVar3;
        z zVar2;
        kotlin.jvm.internal.q qVar4;
        s sVar;
        Iterator it;
        rd.a aVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.o oVar2;
        z zVar3;
        rd.d dVar;
        rd.a aVar2;
        kotlin.jvm.internal.q qVar5;
        ad.p pVar;
        Object obj;
        int iHashCode;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f14295r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f14295r = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objH = qVar.h;
        sc.a aVar3 = sc.a.f47847a;
        int i11 = qVar.f14295r;
        if (i11 == 0) {
            k6.b(objH);
            ld.m mVar = this.f14335f;
            if (!kotlin.jvm.internal.j.a(mVar.b(), b0.f14259a) && !(mVar.b() instanceof h)) {
                throw new IllegalStateException("Check failed.");
            }
            aVarA = rd.e.a();
            qVar2 = new kotlin.jvm.internal.q();
            qVar.f14289a = this;
            qVar.f14290b = aVarA;
            qVar.f14291c = qVar2;
            qVar.d = qVar2;
            qVar.f14295r = 1;
            objH = h(qVar);
            if (objH != aVar3) {
                zVar = this;
                qVar3 = qVar2;
            }
            return aVar3;
        }
        if (i11 == 1) {
            qVar2 = (kotlin.jvm.internal.q) qVar.d;
            qVar3 = (kotlin.jvm.internal.q) qVar.f14291c;
            aVarA = (rd.a) qVar.f14290b;
            zVar = qVar.f14289a;
            k6.b(objH);
        } else {
            if (i11 == 2) {
                it = qVar.f14293f;
                sVar = qVar.f14292e;
                oVar = (kotlin.jvm.internal.o) qVar.d;
                qVar4 = (kotlin.jvm.internal.q) qVar.f14291c;
                aVar = (rd.a) qVar.f14290b;
                zVar2 = qVar.f14289a;
                k6.b(objH);
                while (it.hasNext()) {
                    pVar = (ad.p) it.next();
                    qVar.f14289a = zVar2;
                    qVar.f14290b = aVar;
                    qVar.f14291c = qVar4;
                    qVar.d = oVar;
                    qVar.f14292e = sVar;
                    qVar.f14293f = it;
                    qVar.f14295r = 2;
                    if (pVar.invoke(sVar, qVar) == aVar3) {
                        return aVar3;
                    }
                }
                oVar2 = oVar;
                qVar3 = qVar4;
                aVarA = aVar;
                zVar3 = zVar2;
                zVar3.h = null;
                qVar.f14289a = zVar3;
                qVar.f14290b = qVar3;
                qVar.f14291c = oVar2;
                qVar.d = aVarA;
                qVar.f14292e = null;
                qVar.f14293f = null;
                qVar.f14295r = 3;
                dVar = (rd.d) aVarA;
                if (dVar.d(qVar) != aVar3) {
                    aVar2 = dVar;
                    qVar5 = qVar3;
                }
                return aVar3;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (rd.a) qVar.d;
            oVar2 = (kotlin.jvm.internal.o) qVar.f14291c;
            qVar5 = (kotlin.jvm.internal.q) qVar.f14290b;
            zVar3 = qVar.f14289a;
            k6.b(objH);
        }
        try {
            oVar2.f15251a = true;
            ((rd.d) aVar2).e(null);
            ld.m mVar2 = zVar3.f14335f;
            obj = qVar5.f15253a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mVar2.d(new b(obj, iHashCode));
            return pc.i.f45696a;
        } catch (Throwable th) {
            ((rd.d) aVar2).e(null);
            throw th;
        }
        qVar2.f15253a = objH;
        kotlin.jvm.internal.o oVar3 = new kotlin.jvm.internal.o();
        s sVar2 = new s(aVarA, oVar3, qVar3, zVar);
        List list = zVar.h;
        if (list == null) {
            oVar2 = oVar3;
            zVar3 = zVar;
        } else {
            zVar2 = zVar;
            qVar4 = qVar3;
            sVar = sVar2;
            it = list.iterator();
            aVar = aVarA;
            oVar = oVar3;
            while (it.hasNext()) {
                pVar = (ad.p) it.next();
                qVar.f14289a = zVar2;
                qVar.f14290b = aVar;
                qVar.f14291c = qVar4;
                qVar.d = oVar;
                qVar.f14292e = sVar;
                qVar.f14293f = it;
                qVar.f14295r = 2;
                if (pVar.invoke(sVar, qVar) == aVar3) {
                    return aVar3;
                }
            }
            oVar2 = oVar;
            qVar3 = qVar4;
            aVarA = aVar;
            zVar3 = zVar2;
        }
        zVar3.h = null;
        qVar.f14289a = zVar3;
        qVar.f14290b = qVar3;
        qVar.f14291c = oVar2;
        qVar.d = aVarA;
        qVar.f14292e = null;
        qVar.f14293f = null;
        qVar.f14295r = 3;
        dVar = (rd.d) aVarA;
        if (dVar.d(qVar) != aVar3) {
            aVar2 = dVar;
            qVar5 = qVar3;
            oVar2.f15251a = true;
            ((rd.d) aVar2).e(null);
            ld.m mVar3 = zVar3.f14335f;
            obj = qVar5.f15253a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mVar3.d(new b(obj, iHashCode));
            return pc.i.f45696a;
        }
        return aVar3;
    }

    public final Object e(tc.c cVar) throws Throwable {
        t tVar;
        z zVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.d = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f14306b;
        sc.a aVar = sc.a.f47847a;
        int i11 = tVar.d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = tVar.f14305a;
            try {
                k6.b(obj);
                return pc.i.f45696a;
            } catch (Throwable th) {
                th = th;
                zVar.f14335f.d(new h(th));
                throw th;
            }
        }
        k6.b(obj);
        try {
            tVar.f14305a = this;
            tVar.d = 1;
            if (d(tVar) == aVar) {
                return aVar;
            }
            return pc.i.f45696a;
        } catch (Throwable th2) {
            th = th2;
            zVar = this;
            zVar.f14335f.d(new h(th));
            throw th;
        }
    }

    public final Object f(tc.c cVar) {
        u uVar;
        z zVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.d = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f14309b;
        sc.a aVar = sc.a.f47847a;
        int i11 = uVar.d;
        if (i11 == 0) {
            k6.b(obj);
            try {
                uVar.f14308a = this;
                uVar.d = 1;
                if (d(uVar) == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                th = th;
                zVar = this;
                zVar.f14335f.d(new h(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = uVar.f14308a;
            try {
                k6.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zVar.f14335f.d(new h(th));
            }
        }
        return pc.i.f45696a;
    }

    public final Object g(tc.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ?? vVar;
        FileInputStream fileInputStream;
        Throwable th;
        if (cVar instanceof v) {
            v vVar2 = (v) cVar;
            int i10 = vVar2.f14314e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar2.f14314e = i10 - Integer.MIN_VALUE;
                vVar = vVar2;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f14313c;
        sc.a aVar = sc.a.f47847a;
        int i11 = vVar.f14314e;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = vVar.f14312b;
                vVar = vVar.f14311a;
                try {
                    k6.b(obj);
                    j8.a(fileInputStream, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        j8.a(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            k6.b(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(b());
                try {
                    n1.h hVar = n1.h.f18091a;
                    vVar.f14311a = this;
                    vVar.f14312b = fileInputStream2;
                    vVar.f14314e = 1;
                    n1.b bVarA = hVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    j8.a(fileInputStream, null);
                    return obj;
                } catch (Throwable th4) {
                    fileInputStream = fileInputStream2;
                    th = th4;
                    vVar = this;
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                vVar = this;
                if (vVar.b().exists()) {
                    throw e;
                }
                return new n1.b(z10);
            }
        } catch (FileNotFoundException e10) {
            e = e10;
        }
    }

    @Override
    public final ld.b getData() {
        return this.f14333c;
    }

    public final Object h(tc.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        w wVar;
        z zVar;
        a aVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i10 = wVar.f14318e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f14318e = i10 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.f14317c;
        sc.a aVar2 = sc.a.f47847a;
        int i11 = wVar.f14318e;
        if (i11 == 0) {
            k6.b(obj);
            try {
                wVar.f14315a = this;
                wVar.f14318e = 1;
                Object objG = g(wVar);
                if (objG == aVar2) {
                    return aVar2;
                }
                return objG;
            } catch (a e9) {
                e = e9;
                zVar = this;
                w9.d dVar = zVar.f14332b;
                wVar.f14315a = zVar;
                wVar.f14316b = e;
                wVar.f14318e = 2;
                throw e;
            }
        }
        if (i11 == 1) {
            zVar = (z) wVar.f14315a;
            try {
                k6.b(obj);
                return obj;
            } catch (a e10) {
                e = e10;
                w9.d dVar2 = zVar.f14332b;
                wVar.f14315a = zVar;
                wVar.f14316b = e;
                wVar.f14318e = 2;
                throw e;
            }
        }
        if (i11 == 2) {
            a aVar3 = (a) wVar.f14316b;
            z zVar2 = (z) wVar.f14315a;
            k6.b(obj);
            try {
                wVar.f14315a = aVar3;
                wVar.f14316b = obj;
                wVar.f14318e = 3;
                if (zVar2.j(obj, wVar) == aVar2) {
                    return aVar2;
                }
                return obj;
            } catch (IOException e11) {
                e = e11;
                aVar = aVar3;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = wVar.f14316b;
            aVar = (a) wVar.f14315a;
            try {
                k6.b(obj);
                return obj2;
            } catch (IOException e12) {
                e = e12;
            }
        }
        i6.a(aVar, e);
        throw aVar;
    }

    public final Object i(ad.p pVar, rc.h hVar, tc.c cVar) throws Throwable {
        x xVar;
        b bVar;
        Object obj;
        z zVar;
        Object obj2;
        z zVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f14323f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f14323f = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj3 = xVar.d;
        sc.a aVar = sc.a.f47847a;
        int i11 = xVar.f14323f;
        rc.c cVar2 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = xVar.f14321c;
                bVar = (b) xVar.f14320b;
                zVar = xVar.f14319a;
                k6.b(obj3);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = xVar.f14320b;
                zVar2 = xVar.f14319a;
                k6.b(obj3);
            }
            zVar2.f14335f.d(new b(obj2, obj2 != null ? obj2.hashCode() : 0));
            return obj2;
        }
        k6.b(obj3);
        b bVar2 = (b) this.f14335f.b();
        Object obj4 = bVar2.f14257a;
        if ((obj4 != null ? obj4.hashCode() : 0) != bVar2.f14258b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj5 = bVar2.f14257a;
        ia.m mVar = new ia.m(pVar, obj5, cVar2, 5);
        xVar.f14319a = this;
        xVar.f14320b = bVar2;
        xVar.f14321c = obj5;
        xVar.f14323f = 1;
        Object objW = f0.w(hVar, mVar, xVar);
        if (objW != aVar) {
            bVar = bVar2;
            obj3 = objW;
            obj = obj5;
            zVar = this;
        }
        return aVar;
        Object obj6 = bVar.f14257a;
        if ((obj6 != null ? obj6.hashCode() : 0) != bVar.f14258b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (kotlin.jvm.internal.j.a(obj, obj3)) {
            return obj;
        }
        xVar.f14319a = zVar;
        xVar.f14320b = obj3;
        xVar.f14321c = null;
        xVar.f14323f = 2;
        if (zVar.j(obj3, xVar) != aVar) {
            obj2 = obj3;
            zVar2 = zVar;
            zVar2.f14335f.d(new b(obj2, obj2 != null ? obj2.hashCode() : 0));
            return obj2;
        }
        return aVar;
    }

    public final Object j(Object obj, tc.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        y yVar;
        FileOutputStream fileOutputStream;
        z zVar;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.h = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj2 = yVar.f14327e;
        sc.a aVar = sc.a.f47847a;
        ?? file = yVar.h;
        pc.i iVar = pc.i.f45696a;
        try {
            if (file == 0) {
                k6.b(obj2);
                File fileB = b();
                File parentFile = fileB.getCanonicalFile().getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        throw new IOException(kotlin.jvm.internal.j.g(fileB, "Unable to create parent directories of "));
                    }
                }
                file = new File(kotlin.jvm.internal.j.g(this.d, b().getAbsolutePath()));
                FileOutputStream fileOutputStream3 = new FileOutputStream((File) file);
                try {
                    n1.h hVar = n1.h.f18091a;
                    l lVar = new l(fileOutputStream3);
                    yVar.f14324a = this;
                    yVar.f14325b = file;
                    yVar.f14326c = fileOutputStream3;
                    yVar.d = fileOutputStream3;
                    yVar.h = 1;
                    hVar.b(obj, lVar);
                    if (iVar == aVar) {
                        return aVar;
                    }
                    zVar = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                    file = file;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } else {
                if (file != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream2 = yVar.d;
                fileOutputStream = yVar.f14326c;
                file = yVar.f14325b;
                zVar = yVar.f14324a;
                try {
                    k6.b(obj2);
                    file = file;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        j8.a(fileOutputStream, th);
                        throw th3;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            j8.a(fileOutputStream, null);
            if (file.renameTo(zVar.b())) {
                return iVar;
            }
            throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e9) {
            if (file.exists()) {
                file.delete();
            }
            throw e9;
        }
    }
}
