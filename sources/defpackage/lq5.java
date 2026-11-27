package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class lq5 implements nu4, kk4, fd, ot2, vm6 {
    public final byte a;

    public lq5(byte b) {
        this.a = b;
    }

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static void f() {
        throw new AssertionError();
    }

    public static void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static void j(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void n() {
        throw new NoSuchElementException();
    }

    public static void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override
    public final int a(Object obj) {
        String str = ((nm6) obj).a;
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
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public final Object h(Object obj) {
        Void r7 = (Void) obj;
        switch (this.a) {
            case 3:
                int L = hl.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(hl.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(aob.w0(null, aob.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 4:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = hl.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f, f, f, paint2);
                return createBitmap2;
            case 7:
                String str = LaunchActivity.C1;
                return new fj6();
            case 28:
                return new TLRPC.TL_messageEntityBold();
            default:
                return new TLRPC.TL_messageEntityItalic();
        }
    }

    @Override
    public final boolean run() {
        String str = LaunchActivity.C1;
        if (xea.r.length() > 0 && !xea.z) {
            return true;
        }
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 10:
                idVar.dismiss();
                return;
            default:
                idVar.dismiss();
                return;
        }
    }
}
