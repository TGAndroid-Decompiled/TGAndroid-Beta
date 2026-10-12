package fi;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import v7.u6;
public final class c2 implements fw0, gw0, GenericProvider, d9.k, r9.d, e2.o, org.telegram.ui.ActionBar.z1, hh.b {
    public final int f9206a;

    public c2(int i10) {
        this.f9206a = i10;
    }

    public static ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class f() {
        return ShortcutManager.class;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f9206a) {
            case 24:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 25:
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
        e9.u1 u1Var;
        int i11 = 0;
        boolean z10 = true;
        switch (this.f9206a) {
            case 12:
                String str = (String) obj;
                d9.a aVar = h9.a.f10390g;
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
            case 13:
                Collection<Object> collection = (Collection) obj;
                int i12 = e9.w0.d;
                if (collection instanceof e9.w0) {
                    return (e9.w0) collection;
                }
                boolean z11 = collection instanceof e9.r1;
                if (z11) {
                    i10 = ((e9.v0) ((e9.d2) ((e9.r1) collection)).s()).size();
                } else {
                    i10 = 11;
                }
                ?? obj2 = new Object();
                obj2.f8628b = false;
                ?? obj3 = new Object();
                obj3.d(i10);
                obj2.f8627a = obj3;
                if (z11) {
                    e9.r1 r1Var = (e9.r1) collection;
                    if (r1Var instanceof e9.d2) {
                        u1Var = ((e9.d2) r1Var).e;
                    } else {
                        u1Var = null;
                    }
                    if (u1Var != null) {
                        obj3.a(Math.max(obj3.f8631c, u1Var.f8631c));
                        if (u1Var.f8631c == 0) {
                            i11 = -1;
                        }
                        while (i11 >= 0) {
                            u6.j(i11, u1Var.f8631c);
                            Object obj4 = u1Var.f8629a[i11];
                            u6.j(i11, u1Var.f8631c);
                            obj2.c(u1Var.f8630b[i11], obj4);
                            i11++;
                            if (i11 >= u1Var.f8631c) {
                                i11 = -1;
                            }
                        }
                    } else {
                        e9.w0 w0Var = (e9.w0) r1Var;
                        e9.y0 t10 = w0Var.t();
                        e9.u1 u1Var2 = obj2.f8627a;
                        u1Var2.a(Math.max(u1Var2.f8631c, t10.size()));
                        for (e9.t1 t1Var : w0Var.t()) {
                            obj2.c(t1Var.a(), t1Var.f8622a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f8627a);
                if (obj2.f8627a.f8631c == 0) {
                    return e9.d2.f8548n;
                }
                obj2.f8628b = true;
                return new e9.d2(obj2.f8627a);
            default:
                return new j2.f((e2.g0) obj);
        }
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f9206a) {
            case 1:
                k3 k3Var = (k3) obj;
                k3Var.f9353b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.F();
                k3Var.D();
                return;
            case 2:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                return;
            case 3:
                ((k4) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f9206a) {
            case 22:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f9206a) {
            case 0:
                return ((k3) obj).f9353b;
            case 1:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 2:
                return ((k4) obj).f9388c;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9206a) {
            case 20:
                ((b2.e1) obj).onPlayerError(new i2.m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 21:
                ((b2.e1) obj).onRenderedFirstFrame();
                return;
            case 27:
                ((j2.b) obj).getClass();
                return;
            case 28:
                ((j2.b) obj).getClass();
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
        hw0 hw0Var = p4.f9470b0;
        return Boolean.FALSE;
    }

    public c2(j2.a aVar, Object obj, int i10) {
        this.f9206a = i10;
    }

    public c2(j2.a aVar, boolean z10, int i10) {
        this.f9206a = 29;
    }
}
