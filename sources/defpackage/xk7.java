package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class xk7 {
    public ub6 A;
    public long B;
    public boolean C;
    public final boolean D;
    public vk7 E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public gl7 l;
    public CharSequence m;
    public byte n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public Bundle v;
    public int w;
    public int x;
    public String y;
    public String z;

    public xk7(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.t = false;
        this.w = 0;
        this.x = 0;
        this.C = false;
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.G = new ArrayList();
        this.D = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        IconCompat iconCompat = null;
        if (i != 0) {
            iconCompat = IconCompat.e(null, "", i);
        }
        this.b.add(new mk7(iconCompat, str, pendingIntent, new Bundle(), null, true, 0, true));
    }

    public final android.app.Notification b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk7.b():android.app.Notification");
    }

    public final void d(String str) {
        this.f = c(str);
    }

    public final void e(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void f(int i, boolean z) {
        Notification notification = this.F;
        if (z) {
            notification.flags |= i;
        } else {
            notification.flags &= ~i;
        }
    }

    public final void g(Bitmap bitmap) {
        IconCompat c;
        if (bitmap == null) {
            c = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165308);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165307);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c = IconCompat.c(bitmap);
        }
        this.h = c;
    }

    public final void h(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = wk7.a(wk7.d(wk7.c(wk7.b(), 4), 5));
    }

    public final void i(gl7 gl7Var) {
        if (this.l != gl7Var) {
            this.l = gl7Var;
            if (gl7Var.a != this) {
                gl7Var.a = this;
                i(gl7Var);
            }
        }
    }

    public final void j(String str) {
        this.m = c(str);
    }

    public final void k(String str) {
        this.F.tickerText = c(str);
    }

    public xk7(Context context) {
        this(context, null);
    }
}
