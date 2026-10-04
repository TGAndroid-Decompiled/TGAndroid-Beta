package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.b2;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.a71;
import pg.u0;
import qg.v1;
import qg.w0;
import s4.c1;
import s4.e0;
import s4.h0;
import s4.p0;
public final class c implements o0.b, u71, d5, ya0, a81, b2, e91, com.google.android.gms.common.api.internal.s, v1, com.google.android.gms.common.api.internal.o, e0, n5.b, y2.g, a71 {
    public final int f16526a;
    public Object f16527b;

    public c(int i10, boolean z10) {
        this.f16526a = i10;
    }

    public static c h(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new c(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c(i11, i12, new int[]{i12, i11});
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
            return new c(i11, i12, new int[0]);
        }
        return new c(i12, i11, new int[0]);
    }

    @Override
    public void D(int i10, int i11) {
        ((h0) this.f16527b).p(i10, i11);
    }

    @Override
    public void E(float f7) {
        w0 w0Var = (w0) this.f16527b;
        u0.e(w0Var.f45383a).k("-1", f7);
        w0Var.f45386e.setBrushSize(f7);
    }

    @Override
    public void F(int i10, int i11, CharSequence charSequence, boolean z10) {
        xi xiVar = (xi) this.f16527b;
        if (xiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xiVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, xiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            xiVar.m1().setText(spannableStringBuilder);
            xiVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f16527b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public void O0(int i10, int i11) {
        ((h0) this.f16527b).t(i10, i11);
    }

    @Override
    public void a(int i10) {
        vq0 vq0Var = (vq0) this.f16527b;
        zq0 zq0Var = vq0Var.K;
        vq0Var.f32347s = i10;
        if (vq0Var.v != i10) {
            vq0Var.d.clear();
        }
        int i11 = vq0Var.J;
        if (vq0Var.h() == 0 && !vq0Var.f32343e.e() && !vq0Var.I) {
            zq0Var.Q.e(false, true);
        } else {
            zq0Var.f33633x0.b(i11);
        }
        vq0Var.l();
        int i12 = zq0.W0;
        zq0Var.H0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16526a) {
            case 11:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel I0 = aVar.I0();
                k7.a.c(I0, (n6.o) this.f16527b);
                try {
                    aVar.f338b.transact(1, I0, null, 1);
                    I0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    I0.recycle();
                    throw th2;
                }
            default:
                v8.j jVar = (v8.j) this.f16527b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar2 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8707a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    iVar.f8715a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.O(Status.h, null);
                    return;
                }
        }
    }

    public boolean b(int i10) {
        x81 x81Var = ((g91) this.f16527b).L;
        if (x81Var == null) {
            return false;
        }
        return x81Var.c(i10);
    }

