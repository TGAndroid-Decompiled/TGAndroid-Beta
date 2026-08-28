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
    public final Context f4761a;
    public final ArrayList f4762b;
    public final ArrayList f4763c;
    public final ArrayList d;
    public CharSequence f4764e;
    public CharSequence f4765f;
    public PendingIntent f4766g;
    public IconCompat h;
    public int f4767i;
    public int f4768j;
    public boolean f4769k;
    public b0 f4770l;
    public CharSequence f4771m;
    public int f4772n;
    public int f4773o;
    public boolean f4774p;
    public String f4775q;
    public boolean f4776r;
    public String f4777s;
    public boolean f4778t;
    public String f4779u;
    public Bundle v;
    public int f4780w;
    public int f4781x;
    public String f4782y;
    public String f4783z;

    public t(Context context, String str) {
        this.f4762b = new ArrayList();
        this.f4763c = new ArrayList();
        this.d = new ArrayList();
        this.f4769k = true;
        this.f4778t = false;
        this.f4780w = 0;
        this.f4781x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f4761a = context;
        this.f4782y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f4768j = 0;
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

    public final void a(int i9, String str, PendingIntent pendingIntent) {
        IconCompat iconCompat = null;
        if (i9 != 0) {
            iconCompat = IconCompat.e(null, "", i9);
        }
        this.f4762b.add(new k(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        i0 i0Var = new i0(this);
        t tVar = (t) i0Var.d;
        b0 b0Var = tVar.f4770l;
        if (b0Var != null) {
            b0Var.b(i0Var);
        }
        Notification.Builder builder = (Notification.Builder) i0Var.f4709c;
        int i9 = i0Var.f4707a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = builder.build();
        } else if (i10 >= 24) {
            build = builder.build();
            if (i9 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i9 == 2) {
                    i0.b(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i9 == 1) {
                    i0.b(build);
                }
            }
        } else {
            builder.setExtras((Bundle) i0Var.f4710e);
            build = builder.build();
            if (i9 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i9 == 2) {
                    i0.b(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i9 == 1) {
                    i0.b(build);
                }
            }
        }
        if (b0Var != null) {
            tVar.f4770l.getClass();
        }
        if (b0Var != null && (bundle = build.extras) != null) {
            b0Var.a(bundle);
        }
        return build;
    }

    public final void c(g0 g0Var) {
        int i9;
        Notification.Action.Builder d;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!g0Var.f4699a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g0Var.f4699a.size());
            ArrayList arrayList2 = g0Var.f4699a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                k kVar = (k) obj;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    IconCompat a2 = kVar.a();
                    Icon icon = null;
                    if (a2 != null) {
                        icon = a2.m(null);
                    }
                    d = d0.a(icon, kVar.h, kVar.f4726i);
                } else {
                    IconCompat a3 = kVar.a();
                    if (a3 != null && a3.i() == 2) {
                        i9 = a3.g();
                    } else {
                        i9 = 0;
                    }
                    d = c0.d(i9, kVar.h, kVar.f4726i);
                }
                Bundle bundle3 = kVar.f4720a;
                boolean z10 = kVar.d;
                if (bundle3 != null) {
                    bundle = new Bundle(kVar.f4720a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i11 >= 24) {
                    e0.a(d, z10);
                }
                if (i11 >= 31) {
                    f0.a(d, false);
                }
                c0.a(d, bundle);
                r0[] r0VarArr = kVar.f4722c;
                if (r0VarArr != null) {
                    for (RemoteInput remoteInput : r0.a(r0VarArr)) {
                        c0.b(d, remoteInput);
                    }
                }
                arrayList.add(c0.c(d));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = g0Var.f4700b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!g0Var.f4701c.isEmpty()) {
            ArrayList arrayList3 = g0Var.f4701c;
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = g0Var.d;
        if (i13 != 8388613) {
            bundle2.putInt("contentIconGravity", i13);
        }
        int i14 = g0Var.f4702e;
        if (i14 != -1) {
            bundle2.putInt("contentActionIndex", i14);
        }
        int i15 = g0Var.f4703f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = g0Var.f4704g;
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
        this.f4782y = str;
    }

    public final void f(String str) {
        this.f4765f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f4764e = d(charSequence);
    }

    public final void h(int i9, boolean z10) {
        Notification notification = this.E;
        if (z10) {
            notification.flags = i9 | notification.flags;
            return;
        }
        notification.flags = (~i9) & notification.flags;
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
                Resources resources = this.f4761a.getResources();
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
        this.f4778t = true;
    }

    public final void l(String str) {
        this.f4777s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = s.a(s.d(s.c(s.b(), 4), 5));
    }

    public final void n(b0 b0Var) {
        if (this.f4770l != b0Var) {
            this.f4770l = b0Var;
            if (b0Var.f4685a != this) {
                b0Var.f4685a = this;
                n(b0Var);
            }
        }
    }

    public final void o(String str) {
        this.f4771m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public t(Context context) {
        this(context, null);
    }
}
