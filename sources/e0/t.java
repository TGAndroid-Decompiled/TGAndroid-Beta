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
    public final Context f7829a;
    public final ArrayList f7830b;
    public final ArrayList f7831c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f7832f;
    public PendingIntent f7833g;
    public IconCompat h;
    public int f7834i;
    public int f7835j;
    public boolean f7836k;
    public b0 f7837l;
    public CharSequence f7838m;
    public int f7839n;
    public int f7840o;
    public boolean f7841p;
    public String f7842q;
    public boolean f7843r;
    public String f7844s;
    public boolean f7845t;
    public String f7846u;
    public Bundle v;
    public int f7847w;
    public int f7848x;
    public String f7849y;
    public String f7850z;

    public t(Context context, String str) {
        this.f7830b = new ArrayList();
        this.f7831c = new ArrayList();
        this.d = new ArrayList();
        this.f7836k = true;
        this.f7845t = false;
        this.f7847w = 0;
        this.f7848x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f7829a = context;
        this.f7849y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f7835j = 0;
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
        this.f7830b.add(new k(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        i0 i0Var = new i0(this);
        t tVar = (t) i0Var.d;
        b0 b0Var = tVar.f7837l;
        if (b0Var != null) {
            b0Var.b(i0Var);
        }
        Notification.Builder builder = (Notification.Builder) i0Var.f7785c;
        int i10 = i0Var.f7783a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    i0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    i0.d(build);
                }
            }
        } else {
            builder.setExtras((Bundle) i0Var.e);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    i0.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    i0.d(build);
                }
            }
        }
        if (b0Var != null) {
            tVar.f7837l.getClass();
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
        if (!g0Var.f7776a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g0Var.f7776a.size());
            ArrayList arrayList2 = g0Var.f7776a;
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
                    d = d0.a(icon, kVar.h, kVar.f7799i);
                } else {
                    IconCompat a10 = kVar.a();
                    if (a10 != null && a10.i() == 2) {
                        i10 = a10.g();
                    } else {
                        i10 = 0;
                    }
                    d = c0.d(i10, kVar.h, kVar.f7799i);
                }
                Bundle bundle3 = kVar.f7794a;
                boolean z10 = kVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(kVar.f7794a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i12 >= 24) {
                    e0.a(d, z10);
                }
                if (i12 >= 31) {
                    f0.a(d, false);
                }
                c0.a(d, bundle);
                r0[] r0VarArr = kVar.f7796c;
                if (r0VarArr != null) {
                    for (RemoteInput remoteInput : r0.a(r0VarArr)) {
                        c0.b(d, remoteInput);
                    }
                }
                arrayList.add(c0.c(d));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i13 = g0Var.f7777b;
        if (i13 != 1) {
            bundle2.putInt("flags", i13);
        }
        if (!g0Var.f7778c.isEmpty()) {
            ArrayList arrayList3 = g0Var.f7778c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i14 = g0Var.d;
        if (i14 != 8388613) {
            bundle2.putInt("contentIconGravity", i14);
        }
        int i15 = g0Var.e;
        if (i15 != -1) {
            bundle2.putInt("contentActionIndex", i15);
        }
        int i16 = g0Var.f7779f;
        if (i16 != 80) {
            bundle2.putInt("gravity", i16);
        }
        String str = g0Var.f7780g;
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
        this.f7849y = str;
    }

    public final void f(String str) {
        this.f7832f = d(str);
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
                Resources resources = this.f7829a.getResources();
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
        this.f7845t = true;
    }

    public final void l(String str) {
        this.f7844s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = s.a(s.d(s.c(s.b(), 4), 5));
    }

    public final void n(b0 b0Var) {
        if (this.f7837l != b0Var) {
            this.f7837l = b0Var;
            if (b0Var.f7764a != this) {
                b0Var.f7764a = this;
                n(b0Var);
            }
        }
    }

    public final void o(String str) {
        this.f7838m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public t(Context context) {
        this(context, null);
    }
}
