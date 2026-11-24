package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class wa3 implements x76, lr2, ee, xmb, ymb, hs3, os4, ku4, Vector.TLDeserializer, z0c {
    public final byte a;

    public wa3(m54 m54Var) {
        this.a = (byte) 29;
    }

    public static void c(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static void d(String str) {
        throw new IOException(str);
    }

    public static void f(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public static void h(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override
    public final Object X(sm2 sm2Var) {
        Set N = sm2Var.N(ya0.class);
        sz4 sz4Var = sz4.b;
        if (sz4Var == null) {
            synchronized (sz4.class) {
                sz4Var = sz4.b;
                if (sz4Var == null) {
                    sz4Var = new sz4((byte) 0);
                    sz4.b = sz4Var;
                }
            }
        }
        return new ge3(N, sz4Var);
    }

    @Override
    public final u31 a(c41 c41Var) {
        return c41Var.k(false);
    }

    @Override
    public final Object apply(Object obj) {
        e8a e8aVar = (e8a) obj;
        String s = f8a.b.s(e8aVar);
        s.getClass();
        e8aVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = s.getBytes(jl1.a);
        bytes.getClass();
        return bytes;
    }

    public final Constructor b() {
        switch (this.a) {
            case 5:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(s84.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(s84.class).getConstructor(null);
        }
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
    }

    @Override
    public final void e(int i, View view) {
        Drawable background = view.getBackground();
        if (background instanceof sn2) {
            Drawable drawable = ((sn2) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i);
                view.invalidate();
            }
        }
    }

    @Override
    public final int g(View view) {
        Drawable background = view.getBackground();
        if (background instanceof sn2) {
            Drawable drawable = ((sn2) background).a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        switch (this.a) {
            case 0:
                ukVar.getClass();
                return;
            case 1:
                ukVar.getClass();
                return;
            case 2:
                ukVar.getClass();
                return;
            case 3:
                ukVar.getClass();
                return;
            default:
                ukVar.getClass();
                return;
        }
    }

    @Override
    public final Object l(Object obj) {
        Integer num = (Integer) obj;
        int i = e34.U2;
        return 0;
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 10:
                oc7.e1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            default:
                oc7.e1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
        }
    }

    public wa3(byte b) {
        this.a = b;
    }

    @Override
    public final void release() {
    }
}
