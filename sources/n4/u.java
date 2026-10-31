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
public final class u {
    public static final Object f13532b = new Object();
    public static volatile u f13533c;
    public Object f13534a;

    public static u a(Context context) {
        u uVar;
        synchronized (f13532b) {
            try {
                if (f13533c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    m4.c cVar = new m4.c((char) 0, 4);
                    cVar.f12705b = applicationContext;
                    cVar.f12706c = applicationContext.getContentResolver();
                    obj.f13534a = cVar;
                    f13533c = obj;
                }
                uVar = f13533c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        m4.c cVar = (m4.c) this.f13534a;
        t tVar = rVar.f13528a;
        Context context = (Context) cVar.f12705b;
        int i10 = tVar.f13531c;
        String str = tVar.f13529a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i11 < 28) {
                        i10 = applicationInfo.uid;
                    }
                    if (i10 != 1000 && i10 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar.f13530b, tVar.f13531c) != 0 && !cVar.N(tVar, "android.permission.STATUS_BAR_SERVICE") && !cVar.N(tVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) cVar.f12706c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f13505c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f13534a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f13505c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f13534a).putLong(str, j10);
    }

    public void e(String str, x xVar) {
        Rating rating;
        float f7 = xVar.f13548b;
        int i10 = xVar.f13547a;
        Integer num = (Integer) i.f13505c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f13534a;
        if (xVar.f13549c == null) {
            if (xVar.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        xVar.f13549c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        xVar.f13549c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        xVar.f13549c = Rating.newStarRating(i10, xVar.a());
                        break;
                    case 6:
                        xVar.f13549c = Rating.newPercentageRating((i10 == 6 && xVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            xVar.f13549c = Rating.newUnratedRating(i10);
        }
        rating = xVar.f13549c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f13505c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f13534a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f13505c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f13534a).putCharSequence(str, charSequence);
    }
}
