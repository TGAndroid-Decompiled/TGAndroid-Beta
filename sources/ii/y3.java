package ii;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.ke;
import b8.zb;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e9;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xp;
public final class y3 implements jt0, e9, f9.k, t10, g2.p, g2.q, t9.d, o6, p6, jh.b {
    public final int f15331a;

    public y3(int i3) {
        this.f15331a = i3;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.f15331a) {
            case 4:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public Object apply(Object obj) {
        int i3;
        g9.p1 p1Var;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f15331a) {
            case 2:
                String str = (String) obj;
                f9.a aVar = j9.a.f16217g;
                aVar.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (aVar.c(str.charAt(length))) {
                            length--;
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (!z10 || str.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 16);
                    sb2.append('\"');
                    while (i10 < str.length()) {
                        char charAt = str.charAt(i10);
                        if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                            sb2.append('\\');
                        }
                        sb2.append(charAt);
                        i10++;
                    }
                    sb2.append('\"');
                    return sb2.toString();
                }
                return str;
            case 3:
                Collection<Object> collection = (Collection) obj;
                int i11 = g9.r0.d;
                if (collection instanceof g9.r0) {
                    return (g9.r0) collection;
                }
                boolean z11 = collection instanceof g9.m1;
                if (z11) {
                    i3 = ((g9.q0) ((g9.y1) ((g9.m1) collection)).o()).size();
                } else {
                    i3 = 11;
                }
                ?? obj2 = new Object();
                obj2.f12119b = false;
                ?? obj3 = new Object();
                obj3.d(i3);
                obj2.f12118a = obj3;
                if (z11) {
                    g9.m1 m1Var = (g9.m1) collection;
                    if (m1Var instanceof g9.y1) {
                        p1Var = ((g9.y1) m1Var).f12173e;
                    } else {
                        p1Var = null;
                    }
                    if (p1Var != null) {
                        obj3.a(Math.max(obj3.f12122c, p1Var.f12122c));
                        if (p1Var.f12122c == 0) {
                            i10 = -1;
                        }
                        while (i10 >= 0) {
                            zb.j(i10, p1Var.f12122c);
                            Object obj4 = p1Var.f12120a[i10];
                            zb.j(i10, p1Var.f12122c);
                            obj2.c(p1Var.f12121b[i10], obj4);
                            i10++;
                            if (i10 >= p1Var.f12122c) {
                                i10 = -1;
                            }
                        }
                    } else {
                        g9.r0 r0Var = (g9.r0) m1Var;
                        g9.t0 p10 = r0Var.p();
                        g9.p1 p1Var2 = obj2.f12118a;
                        p1Var2.a(Math.max(p1Var2.f12122c, p10.size()));
                        for (g9.o1 o1Var : r0Var.p()) {
                            obj2.c(o1Var.a(), o1Var.f12114a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f12118a);
                if (obj2.f12118a.f12122c == 0) {
                    return g9.y1.f12172n;
                }
                obj2.f12119b = true;
                return new g9.y1(obj2.f12118a);
            default:
                return new l2.f((g2.h0) obj);
        }
    }

    @Override
    public Object b(Bitmap bitmap) {
        switch (this.f15331a) {
            case 15:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 16:
                int i3 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i3 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i3);
            default:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i10 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i10);
        }
    }

    @Override
    public void c(Object obj, float f10) {
        ((c4) obj).setSwipeOffsetY(f10);
    }

    @Override
    public void e(Object obj, d2.t tVar) {
        ((d2.c1) obj).O(new d2.b1(tVar));
    }

    @Override
    public void f(int i3, View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).f40438a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i3);
                view.invalidate();
            }
        }
    }

    @Override
    public int h(View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).f40438a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f15331a) {
            case 7:
                ((d2.c1) obj).o(new k2.l(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                ((l2.b) obj).getClass();
                return;
            case 9:
                ((d2.c1) obj).onRenderedFirstFrame();
                return;
            case 18:
                ((l2.b) obj).getClass();
                return;
            case 19:
                ((l2.b) obj).getClass();
                return;
            case 20:
                ((l2.b) obj).getClass();
                return;
            case 21:
                ((l2.b) obj).getClass();
                return;
            case 22:
                ((l2.b) obj).getClass();
                return;
            case 23:
                ((l2.b) obj).getClass();
                return;
            case 24:
                ((l2.b) obj).getClass();
                return;
            case 25:
                ((l2.b) obj).getClass();
                return;
            case 26:
                ((l2.b) obj).getClass();
                return;
            case 27:
                ((l2.b) obj).getClass();
                return;
            case 28:
                ((l2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object k(Object obj) {
        Void r12 = (Void) obj;
        kt0 kt0Var = c4.f14871c0;
        return Boolean.FALSE;
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f15331a) {
            case 10:
                return TransportRegistrar.c(keVar);
            case 11:
                return TransportRegistrar.b(keVar);
            default:
                return TransportRegistrar.a(keVar);
        }
    }

    public y3(int i3, int i10, l2.a aVar, boolean z10) {
        this.f15331a = i10;
    }

    public y3(Object obj, int i3) {
        this.f15331a = i3;
    }

    public y3(l2.a aVar, int i3) {
        this.f15331a = 25;
    }

    public y3(l2.a aVar, Object obj, int i3) {
        this.f15331a = i3;
    }

    public y3(l2.a aVar, String str, long j10, long j11) {
        this.f15331a = 24;
    }

    public y3(l2.a aVar, boolean z10) {
        this.f15331a = 23;
    }
}
