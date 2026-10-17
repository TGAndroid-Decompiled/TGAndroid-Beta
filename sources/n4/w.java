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
    public static final Object f17127b = new Object();
    public static volatile w f17128c;
    public Object f17129a;

    public static w a(Context context) {
        w wVar;
        synchronized (f17127b) {
            try {
                if (f17128c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    mi.q qVar = new mi.q(2, (byte) 0);
                    qVar.f16967b = applicationContext;
                    qVar.f16968c = applicationContext.getContentResolver();
                    obj.f17129a = qVar;
                    f17128c = obj;
                }
                wVar = f17128c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public boolean b(t tVar) {
        mi.q qVar = (mi.q) this.f17129a;
        v vVar = tVar.f17123a;
        Context context = (Context) qVar.f16967b;
        int i10 = vVar.f17126c;
        String str = vVar.f17124a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i11 < 28) {
                        i10 = applicationInfo.uid;
                    }
                    if (i10 != 1000 && i10 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", vVar.f17125b, vVar.f17126c) != 0 && !qVar.V(vVar, "android.permission.STATUS_BAR_SERVICE") && !qVar.V(vVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) qVar.f16968c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f17095c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f17129a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f17095c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f17129a).putLong(str, j10);
    }

    public void e(String str, z zVar) {
        Rating rating;
        float f7 = zVar.f17142b;
        int i10 = zVar.f17141a;
        Integer num = (Integer) i.f17095c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f17129a;
        if (zVar.f17143c == null) {
            if (zVar.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        zVar.f17143c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        zVar.f17143c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        zVar.f17143c = Rating.newStarRating(i10, zVar.a());
                        break;
                    case 6:
                        zVar.f17143c = Rating.newPercentageRating((i10 == 6 && zVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            zVar.f17143c = Rating.newUnratedRating(i10);
        }
        rating = zVar.f17143c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f17095c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f17129a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f17095c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f17129a).putCharSequence(str, charSequence);
    }
}
