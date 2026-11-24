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
public final class sv extends WebViewClient {
    public final byte a;
    public final Object b;

    public sv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((uwc) this.b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(a.b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", a.b.getPackageName());
                    a.b.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
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
                zv3 zv3Var = (zv3) obj;
                ImageView imageView = zv3Var.w1;
                if (!zv3Var.x1) {
                    zv3Var.r1.setVisibility(4);
                    zv3Var.q1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                ya8 ya8Var = (ya8) obj;
                a8 a8Var = ya8Var.r;
                if (!ya8Var.y) {
                    ya8Var.n.setVisibility(4);
                    ya8Var.h.setVisibility(4);
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
                uwc uwcVar = (uwc) obj;
                mx2 mx2Var = uwcVar.c;
                if (mx2Var != null && mx2Var.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    uwcVar.b.getContentView().setVisibility(0);
                    uwcVar.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(uwcVar.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(uwcVar.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(uwcVar.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(uwcVar.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(uwcVar.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(uwcVar.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new koc(this, (byte) 5));
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
                    bwc bwcVar = (bwc) this.b;
                    if (webView == bwcVar.o) {
                        bwcVar.h();
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
                    bwc bwcVar = (bwc) this.b;
                    if (webView == bwcVar.o) {
                        bwcVar.h();
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
                bwc bwcVar = (bwc) this.b;
                if (webView == bwcVar.o) {
                    bwcVar.h();
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
                        he heVar = alertDialog$Builder.a;
                        heVar.S = jb6.M0(2131752041, null);
                        heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new b1(this, (byte) 24), null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        alertDialog$Builder.o();
                    }
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return false;
                }
            case 1:
                zv3 zv3Var = (zv3) obj;
                try {
                    if (gm.K1(zv3Var.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, zv3Var.J0, zv3Var.getContext());
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.S = jb6.M0(2131752041, null);
                        heVar2.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new bi3(this, (byte) 21), null);
                        alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                        alertDialog$Builder2.o();
                    }
                    return true;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return false;
                }
            case 2:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 3:
                bwc bwcVar = (bwc) obj;
                if (webView == bwcVar.o) {
                    bwcVar.h();
                }
                return true;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((ya8) this.b).y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.j.c(new ud7(this, uri, webResourceRequest, (byte) 27));
                }
                return null;
            case 3:
                Uri url = webResourceRequest.getUrl();
                if (!"http".equalsIgnoreCase(url.getScheme()) && !"https".equalsIgnoreCase(url.getScheme())) {
                    return null;
                }
                bwc bwcVar = (bwc) this.b;
                bwcVar.getClass();
                String path = url.getPath();
                if ("https".equalsIgnoreCase(url.getScheme()) && bwcVar.c.equalsIgnoreCase(url.getHost()) && url.getUserInfo() == null && ((url.getPort() == -1 || url.getPort() == 443) && path != null && path.startsWith(bwcVar.d))) {
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
                l11.u(jVar.y.M, str);
                return true;
            case 1:
                if (((zv3) obj).x1) {
                    l11.u(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((ya8) obj).y) {
                    l11.u(webView.getContext(), str);
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
                    bwc bwcVar = (bwc) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (bwcVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        bwcVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
