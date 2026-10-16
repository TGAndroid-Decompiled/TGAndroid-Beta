package bi;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class w2 implements org.telegram.ui.ActionBar.z1, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final int f3898a;

    public w2(int i10) {
        this.f3898a = i10;
    }

    public Constructor a() {
        switch (this.f3898a) {
            case 2:
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
        switch (this.f3898a) {
            case 9:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                m.h3 h3Var = com.google.firebase.messaging.p.f6204a;
                h3Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    h3Var.x(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 10:
                return Integer.valueOf(((d2.b) obj).f6314r);
            default:
                da.a.f6453b.getClass();
                return aa.b.f363a.b1((z9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f3898a) {
            case 15:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return fh.b.m(f7, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sd, c6Var));
            case 16:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                }
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return org.telegram.ui.ActionBar.g6.m1(f10, x02);
            case 17:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return fh.b.m(f11, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Zk, c6Var));
            case 18:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.m1(f12, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fi, c6Var));
            case 19:
                return 855638016;
            case 20:
                return 1073741824;
            case 21:
                return org.telegram.ui.ActionBar.g6.m1(0.075f, -16777216);
            case 22:
                return org.telegram.ui.ActionBar.g6.m1(0.88f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
            case 23:
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return org.telegram.ui.ActionBar.g6.m1(f13, x03);
            case 24:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return fh.b.m(f14, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Yk, c6Var));
            case 25:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.m1(f15, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
            case 26:
                return org.telegram.ui.ActionBar.g6.m1(0.78f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var));
            case 27:
                return org.telegram.ui.ActionBar.g6.m1(0.7f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
            case 28:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.m1(f16, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override
    public Object n2(com.google.android.gms.internal.cast.z5 z5Var) {
        return FirebaseMessagingRegistrar.a(z5Var);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = di.v3.f7979j0;
        return 0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            if (num.intValue() == 0) {
                return LocaleController.getString(R.string.LiveStoryPricePerCommentFree);
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f3898a) {
            case 5:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }
}
