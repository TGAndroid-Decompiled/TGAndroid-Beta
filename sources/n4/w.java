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
public final class w {
    public static final Object f15751b = new Object();
    public static volatile w f15752c;
    public Object f15753a;

    public static w a(Context context) {
        w wVar;
        synchronized (f15751b) {
            try {
                if (f15752c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    m2.t tVar = new m2.t(4, (byte) 0);
                    tVar.f15110b = applicationContext;
                    tVar.f15111c = applicationContext.getContentResolver();
                    obj.f15753a = tVar;
                    f15752c = obj;
                }
                wVar = f15752c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public boolean b(t tVar) {
        m2.t tVar2 = (m2.t) this.f15753a;
        v vVar = tVar.f15747a;
        Context context = (Context) tVar2.f15110b;
        int i10 = vVar.f15750c;
        String str = vVar.f15748a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i11 < 28) {
                        i10 = applicationInfo.uid;
                    }
                    if (i10 != 1000 && i10 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.f15749b, vVar.f15750c) != 0 && !tVar2.G(vVar, "android.permission.STATUS_BAR_SERVICE") && !tVar2.G(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) tVar2.f15111c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f15719c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f15753a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f15719c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f15753a).putLong(str, j10);
    }

    public void e(String str, z zVar) {
        Rating rating;
        float f7 = zVar.f15766b;
        int i10 = zVar.f15765a;
        Integer num = (Integer) i.f15719c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f15753a;
        if (zVar.f15767c == null) {
            if (zVar.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        zVar.f15767c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        zVar.f15767c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        zVar.f15767c = Rating.newStarRating(i10, zVar.a());
                        break;
                    case 6:
                        zVar.f15767c = Rating.newPercentageRating((i10 == 6 && zVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            zVar.f15767c = Rating.newUnratedRating(i10);
        }
        rating = zVar.f15767c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f15719c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f15753a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f15719c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f15753a).putCharSequence(str, charSequence);
    }
}
