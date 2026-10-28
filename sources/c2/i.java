package c2;

import a8.me;
import aa.g2;
import android.content.pm.ShortcutManager;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import di.o1;
import fi.o3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
public final class i implements Continuation, s9.d, j5.e, e9.k, NativeInstance.AudioLevelsCallback, ow0, pw0, b2, GenericProvider, Utilities.Callback2Return, fh.d {
    public final int f5949a;

    public i(int i10) {
        this.f5949a = i10;
    }

    public static ShortcutManager c(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class e() {
        return ShortcutManager.class;
    }

    public Constructor a() {
        switch (this.f5949a) {
            case 1:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(c3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(c3.o.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f5949a) {
            case 8:
                ya.e eVar = (ya.e) obj;
                eVar.getClass();
                k6.c cVar = com.google.firebase.messaging.n.f7754a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.s(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 9:
                return Integer.valueOf(((d2.b) obj).f7871r);
            default:
                ea.a.f9858b.getClass();
                return ba.a.f3719a.c((g2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void b(Object obj, float f7) {
        o1 o1Var = (o1) obj;
        switch (this.f5949a) {
            case 12:
                WindowManager.LayoutParams layoutParams = o1Var.f8858c;
                o1Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.f8857b, o1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = o1Var.f8858c;
                o1Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.f8857b, o1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public Object d1(me meVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(meVar);
        return lambda$getComponents$0;
    }

    @Override
    public float get(Object obj) {
        o1 o1Var = (o1) obj;
        switch (this.f5949a) {
            case 11:
                return o1Var.N;
            default:
                return o1Var.O;
        }
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f5949a) {
            case 15:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public int i(u6 u6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        switch (this.f5949a) {
            case 26:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return gh.c.n(f7, y6.w0(y6.f23357d6, u6Var), y6.w0(y6.Sd, u6Var));
            case 27:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return y6.o1(f10, y6.w0(y6.f23357d6, u6Var));
            case 28:
                if (!LiteMode.isEnabled(256)) {
                    return y6.x0(null, y6.G8, false);
                }
                int x02 = y6.x0(null, y6.G8, false);
                if (z10) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return y6.o1(f11, x02);
            default:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return gh.c.n(f12, y6.w0(y6.f23357d6, u6Var), y6.w0(y6.Zk, u6Var));
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = o3.f11334j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f5949a) {
            case 4:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
