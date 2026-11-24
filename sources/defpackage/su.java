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
public final class su extends WebViewClient {
    public final byte a;
    public final Object b;

    public su(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((tuc) this.b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(a.b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", a.b.getPackageName());
                    a.b.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    fa4.g(e, true);
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
                ou3 ou3Var = (ou3) obj;
                ImageView imageView = ou3Var.w1;
                if (!ou3Var.x1) {
                    ou3Var.r1.setVisibility(4);
                    ou3Var.q1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                x88 x88Var = (x88) obj;
                a8 a8Var = x88Var.r;
                if (!x88Var.y) {
                    x88Var.n.setVisibility(4);
                    x88Var.h.setVisibility(4);
                    a8Var.setEnabled(true);
                    a8Var.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
            default:
                super.onPageFinished(webView, str);
                return;
            case 4:
                super.onPageFinished(webView, str);
                tuc tucVar = (tuc) obj;
                cw2 cw2Var = tucVar.c;
                if (cw2Var != null && cw2Var.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    tucVar.b.getContentView().setVisibility(0);
                    tucVar.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tucVar.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(tucVar.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(tucVar.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(tucVar.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(tucVar.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(tucVar.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new yoc(this, (byte) 3));
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
                    auc aucVar = (auc) this.b;
                    if (webView == aucVar.o) {
                        aucVar.h();
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
                    auc aucVar = (auc) this.b;
                    if (webView == aucVar.o) {
                        aucVar.h();
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
                auc aucVar = (auc) this.b;
                if (webView == aucVar.o) {
                    aucVar.h();
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
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = k96.M0(2131752092, null);
                        hdVar.U = gl.N2(k96.M0(2131752093, null), -1, 0, new b1(this, (byte) 22), null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        alertDialog$Builder.o();
                    }
                    return true;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return false;
                }
            case 1:
                ou3 ou3Var = (ou3) obj;
                try {
                    if (gl.K1(ou3Var.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ou3Var.J0, ou3Var.getContext());
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = k96.M0(2131752092, null);
                        hdVar2.U = gl.N2(k96.M0(2131752093, null), -1, 0, new li3(this, (byte) 16), null);
                        alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                        alertDialog$Builder2.o();
                    }
                    return true;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return false;
                }
            case 2:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 3:
                auc aucVar = (auc) obj;
                if (webView == aucVar.o) {
                    aucVar.h();
                }
                return true;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((x88) this.b).y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.j.c(new pc7(this, uri, webResourceRequest, (byte) 24));
                }
                return null;
            case 3:
                Uri url = webResourceRequest.getUrl();
                if (!"http".equalsIgnoreCase(url.getScheme()) && !"https".equalsIgnoreCase(url.getScheme())) {
                    return null;
                }
                auc aucVar = (auc) this.b;
                aucVar.getClass();
                String path = url.getPath();
                if ("https".equalsIgnoreCase(url.getScheme()) && aucVar.c.equalsIgnoreCase(url.getHost()) && url.getUserInfo() == null && ((url.getPort() == -1 || url.getPort() == 443) && path != null && path.startsWith(aucVar.d))) {
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
                d01.t(jVar.y.M, str);
                return true;
            case 1:
                if (((ou3) obj).x1) {
                    d01.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((x88) obj).y) {
                    d01.t(webView.getContext(), str);
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
                    auc aucVar = (auc) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (aucVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        aucVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
