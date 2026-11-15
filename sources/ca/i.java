package ca;

import a8.ja;
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
import org.telegram.messenger.ff;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.je0;
import org.telegram.ui.jp0;
import org.telegram.ui.ni0;
import org.telegram.ui.uo0;
import v4.d0;
import v4.h0;
public class i implements l, d0, s51, a0 {
    public final int f4839a;
    public boolean f4840b;
    public Object f4841c;

    public i(int i7) {
        this.f4839a = i7;
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
    public void E(int i7, int i10) {
        this.f4840b = true;
        ((h0) this.f4841c).j(i7, i10);
    }

    @Override
    public void K0(int i7, int i10) {
        this.f4840b = true;
        ((h0) this.f4841c).p(i7, i10);
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f4841c;
        if (this.f4840b) {
            this.f4840b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        ja.p(!this.f4840b);
        ((SparseBooleanArray) this.f4841c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10378a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ja.p(!this.f4840b);
        this.f4840b = true;
        return new s((SparseBooleanArray) this.f4841c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f4840b) {
                    return;
                }
                this.f4840b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f4841c;
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
        return this.f4840b;
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f4841c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i7 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f54499a;
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

    @Override
    public void h1(int i7, int i10) {
        ((h0) this.f4841c).n(i7, i10, null);
    }

    public void i() {
        this.f4840b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f4841c;
        aVar.a(aVar.f20602c, 1);
        char[] cArr = aVar.f20601b;
        int i7 = aVar.f20602c;
        aVar.f20602c = i7 + 1;
        cArr[i7] = c10;
    }

    public void m(x3 x3Var) {
        if (this.f4840b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o5.s) this.f4841c).a(l5.a.a(x3Var), new n2.a0(7));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void m0(int i7, int i10) {
        this.f4840b = true;
        ((h0) this.f4841c).o(i7, i10);
    }

    @Override
    public void o(Object obj) {
        this.f4840b = true;
        ob.c cVar = (ob.c) this.f4841c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f21417b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        if (photoViewer.G2 == u51Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f42847p0.f29497b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.f42913w2);
                String M0 = hd.M0(2131689472, "AppName");
                t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752562, null);
                alertDialog$Builder.k(hd.M0(2131747817, "Open"), new ni0(this, 2));
                alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
                photoViewer.Q2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f42763f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            u51 u51Var = photoViewer.G2;
            if (u51Var == null || !u51Var.W) {
                g0.i3(new jp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        u51 u51Var;
        int i10;
        g20 g20Var;
        u51 u51Var2;
        boolean z11;
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        ArrayList arrayList = photoViewer.f42779g7;
        u51 u51Var3 = photoViewer.G2;
        if (u51Var3 != null) {
            if (!d1.f.u() && !photoViewer.f42865r) {
                z11 = false;
            } else {
                z11 = true;
            }
            u51Var3.t0(z11);
        }
        if (this.f4840b && (u51Var = photoViewer.G2) != null && u51Var.U() != -9223372036854775807L) {
            this.f4840b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f42760e7.isEmpty() && photoViewer.f42722a7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ff) {
                    ff ffVar = (ff) obj;
                    if (ffVar.f27708b && (g20Var = ffVar.f27723s) != null) {
                        photoViewer.G2.p0(g20Var.d * ((float) u51Var2.U()));
                        uo0 uo0Var = photoViewer.S7;
                        if (uo0Var != null) {
                            uo0Var.setProgress(ffVar.f27723s.d);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i7, z10);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        wi.o oVar = photoViewer.Q8;
        if (oVar != null) {
            photoViewer.Q8 = null;
            oVar.f59428a = surfaceTexture;
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
                photoViewer.f42914w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f42914w3.setSurfaceTextureListener(photoViewer.f42800j4);
                photoViewer.f42914w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        ((PhotoViewer) this.f4841c).q0(false);
        g0.h3(new jp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        if (photoViewer.f42942z2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.V = i12;
            float f13 = i10;
            photoViewer.W = (int) (f10 * f13);
            wi.n nVar = photoViewer.P8;
            if (nVar != null) {
                nVar.c();
            }
            ie0 ie0Var = photoViewer.f42942z2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            ie0Var.a(f11, 0);
            if (photoViewer.C2 instanceof k51) {
                ((k51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                k51 k51Var = (k51) photoViewer.C2;
                k51Var.d = i12;
                k51Var.f36292e = i10;
                wy wyVar = k51Var.f36290b;
                if (wyVar != null) {
                    wyVar.postRunnable(new sy(wyVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.x2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.f4839a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f4841c;
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
                return ((ob.c) this.f4841c).toString();
        }
    }

    public i(int i7, Object obj, boolean z10) {
        this.f4839a = i7;
        this.f4841c = obj;
    }

    public i(Object obj, int i7) {
        this.f4839a = i7;
        this.f4841c = obj;
        this.f4840b = true;
    }

    public i() {
        this.f4839a = 1;
        this.f4841c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z10) {
        this.f4839a = 9;
        if (arrayList.isEmpty()) {
            this.f4841c = Collections.EMPTY_LIST;
        } else {
            this.f4841c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f4840b = z10;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f20115e;
        PhotoViewer photoViewer = (PhotoViewer) this.f4841c;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.O(photoViewer);
        }
        if (photoViewer.F2 != null) {
            u51 u51Var = photoViewer.G2;
            if (u51Var == null || !u51Var.W) {
                g0.i3(new jp0(this, 2), 64L);
            }
        }
    }

    public i(je0 je0Var, boolean z10) {
        this.f4839a = 5;
        this.f4841c = je0Var;
        this.f4840b = z10;
    }

    public i(p0.e eVar, boolean z10) {
        this(7, eVar, false);
        this.f4839a = 7;
        this.f4840b = z10;
    }

    public i(d6.d dVar, ob.c cVar) {
        this.f4839a = 11;
        this.f4840b = false;
        this.f4841c = cVar;
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
