package ag;

import a8.ed;
import a8.me;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.j1;
import b2.q1;
import b2.r1;
import b2.v1;
import bi.ad;
import bi.ba;
import bi.h7;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import f9.s1;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.dg1;
public final class w implements Vector.TLDeserializer, e9.k, s9.d, b2, c7, d7, jw0 {
    public final int f1386a;

    public w(int i10) {
        this.f1386a = i10;
    }

    @Override
    public Object apply(Object obj) {
        s1 f7;
        s1 b10;
        int i10 = 0;
        switch (this.f1386a) {
            case 5:
                b2.b0 b0Var = (b2.b0) obj;
                return b0Var.f3144a + ": " + b0Var.f3145b;
            case 6:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = j1Var.f3243a;
                if (i11 != 0) {
                    bundle.putInt(j1.d, i11);
                }
                int i12 = j1Var.f3244b;
                if (i12 != 0) {
                    bundle.putInt(j1.e, i12);
                }
                int i13 = j1Var.f3245c;
                if (i13 != 0) {
                    bundle.putInt(j1.f3242f, i13);
                }
                return bundle;
            case 7:
                b2.o0 o0Var = (b2.o0) obj;
                o0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.o0.h, o0Var.f3311a);
                String str = o0Var.f3312b;
                if (str != null) {
                    bundle2.putString(b2.o0.f3305i, str);
                }
                String str2 = o0Var.f3313c;
                if (str2 != null) {
                    bundle2.putString(b2.o0.f3306j, str2);
                }
                int i14 = o0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(b2.o0.f3307k, i14);
                }
                int i15 = o0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(b2.o0.f3308l, i15);
                }
                String str3 = o0Var.f3314f;
                if (str3 != null) {
                    bundle2.putString(b2.o0.f3309m, str3);
                }
                String str4 = o0Var.f3315g;
                if (str4 != null) {
                    bundle2.putString(b2.o0.f3310n, str4);
                }
                return bundle2;
            case 8:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.o0.h);
                uri.getClass();
                String string = bundle3.getString(b2.o0.f3305i);
                String string2 = bundle3.getString(b2.o0.f3306j);
                int i16 = bundle3.getInt(b2.o0.f3307k, 0);
                int i17 = bundle3.getInt(b2.o0.f3308l, 0);
                String string3 = bundle3.getString(b2.o0.f3309m);
                String string4 = bundle3.getString(b2.o0.f3310n);
                ?? obj2 = new Object();
                obj2.f3289c = uri;
                obj2.d = b2.w0.n(string);
                obj2.e = string2;
                obj2.f3287a = i16;
                obj2.f3288b = i17;
                obj2.f3290f = string3;
                obj2.f3291g = string4;
                return new b2.o0(obj2);
            case 9:
                Bundle bundle4 = (Bundle) obj;
                b2.x xVar = b2.x.V;
                b2.w wVar = new b2.w();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.e.class.getClassLoader();
                    String str5 = e2.n0.f9692a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.x.W);
                String str6 = xVar.f3571a;
                if (string5 == null) {
                    string5 = str6;
                }
                wVar.f3519a = string5;
                String string6 = bundle4.getString(b2.x.X);
                String str7 = xVar.f3572b;
                if (string6 == null) {
                    string6 = str7;
                }
                wVar.f3520b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.x.B0);
                if (parcelableArrayList == null) {
                    f7 = s1.e;
                } else {
                    f9.f0 t10 = f9.i0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.b0.f3143c);
                        String string8 = bundle5.getString(b2.b0.d);
                        string8.getClass();
                        t10.c(new b2.b0(string7, string8));
                    }
                    f7 = t10.f();
                }
                wVar.f3521c = f9.i0.u(f7);
                String string9 = bundle4.getString(b2.x.Y);
                String str8 = xVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                wVar.d = string9;
                wVar.e = bundle4.getInt(b2.x.Z, xVar.e);
                wVar.f3522f = bundle4.getInt(b2.x.f3546a0, xVar.f3574f);
                wVar.f3523g = bundle4.getInt(b2.x.C0, xVar.f3575g);
                wVar.h = bundle4.getInt(b2.x.f3547b0, xVar.h);
                wVar.f3524i = bundle4.getInt(b2.x.f3548c0, xVar.f3576i);
                String string10 = bundle4.getString(b2.x.f3549d0);
                String str9 = xVar.f3578k;
                if (string10 == null) {
                    string10 = str9;
                }
                wVar.f3525j = string10;
                String string11 = bundle4.getString(b2.x.G0);
                String str10 = xVar.f3580m;
                if (string11 == null) {
                    string11 = str10;
                }
                wVar.f3527l = string11;
                String string12 = bundle4.getString(b2.x.f3550e0);
                String str11 = xVar.f3585r;
                if (string12 == null) {
                    string12 = str11;
                }
                wVar.f3532q = b2.w0.n(string12);
                String string13 = bundle4.getString(b2.x.f3551f0);
                String str12 = xVar.f3586s;
                if (string13 == null) {
                    string13 = str12;
                }
                wVar.f3533r = b2.w0.n(string13);
                wVar.f3534s = bundle4.getInt(b2.x.f3552g0, xVar.f3587t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.x.f3553h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        wVar.f3536u = arrayList;
                        wVar.v = (b2.t) bundle4.getParcelable(b2.x.f3554i0);
                        wVar.f3537w = bundle4.getLong(b2.x.f3555j0, xVar.f3590x);
                        wVar.f3539y = bundle4.getInt(b2.x.f3556k0, xVar.f3592z);
                        wVar.f3540z = bundle4.getInt(b2.x.f3557l0, xVar.A);
                        wVar.A = bundle4.getInt(b2.x.E0, xVar.B);
                        wVar.B = bundle4.getInt(b2.x.F0, xVar.C);
                        wVar.C = bundle4.getFloat(b2.x.m0, xVar.D);
                        wVar.D = bundle4.getInt(b2.x.f3558n0, xVar.E);
                        wVar.E = bundle4.getFloat(b2.x.f3559o0, xVar.F);
                        wVar.F = bundle4.getByteArray(b2.x.f3560p0);
                        wVar.G = bundle4.getInt(b2.x.f3561q0, xVar.H);
                        wVar.I = bundle4.getInt(b2.x.D0, xVar.J);
                        Bundle bundle6 = bundle4.getBundle(b2.x.f3562r0);
                        if (bundle6 != null) {
                            wVar.H = new b2.o(bundle6.getInt(b2.o.f3294i, -1), bundle6.getInt(b2.o.f3295j, -1), bundle6.getInt(b2.o.f3296k, -1), bundle6.getByteArray(b2.o.f3297l), bundle6.getInt(b2.o.f3298m, -1), bundle6.getInt(b2.o.f3299n, -1));
                        }
                        wVar.J = bundle4.getInt(b2.x.f3563s0, xVar.K);
                        wVar.K = bundle4.getInt(b2.x.f3564t0, xVar.L);
                        wVar.L = bundle4.getInt(b2.x.f3565u0, xVar.M);
                        wVar.M = bundle4.getInt(b2.x.f3566v0, xVar.N);
                        wVar.N = bundle4.getInt(b2.x.f3567w0, xVar.O);
                        wVar.O = bundle4.getInt(b2.x.f3568x0, xVar.P);
                        wVar.Q = bundle4.getInt(b2.x.f3570z0, xVar.R);
                        wVar.R = bundle4.getInt(b2.x.A0, xVar.S);
                        wVar.S = bundle4.getInt(b2.x.f3569y0, xVar.T);
                        return new b2.x(wVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 10:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(r1.f3384c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(q1.f3356f);
                if (parcelableArrayList2 == null) {
                    f9.g0 g0Var = f9.i0.f10287b;
                    b10 = s1.e;
                } else {
                    b10 = e2.e.b(new w(9), parcelableArrayList2);
                }
                q1 q1Var = new q1(bundle8.getString(q1.f3357g, ""), (b2.x[]) b10.toArray(new b2.x[0]));
                int[] intArray = bundle7.getIntArray(r1.d);
                intArray.getClass();
                return new r1(q1Var, ed.a(intArray));
            default:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(v1.f3513f, v1Var.f3517b.c());
                bundle9.putIntArray(v1.f3514g, v1Var.d);
                bundle9.putBooleanArray(v1.h, v1Var.e);
                bundle9.putBoolean(v1.f3515i, v1Var.f3518c);
                return bundle9;
        }
    }

    @Override
    public float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override
    public void d(int i10, View view) {
        ((ba) view).setColor(i10);
    }

    @Override
    public Object d1(me meVar) {
        bb.m m10getComponents$lambda0;
        bb.m0 m11getComponents$lambda1;
        bb.g0 m12getComponents$lambda2;
        db.h m13getComponents$lambda3;
        bb.t m14getComponents$lambda4;
        bb.q0 m15getComponents$lambda5;
        switch (this.f1386a) {
            case 19:
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(meVar);
                return m10getComponents$lambda0;
            case 20:
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(meVar);
                return m11getComponents$lambda1;
            case 21:
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(meVar);
                return m12getComponents$lambda2;
            case 22:
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(meVar);
                return m13getComponents$lambda3;
            case 23:
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(meVar);
                return m14getComponents$lambda4;
            default:
                m15getComponents$lambda5 = FirebaseSessionsRegistrar.m15getComponents$lambda5(meVar);
                return m15getComponents$lambda5;
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public int e(View view) {
        return ((ba) view).f4385x;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f1386a) {
            case 25:
                int i11 = h7.A1;
                return;
            default:
                h7.D2(new dg1(6, null));
                return;
        }
    }

    @Override
    public RecyclerView i(View view) {
        return ((ad) view).f4289a;
    }

    @Override
    public void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    public w(h7 h7Var) {
        this.f1386a = 26;
    }
}
