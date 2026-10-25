package n4;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import m4.w1;
public final class w {
    public static final Object f18702b = new Object();
    public static volatile w f18703c;
    public Object f18704a;

    public static w a(Context context) {
        w wVar;
        synchronized (f18702b) {
            try {
                if (f18703c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    w1 w1Var = new w1(2, (byte) 0);
                    w1Var.f18293b = applicationContext;
                    w1Var.f18294c = applicationContext.getContentResolver();
                    obj.f18704a = w1Var;
                    f18703c = obj;
                }
                wVar = f18703c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public boolean b(t tVar) {
        w1 w1Var = (w1) this.f18704a;
        v vVar = tVar.f18698a;
        Context context = (Context) w1Var.f18293b;
        int i10 = vVar.f18701c;
        String str = vVar.f18699a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i11 < 28) {
                        i10 = applicationInfo.uid;
                    }
                    if (i10 != 1000 && i10 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.f18700b, vVar.f18701c) != 0 && !w1Var.N(vVar, "android.permission.STATUS_BAR_SERVICE") && !w1Var.N(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) w1Var.f18294c, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            e2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.f18670c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f18704a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f18670c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f18704a).putLong(str, j10);
    }

    public void e(String str, a0 a0Var) {
        Rating rating;
        float f7 = a0Var.f18655b;
        int i10 = a0Var.f18654a;
        Integer num = (Integer) i.f18670c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f18704a;
        if (a0Var.f18656c == null) {
            if (a0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        a0Var.f18656c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        a0Var.f18656c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        a0Var.f18656c = Rating.newStarRating(i10, a0Var.a());
                        break;
                    case 6:
                        a0Var.f18656c = Rating.newPercentageRating((i10 == 6 && a0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            a0Var.f18656c = Rating.newUnratedRating(i10);
        }
        rating = a0Var.f18656c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f18670c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f18704a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f18670c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f18704a).putCharSequence(str, charSequence);
    }
}
