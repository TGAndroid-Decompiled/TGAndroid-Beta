package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
public final class vwe {
    public static final he6 j = new he6("ApplicationAnalytics", null);
    public final wae a;
    public final ibd b;
    public final v4f c;
    public final SharedPreferences f;
    public e1f g;
    public md1 h;
    public boolean i;
    public final b99 e = new b99(Looper.getMainLooper(), (byte) 3);
    public final dhe d = new dhe(this, (byte) 0);

    public vwe(SharedPreferences sharedPreferences, wae waeVar, ibd ibdVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = waeVar;
        this.b = ibdVar;
        this.c = new v4f(str, bundle);
    }

    public static void a(vwe vweVar, int i) {
        j.b("log session ended with error = %d", Integer.valueOf(i));
        vweVar.c();
        vweVar.a.a(vweVar.c.a(vweVar.g, i), 228);
        vweVar.e.removeCallbacks(vweVar.d);
        if (!vweVar.i) {
            vweVar.g = null;
        }
    }

    public static void b(vwe vweVar) {
        e1f e1fVar = vweVar.g;
        SharedPreferences sharedPreferences = vweVar.f;
        e1fVar.getClass();
        if (sharedPreferences == null) {
            return;
        }
        e1f.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", e1fVar.b);
        edit.putString("receiver_metrics_id", e1fVar.c);
        edit.putLong("analytics_session_id", e1fVar.d);
        edit.putInt("event_sequence_number", e1fVar.e);
        edit.putString("receiver_session_id", e1fVar.f);
        edit.putInt("device_capabilities", e1fVar.g);
        edit.putString("device_model_name", e1fVar.h);
        edit.putInt("analytics_session_start_type", e1fVar.j);
        edit.putBoolean("is_output_switcher_enabled", e1fVar.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        e1f e1fVar;
        if (f()) {
            md1 md1Var = this.h;
            if (md1Var != null) {
                xve.e("Must be called from the main thread.");
                castDevice = md1Var.k;
            } else {
                castDevice = null;
            }
            if (castDevice != null) {
                String str = castDevice.x;
                if (!TextUtils.equals(this.g.c, str) && (e1fVar = this.g) != null) {
                    e1fVar.c = str;
                    e1fVar.g = castDevice.r;
                    e1fVar.h = castDevice.e;
                }
            }
            xve.h(this.g);
            return;
        }
        he6 he6Var = j;
        Log.w(he6Var.a, he6Var.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
        d();
    }

    public final void d() {
        boolean z;
        CastDevice castDevice;
        e1f e1fVar;
        int i = 0;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        e1f e1fVar2 = new e1f(this.b);
        e1f.l++;
        this.g = e1fVar2;
        md1 md1Var = this.h;
        if (md1Var != null && md1Var.g.f) {
            z = true;
        } else {
            z = false;
        }
        e1fVar2.i = z;
        he6 he6Var = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        xve.h(id1Var);
        xve.e("Must be called from the main thread.");
        e1fVar2.b = id1Var.e.a;
        md1 md1Var2 = this.h;
        if (md1Var2 == null) {
            castDevice = null;
        } else {
            xve.e("Must be called from the main thread.");
            castDevice = md1Var2.k;
        }
        if (castDevice != null && (e1fVar = this.g) != null) {
            e1fVar.c = castDevice.x;
            e1fVar.g = castDevice.r;
            e1fVar.h = castDevice.e;
        }
        e1f e1fVar3 = this.g;
        xve.h(e1fVar3);
        md1 md1Var3 = this.h;
        if (md1Var3 != null) {
            i = md1Var3.e();
        }
        e1fVar3.j = i;
        xve.h(this.g);
    }

    public final void e() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final boolean f() {
        String str;
        he6 he6Var = j;
        if (this.g == null) {
            he6Var.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        he6 he6Var2 = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        xve.h(id1Var);
        xve.e("Must be called from the main thread.");
        String str2 = id1Var.e.a;
        if (str2 != null && (str = this.g.b) != null && TextUtils.equals(str, str2)) {
            xve.h(this.g);
            return true;
        }
        he6Var.b("The analytics session doesn't match the application ID %s", str2);
        return false;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        xve.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
