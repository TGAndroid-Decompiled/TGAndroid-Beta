package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import org.telegram.ui.LaunchActivity;
public final class wn4 implements js4, Continuation, dn7, rj5, fi4, ed {
    public final byte a;

    public wn4(ep epVar) {
        this.a = (byte) 6;
    }

    public static BlendMode e(Object obj) {
        return (BlendMode) obj;
    }

    public static void f() {
        throw new AssertionError();
    }

    public static void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static void h(Object obj, Object obj2) {
        throw new AndroidRuntimeException("Fragment " + obj + obj2);
    }

    public static void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static void j(String str) {
        throw new RuntimeException(str);
    }

    public static void k(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static void n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static void p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override
    public final String c(int i) {
        switch (this.a) {
            case 8:
                return String.format("%02d", Integer.valueOf(i));
            default:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final boolean d(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 10:
                return false;
            default:
                if (i != 2 ? !(i2 != 65 || i3 != 80 || i4 != 73 || i5 != 67) : !(i2 != 80 || i3 != 73 || i4 != 67)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final Object m(Object obj) {
        switch (this.a) {
            case 4:
                Integer num = (Integer) obj;
                xl6 xl6Var = sr4.k0;
                return 0;
            case 21:
                Void r7 = (Void) obj;
                int L = gl.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(gl.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(bkb.w0(null, bkb.c6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 22:
                Void r72 = (Void) obj;
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = gl.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f, f, f, paint2);
                return createBitmap2;
            default:
                Void r73 = (Void) obj;
                String str = LaunchActivity.C1;
                return new ah6();
        }
    }

    @Override
    public final boolean run() {
        String str = LaunchActivity.C1;
        if (gba.r.length() > 0 && !gba.z) {
            return true;
        }
        return false;
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
                    k93.f(string3);
                    return null;
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                k93.f("SERVICE_NOT_AVAILABLE");
                return null;
            }
            k93.f("INSTANCE_ID_RESET");
            return null;
        }
        k93.f("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 28:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    public wn4(byte b) {
        this.a = b;
    }
}
