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
    public static final Object f2191m = new Object();
    public final w8.g f2192a;
    public final ea.c f2193b;
    public final bf.b f2194c;
    public final j d;
    public final p e;
    public final h f2195f;
    public final Object f2196g;
    public final ExecutorService h;
    public final k f2197i;
    public String f2198j;
    public final HashSet f2199k;
    public final ArrayList f2200l;

    static {
        new AtomicInteger(1);
    }

    public c(w8.g gVar, ba.b bVar, ExecutorService executorService, k kVar) {
        gVar.a();
        ea.c cVar = new ea.c(gVar.f46478a, bVar);
        bf.b bVar2 = new bf.b(gVar);
        if (u.f7036c == null) {
            u.f7036c = new u(6);
        }
        u uVar = u.f7036c;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        j jVar = j.d;
        p pVar = new p(new c9.d(gVar, 2));
        ?? obj = new Object();
        this.f2196g = new Object();
        this.f2199k = new HashSet();
        this.f2200l = new ArrayList();
        this.f2192a = gVar;
        this.f2193b = cVar;
        this.f2194c = bVar2;
        this.d = jVar;
        this.e = pVar;
        this.f2195f = obj;
        this.h = executorService;
        this.f2197i = kVar;
    }

    public final void a(i iVar) {
        synchronized (this.f2196g) {
            this.f2200l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ca.c.b():void");
    }

    public final da.b c(da.b bVar) {
        int responseCode;
        boolean z4;
        ea.b f10;
        w8.g gVar = this.f2192a;
        gVar.a();
        String str = gVar.f46480c.f46488a;
        String str2 = bVar.f4306a;
        gVar.a();
        String str3 = gVar.f46480c.f46492g;
        String str4 = bVar.d;
        ea.c cVar = this.f2193b;
        ea.d dVar = cVar.f5175c;
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
                                a10.f1367b = 2;
                                f10 = a10.b();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new b7.a("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        e0 a11 = ea.b.a();
                        a11.f1367b = 3;
                        f10 = a11.b();
                    }
                }
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
                int b10 = m1.j.b(f10.f5172c);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            l(null);
                            da.a a12 = bVar.a();
                            a12.f4302b = 2;
                            return a12.a();
                        }
                        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    da.a a13 = bVar.a();
                    a13.f4304f = "BAD CONFIG";
                    a13.f4302b = 5;
                    return a13.a();
                }
                String str5 = f10.f5170a;
                long j10 = f10.f5171b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f2208a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                da.a a14 = bVar.a();
                a14.d = str5;
                a14.f4305g = Long.valueOf(j10);
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
            str = this.f2198j;
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
        synchronized (f2191m) {
            try {
                w8.g gVar = this.f2192a;
                gVar.a();
                bf.b r10 = bf.b.r(gVar.f46478a);
                this.f2194c.T(bVar);
                if (r10 != null) {
                    r10.Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        w8.g gVar = this.f2192a;
        gVar.a();
        m.g(gVar.f46480c.f46489b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.f46480c.f46492g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        m.g(gVar.f46480c.f46488a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f46480c.f46489b;
        Pattern pattern = j.f2207c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f2207c.matcher(gVar.f46480c.f46488a).matches());
    }

    public final java.lang.String h(da.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: ca.c.h(da.b):java.lang.String");
    }

    public final da.b i(da.b bVar) {
        int responseCode;
        boolean z4;
        String str = bVar.f4306a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            da.c cVar = (da.c) this.e.get();
            synchronized (cVar.f4312a) {
                try {
                    String[] strArr = da.c.f4311c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String str4 = cVar.f4313b;
                            String string = cVar.f4312a.getString("|T|" + str4 + "|" + str3, null);
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
        ea.c cVar2 = this.f2193b;
        w8.g gVar = this.f2192a;
        gVar.a();
        String str5 = gVar.f46480c.f46488a;
        String str6 = bVar.f4306a;
        w8.g gVar2 = this.f2192a;
        gVar2.a();
        String str7 = gVar2.f46480c.f46492g;
        w8.g gVar3 = this.f2192a;
        gVar3.a();
        String str8 = gVar3.f46480c.f46489b;
        ea.d dVar = cVar2.f5175c;
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
                        ea.a e = ea.c.e(c3);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e;
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
                    int b10 = m1.j.b(aVar.e);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            da.a a10 = bVar.a();
                            a10.f4304f = "BAD CONFIG";
                            a10.f4302b = 5;
                            return a10.a();
                        }
                        throw new b7.a("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar.f5168b;
                    String str10 = aVar.f5169c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f2208a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ea.b bVar2 = aVar.d;
                    String str11 = bVar2.f5170a;
                    long j10 = bVar2.f5171b;
                    da.a a11 = bVar.a();
                    a11.f4303c = str9;
                    a11.f4302b = 4;
                    a11.d = str11;
                    a11.e = str10;
                    a11.f4305g = Long.valueOf(j10);
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
        synchronized (this.f2196g) {
            try {
                Iterator it = this.f2200l.iterator();
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
        synchronized (this.f2196g) {
            try {
                Iterator it = this.f2200l.iterator();
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
        this.f2198j = str;
    }

    public final synchronized void m(da.b bVar, da.b bVar2) {
        try {
            if (this.f2199k.size() != 0 && !TextUtils.equals(bVar.f4306a, bVar2.f4306a)) {
                Iterator it = this.f2199k.iterator();
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
