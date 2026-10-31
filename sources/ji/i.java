package ji;

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
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mr0;
import org.telegram.ui.ns0;
import org.telegram.ui.r1;
import org.telegram.ui.rr0;
import org.telegram.ui.we1;
public final class i extends WebViewClient {
    public final int f10445a;
    public final Object f10446b;

    public i(Object obj, int i10) {
        this.f10445a = i10;
        this.f10446b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((we1) this.f10446b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(w0.f19025b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", w0.f19025b.getPackageName());
                    w0.f19025b.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f10445a) {
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
    public void onPageFinished(WebView webView, String str) {
        int i10 = this.f10445a;
        Object obj = this.f10446b;
        switch (i10) {
            case 2:
                super.onPageFinished(webView, str);
                hu huVar = (hu) obj;
                ImageView imageView = huVar.f26821t1;
                if (!huVar.f26822u1) {
                    huVar.f26816o1.setVisibility(4);
                    huVar.f26815n1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                mr0 mr0Var = (mr0) obj;
                View view = mr0Var.f31239r;
                if (!mr0Var.f31243y) {
                    mr0Var.f31238n.setVisibility(4);
                    mr0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                super.onPageFinished(webView, str);
                we1 we1Var = (we1) obj;
                iq iqVar = we1Var.f42970c;
                if (iqVar != null && iqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    we1Var.f42969b.getContentView().setVisibility(0);
                    we1Var.f42969b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(we1Var.f42970c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(we1Var.f42970c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(we1Var.f42970c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(we1Var.f42969b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(we1Var.f42969b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(we1Var.f42969b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new ns0(this, 23));
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
        switch (this.f10445a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f10446b;
                    if (webView == kVar.f10463o) {
                        kVar.h();
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
        switch (this.f10445a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f10446b;
                    if (webView == kVar.f10463o) {
                        kVar.h();
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
        switch (this.f10445a) {
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.f10446b;
                if (webView == kVar.f10463o) {
                    kVar.h();
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
        int i10 = this.f10445a;
        Object obj = this.f10446b;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                if (webView == kVar.f10463o) {
                    kVar.h();
                }
                return true;
            case 1:
                try {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((r1) obj).getContext(), null);
                        x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = cd.L0(2131752104, null);
                        x1Var.T = i0.T2(cd.L0(2131752105, null), new rr0(this, 8));
                        alertDialog$Builder.k(cd.L0(2131747847, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return false;
                }
            case 2:
                hu huVar = (hu) obj;
                try {
                    if (i0.M1(huVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, huVar.getContext(), huVar.I0);
                        x1 x1Var2 = alertDialog$Builder2.f20134a;
                        x1Var2.R = cd.L0(2131752104, null);
                        x1Var2.T = i0.T2(cd.L0(2131752105, null), new ho(this, 11));
                        alertDialog$Builder2.k(cd.L0(2131747847, null), null);
                        alertDialog$Builder2.p();
                    }
                    return true;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return false;
                }
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f10445a) {
            case 0:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    k kVar = (k) this.f10446b;
                    kVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !kVar.f10454c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(kVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
            case 3:
                String uri = webResourceRequest.getUrl().toString();
                if (((mr0) this.f10446b).f31243y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f14524j.c(new jg(this, uri, webResourceRequest, 15));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f10445a) {
            case 1:
                r1 r1Var = (r1) this.f10446b;
                if (r1Var.f41111s) {
                    gf.f.r(r1Var.f41114y.L, str);
                    return true;
                }
                return false;
            case 2:
                if (((hu) this.f10446b).f26822u1) {
                    gf.f.r(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 3:
                if (((mr0) this.f10446b).f31243y) {
                    gf.f.r(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 4:
                return a(str) || super.shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f10445a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.f10446b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (kVar.f10456g.equals(url.toString())) {
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
