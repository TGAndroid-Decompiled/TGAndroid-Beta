package ia;

import android.content.Context;
import android.util.Log;
import h7.k6;
import java.util.List;
import java.util.Map;

public final class j0 extends tc.i implements ad.p {

    public l0 f11030a;

    public g0 f11031b;

    public t8.h f11032c;
    public e0 d;

    public ka.h f11033e;

    public r f11034f;
    public List h;

    public Map f11035n;

    public int f11036r;

    public final l0 f11037s;
    public final e0 v;

    public j0(l0 l0Var, e0 e0Var, rc.c cVar) {
        super(2, cVar);
        this.f11037s = l0Var;
        this.v = e0Var;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        return new j0(this.f11037s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objB;
        ka.h hVar;
        List listA;
        e0 e0Var;
        Object objB2;
        g0 g0Var;
        r rVar;
        l0 l0Var;
        Map subscribers;
        Object objA;
        r currentProcessDetails;
        ka.h sessionsSettings;
        e0 sessionDetails;
        t8.h firebaseApp;
        List appProcessDetails;
        f9.k kVar;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        f9.k kVar2;
        l0 l0Var2 = this.f11037s;
        t8.h hVar2 = l0Var2.f11047a;
        sc.a aVar = sc.a.f47847a;
        int i10 = this.f11036r;
        if (i10 == 0) {
            k6.b(obj);
            this.f11036r = 1;
            objB = l0.b(l0Var2, this);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            k6.b(obj);
            objB = obj;
        } else {
            if (i10 == 2) {
                List list = this.h;
                rVar = this.f11034f;
                ka.h hVar3 = this.f11033e;
                e0 e0Var2 = this.d;
                t8.h hVar4 = this.f11032c;
                g0 g0Var2 = this.f11031b;
                l0Var = this.f11030a;
                k6.b(obj);
                listA = list;
                hVar2 = hVar4;
                g0Var = g0Var2;
                e0Var = e0Var2;
                hVar = hVar3;
                objB2 = obj;
                subscribers = (Map) objB2;
                this.f11030a = l0Var;
                this.f11031b = g0Var;
                this.f11032c = hVar2;
                this.d = e0Var;
                this.f11033e = hVar;
                this.f11034f = rVar;
                this.h = listA;
                this.f11035n = subscribers;
                this.f11036r = 3;
                objA = l0.a(l0Var2, this);
                if (objA != aVar) {
                    currentProcessDetails = rVar;
                    sessionsSettings = hVar;
                    sessionDetails = e0Var;
                    firebaseApp = hVar2;
                    appProcessDetails = listA;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = this.f11035n;
            appProcessDetails = this.h;
            currentProcessDetails = this.f11034f;
            sessionsSettings = this.f11033e;
            sessionDetails = this.d;
            t8.h hVar5 = this.f11032c;
            g0 g0Var3 = this.f11031b;
            l0 l0Var3 = this.f11030a;
            k6.b(obj);
            l0Var = l0Var3;
            g0Var = g0Var3;
            firebaseApp = hVar5;
            subscribers = map;
            objA = obj;
        }
        kotlin.jvm.internal.j.d(objA, "getFirebaseInstallationId()");
        String str = (String) objA;
        g0Var.getClass();
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.j.e(appProcessDetails, "appProcessDetails");
        kotlin.jvm.internal.j.e(subscribers, "subscribers");
        String str2 = sessionDetails.f11000a;
        String str3 = sessionDetails.f11001b;
        int i11 = sessionDetails.f11002c;
        long j10 = sessionDetails.d;
        kVar = (f9.k) subscribers.get(ja.d.f12877b);
        iVar = i.COLLECTION_DISABLED;
        iVar2 = i.COLLECTION_ENABLED;
        iVar3 = i.COLLECTION_SDK_NOT_INSTALLED;
        if (kVar == null) {
            iVar4 = iVar3;
        } else if (kVar.f5943a.a()) {
            iVar4 = iVar2;
        } else {
            iVar4 = iVar;
        }
        kVar2 = (f9.k) subscribers.get(ja.d.f12876a);
        if (kVar2 == null) {
            iVar = iVar3;
        } else if (kVar2.f5943a.a()) {
            iVar = iVar2;
        }
        f0 f0Var = new f0(new o0(str2, str3, i11, j10, new j(iVar4, iVar, sessionsSettings.a()), str), g0.a(firebaseApp));
        int i12 = l0.f11046g;
        l0Var.getClass();
        try {
            l0Var.d.R(f0Var);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
        } catch (RuntimeException e9) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e9);
        }
        return pc.i.f45696a;
        if (((Boolean) objB).booleanValue()) {
            g0 g0Var4 = g0.f11012a;
            hVar = l0Var2.f11049c;
            hVar2.a();
            Context context = hVar2.f48119a;
            kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
            r rVarB = s.b(context);
            hVar2.a();
            Context context2 = hVar2.f48119a;
            kotlin.jvm.internal.j.d(context2, "firebaseApp.applicationContext");
            listA = s.a(context2);
            ja.c cVar = ja.c.f12874a;
            this.f11030a = l0Var2;
            this.f11031b = g0Var4;
            this.f11032c = hVar2;
            e0Var = this.v;
            this.d = e0Var;
            this.f11033e = hVar;
            this.f11034f = rVarB;
            this.h = listA;
            this.f11036r = 2;
            objB2 = cVar.b(this);
            if (objB2 != aVar) {
                g0Var = g0Var4;
                rVar = rVarB;
                l0Var = l0Var2;
                subscribers = (Map) objB2;
                this.f11030a = l0Var;
                this.f11031b = g0Var;
                this.f11032c = hVar2;
                this.d = e0Var;
                this.f11033e = hVar;
                this.f11034f = rVar;
                this.h = listA;
                this.f11035n = subscribers;
                this.f11036r = 3;
                objA = l0.a(l0Var2, this);
                if (objA != aVar) {
                    currentProcessDetails = rVar;
                    sessionsSettings = hVar;
                    sessionDetails = e0Var;
                    firebaseApp = hVar2;
                    appProcessDetails = listA;
                    kotlin.jvm.internal.j.d(objA, "getFirebaseInstallationId()");
                    String str4 = (String) objA;
                    g0Var.getClass();
                    kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.j.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.j.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.j.e(subscribers, "subscribers");
                    String str5 = sessionDetails.f11000a;
                    String str6 = sessionDetails.f11001b;
                    int i13 = sessionDetails.f11002c;
                    long j11 = sessionDetails.d;
                    kVar = (f9.k) subscribers.get(ja.d.f12877b);
                    iVar = i.COLLECTION_DISABLED;
                    iVar2 = i.COLLECTION_ENABLED;
                    iVar3 = i.COLLECTION_SDK_NOT_INSTALLED;
                    if (kVar == null) {
                        iVar4 = iVar3;
                    } else if (kVar.f5943a.a()) {
                        iVar4 = iVar2;
                    } else {
                        iVar4 = iVar;
                    }
                    kVar2 = (f9.k) subscribers.get(ja.d.f12876a);
                    if (kVar2 == null) {
                        iVar = iVar3;
                    } else if (kVar2.f5943a.a()) {
                        iVar = iVar2;
                    }
                    f0 f0Var2 = new f0(new o0(str5, str6, i13, j11, new j(iVar4, iVar, sessionsSettings.a()), str4), g0.a(firebaseApp));
                    int i14 = l0.f11046g;
                    l0Var.getClass();
                    l0Var.d.R(f0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str5));
                }
            }
            return aVar;
        }
        return pc.i.f45696a;
    }
}
