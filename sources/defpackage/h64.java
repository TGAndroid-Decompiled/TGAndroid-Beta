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
public final class h64 implements lr2, x76, y76, ee, Continuation, OnFailureListener, gka, hka {
    public final byte a;

    public h64(h74 h74Var) {
        this.a = (byte) 6;
    }

    public static void b(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 3:
                e26 e26Var = ExecutorsRegistrar.a;
                return m6c.a;
            case 19:
                return FirebaseInstallationsRegistrar.a(sm2Var);
            case 21:
                return FirebasePhoneNumberVerificationRegistrar.a(sm2Var);
            case 23:
                return FirebaseSessionsRegistrar.b(sm2Var);
            default:
                return FirebaseSessionsRegistrar.a(sm2Var);
        }
    }

    @Override
    public final void c(Object obj, lk4 lk4Var) {
        ((pe8) obj).d(new oe8(lk4Var));
    }

    @Override
    public final void d(Object obj, float f) {
        tl4 tl4Var = (tl4) obj;
        switch (this.a) {
            case 27:
                WindowManager.LayoutParams layoutParams = tl4Var.e;
                tl4Var.B = f;
                layoutParams.x = (int) f;
                tl4Var.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = tl4Var.e;
                tl4Var.C = f;
                layoutParams2.y = (int) f;
                tl4Var.r();
                return;
        }
    }

    @Override
    public final float get(Object obj) {
        tl4 tl4Var = (tl4) obj;
        switch (this.a) {
            case 26:
                return tl4Var.B;
            default:
                return tl4Var.C;
        }
    }

    @Override
    public final void invoke(Object obj) {
        pe8 pe8Var = (pe8) obj;
        switch (this.a) {
            case 5:
                pe8Var.F(new u64(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                pe8Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }

    @Override
    public final Object then(Task task) {
        int i;
        switch (this.a) {
            case 9:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public h64(byte b) {
        this.a = b;
    }
}
