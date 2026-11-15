package i0;

import a8.ja;
import a8.r7;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import e2.a1;
import e2.s;
import e2.z0;
import h2.g0;
import h2.o;
import h2.p;
import h9.m1;
import h9.o1;
import h9.p1;
import h9.q0;
import h9.r0;
import h9.t0;
import h9.y1;
import j$.util.Objects;
import java.util.Collection;
import ki.t3;
import ki.x2;
import ki.x3;
import l2.l;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j9;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.mt0;
public final class b implements n6, o6, ih.b, g9.k, q1, y10, kt0, lt0, j9, o, p, u9.d {
    public final int f15572a;

    public b(int i7) {
        this.f15572a = i7;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        switch (this.f15572a) {
            case 14:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public Object apply(Object obj) {
        int i7;
        p1 p1Var;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f15572a) {
            case 9:
                String str = (String) obj;
                g9.a aVar = k9.a.f17795g;
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
            case 10:
                Collection<Object> collection = (Collection) obj;
                int i11 = r0.d;
                if (collection instanceof r0) {
                    return (r0) collection;
                }
                boolean z11 = collection instanceof m1;
                if (z11) {
                    i7 = ((q0) ((y1) ((m1) collection)).o()).size();
                } else {
                    i7 = 11;
                }
                ?? obj2 = new Object();
                obj2.f13722b = false;
                ?? obj3 = new Object();
                obj3.d(i7);
                obj2.f13721a = obj3;
                if (z11) {
                    m1 m1Var = (m1) collection;
                    if (m1Var instanceof y1) {
                        p1Var = ((y1) m1Var).f13776e;
                    } else {
                        p1Var = null;
                    }
                    if (p1Var != null) {
                        obj3.a(Math.max(obj3.f13725c, p1Var.f13725c));
                        if (p1Var.f13725c == 0) {
                            i10 = -1;
                        }
                        while (i10 >= 0) {
                            ja.j(i10, p1Var.f13725c);
                            Object obj4 = p1Var.f13723a[i10];
                            ja.j(i10, p1Var.f13725c);
                            obj2.c(p1Var.f13724b[i10], obj4);
                            i10++;
                            if (i10 >= p1Var.f13725c) {
                                i10 = -1;
                            }
                        }
                    } else {
                        r0 r0Var = (r0) m1Var;
                        t0 p10 = r0Var.p();
                        p1 p1Var2 = obj2.f13721a;
                        p1Var2.a(Math.max(p1Var2.f13725c, p10.size()));
                        for (o1 o1Var : r0Var.p()) {
                            obj2.c(o1Var.a(), o1Var.f13717a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f13721a);
                if (obj2.f13721a.f13725c == 0) {
                    return y1.f13775n;
                }
                obj2.f13722b = true;
                return new y1(obj2.f13721a);
            default:
                return new m2.e((g0) obj);
        }
    }

    @Override
    public Object b(Bitmap bitmap) {
        switch (this.f15572a) {
            case 6:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 7:
                int i7 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i7 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i7);
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
        switch (this.f15572a) {
            case 16:
                x2 x2Var = (x2) obj;
                x2Var.f18656c = f10;
                x2Var.f18661f.invalidate();
                x2Var.Y.setAlpha(f10);
                x2Var.J();
                x2Var.H();
                return;
            case 17:
            default:
                ((x3) obj).setSwipeOffsetY(f10);
                return;
            case 18:
                ((t3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public void e(Object obj, s sVar) {
        ((a1) obj).F(new z0(sVar));
    }

    @Override
    public void f(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof fq) {
            Drawable drawable = ((fq) background).f34669a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override
    public int g(View view) {
        Drawable background = view.getBackground();
        if (background instanceof fq) {
            Drawable drawable = ((fq) background).f34669a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public float get(Object obj) {
        switch (this.f15572a) {
            case 15:
                return ((x2) obj).f18656c;
            case 16:
            default:
                return ((x3) obj).getSwipeOffsetY();
            case 17:
                return ((t3) obj).f18571c;
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f15572a) {
            case 11:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public Object i(r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.f15572a) {
            case 26:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 27:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public void invoke(Object obj) {
        a1 a1Var = (a1) obj;
        switch (this.f15572a) {
            case 23:
                a1Var.y(new l(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                a1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public Object o(Object obj) {
        Void r12 = (Void) obj;
        mt0 mt0Var = x3.f18688c0;
        return Boolean.FALSE;
    }

    public b(Object obj, int i7) {
        this.f15572a = i7;
    }
}
