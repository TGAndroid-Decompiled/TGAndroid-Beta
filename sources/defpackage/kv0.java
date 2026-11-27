package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class kv0 extends WebChromeClient {
    public id a;
    public final Context b;
    public final boolean c;
    public final long d;
    public final nv0 e;

    public kv0(nv0 nv0Var, Context context, boolean z, long j) {
        this.e = nv0Var;
        this.b = context;
        this.c = z;
        this.d = j;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        uu0 uu0Var;
        nv0 nv0Var = this.e;
        nv0Var.b("onCloseWindow " + webView);
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null && (uu0Var = rv0Var.c) != null) {
            uu0Var.z();
        } else {
            Runnable runnable = nv0Var.V;
            if (runnable != null) {
                runnable.run();
                nv0Var.V = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        e S;
        String str = "onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message;
        nv0 nv0Var = this.e;
        nv0Var.b(str);
        String url = nv0Var.getUrl();
        if (uc7.s1(yac.t0).S2()) {
            if (nv0Var.R == null || (S = LaunchActivity.S()) == null) {
                return false;
            }
            if (S.getParentLayout() instanceof ActionBarLayout) {
                S = ((ActionBarLayout) S.getParentLayout()).getSheetFragment();
            }
            o createArticleViewer = S.createArticleViewer(true);
            if (createArticleViewer.v0 != null) {
                int i = 0;
                while (true) {
                    m[] mVarArr = createArticleViewer.v0;
                    if (i >= mVarArr.length) {
                        break;
                    }
                    m mVar = mVarArr[i];
                    if (mVar != null) {
                        mVar.f.setOpener(nv0Var);
                    }
                    i++;
                }
            }
            nv0 nv0Var2 = null;
            createArticleViewer.L(null, null, null, null);
            m mVar2 = createArticleViewer.v0[0];
            if (mVar2 != null && mVar2.e()) {
                if (createArticleViewer.v0[0].getWebView() == null) {
                    createArticleViewer.v0[0].f.a();
                }
                nv0Var2 = createArticleViewer.v0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                nv0Var2.E = url;
            }
            nv0Var.b("onCreateWindow: newWebView=" + nv0Var2);
            if (nv0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(nv0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.l(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new jv0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        id idVar = this.a;
        nv0 nv0Var = this.e;
        if (idVar != null) {
            nv0Var.b("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.a.dismiss();
            this.a = null;
            return;
        }
        nv0Var.b("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String J0;
        int i;
        int i2;
        nv0 nv0Var = this.e;
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null && rv0Var.a0 != null) {
            nv0Var.b("onGeolocationPermissionsShowPrompt " + str);
            boolean z = this.c;
            if (z) {
                J0 = lbc.r(nv0Var.R.V);
            } else {
                J0 = hl.J0(nv0Var.getUrl(), false);
            }
            rv0 rv0Var2 = nv0Var.R;
            Activity activity = rv0Var2.a0;
            vnb vnbVar = rv0Var2.e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            if (z) {
                i = 2131752884;
            } else {
                i = 2131742537;
            }
            String a0 = ob6.a0(null, null, i, J0);
            if (z) {
                i2 = 2131752883;
            } else {
                i2 = 2131742536;
            }
            id W = jj.W(activity, vnbVar, strArr, 2131624120, a0, ob6.a0(null, null, i2, J0), new dv0(this, callback, str, (byte) 0));
            this.a = W;
            W.show();
            return;
        }
        nv0Var.b("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        vnb vnbVar;
        String a0;
        boolean[] zArr = {false};
        rv0 rv0Var = this.e.R;
        if (rv0Var == null) {
            vnbVar = null;
        } else {
            vnbVar = rv0Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, this.b);
        if (this.c) {
            a0 = wf3.k(yac.t0, this.d);
        } else {
            a0 = ob6.a0(null, null, 2131742533, str);
        }
        id idVar = alertDialog$Builder.a;
        idVar.S = a0;
        idVar.U = str2;
        alertDialog$Builder.j(ob6.M0(2131747558, null), new gv0(zArr, jsResult, (byte) 2));
        idVar.setOnDismissListener(new hv0(zArr, jsResult, (byte) 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        vnb vnbVar;
        String a0;
        boolean[] zArr = {false};
        rv0 rv0Var = this.e.R;
        if (rv0Var == null) {
            vnbVar = null;
        } else {
            vnbVar = rv0Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, this.b);
        if (this.c) {
            a0 = wf3.k(yac.t0, this.d);
        } else {
            a0 = ob6.a0(null, null, 2131742533, str);
        }
        id idVar = alertDialog$Builder.a;
        idVar.S = a0;
        idVar.U = str2;
        alertDialog$Builder.g(ob6.M0(2131752570, null), new gv0(zArr, jsResult, (byte) 0));
        alertDialog$Builder.j(ob6.M0(2131747558, null), new gv0(zArr, jsResult, (byte) 1));
        idVar.setOnDismissListener(new hv0(zArr, jsResult, (byte) 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        vnb vnbVar;
        String a0;
        rv0 rv0Var = this.e.R;
        if (rv0Var == null) {
            vnbVar = null;
        } else {
            vnbVar = rv0Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        if (this.c) {
            a0 = wf3.k(yac.t0, this.d);
        } else {
            a0 = ob6.a0(null, null, 2131742533, str);
        }
        id idVar = alertDialog$Builder.a;
        idVar.S = a0;
        idVar.U = str2;
        xt3 xt3Var = new xt3(context, vnbVar);
        xt3Var.s0 = true;
        xt3Var.setTextSize(1, 18.0f);
        yob.X(xt3Var, aob.j5, vnbVar);
        yob.l(xt3Var, 34, aob.Oi, vnbVar);
        xt3Var.setFocusable(true);
        xt3Var.setInputType(147457);
        yob.F(xt3Var, aob.k6, aob.l6, aob.p7, vnbVar);
        xt3Var.setImeOptions(6);
        xt3Var.setBackgroundDrawable(null);
        xt3Var.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        xt3Var.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(xt3Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        idVar.a = hl.L(292.0f);
        alertDialog$Builder.g(ob6.M0(2131752570, null), new o(zArr, jsPromptResult, (byte) 26));
        alertDialog$Builder.j(ob6.M0(2131747558, null), new ie(zArr, (Object) jsPromptResult, (Object) xt3Var, (byte) 6));
        alertDialog$Builder.i(new gf(zArr, jsPromptResult, (byte) 8));
        idVar.P = new ev0(xt3Var, (byte) 0);
        xt3Var.setOnEditorActionListener(new iv0(zArr, jsPromptResult, xt3Var, alertDialog$Builder.o(), (byte) 0));
        hl.c3(new fv0(xt3Var, (byte) 0));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String J0;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        id idVar = this.a;
        if (idVar != null) {
            idVar.dismiss();
            this.a = null;
        }
        nv0 nv0Var = this.e;
        if (nv0Var.R == null) {
            nv0Var.b("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        nv0Var.b("onPermissionRequest " + permissionRequest);
        boolean z = this.c;
        if (z) {
            J0 = lbc.r(nv0Var.R.V);
        } else {
            J0 = hl.J0(nv0Var.getUrl(), false);
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            rv0 rv0Var = nv0Var.R;
            if (rv0Var.a0 == null) {
                permissionRequest.deny();
            } else if (rv0Var.Q0 != null) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        rv0 rv0Var2 = nv0Var.R;
                        Activity activity = rv0Var2.a0;
                        vnb vnbVar = rv0Var2.e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        if (z) {
                            i5 = 2131752882;
                        } else {
                            i5 = 2131742535;
                        }
                        String a0 = ob6.a0(null, null, i5, J0);
                        if (z) {
                            i6 = 2131752881;
                        } else {
                            i6 = 2131742534;
                        }
                        id W = jj.W(activity, vnbVar, strArr, 2131624121, a0, ob6.a0(null, null, i6, J0), new bv0(this, permissionRequest, str, (byte) 0));
                        this.a = W;
                        W.show();
                        return;
                    }
                    return;
                }
                rv0 rv0Var3 = nv0Var.R;
                Activity activity2 = rv0Var3.a0;
                vnb vnbVar2 = rv0Var3.e;
                String[] strArr2 = {"android.permission.CAMERA"};
                if (z) {
                    i3 = 2131752887;
                } else {
                    i3 = 2131742539;
                }
                String a02 = ob6.a0(null, null, i3, J0);
                if (z) {
                    i4 = 2131752886;
                } else {
                    i4 = 2131742538;
                }
                id W2 = jj.W(activity2, vnbVar2, strArr2, 2131624117, a02, ob6.a0(null, null, i4, J0), new bv0(this, permissionRequest, str, (byte) 1));
                this.a = W2;
                W2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    rv0 rv0Var4 = nv0Var.R;
                    Activity activity3 = rv0Var4.a0;
                    vnb vnbVar3 = rv0Var4.e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    if (z) {
                        i = 2131752889;
                    } else {
                        i = 2131742541;
                    }
                    String a03 = ob6.a0(null, null, i, J0);
                    if (z) {
                        i2 = 2131752888;
                    } else {
                        i2 = 2131742540;
                    }
                    id W3 = jj.W(activity3, vnbVar3, strArr3, 2131624117, a03, ob6.a0(null, null, i2, J0), new cv0(this, permissionRequest, resources, (byte) 0));
                    this.a = W3;
                    W3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        id idVar = this.a;
        nv0 nv0Var = this.e;
        if (idVar != null) {
            nv0Var.b("onPermissionRequestCanceled: dialog.dismiss");
            this.a.dismiss();
            this.a = null;
            return;
        }
        nv0Var.b("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i) {
        nv0 nv0Var = this.e;
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null && rv0Var.x != null) {
            nv0Var.b("onProgressChanged " + i + "%");
            nv0Var.R.x.accept(Float.valueOf(((float) i) / 100.0f));
            return;
        }
        nv0Var.b("onProgressChanged " + i + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        nv0 nv0Var = this.e;
        HashMap hashMap = nv0Var.Q;
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        nv0Var.b("onReceivedIcon favicon=".concat(str));
        if (bitmap != null && (!TextUtils.equals(nv0Var.getUrl(), nv0Var.M) || nv0Var.P == null || bitmap.getWidth() > nv0Var.P.getWidth())) {
            nv0Var.P = bitmap;
            nv0Var.M = nv0Var.getUrl();
            nv0Var.N = true;
            nv0Var.e();
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(nv0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(nv0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        nv0 nv0Var = this.e;
        nv0Var.b("onReceivedTitle title=" + str);
        if (!nv0Var.h) {
            nv0Var.K = true;
            nv0Var.L = str;
        }
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null) {
            rv0Var.F();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.e.b("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        nv0 nv0Var = this.e;
        Activity W = hl.W(nv0Var.getContext());
        boolean z = false;
        if (W == null) {
            nv0Var.b("onShowFileChooser: no activity, false");
            return false;
        }
        rv0 rv0Var = nv0Var.R;
        if (rv0Var == null) {
            nv0Var.b("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = rv0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        nv0Var.R.y = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        nv0Var.b("onShowFileChooser: true");
        return true;
    }
}
