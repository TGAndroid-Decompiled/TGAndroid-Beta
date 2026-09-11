package a6;

import a3.g0;
import a3.k0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.c0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.biometric.p;
import androidx.lifecycle.a0;
import bi.lb;
import bi.mb;
import bi.q5;
import bi.r5;
import c6.d0;
import c6.e0;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.d7;
import e6.o;
import g.r;
import g6.n;
import g6.q;
import g6.w;
import i2.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import ji.c2;
import ji.g2;
import ji.h1;
import ji.j0;
import ji.n4;
import ji.p4;
import ji.r3;
import ji.v3;
import ji.z;
import l.x;
import n7.m1;
import n7.n1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj0;
import org.telegram.ui.n01;
import org.telegram.ui.sz0;
import v7.z6;
public final class i implements k0, s, a0, androidx.activity.result.b, lb, OnCompleteListener, la0, d71, n, f6.a, fb.n, x, ao0, d5, j0 {
    public static i f310c;
    public final int f311a;
    public Object f312b;

    public i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f311a = i10;
        this.f312b = obj;
    }

    public static synchronized i G(Context context) {
        i N;
        synchronized (i.class) {
            N = N(context.getApplicationContext());
        }
        return N;
    }

    public static synchronized i N(Context context) {
        synchronized (i.class) {
            i iVar = f310c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            f310c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A(CharSequence charSequence) {
        n4 n4Var = ((p4) this.f312b).G;
        if (n4Var != null) {
            r3 r3Var = (r3) n4Var;
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f14144a.s4(charSequence.toString());
            }
        }
    }

    public JSONObject B() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f312b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public float C(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z10) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z10) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z12 = z10;
            if (i27 == i21) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = abs;
            if (z11 == ((dc.b) this.f312b).b(i19, i20)) {
                if (i27 == 2) {
                    return z6.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z10 = z12;
            i21 = 1;
        }
        if (i27 == 2) {
            return z6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public p9 D() {
        return (p4) this.f312b;
    }

    public float E(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f312b;
        float C = C(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f6691a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f6692b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (C(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C) - 1.0f;
    }

    @Override
    public ji.a F() {
        return ((p4) this.f312b).f13749a;
    }

    @Override
    public void H() {
        a3.m mVar = (a3.m) this.f312b;
        if (mVar.f148n1 != null) {
            mVar.M0(0, 1);
        }
    }

    @Override
    public boolean H0(long j3, int i10, int i11, int i12, mb mbVar) {
        ImageReceiver imageReceiver;
        r5 r5Var;
        r5 r5Var2;
        r5 r5Var3;
        r5 r5Var4;
        mbVar.f3334b = null;
        mbVar.f3335c = null;
        sz0 sz0Var = (sz0) this.f312b;
        n01 n01Var = sz0Var.h;
        ArrayList arrayList = sz0Var.f34168w;
        if (sz0Var.N < 0.2f) {
            mbVar.f3334b = n01Var.getImageReceiver();
            mbVar.f3335c = null;
            mbVar.f3333a = n01Var;
            mbVar.h = 0.0f;
            mbVar.f3339i = AndroidUtilities.displaySize.y;
            mbVar.f3338g = (View) sz0Var.getParent();
            mbVar.d = sz0Var.f34170y;
            mbVar.f3344n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                r5 r5Var5 = (r5) arrayList.get(i13);
                if (r5Var5.f3631e >= 1.0f && r5Var5.f3628a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        r5Var3 = (r5) arrayList.get(i14);
                    } else {
                        r5Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        r5Var4 = (r5) arrayList.get(i15);
                    } else {
                        r5Var4 = null;
                    }
                    r5 d = ProfileStoriesView.d(r5Var3, r5Var4, r5Var5);
                    imageReceiver = r5Var5.f3629b;
                    r5Var2 = d;
                    r5Var = r5Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                r5Var = null;
                r5Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        mbVar.f3335c = imageReceiver;
        mbVar.f3334b = null;
        mbVar.f3333a = sz0Var;
        mbVar.h = 0.0f;
        mbVar.f3339i = AndroidUtilities.displaySize.y;
        mbVar.f3338g = (View) sz0Var.getParent();
        if (r5Var != null && r5Var2 != null) {
            mbVar.f3337f = new q5(this, new RectF(r5Var.f3638m), r5Var, new RectF(r5Var2.f3638m), r5Var2);
            return true;
        }
        mbVar.f3337f = null;
        return true;
    }

    public synchronized void I() {
        synchronized (this) {
            b bVar = (b) this.f312b;
            ReentrantLock reentrantLock = bVar.f293a;
            reentrantLock.lock();
            bVar.f294b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        c2 c2Var = (c2) this.f312b;
        c2Var.s0(i10, i11, z10);
        cj0 cj0Var = c2Var.O0;
        if (cj0Var != null) {
            cj0Var.i();
            c2Var.O0 = null;
        }
    }

    @Override
    public void K() {
        i0 i0Var = ((a3.m) this.f312b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public boolean L() {
        p4 p4Var = (p4) this.f312b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.f13749a;
            if (((r3) n4Var).f14144a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        p4 p4Var = (p4) this.f312b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.f13749a;
            g2 g2Var = ((r3) n4Var).f14144a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void P() {
        p4 p4Var = (p4) this.f312b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.f13749a;
            v3 v3Var = ((r3) n4Var).f14144a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.f14249h3.onContentChanged();
        }
    }

    @Override
    public void a(h1 h1Var) {
        n4 n4Var = ((p4) this.f312b).G;
        if (n4Var != null) {
            v3 v3Var = ((r3) n4Var).f14144a;
            v3.L1(v3Var, h1Var);
            v3Var.f14249h3.v(h1Var, true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f311a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f317a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f312b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 1);
                return;
            case 7:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(n1Var.f16667b);
                int i11 = n7.j.f16645a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) this.f312b).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    n1Var.f16666a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 10:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) this.f312b).f4490k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 22:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray((String[]) this.f312b);
                iVar.T0(O02, 7);
                return;
            default:
                h7.f fVar3 = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.f44202a;
                obtain4.writeStrongBinder(fVar3);
                q7.a.b(obtain4, (g7.f) this.f312b);
                q7.a.b(obtain4, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain4, 6);
                return;
        }
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f312b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(float f7) {
        MessageObject messageObject = ((z) this.f312b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public void c0() {
        p4 p4Var = (p4) this.f312b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.f13749a;
            v3.N1(((r3) n4Var).f14144a);
        }
    }

    @Override
    public void d(l.l lVar, boolean z10) {
        boolean z11;
        int i10;
        r rVar;
        g.s sVar = (g.s) this.f312b;
        l.l k10 = lVar.k();
        int i11 = 0;
        if (k10 != lVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar = k10;
        }
        r[] rVarArr = sVar.U;
        if (rVarArr != null) {
            i10 = rVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                rVar = rVarArr[i11];
                if (rVar != null && rVar.h == lVar) {
                    break;
                }
                i11++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (z11) {
                sVar.f(rVar.f10216a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public void f0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.f312b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f1054l0.d(null);
        }
    }

    @Override
    public void g() {
        p4 p4Var = (p4) this.f312b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            v3.O1(((r3) n4Var).f14144a, p4Var.f13749a);
        }
    }

    public float h(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4748b;
        int i11 = (int) cVar2.f4748b;
        float E = E((int) cVar.f4747a, i10, (int) cVar2.f4747a, i11);
        float E2 = E((int) cVar2.f4747a, i11, (int) cVar.f4747a, i10);
        if (Float.isNaN(E)) {
            return E2 / 7.0f;
        }
        if (Float.isNaN(E2)) {
            return E / 7.0f;
        }
        return (E + E2) / 14.0f;
    }

    @Override
    public Object h2() {
        Type type = (Type) this.f312b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    public int i(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f312b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f9459a[aVar.f9464g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            fc.a aVar2 = fc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            fc.b bVar = new fc.b(aVar, iArr5);
            fc.b a2 = aVar.a(i10, 1);
            fc.b bVar2 = aVar.f9461c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            fc.b bVar3 = aVar.d;
            fc.b bVar4 = a2;
            fc.b bVar5 = bVar;
            fc.b bVar6 = bVar4;
            fc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    fc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    fc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        fc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                fc.b bVar10 = bVarArr[0];
                fc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.f9462e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f9464g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f9460b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        switch (this.f311a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f312b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollLast();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = e0Var.f1424a;
                int i10 = e0Var.f1425b;
                androidx.fragment.app.r m10 = i0Var.f1438c.m(str);
                if (m10 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                m10.x(i10, aVar.f894a, aVar.f895b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f312b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f895b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f4397a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f894a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public Paint.FontMetricsInt k() {
        return ((di.m) this.f312b).f7593f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void l(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a4.a.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f312b).e(bitmap2, 0);
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.f312b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = e6.h.f8875k;
            Log.e(bVar.f10386a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.f8900q.f8882i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public synchronized void o() {
        ((SharedPreferences) this.f312b).edit().clear().commit();
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f312b).f6617c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.m mVar = (a3.m) this.f312b;
        Surface surface = mVar.f148n1;
        if (surface != null) {
            pf.b bVar = mVar.Z0;
            Handler handler = (Handler) bVar.f44046b;
            if (handler != null) {
                handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            mVar.f151q1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.f312b;
        di.z6 z6Var = d7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        g71 g71Var = d7Var.f7101y;
        if (g71Var != null && g71Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((d7) this.f312b).i();
    }

    @Override
    public void p(long j3, int i10, bi.p4 p4Var) {
        int i11 = ProfileStoriesView.f34142s0;
        ((sz0) this.f312b).f(true, false);
        p4Var.run();
    }

    @Override
    public boolean q(l.l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f312b;
        if (lVar == lVar.k() && sVar.O && (callback = sVar.f10239f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    public ic.a r(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f312b;
        int min = Math.min(bVar.f6691a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f6692b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f312b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.f11942e;
                int i15 = bVar3.f11941c;
                int i16 = i14 + i15;
                int i17 = bVar3.f11943f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f11940b;
                if (!arrayList.isEmpty()) {
                    return (ic.a) arrayList.get(0);
                }
                throw cc.e.a();
            }
            throw cc.e.a();
        }
        throw cc.e.a();
    }

    @Override
    public void s(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.s(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public boolean t() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f312b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public q9 u() {
        n4 n4Var = ((p4) this.f312b).G;
        if (n4Var != null) {
            return ((r3) n4Var).f14144a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void v(int i10, int i11, CharSequence charSequence, boolean z10) {
        di.g gVar = ((di.m) this.f312b).f7593f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void w(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f312b).putParcelable(str, bitmap);
    }

    public void y(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f312b).putLong("android.media.metadata.DURATION", j3);
    }

    public void z(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f312b).putCharSequence(str, str2);
    }

    public i(Object obj, int i10) {
        this.f311a = i10;
        this.f312b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Context context, int i10) {
        boolean isEmpty;
        String d;
        this.f311a = i10;
        switch (i10) {
            case 12:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f312b = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        o();
                        return;
                    }
                    return;
                } catch (IOException e7) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
                        return;
                    }
                    return;
                }
            default:
                b a2 = b.a(context);
                this.f312b = a2;
                a2.b();
                String d10 = a2.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.b(d);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    public i(x6.a aVar) {
        this.f311a = 26;
        n6.l.h(aVar);
        this.f312b = aVar;
    }

    public i(ba.c cVar) {
        this.f311a = 14;
        this.f312b = new File(cVar.f2527b, "com.crashlytics.settings.json");
    }

    @Override
    public void h0() {
    }

    public i(int i10) {
        this.f311a = i10;
        switch (i10) {
            case 24:
                return;
            default:
                this.f312b = new Bundle();
                return;
        }
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void x(String str) {
    }

    public i(MediaMetadataCompat mediaMetadataCompat) {
        this.f311a = 3;
        Bundle bundle = new Bundle(mediaMetadataCompat.f774a);
        this.f312b = bundle;
        c0.a(bundle);
    }

    @Override
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void n(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
