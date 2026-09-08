package fg;

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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p;
import org.telegram.ui.Components.sq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hu0;
import org.telegram.ui.oj1;
import org.telegram.ui.qj1;
public final class i extends WebViewClient {
    public final int f9525a;
    public final Object f9526b;

    public i(Object obj, int i10) {
        this.f9525a = i10;
        this.f9526b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((qj1) this.f9526b).getClass();
        ((qj1) this.f9526b).finishFragment(false);
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
        switch (this.f9525a) {
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
        int i10 = this.f9525a;
        Object obj = this.f9526b;
        switch (i10) {
            case 1:
                super.onPageFinished(webView, str);
                hu0 hu0Var = (hu0) obj;
                View view = hu0Var.f29740r;
                if (!hu0Var.f29743x) {
                    hu0Var.f29739n.setVisibility(4);
                    hu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                qj1 qj1Var = (qj1) obj;
                sq sqVar = qj1Var.f39916c;
                if (sqVar != null && sqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    qj1Var.f39915b.getContentView().setVisibility(0);
                    qj1Var.f39915b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qj1Var.f39916c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(qj1Var.f39916c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(qj1Var.f39916c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(qj1Var.f39915b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(qj1Var.f39915b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(qj1Var.f39915b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new oj1(this, 0));
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
        switch (this.f9525a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f9526b;
                    if (webView == kVar.f9543m) {
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
        switch (this.f9525a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f9526b;
                    if (webView == kVar.f9543m) {
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
        switch (this.f9525a) {
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.f9526b;
                if (webView == kVar.f9543m) {
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
        switch (this.f9525a) {
            case 0:
                k kVar = (k) this.f9526b;
                if (webView == kVar.f9543m) {
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
        switch (this.f9525a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                if (((hu0) this.f9526b).f29743x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
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
        switch (this.f9525a) {
            case 1:
                if (((hu0) this.f9526b).f29743x) {
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
        switch (this.f9525a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f9526b;
                    Uri url = webResourceRequest.getUrl();
                    kVar.getClass();
                    if (url == null || !"https".equals(url.getScheme()) || !kVar.f9534b.equals(url.getHost()) || url.getPort() != -1 || !"/".equals(url.getPath()) || url.getQueryParameterNames().size() != 1 || !url.getQueryParameterNames().contains("bridge")) {
                        return true;
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
