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
public final class t {
    public f0.h A;
    public int B;
    public final boolean C;
    public r D;
    public final Notification E;
    public final ArrayList F;
    public final Context f4847a;
    public final ArrayList f4848b;
    public final ArrayList f4849c;
    public final ArrayList d;
    public CharSequence f4850e;
    public CharSequence f4851f;
    public PendingIntent f4852g;
    public IconCompat h;
    public int f4853i;
    public int f4854j;
    public boolean f4855k;
    public b0 f4856l;
    public CharSequence f4857m;
    public int f4858n;
    public int f4859o;
    public boolean f4860p;
    public String f4861q;
    public boolean f4862r;
    public String f4863s;
    public boolean f4864t;
    public String f4865u;
    public Bundle v;
    public int f4866w;
    public int f4867x;
    public String f4868y;
    public String f4869z;

    public t(Context context, String str) {
        this.f4848b = new ArrayList();
        this.f4849c = new ArrayList();
        this.d = new ArrayList();
        this.f4855k = true;
        this.f4864t = false;
        this.f4866w = 0;
        this.f4867x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f4847a = context;
        this.f4868y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f4854j = 0;
        this.F = new ArrayList();
        this.C = true;
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
        this.f4848b.add(new k(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        a4.k kVar = new a4.k(this);
        t tVar = (t) kVar.d;
        b0 b0Var = tVar.f4856l;
        if (b0Var != null) {
            b0Var.b(kVar);
        }
        Notification.Builder builder = (Notification.Builder) kVar.f94c;
        int i10 = kVar.f92a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    a4.k.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    a4.k.d(build);
                }
            }
        } else {
            builder.setExtras((Bundle) kVar.f95e);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    a4.k.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    a4.k.d(build);
                }
            }
        }
        if (b0Var != null) {
            tVar.f4856l.getClass();
        }
        if (b0Var != null && (bundle = build.extras) != null) {
            b0Var.a(bundle);
        }
        return build;
    }

    public final void c(g0 g0Var) {
        int i10;
        Notification.Action.Builder d;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!g0Var.f4789a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g0Var.f4789a.size());
            ArrayList arrayList2 = g0Var.f4789a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                k kVar = (k) obj;
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23) {
                    IconCompat a2 = kVar.a();
                    Icon icon = null;
                    if (a2 != null) {
                        icon = a2.m(null);
                    }
                    d = d0.a(icon, kVar.h, kVar.f4814i);
                } else {
                    IconCompat a10 = kVar.a();
                    if (a10 != null && a10.i() == 2) {
                        i10 = a10.g();
                    } else {
                        i10 = 0;
                    }
                    d = c0.d(i10, kVar.h, kVar.f4814i);
                }
                Bundle bundle3 = kVar.f4808a;
                boolean z4 = kVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(kVar.f4808a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z4);
                if (i12 >= 24) {
                    e0.a(d, z4);
                }
                if (i12 >= 31) {
                    f0.a(d, false);
                }
                c0.a(d, bundle);
                q0[] q0VarArr = kVar.f4810c;
                if (q0VarArr != null) {
                    for (RemoteInput remoteInput : q0.a(q0VarArr)) {
                        c0.b(d, remoteInput);
                    }
                }
                arrayList.add(c0.c(d));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i13 = g0Var.f4790b;
        if (i13 != 1) {
            bundle2.putInt("flags", i13);
        }
        if (!g0Var.f4791c.isEmpty()) {
            ArrayList arrayList3 = g0Var.f4791c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i14 = g0Var.d;
        if (i14 != 8388613) {
            bundle2.putInt("contentIconGravity", i14);
        }
        int i15 = g0Var.f4792e;
        if (i15 != -1) {
            bundle2.putInt("contentActionIndex", i15);
        }
        int i16 = g0Var.f4793f;
        if (i16 != 80) {
            bundle2.putInt("gravity", i16);
        }
        String str = g0Var.f4794g;
        if (str != null) {
            bundle2.putString("dismissalId", str);
        }
        String str2 = g0Var.h;
        if (str2 != null) {
            bundle2.putString("bridgeTag", str2);
        }
        if (this.v == null) {
            this.v = new Bundle();
        }
        this.v.putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public final void e(String str) {
        this.f4868y = str;
    }

    public final void f(String str) {
        this.f4851f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f4850e = d(charSequence);
    }

    public final void h(int i10, boolean z4) {
        Notification notification = this.E;
        if (z4) {
            notification.flags = i10 | notification.flags;
            return;
        }
        notification.flags = (~i10) & notification.flags;
    }

    public final void i() {
        this.B = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c3;
        if (bitmap == null) {
            c3 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f4847a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165308);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165307);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c3 = IconCompat.c(bitmap);
        }
        this.h = c3;
    }

    public final void k() {
        this.f4864t = true;
    }

    public final void l(String str) {
        this.f4863s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = s.a(s.d(s.c(s.b(), 4), 5));
    }

    public final void n(b0 b0Var) {
        if (this.f4856l != b0Var) {
            this.f4856l = b0Var;
            if (b0Var.f4775a != this) {
                b0Var.f4775a = this;
                n(b0Var);
            }
        }
    }

    public final void o(String str) {
        this.f4857m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public t(Context context) {
        this(context, null);
    }
}
