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
    public f0.f A;
    public long B;
    public int C;
    public final boolean D;
    public o E;
    public final Notification F;
    public final ArrayList G;
    public final Context f8148a;
    public final ArrayList f8149b;
    public final ArrayList f8150c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f8151f;
    public PendingIntent f8152g;
    public IconCompat h;
    public int f8153i;
    public int f8154j;
    public boolean f8155k;
    public y f8156l;
    public CharSequence f8157m;
    public int f8158n;
    public int f8159o;
    public boolean f8160p;
    public String f8161q;
    public boolean f8162r;
    public String f8163s;
    public boolean f8164t;
    public String f8165u;
    public Bundle v;
    public int f8166w;
    public int f8167x;
    public String f8168y;
    public String f8169z;

    public q(Context context, String str) {
        this.f8149b = new ArrayList();
        this.f8150c = new ArrayList();
        this.d = new ArrayList();
        this.f8155k = true;
        this.f8164t = false;
        this.f8166w = 0;
        this.f8167x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.f8148a = context;
        this.f8168y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f8154j = 0;
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

    public final void a(int i10, String str, PendingIntent pendingIntent) {
        IconCompat iconCompat = null;
        if (i10 != 0) {
            iconCompat = IconCompat.e(null, "", i10);
        }
        this.f8149b.add(new h(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        f0 f0Var = new f0(this);
        q qVar = (q) f0Var.e;
        y yVar = qVar.f8156l;
        if (yVar != null) {
            yVar.b(f0Var);
        }
        Notification.Builder builder = (Notification.Builder) f0Var.d;
        int i10 = f0Var.f8102b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    f0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    f0.d(build);
                }
            }
        } else {
            builder.setExtras((Bundle) f0Var.f8104f);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    f0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    f0.d(build);
                }
            }
        }
        if (yVar != null) {
            qVar.f8156l.getClass();
        }
        if (yVar != null && (bundle = build.extras) != null) {
            yVar.a(bundle);
        }
        return build;
    }

    public final void c(d0 d0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!d0Var.f8094a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d0Var.f8094a.size());
            ArrayList arrayList2 = d0Var.f8094a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                h hVar = (h) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = hVar.a();
                Bundle bundle3 = hVar.f8113a;
                Icon icon = null;
                if (a2 != null) {
                    icon = a2.m(null);
                }
                Notification.Action.Builder a10 = a0.a(icon, hVar.h, hVar.f8118i);
                boolean z10 = hVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(bundle3);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i11 >= 24) {
                    b0.a(a10, z10);
                }
                if (i11 >= 31) {
                    c0.a(a10, false);
                }
                z.a(a10, bundle);
                o0[] o0VarArr = hVar.f8115c;
                if (o0VarArr != null) {
                    for (RemoteInput remoteInput : o0.a(o0VarArr)) {
                        z.b(a10, remoteInput);
                    }
                }
                arrayList.add(z.c(a10));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = d0Var.f8095b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!d0Var.f8096c.isEmpty()) {
            ArrayList arrayList3 = d0Var.f8096c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = d0Var.d;
        if (i13 != 8388613) {
            bundle2.putInt("contentIconGravity", i13);
        }
        int i14 = d0Var.e;
        if (i14 != -1) {
            bundle2.putInt("contentActionIndex", i14);
        }
        int i15 = d0Var.f8097f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = d0Var.f8098g;
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
        this.f8168y = str;
    }

    public final void f(String str) {
        this.f8151f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void h(int i10, boolean z10) {
        Notification notification = this.F;
        if (z10) {
            notification.flags = i10 | notification.flags;
            return;
        }
        notification.flags = (~i10) & notification.flags;
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
                Resources resources = this.f8148a.getResources();
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
        this.f8164t = true;
    }

    public final void l(String str) {
        this.f8163s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
    }

    public final void n(y yVar) {
        if (this.f8156l != yVar) {
            this.f8156l = yVar;
            if (yVar.f8177a != this) {
                yVar.f8177a = this;
                n(yVar);
            }
        }
    }

    public final void o(String str) {
        this.f8157m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public q(Context context) {
        this(context, null);
    }
}
