package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class qg4 implements rg4 {
    public static final Object l = new Object();
    public final jg4 a;
    public final og4 b;
    public final sk4 c;
    public final t8c d;
    public final e06 e;
    public final Object f;
    public final ExecutorService g;
    public final v4a h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public qg4(jg4 jg4Var, mt8 mt8Var, ExecutorService executorService, v4a v4aVar) {
        jg4Var.a();
        og4 og4Var = new og4(jg4Var.a, mt8Var);
        sk4 sk4Var = new sk4(jg4Var);
        c6e c6eVar = c6e.E;
        c6e c6eVar2 = c6eVar;
        if (c6eVar == null) {
            ?? obj = new Object();
            c6e.E = obj;
            c6eVar2 = obj;
        }
        t8c t8cVar = t8c.c;
        if (t8cVar == null) {
            t8cVar = new t8c(c6eVar2);
            t8c.c = t8cVar;
        }
        e06 e06Var = new e06(new zp2(jg4Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = jg4Var;
        this.b = og4Var;
        this.c = sk4Var;
        this.d = t8cVar;
        this.e = e06Var;
        this.g = executorService;
        this.h = v4aVar;
    }

    public final void a(jwa jwaVar) {
        synchronized (this.f) {
            this.k.add(jwaVar);
        }
    }

    public final synchronized void b(ga0 ga0Var, ga0 ga0Var2) {
        boolean z;
        boolean z2 = false;
        if (ga0Var2.b == 4) {
            z = true;
        } else {
            z = false;
        }
        String str = ga0Var2.a;
        if (z && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(ga0Var.a, str)) {
                z2 = true;
            } else {
                if (ga0Var.b == 4) {
                    z2 = true;
                }
                z2 = !z2;
            }
        }
        if (z2) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((ug4) it.next()).a;
                if (firebaseMessaging.d() != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                    }
                    firebaseMessaging.h();
                }
            }
        }
    }

    public final void c() {
        ga0 b0;
        synchronized (l) {
            jg4 jg4Var = this.a;
            jg4Var.a();
            tg2 l2 = tg2.l(jg4Var.a);
            b0 = this.c.b0();
            int i = b0.b;
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            if (z) {
                String i2 = i(b0);
                sk4 sk4Var = this.c;
                fa0 a = b0.a();
                a.a = i2;
                a.b = 3;
                b0 = a.a();
                sk4Var.z(b0);
            }
            if (l2 != null) {
                l2.X();
            }
        }
        l(b0);
        this.h.execute(new pg4(this, (byte) 2));
    }

    public final ga0 d(ga0 ga0Var) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z;
        String str;
        qa0 qa0Var;
        jg4 jg4Var = this.a;
        jg4Var.a();
        String str2 = jg4Var.c.a;
        String str3 = ga0Var.a;
        jg4Var.a();
        String str4 = jg4Var.c.h;
        String str5 = ga0Var.d;
        og4 og4Var = this.b;
        jd1 jd1Var = og4Var.c;
        if (jd1Var.c()) {
            URL a = og4.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = og4Var.c(a, str2);
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c.setDoOutput(true);
                    og4.h(c);
                    responseCode = c.getResponseCode();
                    jd1Var.e(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = c;
                }
                if (z) {
                    qa0Var = og4.f(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    og4.b(c, null, str2, str4);
                    httpURLConnection = c;
                    try {
                    } catch (IOException | AssertionError unused2) {
                        continue;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) == 1) {
                                    qa0 qa0Var2 = new qa0(null, 0L, 2);
                                    httpURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    qa0Var = qa0Var2;
                                    str = null;
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            } else {
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new v30("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        str = null;
                        qa0 qa0Var3 = new qa0(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        qa0Var = qa0Var3;
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                }
                int F = ug8.F(qa0Var.c);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            m(str);
                            fa0 a2 = ga0Var.a();
                            a2.b = 2;
                            return a2.a();
                        }
                        throw new v30("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    fa0 a3 = ga0Var.a();
                    a3.g = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str6 = qa0Var.a;
                long j = qa0Var.b;
                this.d.a.getClass();
                fa0 a4 = ga0Var.a();
                a4.c = str6;
                a4.e = j;
                a4.f = System.currentTimeMillis() / 1000;
                a4.h = (byte) (((byte) (a4.h | 1)) | 2);
                return a4.a();
            }
            throw new v30("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new v30("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new zs4(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pg4(this, (byte) 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new qs4(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pg4(this, (byte) 1));
        return task;
    }

    public final void g(ga0 ga0Var) {
        synchronized (l) {
            jg4 jg4Var = this.a;
            jg4Var.a();
            tg2 l2 = tg2.l(jg4Var.a);
            this.c.z(ga0Var);
            if (l2 != null) {
                l2.X();
            }
        }
    }

    public final void h() {
        jg4 jg4Var = this.a;
        jg4Var.a();
        fre.g(jg4Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        jg4Var.a();
        fre.g(jg4Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        jg4Var.a();
        fre.g(jg4Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        jg4Var.a();
        String str = jg4Var.c.b;
        Pattern pattern = t8c.b;
        fre.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        jg4Var.a();
        fre.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", t8c.b.matcher(jg4Var.c.a).matches());
    }

    public final java.lang.String i(defpackage.ga0 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg4.i(ga0):java.lang.String");
    }

    public final ga0 j(ga0 ga0Var) {
        int responseCode;
        boolean z;
        w90 e;
        String str = ga0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ak5 ak5Var = (ak5) this.e.get();
            ak5Var.getClass();
            String[] strArr = ak5.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = (String) ak5Var.a.b(new lg8(tb4.q("|T|", ak5Var.b, "|", strArr[i])), null);
                if (str3 != null && !str3.isEmpty()) {
                    if (str3.startsWith("{")) {
                        try {
                            str2 = new JSONObject(str3).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    i++;
                }
            }
        }
        jg4 jg4Var = this.a;
        jg4Var.a();
        String str4 = jg4Var.c.a;
        jg4Var.a();
        String str5 = jg4Var.c.h;
        jg4Var.a();
        String str6 = jg4Var.c.b;
        og4 og4Var = this.b;
        jd1 jd1Var = og4Var.c;
        if (jd1Var.c()) {
            URL a = og4.a("projects/" + str5 + "/installations");
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = og4Var.c(a, str4);
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    og4.g(c, str, str6);
                    responseCode = c.getResponseCode();
                    jd1Var.e(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (z) {
                    e = og4.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    og4.b(c, str6, str4, str5);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            w90 w90Var = new w90(null, null, null, null, 2);
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e = w90Var;
                        } else {
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        throw new v30("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int F = ug8.F(e.e);
                if (F != 0) {
                    if (F == 1) {
                        fa0 a2 = ga0Var.a();
                        a2.g = "BAD CONFIG";
                        a2.b = 5;
                        return a2.a();
                    }
                    throw new v30("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str7 = e.b;
                String str8 = e.c;
                this.d.a.getClass();
                qa0 qa0Var = e.d;
                String str9 = qa0Var.a;
                long j = qa0Var.b;
                fa0 a3 = ga0Var.a();
                a3.a = str7;
                a3.b = 4;
                a3.c = str9;
                a3.d = str8;
                a3.e = j;
                a3.f = System.currentTimeMillis() / 1000;
                a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                return a3.a();
            }
            throw new v30("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new v30("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((jwa) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(ga0 ga0Var) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((jwa) it.next()).b(ga0Var)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void m(String str) {
        this.i = str;
    }
}
