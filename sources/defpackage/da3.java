package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Set;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.webrtc.DtmfSender;
import org.webrtc.JniCommon;
import org.webrtc.NativeLifecycleLock;
public final class da3 implements b86, tq2, fd, vob, wob, or3, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeDisposer {
    public final byte a;

    public static void b(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public final Constructor a() {
        switch (this.a) {
            case 10:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(e84.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(e84.class).getConstructor(null);
        }
    }

    @Override
    public final Object b0(am2 am2Var) {
        Set N = am2Var.N(aa0.class);
        wz4 wz4Var = wz4.b;
        if (wz4Var == null) {
            synchronized (wz4.class) {
                wz4Var = wz4.b;
                if (wz4Var == null) {
                    wz4Var = new wz4((byte) 0);
                    wz4.b = wz4Var;
                }
            }
        }
        return new md3(N, wz4Var);
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$canInsertDtmf$0;
        String lambda$tones$2;
        Integer lambda$duration$3;
        Integer lambda$interToneGap$4;
        switch (this.a) {
            case 25:
                lambda$canInsertDtmf$0 = DtmfSender.lambda$canInsertDtmf$0(j);
                return lambda$canInsertDtmf$0;
            case 26:
                lambda$tones$2 = DtmfSender.lambda$tones$2(j);
                return lambda$tones$2;
            case 27:
                lambda$duration$3 = DtmfSender.lambda$duration$3(j);
                return lambda$duration$3;
            default:
                lambda$interToneGap$4 = DtmfSender.lambda$interToneGap$4(j);
                return lambda$interToneGap$4;
        }
    }

    @Override
    public final void dispose(long j) {
        JniCommon.nativeReleaseRef(j);
    }

    @Override
    public final void e(int i, View view) {
        Drawable background = view.getBackground();
        if (background instanceof zm2) {
            Drawable drawable = ((zm2) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i);
                view.invalidate();
            }
        }
    }

    @Override
    public final int f(View view) {
        Drawable background = view.getBackground();
        if (background instanceof zm2) {
            Drawable drawable = ((zm2) background).a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        vj vjVar = (vj) obj;
        switch (this.a) {
            case 0:
                vjVar.getClass();
                return;
            case 1:
                vjVar.getClass();
                return;
            case 2:
                vjVar.getClass();
                return;
            case 3:
                vjVar.getClass();
                return;
            case 4:
                vjVar.getClass();
                return;
            case 5:
                vjVar.getClass();
                return;
            case 6:
                vjVar.getClass();
                return;
            case 7:
                vjVar.getClass();
                return;
            case 8:
                vjVar.getClass();
                return;
            default:
                vjVar.getClass();
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 15:
                uc7.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            default:
                uc7.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
        }
    }

    public da3(byte b) {
        this.a = b;
    }

    @Override
    public final void release() {
    }
}
