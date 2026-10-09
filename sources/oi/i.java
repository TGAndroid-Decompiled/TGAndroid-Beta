package oi;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.og0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w4;
import org.telegram.ui.ju0;
import org.telegram.ui.rj1;
public final class i extends WebViewClient {
    public final int f17180a;
    public final Object f17181b;

    public i(Object obj, int i10) {
        this.f17180a = i10;
        this.f17181b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((rj1) this.f17181b).getClass();
        ((rj1) this.f17181b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f17180a) {
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
        int i10 = this.f17180a;
        Object obj = this.f17181b;
        switch (i10) {
            case 1:
                super.onPageFinished(webView, str);
                ju0 ju0Var = (ju0) obj;
                View view = ju0Var.f30788r;
                if (!ju0Var.f30791x) {
                    ju0Var.f30787n.setVisibility(4);
                    ju0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                rj1 rj1Var = (rj1) obj;
                jr jrVar = rj1Var.f41440c;
                if (jrVar != null && jrVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    rj1Var.f41439b.getContentView().setVisibility(0);
                    rj1Var.f41439b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rj1Var.f41440c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(rj1Var.f41440c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(rj1Var.f41440c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(rj1Var.f41439b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(rj1Var.f41439b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(rj1Var.f41439b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new w4(this, 5));
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
        switch (this.f17180a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f17181b;
                    if (webView == kVar.f17200o) {
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
        switch (this.f17180a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f17181b;
                    if (webView == kVar.f17200o) {
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
        switch (this.f17180a) {
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.f17181b;
                if (webView == kVar.f17200o) {
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
        switch (this.f17180a) {
            case 0:
                k kVar = (k) this.f17181b;
                if (webView == kVar.f17200o) {
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
        switch (this.f17180a) {
            case 0:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    k kVar = (k) this.f17181b;
                    kVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !kVar.f17190c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(kVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                if (((ju0) this.f17181b).f30791x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new og0(this, uri, webResourceRequest, 0));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f17180a) {
            case 1:
                if (((ju0) this.f17181b).f30791x) {
                    of.f.s(webView.getContext(), str);
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
        switch (this.f17180a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f17181b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (kVar.f17193g.equals(url.toString())) {
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
