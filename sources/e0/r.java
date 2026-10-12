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
public final class r {
    public f0.f A;
    public int B;
    public final boolean C;
    public p D;
    public final Notification E;
    public final ArrayList F;
    public final Context f8463a;
    public final ArrayList f8464b;
    public final ArrayList f8465c;
    public final ArrayList d;
    public CharSequence f8466e;
    public CharSequence f8467f;
    public PendingIntent f8468g;
    public IconCompat h;
    public int f8469i;
    public int f8470j;
    public boolean f8471k;
    public z f8472l;
    public CharSequence f8473m;
    public int f8474n;
    public int f8475o;
    public boolean f8476p;
    public String f8477q;
    public boolean f8478r;
    public String f8479s;
    public boolean f8480t;
    public String f8481u;
    public Bundle v;
    public int f8482w;
    public int f8483x;
    public String f8484y;
    public String f8485z;

    public r(Context context, String str) {
        this.f8464b = new ArrayList();
        this.f8465c = new ArrayList();
        this.d = new ArrayList();
        this.f8471k = true;
        this.f8480t = false;
        this.f8482w = 0;
        this.f8483x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f8463a = context;
        this.f8484y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f8470j = 0;
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
        this.f8464b.add(new i(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        g0 g0Var = new g0(this);
        r rVar = (r) g0Var.d;
        z zVar = rVar.f8472l;
        if (zVar != null) {
            zVar.b(g0Var);
        }
        Notification.Builder builder = (Notification.Builder) g0Var.f8411c;
        int i10 = g0Var.f8409a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    g0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    g0.d(build);
                }
            }
        } else {
            builder.setExtras((Bundle) g0Var.f8412e);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    g0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    g0.d(build);
                }
            }
        }
        if (zVar != null) {
            rVar.f8472l.getClass();
        }
        if (zVar != null && (bundle = build.extras) != null) {
            zVar.a(bundle);
        }
        return build;
    }

    public final void c(e0 e0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!e0Var.f8401a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e0Var.f8401a.size());
            ArrayList arrayList2 = e0Var.f8401a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                i iVar = (i) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = iVar.a();
                Bundle bundle3 = iVar.f8422a;
                Icon icon = null;
                if (a2 != null) {
                    icon = a2.m(null);
                }
                Notification.Action.Builder a10 = b0.a(icon, iVar.h, iVar.f8428i);
                boolean z10 = iVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(bundle3);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i11 >= 24) {
                    c0.a(a10, z10);
                }
                if (i11 >= 31) {
                    d0.a(a10, false);
                }
                a0.a(a10, bundle);
                p0[] p0VarArr = iVar.f8424c;
                if (p0VarArr != null) {
                    for (RemoteInput remoteInput : p0.a(p0VarArr)) {
                        a0.b(a10, remoteInput);
                    }
                }
                arrayList.add(a0.c(a10));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = e0Var.f8402b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!e0Var.f8403c.isEmpty()) {
            ArrayList arrayList3 = e0Var.f8403c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = e0Var.d;
        if (i13 != 8388613) {
            bundle2.putInt("contentIconGravity", i13);
        }
        int i14 = e0Var.f8404e;
        if (i14 != -1) {
            bundle2.putInt("contentActionIndex", i14);
        }
        int i15 = e0Var.f8405f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = e0Var.f8406g;
        if (str != null) {
            bundle2.putString("dismissalId", str);
        }
        String str2 = e0Var.h;
        if (str2 != null) {
            bundle2.putString("bridgeTag", str2);
        }
        if (this.v == null) {
            this.v = new Bundle();
        }
        this.v.putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public final void e(String str) {
        this.f8484y = str;
    }

    public final void f(String str) {
        this.f8467f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f8466e = d(charSequence);
    }

    public final void h(int i10, boolean z10) {
        Notification notification = this.E;
        if (z10) {
            notification.flags = i10 | notification.flags;
            return;
        }
        notification.flags = (~i10) & notification.flags;
    }

    public final void i() {
        this.B = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c10;
        if (bitmap == null) {
            c10 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f8463a.getResources();
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
        this.f8480t = true;
    }

    public final void l(String str) {
        this.f8479s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = q.a(q.d(q.c(q.b(), 4), 5));
    }

    public final void n(z zVar) {
        if (this.f8472l != zVar) {
            this.f8472l = zVar;
            if (zVar.f8495a != this) {
                zVar.f8495a = this;
                n(zVar);
            }
        }
    }

    public final void o(String str) {
        this.f8473m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public r(Context context) {
        this(context, null);
    }
}
