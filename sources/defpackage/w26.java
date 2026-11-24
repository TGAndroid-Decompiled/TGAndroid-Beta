package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
public final class w26 implements us2, pk6, js4, sv6, lx6 {
    public final byte a;

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static MediaRoute2Info e(Object obj) {
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
        String str = ((ik6) obj).a;
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
            case 1:
                ((ExecutorService) obj).shutdown();
                return;
            case 27:
                ((ad8) obj).C0();
                return;
            default:
                ((ad8) obj).d0();
                return;
        }
    }

    @Override
    public final void f(ru6 ru6Var, int i) {
        switch (this.a) {
            case 22:
                ru6Var.getClass();
                return;
            case 23:
                ru6Var.b(i);
                return;
            default:
                ru6Var.getClass();
                return;
        }
    }

    @Override
    public final Object m(Object obj) {
        Void r1 = (Void) obj;
        switch (this.a) {
            case 16:
                return new TLRPC.TL_messageEntityBold();
            case 17:
                return new TLRPC.TL_messageEntityItalic();
            case 18:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        switch (this.a) {
            case 25:
                tv6Var.getClass();
                throw new ClassCastException();
            case 26:
                tv6Var.getClass();
                throw new ClassCastException();
            default:
                return tv6Var.m(su6Var);
        }
    }

    public w26(byte b) {
        this.a = b;
    }
}
