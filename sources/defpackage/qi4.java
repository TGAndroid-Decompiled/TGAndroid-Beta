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
public final class qi4 implements ri4 {
    public static final Object l = new Object();
    public final ji4 a;
    public final oi4 b;
    public final ym4 c;
    public final tcc d;
    public final i26 e;
    public final Object f;
    public final ExecutorService g;
    public final n8a h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public qi4(ji4 ji4Var, vw8 vw8Var, ExecutorService executorService, n8a n8aVar) {
        ji4Var.a();
        oi4 oi4Var = new oi4(ji4Var.a, vw8Var);
        ym4 ym4Var = new ym4(ji4Var);
        sae saeVar = sae.E;
        sae saeVar2 = saeVar;
        if (saeVar == null) {
            ?? obj = new Object();
            sae.E = obj;
            saeVar2 = obj;
        }
        tcc tccVar = tcc.c;
        if (tccVar == null) {
            tccVar = new tcc(saeVar2);
            tcc.c = tccVar;
        }
        i26 i26Var = new i26(new sq2(ji4Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = ji4Var;
        this.b = oi4Var;
        this.c = ym4Var;
        this.d = tccVar;
        this.e = i26Var;
        this.g = executorService;
        this.h = n8aVar;
    }

    public final void a(m0b m0bVar) {
        synchronized (this.f) {
            this.k.add(m0bVar);
        }
    }

    public final synchronized void b(ia0 ia0Var, ia0 ia0Var2) {
        boolean z;
        boolean z2 = false;
        if (ia0Var2.b == 4) {
            z = true;
        } else {
            z = false;
        }
        String str = ia0Var2.a;
        if (z && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(ia0Var.a, str)) {
                z2 = true;
            } else {
                if (ia0Var.b == 4) {
                    z2 = true;
                }
                z2 = !z2;
            }
        }
        if (z2) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((ui4) it.next()).a;
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
        ia0 F0;
        synchronized (l) {
            ji4 ji4Var = this.a;
            ji4Var.a();
            lh2 e = lh2.e(ji4Var.a);
            F0 = this.c.F0();
            int i = F0.b;
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            if (z) {
                String i2 = i(F0);
                ym4 ym4Var = this.c;
                ha0 a = F0.a();
                a.a = i2;
                a.b = 3;
                F0 = a.a();
                ym4Var.J(F0);
            }
            if (e != null) {
                e.Q();
            }
        }
        l(F0);
        this.h.execute(new pi4(this, (byte) 2));
    }

    public final ia0 d(ia0 ia0Var) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z;
        String str;
        sa0 sa0Var;
        ji4 ji4Var = this.a;
        ji4Var.a();
        String str2 = ji4Var.c.a;
        String str3 = ia0Var.a;
        ji4Var.a();
        String str4 = ji4Var.c.h;
        String str5 = ia0Var.d;
        oi4 oi4Var = this.b;
        sd1 sd1Var = oi4Var.c;
        if (sd1Var.c()) {
            URL a = oi4.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = oi4Var.c(a, str2);
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c.setDoOutput(true);
                    oi4.h(c);
                    responseCode = c.getResponseCode();
                    sd1Var.e(responseCode);
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
                    sa0Var = oi4.f(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    oi4.b(c, null, str2, str4);
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
                                    sa0 sa0Var2 = new sa0(null, 0L, 2);
                                    httpURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    sa0Var = sa0Var2;
                                    str = null;
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            } else {
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new w30("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        str = null;
                        sa0 sa0Var3 = new sa0(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        sa0Var = sa0Var3;
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                }
                int F = ik8.F(sa0Var.c);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            m(str);
                            ha0 a2 = ia0Var.a();
                            a2.b = 2;
                            return a2.a();
                        }
                        throw new w30("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ha0 a3 = ia0Var.a();
                    a3.g = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str6 = sa0Var.a;
                long j = sa0Var.b;
                this.d.a.getClass();
                ha0 a4 = ia0Var.a();
                a4.c = str6;
                a4.e = j;
                a4.f = System.currentTimeMillis() / 1000;
                a4.h = (byte) (((byte) (a4.h | 1)) | 2);
                return a4.a();
            }
            throw new w30("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new w30("Firebase Installations Service is unavailable. Please try again later.");
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
        a(new dv4(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pi4(this, (byte) 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new uu4(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.g.execute(new pi4(this, (byte) 1));
        return task;
    }

    public final void g(ia0 ia0Var) {
        synchronized (l) {
            ji4 ji4Var = this.a;
            ji4Var.a();
            lh2 e = lh2.e(ji4Var.a);
            this.c.J(ia0Var);
            if (e != null) {
                e.Q();
            }
        }
    }

    public final void h() {
        ji4 ji4Var = this.a;
        ji4Var.a();
        xve.g(ji4Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        xve.g(ji4Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        xve.g(ji4Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ji4Var.a();
        String str = ji4Var.c.b;
        Pattern pattern = tcc.b;
        xve.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        ji4Var.a();
        xve.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", tcc.b.matcher(ji4Var.c.a).matches());
    }

    public final java.lang.String i(defpackage.ia0 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi4.i(ia0):java.lang.String");
    }

    public final ia0 j(ia0 ia0Var) {
        int responseCode;
        boolean z;
        y90 e;
        String str = ia0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            dm5 dm5Var = (dm5) this.e.get();
            dm5Var.getClass();
            String[] strArr = dm5.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = (String) dm5Var.a.b(new zj8(qd4.q("|T|", dm5Var.b, "|", strArr[i])), null);
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
        ji4 ji4Var = this.a;
        ji4Var.a();
        String str4 = ji4Var.c.a;
        ji4Var.a();
        String str5 = ji4Var.c.h;
        ji4Var.a();
        String str6 = ji4Var.c.b;
        oi4 oi4Var = this.b;
        sd1 sd1Var = oi4Var.c;
        if (sd1Var.c()) {
            URL a = oi4.a("projects/" + str5 + "/installations");
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = oi4Var.c(a, str4);
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    oi4.g(c, str, str6);
                    responseCode = c.getResponseCode();
                    sd1Var.e(responseCode);
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
                    e = oi4.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    oi4.b(c, str6, str4, str5);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            y90 y90Var = new y90(null, null, null, null, 2);
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e = y90Var;
                        } else {
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        throw new w30("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int F = ik8.F(e.e);
                if (F != 0) {
                    if (F == 1) {
                        ha0 a2 = ia0Var.a();
                        a2.g = "BAD CONFIG";
                        a2.b = 5;
                        return a2.a();
                    }
                    throw new w30("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str7 = e.b;
                String str8 = e.c;
                this.d.a.getClass();
                sa0 sa0Var = e.d;
                String str9 = sa0Var.a;
                long j = sa0Var.b;
                ha0 a3 = ia0Var.a();
                a3.a = str7;
                a3.b = 4;
                a3.c = str9;
                a3.d = str8;
                a3.e = j;
                a3.f = System.currentTimeMillis() / 1000;
                a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                return a3.a();
            }
            throw new w30("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new w30("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((m0b) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(ia0 ia0Var) {
        synchronized (this.f) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((m0b) it.next()).b(ia0Var)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void m(String str) {
        this.i = str;
    }
}
