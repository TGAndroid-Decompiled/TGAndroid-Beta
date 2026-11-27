package defpackage;

import android.util.Log;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
public final class bg implements dq7, fd, fq7, qd3, nu4, OnSuccessListener {
    public final byte a;

    public bg(tj tjVar) {
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
            case 0:
                return ob6.M0(2131747635, null);
            case 1:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i3 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i3) {
                    return ob6.D0().z0().format(timeInMillis) + ", " + ob6.D0().v0().format(timeInMillis);
                }
                return ob6.D0().x0().format(timeInMillis);
            case 2:
                return String.format("%02d", Integer.valueOf(i));
            case 3:
                return String.format("%02d", Integer.valueOf(i));
            case 4:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i4 = calendar2.get(1);
                calendar2.add(6, i);
                long timeInMillis2 = calendar2.getTimeInMillis();
                if (calendar2.get(1) == i4) {
                    if (i < 7) {
                        return ob6.D0().z0().format(timeInMillis2) + ", " + ob6.D0().v0().format(timeInMillis2);
                    }
                    return ob6.D0().v0().format(timeInMillis2);
                }
                return ob6.D0().x0().format(timeInMillis2);
            case 5:
                return String.format("%02d", Integer.valueOf(i));
            case 6:
                return String.format("%02d", Integer.valueOf(i));
            case 7:
            default:
                return String.format("%02d", Integer.valueOf(i));
            case 8:
                if (i == 0) {
                    return ob6.M0(2131745089, null);
                }
                if (i >= 1 && i < 16) {
                    return ob6.c0(i);
                }
                if (i == 16) {
                    return ob6.c0(30);
                }
                if (i == 17) {
                    return ob6.c0(60);
                }
                if (i == 18) {
                    return ob6.c0(3600);
                }
                if (i == 19) {
                    return ob6.c0(86400);
                }
                if (i == 20) {
                    return ob6.c0(604800);
                }
                return "";
            case 9:
                boolean z = ob6.c0;
                int i5 = 12;
                if (z) {
                    i2 = 24;
                } else {
                    i2 = 12;
                }
                int i6 = i % i2;
                if (i % 12 != 0 || z) {
                    i5 = i6;
                }
                String format = String.format("%02d", Integer.valueOf(i5));
                if (i >= 24) {
                    return ob6.a0(null, null, 2131752728, format);
                }
                return format;
            case 10:
                return String.format("%02d", Integer.valueOf(i));
            case 11:
                return String.valueOf(i);
            case 12:
                switch (i) {
                    case 0:
                        return ob6.M0(2131748840, null);
                    case 1:
                        return ob6.M0(2131750794, null);
                    case 2:
                        return ob6.M0(2131748437, null);
                    case 3:
                        return ob6.M0(2131754166, null);
                    case 4:
                        return ob6.M0(2131748416, null);
                    case 5:
                        return ob6.M0(2131748818, null);
                    case 6:
                        return ob6.M0(2131748820, null);
                    case 7:
                        return ob6.M0(2131753888, null);
                    case 8:
                        return ob6.M0(2131745293, null);
                    case 9:
                        return ob6.M0(2131747557, null);
                    case 10:
                        return ob6.M0(2131747562, null);
                    default:
                        return ob6.M0(2131751570, null);
                }
            case 13:
                return String.format("%02d", Integer.valueOf(i));
            case 14:
                return String.valueOf(i);
            case 15:
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final void f(vw8 vw8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        vw8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public final Object h(Object obj) {
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
        boolean z = f11.a;
        cc4.b("sms listener registered");
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 7:
                idVar.dismiss();
                return;
            case 17:
                idVar.dismiss();
                return;
            default:
                idVar.dismiss();
                return;
        }
    }

    public bg(byte b) {
        this.a = b;
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
    }
}
