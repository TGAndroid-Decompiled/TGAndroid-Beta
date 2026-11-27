package defpackage;

import android.content.Intent;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;
public final class ftb implements m8, t69, ez5, fd, yma, sgb, ta9, rv9, Continuation, n7b, on5, NativeLifecycleLock.NativeDisposer, nr7, OnCompleteListener, erc, yyc, s99 {
    public final byte a;
    public final Object b;

    public ftb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        int i;
        int i2;
        View fragmentView;
        fj6 fj6Var = (fj6) ((iic) this.b);
        mq5 H0 = hl.H0(l2dVar, false);
        int i3 = H0.a;
        fj6Var.P = i3;
        int i4 = H0.c;
        fj6Var.Q = i4;
        fj6Var.O = H0.d;
        boolean a = fj6Var.G.a();
        if (a) {
            i = hl.L(44.0f);
        } else {
            i = 0;
        }
        fj6Var.G.setPadding(0, 0, 0, fj6Var.O);
        int L = hl.L(72.0f) + fj6Var.O + i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fj6Var.K.getLayoutParams();
        if (marginLayoutParams.height != L) {
            marginLayoutParams.height = L;
            fj6Var.K.setLayoutParams(marginLayoutParams);
        }
        if (a) {
            i2 = fj6Var.O + i;
        } else {
            i2 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fj6Var.c.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i2 || marginLayoutParams2.leftMargin != i3 || marginLayoutParams2.rightMargin != i4) {
            marginLayoutParams2.leftMargin = i3;
            marginLayoutParams2.rightMargin = i4;
            marginLayoutParams2.bottomMargin = i2;
            fj6Var.c.setLayoutParams(marginLayoutParams2);
        }
        fj6Var.H.setPadding(i3, 0, i4, fj6Var.O);
        if (a) {
            l2dVar = l2dVar.a.m(0, 0, 0, fj6Var.O);
        }
        fj6Var.k0();
        fj6Var.i0();
        SparseArray sparseArray = fj6Var.a;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            gic gicVar = (gic) sparseArray.valueAt(i5);
            if (gicVar != null && (fragmentView = gicVar.a.getFragmentView()) != null) {
                ihc.b(fragmentView, l2dVar);
            }
        }
        return l2d.b;
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final void a(String str) {
        b4c b4cVar = (b4c) this.b;
        b4cVar.Z1 = str;
        b4cVar.e2.O(true);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        b5d b5dVar = (b5d) obj;
        b5dVar.getClass();
        o5d o5dVar = new o5d((TaskCompletionSource) obj2);
        io ioVar = new io(new cq2(-1, -1, 0, true), false);
        ioVar.c = false;
        i5d i5dVar = (i5d) ((m5d) b5dVar.k());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = j4d.a;
        obtain.writeStrongBinder(o5dVar);
        obtain.writeInt(1);
        ((f5d) this.b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        ioVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            i5dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public final void b(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                ((frc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, vm2.o(i, Math.round(Color.alpha(i) * 0.5f)));
                return;
            default:
                ((hn) obj).s(f, f2, i);
                return;
        }
    }

    @Override
    public final void c() {
        ((ktb) this.b).e();
    }

    @Override
    public final void dispose(long j) {
        ((VideoTrack) this.b).lambda$dispose$2(j);
    }

    @Override
    public final boolean e(int i, View view) {
        ((axb) this.b).K.e(i, view);
        return true;
    }

    @Override
    public final Object g() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ds9 ds9Var = (ds9) ((ba0) obj).i;
                SQLiteDatabase a = ds9Var.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ds9Var.b.e()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                    a.endTransaction();
                }
            default:
                u8a u8aVar = (u8a) obj;
                for (ta0 ta0Var : (Iterable) ((ds9) u8aVar.b).c(new vr9((byte) 3))) {
                    ((pm3) u8aVar.c).E(ta0Var, 1, false);
                }
                return null;
        }
    }

    @Override
    public final long get() {
        kfc kfcVar = ((ua8) this.b).a.G2;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        return 0L;
    }

    @Override
    public final void i(WebView webView, rx rxVar, Uri uri, boolean z, cv5 cv5Var) {
        cv5 cv5Var2;
        pyc pycVar = (pyc) this.b;
        if (webView == pycVar.o && z && uri != null && pycVar.f.equals(uri.toString()) && pycVar.j(webView)) {
            boolean z2 = rxVar.b;
            if (!z2) {
                rxVar.b(0);
                String str = (String) rxVar.c;
                if (!pycVar.q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (pycVar.a) {
                        if (!pycVar.u && pycVar.r && pycVar.p == cv5Var) {
                            if (str.length() - 14 > 1398112) {
                                pycVar.h();
                                return;
                            } else {
                                pycVar.k.execute(new zwc(pycVar, str, (byte) 7));
                                return;
                            }
                        }
                        return;
                    }
                }
                pycVar.i(str, cv5Var);
            } else if (z2) {
                synchronized (pycVar.a) {
                    if (!pycVar.u && (cv5Var2 = pycVar.p) != null && cv5Var2 == cv5Var) {
                        rxVar.b(1);
                        byte[] bArr = (byte[]) rxVar.d;
                        Objects.requireNonNull(bArr);
                        pycVar.k.execute(new zwc(pycVar, bArr, (byte) 8));
                    }
                }
            }
        }
    }

    @Override
    public final void j(int i) {
        pcc pccVar = ((b8c) this.b).D;
        if (pccVar != null) {
            pccVar.a(Integer.valueOf(i));
        }
    }

    public final InputStream l(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ZipFile zipFile = (ZipFile) obj;
                String str2 = WidgetEngineService.b;
                ZipEntry entry = zipFile.getEntry("assets/WidgetSandbox/".concat(str));
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
                throw new FileNotFoundException(str);
            default:
                String str3 = WidgetEngineService.b;
                return ((AssetManager) obj).open("WidgetSandbox/".concat(str));
        }
    }

    @Override
    public final void n(long j, ey7 ey7Var) {
        ivd.b(j, ey7Var, ((oz9) this.b).c);
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                cid.b((Intent) obj);
                return;
            case 25:
                ((d3d) obj).b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override
    public final void p(int i) {
        bcc bccVar = (bcc) this.b;
        if (bccVar.h == null && !bccVar.f.e()) {
            bccVar.w.f.e(false, true);
        }
        bccVar.f();
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        bgc bgcVar;
        int i;
        int i2;
        double d;
        double d2;
        int i3;
        int i4;
        int ceil;
        double ceil2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                cgc cgcVar = (cgc) obj;
                ImageReceiver imageReceiver2 = cgcVar.R;
                if (z) {
                    if (cgcVar.O != null || cgcVar.e0 != null) {
                        int L = hl.L(150.0f);
                        nc8 nc8Var = cgcVar.O;
                        if (nc8Var != null) {
                            ArrayList arrayList = nc8Var.w;
                            int indexOf = arrayList.indexOf(nc8Var.b((int) cgcVar.P));
                            if (indexOf != -1) {
                                if (indexOf == arrayList.size() - 1) {
                                    int videoDuration = nc8Var.getVideoDuration() / 1000;
                                    z4 = true;
                                    if (videoDuration <= 100) {
                                        ceil2 = Math.ceil(videoDuration);
                                    } else if (videoDuration <= 250) {
                                        ceil2 = Math.ceil(videoDuration / 2.0f);
                                    } else if (videoDuration <= 500) {
                                        ceil2 = Math.ceil(videoDuration / 4.0f);
                                    } else if (videoDuration <= 1000) {
                                        ceil2 = Math.ceil(videoDuration / 5.0f);
                                    } else {
                                        ceil2 = Math.ceil(videoDuration / 10.0f);
                                    }
                                    i4 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                                } else {
                                    z4 = true;
                                    i4 = 25;
                                }
                            } else {
                                z4 = true;
                                i4 = 0;
                            }
                            float q = imageReceiver2.q() / Math.min(i4, 5);
                            float o = imageReceiver2.o() / ((int) Math.ceil(i4 / 5.0f));
                            nc8 nc8Var2 = cgcVar.O;
                            int i5 = (int) cgcVar.P;
                            int videoDuration2 = nc8Var2.getVideoDuration() / 1000;
                            if (videoDuration2 <= 100) {
                                ceil = ((int) Math.ceil(i5)) % 25;
                            } else if (videoDuration2 <= 250) {
                                ceil = ((int) Math.ceil(i5 / 2.0f)) % 25;
                            } else if (videoDuration2 <= 500) {
                                ceil = ((int) Math.ceil(i5 / 4.0f)) % 25;
                            } else if (videoDuration2 <= 1000) {
                                ceil = ((int) Math.ceil(i5 / 5.0f)) % 25;
                            } else {
                                ceil = ((int) Math.ceil(i5 / 10.0f)) % 25;
                            }
                            int min = Math.min(ceil, i4 - 1);
                            cgcVar.S = (int) ((min % 5) * q);
                            cgcVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            cgcVar.U = i;
                            i2 = (int) o;
                            cgcVar.V = i2;
                        } else {
                            z4 = true;
                            int i6 = 0;
                            while (true) {
                                if (i6 < cgcVar.e0.size()) {
                                    bgcVar = (bgc) cgcVar.e0.get(i6);
                                    if (i6 == 0) {
                                        d = 0.0d;
                                    } else {
                                        d = bgcVar.a;
                                    }
                                    if (i6 == cgcVar.e0.size() - 1) {
                                        d2 = 9.9999999E7d;
                                    } else {
                                        d2 = ((bgc) cgcVar.e0.get(i6 + 1)).a;
                                    }
                                    double d3 = cgcVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i6++;
                                    }
                                } else {
                                    bgcVar = null;
                                }
                            }
                            if (bgcVar != null) {
                                cgcVar.S = bgcVar.b;
                                cgcVar.T = bgcVar.c;
                                i = cgcVar.c0;
                                cgcVar.U = i;
                                i2 = cgcVar.d0;
                                cgcVar.V = i2;
                            } else {
                                return;
                            }
                        }
                        cgcVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = cgcVar.getLayoutParams();
                        if (cgcVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            cgcVar.setVisibility(0);
                            cgcVar.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((vsc) obj).d0.f0();
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((m7c) obj).a.J0(true);
                return;
            default:
                ((gtc) obj).c0();
                return;
        }
    }

    @Override
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final void m() {
    }

    private final void h(ImageReceiver imageReceiver) {
    }

    private final void k(ImageReceiver imageReceiver) {
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }

    private final void d(int i, Drawable drawable) {
    }

    private final void f(int i, Drawable drawable) {
    }
}
