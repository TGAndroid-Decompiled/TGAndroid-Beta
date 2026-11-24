package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.d;
public final class tuc extends d {
    public WebView a;
    public r7 b;
    public cw2 c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final k27 n;
    public final String r;
    public xia s;

    public tuc(String str, String str2, String str3, String str4, k27 k27Var) {
        super(null);
        String h;
        this.s = new xia(this, (byte) 17);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.n = k27Var;
        this.r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(na7.q1(this.currentAccount).N2);
        sb.append("/");
        sb.append(str2);
        if (TextUtils.isEmpty(str4)) {
            h = "";
        } else {
            h = b00.h("?game=", str4);
        }
        sb.append(h);
        this.h = sb.toString();
    }

    public static void Z(String str, k27 k27Var, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        try {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString(String.valueOf(k27Var.e1()), null);
            String str6 = "";
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb = new StringBuilder(str4);
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] cArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                for (int i = 0; i < 20; i++) {
                    sb.append(cArr[Utilities.b.nextInt(52)]);
                }
            }
            sb2.append((CharSequence) sb);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str5 = str + "#" + ((Object) sb2);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    if (substring.length() > 0) {
                        str5 = str + "?" + ((Object) sb2);
                    } else {
                        str5 = str + ((Object) sb2);
                    }
                } else {
                    str5 = str + "&" + ((Object) sb2);
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(k27Var.k.getObjectSize());
            k27Var.k.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(na7.q1(k27Var.K1).N2);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb3.append(str6);
            edit.putString(str7, sb3.toString());
            edit.commit();
            d01.p(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.H7));
        hashSet.add(Integer.valueOf(bkb.G7));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.D7));
        hashSet.add(Integer.valueOf(bkb.C7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ruc(this));
        r6 t = this.actionBar.t();
        this.b = t.g(1, 2131232731, gl.L(54.0f));
        t.a(0, 2131231247).e(2, 2131232270, k96.M0(2131747603, null));
        this.actionBar.setTitle(this.f);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        aVar.setSubtitle("@" + this.e);
        cw2 cw2Var = new cw2(context, 1);
        this.c = cw2Var;
        this.b.addView(cw2Var, nme.c(-1.0f, -1));
        this.c.setAlpha(0.0f);
        this.c.setScaleX(0.1f);
        this.c.setScaleY(0.1f);
        this.c.setVisibility(4);
        gl.u(context, true);
        WebView webView = new WebView(context);
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.a.setLayerType(2, null);
        this.a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.a, true);
        this.a.addJavascriptInterface(new suc(this), "TelegramWebviewProxy");
        this.a.setWebViewClient(new su(this, (byte) 4));
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        gl.u(getParentActivity(), false);
        gl.r(this.s);
        this.a.setLayerType(0, null);
        this.s = null;
        try {
            ViewParent parent = this.a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.a);
            }
            this.a.stopLoading();
            this.a.loadUrl("about:blank");
            this.a.destroy();
            this.a = null;
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gl.r(this.s);
        this.s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                aVar.I(bkb.w0(null, bkb.F8, false), false);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        WebView webView;
        if (z && !z2 && (webView = this.a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
