package defpackage;

import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
public final class w44 implements aq2, x56, y56, ed, Continuation, OnFailureListener, eia, fia {
    public final byte a;

    public w44(y54 y54Var) {
        this.a = (byte) 5;
    }

    public static void d(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static void e(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static void f(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override
    public final Object K(gl2 gl2Var) {
        rg4 lambda$getComponents$0;
        yg4 components$lambda$0;
        fh4 components$lambda$02;
        ih4 components$lambda$1;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 2:
                e06 e06Var = ExecutorsRegistrar.a;
                return m4c.a;
            case 17:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(gl2Var);
                return lambda$getComponents$0;
            case 19:
                components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(gl2Var);
                return components$lambda$0;
            case 21:
                components$lambda$02 = FirebaseSessionsRegistrar.getComponents$lambda$0(gl2Var);
                return components$lambda$02;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(gl2Var);
                return components$lambda$1;
        }
    }

    @Override
    public final void b(Object obj, float f) {
        sj4 sj4Var = (sj4) obj;
        switch (this.a) {
            case 25:
                WindowManager.LayoutParams layoutParams = sj4Var.e;
                sj4Var.B = f;
                layoutParams.x = (int) f;
                sj4Var.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = sj4Var.e;
                sj4Var.C = f;
                layoutParams2.y = (int) f;
                sj4Var.r();
                return;
        }
    }

    @Override
    public final void c(Object obj, gi4 gi4Var) {
        ((mc8) obj).c(new lc8(gi4Var));
    }

    @Override
    public final float get(Object obj) {
        sj4 sj4Var = (sj4) obj;
        switch (this.a) {
            case 24:
                return sj4Var.B;
            default:
                return sj4Var.C;
        }
    }

    @Override
    public final void invoke(Object obj) {
        mc8 mc8Var = (mc8) obj;
        switch (this.a) {
            case 4:
                mc8Var.F(new j54(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                mc8Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override
    public final Object then(Task task) {
        int i;
        switch (this.a) {
            case 8:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override
    public final void u(hd hdVar, int i) {
        hdVar.dismiss();
    }

    public w44(byte b) {
        this.a = b;
    }
}
