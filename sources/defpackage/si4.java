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
public final class si4 implements ti4 {
    public static final Object l = new Object();
    public final li4 a;
    public final qi4 b;
    public final mj4 c;
    public final uac d;
    public final e26 e;
    public final Object f;
    public final ExecutorService g;
    public final x6a h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public si4(li4 li4Var, nv8 nv8Var, ExecutorService executorService, x6a x6aVar) {
        li4Var.a();
        qi4 qi4Var = new qi4(li4Var.a, nv8Var);
        mj4 mj4Var = new mj4(li4Var);
        f8e f8eVar = f8e.E;
        f8e f8eVar2 = f8eVar;
        if (f8eVar == null) {
            ?? obj = new Object();
            f8e.E = obj;
            f8eVar2 = obj;
        }
        uac uacVar = uac.c;
        if (uacVar == null) {
            uacVar = new uac(f8eVar2);
            uac.c = uacVar;
        }
        e26 e26Var = new e26(new kr2(li4Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = li4Var;
        this.b = qi4Var;
        this.c = mj4Var;
        this.d = uacVar;
        this.e = e26Var;
        this.g = executorService;
        this.h = x6aVar;
    }

    public final void a(mya myaVar) {
        synchronized (this.f) {
            this.k.add(myaVar);
        }
    }

    public final synchronized void b(gb0 gb0Var, gb0 gb0Var2) {
        boolean z;
        boolean z2 = false;
        if (gb0Var2.b == 4) {
            z = true;
        } else {
            z = false;
        }
        String str = gb0Var2.a;
        if (z && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(gb0Var.a, str)) {
                z2 = true;
            } else {
                if (gb0Var.b == 4) {
                    z2 = true;
                }
                z2 = !z2;
            }
        }
        if (z2) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((wi4) it.next()).a;
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
        gb0 x;
        synchronized (l) {
            li4 li4Var = this.a;
            li4Var.a();
            lx6 d = lx6.d(li4Var.a);
            x = this.c.x();
            int i = x.b;
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            if (z) {
                String i2 = i(x);
                mj4 mj4Var = this.c;
                fb0 a = x.a();
                a.a = i2;
                a.b = 3;
                x = a.a();
                mj4Var.q(x);
            }
            if (d != null) {
                d.L();
            }
        }
        l(x);
        this.h.execute(new ri4(this, (byte) 2));
    }

    public final gb0 d(gb0 gb0Var) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z;
        String str;
        qb0 qb0Var;
        li4 li4Var = this.a;
        li4Var.a();
        String str2 = li4Var.c.a;
        String str3 = gb0Var.a;
        li4Var.a();
        String str4 = li4Var.c.h;
        String str5 = gb0Var.d;
        qi4 qi4Var = this.b;
        re1 re1Var = qi4Var.c;
        if (re1Var.c()) {
            URL a = qi4.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = qi4Var.c(a, str2);
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c.setDoOutput(true);
                    qi4.h(c);
                    responseCode = c.getResponseCode();
                    re1Var.e(responseCode);
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
                    qb0Var = qi4.f(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    qi4.b(c, null, str2, str4);
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
                                    qb0 qb0Var2 = new qb0(null, 0L, 2);
                                    httpURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    qb0Var = qb0Var2;
                                    str = null;
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            } else {
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new v40("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        str = null;
                        qb0 qb0Var3 = new qb0(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        qb0Var = qb0Var3;
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                }
                int F = wi8.F(qb0Var.c);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            m(str);
                            fb0 a2 = gb0Var.a();
                            a2.b = 2;
                            return a2.a();
                        }
                        throw new v40("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    fb0 a3 = gb0Var.a();
                    a3.g = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str6 = qb0Var.a;
                long j = qb0Var.b;
                this.d.a.getClass();
                fb0 a4 = gb0Var.a();
                a4.c = str6;
                a4.e = j;
                a4.f = System.currentTimeMillis() / 1000;
                a4.h = (byte) (((byte) (a4.h | 1)) | 2);
                return a4.a();
            }
            throw new v40("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new v40("Firebase Installations Service is unavailable. Please try again later.");
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
        a(new av4(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new ri4(this, (byte) 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new ru4(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new ri4(this, (byte) 1));
        return task;
    }

    public final void g(gb0 gb0Var) {
        synchronized (l) {
            li4 li4Var = this.a;
            li4Var.a();
            lx6 d = lx6.d(li4Var.a);
            this.c.q(gb0Var);
            if (d != null) {
                d.L();
            }
        }
    }

    public final void h() {
        li4 li4Var = this.a;
        li4Var.a();
        ite.g(li4Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        li4Var.a();
        ite.g(li4Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        li4Var.a();
        ite.g(li4Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        li4Var.a();
        String str = li4Var.c.b;
        Pattern pattern = uac.b;
        ite.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        li4Var.a();
        ite.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", uac.b.matcher(li4Var.c.a).matches());
    }

    public final java.lang.String i(defpackage.gb0 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si4.i(gb0):java.lang.String");
    }

    public final gb0 j(gb0 gb0Var) {
        int responseCode;
        boolean z;
        wa0 e;
        String str = gb0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            am5 am5Var = (am5) this.e.get();
            am5Var.getClass();
            String[] strArr = am5.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = (String) am5Var.a.b(new ni8(td4.r("|T|", am5Var.b, "|", strArr[i])), null);
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
        li4 li4Var = this.a;
        li4Var.a();
        String str4 = li4Var.c.a;
        li4Var.a();
        String str5 = li4Var.c.h;
        li4Var.a();
        String str6 = li4Var.c.b;
        qi4 qi4Var = this.b;
        re1 re1Var = qi4Var.c;
        if (re1Var.c()) {
            URL a = qi4.a("projects/" + str5 + "/installations");
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = qi4Var.c(a, str4);
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    qi4.g(c, str, str6);
                    responseCode = c.getResponseCode();
                    re1Var.e(responseCode);
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
                    e = qi4.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    qi4.b(c, str6, str4, str5);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            wa0 wa0Var = new wa0(null, null, null, null, 2);
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e = wa0Var;
                        } else {
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        throw new v40("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int F = wi8.F(e.e);
                if (F != 0) {
                    if (F == 1) {
                        fb0 a2 = gb0Var.a();
                        a2.g = "BAD CONFIG";
                        a2.b = 5;
                        return a2.a();
                    }
                    throw new v40("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str7 = e.b;
                String str8 = e.c;
                this.d.a.getClass();
                qb0 qb0Var = e.d;
                String str9 = qb0Var.a;
                long j = qb0Var.b;
                fb0 a3 = gb0Var.a();
                a3.a = str7;
                a3.b = 4;
                a3.c = str9;
                a3.d = str8;
                a3.e = j;
                a3.f = System.currentTimeMillis() / 1000;
                a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                return a3.a();
            }
            throw new v40("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new v40("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((mya) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(gb0 gb0Var) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((mya) it.next()).b(gb0Var)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void m(String str) {
        this.i = str;
    }
}
