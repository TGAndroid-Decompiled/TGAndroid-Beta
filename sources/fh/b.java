package fh;

import android.content.pm.ShortcutManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import b2.d1;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.k;
import e2.g0;
import e2.o;
import e9.d2;
import e9.r1;
import e9.t1;
import e9.u1;
import e9.v0;
import e9.w0;
import e9.y0;
import eh.d;
import gi.d3;
import gi.e4;
import gi.z3;
import i2.m;
import i5.f;
import j$.util.Objects;
import j2.e;
import java.util.Collection;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.wq;
import v7.u6;
public final class b implements d, ew0, fw0, GenericProvider, k, r9.d, p6, o6, o, z1 {
    public final int f10613a;

    public b(int i10) {
        this.f10613a = i10;
    }

    public static ShortcutManager c(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class h() {
        return ShortcutManager.class;
    }

    @Override
    public Object apply(Object obj) {
        int i10;
        u1 u1Var;
        int i11 = 0;
        boolean z10 = true;
        switch (this.f10613a) {
            case 16:
                String str = (String) obj;
                d9.a aVar = h9.a.f11725g;
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
                    while (i11 < str.length()) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                            sb2.append('\\');
                        }
                        sb2.append(charAt);
                        i11++;
                    }
                    sb2.append('\"');
                    return sb2.toString();
                }
                return str;
            case 17:
                Collection<Object> collection = (Collection) obj;
                int i12 = w0.d;
                if (collection instanceof w0) {
                    return (w0) collection;
                }
                boolean z11 = collection instanceof r1;
                if (z11) {
                    i10 = ((v0) ((d2) ((r1) collection)).s()).size();
                } else {
                    i10 = 11;
                }
                ?? obj2 = new Object();
                obj2.f8517b = false;
                ?? obj3 = new Object();
                obj3.d(i10);
                obj2.f8516a = obj3;
                if (z11) {
                    r1 r1Var = (r1) collection;
                    if (r1Var instanceof d2) {
                        u1Var = ((d2) r1Var).e;
                    } else {
                        u1Var = null;
                    }
                    if (u1Var != null) {
                        obj3.a(Math.max(obj3.f8520c, u1Var.f8520c));
                        if (u1Var.f8520c == 0) {
                            i11 = -1;
                        }
                        while (i11 >= 0) {
                            u6.j(i11, u1Var.f8520c);
                            Object obj4 = u1Var.f8518a[i11];
                            u6.j(i11, u1Var.f8520c);
                            obj2.c(u1Var.f8519b[i11], obj4);
                            i11++;
                            if (i11 >= u1Var.f8520c) {
                                i11 = -1;
                            }
                        }
                    } else {
                        w0 w0Var = (w0) r1Var;
                        y0 t10 = w0Var.t();
                        u1 u1Var2 = obj2.f8516a;
                        u1Var2.a(Math.max(u1Var2.f8520c, t10.size()));
                        for (t1 t1Var : w0Var.t()) {
                            obj2.c(t1Var.a(), t1Var.f8511a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f8516a);
                if (obj2.f8516a.f8520c == 0) {
                    return d2.f8437n;
                }
                obj2.f8517b = true;
                return new d2(obj2.f8516a);
            default:
                return new e((g0) obj);
        }
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f10613a) {
            case 10:
                d3 d3Var = (d3) obj;
                d3Var.f11160c = f7;
                d3Var.f11164f.invalidate();
                d3Var.X.setAlpha(f7);
                d3Var.F();
                d3Var.D();
                return;
            case 11:
            default:
                ((e4) obj).setSwipeOffsetY(f7);
                return;
            case 12:
                ((z3) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof wq) {
            Drawable drawable = ((wq) background).f32322a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }

    @Override
    public int f(View view) {
        Drawable background = view.getBackground();
        if (background instanceof wq) {
            Drawable drawable = ((wq) background).f32322a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f10613a) {
            case 28:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f10613a) {
            case 9:
                return ((d3) obj).f11160c;
            case 10:
            default:
                return ((e4) obj).getSwipeOffsetY();
            case 11:
                return ((z3) obj).f11610c;
        }
    }

    @Override
    public int i(g6 g6Var, boolean z10) {
        float f7;
        switch (this.f10613a) {
            case 0:
                return k6.o1(0.78f, k6.w0(k6.f21255h5, g6Var));
            case 1:
                return k6.o1(0.7f, k6.w0(k6.f21184d6, g6Var));
            case 2:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return k6.o1(f7, k6.w0(k6.f21184d6, g6Var));
        }
    }

    @Override
    public void invoke(Object obj) {
        d1 d1Var = (d1) obj;
        switch (this.f10613a) {
            case 26:
                d1Var.onPlayerError(new m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                d1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        gw0 gw0Var = e4.f11202b0;
        return Boolean.FALSE;
    }
}
