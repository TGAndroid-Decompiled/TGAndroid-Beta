package defpackage;

import android.util.Log;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
public final class zg implements ee, hp7, ke3, ku4, OnSuccessListener {
    public final byte a;

    public zg(sk skVar) {
        this.a = (byte) 19;
    }

    public static OnBackInvokedDispatcher a(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static void b() {
        throw new ConcurrentModificationException();
    }

    public static void d(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.layoutInDisplayCutoutMode = i;
    }

    public static void e(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override
    public final String c(int i) {
        int i2;
        switch (this.a) {
            case 1:
                return jb6.G(i + 1, "Times", new Object[0]);
            case 2:
                return jb6.G(i + 1, "Minutes", new Object[0]);
            case 3:
                return jb6.M0(2131747641, null);
            case 4:
                if (i == 0) {
                    return jb6.M0(2131748288, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i3 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i3) {
                    return jb6.D0().z0().format(timeInMillis) + ", " + jb6.D0().v0().format(timeInMillis);
                }
                return jb6.D0().x0().format(timeInMillis);
            case 5:
                return String.format("%02d", Integer.valueOf(i));
            case 6:
                return String.format("%02d", Integer.valueOf(i));
            case 7:
            default:
                return String.format("%02d", Integer.valueOf(i));
            case 8:
                boolean z = jb6.c0;
                int i4 = 12;
                if (z) {
                    i2 = 24;
                } else {
                    i2 = 12;
                }
                int i5 = i % i2;
                if (i % 12 != 0 || z) {
                    i4 = i5;
                }
                String format = String.format("%02d", Integer.valueOf(i4));
                if (i >= 24) {
                    return jb6.a0(null, null, 2131752700, format);
                }
                return format;
            case 9:
                return String.format("%02d", Integer.valueOf(i));
            case 10:
                if (i == 0) {
                    return jb6.M0(2131745095, null);
                }
                if (i >= 1 && i < 16) {
                    return jb6.c0(i);
                }
                if (i == 16) {
                    return jb6.c0(30);
                }
                if (i == 17) {
                    return jb6.c0(60);
                }
                if (i == 18) {
                    return jb6.c0(3600);
                }
                if (i == 19) {
                    return jb6.c0(86400);
                }
                if (i == 20) {
                    return jb6.c0(604800);
                }
                return "";
            case 11:
                return String.valueOf(i);
            case 12:
                switch (i) {
                    case 0:
                        return jb6.M0(2131748843, null);
                    case 1:
                        return jb6.M0(2131750766, null);
                    case 2:
                        return jb6.M0(2131748440, null);
                    case 3:
                        return jb6.M0(2131754138, null);
                    case 4:
                        return jb6.M0(2131748419, null);
                    case 5:
                        return jb6.M0(2131748821, null);
                    case 6:
                        return jb6.M0(2131748823, null);
                    case 7:
                        return jb6.M0(2131753860, null);
                    case 8:
                        return jb6.M0(2131745299, null);
                    case 9:
                        return jb6.M0(2131747563, null);
                    case 10:
                        return jb6.M0(2131747568, null);
                    default:
                        return jb6.M0(2131751542, null);
                }
            case 13:
                return String.valueOf(i);
            case 14:
                switch (i) {
                    case 0:
                        return jb6.M0(2131748843, null);
                    case 1:
                        return jb6.M0(2131750766, null);
                    case 2:
                        return jb6.M0(2131748440, null);
                    case 3:
                        return jb6.M0(2131754138, null);
                    case 4:
                        return jb6.M0(2131748419, null);
                    case 5:
                        return jb6.M0(2131748821, null);
                    case 6:
                        return jb6.M0(2131748823, null);
                    case 7:
                        return jb6.M0(2131753860, null);
                    case 8:
                        return jb6.M0(2131745299, null);
                    case 9:
                        return jb6.M0(2131747563, null);
                    case 10:
                        return jb6.M0(2131747568, null);
                    default:
                        return jb6.M0(2131751542, null);
                }
            case 15:
                return String.format("%02d", Integer.valueOf(i));
            case 16:
                return String.valueOf(i);
            case 17:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final void f(nv8 nv8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        nv8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public final Object l(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 22:
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        Void r1 = (Void) obj;
        boolean z = e21.a;
        fc4.b("sms listener registered");
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                return;
            case 7:
                heVar.dismiss();
                return;
            default:
                heVar.dismiss();
                return;
        }
    }

    public zg(byte b) {
        this.a = b;
    }
}
