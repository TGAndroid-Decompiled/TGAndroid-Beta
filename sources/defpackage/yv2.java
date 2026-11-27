package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class yv2 implements xv2, aw2 {
    public static yv2 g;
    public final byte a = 0;
    public Object b;
    public byte c;
    public boolean d;
    public Object e;
    public Object f;

    public yv2(yv2 yv2Var) {
        ClipData clipData = (ClipData) yv2Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = yv2Var.c;
        if (b >= 0) {
            if (b <= 5) {
                this.c = b;
                this.d = yv2Var.d;
                this.e = (Uri) yv2Var.e;
                this.f = (Bundle) yv2Var.f;
                return;
            }
            Locale locale = Locale.US;
            lq5.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        Locale locale2 = Locale.US;
        lq5.j("source is out of range of [0, 5] (too low)");
        throw null;
    }

    public static synchronized yv2 g(Context context) {
        yv2 yv2Var;
        synchronized (yv2.class) {
            yv2Var = g;
            if (yv2Var == null) {
                yv2Var = new yv2(context);
                g = yv2Var;
            }
        }
        return yv2Var;
    }

    @Override
    public final int a() {
        return this.d ? 1 : 0;
    }

    @Override
    public final ClipData b() {
        return (ClipData) this.b;
    }

    @Override
    public final bw2 build() {
        return new bw2(new yv2(this));
    }

    @Override
    public final void c(Uri uri) {
        this.e = uri;
    }

    @Override
    public final void d(int i) {
        this.d = i;
    }

    @Override
    public final ContentInfo e() {
        return null;
    }

    @Override
    public final int f() {
        return this.c;
    }

    public final int h() {
        byte b;
        synchronized (this.f) {
            b = this.c;
        }
        return b;
    }

    public final void i(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            il7 il7Var = (il7) it.next();
            if (il7Var.a.get() == null) {
                copyOnWriteArrayList.remove(il7Var);
            }
        }
        synchronized (this.f) {
            if (this.d && this.c == i) {
                return;
            }
            this.d = true;
            this.c = i;
            Iterator it2 = ((CopyOnWriteArrayList) this.e).iterator();
            while (it2.hasNext()) {
                il7 il7Var2 = (il7) it2.next();
                il7Var2.b.execute(new fe7(il7Var2, (byte) 5));
            }
        }
    }

    @Override
    public final void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.a) {
            case 1:
                Uri uri = (Uri) this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                byte b = this.c;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    if (b != 5) {
                                        str = String.valueOf((int) b);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                boolean z = this.d;
                if (z) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(z ? 1 : 0);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (((Bundle) this.f) != null) {
                    str3 = ", hasExtras";
                }
                return c00.k(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public yv2(Context context) {
        Executor a = rd0.a();
        this.b = a;
        this.e = new CopyOnWriteArrayList();
        this.f = new Object();
        this.c = (byte) 0;
        a.execute(new t87(this, context, (byte) 26));
    }

    public yv2() {
    }
}
