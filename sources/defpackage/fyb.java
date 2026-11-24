package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.media.AudioRecordingConfiguration;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.InputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class fyb implements xkb, yw5, Vector.TLDeserializer, j1c, aq2, ed, xj0, yqc {
    public final byte a;

    public fyb(byte b) {
        this.a = b;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static void g() {
        throw new ClassCastException();
    }

    public static void h(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void i(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @Override
    public final Object L(gl2 gl2Var) {
        f1c lambda$getComponents$0;
        f1c lambda$getComponents$1;
        f1c lambda$getComponents$2;
        switch (this.a) {
            case 4:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(gl2Var);
                return lambda$getComponents$0;
            case 5:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(gl2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(gl2Var);
                return lambda$getComponents$2;
        }
    }

    @Override
    public final Object a(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 16:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 17:
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
    public final void d(int i, View view) {
        lyb lybVar = (lyb) view;
        ShapeDrawable shapeDrawable = lybVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            lybVar.f0.invalidateSelf();
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 2:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final void n(Exception exc) {
        fa4.g(exc, true);
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 15:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    @Override
    public final void e(Exception exc) {
    }
}
