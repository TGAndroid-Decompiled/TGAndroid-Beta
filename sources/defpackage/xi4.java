package defpackage;

import android.graphics.BlendMode;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
public final class xi4 implements tq2, zla, ama, nu4, Continuation, dq7, tl5 {
    public final byte a;

    public xi4(fp fpVar) {
        this.a = (byte) 18;
    }

    public static BlendMode f(Object obj) {
        return (BlendMode) obj;
    }

    public static void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static void i(Object obj, Object obj2) {
        throw new AndroidRuntimeException("Fragment " + obj + obj2);
    }

    public static void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static void l(String str) {
        throw new RuntimeException(str);
    }

    public static void m(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override
    public final boolean b(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 22:
                return false;
            default:
                if (i != 2 ? !(i2 != 65 || i3 != 80 || i4 != 73 || i5 != 67) : !(i2 != 80 || i3 != 73 || i4 != 67)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object b0(am2 am2Var) {
        zi4 components$lambda$0;
        gj4 components$lambda$02;
        jj4 components$lambda$1;
        switch (this.a) {
            case 1:
                components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(am2Var);
                return components$lambda$0;
            case 2:
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(am2Var);
                return components$lambda$1;
            case 3:
                components$lambda$02 = FirebaseSessionsRegistrar.getComponents$lambda$0(am2Var);
                return components$lambda$02;
        }
    }

    @Override
    public final String c(int i) {
        switch (this.a) {
            case 20:
                return String.format("%02d", Integer.valueOf(i));
            default:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final void d(Object obj, float f) {
        xl4 xl4Var = (xl4) obj;
        switch (this.a) {
            case 7:
                WindowManager.LayoutParams layoutParams = xl4Var.f;
                xl4Var.E = f;
                layoutParams.x = (int) f;
                xl4Var.v();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = xl4Var.f;
                xl4Var.F = f;
                layoutParams2.y = (int) f;
                xl4Var.v();
                return;
        }
    }

    @Override
    public final float get(Object obj) {
        xl4 xl4Var = (xl4) obj;
        switch (this.a) {
            case 6:
                return xl4Var.E;
            default:
                return xl4Var.F;
        }
    }

    @Override
    public final Object h(Object obj) {
        Integer num = (Integer) obj;
        do6 do6Var = wt4.k0;
        return 0;
    }

    @Override
    public final Object then(Task task) {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    su3.e(string3);
                    return null;
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                su3.e("SERVICE_NOT_AVAILABLE");
                return null;
            }
            su3.e("INSTANCE_ID_RESET");
            return null;
        }
        su3.e("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public xi4(byte b) {
        this.a = b;
    }
}
