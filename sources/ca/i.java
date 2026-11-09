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
import org.telegram.messenger.id;
import org.telegram.messenger.j20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.le0;
import org.telegram.ui.ni0;
import org.telegram.ui.np0;
import org.telegram.ui.yo0;
import v4.d0;
import v4.g0;
public class i implements l, d0, r51, a0 {
    public final int f6012a;
    public boolean f6013b;
    public Object f6014c;

    public i(int i7) {
        this.f6012a = i7;
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
        this.f6013b = true;
        ((g0) this.f6014c).j(i7, i10);
    }

    @Override
    public void M0(int i7, int i10) {
        this.f6013b = true;
        ((g0) this.f6014c).p(i7, i10);
    }

    @Override
    public void X(Object obj) {
        this.f6013b = true;
        aa.n nVar = (aa.n) this.f6014c;
        nVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) nVar.f825b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.f6014c;
        if (this.f6013b) {
            this.f6013b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        ia.p(!this.f6013b);
        ((SparseBooleanArray) this.f6014c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.f10542a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ia.p(!this.f6013b);
        this.f6013b = true;
        return new s((SparseBooleanArray) this.f6014c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f6013b) {
                    return;
                }
                this.f6013b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f6014c;
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
        return this.f6013b;
    }

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            p0.e eVar = (p0.e) this.f6014c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z9 = true;
            for (int i10 = 0; i10 < i7 && z9; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = p0.f.f53094a;
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
        this.f6013b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.f6014c;
        aVar.a(aVar.f20005c, 1);
        char[] cArr = aVar.f20004b;
        int i7 = aVar.f20005c;
        aVar.f20005c = i7 + 1;
        cArr[i7] = c10;
    }

    @Override
    public void k1(int i7, int i10) {
        ((g0) this.f6014c).n(i7, i10, null);
    }

    public void m(x3 x3Var) {
        if (this.f6013b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.f6014c).a(l5.a.a(x3Var), new ni.a(3));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void o0(int i7, int i10) {
        this.f6013b = true;
        ((g0) this.f6014c).o(i7, i10);
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        if (photoViewer.F2 == u51Var) {
            a8.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f41477o0.f28425b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.D, photoViewer.f41541v2);
                String M0 = id.M0(2131689472, "AppName");
                u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131752562, null);
                alertDialog$Builder.k(id.M0(2131747817, "Open"), new ni0(this, 2));
                alertDialog$Builder.h(id.M0(2131752589, "Cancel"), null);
                photoViewer.P2(alertDialog$Builder);
            }
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        if (!photoViewer.G3) {
            photoViewer.G3 = true;
            photoViewer.f41391e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            u51 u51Var = photoViewer.F2;
            if (u51Var == null || !u51Var.V) {
                org.telegram.messenger.g0.i3(new np0(this, 1), 64L);
            }
        }
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        u51 u51Var;
        int i10;
        j20 j20Var;
        u51 u51Var2;
        boolean z10;
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        ArrayList arrayList = photoViewer.f41408f7;
        u51 u51Var3 = photoViewer.F2;
        if (u51Var3 != null) {
            if (!d1.f.u() && !photoViewer.f41503r) {
                z10 = false;
            } else {
                z10 = true;
            }
            u51Var3.t0(z10);
        }
        if (this.f6013b && (u51Var = photoViewer.F2) != null && u51Var.U() != -9223372036854775807L) {
            this.f6013b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.f41388d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.P4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof gf) {
                    gf gfVar = (gf) obj;
                    if (gfVar.f26845b && (j20Var = gfVar.f26860s) != null) {
                        photoViewer.F2.p0(j20Var.d * ((float) u51Var2.U()));
                        yo0 yo0Var = photoViewer.R7;
                        if (yo0Var != null) {
                            yo0Var.setProgress(gfVar.f26860s.d);
                        }
                    }
                }
            }
        }
        photoViewer.w3(i7, z9);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        ti.p pVar = photoViewer.P8;
        if (pVar != null) {
            photoViewer.P8 = null;
            pVar.f56141a = surfaceTexture;
            if (pVar.getSurfaceTexture() != surfaceTexture) {
                pVar.setSurfaceTexture(surfaceTexture);
            }
            pVar.setVisibility(0);
            return true;
        }
        if (photoViewer.E3) {
            photoViewer.E3 = false;
            if (photoViewer.I3) {
                photoViewer.F3 = 1;
                photoViewer.f41542v3.setSurfaceTexture(surfaceTexture);
                photoViewer.f41542v3.setSurfaceTextureListener(photoViewer.f41431i4);
                photoViewer.f41542v3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        ((PhotoViewer) this.f6014c).q0(false);
        org.telegram.messenger.g0.h3(new np0(this, 0));
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        if (photoViewer.f41571y2 != null) {
            float f12 = i7 * f10;
            int i12 = (int) f12;
            photoViewer.U = i12;
            float f13 = i10;
            photoViewer.V = (int) (f10 * f13);
            ti.o oVar = photoViewer.O8;
            if (oVar != null) {
                oVar.c();
            }
            ge0 ge0Var = photoViewer.f41571y2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            ge0Var.a(f11, 0);
            if (photoViewer.B2 instanceof i51) {
                ((i51) photoViewer.B2).setHDRInfo(photoViewer.F2.V(null));
                i51 i51Var = (i51) photoViewer.B2;
                i51Var.d = i12;
                i51Var.f34579e = i10;
                sy syVar = i51Var.f34577b;
                if (syVar != null) {
                    syVar.postRunnable(new oy(syVar, i12, i10, 0));
                }
                if (photoViewer.f41375c2 == 1) {
                    photoViewer.w2();
                }
            }
            photoViewer.H3 = true;
        }
    }

    public String toString() {
        switch (this.f6012a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f6014c;
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
                return ((aa.n) this.f6014c).toString();
        }
    }

    public i(int i7, Object obj, boolean z9) {
        this.f6012a = i7;
        this.f6014c = obj;
    }

    public i(Object obj, int i7) {
        this.f6012a = i7;
        this.f6014c = obj;
        this.f6013b = true;
    }

    public i() {
        this.f6012a = 1;
        this.f6014c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z9) {
        this.f6012a = 9;
        if (arrayList.isEmpty()) {
            this.f6014c = Collections.EMPTY_LIST;
        } else {
            this.f6014c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f6013b = z9;
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.f19521e;
        PhotoViewer photoViewer = (PhotoViewer) this.f6014c;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.N(photoViewer);
        }
        if (photoViewer.E2 != null) {
            u51 u51Var = photoViewer.F2;
            if (u51Var == null || !u51Var.V) {
                org.telegram.messenger.g0.i3(new np0(this, 2), 64L);
            }
        }
    }

    public i(le0 le0Var, boolean z9) {
        this.f6012a = 5;
        this.f6014c = le0Var;
        this.f6013b = z9;
    }

    public i(p0.e eVar, boolean z9) {
        this(7, eVar, false);
        this.f6012a = 7;
        this.f6013b = z9;
    }

    public i(d6.d dVar, aa.n nVar) {
        this.f6012a = 11;
        this.f6013b = false;
        this.f6014c = nVar;
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
