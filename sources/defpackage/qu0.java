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
public final class qu0 extends WebViewClient {
    public boolean a = true;
    public final pu0 b = new pu0(this, (byte) 0);
    public final boolean c;
    public final Context d;
    public final cv0 e;

    public qu0(cv0 cv0Var, boolean z, Context context) {
        this.e = cv0Var;
        this.c = z;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        e01 e01Var;
        boolean z2 = this.c;
        cv0 cv0Var = this.e;
        if (!z2 && ((e01Var = cv0Var.e) == null || !TextUtils.equals(e01Var.c, str))) {
            ?? tLObject = new TLObject();
            cv0Var.e = tLObject;
            tLObject.a = Utilities.c.nextLong();
            cv0Var.e.b = System.currentTimeMillis();
            cv0Var.e.c = hv0.r(cv0Var.getUrl());
            cv0Var.e.d = htc.a(cv0Var);
            zod.c(cv0Var.e);
        }
        cv0Var.b("doUpdateVisitedHistory " + str + " " + z);
        hv0 hv0Var = cv0Var.R;
        if (hv0Var != null) {
            hv0Var.G(!cv0Var.canGoBack(), !cv0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        hv0 hv0Var;
        cv0 cv0Var = this.e;
        cv0Var.b("onPageCommitVisible " + str);
        boolean z = this.c;
        if (z && !muc.a("DOCUMENT_START_SCRIPT") && (hv0Var = cv0Var.R) != null) {
            boolean z2 = hv0.R0;
            if (hv0Var.o()) {
                cv0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z) {
            cv0Var.O = true;
            String v2 = gl.v2(null, 2131624359);
            boolean z3 = w01.a;
            cv0Var.c(v2.replace("$DEBUG$", "true"));
            cv0Var.c(gl.v2(null, 2131624360));
        } else {
            cv0Var.O = true;
            String v22 = gl.v2(null, 2131624358);
            boolean z4 = w01.a;
            cv0Var.c(v22.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        hv0 hv0Var;
        cv0 cv0Var = this.e;
        cv0Var.b = true;
        cv0Var.b("onPageFinished");
        boolean z = this.c;
        if (z && !muc.a("DOCUMENT_START_SCRIPT") && (hv0Var = cv0Var.R) != null) {
            boolean z2 = hv0.R0;
            if (hv0Var.o()) {
                cv0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        hv0 hv0Var2 = cv0Var.R;
        if (hv0Var2 != null) {
            hv0Var2.S(str, true);
        } else {
            cv0Var.b("onPageFinished: no container");
        }
        if (!z) {
            cv0Var.O = true;
            String v2 = gl.v2(null, 2131624359);
            boolean z3 = w01.a;
            cv0Var.c(v2.replace("$DEBUG$", "true"));
            cv0Var.c(gl.v2(null, 2131624360));
        } else {
            cv0Var.O = true;
            String v22 = gl.v2(null, 2131624358);
            boolean z4 = w01.a;
            cv0Var.c(v22.replace("$DEBUG$", "true"));
        }
        cv0Var.e();
        hv0 hv0Var3 = cv0Var.R;
        if (hv0Var3 != null) {
            if (!cv0Var.F) {
                cv0Var.getUrl();
            }
            hv0Var3.G(!cv0Var.canGoBack(), !cv0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String url;
        cv0 cv0Var = this.e;
        cv0Var.b("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (cv0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            gl.r(this.b);
            String str = null;
            cv0Var.r = null;
            cv0Var.s = false;
            cv0Var.w = false;
            cv0Var.N = false;
            cv0Var.K = false;
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                url = webResourceRequest.getUrl().toString();
            } else {
                url = cv0Var.getUrl();
            }
            cv0Var.n = url;
            hv0 hv0Var = cv0Var.R;
            cv0Var.L = null;
            hv0Var.F();
            hv0 hv0Var2 = cv0Var.R;
            cv0Var.P = null;
            hv0Var2.getClass();
            hv0 hv0Var3 = cv0Var.R;
            cv0Var.h = true;
            webResourceError.getErrorCode();
            if (webResourceError.getDescription() != null) {
                str = webResourceError.getDescription().toString();
            }
            hv0Var3.B(true, str);
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
        cv0 cv0Var = this.e;
        cv0Var.b(sb2);
        if (cv0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                gl.r(this.b);
                cv0Var.r = null;
                cv0Var.s = false;
                cv0Var.w = false;
                cv0Var.N = false;
                cv0Var.K = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = cv0Var.getUrl();
                }
                cv0Var.n = url2;
                hv0 hv0Var = cv0Var.R;
                cv0Var.L = null;
                hv0Var.F();
                hv0 hv0Var2 = cv0Var.R;
                cv0Var.P = null;
                hv0Var2.getClass();
                hv0 hv0Var3 = cv0Var.R;
                cv0Var.h = true;
                webResourceResponse.getStatusCode();
                hv0Var3.B(true, webResourceResponse.getReasonPhrase());
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
        wjb wjbVar;
        Integer valueOf;
        Boolean valueOf2;
        int i = Build.VERSION.SDK_INT;
        cv0 cv0Var = this.e;
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
            cv0Var.b(sb.toString());
        } else {
            cv0Var.b("onRenderProcessGone");
        }
        try {
            if (!gl.K1(cv0Var.getContext())) {
                return true;
            }
            Context context = cv0Var.getContext();
            hv0 hv0Var = cv0Var.R;
            if (hv0Var == null) {
                wjbVar = null;
            } else {
                wjbVar = hv0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = k96.M0(2131752092, null);
            hdVar.U = gl.O2(k96.M0(2131752093, null), -1, 0, new pu0(this, (byte) 2), null);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            hdVar.setOnDismissListener(new n1(this, (byte) 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fa4.g(e, true);
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
        cv0 cv0Var = this.e;
        cv0Var.b(sb2);
        if (webResourceRequest != null && hv0.n(webResourceRequest.getUrl())) {
            cv0Var.b("proxying ton");
            this.a = false;
            return hv0.K(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && cv0Var.f != null && this.a) {
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
                        if (!cv0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it = entry2.getValue().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                    cv0Var.b("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    cv0Var.F = true;
                                    gl.d3(new pu0(this, (byte) 1));
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
                fa4.g(e, true);
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
        ku0 ku0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            cv0 cv0Var = this.e;
            if (startsWith) {
                if (cv0Var.f != null) {
                    ku0 ku0Var2 = cv0Var.R.c;
                    if (ku0Var2 != null) {
                        ku0Var2.j();
                    } else {
                        Runnable runnable = cv0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            cv0Var.V = null;
                        }
                    }
                }
                d01.t(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z = this.c;
            if (!z) {
                if (d01.m(context, str, true)) {
                    cv0Var.b("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!cv0Var.b && !cv0Var.canGoBack()) {
                        ku0 ku0Var3 = cv0Var.R.c;
                        if (ku0Var3 != null) {
                            ku0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = cv0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            cv0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            cv0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    cv0Var.b("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    d01.q(cv0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (cv0Var.R != null && d01.g(parse, false, null)) {
                if (z || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (na7.q1(cv0Var.R.N).J3 != null && na7.q1(cv0Var.R.N).J3.contains(parse.getScheme())) {
                        hv0 hv0Var = cv0Var.R;
                        if (cv0Var.f != null) {
                            ku0 ku0Var4 = hv0Var.c;
                            if (ku0Var4 != null) {
                                ku0Var4.j();
                            } else {
                                Runnable runnable3 = cv0Var.V;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    cv0Var.V = null;
                                }
                            }
                            hv0 hv0Var2 = cv0Var.f.R;
                            if (hv0Var2 != null && (ku0Var = hv0Var2.c) != null) {
                                ku0Var.b();
                            }
                        }
                        hv0Var.E(parse, null, !hv0Var.p0, false, false);
                    }
                    cv0Var.b("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                cv0Var.b("shouldOverrideUrlLoading(" + str + ") = false");
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
        cv0 cv0Var = this.e;
        cv0Var.b("shouldInterceptRequest " + str);
        boolean z = hv0.R0;
        if (str != null && hv0.n(Uri.parse(str))) {
            cv0Var.b("proxying ton");
            return hv0.K("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
