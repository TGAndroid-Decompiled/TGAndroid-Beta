package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
public final class ese {
    public static final dc6 j = new dc6("ApplicationAnalytics", null);
    public final h6e a;
    public final p6d b;
    public final e0f c;
    public final SharedPreferences f;
    public nwe g;
    public ed1 h;
    public boolean i;
    public final o59 e = new o59(Looper.getMainLooper(), (byte) 3);
    public final bod d = new bod(this, (byte) 1);

    public ese(SharedPreferences sharedPreferences, h6e h6eVar, p6d p6dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = h6eVar;
        this.b = p6dVar;
        this.c = new e0f(str, bundle);
    }

    public static void a(ese eseVar, int i) {
        j.b("log session ended with error = %d", Integer.valueOf(i));
        eseVar.c();
        eseVar.a.a(eseVar.c.a(eseVar.g, i), 228);
        eseVar.e.removeCallbacks(eseVar.d);
        if (!eseVar.i) {
            eseVar.g = null;
        }
    }

    public static void b(ese eseVar) {
        nwe nweVar = eseVar.g;
        SharedPreferences sharedPreferences = eseVar.f;
        nweVar.getClass();
        if (sharedPreferences == null) {
            return;
        }
        nwe.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", nweVar.b);
        edit.putString("receiver_metrics_id", nweVar.c);
        edit.putLong("analytics_session_id", nweVar.d);
        edit.putInt("event_sequence_number", nweVar.e);
        edit.putString("receiver_session_id", nweVar.f);
        edit.putInt("device_capabilities", nweVar.g);
        edit.putString("device_model_name", nweVar.h);
        edit.putInt("analytics_session_start_type", nweVar.j);
        edit.putBoolean("is_output_switcher_enabled", nweVar.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        nwe nweVar;
        if (f()) {
            ed1 ed1Var = this.h;
            if (ed1Var != null) {
                fre.e("Must be called from the main thread.");
                castDevice = ed1Var.k;
            } else {
                castDevice = null;
            }
            if (castDevice != null) {
                String str = castDevice.x;
                if (!TextUtils.equals(this.g.c, str) && (nweVar = this.g) != null) {
                    nweVar.c = str;
                    nweVar.g = castDevice.r;
                    nweVar.h = castDevice.e;
                }
            }
            fre.h(this.g);
            return;
        }
        dc6 dc6Var = j;
        Log.w(dc6Var.a, dc6Var.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
        d();
    }

    public final void d() {
        boolean z;
        CastDevice castDevice;
        nwe nweVar;
        int i = 0;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        nwe nweVar2 = new nwe(this.b);
        nwe.l++;
        this.g = nweVar2;
        ed1 ed1Var = this.h;
        if (ed1Var != null && ed1Var.g.f) {
            z = true;
        } else {
            z = false;
        }
        nweVar2.i = z;
        dc6 dc6Var = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        fre.h(ad1Var);
        fre.e("Must be called from the main thread.");
        nweVar2.b = ad1Var.e.a;
        ed1 ed1Var2 = this.h;
        if (ed1Var2 == null) {
            castDevice = null;
        } else {
            fre.e("Must be called from the main thread.");
            castDevice = ed1Var2.k;
        }
        if (castDevice != null && (nweVar = this.g) != null) {
            nweVar.c = castDevice.x;
            nweVar.g = castDevice.r;
            nweVar.h = castDevice.e;
        }
        nwe nweVar3 = this.g;
        fre.h(nweVar3);
        ed1 ed1Var3 = this.h;
        if (ed1Var3 != null) {
            i = ed1Var3.e();
        }
        nweVar3.j = i;
        fre.h(this.g);
    }

    public final void e() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final boolean f() {
        String str;
        dc6 dc6Var = j;
        if (this.g == null) {
            dc6Var.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        dc6 dc6Var2 = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        fre.h(ad1Var);
        fre.e("Must be called from the main thread.");
        String str2 = ad1Var.e.a;
        if (str2 != null && (str = this.g.b) != null && TextUtils.equals(str, str2)) {
            fre.h(this.g);
            return true;
        }
        dc6Var.b("The analytics session doesn't match the application ID %s", str2);
        return false;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        fre.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
