package d2;

import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import b8.ke;
import ca.u2;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import gi.d3;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.e9;
import org.telegram.messenger.pe;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;
public final class t1 implements f9.k, k5.e, t9.d, NativeInstance.AudioLevelsCallback, it0, jt0, org.telegram.ui.ActionBar.p1, e9 {
    public final int f8415a;

    public t1(int i3) {
        this.f8415a = i3;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class e() {
        return ShortcutManager.class;
    }

    public Constructor a() {
        switch (this.f8415a) {
            case 12:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(e3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(e3.o.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f8415a) {
            case 0:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBundle(u1.f8441f, u1Var.f8445b.c());
                bundle.putIntArray(u1.f8442g, u1Var.d);
                bundle.putBooleanArray(u1.h, u1Var.f8447e);
                bundle.putBoolean(u1.f8443i, u1Var.f8446c);
                return bundle;
            case 7:
                db.o0 o0Var = (db.o0) obj;
                String d22 = db.p0.f8715b.d2(o0Var);
                kotlin.jvm.internal.j.d(d22, "encode(...)");
                o0Var.getClass();
                db.m mVar = db.m.f8701b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = d22.getBytes(ud.a.f55807a);
                kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
                return bytes;
            case 21:
                return Integer.valueOf(((f2.b) obj).f11376r);
            default:
                ga.a.f12182b.getClass();
                return da.a.f8594a.d2((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void c(Object obj, float f10) {
        ei.n1 n1Var = (ei.n1) obj;
        switch (this.f8415a) {
            case 16:
                WindowManager.LayoutParams layoutParams = n1Var.f10650c;
                n1Var.O = f10;
                layoutParams.x = (int) f10;
                org.telegram.messenger.g0.T3(n1Var.f10649b, n1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = n1Var.f10650c;
                n1Var.P = f10;
                layoutParams2.y = (int) f10;
                org.telegram.messenger.g0.T3(n1Var.f10649b, n1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f8415a) {
            case 19:
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ei.n1 n1Var = (ei.n1) obj;
        switch (this.f8415a) {
            case 15:
                return n1Var.O;
            default:
                return n1Var.P;
        }
    }

    @Override
    public Object k(Object obj) {
        Integer num = (Integer) obj;
        pe peVar = d3.f12558k0;
        return 0;
    }

    @Override
    public Object q1(ke keVar) {
        db.n components$lambda$0;
        db.r components$lambda$1;
        switch (this.f8415a) {
            case 9:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(keVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(keVar);
                return components$lambda$1;
        }
    }

    public t1(db.l lVar) {
        this.f8415a = 7;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
