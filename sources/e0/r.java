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
    public final Context f8263a;
    public final ArrayList f8264b;
    public final ArrayList f8265c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f8266f;
    public PendingIntent f8267g;
    public IconCompat h;
    public int f8268i;
    public int f8269j;
    public boolean f8270k;
    public z f8271l;
    public CharSequence f8272m;
    public int f8273n;
    public int f8274o;
    public boolean f8275p;
    public String f8276q;
    public boolean f8277r;
    public String f8278s;
    public boolean f8279t;
    public String f8280u;
    public Bundle v;
    public int f8281w;
    public int f8282x;
    public String f8283y;
    public String f8284z;

    public r(Context context, String str) {
        this.f8264b = new ArrayList();
        this.f8265c = new ArrayList();
        this.d = new ArrayList();
        this.f8270k = true;
        this.f8279t = false;
        this.f8281w = 0;
        this.f8282x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f8263a = context;
        this.f8283y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f8269j = 0;
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
        this.f8264b.add(new i(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        g0 g0Var = new g0(this);
        r rVar = (r) g0Var.d;
        z zVar = rVar.f8271l;
        if (zVar != null) {
            zVar.b(g0Var);
        }
        Notification.Builder builder = (Notification.Builder) g0Var.f8219c;
        int i10 = g0Var.f8217a;
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
            builder.setExtras((Bundle) g0Var.e);
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
            rVar.f8271l.getClass();
        }
        if (zVar != null && (bundle = build.extras) != null) {
            zVar.a(bundle);
        }
        return build;
    }

    public final void c(e0 e0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!e0Var.f8210a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e0Var.f8210a.size());
            ArrayList arrayList2 = e0Var.f8210a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                i iVar = (i) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = iVar.a();
                Bundle bundle3 = iVar.f8228a;
                Icon icon = null;
                if (a2 != null) {
                    icon = a2.m(null);
                }
                Notification.Action.Builder a10 = b0.a(icon, iVar.h, iVar.f8233i);
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
                p0[] p0VarArr = iVar.f8230c;
                if (p0VarArr != null) {
                    for (RemoteInput remoteInput : p0.a(p0VarArr)) {
                        a0.b(a10, remoteInput);
                    }
                }
                arrayList.add(a0.c(a10));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = e0Var.f8211b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!e0Var.f8212c.isEmpty()) {
            ArrayList arrayList3 = e0Var.f8212c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = e0Var.d;
        if (i13 != 8388613) {
            bundle2.putInt("contentIconGravity", i13);
        }
        int i14 = e0Var.e;
        if (i14 != -1) {
            bundle2.putInt("contentActionIndex", i14);
        }
        int i15 = e0Var.f8213f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = e0Var.f8214g;
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
        this.f8283y = str;
    }

    public final void f(String str) {
        this.f8266f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.e = d(charSequence);
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
                Resources resources = this.f8263a.getResources();
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
        this.f8279t = true;
    }

    public final void l(String str) {
        this.f8278s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = q.a(q.d(q.c(q.b(), 4), 5));
    }

    public final void n(z zVar) {
        if (this.f8271l != zVar) {
            this.f8271l = zVar;
            if (zVar.f8292a != this) {
                zVar.f8292a = this;
                n(zVar);
            }
        }
    }

    public final void o(String str) {
        this.f8272m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public r(Context context) {
        this(context, null);
    }
}
