package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.AudioRecordingConfiguration;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.InputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class rjb implements ln5, ee, xmb, ymb, yy5, Vector.TLDeserializer, j3c, lr2, xk0, atc {
    public final byte a;

    public rjb(byte b) {
        this.a = b;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static void h() {
        throw new IllegalStateException();
    }

    public static void i(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void j(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static void p() {
        throw new ClassCastException();
    }

    @Override
    public final Object X(sm2 sm2Var) {
        f3c lambda$getComponents$0;
        f3c lambda$getComponents$1;
        f3c lambda$getComponents$2;
        switch (this.a) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(sm2Var);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(sm2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(sm2Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public final InputStream a() {
        return a.b.getResources().openRawResource(2131623998);
    }

    @Override
    public final Object b(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 22:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 23:
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
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!(imageReceiver.k0 instanceof e84) && !(imageReceiver.T instanceof e84) && !(imageReceiver.b0 instanceof e84) && !(imageReceiver.n0 instanceof e84)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return;
        }
        imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 8:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final void e(int i, View view) {
        m0c m0cVar = (m0c) view;
        ShapeDrawable shapeDrawable = m0cVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            m0cVar.f0.invalidateSelf();
        }
    }

    @Override
    public final int g(View view) {
        ShapeDrawable shapeDrawable = ((m0c) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public final void o(Exception exc) {
        fc4.g(exc, true);
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 2:
                heVar.dismiss();
                return;
            case 3:
                heVar.dismiss();
                return;
            case 21:
                heVar.dismiss();
                return;
            default:
                heVar.dismiss();
                return;
        }
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void d(Exception exc) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
