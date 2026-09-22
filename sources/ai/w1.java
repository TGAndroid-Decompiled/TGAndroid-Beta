package ai;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
    public final int f1637a;

    public w1(int i10) {
        this.f1637a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    public Constructor a() {
        switch (this.f1637a) {
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
    public Object apply(Object obj) {
        e9.a1 i10;
        e9.a1 j3;
        int i11 = 0;
        switch (this.f1637a) {
            case 10:
                b2.w wVar = (b2.w) obj;
                return wVar.f3338a + ": " + wVar.f3339b;
            case 11:
                b2.e1 e1Var = (b2.e1) obj;
                e1Var.getClass();
                Bundle bundle = new Bundle();
                int i12 = e1Var.f2979a;
                if (i12 != 0) {
                    bundle.putInt(b2.e1.d, i12);
                }
                int i13 = e1Var.f2980b;
                if (i13 != 0) {
                    bundle.putInt(b2.e1.e, i13);
                }
                int i14 = e1Var.f2981c;
                if (i14 != 0) {
                    bundle.putInt(b2.e1.f2978f, i14);
                }
                return bundle;
            case 12:
                b2.j0 j0Var = (b2.j0) obj;
                j0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.j0.h, j0Var.f3041a);
                String str = j0Var.f3042b;
                if (str != null) {
                    bundle2.putString(b2.j0.f3035i, str);
                }
                String str2 = j0Var.f3043c;
                if (str2 != null) {
                    bundle2.putString(b2.j0.f3036j, str2);
                }
                int i15 = j0Var.d;
                if (i15 != 0) {
                    bundle2.putInt(b2.j0.f3037k, i15);
                }
                int i16 = j0Var.e;
                if (i16 != 0) {
                    bundle2.putInt(b2.j0.f3038l, i16);
                }
                String str3 = j0Var.f3044f;
                if (str3 != null) {
                    bundle2.putString(b2.j0.f3039m, str3);
                }
                String str4 = j0Var.f3045g;
                if (str4 != null) {
                    bundle2.putString(b2.j0.f3040n, str4);
                }
                return bundle2;
            case 13:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.j0.h);
                uri.getClass();
                String string = bundle3.getString(b2.j0.f3035i);
                String string2 = bundle3.getString(b2.j0.f3036j);
                int i17 = bundle3.getInt(b2.j0.f3037k, 0);
                int i18 = bundle3.getInt(b2.j0.f3038l, 0);
                String string3 = bundle3.getString(b2.j0.f3039m);
                String string4 = bundle3.getString(b2.j0.f3040n);
                ?? obj2 = new Object();
                obj2.f3019c = uri;
                obj2.d = b2.r0.n(string);
                obj2.e = string2;
                obj2.f3017a = i17;
                obj2.f3018b = i18;
                obj2.f3020f = string3;
                obj2.f3021g = string4;
                return new b2.j0(obj2);
            case 14:
                Bundle bundle4 = (Bundle) obj;
                b2.s sVar = b2.s.U;
                b2.r rVar = new b2.r();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.d.class.getClassLoader();
                    String str5 = e2.d0.f7885a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.s.V);
                String str6 = sVar.f3292a;
                if (string5 == null) {
                    string5 = str6;
                }
                rVar.f3237a = string5;
                String string6 = bundle4.getString(b2.s.W);
                String str7 = sVar.f3293b;
                if (string6 == null) {
                    string6 = str7;
                }
                rVar.f3238b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.s.A0);
                if (parcelableArrayList == null) {
                    i10 = e9.a1.e;
                } else {
                    e9.f0 u10 = e9.i0.u();
                    for (int i19 = 0; i19 < parcelableArrayList.size(); i19++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i19);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.w.f3337c);
                        String string8 = bundle5.getString(b2.w.d);
                        string8.getClass();
                        u10.b(new b2.w(string7, string8));
                    }
                    i10 = u10.i();
                }
                rVar.f3239c = e9.i0.v(i10);
                String string9 = bundle4.getString(b2.s.X);
                String str8 = sVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                rVar.d = string9;
                rVar.e = bundle4.getInt(b2.s.Y, sVar.e);
                rVar.f3240f = bundle4.getInt(b2.s.Z, sVar.f3295f);
                rVar.f3241g = bundle4.getInt(b2.s.B0, sVar.f3296g);
                rVar.h = bundle4.getInt(b2.s.f3267a0, sVar.h);
                rVar.f3242i = bundle4.getInt(b2.s.f3268b0, sVar.f3297i);
                String string10 = bundle4.getString(b2.s.f3269c0);
                String str9 = sVar.f3299k;
                if (string10 == null) {
                    string10 = str9;
                }
                rVar.f3243j = string10;
                String string11 = bundle4.getString(b2.s.f3270d0);
                String str10 = sVar.f3305q;
                if (string11 == null) {
                    string11 = str10;
                }
                rVar.f3249p = b2.r0.n(string11);
                String string12 = bundle4.getString(b2.s.f3271e0);
                String str11 = sVar.f3306r;
                if (string12 == null) {
                    string12 = str11;
                }
                rVar.f3250q = b2.r0.n(string12);
                rVar.f3251r = bundle4.getInt(b2.s.f3272f0, sVar.f3307s);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.s.f3273g0 + "_" + Integer.toString(i11, 36));
                    if (byteArray == null) {
                        rVar.f3253t = arrayList;
                        rVar.f3254u = (b2.o) bundle4.getParcelable(b2.s.f3274h0);
                        rVar.v = bundle4.getLong(b2.s.f3275i0, sVar.f3310w);
                        rVar.f3256x = bundle4.getInt(b2.s.f3276j0, sVar.f3312y);
                        rVar.f3257y = bundle4.getInt(b2.s.f3277k0, sVar.f3313z);
                        rVar.f3258z = bundle4.getInt(b2.s.D0, sVar.A);
                        rVar.A = bundle4.getInt(b2.s.E0, sVar.B);
                        rVar.B = bundle4.getFloat(b2.s.f3278l0, sVar.C);
                        rVar.C = bundle4.getInt(b2.s.m0, sVar.D);
                        rVar.D = bundle4.getFloat(b2.s.f3279n0, sVar.E);
                        rVar.E = bundle4.getByteArray(b2.s.f3280o0);
                        rVar.F = bundle4.getInt(b2.s.f3281p0, sVar.G);
                        rVar.H = bundle4.getInt(b2.s.C0, sVar.I);
                        Bundle bundle6 = bundle4.getBundle(b2.s.f3282q0);
                        if (bundle6 != null) {
                            rVar.G = new b2.j(bundle6.getInt(b2.j.f3024i, -1), bundle6.getInt(b2.j.f3025j, -1), bundle6.getInt(b2.j.f3026k, -1), bundle6.getByteArray(b2.j.f3027l), bundle6.getInt(b2.j.f3028m, -1), bundle6.getInt(b2.j.f3029n, -1));
                        }
                        rVar.I = bundle4.getInt(b2.s.f3283r0, sVar.J);
                        rVar.J = bundle4.getInt(b2.s.f3284s0, sVar.K);
                        rVar.K = bundle4.getInt(b2.s.f3285t0, sVar.L);
                        rVar.L = bundle4.getInt(b2.s.f3286u0, sVar.M);
                        rVar.M = bundle4.getInt(b2.s.f3287v0, sVar.N);
                        rVar.N = bundle4.getInt(b2.s.f3288w0, sVar.O);
                        rVar.P = bundle4.getInt(b2.s.f3290y0, sVar.Q);
                        rVar.Q = bundle4.getInt(b2.s.f3291z0, sVar.R);
                        rVar.R = bundle4.getInt(b2.s.f3289x0, sVar.S);
                        return new b2.s(rVar);
                    }
                    arrayList.add(byteArray);
                    i11++;
                }
            case 15:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(b2.m1.f3114c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(b2.l1.f3086f);
                if (parcelableArrayList2 == null) {
                    e9.g0 g0Var = e9.i0.f8081b;
                    j3 = e9.a1.e;
                } else {
                    j3 = e2.d.j(new w1(14), parcelableArrayList2);
                }
                b2.l1 l1Var = new b2.l1(bundle8.getString(b2.l1.f3087g, ""), (b2.s[]) j3.toArray(new b2.s[0]));
                int[] intArray = bundle7.getIntArray(b2.m1.d);
                intArray.getClass();
                return new b2.m1(l1Var, v7.y7.a(intArray));
            case 16:
                b2.r1 r1Var = (b2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(b2.r1.f3261f, r1Var.f3265b.c());
                bundle9.putIntArray(b2.r1.f3262g, r1Var.d);
                bundle9.putBooleanArray(b2.r1.h, r1Var.e);
                bundle9.putBoolean(b2.r1.f3263i, r1Var.f3266c);
                return bundle9;
            case 17:
            case 18:
            case 19:
            default:
                wa.e eVar = (wa.e) obj;
                eVar.getClass();
                aa.a aVar = com.google.firebase.messaging.r.f7344a;
                aVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    aVar.j(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 20:
                ca.a.f4179b.getClass();
                return z9.a.f48732a.e((y9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void b(Object obj, float f7) {
        m2 m2Var = (m2) obj;
        switch (this.f1637a) {
            case 2:
                WindowManager.LayoutParams layoutParams = m2Var.f1231c;
                m2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.f1230b, m2Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = m2Var.f1231c;
                m2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.f1230b, m2Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1637a) {
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
        switch (this.f1637a) {
            case 1:
                return m2Var.N;
            default:
                return m2Var.O;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = ci.x3.f5729j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f1637a) {
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
