package ni;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p;
import org.telegram.ui.Components.uq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.hj1;
import org.telegram.ui.wq0;
public final class i extends WebViewClient {
    public final int f15237a;
    public final Object f15238b;

    public i(Object obj, int i10) {
        this.f15237a = i10;
        this.f15238b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((hj1) this.f15238b).getClass();
        ((hj1) this.f15238b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f15237a) {
            case 2:
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
    public void onPageFinished(WebView webView, String str) {
        int i10 = this.f15237a;
        Object obj = this.f15238b;
        switch (i10) {
            case 1:
                super.onPageFinished(webView, str);
                bu0 bu0Var = (bu0) obj;
                View view = bu0Var.f27334r;
                if (!bu0Var.f27337x) {
                    bu0Var.f27333n.setVisibility(4);
                    bu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                hj1 hj1Var = (hj1) obj;
                uq uqVar = hj1Var.f33870c;
                if (uqVar != null && uqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    hj1Var.f33869b.getContentView().setVisibility(0);
                    hj1Var.f33869b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hj1Var.f33870c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(hj1Var.f33870c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(hj1Var.f33870c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(hj1Var.f33869b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(hj1Var.f33869b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(hj1Var.f33869b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new wq0(this, 27));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f15237a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f15238b;
                    if (webView == kVar.f15255o) {
                        kVar.f();
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
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f15237a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f15238b;
                    if (webView == kVar.f15255o) {
                        kVar.f();
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
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f15237a) {
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.f15238b;
                if (webView == kVar.f15255o) {
                    kVar.f();
                    return;
                }
                return;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
        }
    }

    @Override
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f15237a) {
            case 0:
                k kVar = (k) this.f15238b;
                if (webView == kVar.f15255o) {
                    kVar.f();
                    return true;
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f15237a) {
            case 0:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    k kVar = (k) this.f15238b;
                    kVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !kVar.f15246c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(kVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                if (((bu0) this.f15238b).f27337x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new p(this, uri, webResourceRequest, 25));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f15237a) {
            case 1:
                if (((bu0) this.f15238b).f27337x) {
                    nf.f.s(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                return a(str) || super.shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f15237a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f15238b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (kVar.f15248g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        kVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
