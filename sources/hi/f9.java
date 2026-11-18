package hi;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.ut0;
public final class f9 implements z10, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, ih.b, g9.k, org.telegram.ui.ActionBar.r1, w10, st0, tt0, org.telegram.messenger.i9, h2.o, h2.p, u9.d {
    public final int f14662a;

    public f9(int i7) {
        this.f14662a = i7;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        int i7;
        h9.q1 q1Var;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f14662a) {
            case 10:
                String str = (String) obj;
                g9.a aVar = k9.a.f18190g;
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
            case 11:
                Collection<Object> collection = (Collection) obj;
                int i11 = h9.r0.d;
                if (collection instanceof h9.r0) {
                    return (h9.r0) collection;
                }
                boolean z11 = collection instanceof h9.n1;
                if (z11) {
                    i7 = ((h9.q0) ((h9.z1) ((h9.n1) collection)).o()).size();
                } else {
                    i7 = 11;
                }
                ?? obj2 = new Object();
                obj2.f14041b = false;
                ?? obj3 = new Object();
                obj3.d(i7);
                obj2.f14040a = obj3;
                if (z11) {
                    h9.n1 n1Var = (h9.n1) collection;
                    if (n1Var instanceof h9.z1) {
                        q1Var = ((h9.z1) n1Var).f14100e;
                    } else {
                        q1Var = null;
                    }
                    if (q1Var != null) {
                        obj3.a(Math.max(obj3.f14050c, q1Var.f14050c));
                        if (q1Var.f14050c == 0) {
                            i10 = -1;
                        }
                        while (i10 >= 0) {
                            a8.la.j(i10, q1Var.f14050c);
                            Object obj4 = q1Var.f14048a[i10];
                            a8.la.j(i10, q1Var.f14050c);
                            obj2.c(q1Var.f14049b[i10], obj4);
                            i10++;
                            if (i10 >= q1Var.f14050c) {
                                i10 = -1;
                            }
                        }
                    } else {
                        h9.r0 r0Var = (h9.r0) n1Var;
                        h9.t0 p10 = r0Var.p();
                        h9.q1 q1Var2 = obj2.f14040a;
                        q1Var2.a(Math.max(q1Var2.f14050c, p10.size()));
                        for (h9.p1 p1Var : r0Var.p()) {
                            obj2.c(p1Var.a(), p1Var.f14042a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f14040a);
                if (obj2.f14040a.f14050c == 0) {
                    return h9.z1.f14099n;
                }
                obj2.f14041b = true;
                return new h9.z1(obj2.f14040a);
            default:
                return new m2.d((h2.g0) obj);
        }
    }

    @Override
    public Object b(Bitmap bitmap) {
        switch (this.f14662a) {
            case 7:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 8:
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
        switch (this.f14662a) {
            case 17:
                ki.t2 t2Var = (ki.t2) obj;
                t2Var.f18925c = f10;
                t2Var.f18930f.invalidate();
                t2Var.Y.setAlpha(f10);
                t2Var.J();
                t2Var.H();
                return;
            case 18:
            default:
                ((ki.s3) obj).setSwipeOffsetY(f10);
                return;
            case 19:
                ((ki.o3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public void d(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof mq) {
            Drawable drawable = ((mq) background).f37607a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override
    public Object e(a8.r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.f14662a) {
            case 27:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 28:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public int f(View view) {
        Drawable background = view.getBackground();
        if (background instanceof mq) {
            Drawable drawable = ((mq) background).f37607a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public void g(Object obj, e2.s sVar) {
        ((e2.a1) obj).F(new e2.z0(sVar));
    }

    @Override
    public float get(Object obj) {
        switch (this.f14662a) {
            case 16:
                return ((ki.t2) obj).f18925c;
            case 17:
            default:
                return ((ki.s3) obj).getSwipeOffsetY();
            case 18:
                return ((ki.o3) obj).f18822c;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f14662a) {
            case 12:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f14662a) {
            case 24:
                a1Var.y(new l2.l(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                a1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public Object m(Object obj) {
        Void r12 = (Void) obj;
        ut0 ut0Var = ki.s3.f18891c0;
        return Boolean.FALSE;
    }

    public f9(Object obj, int i7) {
        this.f14662a = i7;
    }
}
