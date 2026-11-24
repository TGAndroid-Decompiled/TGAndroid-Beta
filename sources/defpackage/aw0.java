package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aw0 extends WebViewClient {
    public boolean a = true;
    public final zv0 b = new zv0(this, (byte) 0);
    public final boolean c;
    public final Context d;
    public final mw0 e;

    public aw0(mw0 mw0Var, boolean z, Context context) {
        this.e = mw0Var;
        this.c = z;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        m11 m11Var;
        boolean z2 = this.c;
        mw0 mw0Var = this.e;
        if (!z2 && ((m11Var = mw0Var.e) == null || !TextUtils.equals(m11Var.c, str))) {
            ?? tLObject = new TLObject();
            mw0Var.e = tLObject;
            tLObject.a = Utilities.c.nextLong();
            mw0Var.e.b = System.currentTimeMillis();
            mw0Var.e.c = qw0.r(mw0Var.getUrl());
            mw0Var.e.d = ivc.a(mw0Var);
            crd.c(mw0Var.e);
        }
        mw0Var.b("doUpdateVisitedHistory " + str + " " + z);
        qw0 qw0Var = mw0Var.R;
        if (qw0Var != null) {
            qw0Var.G(!mw0Var.canGoBack(), !mw0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        qw0 qw0Var;
        mw0 mw0Var = this.e;
        mw0Var.b("onPageCommitVisible " + str);
        boolean z = this.c;
        if (z && !nwc.a("DOCUMENT_START_SCRIPT") && (qw0Var = mw0Var.R) != null) {
            boolean z2 = qw0.R0;
            if (qw0Var.o()) {
                mw0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z) {
            mw0Var.O = true;
            String v2 = gm.v2(null, 2131624359);
            boolean z3 = e21.a;
            mw0Var.c(v2.replace("$DEBUG$", "true"));
            mw0Var.c(gm.v2(null, 2131624360));
        } else {
            mw0Var.O = true;
            String v22 = gm.v2(null, 2131624358);
            boolean z4 = e21.a;
            mw0Var.c(v22.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        qw0 qw0Var;
        mw0 mw0Var = this.e;
        mw0Var.b = true;
        mw0Var.b("onPageFinished");
        boolean z = this.c;
        if (z && !nwc.a("DOCUMENT_START_SCRIPT") && (qw0Var = mw0Var.R) != null) {
            boolean z2 = qw0.R0;
            if (qw0Var.o()) {
                mw0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        qw0 qw0Var2 = mw0Var.R;
        if (qw0Var2 != null) {
            qw0Var2.S(str, true);
        } else {
            mw0Var.b("onPageFinished: no container");
        }
        if (!z) {
            mw0Var.O = true;
            String v2 = gm.v2(null, 2131624359);
            boolean z3 = e21.a;
            mw0Var.c(v2.replace("$DEBUG$", "true"));
            mw0Var.c(gm.v2(null, 2131624360));
        } else {
            mw0Var.O = true;
            String v22 = gm.v2(null, 2131624358);
            boolean z4 = e21.a;
            mw0Var.c(v22.replace("$DEBUG$", "true"));
        }
        mw0Var.e();
        qw0 qw0Var3 = mw0Var.R;
        if (qw0Var3 != null) {
            if (!mw0Var.F) {
                mw0Var.getUrl();
            }
            qw0Var3.G(!mw0Var.canGoBack(), !mw0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String url;
        mw0 mw0Var = this.e;
        mw0Var.b("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (mw0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            gm.r(this.b);
            String str = null;
            mw0Var.r = null;
            mw0Var.s = false;
            mw0Var.w = false;
            mw0Var.N = false;
            mw0Var.K = false;
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                url = webResourceRequest.getUrl().toString();
            } else {
                url = mw0Var.getUrl();
            }
            mw0Var.n = url;
            qw0 qw0Var = mw0Var.R;
            mw0Var.L = null;
            qw0Var.F();
            qw0 qw0Var2 = mw0Var.R;
            mw0Var.P = null;
            qw0Var2.getClass();
            qw0 qw0Var3 = mw0Var.R;
            mw0Var.h = true;
            webResourceError.getErrorCode();
            if (webResourceError.getDescription() != null) {
                str = webResourceError.getDescription().toString();
            }
            qw0Var3.B(true, str);
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer valueOf;
        Uri url;
        String url2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb = new StringBuilder("onReceivedHttpError: statusCode=");
        if (webResourceResponse == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        }
        sb.append(valueOf);
        sb.append(" request=");
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        sb.append(url);
        String sb2 = sb.toString();
        mw0 mw0Var = this.e;
        mw0Var.b(sb2);
        if (mw0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                gm.r(this.b);
                mw0Var.r = null;
                mw0Var.s = false;
                mw0Var.w = false;
                mw0Var.N = false;
                mw0Var.K = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = mw0Var.getUrl();
                }
                mw0Var.n = url2;
                qw0 qw0Var = mw0Var.R;
                mw0Var.L = null;
                qw0Var.F();
                qw0 qw0Var2 = mw0Var.R;
                mw0Var.P = null;
                qw0Var2.getClass();
                qw0 qw0Var3 = mw0Var.R;
                mw0Var.h = true;
                webResourceResponse.getStatusCode();
                qw0Var3.B(true, webResourceResponse.getReasonPhrase());
            }
        }
    }

    @Override
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        StringBuilder sb = new StringBuilder("onReceivedSslError: error=");
        sb.append(sslError);
        sb.append(" url=");
        if (sslError == null) {
            url = null;
        } else {
            url = sslError.getUrl();
        }
        sb.append(url);
        this.e.b(sb.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ylb ylbVar;
        Integer valueOf;
        Boolean valueOf2;
        int i = Build.VERSION.SDK_INT;
        mw0 mw0Var = this.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb.append(valueOf);
            sb.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb.append(valueOf2);
            mw0Var.b(sb.toString());
        } else {
            mw0Var.b("onRenderProcessGone");
        }
        try {
            if (!gm.K1(mw0Var.getContext())) {
                return true;
            }
            Context context = mw0Var.getContext();
            qw0 qw0Var = mw0Var.R;
            if (qw0Var == null) {
                ylbVar = null;
            } else {
                ylbVar = qw0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            he heVar = alertDialog$Builder.a;
            heVar.S = jb6.M0(2131752041, null);
            heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new zv0(this, (byte) 2), null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            heVar.setOnDismissListener(new n1(this, (byte) 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        HttpURLConnection httpURLConnection;
        StringBuilder sb = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        sb.append(url);
        String sb2 = sb.toString();
        mw0 mw0Var = this.e;
        mw0Var.b(sb2);
        if (webResourceRequest != null && qw0.n(webResourceRequest.getUrl())) {
            mw0Var.b("proxying ton");
            this.a = false;
            return qw0.K(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && mw0Var.f != null && this.a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e) {
                e = e;
            }
            try {
                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                if (webResourceRequest.getRequestHeaders() != null) {
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                    String key = entry2.getKey();
                    if (key != null) {
                        hashMap.put(key, TextUtils.join(", ", entry2.getValue()));
                        if (!mw0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it = entry2.getValue().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                    mw0Var.b("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    mw0Var.F = true;
                                    gm.c3(new zv0(this, (byte) 1));
                                    break;
                                }
                            }
                        }
                    }
                }
                String contentType = httpURLConnection.getContentType();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentType.indexOf("; ") >= 0) {
                    String[] split = contentType.split("; ");
                    if (!TextUtils.isEmpty(split[0])) {
                        contentType = split[0];
                    }
                    for (int i = 1; i < split.length; i++) {
                        if (split[i].startsWith("charset=")) {
                            contentEncoding = split[i].substring(8);
                        }
                    }
                }
                this.a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e2) {
                e = e2;
                httpURLConnection2 = httpURLConnection;
                fc4.g(e, true);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        uv0 uv0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            mw0 mw0Var = this.e;
            if (startsWith) {
                if (mw0Var.f != null) {
                    uv0 uv0Var2 = mw0Var.R.c;
                    if (uv0Var2 != null) {
                        uv0Var2.j();
                    } else {
                        Runnable runnable = mw0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            mw0Var.V = null;
                        }
                    }
                }
                l11.u(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z = this.c;
            if (!z) {
                if (l11.n(context, str, true)) {
                    mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!mw0Var.b && !mw0Var.canGoBack()) {
                        uv0 uv0Var3 = mw0Var.R.c;
                        if (uv0Var3 != null) {
                            uv0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = mw0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            mw0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            mw0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    l11.r(mw0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (mw0Var.R != null && l11.g(parse, false, null)) {
                if (z || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (oc7.r1(mw0Var.R.N).J3 != null && oc7.r1(mw0Var.R.N).J3.contains(parse.getScheme())) {
                        qw0 qw0Var = mw0Var.R;
                        if (mw0Var.f != null) {
                            uv0 uv0Var4 = qw0Var.c;
                            if (uv0Var4 != null) {
                                uv0Var4.j();
                            } else {
                                Runnable runnable3 = mw0Var.V;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    mw0Var.V = null;
                                }
                            }
                            qw0 qw0Var2 = mw0Var.f.R;
                            if (qw0Var2 != null && (uv0Var = qw0Var2.c) != null) {
                                uv0Var.b();
                            }
                        }
                        qw0Var.E(parse, null, !qw0Var.p0, false, false);
                    }
                    mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                mw0Var.b("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.e.b("onReceivedError: " + i + " " + str + " url=" + str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        mw0 mw0Var = this.e;
        mw0Var.b("shouldInterceptRequest " + str);
        boolean z = qw0.R0;
        if (str != null && qw0.n(Uri.parse(str))) {
            mw0Var.b("proxying ton");
            return qw0.K("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
