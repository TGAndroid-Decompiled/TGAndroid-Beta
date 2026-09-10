package o0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.l1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import fg.c2;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import o2.q;
import og.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nv0;
import org.telegram.ui.ss0;
import p4.m;
import p4.p;
import p4.u;
import p4.v;
import pg.v1;
import pg.w0;
import s4.c1;
import s4.e0;
import s4.h0;
import u2.e1;
import u2.f1;
import u2.q1;
import w9.w;
import xh.x;
import yg.p0;
import zh.a3;
import zh.l7;
public final class b implements a, e1, i71, c5, ua0, kg.e, q71, c2, v1, o, e0, n5.b, s, ok0, nv0 {
    public Object f14084a;

    public b(Object obj) {
        this.f14084a = obj;
    }

    public static float[] f(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        float f11;
        int i10;
        float f12;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f13 = pointF3.x;
                double d14 = d12;
                double d15 = f13 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f14 = pointF4.x;
                dArr5[1] = (f14 - f12) / 3.0d;
                double d16 = f14 - f13;
                dArr5[2] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i12] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i21 < ((int) f17)) {
                        float f18 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - f11) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f7) {
                            f19 = 255.0f;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) hc.b.i(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) hc.b.i(1, arrayList2)).x;
        if (f21 < f7) {
            for (int i24 = ((int) f21) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    public static b u(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new b(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new b(i11, i12, i12, i11);
        }
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= i12) {
            z11 = false;
        }
        if (z10 == z11) {
            return new b(i11, i12, new int[0]);
        }
        return new b(i12, i11, new int[0]);
    }

    public void A() {
        q[] qVarArr;
        q[] qVarArr2;
        o2.k kVar = (o2.k) this.f14084a;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f42436a;
        }
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f42436a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new q1(l1VarArr);
        kVar.G.b(kVar);
    }

    @Override
    public void B(float f7) {
        df0 df0Var = (df0) this.f14084a;
        df0Var.f22405b.setRotation(f7);
        df0Var.getClass();
        cf0 cf0Var = df0Var.f22404a;
        if (cf0Var != null) {
            ((ss0) cf0Var).a(false);
        }
    }

    @Override
    public void C(int i10, int i11) {
        ((h0) this.f14084a).p(i10, i11);
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public void D0(MessageObject messageObject) {
        ((l7) ((a3) this.f14084a).Q1).f(true);
    }

    public void E(p pVar, m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f14084a;
        if (pVar == eVar.f39697y && mVar != null) {
            u uVar = eVar.f39696x.f39788a;
            String d = mVar.d();
            v vVar = new v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f39697y, 3, eVar.f39696x, collection);
                eVar.f39696x = null;
                eVar.f39697y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public void F(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f14084a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.p(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public void G(MessageObject messageObject) {
        ((l7) ((a3) this.f14084a).Q1).f(false);
    }

    public void H(IBinder iBinder) {
        synchronized (((HashMap) this.f14084a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : ((HashMap) this.f14084a).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f14084a).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public void O0(int i10, int i11) {
        ((h0) this.f14084a).t(i10, i11);
    }

    @Override
    public a0.i P() {
        return null;
    }

    @Override
    public void V(float f7) {
        w0 w0Var = (w0) this.f14084a;
        x0.e(w0Var.f40332a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public void a(int i10) {
        oq0 oq0Var = (oq0) this.f14084a;
        sq0 sq0Var = oq0Var.K;
        oq0Var.f25889s = i10;
        if (oq0Var.v != i10) {
            oq0Var.d.clear();
        }
        int i11 = oq0Var.J;
        if (oq0Var.h() == 0 && !oq0Var.e.e() && !oq0Var.I) {
            sq0Var.Q.e(false, true);
        } else {
            sq0Var.f27196x0.b(i11);
        }
        oq0Var.l();
        int i12 = sq0.f27165a1;
        sq0Var.K0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f14084a;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f7343a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f7351a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    public void c(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f14084a;
        int i10 = aVar.f41574a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1560x.X(recyclerView, aVar.f41575b, aVar.d);
                    return;
                }
                recyclerView.f1560x.a0(recyclerView, aVar.f41575b, aVar.d, aVar.f41576c);
                return;
            }
            recyclerView.f1560x.Y(recyclerView, aVar.f41575b, aVar.d);
            return;
        }
        recyclerView.f1560x.V(recyclerView, aVar.f41575b, aVar.d);
    }

    @Override
    public boolean c0(int i10) {
        if (i10 == ((oq0) this.f14084a).f25888r) {
            return true;
        }
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14084a;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public boolean e() {
        cf0 cf0Var = ((df0) this.f14084a).f22404a;
        if (cf0Var != null) {
            PhotoViewer photoViewer = ((ss0) cf0Var).f36749a;
            Drawable[] drawableArr = PhotoViewer.T8;
            return photoViewer.N0();
        }
        return false;
    }

    @Override
    public void g(f1 f1Var) {
        q qVar = (q) f1Var;
        o2.k kVar = (o2.k) this.f14084a;
        kVar.G.g(kVar);
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f14084a).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public void h(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f14084a);
    }

    @Override
    public void i() {
        ((df0) this.f14084a).f22405b.o();
    }

    @Override
    public void invalidate() {
        ((t1) ((g1) this.f14084a).f19181b).invalidate();
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public void j0(int i10, int i11) {
        ((h0) this.f14084a).s(i10, i11);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void k1(int i10, int i11) {
        ((h0) this.f14084a).r(i10, i11, null);
    }

    @Override
    public void l(View view, p0 p0Var, boolean z10, boolean z11) {
        yg.v vVar = (yg.v) this.f14084a;
        vVar.f47147a.ab(null, vVar.e, vVar.f47148b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new x(this, 15));
    }

    public void m(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f14084a;
        int K = recyclerView.e.K();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < K; i15++) {
            View J = recyclerView.e.J(i15);
            c1 U = RecyclerView.U(J);
            if (U != null && !U.r() && (i13 = U.f41612c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f41618l) == 0) {
                    if (U.f41619m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f41619m = arrayList;
                        U.f41620n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f41619m.add(obj);
                }
                ((s4.p0) J.getLayoutParams()).f41718c = true;
            }
        }
        of.e eVar = recyclerView.f1532b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f41612c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f1561x0 = true;
    }

    @Override
    public Cursor n(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14084a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public Paint.FontMetricsInt o() {
        return ((yi) this.f14084a).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        qk0 qk0Var = (qk0) this.f14084a;
        if (z10 && qk0Var.f26437n.n() >= 0) {
            qk0Var.f26440w = true;
        }
        pg0 pg0Var = qk0Var.f26436f;
        kc0 kc0Var = qk0Var.f26441x;
        pg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(kc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(kc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p() {
        ((df0) this.f14084a).f22405b.f12495a.g(1, true);
    }

    @Override
    public boolean q() {
        cf0 cf0Var = ((df0) this.f14084a).f22404a;
        if (cf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((ss0) cf0Var).f36749a;
        Drawable[] drawableArr = PhotoViewer.T8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void w() {
        ((df0) this.f14084a).f22405b.k();
    }

    public void x(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f14084a;
        int K = recyclerView.e.K();
        for (int i12 = 0; i12 < K; i12++) {
            c1 U = RecyclerView.U(recyclerView.e.J(i12));
            if (U != null && !U.r() && U.f41612c >= i10) {
                U.n(i11, false);
                recyclerView.f1555t0.f41771f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1532b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f41612c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1559w0 = true;
    }

    public void y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f14084a;
        int K = recyclerView.e.K();
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
        for (int i20 = 0; i20 < K; i20++) {
            c1 U = RecyclerView.U(recyclerView.e.J(i20));
            if (U != null && (i18 = U.f41612c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1555t0.f41771f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1532b.e;
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
            c1 c1Var = (c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.f41612c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1559w0 = true;
    }

    @Override
    public void z(int i10, int i11, CharSequence charSequence, boolean z10) {
        yi yiVar = (yi) this.f14084a;
        if (yiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yiVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, yiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            yiVar.m1().setText(spannableStringBuilder);
            yiVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public b() {
        this.f14084a = new HashMap();
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public b(int i10, int i11, int... iArr) {
        h60[] h60VarArr = new h60[(iArr.length / 2) + 1];
        this.f14084a = h60VarArr;
        h60 h60Var = new h60(i10, i11);
        int i12 = 0;
        h60VarArr[0] = h60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((h60[]) this.f14084a)[i13] = new h60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public float get() {
        w0 w0Var = (w0) this.f14084a;
        int i10 = w0Var.f40332a;
        og.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return x0.e(i10).f14557i;
        }
        return x0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public void s() {
    }

    @Override
    public void K(String str) {
    }

    @Override
    public void k0(ArrayList arrayList) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override
    public void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void v(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
