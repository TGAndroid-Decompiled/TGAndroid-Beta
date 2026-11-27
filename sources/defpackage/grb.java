package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.InputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.TimestampAligner;
import org.webrtc.TurnCustomizer;
public final class grb implements NativeLifecycleLock.NativeDisposer, fd, vob, wob, dz5, Vector.TLDeserializer, i5c, tq2, yj0, mvc {
    public final byte a;

    public grb(byte b) {
        this.a = b;
    }

    public static void g() {
        throw new IllegalStateException();
    }

    public static void h(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void i(String str) {
        throw new IllegalStateException(str);
    }

    public static void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static void o() {
        throw new ClassCastException();
    }

    public static void p(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    @Override
    public final Object a(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 25:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 26:
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                    break;
                }
                break;
            default:
                if (bitmap != null && !bitmap.isRecycled()) {
                    i = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                    break;
                }
                break;
        }
        return Integer.valueOf(i);
    }

    @Override
    public final InputStream b() {
        return a.b.getResources().openRawResource(2131623998);
    }

    @Override
    public final Object b0(am2 am2Var) {
        e5c lambda$getComponents$0;
        e5c lambda$getComponents$1;
        e5c lambda$getComponents$2;
        switch (this.a) {
            case 11:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(am2Var);
                return lambda$getComponents$0;
            case 12:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(am2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(am2Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 9:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final void dispose(long j) {
        switch (this.a) {
            case 2:
                TimestampAligner.lambda$dispose$1(j);
                return;
            default:
                TurnCustomizer.lambda$dispose$0(j);
                return;
        }
    }

    @Override
    public final void e(int i, View view) {
        l2c l2cVar = (l2c) view;
        ShapeDrawable shapeDrawable = l2cVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            l2cVar.f0.invalidateSelf();
        }
    }

    @Override
    public final int f(View view) {
        ShapeDrawable shapeDrawable = ((l2c) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public final void l(Exception exc) {
        cc4.g(exc, true);
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 3:
                idVar.dismiss();
                return;
            case 4:
                idVar.dismiss();
                return;
            case 24:
                idVar.dismiss();
                return;
            default:
                idVar.dismiss();
                return;
        }
    }

    @Override
    public final void d(Exception exc) {
    }
}
