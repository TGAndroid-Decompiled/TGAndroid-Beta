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
public final class av0 extends WebViewClient {
    public boolean a = true;
    public final zu0 b = new zu0(this, (byte) 0);
    public final boolean c;
    public final Context d;
    public final nv0 e;

    public av0(nv0 nv0Var, boolean z, Context context) {
        this.e = nv0Var;
        this.c = z;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        n01 n01Var;
        boolean z2 = this.c;
        nv0 nv0Var = this.e;
        if (!z2 && ((n01Var = nv0Var.e) == null || !TextUtils.equals(n01Var.c, str))) {
            ?? tLObject = new TLObject();
            nv0Var.e = tLObject;
            tLObject.a = Utilities.c.nextLong();
            nv0Var.e.b = System.currentTimeMillis();
            nv0Var.e.c = rv0.r(nv0Var.getUrl());
            nv0Var.e.d = wxc.a(nv0Var);
            ptd.c(nv0Var.e);
        }
        nv0Var.b("doUpdateVisitedHistory " + str + " " + z);
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null) {
            rv0Var.G(!nv0Var.canGoBack(), !nv0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        rv0 rv0Var;
        nv0 nv0Var = this.e;
        nv0Var.b("onPageCommitVisible " + str);
        boolean z = this.c;
        if (z && !czc.a("DOCUMENT_START_SCRIPT") && (rv0Var = nv0Var.R) != null) {
            boolean z2 = rv0.R0;
            if (rv0Var.o()) {
                nv0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z) {
            nv0Var.O = true;
            String v2 = hl.v2(null, 2131624359);
            boolean z3 = f11.a;
            nv0Var.c(v2.replace("$DEBUG$", "true"));
            nv0Var.c(hl.v2(null, 2131624360));
        } else {
            nv0Var.O = true;
            String v22 = hl.v2(null, 2131624358);
            boolean z4 = f11.a;
            nv0Var.c(v22.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        rv0 rv0Var;
        nv0 nv0Var = this.e;
        nv0Var.b = true;
        nv0Var.b("onPageFinished");
        boolean z = this.c;
        if (z && !czc.a("DOCUMENT_START_SCRIPT") && (rv0Var = nv0Var.R) != null) {
            boolean z2 = rv0.R0;
            if (rv0Var.o()) {
                nv0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        rv0 rv0Var2 = nv0Var.R;
        if (rv0Var2 != null) {
            rv0Var2.S(str, true);
        } else {
            nv0Var.b("onPageFinished: no container");
        }
        if (!z) {
            nv0Var.O = true;
            String v2 = hl.v2(null, 2131624359);
            boolean z3 = f11.a;
            nv0Var.c(v2.replace("$DEBUG$", "true"));
            nv0Var.c(hl.v2(null, 2131624360));
        } else {
            nv0Var.O = true;
            String v22 = hl.v2(null, 2131624358);
            boolean z4 = f11.a;
            nv0Var.c(v22.replace("$DEBUG$", "true"));
        }
        nv0Var.e();
        rv0 rv0Var3 = nv0Var.R;
        if (rv0Var3 != null) {
            if (!nv0Var.F) {
                nv0Var.getUrl();
            }
            rv0Var3.G(!nv0Var.canGoBack(), !nv0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String url;
        nv0 nv0Var = this.e;
        nv0Var.b("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (nv0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            hl.r(this.b);
            String str = null;
            nv0Var.r = null;
            nv0Var.s = false;
            nv0Var.w = false;
            nv0Var.N = false;
            nv0Var.K = false;
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                url = webResourceRequest.getUrl().toString();
            } else {
                url = nv0Var.getUrl();
            }
            nv0Var.n = url;
            rv0 rv0Var = nv0Var.R;
            nv0Var.L = null;
            rv0Var.F();
            rv0 rv0Var2 = nv0Var.R;
            nv0Var.P = null;
            rv0Var2.getClass();
            rv0 rv0Var3 = nv0Var.R;
            nv0Var.h = true;
            webResourceError.getErrorCode();
            if (webResourceError.getDescription() != null) {
                str = webResourceError.getDescription().toString();
            }
            rv0Var3.B(true, str);
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
        nv0 nv0Var = this.e;
        nv0Var.b(sb2);
        if (nv0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                hl.r(this.b);
                nv0Var.r = null;
                nv0Var.s = false;
                nv0Var.w = false;
                nv0Var.N = false;
                nv0Var.K = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = nv0Var.getUrl();
                }
                nv0Var.n = url2;
                rv0 rv0Var = nv0Var.R;
                nv0Var.L = null;
                rv0Var.F();
                rv0 rv0Var2 = nv0Var.R;
                nv0Var.P = null;
                rv0Var2.getClass();
                rv0 rv0Var3 = nv0Var.R;
                nv0Var.h = true;
                webResourceResponse.getStatusCode();
                rv0Var3.B(true, webResourceResponse.getReasonPhrase());
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
        vnb vnbVar;
        Integer valueOf;
        Boolean valueOf2;
        int i = Build.VERSION.SDK_INT;
        nv0 nv0Var = this.e;
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
            nv0Var.b(sb.toString());
        } else {
            nv0Var.b("onRenderProcessGone");
        }
        try {
            if (!hl.K1(nv0Var.getContext())) {
                return true;
            }
            Context context = nv0Var.getContext();
            rv0 rv0Var = nv0Var.R;
            if (rv0Var == null) {
                vnbVar = null;
            } else {
                vnbVar = rv0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            id idVar = alertDialog$Builder.a;
            idVar.S = ob6.M0(2131752069, null);
            idVar.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new zu0(this, (byte) 2), null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            idVar.setOnDismissListener(new o1(this, (byte) 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            cc4.g(e, true);
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
        nv0 nv0Var = this.e;
        nv0Var.b(sb2);
        if (webResourceRequest != null && rv0.n(webResourceRequest.getUrl())) {
            nv0Var.b("proxying ton");
            this.a = false;
            return rv0.K(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && nv0Var.f != null && this.a) {
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
                        if (!nv0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it = entry2.getValue().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                    nv0Var.b("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    nv0Var.F = true;
                                    hl.c3(new zu0(this, (byte) 1));
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
                cc4.g(e, true);
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
        uu0 uu0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            nv0 nv0Var = this.e;
            if (startsWith) {
                if (nv0Var.f != null) {
                    uu0 uu0Var2 = nv0Var.R.c;
                    if (uu0Var2 != null) {
                        uu0Var2.j();
                    } else {
                        Runnable runnable = nv0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            nv0Var.V = null;
                        }
                    }
                }
                m01.u(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z = this.c;
            if (!z) {
                if (m01.n(context, str, true)) {
                    nv0Var.b("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!nv0Var.b && !nv0Var.canGoBack()) {
                        uu0 uu0Var3 = nv0Var.R.c;
                        if (uu0Var3 != null) {
                            uu0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = nv0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            nv0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            nv0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    nv0Var.b("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    m01.r(nv0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (nv0Var.R != null && m01.g(parse, false, null)) {
                if (z || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (uc7.s1(nv0Var.R.N).K3 != null && uc7.s1(nv0Var.R.N).K3.contains(parse.getScheme())) {
                        rv0 rv0Var = nv0Var.R;
                        if (nv0Var.f != null) {
                            uu0 uu0Var4 = rv0Var.c;
                            if (uu0Var4 != null) {
                                uu0Var4.j();
                            } else {
                                Runnable runnable3 = nv0Var.V;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    nv0Var.V = null;
                                }
                            }
                            rv0 rv0Var2 = nv0Var.f.R;
                            if (rv0Var2 != null && (uu0Var = rv0Var2.c) != null) {
                                uu0Var.b();
                            }
                        }
                        rv0Var.E(parse, null, !rv0Var.p0, false, false);
                    }
                    nv0Var.b("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                nv0Var.b("shouldOverrideUrlLoading(" + str + ") = false");
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
        nv0 nv0Var = this.e;
        nv0Var.b("shouldInterceptRequest " + str);
        boolean z = rv0.R0;
        if (str != null && rv0.n(Uri.parse(str))) {
            nv0Var.b("proxying ton");
            return rv0.K("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
