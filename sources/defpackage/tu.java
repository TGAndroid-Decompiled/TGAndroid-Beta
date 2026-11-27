package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j;
public final class tu extends WebViewClient {
    public final byte a;
    public final Object b;

    public tu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((jzc) this.b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(a.b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", a.b.getPackageName());
                    a.b.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 4:
                if (!a(str)) {
                    super.onLoadResource(webView, str);
                    return;
                }
                return;
            default:
                super.onLoadResource(webView, str);
                return;
        }
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.onPageFinished(webView, str);
                iv3 iv3Var = (iv3) obj;
                ImageView imageView = iv3Var.w1;
                if (!iv3Var.x1) {
                    iv3Var.r1.setVisibility(4);
                    iv3Var.q1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                nc8 nc8Var = (nc8) obj;
                b8 b8Var = nc8Var.r;
                if (!nc8Var.y) {
                    nc8Var.n.setVisibility(4);
                    nc8Var.h.setVisibility(4);
                    b8Var.setEnabled(true);
                    b8Var.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
            default:
                super.onPageFinished(webView, str);
                return;
            case 4:
                super.onPageFinished(webView, str);
                jzc jzcVar = (jzc) obj;
                ww2 ww2Var = jzcVar.c;
                if (ww2Var != null && ww2Var.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    jzcVar.b.getContentView().setVisibility(0);
                    jzcVar.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(jzcVar.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(jzcVar.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(jzcVar.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(jzcVar.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(jzcVar.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(jzcVar.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new ztc(this, (byte) 2));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 3:
                if (webResourceRequest.isForMainFrame()) {
                    pyc pycVar = (pyc) this.b;
                    if (webView == pycVar.o) {
                        pycVar.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
        }
    }

    @Override
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 3:
                if (webResourceRequest.isForMainFrame()) {
                    pyc pycVar = (pyc) this.b;
                    if (webView == pycVar.o) {
                        pycVar.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                return;
        }
    }

    @Override
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 3:
                sslErrorHandler.cancel();
                pyc pycVar = (pyc) this.b;
                if (webView == pycVar.o) {
                    pycVar.h();
                    return;
                }
                return;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, ((j) obj).getContext());
                        id idVar = alertDialog$Builder.a;
                        idVar.S = ob6.M0(2131752069, null);
                        idVar.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new c1(this, (byte) 22), null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        alertDialog$Builder.o();
                    }
                    return true;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return false;
                }
            case 1:
                iv3 iv3Var = (iv3) obj;
                try {
                    if (hl.K1(iv3Var.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, iv3Var.J0, iv3Var.getContext());
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.S = ob6.M0(2131752069, null);
                        idVar2.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new zg3(this, (byte) 25), null);
                        alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                        alertDialog$Builder2.o();
                    }
                    return true;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return false;
                }
            case 2:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 3:
                pyc pycVar = (pyc) obj;
                if (webView == pycVar.o) {
                    pycVar.h();
                }
                return true;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((nc8) this.b).y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.j.c(new sa8(this, uri, webResourceRequest, (byte) 2));
                }
                return null;
            case 3:
                Uri url = webResourceRequest.getUrl();
                if (!"http".equalsIgnoreCase(url.getScheme()) && !"https".equalsIgnoreCase(url.getScheme())) {
                    return null;
                }
                pyc pycVar = (pyc) this.b;
                pycVar.getClass();
                String path = url.getPath();
                if ("https".equalsIgnoreCase(url.getScheme()) && pycVar.c.equalsIgnoreCase(url.getHost()) && url.getUserInfo() == null && ((url.getPort() == -1 || url.getPort() == 443) && path != null && path.startsWith(pycVar.d))) {
                    return null;
                }
                return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                j jVar = (j) obj;
                if (!jVar.s) {
                    return false;
                }
                m01.u(jVar.y.M, str);
                return true;
            case 1:
                if (((iv3) obj).x1) {
                    m01.u(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((nc8) obj).y) {
                    m01.u(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 3:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 4:
                if (!a(str) && !super.shouldOverrideUrlLoading(webView, str)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 3:
                if (webResourceRequest.isForMainFrame()) {
                    pyc pycVar = (pyc) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (pycVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        pycVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
