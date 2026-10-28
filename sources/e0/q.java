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
    public final Context f9575a;
    public final ArrayList f9576b;
    public final ArrayList f9577c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f9578f;
    public PendingIntent f9579g;
    public IconCompat h;
    public int f9580i;
    public int f9581j;
    public boolean f9582k;
    public y f9583l;
    public CharSequence f9584m;
    public int f9585n;
    public int f9586o;
    public boolean f9587p;
    public String f9588q;
    public boolean f9589r;
    public String f9590s;
    public boolean f9591t;
    public String f9592u;
    public Bundle v;
    public int f9593w;
    public int f9594x;
    public String f9595y;
    public String f9596z;

    public q(Context context, String str) {
        this.f9576b = new ArrayList();
        this.f9577c = new ArrayList();
        this.d = new ArrayList();
        this.f9582k = true;
        this.f9591t = false;
        this.f9593w = 0;
        this.f9594x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.f9575a = context;
        this.f9595y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9581j = 0;
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
        this.f9576b.add(new h(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        e0 e0Var = new e0(this);
        q qVar = (q) e0Var.e;
        y yVar = qVar.f9583l;
        if (yVar != null) {
            yVar.b(e0Var);
        }
        Notification.Builder builder = (Notification.Builder) e0Var.d;
        int i10 = e0Var.f9528b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    e0.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    e0.e(build);
                }
            }
        } else {
            builder.setExtras((Bundle) e0Var.f9530f);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    e0.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    e0.e(build);
                }
            }
        }
        if (yVar != null) {
            qVar.f9583l.getClass();
        }
        if (yVar != null && (bundle = build.extras) != null) {
            yVar.a(bundle);
        }
        return build;
    }

    public final void c(d0 d0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!d0Var.f9521a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d0Var.f9521a.size());
            ArrayList arrayList2 = d0Var.f9521a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                h hVar = (h) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = hVar.a();
                Bundle bundle3 = hVar.f9542a;
                Icon icon = null;
                if (a2 != null) {
                    icon = a2.m(null);
                }
                Notification.Action.Builder a10 = a0.a(icon, hVar.h, hVar.f9547i);
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
                n0[] n0VarArr = hVar.f9544c;
                if (n0VarArr != null) {
                    for (RemoteInput remoteInput : n0.a(n0VarArr)) {
                        z.b(a10, remoteInput);
                    }
                }
                arrayList.add(z.c(a10));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = d0Var.f9522b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!d0Var.f9523c.isEmpty()) {
            ArrayList arrayList3 = d0Var.f9523c;
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
        int i15 = d0Var.f9524f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = d0Var.f9525g;
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
        this.f9595y = str;
    }

    public final void f(String str) {
        this.f9578f = d(str);
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
                Resources resources = this.f9575a.getResources();
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
        this.f9591t = true;
    }

    public final void l(String str) {
        this.f9590s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
    }

    public final void n(y yVar) {
        if (this.f9583l != yVar) {
            this.f9583l = yVar;
            if (yVar.f9604a != this) {
                yVar.f9604a = this;
                n(yVar);
            }
        }
    }

    public final void o(String str) {
        this.f9584m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public q(Context context) {
        this(context, null);
    }
}
