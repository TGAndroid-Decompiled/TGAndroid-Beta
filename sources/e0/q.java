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
    public final Context f9278a;
    public final ArrayList f9279b;
    public final ArrayList f9280c;
    public final ArrayList d;
    public CharSequence f9281e;
    public CharSequence f9282f;
    public PendingIntent f9283g;
    public IconCompat h;
    public int f9284i;
    public int f9285j;
    public boolean f9286k;
    public y f9287l;
    public CharSequence f9288m;
    public int f9289n;
    public int f9290o;
    public boolean f9291p;
    public String f9292q;
    public boolean f9293r;
    public String f9294s;
    public boolean f9295t;
    public String f9296u;
    public Bundle v;
    public int f9297w;
    public int f9298x;
    public String f9299y;
    public String f9300z;

    public q(Context context, String str) {
        this.f9279b = new ArrayList();
        this.f9280c = new ArrayList();
        this.d = new ArrayList();
        this.f9286k = true;
        this.f9295t = false;
        this.f9297w = 0;
        this.f9298x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.f9278a = context;
        this.f9299y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9285j = 0;
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

    public final void a(int i3, PendingIntent pendingIntent, String str) {
        IconCompat iconCompat = null;
        if (i3 != 0) {
            iconCompat = IconCompat.e(null, "", i3);
        }
        this.f9279b.add(new h(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        e0 e0Var = new e0(this);
        q qVar = (q) e0Var.f9227e;
        y yVar = qVar.f9287l;
        if (yVar != null) {
            yVar.b(e0Var);
        }
        Notification.Builder builder = (Notification.Builder) e0Var.d;
        int i3 = e0Var.f9225b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = builder.build();
        } else if (i10 >= 24) {
            build = builder.build();
            if (i3 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i3 == 2) {
                    e0.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i3 == 1) {
                    e0.s(build);
                }
            }
        } else {
            builder.setExtras((Bundle) e0Var.f9228f);
            build = builder.build();
            if (i3 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i3 == 2) {
                    e0.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i3 == 1) {
                    e0.s(build);
                }
            }
        }
        if (yVar != null) {
            qVar.f9287l.getClass();
        }
        if (yVar != null && (bundle = build.extras) != null) {
            yVar.a(bundle);
        }
        return build;
    }

    public final void c(d0 d0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!d0Var.f9217a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d0Var.f9217a.size());
            ArrayList arrayList2 = d0Var.f9217a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                h hVar = (h) obj;
                int i10 = Build.VERSION.SDK_INT;
                IconCompat a10 = hVar.a();
                Bundle bundle3 = hVar.f9241a;
                Icon icon = null;
                if (a10 != null) {
                    icon = a10.m(null);
                }
                Notification.Action.Builder a11 = a0.a(icon, hVar.h, hVar.f9247i);
                boolean z10 = hVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(bundle3);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i10 >= 24) {
                    b0.a(a11, z10);
                }
                if (i10 >= 31) {
                    c0.a(a11, false);
                }
                z.a(a11, bundle);
                m0[] m0VarArr = hVar.f9243c;
                if (m0VarArr != null) {
                    for (RemoteInput remoteInput : m0.a(m0VarArr)) {
                        z.b(a11, remoteInput);
                    }
                }
                arrayList.add(z.c(a11));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i11 = d0Var.f9218b;
        if (i11 != 1) {
            bundle2.putInt("flags", i11);
        }
        if (!d0Var.f9219c.isEmpty()) {
            ArrayList arrayList3 = d0Var.f9219c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i12 = d0Var.d;
        if (i12 != 8388613) {
            bundle2.putInt("contentIconGravity", i12);
        }
        int i13 = d0Var.f9220e;
        if (i13 != -1) {
            bundle2.putInt("contentActionIndex", i13);
        }
        int i14 = d0Var.f9221f;
        if (i14 != 80) {
            bundle2.putInt("gravity", i14);
        }
        String str = d0Var.f9222g;
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
        this.f9299y = str;
    }

    public final void f(String str) {
        this.f9282f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f9281e = d(charSequence);
    }

    public final void h(int i3, boolean z10) {
        Notification notification = this.F;
        if (z10) {
            notification.flags = i3 | notification.flags;
            return;
        }
        notification.flags = (~i3) & notification.flags;
    }

    public final void i() {
        this.C = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c2;
        if (bitmap == null) {
            c2 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f9278a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165308);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165307);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c2 = IconCompat.c(bitmap);
        }
        this.h = c2;
    }

    public final void k() {
        this.f9295t = true;
    }

    public final void l(String str) {
        this.f9294s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
    }

    public final void n(y yVar) {
        if (this.f9287l != yVar) {
            this.f9287l = yVar;
            if (yVar.f9310a != this) {
                yVar.f9310a = this;
                n(yVar);
            }
        }
    }

    public final void o(String str) {
        this.f9288m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public q(Context context) {
        this(context, null);
    }
}
