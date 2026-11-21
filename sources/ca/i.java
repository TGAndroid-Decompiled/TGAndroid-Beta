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
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.me0;
import org.telegram.ui.mp0;
import org.telegram.ui.qi0;
import org.telegram.ui.xo0;
import v4.e0;
import v4.i0;
public class i implements l, e0, g61, a0 {
    public final int f5150a;
    public boolean f5151b;
    public Object f5152c;

    public i(int i7) {
        this.f5150a = i7;
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
        this.f5151b = true;
        cb.c cVar = (cb.c) this.f5152c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f5180b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override
    public void F(int i7, int i10) {
        this.f5151b = true;
        ((i0) this.f5152c).j(i7, i10);
    }

    @Override
    public void M0(int i7, int i10) {
        this.f5151b = true;
        ((i0) this.f5152c).p(i7, i10);
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f5152c;
        if (this.f5151b) {
            this.f5151b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        la.p(!this.f5151b);
        ((SparseBooleanArray) this.f5152c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10722a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        la.p(!this.f5151b);
        this.f5151b = true;
        return new s((SparseBooleanArray) this.f5152c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f5151b) {
                    return;
                }
                this.f5151b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f5152c;
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
        return this.f5151b;
    }

    @Override
    public void g0(int i7, int i10) {
        this.f5151b = true;
        ((i0) this.f5152c).o(i7, i10);
    }

    @Override
    public void g1(int i7, int i10) {
        ((i0) this.f5152c).n(i7, i10, null);
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f5152c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i7 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f55109a;
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
        this.f5151b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f5152c;
        aVar.a(aVar.f20991c, 1);
        char[] cArr = aVar.f20990b;
        int i7 = aVar.f20991c;
        aVar.f20991c = i7 + 1;
        cArr[i7] = c10;
    }

    public void m(x3 x3Var) {
        if (this.f5151b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o5.r) this.f5152c).a(l5.a.a(x3Var), new n2.a0(8));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void onError(i61 i61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        if (photoViewer.G2 == i61Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f43333p0.f29899b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.f43399w2);
                String N0 = gd.N0(2131689472, "AppName");
                t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752550, null);
                alertDialog$Builder.k(gd.N0(2131747623, "Open"), new qi0(this, 2));
                alertDialog$Builder.h(gd.N0(2131752577, "Cancel"), null);
                photoViewer.Q2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f43249f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            i61 i61Var = photoViewer.G2;
            if (i61Var == null || !i61Var.W) {
                g0.h3(new mp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        i61 i61Var;
        int i10;
        e20 e20Var;
        i61 i61Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        ArrayList arrayList = photoViewer.f43265g7;
        i61 i61Var3 = photoViewer.G2;
        if (i61Var3 != null) {
            if (!d1.f.u() && !photoViewer.f43351r) {
                z11 = false;
            } else {
                z11 = true;
            }
            i61Var3.t0(z11);
        }
        if (this.f5151b && (i61Var = photoViewer.G2) != null && i61Var.U() != -9223372036854775807L) {
            this.f5151b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f43246e7.isEmpty() && photoViewer.f43208a7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ef) {
                    ef efVar = (ef) obj;
                    if (efVar.f27875b && (e20Var = efVar.f27890s) != null) {
                        photoViewer.G2.p0(e20Var.d * ((float) i61Var2.U()));
                        xo0 xo0Var = photoViewer.S7;
                        if (xo0Var != null) {
                            xo0Var.setProgress(efVar.f27890s.d);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i7, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        wi.o oVar = photoViewer.Q8;
        if (oVar != null) {
            photoViewer.Q8 = null;
            oVar.f60034a = surfaceTexture;
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
                photoViewer.f43400w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f43400w3.setSurfaceTextureListener(photoViewer.f43286j4);
                photoViewer.f43400w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        ((PhotoViewer) this.f5152c).q0(false);
        g0.g3(new mp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        if (photoViewer.f43428z2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.V = i12;
            float f13 = i10;
            photoViewer.W = (int) (f10 * f13);
            wi.n nVar = photoViewer.P8;
            if (nVar != null) {
                nVar.c();
            }
            ue0 ue0Var = photoViewer.f43428z2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            ue0Var.a(f11, 0);
            if (photoViewer.C2 instanceof y51) {
                ((y51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                y51 y51Var = (y51) photoViewer.C2;
                y51Var.d = i12;
                y51Var.f42332e = i10;
                ez ezVar = y51Var.f42330b;
                if (ezVar != null) {
                    ezVar.postRunnable(new az(ezVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.x2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.f5150a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f5152c;
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
                return ((cb.c) this.f5152c).toString();
        }
    }

    public i(int i7, Object obj, boolean z10) {
        this.f5150a = i7;
        this.f5152c = obj;
    }

    public i(Object obj, int i7) {
        this.f5150a = i7;
        this.f5152c = obj;
        this.f5151b = true;
    }

    public i() {
        this.f5150a = 1;
        this.f5152c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z10) {
        this.f5150a = 9;
        if (arrayList.isEmpty()) {
            this.f5152c = Collections.EMPTY_LIST;
        } else {
            this.f5152c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f5151b = z10;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f20507e;
        PhotoViewer photoViewer = (PhotoViewer) this.f5152c;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.O(photoViewer);
        }
        if (photoViewer.F2 != null) {
            i61 i61Var = photoViewer.G2;
            if (i61Var == null || !i61Var.W) {
                g0.h3(new mp0(this, 2), 64L);
            }
        }
    }

    public i(me0 me0Var, boolean z10) {
        this.f5150a = 5;
        this.f5152c = me0Var;
        this.f5151b = z10;
    }

    public i(p0.e eVar, boolean z10) {
        this(7, eVar, false);
        this.f5150a = 7;
        this.f5151b = z10;
    }

    public i(d6.d dVar, cb.c cVar) {
        this.f5150a = 11;
        this.f5151b = false;
        this.f5152c = cVar;
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
