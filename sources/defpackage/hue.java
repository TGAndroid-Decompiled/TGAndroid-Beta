package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
public final class hue {
    public static final ce6 j = new ce6("ApplicationAnalytics", null);
    public final i8e a;
    public final r8d b;
    public final g2f c;
    public final SharedPreferences f;
    public pye g;
    public me1 h;
    public boolean i;
    public final q79 e = new q79(Looper.getMainLooper(), (byte) 3);
    public final eqd d = new eqd(this, (byte) 1);

    public hue(SharedPreferences sharedPreferences, i8e i8eVar, r8d r8dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = i8eVar;
        this.b = r8dVar;
        this.c = new g2f(str, bundle);
    }

    public static void a(hue hueVar, int i) {
        j.b("log session ended with error = %d", Integer.valueOf(i));
        hueVar.c();
        hueVar.a.a(hueVar.c.a(hueVar.g, i), 228);
        hueVar.e.removeCallbacks(hueVar.d);
        if (!hueVar.i) {
            hueVar.g = null;
        }
    }

    public static void b(hue hueVar) {
        pye pyeVar = hueVar.g;
        SharedPreferences sharedPreferences = hueVar.f;
        pyeVar.getClass();
        if (sharedPreferences == null) {
            return;
        }
        pye.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", pyeVar.b);
        edit.putString("receiver_metrics_id", pyeVar.c);
        edit.putLong("analytics_session_id", pyeVar.d);
        edit.putInt("event_sequence_number", pyeVar.e);
        edit.putString("receiver_session_id", pyeVar.f);
        edit.putInt("device_capabilities", pyeVar.g);
        edit.putString("device_model_name", pyeVar.h);
        edit.putInt("analytics_session_start_type", pyeVar.j);
        edit.putBoolean("is_output_switcher_enabled", pyeVar.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        pye pyeVar;
        if (f()) {
            me1 me1Var = this.h;
            if (me1Var != null) {
                ite.e("Must be called from the main thread.");
                castDevice = me1Var.k;
            } else {
                castDevice = null;
            }
            if (castDevice != null) {
                String str = castDevice.x;
                if (!TextUtils.equals(this.g.c, str) && (pyeVar = this.g) != null) {
                    pyeVar.c = str;
                    pyeVar.g = castDevice.r;
                    pyeVar.h = castDevice.e;
                }
            }
            ite.h(this.g);
            return;
        }
        ce6 ce6Var = j;
        Log.w(ce6Var.a, ce6Var.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
        d();
    }

    public final void d() {
        boolean z;
        CastDevice castDevice;
        pye pyeVar;
        int i = 0;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        pye pyeVar2 = new pye(this.b);
        pye.l++;
        this.g = pyeVar2;
        me1 me1Var = this.h;
        if (me1Var != null && me1Var.g.f) {
            z = true;
        } else {
            z = false;
        }
        pyeVar2.i = z;
        ce6 ce6Var = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        pyeVar2.b = ie1Var.e.a;
        me1 me1Var2 = this.h;
        if (me1Var2 == null) {
            castDevice = null;
        } else {
            ite.e("Must be called from the main thread.");
            castDevice = me1Var2.k;
        }
        if (castDevice != null && (pyeVar = this.g) != null) {
            pyeVar.c = castDevice.x;
            pyeVar.g = castDevice.r;
            pyeVar.h = castDevice.e;
        }
        pye pyeVar3 = this.g;
        ite.h(pyeVar3);
        me1 me1Var3 = this.h;
        if (me1Var3 != null) {
            i = me1Var3.e();
        }
        pyeVar3.j = i;
        ite.h(this.g);
    }

    public final void e() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final boolean f() {
        String str;
        ce6 ce6Var = j;
        if (this.g == null) {
            ce6Var.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        ce6 ce6Var2 = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        String str2 = ie1Var.e.a;
        if (str2 != null && (str = this.g.b) != null && TextUtils.equals(str, str2)) {
            ite.h(this.g);
            return true;
        }
        ce6Var.b("The analytics session doesn't match the application ID %s", str2);
        return false;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        ite.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
