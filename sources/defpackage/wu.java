package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class wu extends puc {
    public final o C0;

    public wu(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override
    public final bvc getInstantViewLoader() {
        m mVar = this.C0.v0[0];
        if (!mVar.e()) {
            bvc bvcVar = mVar.F;
            if (bvcVar != null) {
                bvcVar.a();
                bvc bvcVar2 = mVar.F;
                TLRPC.TL_webPage tL_webPage = bvcVar2.j;
                if (tL_webPage != null) {
                    dvc.o(tL_webPage);
                    bvcVar2.j = null;
                }
                mVar.F = null;
                return null;
            }
        } else {
            mw0 webView = mVar.getWebView();
            bvc bvcVar3 = mVar.F;
            if (webView == null) {
                if (bvcVar3 != null) {
                    bvcVar3.a();
                    bvc bvcVar4 = mVar.F;
                    TLRPC.TL_webPage tL_webPage2 = bvcVar4.j;
                    if (tL_webPage2 != null) {
                        dvc.o(tL_webPage2);
                        bvcVar4.j = null;
                    }
                    mVar.F = null;
                }
            } else if (bvcVar3 != null && (bvcVar3.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                mVar.F.d(mVar.getWebView());
                return mVar.F;
            } else if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                return mVar.F;
            } else {
                bvc bvcVar5 = mVar.F;
                if (bvcVar5 != null) {
                    bvcVar5.a();
                    bvc bvcVar6 = mVar.F;
                    TLRPC.TL_webPage tL_webPage3 = bvcVar6.j;
                    if (tL_webPage3 != null) {
                        dvc.o(tL_webPage3);
                        bvcVar6.j = null;
                    }
                    mVar.F = null;
                }
                bvc bvcVar7 = new bvc(mVar.M.Y);
                mVar.F = bvcVar7;
                mw0 webView2 = mVar.getWebView();
                if (!bvcVar7.b) {
                    bvcVar7.b = true;
                    bvcVar7.d = webView2.getUrl();
                    bvcVar7.e = webView2.getProgress();
                    bvcVar7.f = webView2.b;
                    bvcVar7.l = dvc.e(webView2, new avc(bvcVar7, (byte) 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = bvcVar7.d;
                    tL_messages_getWebPage.hash = 0;
                    bvcVar7.k = ConnectionsManager.getInstance(bvcVar7.a).sendRequest(tL_messages_getWebPage, new go9(bvcVar7, (byte) 27));
                }
                return mVar.F;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = on2.f(this.b0, this.x, this.E);
        ee0 ee0Var = this.N;
        ee0Var.a(f2);
        ee0Var.b(on2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        eb ebVar = oVar.j0;
        if (ebVar != null) {
            ebVar.setOpenProgress(f);
        }
        sx sxVar = oVar.L;
        if (sxVar != null) {
            sxVar.u();
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
            vc vcVar = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = gda.m0;
                if (i != i2) {
                    this.d0 = i2;
                    vcVar.setHint(jb6.a0(null, null, 2131754348, ku9.a().a));
                }
            }
            vcVar.setVisibility(0);
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
            ofFloat.addUpdateListener(new oxb(this, (byte) 22));
            this.x0.addListener(new sw9((byte) 19, this, z));
            this.x0.setInterpolator(d53.h);
            this.x0.setDuration(360L);
            this.x0.start();
            gm.r(new muc(this, (byte) 1));
            muc mucVar = new muc(this, (byte) 1);
            if (this.a0) {
                j = 100;
            } else {
                j = 0;
            }
            gm.d3(mucVar, j);
        }
        eb ebVar = this.C0.j0;
        if (ebVar != null) {
            ebVar.setOpened(z);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
