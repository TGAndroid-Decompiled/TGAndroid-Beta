package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
public final class u36 implements ee, fu2, sm6, ku4, sx6, lz6 {
    public final byte a;

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static MediaRoute2Info f(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static void g() {
        throw new NoSuchElementException();
    }

    public static void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static void j(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override
    public final int a(Object obj) {
        String str = ((lm6) obj).a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((ExecutorService) obj).shutdown();
                return;
            default:
                ((cf8) obj).C0();
                return;
        }
    }

    @Override
    public final void d(rw6 rw6Var, int i) {
        switch (this.a) {
            case 24:
                rw6Var.getClass();
                return;
            case 25:
                rw6Var.b(i);
                return;
            default:
                rw6Var.getClass();
                return;
        }
    }

    @Override
    public final Object l(Object obj) {
        Void r1 = (Void) obj;
        switch (this.a) {
            case 18:
                return new TLRPC.TL_messageEntityBold();
            case 19:
                return new TLRPC.TL_messageEntityItalic();
            case 20:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                return;
            default:
                heVar.dismiss();
                return;
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        switch (this.a) {
            case 27:
                tx6Var.getClass();
                throw new ClassCastException();
            default:
                tx6Var.getClass();
                throw new ClassCastException();
        }
    }

    public u36(byte b) {
        this.a = b;
    }
}
