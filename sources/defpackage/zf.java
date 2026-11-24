package defpackage;

import android.util.Log;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
public final class zf implements ed, dn7, yc3, js4, OnSuccessListener {
    public final byte a;

    public zf(sj sjVar) {
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
                return k96.G(i + 1, "Times", new Object[0]);
            case 2:
                return k96.G(i + 1, "Minutes", new Object[0]);
            case 3:
                return k96.M0(2131747715, null);
            case 4:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i3 = calendar.get(1);
                calendar.add(6, i);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i3) {
                    return k96.D0().z0().format(timeInMillis) + ", " + k96.D0().v0().format(timeInMillis);
                }
                return k96.D0().x0().format(timeInMillis);
            case 5:
                return String.format("%02d", Integer.valueOf(i));
            case 6:
                return String.format("%02d", Integer.valueOf(i));
            case 7:
            default:
                return String.format("%02d", Integer.valueOf(i));
            case 8:
                boolean z = k96.c0;
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
                    return k96.a0(null, null, 2131752735, format);
                }
                return format;
            case 9:
                return String.format("%02d", Integer.valueOf(i));
            case 10:
                if (i == 0) {
                    return k96.M0(2131745169, null);
                }
                if (i >= 1 && i < 16) {
                    return k96.c0(i);
                }
                if (i == 16) {
                    return k96.c0(30);
                }
                if (i == 17) {
                    return k96.c0(60);
                }
                if (i == 18) {
                    return k96.c0(3600);
                }
                if (i == 19) {
                    return k96.c0(86400);
                }
                if (i == 20) {
                    return k96.c0(604800);
                }
                return "";
            case 11:
                return String.valueOf(i);
            case 12:
                switch (i) {
                    case 0:
                        return k96.M0(2131748894, null);
                    case 1:
                        return k96.M0(2131750817, null);
                    case 2:
                        return k96.M0(2131748491, null);
                    case 3:
                        return k96.M0(2131754170, null);
                    case 4:
                        return k96.M0(2131748470, null);
                    case 5:
                        return k96.M0(2131748872, null);
                    case 6:
                        return k96.M0(2131748874, null);
                    case 7:
                        return k96.M0(2131753892, null);
                    case 8:
                        return k96.M0(2131745373, null);
                    case 9:
                        return k96.M0(2131747637, null);
                    case 10:
                        return k96.M0(2131747642, null);
                    default:
                        return k96.M0(2131751593, null);
                }
            case 13:
                return String.valueOf(i);
            case 14:
                switch (i) {
                    case 0:
                        return k96.M0(2131748894, null);
                    case 1:
                        return k96.M0(2131750817, null);
                    case 2:
                        return k96.M0(2131748491, null);
                    case 3:
                        return k96.M0(2131754170, null);
                    case 4:
                        return k96.M0(2131748470, null);
                    case 5:
                        return k96.M0(2131748872, null);
                    case 6:
                        return k96.M0(2131748874, null);
                    case 7:
                        return k96.M0(2131753892, null);
                    case 8:
                        return k96.M0(2131745373, null);
                    case 9:
                        return k96.M0(2131747637, null);
                    case 10:
                        return k96.M0(2131747642, null);
                    default:
                        return k96.M0(2131751593, null);
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
    public final void h(mt8 mt8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        mt8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public final Object m(Object obj) {
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
        boolean z = w01.a;
        fa4.b("sms listener registered");
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                hdVar.dismiss();
                return;
            case 7:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    public zf(byte b) {
        this.a = b;
    }
}
