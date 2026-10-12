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
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
public final class w1 implements NativeInstance.AudioLevelsCallback, pw0, qw0, org.telegram.ui.ActionBar.z1, d9.e, i5.e, GenericProvider, Utilities.Callback2Return, Continuation, q9.d {
    public final int f1840a;

    public w1(int i10) {
        this.f1840a = i10;
    }

    public Constructor a() {
        switch (this.f1840a) {
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
        switch (this.f1840a) {
            case 10:
                b2.w wVar = (b2.w) obj;
                return wVar.f3676a + ": " + wVar.f3677b;
            case 11:
                b2.e1 e1Var = (b2.e1) obj;
                e1Var.getClass();
                Bundle bundle = new Bundle();
                int i12 = e1Var.f3292a;
                if (i12 != 0) {
                    bundle.putInt(b2.e1.d, i12);
                }
                int i13 = e1Var.f3293b;
                if (i13 != 0) {
                    bundle.putInt(b2.e1.f3290e, i13);
                }
                int i14 = e1Var.f3294c;
                if (i14 != 0) {
                    bundle.putInt(b2.e1.f3291f, i14);
                }
                return bundle;
            case 12:
                b2.j0 j0Var = (b2.j0) obj;
                j0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.j0.h, j0Var.f3362a);
                String str = j0Var.f3363b;
                if (str != null) {
                    bundle2.putString(b2.j0.f3356i, str);
                }
                String str2 = j0Var.f3364c;
                if (str2 != null) {
                    bundle2.putString(b2.j0.f3357j, str2);
                }
                int i15 = j0Var.d;
                if (i15 != 0) {
                    bundle2.putInt(b2.j0.f3358k, i15);
                }
                int i16 = j0Var.f3365e;
                if (i16 != 0) {
                    bundle2.putInt(b2.j0.f3359l, i16);
                }
                String str3 = j0Var.f3366f;
                if (str3 != null) {
                    bundle2.putString(b2.j0.f3360m, str3);
                }
                String str4 = j0Var.f3367g;
                if (str4 != null) {
                    bundle2.putString(b2.j0.f3361n, str4);
                }
                return bundle2;
            case 13:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.j0.h);
                uri.getClass();
                String string = bundle3.getString(b2.j0.f3356i);
                String string2 = bundle3.getString(b2.j0.f3357j);
                int i17 = bundle3.getInt(b2.j0.f3358k, 0);
                int i18 = bundle3.getInt(b2.j0.f3359l, 0);
                String string3 = bundle3.getString(b2.j0.f3360m);
                String string4 = bundle3.getString(b2.j0.f3361n);
                ?? obj2 = new Object();
                obj2.f3337c = uri;
                obj2.d = b2.r0.n(string);
                obj2.f3338e = string2;
                obj2.f3335a = i17;
                obj2.f3336b = i18;
                obj2.f3339f = string3;
                obj2.f3340g = string4;
                return new b2.j0(obj2);
            case 14:
                Bundle bundle4 = (Bundle) obj;
                b2.s sVar = b2.s.U;
                b2.r rVar = new b2.r();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.d.class.getClassLoader();
                    String str5 = e2.d0.f8529a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.s.V);
                String str6 = sVar.f3626a;
                if (string5 == null) {
                    string5 = str6;
                }
                rVar.f3569a = string5;
                String string6 = bundle4.getString(b2.s.W);
                String str7 = sVar.f3627b;
                if (string6 == null) {
                    string6 = str7;
                }
                rVar.f3570b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.s.A0);
                if (parcelableArrayList == null) {
                    i10 = e9.a1.f8712e;
                } else {
                    e9.f0 u10 = e9.i0.u();
                    for (int i19 = 0; i19 < parcelableArrayList.size(); i19++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i19);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.w.f3675c);
                        String string8 = bundle5.getString(b2.w.d);
                        string8.getClass();
                        u10.b(new b2.w(string7, string8));
                    }
                    i10 = u10.i();
                }
                rVar.f3571c = e9.i0.v(i10);
                String string9 = bundle4.getString(b2.s.X);
                String str8 = sVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                rVar.d = string9;
                rVar.f3572e = bundle4.getInt(b2.s.Y, sVar.f3629e);
                rVar.f3573f = bundle4.getInt(b2.s.Z, sVar.f3630f);
                rVar.f3574g = bundle4.getInt(b2.s.B0, sVar.f3631g);
                rVar.h = bundle4.getInt(b2.s.f3601a0, sVar.h);
                rVar.f3575i = bundle4.getInt(b2.s.f3602b0, sVar.f3632i);
                String string10 = bundle4.getString(b2.s.f3603c0);
                String str9 = sVar.f3634k;
                if (string10 == null) {
                    string10 = str9;
                }
                rVar.f3576j = string10;
                String string11 = bundle4.getString(b2.s.f3604d0);
                String str10 = sVar.f3640q;
                if (string11 == null) {
                    string11 = str10;
                }
                rVar.f3582p = b2.r0.n(string11);
                String string12 = bundle4.getString(b2.s.f3605e0);
                String str11 = sVar.f3641r;
                if (string12 == null) {
                    string12 = str11;
                }
                rVar.f3583q = b2.r0.n(string12);
                rVar.f3584r = bundle4.getInt(b2.s.f3606f0, sVar.f3642s);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.s.f3607g0 + "_" + Integer.toString(i11, 36));
                    if (byteArray == null) {
                        rVar.f3586t = arrayList;
                        rVar.f3587u = (b2.o) bundle4.getParcelable(b2.s.f3608h0);
                        rVar.v = bundle4.getLong(b2.s.f3609i0, sVar.f3645w);
                        rVar.f3589x = bundle4.getInt(b2.s.f3610j0, sVar.f3647y);
                        rVar.f3590y = bundle4.getInt(b2.s.f3611k0, sVar.f3648z);
                        rVar.f3591z = bundle4.getInt(b2.s.D0, sVar.A);
                        rVar.A = bundle4.getInt(b2.s.E0, sVar.B);
                        rVar.B = bundle4.getFloat(b2.s.f3612l0, sVar.C);
                        rVar.C = bundle4.getInt(b2.s.m0, sVar.D);
                        rVar.D = bundle4.getFloat(b2.s.f3613n0, sVar.E);
                        rVar.E = bundle4.getByteArray(b2.s.f3614o0);
                        rVar.F = bundle4.getInt(b2.s.f3615p0, sVar.G);
                        rVar.H = bundle4.getInt(b2.s.C0, sVar.I);
                        Bundle bundle6 = bundle4.getBundle(b2.s.f3616q0);
                        if (bundle6 != null) {
                            rVar.G = new b2.j(bundle6.getInt(b2.j.f3344i, -1), bundle6.getInt(b2.j.f3345j, -1), bundle6.getInt(b2.j.f3346k, -1), bundle6.getByteArray(b2.j.f3347l), bundle6.getInt(b2.j.f3348m, -1), bundle6.getInt(b2.j.f3349n, -1));
                        }
                        rVar.I = bundle4.getInt(b2.s.f3617r0, sVar.J);
                        rVar.J = bundle4.getInt(b2.s.f3618s0, sVar.K);
                        rVar.K = bundle4.getInt(b2.s.f3619t0, sVar.L);
                        rVar.L = bundle4.getInt(b2.s.f3620u0, sVar.M);
                        rVar.M = bundle4.getInt(b2.s.f3621v0, sVar.N);
                        rVar.N = bundle4.getInt(b2.s.f3622w0, sVar.O);
                        rVar.P = bundle4.getInt(b2.s.f3624y0, sVar.Q);
                        rVar.Q = bundle4.getInt(b2.s.f3625z0, sVar.R);
                        rVar.R = bundle4.getInt(b2.s.f3623x0, sVar.S);
                        return new b2.s(rVar);
                    }
                    arrayList.add(byteArray);
                    i11++;
                }
            case 15:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(b2.m1.f3441c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(b2.l1.f3411f);
                if (parcelableArrayList2 == null) {
                    e9.g0 g0Var = e9.i0.f8749b;
                    j3 = e9.a1.f8712e;
                } else {
                    j3 = e2.d.j(new w1(14), parcelableArrayList2);
                }
                b2.l1 l1Var = new b2.l1(bundle8.getString(b2.l1.f3412g, ""), (b2.s[]) j3.toArray(new b2.s[0]));
                int[] intArray = bundle7.getIntArray(b2.m1.d);
                intArray.getClass();
                return new b2.m1(l1Var, v7.v7.a(intArray));
            case 16:
                b2.r1 r1Var = (b2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(b2.r1.f3594f, r1Var.f3598b.c());
                bundle9.putIntArray(b2.r1.f3595g, r1Var.d);
                bundle9.putBooleanArray(b2.r1.h, r1Var.f3600e);
                bundle9.putBoolean(b2.r1.f3596i, r1Var.f3599c);
                return bundle9;
            case 17:
            case 18:
            case 19:
            default:
                wa.e eVar = (wa.e) obj;
                eVar.getClass();
                aa.a aVar = com.google.firebase.messaging.q.f7962a;
                aVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    aVar.i(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 20:
                ca.a.f4562b.getClass();
                return z9.a.f54415a.k0((y9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override
    public void b(Object obj, float f7) {
        n2 n2Var = (n2) obj;
        switch (this.f1840a) {
            case 2:
                WindowManager.LayoutParams layoutParams = n2Var.f1446c;
                n2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(n2Var.f1445b, n2Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = n2Var.f1446c;
                n2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(n2Var.f1445b, n2Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f1840a) {
            case 5:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        n2 n2Var = (n2) obj;
        switch (this.f1840a) {
            case 1:
                return n2Var.N;
            default:
                return n2Var.O;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = ci.v3.f6125j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f1840a) {
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
    public Object x0(ci.u5 u5Var) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(u5Var);
        return lambda$getComponents$0;
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
