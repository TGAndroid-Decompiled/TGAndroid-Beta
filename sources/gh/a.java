package gh;

import a8.me;
import a8.yb;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import b2.e1;
import com.google.firebase.datatransport.TransportRegistrar;
import e2.g0;
import e2.o;
import e9.k;
import f9.m1;
import f9.o1;
import f9.p1;
import f9.q0;
import f9.r0;
import f9.t0;
import f9.y1;
import fh.d;
import hi.i4;
import hi.m3;
import hi.n4;
import i2.m;
import j$.util.Objects;
import j2.e;
import j5.f;
import java.util.Collection;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
public final class a implements d, nw0, ow0, GenericProvider, k, o, s9.d, d7 {
    public final int f12486a;

    public a(int i10) {
        this.f12486a = i10;
    }

    @Override
    public Object apply(Object obj) {
        int i10;
        p1 p1Var;
        int i11 = 0;
        boolean z10 = true;
        switch (this.f12486a) {
            case 23:
                return new e((g0) obj);
            case 26:
                String str = (String) obj;
                e9.a aVar = i9.a.f13899g;
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
            default:
                Collection<Object> collection = (Collection) obj;
                int i12 = r0.d;
                if (collection instanceof r0) {
                    return (r0) collection;
                }
                boolean z11 = collection instanceof m1;
                if (z11) {
                    i10 = ((q0) ((y1) ((m1) collection)).s()).size();
                } else {
                    i10 = 11;
                }
                ?? obj2 = new Object();
                obj2.f10319b = false;
                ?? obj3 = new Object();
                obj3.d(i10);
                obj2.f10318a = obj3;
                if (z11) {
                    m1 m1Var = (m1) collection;
                    if (m1Var instanceof y1) {
                        p1Var = ((y1) m1Var).e;
                    } else {
                        p1Var = null;
                    }
                    if (p1Var != null) {
                        obj3.a(Math.max(obj3.f10322c, p1Var.f10322c));
                        if (p1Var.f10322c == 0) {
                            i11 = -1;
                        }
                        while (i11 >= 0) {
                            yb.j(i11, p1Var.f10322c);
                            Object obj4 = p1Var.f10320a[i11];
                            yb.j(i11, p1Var.f10322c);
                            obj2.c(p1Var.f10321b[i11], obj4);
                            i11++;
                            if (i11 >= p1Var.f10322c) {
                                i11 = -1;
                            }
                        }
                    } else {
                        r0 r0Var = (r0) m1Var;
                        t0 t10 = r0Var.t();
                        p1 p1Var2 = obj2.f10318a;
                        p1Var2.a(Math.max(p1Var2.f10322c, t10.size()));
                        for (o1 o1Var : r0Var.t()) {
                            obj2.c(o1Var.a(), o1Var.f10314a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f10318a);
                if (obj2.f10318a.f10322c == 0) {
                    return y1.f10362n;
                }
                obj2.f10319b = true;
                return new y1(obj2.f10318a);
        }
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f12486a) {
            case 13:
                m3 m3Var = (m3) obj;
                m3Var.f13105c = f7;
                m3Var.f13109f.invalidate();
                m3Var.X.setAlpha(f7);
                m3Var.F();
                m3Var.D();
                return;
            case 14:
            default:
                ((n4) obj).setSwipeOffsetY(f7);
                return;
            case 15:
                ((i4) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof ar) {
            Drawable drawable = ((ar) background).f26590a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }

    @Override
    public Object d1(me meVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(meVar);
        return lambda$getComponents$0;
    }

    @Override
    public float get(Object obj) {
        switch (this.f12486a) {
            case 12:
                return ((m3) obj).f13105c;
            case 13:
            default:
                return ((n4) obj).getSwipeOffsetY();
            case 14:
                return ((i4) obj).f13036c;
        }
    }

    @Override
    public int i(u6 u6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f12486a) {
            case 0:
                return 855638016;
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return y6.o1(f7, y6.w0(y6.Fi, u6Var));
            case 2:
                return 1073741824;
            case 3:
                return y6.o1(0.075f, -16777216);
            case 4:
                return y6.o1(0.88f, y6.w0(y6.f23354d6, u6Var));
            case 5:
                int x02 = y6.x0(null, y6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return y6.o1(f10, x02);
            case 6:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return c.n(f11, y6.w0(y6.f23354d6, u6Var), y6.w0(y6.Yk, u6Var));
            case 7:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return y6.o1(f12, y6.w0(y6.f23354d6, u6Var));
            case 8:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.8f;
                }
                return c.n(f13, y6.w0(y6.f23297a7, u6Var), y6.w0(y6.f23354d6, u6Var));
            case 9:
                return y6.o1(0.78f, y6.w0(y6.f23425h5, u6Var));
            case 10:
                return y6.o1(0.7f, y6.w0(y6.f23354d6, u6Var));
            default:
                LiteMode.isEnabled(262144);
                return 0;
        }
    }

    @Override
    public void invoke(Object obj) {
        e1 e1Var = (e1) obj;
        switch (this.f12486a) {
            case 24:
                e1Var.onPlayerError(new m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                e1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        pw0 pw0Var = n4.f13153b0;
        return Boolean.FALSE;
    }
}