    @Override
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16527b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16527b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f16527b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e7) {
                    yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public void e(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f16527b;
        int i10 = aVar.f46493a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f3090x.X(recyclerView, aVar.f46494b, aVar.d);
                    return;
                }
                recyclerView.f3090x.a0(recyclerView, aVar.f46494b, aVar.d, aVar.f46495c);
                return;
            }
            recyclerView.f3090x.Y(recyclerView, aVar.f46494b, aVar.d);
            return;
        }
        recyclerView.f3090x.V(recyclerView, aVar.f46494b, aVar.d);
    }

    public void f(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f16527b;
        int L = recyclerView.f3066e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.f3066e.K(i15);
            c1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.f46533c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f46540l) == 0) {
                    if (U.f46541m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f46541m = arrayList;
                        U.f46542n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f46541m.add(obj);
                }
                ((p0) K.getLayoutParams()).f46652c = true;
            }
        }
        of.e eVar = recyclerView.f3061b;
        ArrayList arrayList2 = (ArrayList) eVar.f17178e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f46533c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f3091x0 = true;
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f16527b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void i(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f16527b;
        int L = recyclerView.f3066e.L();
        for (int i12 = 0; i12 < L; i12++) {
            c1 U = RecyclerView.U(recyclerView.f3066e.K(i12));
            if (U != null && !U.r() && U.f46533c >= i10) {
                U.n(i11, false);
                recyclerView.f3085t0.f46712f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3061b.f17178e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f46533c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3089w0 = true;
    }

    @Override
    public void invalidate() {
        ((u1) ((h1) this.f16527b).f22198b).invalidate();
    }

    public void j(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f16527b;
        int L = recyclerView.f3066e.L();
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
        for (int i20 = 0; i20 < L; i20++) {
            c1 U = RecyclerView.U(recyclerView.f3066e.K(i20));
            if (U != null && (i18 = U.f46533c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f3085t0.f46712f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3061b.f17178e;
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
            if (c1Var != null && (i17 = c1Var.f46533c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3089w0 = true;
    }

    public void k(float f7) {
        g91 g91Var = (g91) this.f16527b;
        View[] viewArr = g91Var.f26738e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                g91Var.G();
                g91Var.h.put(g91Var.f26739f[1], viewArr[1]);
                g91Var.removeView(viewArr[1]);
                g91Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            g91Var.A(g91Var.f26736b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (g91Var.f26745y) {
            g91Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            g91Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            g91Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            g91Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        g91Var.x(false);
    }

    public void l(da.b bVar, Thread thread, Throwable th2) {
        w9.n nVar = (w9.n) this.f16527b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w9.x.a(nVar.f48960e.m(new w9.l(nVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }

    @Override
    public void m0(int i10, int i11) {
        ((h0) this.f16527b).s(i10, i11);
    }

    @Override
    public void n1(int i10, int i11) {
        ((h0) this.f16527b).r(i10, i11, null);
    }

    @Override
    public void onError(d81 d81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f60 f60Var;
        VideoEditedInfo videoEditedInfo;
        y50 y50Var = (y50) this.f16527b;
        d81 d81Var = y50Var.H0.T;
        if (d81Var != null && d81Var.y() && i10 == 4 && (videoEditedInfo = (f60Var = y50Var.H0).S) != null) {
            d81 d81Var2 = f60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            d81Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void q(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f16527b);
    }

    @Override
    public Paint.FontMetricsInt r() {
        return ((xi) this.f16527b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public k4.d s(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f16527b).f15256a.x(iOException);
        return y2.l.f50406e;
    }

    @Override
    public void v(y2.i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f16527b;
        synchronized (z2.b.f52357b) {
            z10 = z2.b.f52358c;
        }
        if (!z10) {
            dVar.f15256a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        if (i10 == ((vq0) this.f16527b).f32346r) {
            return true;
        }
        return false;
    }

    public c(Object obj, int i10) {
        this.f16526a = i10;
        this.f16527b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(int i10) {
        this.f16526a = i10;
        switch (i10) {
            case 26:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f16527b = new ArrayList();
                return;
            default:
                this.f16527b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    @Override
    public float get() {
        w0 w0Var = (w0) this.f16527b;
        int i10 = w0Var.f45383a;
        pg.m currentBrush = w0Var.f45386e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f44653i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    public c(int i10, int i11, int[] iArr) {
        this.f16526a = 4;
        m60[] m60VarArr = new m60[(iArr.length / 2) + 1];
        this.f16527b = m60VarArr;
        m60 m60Var = new m60(i10, i11);
        int i12 = 0;
        m60VarArr[0] = m60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((m60[]) this.f16527b)[i13] = new m60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public c(TextView textView) {
        this.f16526a = 12;
        this.f16527b = new q1.g(textView);
    }

    public c(Context context, Uri uri) {
        this.f16526a = 1;
        this.f16527b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void C(ArrayList arrayList) {
    }

    @Override
    public void G(String str) {
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
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void t(y2.i iVar, long j3, long j10, int i10) {
    }

    @Override
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
    }
}
