package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class q {
    public f0.g A;
    public long B;
    public int C;
    public final boolean D;
    public o E;
    public final Notification F;
    public final ArrayList G;
    public final Context f10099a;
    public final ArrayList f10100b;
    public final ArrayList f10101c;
    public final ArrayList d;
    public CharSequence f10102e;
    public CharSequence f10103f;
    public PendingIntent f10104g;
    public IconCompat h;
    public int f10105i;
    public int f10106j;
    public boolean f10107k;
    public y f10108l;
    public CharSequence f10109m;
    public int f10110n;
    public int f10111o;
    public boolean f10112p;
    public String f10113q;
    public boolean f10114r;
    public String f10115s;
    public boolean f10116t;
    public String f10117u;
    public Bundle v;
    public int f10118w;
    public int f10119x;
    public String f10120y;
    public String f10121z;

    public q(Context context, String str) {
        this.f10100b = new ArrayList();
        this.f10101c = new ArrayList();
        this.d = new ArrayList();
        this.f10107k = true;
        this.f10116t = false;
        this.f10118w = 0;
        this.f10119x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.f10099a = context;
        this.f10120y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f10106j = 0;
        this.G = new ArrayList();
        this.D = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i7, PendingIntent pendingIntent, String str) {
        IconCompat iconCompat = null;
        if (i7 != 0) {
            iconCompat = IconCompat.e(null, "", i7);
        }
        this.f10100b.add(new h(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        a4.k kVar = new a4.k(this);
        q qVar = (q) kVar.f193e;
        y yVar = qVar.f10108l;
        if (yVar != null) {
            yVar.b(kVar);
        }
        Notification.Builder builder = (Notification.Builder) kVar.d;
        int i7 = kVar.f191b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = builder.build();
        } else if (i10 >= 24) {
            build = builder.build();
            if (i7 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i7 == 2) {
                    a4.k.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i7 == 1) {
                    a4.k.s(build);
                }
            }
        } else {
            builder.setExtras((Bundle) kVar.f194f);
            build = builder.build();
            if (i7 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i7 == 2) {
                    a4.k.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i7 == 1) {
                    a4.k.s(build);
                }
            }
        }
        if (yVar != null) {
            qVar.f10108l.getClass();
        }
        if (yVar != null && (bundle = build.extras) != null) {
            yVar.a(bundle);
        }
        return build;
    }

    public final void c(d0 d0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!d0Var.f10043a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d0Var.f10043a.size());
            ArrayList arrayList2 = d0Var.f10043a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                h hVar = (h) obj;
                int i10 = Build.VERSION.SDK_INT;
                IconCompat a10 = hVar.a();
                Bundle bundle3 = hVar.f10066a;
                Icon icon = null;
                if (a10 != null) {
                    icon = a10.m(null);
                }
                Notification.Action.Builder a11 = a0.a(icon, hVar.h, hVar.f10072i);
                boolean z9 = hVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(bundle3);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z9);
                if (i10 >= 24) {
                    b0.a(a11, z9);
                }
                if (i10 >= 31) {
                    c0.a(a11, false);
                }
                z.a(a11, bundle);
                l0[] l0VarArr = hVar.f10068c;
                if (l0VarArr != null) {
                    for (RemoteInput remoteInput : l0.a(l0VarArr)) {
                        z.b(a11, remoteInput);
                    }
                }
                arrayList.add(z.c(a11));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i11 = d0Var.f10044b;
        if (i11 != 1) {
            bundle2.putInt("flags", i11);
        }
        if (!d0Var.f10045c.isEmpty()) {
            ArrayList arrayList3 = d0Var.f10045c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i12 = d0Var.d;
        if (i12 != 8388613) {
            bundle2.putInt("contentIconGravity", i12);
        }
        int i13 = d0Var.f10046e;
        if (i13 != -1) {
            bundle2.putInt("contentActionIndex", i13);
        }
        int i14 = d0Var.f10047f;
        if (i14 != 80) {
            bundle2.putInt("gravity", i14);
        }
        String str = d0Var.f10048g;
        if (str != null) {
            bundle2.putString("dismissalId", str);
        }
        String str2 = d0Var.h;
        if (str2 != null) {
            bundle2.putString("bridgeTag", str2);
        }
        if (this.v == null) {
            this.v = new Bundle();
        }
        this.v.putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public final void e(String str) {
        this.f10120y = str;
    }

    public final void f(String str) {
        this.f10103f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f10102e = d(charSequence);
    }

    public final void h(int i7, boolean z9) {
        Notification notification = this.F;
        if (z9) {
            notification.flags = i7 | notification.flags;
            return;
        }
        notification.flags = (~i7) & notification.flags;
    }

    public final void i() {
        this.C = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c10;
        if (bitmap == null) {
            c10 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f10099a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165308);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165307);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c10 = IconCompat.c(bitmap);
        }
        this.h = c10;
    }

    public final void k() {
        this.f10116t = true;
    }

    public final void l(String str) {
        this.f10115s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
    }

    public final void n(y yVar) {
        if (this.f10108l != yVar) {
            this.f10108l = yVar;
            if (yVar.f10131a != this) {
                yVar.f10131a = this;
                n(yVar);
            }
        }
    }

    public final void o(String str) {
        this.f10109m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public q(Context context) {
        this(context, null);
    }
}
