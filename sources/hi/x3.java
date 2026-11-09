package hi;

import a8.ia;
import a8.r7;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y31;
public final class x3 implements mt0, k9, b20, p6, q6, ih.b, g9.k, org.telegram.ui.ActionBar.r1, h2.o, h2.p, u9.d {
    public final int f15035a;

    public x3(int i7) {
        this.f15035a = i7;
    }

    @Override
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.f15035a) {
            case 6:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public Object apply(Object obj) {
        int i7;
        h9.q1 q1Var;
        int i10 = 0;
        boolean z9 = true;
        switch (this.f15035a) {
            case 13:
                String str = (String) obj;
                g9.a aVar = k9.a.f17236g;
                aVar.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (aVar.c(str.charAt(length))) {
                            length--;
                        } else {
                            z9 = false;
                        }
                    }
                }
                if (!z9 || str.isEmpty()) {
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
            case 14:
                Collection<Object> collection = (Collection) obj;
                int i11 = h9.r0.d;
                if (collection instanceof h9.r0) {
                    return (h9.r0) collection;
                }
                boolean z10 = collection instanceof h9.n1;
                if (z10) {
                    i7 = ((h9.q0) ((h9.z1) ((h9.n1) collection)).o()).size();
                } else {
                    i7 = 11;
                }
                ?? obj2 = new Object();
                obj2.f14364b = false;
                ?? obj3 = new Object();
                obj3.d(i7);
                obj2.f14363a = obj3;
                if (z10) {
                    h9.n1 n1Var = (h9.n1) collection;
                    if (n1Var instanceof h9.z1) {
                        q1Var = ((h9.z1) n1Var).f14423e;
                    } else {
                        q1Var = null;
                    }
                    if (q1Var != null) {
                        obj3.a(Math.max(obj3.f14373c, q1Var.f14373c));
                        if (q1Var.f14373c == 0) {
                            i10 = -1;
                        }
                        while (i10 >= 0) {
                            ia.j(i10, q1Var.f14373c);
                            Object obj4 = q1Var.f14371a[i10];
                            ia.j(i10, q1Var.f14373c);
                            obj2.c(q1Var.f14372b[i10], obj4);
                            i10++;
                            if (i10 >= q1Var.f14373c) {
                                i10 = -1;
                            }
                        }
                    } else {
                        h9.r0 r0Var = (h9.r0) n1Var;
                        h9.t0 p10 = r0Var.p();
                        h9.q1 q1Var2 = obj2.f14363a;
                        q1Var2.a(Math.max(q1Var2.f14373c, p10.size()));
                        for (h9.p1 p1Var : r0Var.p()) {
                            obj2.c(p1Var.a(), p1Var.f14365a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f14363a);
                if (obj2.f14363a.f14373c == 0) {
                    return h9.z1.f14422n;
                }
                obj2.f14364b = true;
                return new h9.z1(obj2.f14363a);
            default:
                return new m2.e((h2.g0) obj);
        }
    }

    @Override
    public Object b(Bitmap bitmap) {
        switch (this.f15035a) {
            case 10:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 11:
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
    public void c(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).f40444a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override
    public Object e(r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.f15035a) {
            case 22:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 23:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public void f(Object obj, float f10) {
        ((b4) obj).setSwipeOffsetY(f10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f15035a) {
            case 15:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void h(Object obj, e2.s sVar) {
        ((e2.a1) obj).F(new e2.z0(sVar));
    }

    @Override
    public int i(View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).f40444a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f15035a) {
            case 19:
                ((e2.a1) obj).y(new l2.l(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                ((m2.b) obj).getClass();
                return;
            case 21:
                ((e2.a1) obj).onRenderedFirstFrame();
                return;
            case 25:
                ((m2.b) obj).getClass();
                return;
            case 26:
                ((m2.b) obj).getClass();
                return;
            case 27:
                ((m2.b) obj).getClass();
                return;
            case 28:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Void r12 = (Void) obj;
        nt0 nt0Var = b4.f14559b0;
        return Boolean.FALSE;
    }

    public x3(Object obj, int i7) {
        this.f15035a = i7;
    }

    public x3(m2.a aVar, Object obj, int i7) {
        this.f15035a = i7;
    }

    public x3(m2.a aVar, boolean z9, int i7) {
        this.f15035a = 27;
    }
}
