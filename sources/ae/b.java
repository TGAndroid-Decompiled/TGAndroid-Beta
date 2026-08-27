package ae;

import a9.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import c2.t;
import cg.b2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f2.e1;
import f2.m0;
import f2.o1;
import f2.q0;
import f9.h;
import j$.util.DesugarCollections;
import j3.b0;
import j3.n;
import j3.r;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import lh.hb;
import lh.ib;
import lh.j0;
import lh.q6;
import lh.sb;
import lh.va;
import lh.wb;
import lh.z5;
import lh.z7;
import m.j1;
import m.y0;
import m4.g;
import m5.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.m61;
import s7.j;
import t2.d;
import t2.f;
import u3.k;
import uf.m;
import zf.c2;

public class b implements a0, o, k0, v0, l0, e2.c, m0, Continuation, j1, s, r, m, wb, y0, r0, SuccessContinuation {

    public final int f244a;

    public Object f245b;

    public b(int i10) {
        this.f244a = i10;
    }

    public static boolean Q(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override
    public void A(int i10, int i11) {
        ((q0) this.f245b).p(i10, i11);
    }

    @Override
    public e B(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void C(v5.a aVar) {
        x xVar = (x) this.f245b;
        xVar.f3374o.lock();
        try {
            xVar.f3372m = aVar;
            x.l(xVar);
        } finally {
            xVar.f3374o.unlock();
        }
    }

    @Override
    public void C1(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.E = f10;
        z7Var.f17214j = true;
        q6Var.w(true);
    }

    public void F(j9.a aVar, t tVar, i iVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager fingerprintManagerF;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.f2347c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        tVar.f2347c = cancellationSignal2;
                        if (tVar.f2346b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) tVar.f2347c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (fingerprintManagerF = e0.b.f((Context) this.f245b)) == null) {
            return;
        }
        e0.b.a(fingerprintManagerF, e0.b.C(aVar), cancellationSignal, new k0.a(iVar));
    }

    public void G(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f245b;
        int i10 = aVar.f5611a;
        if (i10 == 1) {
            recyclerView.f1864x.V(recyclerView, aVar.f5612b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f1864x.Y(recyclerView, aVar.f5612b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.f1864x.a0(recyclerView, aVar.f5612b, aVar.d, aVar.f5613c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f1864x.X(recyclerView, aVar.f5612b, aVar.d);
        }
    }

    @Override
    public void I(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.G = f10;
        z7Var.f17214j = true;
        q6Var.c();
    }

    @Override
    public void I0(boolean z10) {
        q6 q6Var = (q6) this.f245b;
        if (q6Var.j()) {
            q6Var.A.getClass();
        }
        q6Var.x(-4, z10);
    }

    @Override
    public void J(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.f245b;
        Handler handler = f0Var.f1047w0;
        a8.b bVar = f0Var.f1048x0;
        handler.removeCallbacks(bVar);
        int iIntValue = num.intValue();
        if (f0Var.B0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = f0Var.f1049y0.f1090y;
            Context contextN = f0Var.n();
            Drawable drawable = null;
            if (contextN == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = 2131231144;
                if (i10 == 0 && iIntValue == 1) {
                    drawable = contextN.getDrawable(i11);
                } else {
                    if (i10 == 1 && iIntValue == 2) {
                        i11 = 2131231143;
                    } else if ((i10 == 2 && iIntValue == 1) || (i10 == 1 && iIntValue == 3)) {
                    }
                    drawable = contextN.getDrawable(i11);
                }
            }
            if (drawable != null) {
                f0Var.B0.setImageDrawable(drawable);
                if ((i10 != 0 || iIntValue != 1) && ((i10 == 1 && iIntValue == 2) || (i10 == 2 && iIntValue == 1))) {
                    d0.a(drawable);
                }
                f0Var.f1049y0.f1090y = iIntValue;
            }
        }
        int iIntValue2 = num.intValue();
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? f0Var.f1050z0 : f0Var.A0);
        }
        handler.postDelayed(bVar, 2000L);
    }

    public boolean K(String str) {
        String strO = O(str);
        return "1".equals(strO) || Boolean.parseBoolean(strO);
    }

    @Override
    public void K0(int i10, int i11) {
        ((q0) this.f245b).t(i10, i11);
    }

    public Integer L(String str) {
        String strO = O(str);
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strO));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Z(str) + "(" + strO + ") into an int");
            return null;
        }
    }

    public JSONArray M(String str) {
        String strO = O(str);
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        try {
            return new JSONArray(strO);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Z(str) + ": " + strO + ", falling back to default");
            return null;
        }
    }

    public String N(Resources resources, String str, String str2) {
        String[] strArr;
        String strO = O(str2);
        if (!TextUtils.isEmpty(strO)) {
            return strO;
        }
        String strO2 = O(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strO2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strO2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Z(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayM = M(str2.concat("_loc_args"));
        if (jSONArrayM == null) {
            strArr = null;
        } else {
            int length = jSONArrayM.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayM.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e9) {
            Log.w("NotificationParams", "Missing format argument for " + Z(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e9);
            return null;
        }
    }

    public String O(String str) {
        Bundle bundle = (Bundle) this.f245b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override
    public void P(long j10, boolean z10) {
        q6 q6Var = (q6) this.f245b;
        if (!z10) {
            q6Var.m(j10);
            return;
        }
        m61 m61Var = q6Var.f16565e;
        if (m61Var != null) {
            m61Var.M(j10, true);
            return;
        }
        if (q6Var.j()) {
            q6Var.A.m(j10, true);
            return;
        }
        m61 m61Var2 = q6Var.f16590y;
        if (m61Var2 != null) {
            m61Var2.M(j10, false);
        }
    }

    @Override
    public void P0(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).P = f10;
    }

    public void R(ia.f0 f0Var) {
        ((w2.o) ((f) ((y9.b) this.f245b).get())).a("FIREBASE_APPQUALITY_SESSION", new t2.c("json"), new h3.x(this, 17)).a(new t2.a(null, f0Var, d.f48012a, null), new k(6));
    }

    @Override
    public void S(int i10, int i11) {
        ((q0) this.f245b).s(i10, i11);
    }

    public void T(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f245b;
        int iT = recyclerView.f1840e.t();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iT; i15++) {
            View viewS = recyclerView.f1840e.s(i15);
            o1 o1VarU = RecyclerView.U(viewS);
            if (o1VarU != null && !o1VarU.r() && (i13 = o1VarU.f5791c) >= i10 && i13 < i14) {
                o1VarU.a(2);
                if (obj == null) {
                    o1VarU.a(1024);
                } else if ((1024 & o1VarU.f5798l) == 0) {
                    if (o1VarU.f5799m == null) {
                        ArrayList arrayList = new ArrayList();
                        o1VarU.f5799m = arrayList;
                        o1VarU.f5800n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    o1VarU.f5799m.add(obj);
                }
                ((f2.y0) viewS.getLayoutParams()).f5866c = true;
            }
        }
        e1 e1Var = recyclerView.f1835b;
        ArrayList arrayList2 = (ArrayList) e1Var.f5650e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            o1 o1Var = (o1) arrayList2.get(size);
            if (o1Var != null && (i12 = o1Var.f5791c) >= i10 && i12 < i14) {
                o1Var.a(2);
                e1Var.f(size);
            }
        }
        recyclerView.f1859t0 = true;
    }

    public void U() {
        ((u) this.f245b).d.R();
    }

    public void V(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f245b;
        int iT = recyclerView.f1840e.t();
        for (int i12 = 0; i12 < iT; i12++) {
            o1 o1VarU = RecyclerView.U(recyclerView.f1840e.s(i12));
            if (o1VarU != null && !o1VarU.r() && o1VarU.f5791c >= i10) {
                o1VarU.n(i11, false);
                recyclerView.f1853p0.f5761f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1835b.f5650e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            o1 o1Var = (o1) arrayList.get(i13);
            if (o1Var != null && o1Var.f5791c >= i10) {
                o1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1858s0 = true;
    }

    public void W(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f245b;
        int iT = recyclerView.f1840e.t();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iT; i20++) {
            o1 o1VarU = RecyclerView.U(recyclerView.f1840e.s(i20));
            if (o1VarU != null && (i18 = o1VarU.f5791c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    o1VarU.n(i11 - i10, false);
                } else {
                    o1VarU.n(i14, false);
                }
                recyclerView.f1853p0.f5761f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1835b.f5650e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            o1 o1Var = (o1) arrayList.get(i21);
            if (o1Var != null && (i17 = o1Var.f5791c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    o1Var.n(i11 - i10, false);
                } else {
                    o1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1858s0 = true;
    }

    @Override
    public void W1(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).W = f10;
    }

    public void X(j9.a aVar) {
        j jVar = (j) this.f245b;
        jVar.f47812a = aVar;
        Iterator it = jVar.f47814c.iterator();
        while (it.hasNext()) {
            ((i6.e) it.next()).b();
        }
        jVar.f47814c.clear();
        jVar.f47813b = null;
    }

    @Override
    public void X0(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.P = f10;
        q6Var.c();
    }

    @Override
    public void X1(float f10) {
        z7 z7Var = ((q6) this.f245b).d;
        if (z7Var == null) {
            return;
        }
        z7Var.f17194a0 = f10;
        z7Var.f17214j = true;
    }

    public Bundle Y() {
        Bundle bundle = (Bundle) this.f245b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void Y1() {
        ((q6) this.f245b).q(null);
    }

    @Override
    public void Z0(float f10, boolean z10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.Z = f10;
        z7Var.f17214j = true;
        m61 m61Var = q6Var.f16565e;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            return;
        }
        q6Var.m((long) (f10 * q6Var.f16565e.q()));
    }

    @Override
    public void a() throws x4 {
        g gVar = (g) this.f245b;
        gVar.A.a();
        x4 x4Var = gVar.C;
        if (x4Var != null) {
            throw x4Var;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f244a) {
            case 17:
                g8.j jVar = (g8.j) this.f245b;
                p7.b bVar = (p7.b) obj;
                Bundle bundleG = bVar.G();
                bundleG.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                p7.a aVar = new p7.a(0, (TaskCompletionSource) obj2);
                try {
                    p7.i iVar = (p7.i) bVar.u();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = p7.c.f45510a;
                    parcelObtain.writeInt(1);
                    jVar.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundleG.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(aVar);
                    try {
                        iVar.f45518a.transact(19, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e9) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e9);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.l(Status.h, null);
                    return;
                }
            case 23:
                w7.c cVar = (w7.c) this.f245b;
                l7.d dVar = new l7.d(1, (TaskCompletionSource) obj2);
                l7.c cVar2 = (l7.c) ((l7.f) obj).u();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = l7.a.f15444a;
                parcelObtain2.writeStrongBinder(dVar);
                parcelObtain2.writeInt(1);
                cVar.writeToParcel(parcelObtain2, 0);
                cVar2.E0(parcelObtain2, 1);
                return;
            default:
                r5.x xVar = (r5.x) obj;
                r5.f fVar = (r5.f) xVar.u();
                e0 e0Var = ((m5.f0) this.f245b).f17770k;
                Parcel parcelM0 = fVar.M0();
                com.google.android.gms.internal.cast.t.d(parcelM0, e0Var);
                fVar.R0(parcelM0, 18);
                r5.f fVar2 = (r5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public void c(long j10) {
        n nVar = ((b0) ((FfmpegAudioRenderer) this.f245b)).eventDispatcher;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new b2(nVar, j10, 3));
        }
    }

    @Override
    public void e(int i10) {
        lh.e0 e0Var = ((q6) this.f245b).A;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                lh.d0 d0Var = (lh.d0) obj;
                if (d0Var.f15835a == i10) {
                    d0Var.f15836b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void e2(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.f17234t0 = f10;
        z7Var.f17214j = true;
        q6Var.y(true);
    }

    @Override
    public void g0() {
        q6 q6Var = (q6) this.f245b;
        q6Var.s(null, null, true);
        sb sbVar = ((hb) q6Var).f16082y0;
        hb hbVar = sbVar.T0;
        if (hbVar != null) {
            hbVar.s(null, null, true);
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            vaVar.q0();
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        z7 z7Var = sbVar.G1;
        if (z7Var != null) {
            File file = z7Var.f17224o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.G1.f17224o0 = null;
            }
            if (sbVar.G1.f17226p0 != null) {
                try {
                    new File(sbVar.G1.f17226p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.G1.f17226p0 = null;
            }
        }
    }

    @Override
    public void g2(int i10, long j10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).X = j10;
    }

    @Override
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i10) {
        g gVar = ((m4.d) this.f245b).f17666a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return com.google.android.exoplayer2.upstream.q0.f3028e;
    }

    @Override
    public void i(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((c7.j) this.f245b).f2471b;
        synchronized (nVar2) {
            nVar2.f893a = false;
            nVar = ((p) nVar2.f894b).f3318c;
        }
        if (nVar != null) {
            ((c7.d) nVar2.f895c).c(nVar, 2441);
        }
    }

    @Override
    public void i1(long j10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.f17230r0 = j10;
        z7Var.f17214j = true;
        q6Var.y(true);
    }

    @Override
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f245b;
        m0Var.f3295a.lock();
        try {
            m0Var.f3304m = new g0(m0Var, m0Var.f3301j, m0Var.f3302k, m0Var.d, m0Var.f3303l, m0Var.f3295a, m0Var.f3297c);
            m0Var.f3304m.v();
            m0Var.f3296b.signalAll();
        } finally {
            m0Var.f3295a.unlock();
        }
    }

    @Override
    public void j1(boolean z10) {
        c2 c2Var;
        sb sbVar = ((hb) ((q6) this.f245b)).f16082y0;
        va vaVar = sbVar.f16798r1;
        if (vaVar == null) {
            return;
        }
        c2 c2Var2 = null;
        if (!z10 && (vaVar.getSelectedEntity() instanceof c2)) {
            sbVar.f16798r1.D0(null, true);
            return;
        }
        if (!z10 || (sbVar.f16798r1.getSelectedEntity() instanceof c2)) {
            return;
        }
        z5 z5Var = sbVar.f16798r1.N0;
        int i10 = 0;
        while (true) {
            if (i10 >= z5Var.getChildCount()) {
                c2Var = null;
                break;
            }
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof c2) {
                c2Var = (c2) childAt;
                break;
            }
            i10++;
        }
        if (c2Var != null) {
            va vaVar2 = sbVar.f16798r1;
            z5 z5Var2 = vaVar2.N0;
            for (int i11 = 0; i11 < z5Var2.getChildCount(); i11++) {
                View childAt2 = z5Var2.getChildAt(i11);
                if (childAt2 instanceof c2) {
                    c2Var2 = (c2) childAt2;
                    break;
                }
            }
            vaVar2.D0(c2Var2, true);
        }
    }

    @Override
    public void j2(long j10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.D = j10;
        z7Var.f17214j = true;
        q6Var.w(true);
    }

    @Override
    public void k() {
        ((j0) this.f245b).d.invalidate();
    }

    @Override
    public void k1(int i10, int i11) {
        ((q0) this.f245b).r(i10, i11, null);
    }

    @Override
    public void l(n0 n0Var, long j10, long j11) {
        boolean z10;
        m4.d dVar = (m4.d) this.f245b;
        synchronized (d5.a.f4769i) {
            z10 = d5.a.f4770j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        g gVar = dVar.f17666a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
    }

    @Override
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void n(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f245b).setResultCode(i10);
    }

    @Override
    public void n1(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).V = f10;
    }

    @Override
    public void o(int i10, long j10, long j11) {
        n nVar = ((b0) ((FfmpegAudioRenderer) this.f245b)).eventDispatcher;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar = ((b0) ((FfmpegAudioRenderer) this.f245b)).eventDispatcher;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new fh.f(5, nVar, z10));
        }
    }

    @Override
    public void p1(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.F = f10;
        z7Var.f17214j = true;
        q6Var.w(true);
    }

    @Override
    public void r(int i10) {
        x xVar = (x) this.f245b;
        Lock lock = xVar.f3374o;
        lock.lock();
        try {
            if (xVar.f3373n) {
                xVar.f3373n = false;
                x.k(xVar, i10);
            } else {
                xVar.f3373n = true;
                xVar.d.onConnectionSuspended(i10);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f245b;
        xVar.f3374o.lock();
        try {
            xVar.f3372m = v5.a.f48783e;
            x.l(xVar);
        } finally {
            xVar.f3374o.unlock();
        }
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f245b).call();
    }

    public String toString() {
        switch (this.f244a) {
            case 0:
                c cVar = c.f246e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((aa.a) this.f245b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Exception exc) {
        d5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        n nVar = ((b0) ((FfmpegAudioRenderer) this.f245b)).eventDispatcher;
        Handler handler = nVar.f12391a;
        if (handler != null) {
            handler.post(new j3.k(nVar, exc, 1));
        }
    }

    @Override
    public void v() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f245b;
        Iterator it = m0Var.f3299f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.f3306o.B = Collections.EMPTY_SET;
    }

    @Override
    public void w() {
        ((FfmpegAudioRenderer) this.f245b).onPositionDiscontinuity();
    }

    @Override
    public void w0(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.f17232s0 = f10;
        z7Var.f17214j = true;
        q6Var.y(true);
    }

    @Override
    public boolean x() {
        return true;
    }

    @Override
    public void y(float f10) {
        q6 q6Var = (q6) this.f245b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.f17236u0 = f10;
        z7Var.f17214j = true;
        q6Var.c();
    }

    public b(Object obj, int i10) {
        this.f244a = i10;
        this.f245b = obj;
    }

    @Override
    public Task then(Object obj) throws Throwable {
        JSONObject jSONObjectC;
        FileWriter fileWriter;
        c3.g gVar = (c3.g) this.f245b;
        ec.a aVar = (ec.a) gVar.f2437f;
        m9.c cVar = (m9.c) gVar.f2434b;
        String str = aVar.f5368b;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapB = ec.a.b(cVar);
            j9.a aVar2 = new j9.a(str, mapB);
            aVar2.E("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar2.E("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ec.a.a(aVar2, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapB;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectC = aVar.c(aVar2.v());
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e9);
            jSONObjectC = null;
        }
        if (jSONObjectC != null) {
            m9.a aVarH = ((ga.c) gVar.f2435c).h(jSONObjectC);
            k5.i iVar = (k5.i) gVar.f2436e;
            long j10 = aVarH.f17883c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectC.put("expires_at", j10);
                fileWriter = new FileWriter((File) iVar.f14480b);
                try {
                    try {
                        fileWriter.write(jSONObjectC.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            h.c(fileWriter, "Failed to close settings writer.");
            c3.g.f("Loaded settings: ", jSONObjectC);
            String str4 = cVar.f17890f;
            SharedPreferences.Editor editorEdit = ((Context) gVar.f2433a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str4);
            editorEdit.apply();
            ((AtomicReference) gVar.h).set(aVarH);
            ((TaskCompletionSource) ((AtomicReference) gVar.f2439i).get()).trySetResult(aVarH);
        }
        return Tasks.forResult(null);
    }

    public b(Bundle bundle) {
        this.f244a = 9;
        this.f245b = new Bundle(bundle);
    }

    @Override
    public void E() {
    }

    @Override
    public void H() {
    }

    @Override
    public void g() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void b(Bundle bundle) {
    }

    @Override
    public void p(int i10) {
    }

    @Override
    public void q(boolean z10) {
    }

    @Override
    public void t(int i10) {
    }

    @Override
    public void z(int i10) {
    }

    @Override
    public void f(v5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
