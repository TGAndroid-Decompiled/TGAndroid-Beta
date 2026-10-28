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
    public static final Object f18701b = new Object();
    public static volatile w f18702c;
    public Object f18703a;

    public static w a(Context context) {
        w wVar;
        synchronized (f18701b) {
            try {
                if (f18702c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    w1 w1Var = new w1(2, (byte) 0);
                    w1Var.f18292b = applicationContext;
                    w1Var.f18293c = applicationContext.getContentResolver();
                    obj.f18703a = w1Var;
                    f18702c = obj;
                }
                wVar = f18702c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public boolean b(t tVar) {
        w1 w1Var = (w1) this.f18703a;
        v vVar = tVar.f18697a;
        Context context = (Context) w1Var.f18292b;
        int i10 = vVar.f18700c;
        String str = vVar.f18698a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i11 < 28) {
                        i10 = applicationInfo.uid;
                    }
                    if (i10 != 1000 && i10 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.f18699b, vVar.f18700c) != 0 && !w1Var.N(vVar, "android.permission.STATUS_BAR_SERVICE") && !w1Var.N(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) w1Var.f18293c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f18669c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f18703a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f18669c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f18703a).putLong(str, j10);
    }

    public void e(String str, a0 a0Var) {
        Rating rating;
        float f7 = a0Var.f18654b;
        int i10 = a0Var.f18653a;
        Integer num = (Integer) i.f18669c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f18703a;
        if (a0Var.f18655c == null) {
            if (a0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        a0Var.f18655c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        a0Var.f18655c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        a0Var.f18655c = Rating.newStarRating(i10, a0Var.a());
                        break;
                    case 6:
                        a0Var.f18655c = Rating.newPercentageRating((i10 == 6 && a0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            a0Var.f18655c = Rating.newUnratedRating(i10);
        }
        rating = a0Var.f18655c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f18669c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f18703a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f18669c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f18703a).putCharSequence(str, charSequence);
    }
}
