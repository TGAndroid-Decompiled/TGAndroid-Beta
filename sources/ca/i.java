package ca;

import a8.ma;
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
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.le0;
import org.telegram.ui.lp0;
import org.telegram.ui.oi0;
import org.telegram.ui.wo0;
import v4.e0;
import v4.i0;
public class i implements l, e0, f61, a0 {
    public final int f5116a;
    public boolean f5117b;
    public Object f5118c;

    public i(int i7) {
        this.f5116a = i7;
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
    public void V(int i7, int i10) {
        this.f5117b = true;
        ((i0) this.f5118c).o(i7, i10);
    }

    @Override
    public void V0(int i7, int i10) {
        ((i0) this.f5118c).n(i7, i10, null);
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f5118c;
        if (this.f5117b) {
            this.f5117b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        ma.p(!this.f5117b);
        ((SparseBooleanArray) this.f5118c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10686a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ma.p(!this.f5117b);
        this.f5117b = true;
        return new s((SparseBooleanArray) this.f5118c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f5117b) {
                    return;
                }
                this.f5117b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f5118c;
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
        return this.f5117b;
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f5118c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i7 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f55194a;
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
        this.f5117b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f5118c;
        aVar.a(aVar.f21056c, 1);
        char[] cArr = aVar.f21055b;
        int i7 = aVar.f21056c;
        aVar.f21056c = i7 + 1;
        cArr[i7] = c10;
    }

    public void m(x3 x3Var) {
        if (this.f5117b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o5.s) this.f5118c).a(l5.a.a(x3Var), new n2.a0(8));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void onError(h61 h61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        if (photoViewer.G2 == h61Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f43418p0.f29959b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.f43484w2);
                String N0 = gd.N0(2131689472, "AppName");
                t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752550, null);
                alertDialog$Builder.k(gd.N0(2131747623, "Open"), new oi0(this, 2));
                alertDialog$Builder.h(gd.N0(2131752577, "Cancel"), null);
                photoViewer.R2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f43334f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            h61 h61Var = photoViewer.G2;
            if (h61Var == null || !h61Var.W) {
                g0.h3(new lp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        h61 h61Var;
        int i10;
        d20 d20Var;
        h61 h61Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        ArrayList arrayList = photoViewer.f43350g7;
        h61 h61Var3 = photoViewer.G2;
        if (h61Var3 != null) {
            if (!d1.f.u() && !photoViewer.f43436r) {
                z11 = false;
            } else {
                z11 = true;
            }
            h61Var3.t0(z11);
        }
        if (this.f5117b && (h61Var = photoViewer.G2) != null && h61Var.U() != -9223372036854775807L) {
            this.f5117b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f43330e7.isEmpty() && photoViewer.f43288a7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ef) {
                    ef efVar = (ef) obj;
                    if (efVar.f27963b && (d20Var = efVar.f27978s) != null) {
                        photoViewer.G2.p0(d20Var.d * ((float) h61Var2.U()));
                        wo0 wo0Var = photoViewer.Y7;
                        if (wo0Var != null) {
                            wo0Var.setProgress(efVar.f27978s.d);
                        }
                    }
                }
            }
        }
        photoViewer.z3(i7, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        wi.o oVar = photoViewer.W8;
        if (oVar != null) {
            photoViewer.W8 = null;
            oVar.f60121a = surfaceTexture;
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
                photoViewer.f43485w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f43485w3.setSurfaceTextureListener(photoViewer.f43371j4);
                photoViewer.f43485w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        ((PhotoViewer) this.f5118c).q0(false);
        g0.g3(new lp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        if (photoViewer.f43513z2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.V = i12;
            float f13 = i10;
            photoViewer.W = (int) (f10 * f13);
            wi.n nVar = photoViewer.V8;
            if (nVar != null) {
                nVar.c();
            }
            te0 te0Var = photoViewer.f43513z2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            te0Var.a(f11, 0);
            if (photoViewer.C2 instanceof x51) {
                ((x51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                x51 x51Var = (x51) photoViewer.C2;
                x51Var.d = i12;
                x51Var.f41852e = i10;
                bz bzVar = x51Var.f41850b;
                if (bzVar != null) {
                    bzVar.postRunnable(new xy(bzVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.y2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.f5116a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f5118c;
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
                return ((cb.c) this.f5118c).toString();
        }
    }

    @Override
    public void u(Object obj) {
        this.f5117b = true;
        cb.c cVar = (cb.c) this.f5118c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f5146b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override
    public void y0(int i7, int i10) {
        this.f5117b = true;
        ((i0) this.f5118c).p(i7, i10);
    }

    @Override
    public void z(int i7, int i10) {
        this.f5117b = true;
        ((i0) this.f5118c).j(i7, i10);
    }

    public i(int i7, Object obj, boolean z10) {
        this.f5116a = i7;
        this.f5118c = obj;
    }

    public i(Object obj, int i7) {
        this.f5116a = i7;
        this.f5118c = obj;
        this.f5117b = true;
    }

    public i() {
        this.f5116a = 1;
        this.f5118c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z10) {
        this.f5116a = 9;
        if (arrayList.isEmpty()) {
            this.f5118c = Collections.EMPTY_LIST;
        } else {
            this.f5118c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f5117b = z10;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f20572e;
        PhotoViewer photoViewer = (PhotoViewer) this.f5118c;
        if (j3 == photoViewer.f43320d8) {
            photoViewer.f43311c8 = j3;
            photoViewer.f43320d8 = -1L;
            PhotoViewer.O(photoViewer);
        }
        if (photoViewer.F2 != null) {
            h61 h61Var = photoViewer.G2;
            if (h61Var == null || !h61Var.W) {
                g0.h3(new lp0(this, 2), 64L);
            }
        }
    }

    public i(le0 le0Var, boolean z10) {
        this.f5116a = 5;
        this.f5118c = le0Var;
        this.f5117b = z10;
    }

    public i(p0.e eVar, boolean z10) {
        this(7, eVar, false);
        this.f5116a = 7;
        this.f5117b = z10;
    }

    public i(d6.d dVar, cb.c cVar) {
        this.f5116a = 11;
        this.f5117b = false;
        this.f5118c = cVar;
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
