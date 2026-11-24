package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class wt extends nsc {
    public final o C0;

    public wt(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override
    public final atc getInstantViewLoader() {
        m mVar = this.C0.v0[0];
        if (!mVar.e()) {
            atc atcVar = mVar.F;
            if (atcVar != null) {
                atcVar.a();
                atc atcVar2 = mVar.F;
                TLRPC.TL_webPage tL_webPage = atcVar2.j;
                if (tL_webPage != null) {
                    ctc.o(tL_webPage);
                    atcVar2.j = null;
                }
                mVar.F = null;
                return null;
            }
        } else {
            cv0 webView = mVar.getWebView();
            atc atcVar3 = mVar.F;
            if (webView == null) {
                if (atcVar3 != null) {
                    atcVar3.a();
                    atc atcVar4 = mVar.F;
                    TLRPC.TL_webPage tL_webPage2 = atcVar4.j;
                    if (tL_webPage2 != null) {
                        ctc.o(tL_webPage2);
                        atcVar4.j = null;
                    }
                    mVar.F = null;
                }
            } else if (atcVar3 != null && (atcVar3.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                mVar.F.d(mVar.getWebView());
                return mVar.F;
            } else if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                return mVar.F;
            } else {
                atc atcVar5 = mVar.F;
                if (atcVar5 != null) {
                    atcVar5.a();
                    atc atcVar6 = mVar.F;
                    TLRPC.TL_webPage tL_webPage3 = atcVar6.j;
                    if (tL_webPage3 != null) {
                        ctc.o(tL_webPage3);
                        atcVar6.j = null;
                    }
                    mVar.F = null;
                }
                atc atcVar7 = new atc(mVar.M.Y);
                mVar.F = atcVar7;
                cv0 webView2 = mVar.getWebView();
                if (!atcVar7.b) {
                    atcVar7.b = true;
                    atcVar7.d = webView2.getUrl();
                    atcVar7.e = webView2.getProgress();
                    atcVar7.f = webView2.b;
                    atcVar7.l = ctc.e(webView2, new zsc(atcVar7, (byte) 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = atcVar7.d;
                    tL_messages_getWebPage.hash = 0;
                    atcVar7.k = ConnectionsManager.getInstance(atcVar7.a).sendRequest(tL_messages_getWebPage, new wx9(atcVar7, (byte) 26));
                }
                return mVar.F;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = bm2.f(this.b0, this.x, this.E);
        ed0 ed0Var = this.N;
        ed0Var.a(f2);
        ed0Var.b(bm2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        eb ebVar = oVar.j0;
        if (ebVar != null) {
            ebVar.setOpenProgress(f);
        }
        sw swVar = oVar.L;
        if (swVar != null) {
            swVar.s();
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
            ps0 ps0Var = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = gba.m0;
                if (i != i2) {
                    this.d0 = i2;
                    ps0Var.setHint(k96.a0(null, null, 2131754348, is9.a().a));
                }
            }
            ps0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new uwb(this, (byte) 20));
            this.x0.addListener(new pu9((byte) 19, this, z));
            this.x0.setInterpolator(s33.h);
            this.x0.setDuration(360L);
            this.x0.start();
            gl.r(new ksc(this, (byte) 1));
            ksc kscVar = new ksc(this, (byte) 1);
            if (this.a0) {
                j = 100;
            } else {
                j = 0;
            }
            gl.e3(kscVar, j);
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
