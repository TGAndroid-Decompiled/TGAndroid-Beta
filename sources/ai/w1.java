package ai;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
public final class w1 implements NativeInstance.AudioLevelsCallback, gv0, hv0, org.telegram.ui.ActionBar.a2, d9.e, i5.e, GenericProvider, Utilities.Callback2Return, Continuation, q9.d {
    public final int f1641a;

    public w1(int i10) {
        this.f1641a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override
    public void a(Object obj, float f7) {
        m2 m2Var = (m2) obj;
        switch (this.f1641a) {
            case 2:
                WindowManager.LayoutParams layoutParams = m2Var.f1233c;
                m2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.f1232b, m2Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = m2Var.f1233c;
                m2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.f1232b, m2Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        e9.a1 i10;
        e9.a1 j3;
        int i11 = 0;
        switch (this.f1641a) {
            case 10:
                b2.w wVar = (b2.w) obj;
                return wVar.f3333a + ": " + wVar.f3334b;
            case 11:
                b2.e1 e1Var = (b2.e1) obj;
                e1Var.getClass();
                Bundle bundle = new Bundle();
                int i12 = e1Var.f2974a;
                if (i12 != 0) {
                    bundle.putInt(b2.e1.d, i12);
                }
                int i13 = e1Var.f2975b;
                if (i13 != 0) {
                    bundle.putInt(b2.e1.e, i13);
                }
                int i14 = e1Var.f2976c;
                if (i14 != 0) {
                    bundle.putInt(b2.e1.f2973f, i14);
                }
                return bundle;
            case 12:
                b2.j0 j0Var = (b2.j0) obj;
                j0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.j0.h, j0Var.f3036a);
                String str = j0Var.f3037b;
                if (str != null) {
                    bundle2.putString(b2.j0.f3030i, str);
                }
                String str2 = j0Var.f3038c;
                if (str2 != null) {
                    bundle2.putString(b2.j0.f3031j, str2);
                }
                int i15 = j0Var.d;
                if (i15 != 0) {
                    bundle2.putInt(b2.j0.f3032k, i15);
                }
                int i16 = j0Var.e;
                if (i16 != 0) {
                    bundle2.putInt(b2.j0.f3033l, i16);
                }
                String str3 = j0Var.f3039f;
                if (str3 != null) {
                    bundle2.putString(b2.j0.f3034m, str3);
                }
                String str4 = j0Var.f3040g;
                if (str4 != null) {
                    bundle2.putString(b2.j0.f3035n, str4);
                }
                return bundle2;
            case 13:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.j0.h);
                uri.getClass();
                String string = bundle3.getString(b2.j0.f3030i);
                String string2 = bundle3.getString(b2.j0.f3031j);
                int i17 = bundle3.getInt(b2.j0.f3032k, 0);
                int i18 = bundle3.getInt(b2.j0.f3033l, 0);
                String string3 = bundle3.getString(b2.j0.f3034m);
                String string4 = bundle3.getString(b2.j0.f3035n);
                ?? obj2 = new Object();
                obj2.f3014c = uri;
                obj2.d = b2.r0.n(string);
                obj2.e = string2;
                obj2.f3012a = i17;
                obj2.f3013b = i18;
                obj2.f3015f = string3;
                obj2.f3016g = string4;
                return new b2.j0(obj2);
            case 14:
                Bundle bundle4 = (Bundle) obj;
                b2.s sVar = b2.s.U;
                b2.r rVar = new b2.r();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.d.class.getClassLoader();
                    String str5 = e2.d0.f7871a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.s.V);
                String str6 = sVar.f3287a;
                if (string5 == null) {
                    string5 = str6;
                }
                rVar.f3232a = string5;
                String string6 = bundle4.getString(b2.s.W);
                String str7 = sVar.f3288b;
                if (string6 == null) {
                    string6 = str7;
                }
                rVar.f3233b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.s.A0);
                if (parcelableArrayList == null) {
                    i10 = e9.a1.e;
                } else {
                    e9.f0 u10 = e9.i0.u();
                    for (int i19 = 0; i19 < parcelableArrayList.size(); i19++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i19);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.w.f3332c);
                        String string8 = bundle5.getString(b2.w.d);
                        string8.getClass();
                        u10.b(new b2.w(string7, string8));
                    }
                    i10 = u10.i();
                }
                rVar.f3234c = e9.i0.v(i10);
                String string9 = bundle4.getString(b2.s.X);
                String str8 = sVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                rVar.d = string9;
                rVar.e = bundle4.getInt(b2.s.Y, sVar.e);
                rVar.f3235f = bundle4.getInt(b2.s.Z, sVar.f3290f);
                rVar.f3236g = bundle4.getInt(b2.s.B0, sVar.f3291g);
                rVar.h = bundle4.getInt(b2.s.f3262a0, sVar.h);
                rVar.f3237i = bundle4.getInt(b2.s.f3263b0, sVar.f3292i);
                String string10 = bundle4.getString(b2.s.f3264c0);
                String str9 = sVar.f3294k;
                if (string10 == null) {
                    string10 = str9;
                }
                rVar.f3238j = string10;
                String string11 = bundle4.getString(b2.s.f3265d0);
                String str10 = sVar.f3300q;
                if (string11 == null) {
                    string11 = str10;
                }
                rVar.f3244p = b2.r0.n(string11);
                String string12 = bundle4.getString(b2.s.f3266e0);
                String str11 = sVar.f3301r;
                if (string12 == null) {
                    string12 = str11;
                }
                rVar.f3245q = b2.r0.n(string12);
                rVar.f3246r = bundle4.getInt(b2.s.f3267f0, sVar.f3302s);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.s.f3268g0 + "_" + Integer.toString(i11, 36));
                    if (byteArray == null) {
                        rVar.f3248t = arrayList;
                        rVar.f3249u = (b2.o) bundle4.getParcelable(b2.s.f3269h0);
                        rVar.v = bundle4.getLong(b2.s.f3270i0, sVar.f3305w);
                        rVar.f3251x = bundle4.getInt(b2.s.f3271j0, sVar.f3307y);
                        rVar.f3252y = bundle4.getInt(b2.s.f3272k0, sVar.f3308z);
                        rVar.f3253z = bundle4.getInt(b2.s.D0, sVar.A);
                        rVar.A = bundle4.getInt(b2.s.E0, sVar.B);
                        rVar.B = bundle4.getFloat(b2.s.f3273l0, sVar.C);
                        rVar.C = bundle4.getInt(b2.s.m0, sVar.D);
                        rVar.D = bundle4.getFloat(b2.s.f3274n0, sVar.E);
                        rVar.E = bundle4.getByteArray(b2.s.f3275o0);
                        rVar.F = bundle4.getInt(b2.s.f3276p0, sVar.G);
                        rVar.H = bundle4.getInt(b2.s.C0, sVar.I);
                        Bundle bundle6 = bundle4.getBundle(b2.s.f3277q0);
                        if (bundle6 != null) {
                            rVar.G = new b2.j(bundle6.getInt(b2.j.f3019i, -1), bundle6.getInt(b2.j.f3020j, -1), bundle6.getInt(b2.j.f3021k, -1), bundle6.getByteArray(b2.j.f3022l), bundle6.getInt(b2.j.f3023m, -1), bundle6.getInt(b2.j.f3024n, -1));
                        }
                        rVar.I = bundle4.getInt(b2.s.f3278r0, sVar.J);
                        rVar.J = bundle4.getInt(b2.s.f3279s0, sVar.K);
                        rVar.K = bundle4.getInt(b2.s.f3280t0, sVar.L);
                        rVar.L = bundle4.getInt(b2.s.f3281u0, sVar.M);
                        rVar.M = bundle4.getInt(b2.s.f3282v0, sVar.N);
                        rVar.N = bundle4.getInt(b2.s.f3283w0, sVar.O);
                        rVar.P = bundle4.getInt(b2.s.f3285y0, sVar.Q);
                        rVar.Q = bundle4.getInt(b2.s.f3286z0, sVar.R);
                        rVar.R = bundle4.getInt(b2.s.f3284x0, sVar.S);
                        return new b2.s(rVar);
                    }
                    arrayList.add(byteArray);
                    i11++;
                }
            case 15:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(b2.m1.f3109c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(b2.l1.f3081f);
                if (parcelableArrayList2 == null) {
                    e9.g0 g0Var = e9.i0.f8067b;
                    j3 = e9.a1.e;
                } else {
                    j3 = e2.d.j(new w1(14), parcelableArrayList2);
                }
                b2.l1 l1Var = new b2.l1(bundle8.getString(b2.l1.f3082g, ""), (b2.s[]) j3.toArray(new b2.s[0]));
                int[] intArray = bundle7.getIntArray(b2.m1.d);
                intArray.getClass();
                return new b2.m1(l1Var, v7.y7.a(intArray));
            case 16:
                b2.r1 r1Var = (b2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(b2.r1.f3256f, r1Var.f3260b.c());
                bundle9.putIntArray(b2.r1.f3257g, r1Var.d);
                bundle9.putBooleanArray(b2.r1.h, r1Var.e);
                bundle9.putBoolean(b2.r1.f3258i, r1Var.f3261c);
                return bundle9;
            default:
                ca.a.f4174b.getClass();
                return z9.a.f48682a.e((y9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    public Constructor b() {
        switch (this.f1641a) {
            case 18:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(c3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(c3.o.class).getConstructor(null);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1641a) {
            case 5:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        m2 m2Var = (m2) obj;
        switch (this.f1641a) {
            case 1:
                return m2Var.N;
            default:
                return m2Var.O;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = ci.w3.f5703j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f1641a) {
            case 25:
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
