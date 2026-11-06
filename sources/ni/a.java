package ni;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.k9;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class a implements g9.k, l5.g, k9, OnSuccessListener, r1 {
    public final int f20607a;

    public a(int i7) {
        this.f20607a = i7;
    }

    public static d a() {
        InputStream open = t0.f25555b.getAssets().open("grammars.dat");
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
                    return new d(new PrismaHighlighter(byteArray));
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

    public static BlendMode d(Object obj) {
        return (BlendMode) obj;
    }

    public static RenderNode e(Object obj) {
        return (RenderNode) obj;
    }

    public static void k(WindowManager.LayoutParams layoutParams, int i7) {
        layoutParams.layoutInDisplayCutoutMode = i7;
    }

    @Override
    public Object apply(Object obj) {
        return i0.u(Integer.valueOf(((y2.i) obj).f58786a));
    }

    @Override
    public void g(u1 u1Var, int i7) {
        u1Var.dismiss();
    }

    @Override
    public Object j(Object obj) {
        switch (this.f20607a) {
            case 10:
                Integer num = (Integer) obj;
                Typeface typeface = g0.f22509a;
                return "%s";
            case 12:
                return "%" + (((Integer) obj).intValue() + 1) + "$s";
            case 28:
                Void r32 = (Void) obj;
                return new TLRPC.TL_messageEntityBold();
            default:
                Void r33 = (Void) obj;
                return new TLRPC.TL_messageEntityItalic();
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z9 = r2.f25191a;
        a8.b("sms listener registered");
    }

    @Override
    public void b(Exception exc) {
    }
}
