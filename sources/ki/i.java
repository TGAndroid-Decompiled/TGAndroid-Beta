package ki;

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
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hu0;
import org.telegram.ui.mv0;
import org.telegram.ui.tj1;
public final class i extends WebViewClient {
    public final int f12543a;
    public final Object f12544b;

    public i(Object obj, int i10) {
        this.f12543a = i10;
        this.f12544b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((tj1) this.f12544b).getClass();
        ((tj1) this.f12544b).finishFragment(false);
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
        switch (this.f12543a) {
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
        int i10 = this.f12543a;
        Object obj = this.f12544b;
        switch (i10) {
            case 1:
                super.onPageFinished(webView, str);
                hu0 hu0Var = (hu0) obj;
                View view = hu0Var.f29663r;
                if (!hu0Var.f29666x) {
                    hu0Var.f29662n.setVisibility(4);
                    hu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                tj1 tj1Var = (tj1) obj;
                zq zqVar = tj1Var.f36955c;
                if (zqVar != null && zqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    tj1Var.f36954b.getContentView().setVisibility(0);
                    tj1Var.f36954b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tj1Var.f36955c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(tj1Var.f36955c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(tj1Var.f36955c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(tj1Var.f36954b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(tj1Var.f36954b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(tj1Var.f36954b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new mv0(this, 17));
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
        switch (this.f12543a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f12544b;
                    if (webView == kVar.f12559m) {
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
        switch (this.f12543a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f12544b;
                    if (webView == kVar.f12559m) {
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
        switch (this.f12543a) {
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.f12544b;
                if (webView == kVar.f12559m) {
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
        switch (this.f12543a) {
            case 0:
                k kVar = (k) this.f12544b;
                if (webView == kVar.f12559m) {
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
        switch (this.f12543a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                if (((hu0) this.f12544b).f29666x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new gf(this, uri, webResourceRequest, 17));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f12543a) {
            case 1:
                if (((hu0) this.f12544b).f29666x) {
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
        switch (this.f12543a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f12544b;
                    Uri url = webResourceRequest.getUrl();
                    kVar.getClass();
                    if (url == null || !"https".equals(url.getScheme()) || !kVar.f12551b.equals(url.getHost()) || url.getPort() != -1 || !"/".equals(url.getPath()) || url.getQueryParameterNames().size() != 1 || !url.getQueryParameterNames().contains("bridge")) {
                        return true;
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
