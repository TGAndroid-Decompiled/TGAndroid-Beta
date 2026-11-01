package b2;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.x3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.y20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eq0;
import org.telegram.ui.of0;
import org.telegram.ui.rj0;
import org.telegram.ui.tq0;
import v7.t6;
public final class u implements t61, androidx.lifecycle.a0, y9.i, s4.c0 {
    public final int f2299a;
    public boolean f2300b;
    public Object f2301c;

    public u(int i10) {
        this.f2299a = i10;
    }

    public static u g(Bundle bundle) {
        p4.m mVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                if (bundle2 != null) {
                    mVar = new p4.m(bundle2);
                } else {
                    mVar = null;
                }
                arrayList.add(mVar);
            }
        }
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void E(int i10, int i11) {
        this.f2300b = true;
        ((s4.g0) this.f2301c).j(i10, i11);
    }

    @Override
    public void Q0(int i10, int i11) {
        this.f2300b = true;
        ((s4.g0) this.f2301c).p(i10, i11);
    }

    @Override
    public void a(y9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f2301c;
        if (this.f2300b) {
            this.f2300b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        t6.p(!this.f2300b);
        ((SparseBooleanArray) this.f2301c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.f2347a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        t6.p(!this.f2300b);
        this.f2300b = true;
        return new v((SparseBooleanArray) this.f2301c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f2300b) {
                    return;
                }
                this.f2300b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2301c;
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
        return this.f2300b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f2301c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i11 = 0; i11 < i10 && z10; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                u uVar = p0.f.f44538a;
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

    public void i(x3 x3Var) {
        if (this.f2300b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.f2301c).a(new i5.a(null, x3Var, i5.d.f8207a, null), new k2.k0(5));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void k0(Object obj) {
        this.f2300b = true;
        k6.h hVar = (k6.h) this.f2301c;
        hVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) hVar.f10944b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override
    public void n0(int i10, int i11) {
        this.f2300b = true;
        ((s4.g0) this.f2301c).o(i10, i11);
    }

    @Override
    public void onError(v61 v61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        if (photoViewer.F2 == v61Var) {
            f8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33564o0.f20827b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.D, photoViewer.f33629v2);
                String L0 = dd.L0(2131689472, "AppName");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131752562, null);
                alertDialog$Builder.k(dd.L0(2131747833, "Open"), new rj0(this, 3));
                alertDialog$Builder.h(dd.L0(2131752589, "Cancel"), null);
                photoViewer.V2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33477e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            v61 v61Var = photoViewer.F2;
            if (v61Var == null || !v61Var.V) {
                org.telegram.messenger.i0.h3(new tq0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        v61 v61Var;
        int i11;
        y20 y20Var;
        v61 v61Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        ArrayList arrayList = photoViewer.f33501g7;
        v61 v61Var3 = photoViewer.F2;
        if (v61Var3 != null) {
            if (!b5.d.u() && !photoViewer.f33589r) {
                z11 = false;
            } else {
                z11 = true;
            }
            v61Var3.t0(z11);
        }
        if (this.f2300b && (v61Var = photoViewer.F2) != null && v61Var.U() != -9223372036854775807L) {
            this.f2300b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33446a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ff) {
                    ff ffVar = (ff) obj;
                    if (ffVar.f14603b && (y20Var = ffVar.f14617s) != null) {
                        photoViewer.F2.p0(y20Var.d * ((float) v61Var2.U()));
                        eq0 eq0Var = photoViewer.S7;
                        if (eq0Var != null) {
                            eq0Var.setProgress(ffVar.f14617s.d);
                        }
                    }
                }
            }
        }
        photoViewer.B3(i10, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        if (jf0.k() != null && jf0.k().f9864b.f11818a != 0 && (textureView = photoViewer.f33640w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            jf0 jf0Var = jf0.f27400p0;
            TextureView textureView3 = null;
            if (jf0Var != null) {
                textureView2 = jf0Var.f27416l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (jf0Var != null) {
                textureView3 = jf0Var.f27416l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f33640w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f33640w3.setSurfaceTextureListener(photoViewer.f33525j4);
                photoViewer.f33640w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        ((PhotoViewer) this.f2301c).y0(false);
        org.telegram.messenger.i0.g3(new tq0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        if (photoViewer.f33659y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            jf.f fVar = photoViewer.G2;
            if (fVar != null) {
                fVar.d(i13, i14);
            }
            af0 af0Var = photoViewer.f33659y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            af0Var.a(f10, 0);
            if (photoViewer.B2 instanceof l61) {
                ((l61) photoViewer.B2).setHDRInfo(photoViewer.F2.V(null));
                l61 l61Var = (l61) photoViewer.B2;
                l61Var.d = i13;
                l61Var.e = i11;
                gz gzVar = l61Var.f28063b;
                if (gzVar != null) {
                    gzVar.postRunnable(new cz(gzVar, i13, i11, 0));
                }
                if (photoViewer.f33461c2 == 1) {
                    photoViewer.C2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.f2299a) {
            case 6:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2301c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        p4.m mVar = (p4.m) list.get(i10);
                        if (mVar != null && mVar.e()) {
                            i10++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 7:
            default:
                return super.toString();
            case 8:
                return ((k6.h) this.f2301c).toString();
        }
    }

    @Override
    public void x1(int i10, int i11) {
        ((s4.g0) this.f2301c).n(i10, i11, null);
    }

    public u(int i10, Object obj, boolean z10) {
        this.f2299a = i10;
        this.f2301c = obj;
    }

    public u(Object obj, int i10) {
        this.f2299a = i10;
        this.f2301c = obj;
        this.f2300b = true;
    }

    public u() {
        this.f2299a = 0;
        this.f2301c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.f2299a = 6;
        if (arrayList.isEmpty()) {
            this.f2301c = Collections.EMPTY_LIST;
        } else {
            this.f2301c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2300b = z10;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = (PhotoViewer) this.f2301c;
        com.google.android.gms.internal.cast.o oVar = photoViewer.Q8;
        if (oVar != null) {
            oVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.W(photoViewer);
        }
        if (photoViewer.E2 != null) {
            v61 v61Var = photoViewer.F2;
            if (v61Var == null || !v61Var.V) {
                org.telegram.messenger.i0.h3(new tq0(this, 2), 64L);
            }
        }
    }

    public u(of0 of0Var, boolean z10) {
        this.f2299a = 3;
        this.f2301c = of0Var;
        this.f2300b = z10;
    }

    public u(p0.e eVar, boolean z10) {
        this(5, eVar, false);
        this.f2299a = 5;
        this.f2300b = z10;
    }

    public u(a6.d dVar, k6.h hVar) {
        this.f2299a = 8;
        this.f2300b = false;
        this.f2301c = hVar;
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }
}
