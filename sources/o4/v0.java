package o4;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.view.WindowManager;
import b8.yd;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.a8;
import org.telegram.messenger.e9;
import org.telegram.messenger.r2;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class v0 implements f1, e9, OnSuccessListener, org.telegram.ui.ActionBar.p1, Vector.TLDeserializer {
    public final int f20883a;

    public v0(int i3) {
        this.f20883a = i3;
    }

    public static oi.b a() {
        InputStream open = org.telegram.messenger.t0.f25457b.getAssets().open("grammars.dat");
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
                    return new oi.b(new PrismaHighlighter(byteArray));
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

    public static BlendMode c(Object obj) {
        return (BlendMode) obj;
    }

    public static RenderNode d(Object obj) {
        return (RenderNode) obj;
    }

    public static void j(WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.layoutInDisplayCutoutMode = i3;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        return TLRPC.Peer.TLdeserialize(inputSerializedData, i3, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s1Var.dismiss();
    }

    @Override
    public Object i(e0 e0Var, v vVar, int i3) {
        switch (this.f20883a) {
            case 0:
                e0Var.getClass();
                throw new ClassCastException();
            default:
                kb.a aVar = e0Var.f20622e;
                e0Var.s(vVar);
                aVar.getClass();
                return yd.b(new r1(-6));
        }
    }

    @Override
    public Object k(Object obj) {
        switch (this.f20883a) {
            case 7:
                Integer num = (Integer) obj;
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                return "%s";
            case 9:
                return "%" + (((Integer) obj).intValue() + 1) + "$s";
            case 25:
                Void r32 = (Void) obj;
                return new TLRPC.TL_messageEntityBold();
            case 26:
                Void r33 = (Void) obj;
                return new TLRPC.TL_messageEntityItalic();
            case 27:
                Void r34 = (Void) obj;
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                Void r35 = (Void) obj;
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z10 = r2.f25040a;
        a8.b("sms listener registered");
    }
}
