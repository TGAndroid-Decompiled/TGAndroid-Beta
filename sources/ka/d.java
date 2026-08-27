package ka;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import h7.k6;
import h7.k7;
import id.f0;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import qc.r;

public final class d {

    public final z9.d f15113a;

    public final j9.a f15114b;

    public final k f15115c;
    public final rd.d d = rd.e.a();

    public d(rc.h hVar, z9.d dVar, ia.b bVar, j9.a aVar, k1.f fVar) {
        this.f15113a = dVar;
        this.f15114b = aVar;
        this.f15115c = new k(fVar);
    }

    public static String b(String str) {
        Pattern patternCompile = Pattern.compile("/");
        kotlin.jvm.internal.j.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Boolean a() {
        e eVar = this.f15115c.f15138b;
        if (eVar != null) {
            return eVar.f15116a;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final Object c(rc.c cVar) throws Throwable {
        a aVar;
        ?? r10;
        rd.a aVar2;
        d dVar;
        String str;
        Object objW;
        ?? r11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f15106e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15106e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (tc.c) cVar);
            }
        } else {
            aVar = new a(this, (tc.c) cVar);
        }
        Object objA = aVar.f15105c;
        sc.a aVar3 = sc.a.f47847a;
        ?? r12 = aVar.f15106e;
        pc.i iVar = pc.i.f45696a;
        try {
            if (r12 == 0) {
                k6.b(objA);
                rd.d dVar2 = this.d;
                if (!dVar2.c() && !this.f15115c.b()) {
                    return iVar;
                }
                aVar.f15103a = this;
                aVar.f15104b = dVar2;
                aVar.f15106e = 1;
                if (dVar2.d(aVar) != aVar3) {
                    aVar2 = dVar2;
                    dVar = this;
                }
                return aVar3;
            }
            if (r12 == 1) {
                aVar2 = aVar.f15104b;
                dVar = (d) aVar.f15103a;
                k6.b(objA);
            } else {
                if (r12 == 2) {
                    aVar2 = aVar.f15104b;
                    dVar = (d) aVar.f15103a;
                    k6.b(objA);
                    str = (String) objA;
                    if (str == null) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        ((rd.d) aVar2).e(null);
                        return iVar;
                    }
                    pc.d dVar3 = new pc.d("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    dVar.getClass();
                    pc.d dVar4 = new pc.d("X-Crashlytics-Device-Model", b(str2));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
                    pc.d dVar5 = new pc.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
                    Map mapB = r.b(dVar3, dVar4, dVar5, new pc.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new pc.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                    Log.d("SessionConfigFetcher", "Fetching settings from server.");
                    j9.a aVar4 = dVar.f15114b;
                    b bVar = new b(dVar, null);
                    c cVar2 = new c(2, null);
                    aVar.f15103a = aVar2;
                    aVar.f15104b = null;
                    aVar.f15106e = 3;
                    objW = f0.w((rc.h) aVar4.d, new b(aVar4, mapB, bVar, cVar2, null), aVar);
                    if (objW != aVar3) {
                        objW = iVar;
                    }
                    if (objW != aVar3) {
                        r11 = aVar2;
                    }
                    return aVar3;
                }
                if (r12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r10 = (rd.a) aVar.f15103a;
                try {
                    k6.b(objA);
                    r11 = r10;
                } catch (Throwable th) {
                    th = th;
                    ((rd.d) r10).e(null);
                    throw th;
                }
            }
            ((rd.d) r11).e(null);
            return iVar;
            if (!dVar.f15115c.b()) {
                Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                ((rd.d) aVar2).e(null);
                return iVar;
            }
            Task taskD = ((z9.c) dVar.f15113a).d();
            kotlin.jvm.internal.j.d(taskD, "firebaseInstallationsApi.id");
            aVar.f15103a = dVar;
            aVar.f15104b = aVar2;
            aVar.f15106e = 2;
            objA = k7.a(taskD, aVar);
            if (objA != aVar3) {
                str = (String) objA;
                if (str == null) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    ((rd.d) aVar2).e(null);
                    return iVar;
                }
                pc.d dVar6 = new pc.d("X-Crashlytics-Installation-ID", str);
                String str3 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                dVar.getClass();
                pc.d dVar7 = new pc.d("X-Crashlytics-Device-Model", b(str3));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                kotlin.jvm.internal.j.d(INCREMENTAL2, "INCREMENTAL");
                pc.d dVar8 = new pc.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                kotlin.jvm.internal.j.d(RELEASE2, "RELEASE");
                Map mapB2 = r.b(dVar6, dVar7, dVar8, new pc.d("X-Crashlytics-OS-Display-Version", b(RELEASE2)), new pc.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                Log.d("SessionConfigFetcher", "Fetching settings from server.");
                j9.a aVar5 = dVar.f15114b;
                b bVar2 = new b(dVar, null);
                c cVar3 = new c(2, null);
                aVar.f15103a = aVar2;
                aVar.f15104b = null;
                aVar.f15106e = 3;
                objW = f0.w((rc.h) aVar5.d, new b(aVar5, mapB2, bVar2, cVar3, null), aVar);
                if (objW != aVar3) {
                    objW = iVar;
                }
                if (objW != aVar3) {
                    r11 = aVar2;
                    ((rd.d) r11).e(null);
                    return iVar;
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            r10 = r12;
        }
    }
}
