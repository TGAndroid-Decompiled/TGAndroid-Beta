package ba;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.a0;
import b8.cg;
import b8.zb;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.x3;
import d2.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n5.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ci0;
import org.telegram.ui.cp0;
import org.telegram.ui.ee0;
import org.telegram.ui.no0;
import u4.d0;
import u4.h0;
public class i implements l, d0, k51, a0 {
    public final int f3185a;
    public boolean f3186b;
    public Object f3187c;

    public i(int i3) {
        this.f3185a = i3;
    }

    public static i g(Bundle bundle) {
        r4.m mVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                if (bundle2 != null) {
                    mVar = new r4.m(bundle2);
                } else {
                    mVar = null;
                }
                arrayList.add(mVar);
            }
        }
        return new i(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void E(int i3, int i10) {
        this.f3186b = true;
        ((h0) this.f3187c).j(i3, i10);
    }

    @Override
    public void O0(int i3, int i10) {
        this.f3186b = true;
        ((h0) this.f3187c).p(i3, i10);
    }

    @Override
    public void a(k kVar, int i3) {
        StringBuilder sb2 = (StringBuilder) this.f3187c;
        if (this.f3186b) {
            this.f3186b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i3);
    }

    public void b(int i3) {
        zb.p(!this.f3186b);
        ((SparseBooleanArray) this.f3187c).append(i3, true);
    }

    public void c(t tVar) {
        for (int i3 = 0; i3 < tVar.f8412a.size(); i3++) {
            b(tVar.a(i3));
        }
    }

    public t d() {
        zb.p(!this.f3186b);
        this.f3186b = true;
        return new t((SparseBooleanArray) this.f3187c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f3186b) {
                    return;
                }
                this.f3186b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f3187c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean f() {
        return this.f3186b;
    }

    public boolean h(int i3, CharSequence charSequence) {
        if (charSequence != null && i3 >= 0 && charSequence.length() - i3 >= 0) {
            p0.e eVar = (p0.e) this.f3187c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i3 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f53055a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            if (!z10) {
                return true;
            }
            if (z10) {
                return false;
            }
            return f();
        }
        throw new IllegalArgumentException();
    }

    public void i() {
        this.f3186b = false;
    }

    public void j(char c2) {
        jc.a aVar = (jc.a) this.f3187c;
        aVar.a(aVar.f16237c, 1);
        char[] cArr = aVar.f16236b;
        int i3 = aVar.f16237c;
        aVar.f16237c = i3 + 1;
        cArr[i3] = c2;
    }

    @Override
    public void j1(int i3, int i10) {
        ((h0) this.f3187c).n(i3, i10, null);
    }

    @Override
    public void l0(int i3, int i10) {
        this.f3186b = true;
        ((h0) this.f3187c).o(i3, i10);
    }

    public void m(x3 x3Var) {
        if (this.f3186b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.f3187c).a(k5.a.a(x3Var), new l2.d(27));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        if (photoViewer.G2 == m51Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f41504p0.f28440b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.f41570w2);
                String M0 = bd.M0(2131689472, "AppName");
                s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752562, null);
                alertDialog$Builder.k(bd.M0(2131747825, "Open"), new ci0(this, 3));
                alertDialog$Builder.h(bd.M0(2131752589, "Cancel"), null);
                photoViewer.V2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        if (!photoViewer.I3) {
            photoViewer.I3 = true;
            photoViewer.f41420f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            m51 m51Var = photoViewer.G2;
            if (m51Var == null || !m51Var.W) {
                g0.i3(new cp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        m51 m51Var;
        int i10;
        b20 b20Var;
        m51 m51Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        ArrayList arrayList = photoViewer.h7;
        m51 m51Var3 = photoViewer.G2;
        if (m51Var3 != null) {
            if (!d1.f.u() && !photoViewer.f41522r) {
                z11 = false;
            } else {
                z11 = true;
            }
            m51Var3.t0(z11);
        }
        if (this.f3186b && (m51Var = photoViewer.G2) != null && m51Var.U() != -9223372036854775807L) {
            this.f3186b = false;
            if (photoViewer.Z6.isEmpty() && photoViewer.f41427f7.isEmpty() && photoViewer.f41389b7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.R4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.R4);
                if (obj instanceof ye) {
                    ye yeVar = (ye) obj;
                    if (yeVar.f25310b && (b20Var = yeVar.f25325s) != null) {
                        photoViewer.G2.p0(b20Var.d * ((float) m51Var2.U()));
                        no0 no0Var = photoViewer.T7;
                        if (no0Var != null) {
                            no0Var.setProgress(yeVar.f25325s.d);
                        }
                    }
                }
            }
        }
        photoViewer.B3(i3, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        if (ie0.k() != null && ie0.k().f55850b.f57570a != 0 && (textureView = photoViewer.f41581x3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            ie0 ie0Var = ie0.f34683q0;
            TextureView textureView3 = null;
            if (ie0Var != null) {
                textureView2 = ie0Var.m0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (ie0Var != null) {
                textureView3 = ie0Var.m0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.G3) {
            photoViewer.G3 = false;
            if (photoViewer.K3) {
                photoViewer.H3 = 1;
                photoViewer.f41581x3.setSurfaceTexture(surfaceTexture);
                photoViewer.f41581x3.setSurfaceTextureListener(photoViewer.f41465k4);
                photoViewer.f41581x3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.V8;
        ((PhotoViewer) this.f3187c).y0(false);
        g0.h3(new cp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        if (photoViewer.f41599z2 != null) {
            float f12 = i3 * f10;
            int i12 = (int) f12;
            photoViewer.V = i12;
            float f13 = i10;
            int i13 = (int) (f10 * f13);
            photoViewer.W = i13;
            uf.d dVar = photoViewer.H2;
            if (dVar != null) {
                dVar.d(i12, i13);
            }
            zd0 zd0Var = photoViewer.f41599z2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            zd0Var.a(f11, 0);
            if (photoViewer.C2 instanceof b51) {
                ((b51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                b51 b51Var = (b51) photoViewer.C2;
                b51Var.d = i12;
                b51Var.f32090e = i10;
                py pyVar = b51Var.f32088b;
                if (pyVar != null) {
                    pyVar.postRunnable(new ly(pyVar, i12, i10, 0));
                }
                if (photoViewer.f41402d2 == 1) {
                    photoViewer.C2();
                }
            }
            photoViewer.J3 = true;
        }
    }

    public String toString() {
        switch (this.f3185a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f3187c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        r4.m mVar = (r4.m) list.get(i3);
                        if (mVar != null && mVar.e()) {
                            i3++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 10:
            default:
                return super.toString();
            case 11:
                return ((bb.c) this.f3187c).toString();
        }
    }

    @Override
    public void v(Object obj) {
        this.f3186b = true;
        bb.c cVar = (bb.c) this.f3187c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f3211b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    public i(int i3, Object obj, boolean z10) {
        this.f3185a = i3;
        this.f3187c = obj;
    }

    public i(Object obj, int i3) {
        this.f3185a = i3;
        this.f3187c = obj;
        this.f3186b = true;
    }

    public i() {
        this.f3185a = 1;
        this.f3187c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z10) {
        this.f3185a = 9;
        if (arrayList.isEmpty()) {
            this.f3187c = Collections.EMPTY_LIST;
        } else {
            this.f3187c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f3186b = z10;
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
        PhotoViewer photoViewer = (PhotoViewer) this.f3187c;
        cg cgVar = photoViewer.R8;
        if (cgVar != null) {
            cgVar.run();
            photoViewer.R8 = null;
        }
        long j10 = aVar.f17682e;
        if (j10 == photoViewer.Y7) {
            photoViewer.X7 = j10;
            photoViewer.Y7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.F2 != null) {
            m51 m51Var = photoViewer.G2;
            if (m51Var == null || !m51Var.W) {
                g0.i3(new cp0(this, 2), 64L);
            }
        }
    }

    public i(ee0 ee0Var, boolean z10) {
        this.f3185a = 6;
        this.f3187c = ee0Var;
        this.f3186b = z10;
    }

    public i(p0.e eVar, boolean z10) {
        this(8, eVar, false);
        this.f3185a = 8;
        this.f3186b = z10;
    }

    public i(c6.d dVar, bb.c cVar) {
        this.f3185a = 11;
        this.f3186b = false;
        this.f3187c = cVar;
    }

    public void k() {
    }

    public void l() {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }
}
