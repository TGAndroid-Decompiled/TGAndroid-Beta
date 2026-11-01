package d2;

import android.content.pm.ShortcutManager;
import android.graphics.Typeface;
import android.window.OnBackInvokedDispatcher;
import b2.c1;
import b2.d1;
import b2.v;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.k;
import e2.g0;
import e2.o;
import e2.p;
import e9.d2;
import e9.r1;
import e9.t1;
import e9.u1;
import e9.v0;
import e9.y0;
import i2.l;
import ig.f0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.t6;
import z9.e2;
public final class c implements k, i5.e, r9.d, g2.g, o, p, f0 {
    public final int f5681a;

    public c(int i10) {
        this.f5681a = i10;
    }

    public static di.c a() {
        InputStream open = w0.f18945b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return new di.c(new PrismaHighlighter(byteArray));
                }
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static ShortcutManager e(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher f(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class g() {
        return ShortcutManager.class;
    }

    @Override
    public Object K(bh.d dVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(dVar);
        return lambda$getComponents$0;
    }

    @Override
    public Object apply(Object obj) {
        int i10;
        u1 u1Var;
        int i11 = 0;
        boolean z10 = true;
        switch (this.f5681a) {
            case 0:
                return Integer.valueOf(((b) obj).f5680r);
            case 1:
                da.a.f5819b.getClass();
                return aa.b.f361a.v((e2) obj).getBytes(Charset.forName("UTF-8"));
            case 9:
                String str = (String) obj;
                d9.a aVar = h9.a.f7642g;
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
            case 10:
                Collection<Object> collection = (Collection) obj;
                int i12 = e9.w0.d;
                if (collection instanceof e9.w0) {
                    return (e9.w0) collection;
                }
                boolean z11 = collection instanceof r1;
                if (z11) {
                    i10 = ((v0) ((d2) ((r1) collection)).s()).size();
                } else {
                    i10 = 11;
                }
                ?? obj2 = new Object();
                obj2.f6426b = false;
                ?? obj3 = new Object();
                obj3.d(i10);
                obj2.f6425a = obj3;
                if (z11) {
                    r1 r1Var = (r1) collection;
                    if (r1Var instanceof d2) {
                        u1Var = ((d2) r1Var).e;
                    } else {
                        u1Var = null;
                    }
                    if (u1Var != null) {
                        obj3.a(Math.max(obj3.f6429c, u1Var.f6429c));
                        if (u1Var.f6429c == 0) {
                            i11 = -1;
                        }
                        while (i11 >= 0) {
                            t6.j(i11, u1Var.f6429c);
                            Object obj4 = u1Var.f6427a[i11];
                            t6.j(i11, u1Var.f6429c);
                            obj2.c(u1Var.f6428b[i11], obj4);
                            i11++;
                            if (i11 >= u1Var.f6429c) {
                                i11 = -1;
                            }
                        }
                    } else {
                        e9.w0 w0Var = (e9.w0) r1Var;
                        y0 t10 = w0Var.t();
                        u1 u1Var2 = obj2.f6425a;
                        u1Var2.a(Math.max(u1Var2.f6429c, t10.size()));
                        for (t1 t1Var : w0Var.t()) {
                            obj2.c(t1Var.a(), t1Var.f6420a);
                        }
                    }
                } else {
                    for (Object obj5 : collection) {
                        obj2.a(obj5);
                    }
                }
                Objects.requireNonNull(obj2.f6425a);
                if (obj2.f6425a.f6429c == 0) {
                    return d2.f6346n;
                }
                obj2.f6426b = true;
                return new d2(obj2.f6425a);
            default:
                return new j2.g((g0) obj);
        }
    }

    @Override
    public Typeface b() {
        switch (this.f5681a) {
            case 22:
                return i0.o1("fonts/rmedium.ttf");
            case 23:
                return i0.o1("fonts/rmediumitalic.ttf");
            case 24:
                return Typeface.create("serif", 1);
            case 25:
                return i0.o1("fonts/rcondensedbold.ttf");
            case 26:
                return i0.o1("fonts/rmono.ttf");
            default:
                return i0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public void c(Object obj, v vVar) {
        ((d1) obj).D(new c1(vVar));
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(w0.f18945b);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f5681a) {
            case 19:
                ((d1) obj).H(new l(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 21:
                ((d1) obj).onRenderedFirstFrame();
                return;
            case 28:
                ((j2.b) obj).getClass();
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public c(i2.i0 i0Var) {
        this.f5681a = 20;
    }

    public c(j2.a aVar, Object obj, int i10) {
        this.f5681a = i10;
    }
}
