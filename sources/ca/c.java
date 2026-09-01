package ca;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b4.e0;
import b6.m;
import c9.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d9.k;
import h7.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class c implements d {
    public static final Object f2381m = new Object();
    public final w8.g f2382a;
    public final ea.c f2383b;
    public final bf.b f2384c;
    public final j d;
    public final p f2385e;
    public final h f2386f;
    public final Object f2387g;
    public final ExecutorService h;
    public final k f2388i;
    public String f2389j;
    public final HashSet f2390k;
    public final ArrayList f2391l;

    static {
        new AtomicInteger(1);
    }

    public c(w8.g gVar, ba.b bVar, ExecutorService executorService, k kVar) {
        gVar.a();
        ea.c cVar = new ea.c(gVar.f49452a, bVar);
        bf.b bVar2 = new bf.b(gVar);
        if (u.f7349c == null) {
            u.f7349c = new u(6);
        }
        u uVar = u.f7349c;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        j jVar = j.d;
        p pVar = new p(new c9.d(gVar, 2));
        ?? obj = new Object();
        this.f2387g = new Object();
        this.f2390k = new HashSet();
        this.f2391l = new ArrayList();
        this.f2382a = gVar;
        this.f2383b = cVar;
        this.f2384c = bVar2;
        this.d = jVar;
        this.f2385e = pVar;
        this.f2386f = obj;
        this.h = executorService;
        this.f2388i = kVar;
    }

    public final void a(i iVar) {
        synchronized (this.f2387g) {
            this.f2391l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ca.c.b():void");
    }

    public final da.b c(da.b bVar) {
        int responseCode;
        boolean z4;
        ea.b f10;
        w8.g gVar = this.f2382a;
        gVar.a();
        String str = gVar.f49454c.f49464a;
        String str2 = bVar.f4387a;
        gVar.a();
        String str3 = gVar.f49454c.f49469g;
        String str4 = bVar.d;
        ea.c cVar = this.f2383b;
        ea.d dVar = cVar.f5016c;
        if (dVar.b()) {
            URL a2 = ea.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c3 = cVar.c(a2, str);
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    ea.c.h(c3);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z4) {
                    f10 = ea.c.f(c3);
                } else {
                    ea.c.b(c3, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                e0 a10 = ea.b.a();
                                a10.f1474b = 2;
                                f10 = a10.c();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new b7.a("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        e0 a11 = ea.b.a();
                        a11.f1474b = 3;
                        f10 = a11.c();
                    }
                }
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c10 = m1.j.c(f10.f5012c);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            l(null);
                            da.a a12 = bVar.a();
                            a12.f4382b = 2;
                            return a12.a();
                        }
                        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    da.a a13 = bVar.a();
                    a13.f4385f = "BAD CONFIG";
                    a13.f4382b = 5;
                    return a13.a();
                }
                String str5 = f10.f5010a;
                long j10 = f10.f5011b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f2399a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                da.a a14 = bVar.a();
                a14.d = str5;
                a14.f4386g = Long.valueOf(j10);
                a14.h = Long.valueOf(seconds);
                return a14.a();
            }
            throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f2389j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 0));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    public final void f(da.b bVar) {
        synchronized (f2381m) {
            try {
                w8.g gVar = this.f2382a;
                gVar.a();
                bf.b p10 = bf.b.p(gVar.f49452a);
                this.f2384c.T(bVar);
                if (p10 != null) {
                    p10.Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        w8.g gVar = this.f2382a;
        gVar.a();
        m.g(gVar.f49454c.f49465b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.f49454c.f49469g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.f49454c.f49464a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f49454c.f49465b;
        Pattern pattern = j.f2398c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f2398c.matcher(gVar.f49454c.f49464a).matches());
    }

    public final java.lang.String h(da.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: ca.c.h(da.b):java.lang.String");
    }

    public final da.b i(da.b bVar) {
        int responseCode;
        boolean z4;
        String str = bVar.f4387a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            da.c cVar = (da.c) this.f2385e.get();
            synchronized (cVar.f4394a) {
                try {
                    String[] strArr = da.c.f4393c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String str4 = cVar.f4395b;
                            String string = cVar.f4394a.getString("|T|" + str4 + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        ea.c cVar2 = this.f2383b;
        w8.g gVar = this.f2382a;
        gVar.a();
        String str5 = gVar.f49454c.f49464a;
        String str6 = bVar.f4387a;
        w8.g gVar2 = this.f2382a;
        gVar2.a();
        String str7 = gVar2.f49454c.f49469g;
        w8.g gVar3 = this.f2382a;
        gVar3.a();
        String str8 = gVar3.f49454c.f49465b;
        ea.d dVar = cVar2.f5016c;
        if (dVar.b()) {
            URL a2 = ea.c.a("projects/" + str7 + "/installations");
            int i11 = 0;
            ea.a aVar = cVar2;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c3 = aVar.c(a2, str5);
                try {
                    try {
                        c3.setRequestMethod("POST");
                        c3.setDoOutput(true);
                        if (str2 != null) {
                            c3.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        ea.c.g(c3, str6, str8);
                        responseCode = c3.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z4) {
                        ea.a e6 = ea.c.e(c3);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e6;
                    } else {
                        try {
                            ea.c.b(c3, str8, str5, str7);
                        } catch (IOException | AssertionError unused3) {
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11++;
                            aVar = aVar;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c3.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar = aVar;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ea.a aVar2 = new ea.a(null, null, null, null, 2);
                                c3.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            }
                        } else {
                            throw new b7.a("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c10 = m1.j.c(aVar.f5009e);
                    if (c10 != 0) {
                        if (c10 == 1) {
                            da.a a10 = bVar.a();
                            a10.f4385f = "BAD CONFIG";
                            a10.f4382b = 5;
                            return a10.a();
                        }
                        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar.f5007b;
                    String str10 = aVar.f5008c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f2399a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ea.b bVar2 = aVar.d;
                    String str11 = bVar2.f5010a;
                    long j10 = bVar2.f5011b;
                    da.a a11 = bVar.a();
                    a11.f4383c = str9;
                    a11.f4382b = 4;
                    a11.d = str11;
                    a11.f4384e = str10;
                    a11.f4386g = Long.valueOf(j10);
                    a11.h = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f2387g) {
            try {
                Iterator it = this.f2391l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(da.b bVar) {
        synchronized (this.f2387g) {
            try {
                Iterator it = this.f2391l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f2389j = str;
    }

    public final synchronized void m(da.b bVar, da.b bVar2) {
        try {
            if (this.f2390k.size() != 0 && !TextUtils.equals(bVar.f4387a, bVar2.f4387a)) {
                Iterator it = this.f2390k.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        } finally {
        }
    }
}
