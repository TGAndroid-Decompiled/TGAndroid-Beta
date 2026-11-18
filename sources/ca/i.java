package ca;

import a8.la;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.lifecycle.a0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.x3;
import e2.s;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.me0;
import org.telegram.ui.mp0;
import org.telegram.ui.qi0;
import org.telegram.ui.xo0;
import v4.e0;
import v4.i0;
public class i implements l, e0, d61, a0 {
    public final int f5121a;
    public boolean f5122b;
    public Object f5123c;

    public i(int i7) {
        this.f5121a = i7;
    }

    public static i g(Bundle bundle) {
        s4.m mVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i7);
                if (bundle2 != null) {
                    mVar = new s4.m(bundle2);
                } else {
                    mVar = null;
                }
                arrayList.add(mVar);
            }
        }
        return new i(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void A(Object obj) {
        this.f5122b = true;
        cb.c cVar = (cb.c) this.f5123c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f5151b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override
    public void F(int i7, int i10) {
        this.f5122b = true;
        ((i0) this.f5123c).j(i7, i10);
    }

    @Override
    public void M0(int i7, int i10) {
        this.f5122b = true;
        ((i0) this.f5123c).p(i7, i10);
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f5123c;
        if (this.f5122b) {
            this.f5122b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        la.p(!this.f5122b);
        ((SparseBooleanArray) this.f5123c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10693a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        la.p(!this.f5122b);
        this.f5122b = true;
        return new s((SparseBooleanArray) this.f5123c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f5122b) {
                    return;
                }
                this.f5122b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f5123c;
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
        return this.f5122b;
    }

    @Override
    public void g0(int i7, int i10) {
        this.f5122b = true;
        ((i0) this.f5123c).o(i7, i10);
    }

    @Override
    public void g1(int i7, int i10) {
        ((i0) this.f5123c).n(i7, i10, null);
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f5123c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i7 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f55068a;
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
        this.f5122b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f5123c;
        aVar.a(aVar.f20963c, 1);
        char[] cArr = aVar.f20962b;
        int i7 = aVar.f20963c;
        aVar.f20963c = i7 + 1;
        cArr[i7] = c10;
    }

    public void m(x3 x3Var) {
        if (this.f5122b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o5.r) this.f5123c).a(l5.a.a(x3Var), new n2.a0(8));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void onError(f61 f61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        if (photoViewer.G2 == f61Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f43292p0.f29916b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.f43358w2);
                String M0 = gd.M0(2131689472, "AppName");
                u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752551, null);
                alertDialog$Builder.k(gd.M0(2131747624, "Open"), new qi0(this, 2));
                alertDialog$Builder.h(gd.M0(2131752578, "Cancel"), null);
                photoViewer.Q2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f43208f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            f61 f61Var = photoViewer.G2;
            if (f61Var == null || !f61Var.W) {
                g0.h3(new mp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        f61 f61Var;
        int i10;
        e20 e20Var;
        f61 f61Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        ArrayList arrayList = photoViewer.f43224g7;
        f61 f61Var3 = photoViewer.G2;
        if (f61Var3 != null) {
            if (!d1.f.u() && !photoViewer.f43310r) {
                z11 = false;
            } else {
                z11 = true;
            }
            f61Var3.t0(z11);
        }
        if (this.f5122b && (f61Var = photoViewer.G2) != null && f61Var.U() != -9223372036854775807L) {
            this.f5122b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f43205e7.isEmpty() && photoViewer.f43167a7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ef) {
                    ef efVar = (ef) obj;
                    if (efVar.f27847b && (e20Var = efVar.f27862s) != null) {
                        photoViewer.G2.p0(e20Var.d * ((float) f61Var2.U()));
                        xo0 xo0Var = photoViewer.S7;
                        if (xo0Var != null) {
                            xo0Var.setProgress(efVar.f27862s.d);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i7, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        wi.o oVar = photoViewer.Q8;
        if (oVar != null) {
            photoViewer.Q8 = null;
            oVar.f59993a = surfaceTexture;
            if (oVar.getSurfaceTexture() != surfaceTexture) {
                oVar.setSurfaceTexture(surfaceTexture);
            }
            oVar.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f43359w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f43359w3.setSurfaceTextureListener(photoViewer.f43245j4);
                photoViewer.f43359w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        ((PhotoViewer) this.f5123c).q0(false);
        g0.g3(new mp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        if (photoViewer.f43387z2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.V = i12;
            float f13 = i10;
            photoViewer.W = (int) (f10 * f13);
            wi.n nVar = photoViewer.P8;
            if (nVar != null) {
                nVar.c();
            }
            se0 se0Var = photoViewer.f43387z2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            se0Var.a(f11, 0);
            if (photoViewer.C2 instanceof v51) {
                ((v51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                v51 v51Var = (v51) photoViewer.C2;
                v51Var.d = i12;
                v51Var.f40503e = i10;
                cz czVar = v51Var.f40501b;
                if (czVar != null) {
                    czVar.postRunnable(new yy(czVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.x2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.f5121a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f5123c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        s4.m mVar = (s4.m) list.get(i7);
                        if (mVar != null && mVar.e()) {
                            i7++;
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
                return ((cb.c) this.f5123c).toString();
        }
    }

    public i(int i7, Object obj, boolean z10) {
        this.f5121a = i7;
        this.f5123c = obj;
    }

    public i(Object obj, int i7) {
        this.f5121a = i7;
        this.f5123c = obj;
        this.f5122b = true;
    }

    public i() {
        this.f5121a = 1;
        this.f5123c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z10) {
        this.f5121a = 9;
        if (arrayList.isEmpty()) {
            this.f5123c = Collections.EMPTY_LIST;
        } else {
            this.f5123c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f5122b = z10;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f20479e;
        PhotoViewer photoViewer = (PhotoViewer) this.f5123c;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.O(photoViewer);
        }
        if (photoViewer.F2 != null) {
            f61 f61Var = photoViewer.G2;
            if (f61Var == null || !f61Var.W) {
                g0.h3(new mp0(this, 2), 64L);
            }
        }
    }

    public i(me0 me0Var, boolean z10) {
        this.f5121a = 5;
        this.f5123c = me0Var;
        this.f5122b = z10;
    }

    public i(p0.e eVar, boolean z10) {
        this(7, eVar, false);
        this.f5121a = 7;
        this.f5122b = z10;
    }

    public i(d6.d dVar, cb.c cVar) {
        this.f5121a = 11;
        this.f5122b = false;
        this.f5123c = cVar;
    }

    public void k() {
    }

    public void l() {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }
}
