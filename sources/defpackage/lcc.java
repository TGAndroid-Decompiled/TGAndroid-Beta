package defpackage;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;
public final class lcc implements r5b, ln5, qq7, OnCompleteListener, roc, ee, jwc, yeb, h89 {
    public final byte a;
    public final Object b;

    public lcc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        int i;
        int i2;
        View fragmentView;
        bj6 bj6Var = (bj6) ((jgc) this.b);
        iq5 H0 = gm.H0(wzcVar, false);
        int i3 = H0.a;
        bj6Var.M = i3;
        int i4 = H0.c;
        bj6Var.N = i4;
        bj6Var.L = H0.d;
        boolean a = bj6Var.y.a();
        if (a) {
            i = gm.L(44.0f);
        } else {
            i = 0;
        }
        bj6Var.y.setPadding(0, 0, 0, bj6Var.L);
        int L = gm.L(72.0f) + bj6Var.L + i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bj6Var.H.getLayoutParams();
        if (marginLayoutParams.height != L) {
            marginLayoutParams.height = L;
            bj6Var.H.setLayoutParams(marginLayoutParams);
        }
        if (a) {
            i2 = bj6Var.L + i;
        } else {
            i2 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) bj6Var.c.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i2 || marginLayoutParams2.leftMargin != i3 || marginLayoutParams2.rightMargin != i4) {
            marginLayoutParams2.leftMargin = i3;
            marginLayoutParams2.rightMargin = i4;
            marginLayoutParams2.bottomMargin = i2;
            bj6Var.c.setLayoutParams(marginLayoutParams2);
        }
        bj6Var.E.setPadding(i3, 0, i4, bj6Var.L);
        if (a) {
            wzcVar = wzcVar.a.m(0, 0, 0, bj6Var.L);
        }
        bj6Var.h0();
        bj6Var.g0();
        SparseArray sparseArray = bj6Var.a;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i5);
            if (hgcVar != null && (fragmentView = hgcVar.a.getFragmentView()) != null) {
                kfc.b(fragmentView, wzcVar);
            }
        }
        return wzc.b;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void a(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ((soc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, on2.p(i, Math.round(Color.alpha(i) * 0.5f)));
                return;
            default:
                ((ho) obj).s(f, f2, i);
                return;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        m2d m2dVar = (m2d) obj;
        m2dVar.getClass();
        z2d z2dVar = new z2d((TaskCompletionSource) obj2);
        hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
        hpVar.c = false;
        t2d t2dVar = (t2d) ((x2d) m2dVar.k());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = t1d.a;
        obtain.writeStrongBinder(z2dVar);
        obtain.writeInt(1);
        ((q2d) this.b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        hpVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            t2dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public final void b(WebView webView, ry ryVar, Uri uri, boolean z, yu5 yu5Var) {
        yu5 yu5Var2;
        bwc bwcVar = (bwc) this.b;
        if (webView == bwcVar.o && z && uri != null && bwcVar.f.equals(uri.toString()) && bwcVar.j(webView)) {
            boolean z2 = ryVar.b;
            if (!z2) {
                ryVar.a(0);
                String str = (String) ryVar.c;
                if (!bwcVar.q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (bwcVar.a) {
                        if (!bwcVar.u && bwcVar.r && bwcVar.p == yu5Var) {
                            if (str.length() - 14 > 1398112) {
                                bwcVar.h();
                                return;
                            } else {
                                bwcVar.k.execute(new ptc(bwcVar, str, (byte) 9));
                                return;
                            }
                        }
                        return;
                    }
                }
                bwcVar.i(str, yu5Var);
            } else if (z2) {
                synchronized (bwcVar.a) {
                    if (!bwcVar.u && (yu5Var2 = bwcVar.p) != null && yu5Var2 == yu5Var) {
                        ryVar.a(1);
                        byte[] bArr = (byte[]) ryVar.d;
                        Objects.requireNonNull(bArr);
                        bwcVar.k.execute(new ptc(bwcVar, bArr, (byte) 10));
                    }
                }
            }
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        eec eecVar;
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
            case 2:
                fec fecVar = (fec) obj;
                ImageReceiver imageReceiver2 = fecVar.R;
                if (z) {
                    if (fecVar.O != null || fecVar.e0 != null) {
                        int L = gm.L(150.0f);
                        ya8 ya8Var = fecVar.O;
                        if (ya8Var != null) {
                            ArrayList arrayList = ya8Var.w;
                            int indexOf = arrayList.indexOf(ya8Var.b((int) fecVar.P));
                            if (indexOf != -1) {
                                if (indexOf == arrayList.size() - 1) {
                                    int videoDuration = ya8Var.getVideoDuration() / 1000;
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
                            ya8 ya8Var2 = fecVar.O;
                            int i5 = (int) fecVar.P;
                            int videoDuration2 = ya8Var2.getVideoDuration() / 1000;
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
                            fecVar.S = (int) ((min % 5) * q);
                            fecVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            fecVar.U = i;
                            i2 = (int) o;
                            fecVar.V = i2;
                        } else {
                            z4 = true;
                            int i6 = 0;
                            while (true) {
                                if (i6 < fecVar.e0.size()) {
                                    eecVar = (eec) fecVar.e0.get(i6);
                                    if (i6 == 0) {
                                        d = 0.0d;
                                    } else {
                                        d = eecVar.a;
                                    }
                                    if (i6 == fecVar.e0.size() - 1) {
                                        d2 = 9.9999999E7d;
                                    } else {
                                        d2 = ((eec) fecVar.e0.get(i6 + 1)).a;
                                    }
                                    double d3 = fecVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i6++;
                                    }
                                } else {
                                    eecVar = null;
                                }
                            }
                            if (eecVar != null) {
                                fecVar.S = eecVar.b;
                                fecVar.T = eecVar.c;
                                i = fecVar.c0;
                                fecVar.U = i;
                                i2 = fecVar.d0;
                                fecVar.V = i2;
                            } else {
                                return;
                            }
                        }
                        fecVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = fecVar.getLayoutParams();
                        if (fecVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            fecVar.setVisibility(0);
                            fecVar.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((lqc) obj).d0.f0();
                return;
        }
    }

    @Override
    public final Object e() {
        e7a e7aVar = (e7a) this.b;
        for (rb0 rb0Var : (Iterable) ((mq9) e7aVar.b).c(new dq9((byte) 1))) {
            ((in3) e7aVar.c).E(rb0Var, 1, false);
        }
        return null;
    }

    @Override
    public final long get() {
        ndc ndcVar = ((e98) this.b).a.G2;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        return 0L;
    }

    public final InputStream h(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
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
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                mfd.b((Intent) obj);
                return;
            case 15:
                ((o0d) obj).b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        ((vqc) this.b).d0();
    }

    private final void f(ImageReceiver imageReceiver) {
    }

    private final void g(ImageReceiver imageReceiver) {
    }

    private final void c(int i, Drawable drawable) {
    }

    private final void d(int i, Drawable drawable) {
    }
}
