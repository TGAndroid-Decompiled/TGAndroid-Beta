package defpackage;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;
public final class dkc implements OnCompleteListener, rmc, ll5, ed, iuc, xcb, f69 {
    public final byte a;
    public final Object b;

    public dkc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((joc) this.b).d0.f0();
    }

    @Override
    public final void a(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((smc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, bm2.o(i, Math.round(Color.alpha(i) * 0.5f)));
                return;
            default:
                ((gn) obj).s(f, f2, i);
                return;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        k0d k0dVar = (k0d) obj;
        k0dVar.getClass();
        x0d x0dVar = new x0d((TaskCompletionSource) obj2);
        ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
        hoVar.c = false;
        r0d r0dVar = (r0d) ((v0d) k0dVar.k());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = szc.a;
        obtain.writeStrongBinder(x0dVar);
        obtain.writeInt(1);
        ((o0d) this.b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        hoVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            r0dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public final InputStream b(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
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
    public final void i(WebView webView, qx qxVar, Uri uri, boolean z, zs5 zs5Var) {
        zs5 zs5Var2;
        auc aucVar = (auc) this.b;
        if (webView == aucVar.o && z && uri != null && aucVar.f.equals(uri.toString()) && aucVar.j(webView)) {
            boolean z2 = qxVar.b;
            if (!z2) {
                qxVar.b(0);
                String str = (String) qxVar.c;
                if (!aucVar.q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (aucVar.a) {
                        if (!aucVar.u && aucVar.r && aucVar.p == zs5Var) {
                            if (str.length() - 14 > 1398112) {
                                aucVar.h();
                                return;
                            } else {
                                aucVar.k.execute(new isc(aucVar, str, (byte) 7));
                                return;
                            }
                        }
                        return;
                    }
                }
                aucVar.i(str, zs5Var);
            } else if (z2) {
                synchronized (aucVar.a) {
                    if (!aucVar.u && (zs5Var2 = aucVar.p) != null && zs5Var2 == zs5Var) {
                        qxVar.b(1);
                        byte[] bArr = (byte[]) qxVar.d;
                        Objects.requireNonNull(bArr);
                        aucVar.k.execute(new isc(aucVar, bArr, (byte) 8));
                    }
                }
            }
        }
    }

    @Override
    public final Object m() {
        wtc wtcVar = (wtc) this.b;
        for (ra0 ra0Var : (Iterable) ((lo9) wtcVar.b).c(new ho9((byte) 0))) {
            ((xl3) wtcVar.c).F(ra0Var, 1, false);
        }
        return null;
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kdd.b((Intent) obj);
                return;
            case 11:
                ((nyc) obj).b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        ((toc) this.b).c0();
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
