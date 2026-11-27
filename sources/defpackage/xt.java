package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class xt extends dxc {
    public final o C0;

    public xt(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override
    public final pxc getInstantViewLoader() {
        m mVar = this.C0.v0[0];
        if (!mVar.e()) {
            pxc pxcVar = mVar.F;
            if (pxcVar != null) {
                pxcVar.a();
                pxc pxcVar2 = mVar.F;
                TLRPC.TL_webPage tL_webPage = pxcVar2.j;
                if (tL_webPage != null) {
                    rxc.o(tL_webPage);
                    pxcVar2.j = null;
                }
                mVar.F = null;
                return null;
            }
        } else {
            nv0 webView = mVar.getWebView();
            pxc pxcVar3 = mVar.F;
            if (webView == null) {
                if (pxcVar3 != null) {
                    pxcVar3.a();
                    pxc pxcVar4 = mVar.F;
                    TLRPC.TL_webPage tL_webPage2 = pxcVar4.j;
                    if (tL_webPage2 != null) {
                        rxc.o(tL_webPage2);
                        pxcVar4.j = null;
                    }
                    mVar.F = null;
                }
            } else if (pxcVar3 != null && (pxcVar3.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                mVar.F.d(mVar.getWebView());
                return mVar.F;
            } else if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                return mVar.F;
            } else {
                pxc pxcVar5 = mVar.F;
                if (pxcVar5 != null) {
                    pxcVar5.a();
                    pxc pxcVar6 = mVar.F;
                    TLRPC.TL_webPage tL_webPage3 = pxcVar6.j;
                    if (tL_webPage3 != null) {
                        rxc.o(tL_webPage3);
                        pxcVar6.j = null;
                    }
                    mVar.F = null;
                }
                pxc pxcVar7 = new pxc(mVar.M.Y);
                mVar.F = pxcVar7;
                nv0 webView2 = mVar.getWebView();
                if (!pxcVar7.b) {
                    pxcVar7.b = true;
                    pxcVar7.d = webView2.getUrl();
                    pxcVar7.e = webView2.getProgress();
                    pxcVar7.f = webView2.b;
                    pxcVar7.l = rxc.e(webView2, new oxc(pxcVar7, (byte) 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = pxcVar7.d;
                    tL_messages_getWebPage.hash = 0;
                    pxcVar7.k = ConnectionsManager.getInstance(pxcVar7.a).sendRequest(tL_messages_getWebPage, new yp9(pxcVar7, (byte) 27));
                }
                return mVar.F;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = vm2.f(this.b0, this.x, this.E);
        gd0 gd0Var = this.N;
        gd0Var.a(f2);
        gd0Var.b(vm2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        fb fbVar = oVar.j0;
        if (fbVar != null) {
            fbVar.setOpenProgress(f);
        }
        tw twVar = oVar.L;
        if (twVar != null) {
            twVar.t();
        }
    }

    public final void k(boolean z) {
        float f;
        long j;
        if (this.a0 != z) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            xs0 xs0Var = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = xea.m0;
                if (i != i2) {
                    this.d0 = i2;
                    xs0Var.setHint(ob6.a0(null, null, 2131754344, bw9.a().a));
                }
            }
            xs0Var.setVisibility(0);
            float f2 = 0.0f;
            if (!this.v0 && !z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.N.c(true, f);
            float f3 = this.b0;
            if (z) {
                f2 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new pzb(this, (byte) 22));
            this.x0.addListener(new i1a((byte) 18, this, z));
            this.x0.setInterpolator(k43.h);
            this.x0.setDuration(360L);
            this.x0.start();
            hl.r(new ywc(this, (byte) 0));
            ywc ywcVar = new ywc(this, (byte) 0);
            if (this.a0) {
                j = 100;
            } else {
                j = 0;
            }
            hl.d3(ywcVar, j);
        }
        fb fbVar = this.C0.j0;
        if (fbVar != null) {
            fbVar.setOpened(z);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
