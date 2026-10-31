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
    public long B;
    public int C;
    public final boolean D;
    public p E;
    public final Notification F;
    public final ArrayList G;
    public final Context f6057a;
    public final ArrayList f6058b;
    public final ArrayList f6059c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f6060f;
    public PendingIntent f6061g;
    public IconCompat h;
    public int f6062i;
    public int f6063j;
    public boolean f6064k;
    public z f6065l;
    public CharSequence f6066m;
    public int f6067n;
    public int f6068o;
    public boolean f6069p;
    public String f6070q;
    public boolean f6071r;
    public String f6072s;
    public boolean f6073t;
    public String f6074u;
    public Bundle v;
    public int f6075w;
    public int f6076x;
    public String f6077y;
    public String f6078z;

    public r(Context context, String str) {
        this.f6058b = new ArrayList();
        this.f6059c = new ArrayList();
        this.d = new ArrayList();
        this.f6064k = true;
        this.f6073t = false;
        this.f6075w = 0;
        this.f6076x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.f6057a = context;
        this.f6077y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f6063j = 0;
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
        this.f6058b.add(new i(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        cc.f fVar = new cc.f(this);
        r rVar = (r) fVar.e;
        z zVar = rVar.f6065l;
        if (zVar != null) {
            zVar.b(fVar);
        }
        Notification.Builder builder = (Notification.Builder) fVar.d;
        int i10 = fVar.f4116b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    cc.f.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    cc.f.e(build);
                }
            }
        } else {
            builder.setExtras((Bundle) fVar.f4118f);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    cc.f.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    cc.f.e(build);
                }
            }
        }
        if (zVar != null) {
            rVar.f6065l.getClass();
        }
        if (zVar != null && (bundle = build.extras) != null) {
            zVar.a(bundle);
        }
        return build;
    }

    public final void c(e0 e0Var) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (!e0Var.f6008a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e0Var.f6008a.size());
            ArrayList arrayList2 = e0Var.f6008a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                i iVar = (i) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = iVar.a();
                Bundle bundle3 = iVar.f6026a;
                Icon icon = null;
                if (a2 != null) {
                    icon = a2.m(null);
                }
                Notification.Action.Builder a10 = b0.a(icon, iVar.h, iVar.f6031i);
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
                n0[] n0VarArr = iVar.f6028c;
                if (n0VarArr != null) {
                    for (RemoteInput remoteInput : n0.a(n0VarArr)) {
                        a0.b(a10, remoteInput);
                    }
                }
                arrayList.add(a0.c(a10));
            }
            bundle2.putParcelableArrayList("actions", arrayList);
        }
        int i12 = e0Var.f6009b;
        if (i12 != 1) {
            bundle2.putInt("flags", i12);
        }
        if (!e0Var.f6010c.isEmpty()) {
            ArrayList arrayList3 = e0Var.f6010c;
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
        int i15 = e0Var.f6011f;
        if (i15 != 80) {
            bundle2.putInt("gravity", i15);
        }
        String str = e0Var.f6012g;
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
        this.f6077y = str;
    }

    public final void f(String str) {
        this.f6060f = d(str);
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
                Resources resources = this.f6057a.getResources();
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
        this.f6073t = true;
    }

    public final void l(String str) {
        this.f6072s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = q.a(q.d(q.c(q.b(), 4), 5));
    }

    public final void n(z zVar) {
        if (this.f6065l != zVar) {
            this.f6065l = zVar;
            if (zVar.f6086a != this) {
                zVar.f6086a = this;
                n(zVar);
            }
        }
    }

    public final void o(String str) {
        this.f6066m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public r(Context context) {
        this(context, null);
    }
}
