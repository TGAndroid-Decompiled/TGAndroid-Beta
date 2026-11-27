package defpackage;

import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class c22 implements zla, ama, nu4, fd, jcc, f73, occ, uq2 {
    public final byte a;

    public c22(byte b) {
        this.a = b;
    }

    public static dk2 a() {
        InputStream open = a.b.getAssets().open("grammars.dat");
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
                    return new dk2(new PrismaHighlighter(byteArray));
                }
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void b(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static void c(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override
    public final h73 createDataSource() {
        return new lx(a.b);
    }

    @Override
    public final void d(Object obj, float f) {
        switch (this.a) {
            case 1:
                ((d22) obj).setLoadProgress(f);
                return;
            case 3:
                ((i22) obj).setSwipeOffsetY(f);
                return;
            case 16:
                ok2 ok2Var = (ok2) obj;
                ok2Var.N1 = f;
                if (ok2Var.getParent() != null) {
                    ((View) ok2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 18:
                ok2 ok2Var2 = (ok2) obj;
                ok2Var2.O1 = f;
                if (ok2Var2.getParent() != null) {
                    ((View) ok2Var2.getParent()).invalidate();
                    return;
                }
                return;
            case 20:
                ok2 ok2Var3 = (ok2) obj;
                ok2Var3.P1 = f;
                if (ok2Var3.getParent() != null) {
                    ((View) ok2Var3.getParent()).invalidate();
                    return;
                }
                return;
            default:
                ok2 ok2Var4 = (ok2) obj;
                ok2Var4.Q1 = f;
                if (ok2Var4.getParent() != null) {
                    ((View) ok2Var4.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final List f(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return ob6.H(',', "Stars", num2.intValue());
        }
        return String.valueOf(num2);
    }

    @Override
    public final float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((d22) obj).c;
            case 2:
                return ((i22) obj).getSwipeOffsetY();
            case 15:
                return ((ok2) obj).N1;
            case 17:
                return ((ok2) obj).O1;
            case 19:
                return ((ok2) obj).P1;
            default:
                return ((ok2) obj).Q1;
        }
    }

    @Override
    public final Object h(Object obj) {
        Void r1 = (Void) obj;
        switch (this.a) {
            case 4:
                bma bmaVar = i22.c0;
                return Boolean.FALSE;
            default:
                return CheckBoxBase.I;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 5:
                idVar.dismiss();
                return;
            case 6:
            default:
                idVar.dismiss();
                return;
            case 7:
                idVar.dismiss();
                return;
        }
    }
}
