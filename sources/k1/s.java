package k1;

import h7.k6;

public final class s {

    public final rd.a f14302a;

    public final kotlin.jvm.internal.o f14303b;

    public final kotlin.jvm.internal.q f14304c;
    public final z d;

    public s(rd.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, z zVar) {
        this.f14302a = aVar;
        this.f14303b = oVar;
        this.f14304c = qVar;
        this.d = zVar;
    }

    public final Object a(e eVar, tc.c cVar) throws Throwable {
        r rVar;
        z zVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        rd.a aVar;
        ad.p pVar;
        rd.a aVar2;
        rd.a aVar3;
        z zVar2;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        rd.a aVar4;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f14301n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f14301n = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj2 = rVar.f14300f;
        sc.a aVar5 = sc.a.f47847a;
        int i11 = rVar.f14301n;
        try {
            if (i11 == 0) {
                k6.b(obj2);
                rVar.f14296a = eVar;
                rd.a aVar6 = this.f14302a;
                rVar.f14297b = aVar6;
                kotlin.jvm.internal.o oVar2 = this.f14303b;
                rVar.f14298c = oVar2;
                kotlin.jvm.internal.q qVar3 = this.f14304c;
                rVar.d = qVar3;
                zVar = this.d;
                rVar.f14299e = zVar;
                rVar.f14301n = 1;
                rd.d dVar = (rd.d) aVar6;
                if (dVar.d(rVar) != aVar5) {
                    oVar = oVar2;
                    qVar = qVar3;
                    pVar = eVar;
                    aVar = dVar;
                }
                return aVar5;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = rVar.f14298c;
                    qVar2 = (kotlin.jvm.internal.q) rVar.f14297b;
                    aVar2 = (rd.a) rVar.f14296a;
                    try {
                        k6.b(obj2);
                        aVar4 = aVar2;
                        qVar2.f15253a = obj;
                        qVar = qVar2;
                        aVar2 = aVar4;
                        Object obj3 = qVar.f15253a;
                        ((rd.d) aVar2).e(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((rd.d) aVar2).e(null);
                        throw th;
                    }
                }
                zVar2 = (z) rVar.f14298c;
                qVar = (kotlin.jvm.internal.q) rVar.f14297b;
                aVar3 = (rd.a) rVar.f14296a;
                try {
                    k6.b(obj2);
                    aVar3 = aVar3;
                    if (!kotlin.jvm.internal.j.a(obj2, qVar.f15253a)) {
                        rVar.f14296a = aVar3;
                        rVar.f14297b = qVar;
                        rVar.f14298c = obj2;
                        rVar.f14301n = 3;
                        if (zVar2.j(obj2, rVar) != aVar5) {
                            obj = obj2;
                            qVar2 = qVar;
                            aVar4 = aVar3;
                            qVar2.f15253a = obj;
                            qVar = qVar2;
                            aVar2 = aVar4;
                        }
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    Object obj4 = qVar.f15253a;
                    ((rd.d) aVar2).e(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    ((rd.d) aVar2).e(null);
                    throw th;
                }
            }
            z zVar3 = rVar.f14299e;
            qVar = rVar.d;
            oVar = (kotlin.jvm.internal.o) rVar.f14298c;
            rd.a aVar7 = (rd.a) rVar.f14297b;
            ad.p pVar2 = (ad.p) rVar.f14296a;
            k6.b(obj2);
            zVar = zVar3;
            pVar = pVar2;
            aVar = aVar7;
            if (oVar.f15251a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = qVar.f15253a;
            rVar.f14296a = aVar;
            rVar.f14297b = qVar;
            rVar.f14298c = zVar;
            rVar.d = null;
            rVar.f14299e = null;
            rVar.f14301n = 2;
            Object objInvoke = pVar.invoke(obj5, rVar);
            if (objInvoke != aVar5) {
                aVar3 = aVar;
                obj2 = objInvoke;
                zVar2 = zVar;
                if (!kotlin.jvm.internal.j.a(obj2, qVar.f15253a)) {
                    rVar.f14296a = aVar3;
                    rVar.f14297b = qVar;
                    rVar.f14298c = obj2;
                    rVar.f14301n = 3;
                    if (zVar2.j(obj2, rVar) != aVar5) {
                        obj = obj2;
                        qVar2 = qVar;
                        aVar4 = aVar3;
                        qVar2.f15253a = obj;
                        qVar = qVar2;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = qVar.f15253a;
                ((rd.d) aVar2).e(null);
                return obj6;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((rd.d) aVar2).e(null);
            throw th;
        }
    }
}
