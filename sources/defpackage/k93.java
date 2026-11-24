package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class k93 implements x56, aq2, ed, wkb, xkb, xq3, nq4, js4, Vector.TLDeserializer, yyb {
    public final byte a;

    public k93(c44 c44Var) {
        this.a = (byte) 28;
    }

    public static void c(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void f(String str) {
        throw new IOException(str);
    }

    public static void g(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public static void h(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 8:
                Set O = gl2Var.O(y90.class);
                qx4 qx4Var = qx4.b;
                if (qx4Var == null) {
                    synchronized (qx4.class) {
                        qx4Var = qx4.b;
                        if (qx4Var == null) {
                            qx4Var = new qx4((byte) 0);
                            qx4.b = qx4Var;
                        }
                    }
                }
                return new tc3(O, qx4Var);
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
        }
    }

    @Override
    public final m21 a(u21 u21Var) {
        return u21Var.k(false);
    }

    @Override
    public final Object apply(Object obj) {
        c6a c6aVar = (c6a) obj;
        String q = d6a.b.q(c6aVar);
        q.getClass();
        c6aVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = q.getBytes(bk1.a);
        bytes.getClass();
        return bytes;
    }

    public final Constructor b() {
        switch (this.a) {
            case 4:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(j74.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(j74.class).getConstructor(null);
        }
    }

    @Override
    public final void d(int i, View view) {
        Drawable background = view.getBackground();
        if (background instanceof fm2) {
            Drawable drawable = ((fm2) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i);
                view.invalidate();
            }
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
    }

    @Override
    public final int e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof fm2) {
            Drawable drawable = ((fm2) background).a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        uj ujVar = (uj) obj;
        switch (this.a) {
            case 0:
                ujVar.getClass();
                return;
            case 1:
                ujVar.getClass();
                return;
            case 2:
                ujVar.getClass();
                return;
            default:
                ujVar.getClass();
                return;
        }
    }

    @Override
    public final Object m(Object obj) {
        Integer num = (Integer) obj;
        int i = t14.U2;
        return 0;
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 9:
                na7.d1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            default:
                na7.d1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
        }
    }

    public k93(byte b) {
        this.a = b;
    }

    @Override
    public final void release() {
    }
}
