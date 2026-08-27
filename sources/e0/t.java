package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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

    public final Context f5118a;

    public final ArrayList f5119b;

    public final ArrayList f5120c;
    public final ArrayList d;

    public CharSequence f5121e;

    public CharSequence f5122f;

    public PendingIntent f5123g;
    public IconCompat h;

    public int f5124i;

    public int f5125j;

    public boolean f5126k;

    public b0 f5127l;

    public CharSequence f5128m;

    public int f5129n;

    public int f5130o;

    public boolean f5131p;

    public String f5132q;

    public boolean f5133r;

    public String f5134s;

    public boolean f5135t;

    public String f5136u;
    public Bundle v;

    public int f5137w;

    public int f5138x;

    public String f5139y;

    public String f5140z;

    public t(Context context, String str) {
        this.f5119b = new ArrayList();
        this.f5120c = new ArrayList();
        this.d = new ArrayList();
        this.f5126k = true;
        this.f5135t = false;
        this.f5137w = 0;
        this.f5138x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.f5118a = context;
        this.f5139y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5125j = 0;
        this.F = new ArrayList();
        this.C = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i10, String str, PendingIntent pendingIntent) {
        this.f5119b.add(new k(i10 != 0 ? IconCompat.e(null, "", i10) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification notificationBuild;
        Bundle bundle;
        i0 i0Var = new i0(this);
        t tVar = (t) i0Var.d;
        b0 b0Var = tVar.f5127l;
        if (b0Var != null) {
            b0Var.b(i0Var);
        }
        Notification.Builder builder = (Notification.Builder) i0Var.f5066c;
        int i10 = i0Var.f5064a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            notificationBuild = builder.build();
        } else if (i11 >= 24) {
            notificationBuild = builder.build();
            if (i10 != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i10 == 2) {
                    i0.d(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i10 == 1) {
                    i0.d(notificationBuild);
                }
            }
        } else {
            builder.setExtras((Bundle) i0Var.f5067e);
            notificationBuild = builder.build();
            if (i10 != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i10 == 2) {
                    i0.d(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i10 == 1) {
                    i0.d(notificationBuild);
                }
            }
        }
        if (b0Var != null) {
            tVar.f5127l.getClass();
        }
        if (b0Var != null && (bundle = notificationBuild.extras) != null) {
            b0Var.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(g0 g0Var) {
        Notification.Action.Builder builderD;
        Bundle bundle = new Bundle();
        if (!g0Var.f5056a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g0Var.f5056a.size());
            ArrayList arrayList2 = g0Var.f5056a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                k kVar = (k) obj;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    IconCompat iconCompatA = kVar.a();
                    builderD = d0.a(iconCompatA != null ? iconCompatA.m(null) : null, kVar.h, kVar.f5083i);
                } else {
                    IconCompat iconCompatA2 = kVar.a();
                    builderD = c0.d((iconCompatA2 == null || iconCompatA2.i() != 2) ? 0 : iconCompatA2.g(), kVar.h, kVar.f5083i);
                }
                Bundle bundle2 = kVar.f5077a;
                boolean z10 = kVar.d;
                Bundle bundle3 = bundle2 != null ? new Bundle(kVar.f5077a) : new Bundle();
                bundle3.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i11 >= 24) {
                    e0.a(builderD, z10);
                }
                if (i11 >= 31) {
                    f0.a(builderD, false);
                }
                c0.a(builderD, bundle3);
                r0[] r0VarArr = kVar.f5079c;
                if (r0VarArr != null) {
                    for (RemoteInput remoteInput : r0.a(r0VarArr)) {
                        c0.b(builderD, remoteInput);
                    }
                }
                arrayList.add(c0.c(builderD));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        int i12 = g0Var.f5057b;
        if (i12 != 1) {
            bundle.putInt("flags", i12);
        }
        if (!g0Var.f5058c.isEmpty()) {
            ArrayList arrayList3 = g0Var.f5058c;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = g0Var.d;
        if (i13 != 8388613) {
            bundle.putInt("contentIconGravity", i13);
        }
        int i14 = g0Var.f5059e;
        if (i14 != -1) {
            bundle.putInt("contentActionIndex", i14);
        }
        int i15 = g0Var.f5060f;
        if (i15 != 80) {
            bundle.putInt("gravity", i15);
        }
        String str = g0Var.f5061g;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = g0Var.h;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        if (this.v == null) {
            this.v = new Bundle();
        }
        this.v.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final void e(String str) {
        this.f5139y = str;
    }

    public final void f(String str) {
        this.f5122f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.f5121e = d(charSequence);
    }

    public final void h(int i10, boolean z10) {
        Notification notification = this.E;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void i() {
        this.B = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat iconCompatC;
        if (bitmap == null) {
            iconCompatC = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f5118a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165308);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165307);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatC = IconCompat.c(bitmap);
        }
        this.h = iconCompatC;
    }

    public final void k() {
        this.f5135t = true;
    }

    public final void l(String str) {
        this.f5134s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = s.a(s.d(s.c(s.b(), 4), 5));
    }

    public final void n(b0 b0Var) {
        if (this.f5127l != b0Var) {
            this.f5127l = b0Var;
            if (b0Var.f5042a != this) {
                b0Var.f5042a = this;
                n(b0Var);
            }
        }
    }

    public final void o(String str) {
        this.f5128m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public t(Context context) {
        this(context, null);
    }
}
