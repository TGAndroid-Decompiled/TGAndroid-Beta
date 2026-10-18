package fh;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import b2.d1;
import b2.z0;
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
import j$.util.Objects;
import j2.f;
import java.util.Collection;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cw0;
import v7.u6;
public final class b implements d, aw0, bw0, GenericProvider, k, r9.d, o, a2, hh.b {
    public final int f10599a;

    public b(int i10) {
        this.f10599a = i10;
    }

    public static ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class h() {
        return ShortcutManager.class;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f10599a) {
            case 26:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 27:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public Object apply(Object obj) {
        int i10;
        u1 u1Var;
        int i11 = 0;
        boolean z10 = true;
        switch (this.f10599a) {
            case 14:
                String str = (String) obj;
                d9.a aVar = h9.a.f11701g;
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
            case 15:
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
                obj2.f8513b = false;
                ?? obj3 = new Object();
                obj3.d(i10);
                obj2.f8512a = obj3;
                if (z11) {
                    r1 r1Var = (r1) collection;
                    if (r1Var instanceof d2) {
                        u1Var = ((d2) r1Var).e;
                    } else {
                        u1Var = null;
                    }
                    if (u1Var != null) {
                        obj3.a(Math.max(obj3.f8516c, u1Var.f8516c));
                        if (u1Var.f8516c == 0) {
                            i11 = -1;
                        }
                        while (i11 >= 0) {
                            u6.j(i11, u1Var.f8516c);
                            Object obj4 = u1Var.f8514a[i11];
                            u6.j(i11, u1Var.f8516c);
                            obj2.c(u1Var.f8515b[i11], obj4);
                            i11++;
                            if (i11 >= u1Var.f8516c) {
                                i11 = -1;
                            }
                        }
                    } else {
                        w0 w0Var = (w0) r1Var;
                        y0 t10 = w0Var.t();
                        u1 u1Var2 = obj2.f8512a;
                        u1Var2.a(Math.max(u1Var2.f8516c, t10.size()));
                        for (t1 t1Var : w0Var.t()) {
                            obj2.c(t1Var.a(), t1Var.f8507a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f8512a);
                if (obj2.f8512a.f8516c == 0) {
                    return d2.f8433n;
                }
                obj2.f8513b = true;
                return new d2(obj2.f8512a);
            default:
                return new f((g0) obj);
        }
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f10599a) {
            case 8:
                d3 d3Var = (d3) obj;
                d3Var.f11139b = f7;
                d3Var.e.invalidate();
                d3Var.W.setAlpha(f7);
                d3Var.F();
                d3Var.D();
                return;
            case 9:
            default:
                ((e4) obj).setSwipeOffsetY(f7);
                return;
            case 10:
                ((z3) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public int f(d6 d6Var, boolean z10) {
        float f7;
        switch (this.f10599a) {
            case 0:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return h6.m1(f7, h6.w0(h6.f20993d6, d6Var));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f10599a) {
            case 24:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f10599a) {
            case 7:
                return ((d3) obj).f11139b;
            case 8:
            default:
                return ((e4) obj).getSwipeOffsetY();
            case 9:
                return ((z3) obj).f11586c;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10599a) {
            case 22:
                ((d1) obj).onPlayerError(new m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 23:
                ((d1) obj).onRenderedFirstFrame();
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        cw0 cw0Var = e4.f11183b0;
        return Boolean.FALSE;
    }

    public b(j2.a aVar, z0 z0Var) {
        this.f10599a = 29;
    }
}
