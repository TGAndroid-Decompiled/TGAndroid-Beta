package aa;

import a9.q;
import ag.j2;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b9.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.r;
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
    public static final Object f281m = new Object();
    public final u8.g f282a;
    public final ca.c f283b;
    public final ze.b f284c;
    public final j d;
    public final q f285e;
    public final h f286f;
    public final Object f287g;
    public final ExecutorService h;
    public final l f288i;
    public String f289j;
    public final HashSet f290k;
    public final ArrayList f291l;

    static {
        new AtomicInteger(1);
    }

    public c(u8.g gVar, z9.b bVar, ExecutorService executorService, l lVar) {
        gVar.a();
        ca.c cVar = new ca.c(gVar.f49131a, bVar);
        ?? obj = new Object();
        obj.f50825b = gVar;
        if (bb.a.f2041b == null) {
            bb.a.f2041b = new bb.a(5);
        }
        bb.a aVar = bb.a.f2041b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        q qVar = new q(new a9.d(gVar, 2));
        ?? obj2 = new Object();
        this.f287g = new Object();
        this.f290k = new HashSet();
        this.f291l = new ArrayList();
        this.f282a = gVar;
        this.f283b = cVar;
        this.f284c = obj;
        this.d = jVar;
        this.f285e = qVar;
        this.f286f = obj2;
        this.h = executorService;
        this.f288i = lVar;
    }

    public final void a(i iVar) {
        synchronized (this.f287g) {
            this.f291l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: aa.c.b():void");
    }

    public final ba.b c(ba.b bVar) {
        int responseCode;
        boolean z10;
        ca.b f9;
        u8.g gVar = this.f282a;
        gVar.a();
        String str = gVar.f49133c.f49143a;
        String str2 = bVar.f2032a;
        gVar.a();
        String str3 = gVar.f49133c.f49148g;
        String str4 = bVar.d;
        ca.c cVar = this.f283b;
        ca.d dVar = cVar.f3023c;
        if (dVar.b()) {
            URL a2 = ca.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c3 = cVar.c(a2, str);
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    ca.c.h(c3);
                    responseCode = c3.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z10) {
                    f9 = ca.c.f(c3);
                } else {
                    ca.c.b(c3, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                j2 a10 = ca.b.a();
                                a10.f558b = 2;
                                f9 = a10.b();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new r("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        j2 a11 = ca.b.a();
                        a11.f558b = 3;
                        f9 = a11.b();
                    }
                }
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
                int b10 = m1.j.b(f9.f3019c);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            l(null);
                            ba.a a12 = bVar.a();
                            a12.f2027b = 2;
                            return a12.a();
                        }
                        throw new r("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ba.a a13 = bVar.a();
                    a13.f2030f = "BAD CONFIG";
                    a13.f2027b = 5;
                    return a13.a();
                }
                String str5 = f9.f3017a;
                long j10 = f9.f3018b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f299a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ba.a a14 = bVar.a();
                a14.d = str5;
                a14.f2031g = Long.valueOf(j10);
                a14.h = Long.valueOf(seconds);
                return a14.a();
            }
            throw new r("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new r("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f289j;
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

    public final void f(ba.b bVar) {
        synchronized (f281m) {
            try {
                u8.g gVar = this.f282a;
                gVar.a();
                ze.b i10 = ze.b.i(gVar.f49131a);
                this.f284c.K(bVar);
                if (i10 != null) {
                    i10.S();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        u8.g gVar = this.f282a;
        gVar.a();
        z5.l.g(gVar.f49133c.f49144b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z5.l.g(gVar.f49133c.f49148g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z5.l.g(gVar.f49133c.f49143a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f49133c.f49144b;
        Pattern pattern = j.f298c;
        z5.l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        z5.l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f298c.matcher(gVar.f49133c.f49143a).matches());
    }

    public final java.lang.String h(ba.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: aa.c.h(ba.b):java.lang.String");
    }

    public final ba.b i(ba.b bVar) {
        int responseCode;
        boolean z10;
        String str = bVar.f2032a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ba.c cVar = (ba.c) this.f285e.get();
            synchronized (cVar.f2039a) {
                try {
                    String[] strArr = ba.c.f2038c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String str4 = cVar.f2040b;
                            String string = cVar.f2039a.getString("|T|" + str4 + "|" + str3, null);
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
        ca.c cVar2 = this.f283b;
        u8.g gVar = this.f282a;
        gVar.a();
        String str5 = gVar.f49133c.f49143a;
        String str6 = bVar.f2032a;
        u8.g gVar2 = this.f282a;
        gVar2.a();
        String str7 = gVar2.f49133c.f49148g;
        u8.g gVar3 = this.f282a;
        gVar3.a();
        String str8 = gVar3.f49133c.f49144b;
        ca.d dVar = cVar2.f3023c;
        if (dVar.b()) {
            URL a2 = ca.c.a("projects/" + str7 + "/installations");
            int i11 = 0;
            ca.a aVar = cVar2;
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
                        ca.c.g(c3, str6, str8);
                        responseCode = c3.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z10) {
                        ca.a e10 = ca.c.e(c3);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e10;
                    } else {
                        try {
                            ca.c.b(c3, str8, str5, str7);
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
                                ca.a aVar2 = new ca.a(null, null, null, null, 2);
                                c3.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            }
                        } else {
                            throw new r("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int b10 = m1.j.b(aVar.f3016e);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            ba.a a10 = bVar.a();
                            a10.f2030f = "BAD CONFIG";
                            a10.f2027b = 5;
                            return a10.a();
                        }
                        throw new r("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar.f3014b;
                    String str10 = aVar.f3015c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f299a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ca.b bVar2 = aVar.d;
                    String str11 = bVar2.f3017a;
                    long j10 = bVar2.f3018b;
                    ba.a a11 = bVar.a();
                    a11.f2028c = str9;
                    a11.f2027b = 4;
                    a11.d = str11;
                    a11.f2029e = str10;
                    a11.f2031g = Long.valueOf(j10);
                    a11.h = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new r("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new r("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f287g) {
            try {
                Iterator it = this.f291l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(ba.b bVar) {
        synchronized (this.f287g) {
            try {
                Iterator it = this.f291l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f289j = str;
    }

    public final synchronized void m(ba.b bVar, ba.b bVar2) {
        try {
            if (this.f290k.size() != 0 && !TextUtils.equals(bVar.f2032a, bVar2.f2032a)) {
                Iterator it = this.f290k.iterator();
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
