package c3;

import android.view.WindowManager;
import ci.o1;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import ei.q3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import z9.e2;
public final class m implements n, NativeInstance.AudioLevelsCallback, fw0, gw0, z1, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final int f4649a;

    public m(int i10) {
        this.f4649a = i10;
    }

    @Override
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(q.class).getConstructor(null);
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f4649a) {
            case 13:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                g3 g3Var = com.google.firebase.messaging.o.f7667a;
                g3Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g3Var.z(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 14:
                return Integer.valueOf(((d2.b) obj).f7779r);
            default:
                da.a.f7918b.getClass();
                return aa.b.f361a.M((e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void b(Object obj, float f7) {
        o1 o1Var = (o1) obj;
        switch (this.f4649a) {
            case 3:
                WindowManager.LayoutParams layoutParams = o1Var.f5619c;
                o1Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.f5618b, o1Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = o1Var.f5619c;
                o1Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.f5618b, o1Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f4649a) {
            case 6:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        o1 o1Var = (o1) obj;
        switch (this.f4649a) {
            case 2:
                return o1Var.N;
            default:
                return o1Var.O;
        }
    }

    @Override
    public int i(g6 g6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f4649a) {
            case 19:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return fh.c.m(f7, k6.w0(k6.f21183d6, g6Var), k6.w0(k6.Sd, g6Var));
            case 20:
                if (!LiteMode.isEnabled(256)) {
                    return k6.x0(null, k6.G8, false);
                }
                int x02 = k6.x0(null, k6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return k6.o1(f10, x02);
            case 21:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return fh.c.m(f11, k6.w0(k6.f21183d6, g6Var), k6.w0(k6.Zk, g6Var));
            case 22:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return k6.o1(f12, k6.w0(k6.Fi, g6Var));
            case 23:
                return 855638016;
            case 24:
                return 1073741824;
            case 25:
                return k6.o1(0.075f, -16777216);
            case 26:
                return k6.o1(0.88f, k6.w0(k6.f21183d6, g6Var));
            case 27:
                int x03 = k6.x0(null, k6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return k6.o1(f13, x03);
            case 28:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return fh.c.m(f14, k6.w0(k6.f21183d6, g6Var), k6.w0(k6.Yk, g6Var));
            default:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return k6.o1(f15, k6.w0(k6.f21183d6, g6Var));
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        return FirebaseMessagingRegistrar.a(z5Var);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = q3.f9636j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f4649a) {
            case 9:
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
