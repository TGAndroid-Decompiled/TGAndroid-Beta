package c3;

import ag.h0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.firebase.messaging.m;
import d3.h;
import h9.b0;
import h9.k0;
import j$.util.Objects;
import j4.x0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k5.i;
import m.t3;
import m1.j;
import org.json.JSONObject;
import v2.k;
import v2.t;
import v2.u;
import v2.w;
import w2.l;
import w2.n;

public final class g {

    public Object f2433a;

    public Object f2434b;

    public Object f2435c;
    public Object d;

    public Object f2436e;

    public Object f2437f;

    public Object f2438g;
    public Object h;

    public Object f2439i;

    public static void f(String str, JSONObject jSONObject) {
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str);
        sbO.append(jSONObject.toString());
        String string = sbO.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public b0 a() {
        String strL = ((Integer) this.f2433a) == null ? " pid" : "";
        if (((String) this.f2434b) == null) {
            strL = strL.concat(" processName");
        }
        if (((Integer) this.f2435c) == null) {
            strL = s3.c.l(strL, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            strL = s3.c.l(strL, " importance");
        }
        if (((Long) this.f2436e) == null) {
            strL = s3.c.l(strL, " pss");
        }
        if (((Long) this.f2437f) == null) {
            strL = s3.c.l(strL, " rss");
        }
        if (((Long) this.f2438g) == null) {
            strL = s3.c.l(strL, " timestamp");
        }
        if (strL.isEmpty()) {
            return new b0(((Integer) this.f2433a).intValue(), (String) this.f2434b, ((Integer) this.f2435c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f2436e).longValue(), ((Long) this.f2437f).longValue(), ((Long) this.f2438g).longValue(), (String) this.h, (List) this.f2439i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public k0 b() {
        String strL = ((Integer) this.f2433a) == null ? " arch" : "";
        if (((String) this.f2434b) == null) {
            strL = strL.concat(" model");
        }
        if (((Integer) this.f2435c) == null) {
            strL = s3.c.l(strL, " cores");
        }
        if (((Long) this.d) == null) {
            strL = s3.c.l(strL, " ram");
        }
        if (((Long) this.f2436e) == null) {
            strL = s3.c.l(strL, " diskSpace");
        }
        if (((Boolean) this.f2437f) == null) {
            strL = s3.c.l(strL, " simulator");
        }
        if (((Integer) this.f2438g) == null) {
            strL = s3.c.l(strL, " state");
        }
        if (((String) this.h) == null) {
            strL = s3.c.l(strL, " manufacturer");
        }
        if (((String) this.f2439i) == null) {
            strL = s3.c.l(strL, " modelClass");
        }
        if (strL.isEmpty()) {
            return new k0(((Integer) this.f2433a).intValue(), (String) this.f2434b, ((Integer) this.f2435c).intValue(), ((Long) this.d).longValue(), ((Long) this.f2436e).longValue(), ((Boolean) this.f2437f).booleanValue(), ((Integer) this.f2438g).intValue(), (String) this.h, (String) this.f2439i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public m9.a c(int i10) {
        m9.a aVar = null;
        try {
            if (!j.a(2, i10)) {
                JSONObject jSONObjectF = ((i) this.f2436e).F();
                if (jSONObjectF != null) {
                    m9.a aVarH = ((ga.c) this.f2435c).h(jSONObjectF);
                    f("Loaded cached settings: ", jSONObjectF);
                    ((ab.a) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j.a(3, i10) || aVarH.f17883c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarH;
                        } catch (Exception e9) {
                            e = e9;
                            aVar = aVarH;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public m9.a d() {
        return (m9.a) ((AtomicReference) this.h).get();
    }

    public void e(w2.i iVar, int i10) {
        byte[] bArr;
        long j10;
        x2.a aVar;
        String str;
        x2.a aVar2;
        int i11;
        x0 x0VarC;
        Integer numValueOf;
        String str2;
        t3 t3Var;
        final g gVar = this;
        final w2.i iVar2 = iVar;
        byte[] bArr2 = iVar2.f48958b;
        e3.c cVar = (e3.c) gVar.f2437f;
        x2.e eVarA = ((x2.d) gVar.f2434b).a(iVar2.f48957a);
        long jMax = 0;
        while (true) {
            final int i12 = 0;
            h hVar = (h) cVar;
            if (!((Boolean) hVar.f(new e3.b(gVar) {

                public final g f2428b;

                {
                    this.f2428b = gVar;
                }

                @Override
                public final Object i() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            h hVar2 = (h) ((d3.d) this.f2428b.f2435c);
                            SQLiteDatabase sQLiteDatabaseA = hVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = h.b(sQLiteDatabaseA, iVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            h hVar3 = (h) ((d3.d) this.f2428b.f2435c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new h0(14, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.f(new f(gVar, iVar2, jMax, 0));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) hVar.f(new e3.b(gVar) {

                public final g f2428b;

                {
                    this.f2428b = gVar;
                }

                @Override
                public final Object i() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            w2.i iVar3 = iVar2;
                            h hVar2 = (h) ((d3.d) this.f2428b.f2435c);
                            SQLiteDatabase sQLiteDatabaseA = hVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = h.b(sQLiteDatabaseA, iVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            h hVar3 = (h) ((d3.d) this.f2428b.f2435c);
                            hVar3.getClass();
                            return (Iterable) hVar3.c(new h0(14, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i14 = 3;
            if (eVarA == null) {
                a.a.a(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new x2.a(3, -1L);
                bArr = bArr2;
                j10 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d3.b) it.next()).f4736c);
                }
                if (bArr2 != null) {
                    d3.c cVar2 = (d3.c) gVar.f2439i;
                    Objects.requireNonNull(cVar2);
                    z2.a aVar3 = (z2.a) hVar.f(new a1.c(cVar2, i14));
                    m mVar = new m();
                    mVar.f4606f = new HashMap();
                    mVar.d = Long.valueOf(((f3.a) gVar.f2438g).E());
                    mVar.f4605e = Long.valueOf(((f3.a) gVar.h).E());
                    mVar.f4602a = "GDT_CLIENT_METRICS";
                    t2.c cVar3 = new t2.c("proto");
                    aVar3.getClass();
                    u2.b bVar = n.f48968a;
                    bVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar.e(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.f4604c = new l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((u2.c) eVarA).a(mVar.i()));
                }
                u2.c cVar4 = (u2.c) eVarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    w2.h hVar2 = (w2.h) obj;
                    String str3 = hVar2.f48952a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    w2.h hVar3 = (w2.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f48737a;
                    long jE = cVar4.f48268f.E();
                    long jE2 = cVar4.f48267e.E();
                    v2.j jVar = new v2.j(new v2.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        str2 = null;
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        numValueOf = null;
                        str2 = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (w2.h hVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l lVar = hVar4.f48954c;
                        byte[] bArr3 = bArr2;
                        t2.c cVar5 = lVar.f48965a;
                        byte[] bArr4 = lVar.f48966b;
                        long j11 = jMax;
                        if (cVar5.equals(new t2.c("proto"))) {
                            t3Var = new t3();
                            t3Var.d = bArr4;
                        } else {
                            if (cVar5.equals(new t2.c("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                t3 t3Var2 = new t3();
                                t3Var2.f17476e = str4;
                                t3Var = t3Var2;
                            } else {
                                String strC = a.a.c("CctTransportBackend");
                                if (Log.isLoggable(strC, 5)) {
                                    Log.w(strC, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            jMax = j11;
                        }
                        t3Var.f17473a = Long.valueOf(hVar4.d);
                        t3Var.f17475c = Long.valueOf(hVar4.f48955e);
                        String str5 = (String) hVar4.f48956f.get("tz-offset");
                        t3Var.f17477f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        t3Var.h = new v2.n((u) u.f48735a.get(hVar4.b("net-type")), (t) t.f48733a.get(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f48953b;
                        if (num != null) {
                            t3Var.f17474b = num;
                        }
                        String strL = ((Long) t3Var.f17473a) == null ? " eventTimeMs" : "";
                        if (((Long) t3Var.f17475c) == null) {
                            strL = strL.concat(" eventUptimeMs");
                        }
                        if (((Long) t3Var.f17477f) == null) {
                            strL = s3.c.l(strL, " timezoneOffsetSeconds");
                        }
                        if (!strL.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strL));
                        }
                        arrayList4.add(new k(((Long) t3Var.f17473a).longValue(), (Integer) t3Var.f17474b, ((Long) t3Var.f17475c).longValue(), (byte[]) t3Var.d, (String) t3Var.f17476e, ((Long) t3Var.f17477f).longValue(), (v2.n) t3Var.h));
                        it2 = it3;
                        bArr2 = bArr3;
                        jMax = j11;
                    }
                    arrayList3.add(new v2.l(jE, jE2, jVar, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = jMax;
                v2.i iVar3 = new v2.i(arrayList3);
                URL urlB = cVar4.d;
                if (bArr != null) {
                    try {
                        u2.a aVarA = u2.a.a(bArr);
                        str = aVarA.f48260b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f48259a;
                        if (str6 != null) {
                            urlB = u2.c.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new x2.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    u2.b bVar2 = new u2.b(urlB, iVar3, str, 0);
                    t0.c cVar6 = new t0.c(cVar4, 1);
                    int i16 = 5;
                    do {
                        x0VarC = cVar6.c(bVar2);
                        URL url = (URL) x0VarC.f12712c;
                        if (url != null) {
                            a.a.a(url, "CctTransportBackend", "Following redirect to: %s");
                            bVar2 = new u2.b(url, (v2.i) bVar2.d, (String) bVar2.f48262b, 0);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i16--;
                        }
                    } while (i16 >= 1);
                    int i17 = x0VarC.f12711b;
                    if (i17 == 200) {
                        aVar2 = new x2.a(1, x0VarC.f12710a);
                    } else {
                        if (i17 >= 500 || i17 == 404) {
                            aVar = new x2.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar = new x2.a(4, -1L);
                            } catch (IOException e9) {
                                e = e9;
                                a.a.b("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new x2.a(2, -1L);
                            }
                        } else {
                            aVar = new x2.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i11 = 2;
            int i18 = aVar2.f49330a;
            if (i18 == i11) {
                hVar.f(new a9.d(this, iterable, iVar, j10, 2));
                ((a5.n) this.d).y(iVar, i10 + 1, true);
                return;
            }
            gVar = this;
            iVar2 = iVar;
            long j12 = j10;
            hVar.f(new h0(4, gVar, iterable));
            if (i18 == 1) {
                jMax = Math.max(j12, aVar2.f49331b);
                if (bArr != null) {
                    hVar.f(new a1.c(gVar, 5));
                }
            } else {
                if (i18 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        String str7 = ((d3.b) it4.next()).f4736c.f48952a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    hVar.f(new h0(5, gVar, map2));
                }
                jMax = j12;
            }
            bArr2 = bArr;
        }
    }
}
