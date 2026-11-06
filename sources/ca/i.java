package ca;

import a8.ia;
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
import o5.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.j20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.s51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.je0;
import org.telegram.ui.li0;
import org.telegram.ui.lp0;
import org.telegram.ui.wo0;
import ti.q;
import v4.d0;
import v4.g0;
public class i implements l, d0, p51, a0 {
    public final int f6014a;
    public boolean f6015b;
    public Object f6016c;

    public i(int i7) {
        this.f6014a = i7;
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
        this.f6015b = true;
        ((g0) this.f6016c).j(i7, i10);
    }

    @Override
    public void M0(int i7, int i10) {
        this.f6015b = true;
        ((g0) this.f6016c).p(i7, i10);
    }

    @Override
    public void X(Object obj) {
        this.f6015b = true;
        aa.n nVar = (aa.n) this.f6016c;
        nVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) nVar.f825b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f6016c;
        if (this.f6015b) {
            this.f6015b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        ia.p(!this.f6015b);
        ((SparseBooleanArray) this.f6016c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10542a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ia.p(!this.f6015b);
        this.f6015b = true;
        return new s((SparseBooleanArray) this.f6016c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f6015b) {
                    return;
                }
                this.f6015b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f6016c;
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
        return this.f6015b;
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f6016c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z9 = true;
            for (int i10 = 0; i10 < i7 && z9; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f52990a;
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
                                z9 = true;
                                break;
                        }
                    }
                    z9 = false;
                }
                z9 = true;
            }
            if (!z9) {
                return true;
            }
            if (z9) {
                return false;
            }
            return f();
        }
        throw new IllegalArgumentException();
    }

    public void i() {
        this.f6015b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f6016c;
        aVar.a(aVar.f20002c, 1);
        char[] cArr = aVar.f20001b;
        int i7 = aVar.f20002c;
        aVar.f20002c = i7 + 1;
        cArr[i7] = c10;
    }

    @Override
    public void k1(int i7, int i10) {
        ((g0) this.f6016c).n(i7, i10, null);
    }

    public void m(x3 x3Var) {
        if (this.f6015b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.f6016c).a(l5.a.a(x3Var), new ni.a(3));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void o0(int i7, int i10) {
        this.f6015b = true;
        ((g0) this.f6016c).o(i7, i10);
    }

    @Override
    public void onError(s51 s51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        if (photoViewer.F2 == s51Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f41467o0.f28420b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.D, photoViewer.f41531v2);
                String M0 = hd.M0(2131689472, "AppName");
                u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131752562, null);
                alertDialog$Builder.k(hd.M0(2131747816, "Open"), new li0(this, 2));
                alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
                photoViewer.P2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        if (!photoViewer.G3) {
            photoViewer.G3 = true;
            photoViewer.f41381e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            s51 s51Var = photoViewer.F2;
            if (s51Var == null || !s51Var.V) {
                org.telegram.messenger.g0.i3(new lp0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        s51 s51Var;
        int i10;
        j20 j20Var;
        s51 s51Var2;
        boolean z10;
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        ArrayList arrayList = photoViewer.f41398f7;
        s51 s51Var3 = photoViewer.F2;
        if (s51Var3 != null) {
            if (!d1.f.u() && !photoViewer.f41493r) {
                z10 = false;
            } else {
                z10 = true;
            }
            s51Var3.t0(z10);
        }
        if (this.f6015b && (s51Var = photoViewer.F2) != null && s51Var.U() != -9223372036854775807L) {
            this.f6015b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.f41378d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.P4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof gf) {
                    gf gfVar = (gf) obj;
                    if (gfVar.f26824b && (j20Var = gfVar.f26839s) != null) {
                        photoViewer.F2.p0(j20Var.d * ((float) s51Var2.U()));
                        wo0 wo0Var = photoViewer.R7;
                        if (wo0Var != null) {
                            wo0Var.setProgress(gfVar.f26839s.d);
                        }
                    }
                }
            }
        }
        photoViewer.w3(i7, z9);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        q qVar = photoViewer.P8;
        if (qVar != null) {
            photoViewer.P8 = null;
            qVar.f56040a = surfaceTexture;
            if (qVar.getSurfaceTexture() != surfaceTexture) {
                qVar.setSurfaceTexture(surfaceTexture);
            }
            qVar.setVisibility(0);
            return true;
        }
        if (photoViewer.E3) {
            photoViewer.E3 = false;
            if (photoViewer.I3) {
                photoViewer.F3 = 1;
                photoViewer.f41532v3.setSurfaceTexture(surfaceTexture);
                photoViewer.f41532v3.setSurfaceTextureListener(photoViewer.f41421i4);
                photoViewer.f41532v3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        ((PhotoViewer) this.f6016c).q0(false);
        org.telegram.messenger.g0.h3(new lp0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        if (photoViewer.f41561y2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.U = i12;
            float f13 = i10;
            photoViewer.V = (int) (f10 * f13);
            ti.o oVar = photoViewer.O8;
            if (oVar != null) {
                oVar.c();
            }
            fe0 fe0Var = photoViewer.f41561y2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            fe0Var.a(f11, 0);
            if (photoViewer.B2 instanceof g51) {
                ((g51) photoViewer.B2).setHDRInfo(photoViewer.F2.V(null));
                g51 g51Var = (g51) photoViewer.B2;
                g51Var.d = i12;
                g51Var.f33800e = i10;
                ry ryVar = g51Var.f33798b;
                if (ryVar != null) {
                    ryVar.postRunnable(new ny(ryVar, i12, i10, 0));
                }
                if (photoViewer.f41365c2 == 1) {
                    photoViewer.w2();
                }
            }
            photoViewer.H3 = true;
        }
    }

    public String toString() {
        switch (this.f6014a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f6016c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z9 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        s4.m mVar = (s4.m) list.get(i7);
                        if (mVar != null && mVar.e()) {
                            i7++;
                        }
                    } else {
                        z9 = true;
                    }
                }
                sb2.append(z9);
                sb2.append(" }");
                return sb2.toString();
            case 10:
            default:
                return super.toString();
            case 11:
                return ((aa.n) this.f6016c).toString();
        }
    }

    public i(int i7, Object obj, boolean z9) {
        this.f6014a = i7;
        this.f6016c = obj;
    }

    public i(Object obj, int i7) {
        this.f6014a = i7;
        this.f6016c = obj;
        this.f6015b = true;
    }

    public i() {
        this.f6014a = 1;
        this.f6016c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z9) {
        this.f6014a = 9;
        if (arrayList.isEmpty()) {
            this.f6016c = Collections.EMPTY_LIST;
        } else {
            this.f6016c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f6015b = z9;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f19518e;
        PhotoViewer photoViewer = (PhotoViewer) this.f6016c;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.N(photoViewer);
        }
        if (photoViewer.E2 != null) {
            s51 s51Var = photoViewer.F2;
            if (s51Var == null || !s51Var.V) {
                org.telegram.messenger.g0.i3(new lp0(this, 2), 64L);
            }
        }
    }

    public i(je0 je0Var, boolean z9) {
        this.f6014a = 5;
        this.f6016c = je0Var;
        this.f6015b = z9;
    }

    public i(p0.e eVar, boolean z9) {
        this(7, eVar, false);
        this.f6014a = 7;
        this.f6015b = z9;
    }

    public i(d6.d dVar, aa.n nVar) {
        this.f6014a = 11;
        this.f6015b = false;
        this.f6016c = nVar;
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
