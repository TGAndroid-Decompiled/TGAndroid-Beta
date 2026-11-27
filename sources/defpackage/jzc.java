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
import org.telegram.ui.ActionBar.e;
public final class jzc extends e {
    public WebView a;
    public s7 b;
    public ww2 c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final r47 n;
    public final String r;
    public bva s;

    public jzc(String str, String str2, String str3, String str4, r47 r47Var) {
        super(null);
        String i;
        this.s = new bva(this, (byte) 16);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.n = r47Var;
        this.r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(uc7.s1(this.currentAccount).N2);
        sb.append("/");
        sb.append(str2);
        if (TextUtils.isEmpty(str4)) {
            i = "";
        } else {
            i = c00.i("?game=", str4);
        }
        sb.append(i);
        this.h = sb.toString();
    }

    public static int Y(jzc jzcVar) {
        return jzcVar.currentAccount;
    }

    public static void Z(String str, r47 r47Var, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        try {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString(String.valueOf(r47Var.e1()), null);
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
            SerializedData serializedData = new SerializedData(r47Var.k.getObjectSize());
            r47Var.k.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(uc7.s1(r47Var.K1).N2);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb3.append(str6);
            edit.putString(str7, sb3.toString());
            edit.commit();
            m01.q(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.I7));
        hashSet.add(Integer.valueOf(aob.H7));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.E7));
        hashSet.add(Integer.valueOf(aob.D7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hzc(this));
        s6 u = this.actionBar.u();
        this.b = u.g(1, 2131232742, hl.L(54.0f));
        u.a(0, 2131231247).e(2, 2131232270, ob6.M0(2131747523, null));
        this.actionBar.setTitle(this.f);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        aVar.setSubtitle("@" + this.e);
        ww2 ww2Var = new ww2(context, 1);
        this.c = ww2Var;
        this.b.addView(ww2Var, tre.c(-1.0f, -1));
        this.c.setAlpha(0.0f);
        this.c.setScaleX(0.1f);
        this.c.setScaleY(0.1f);
        this.c.setVisibility(4);
        hl.u(context, true);
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
        this.a.addJavascriptInterface(new izc(this), "TelegramWebviewProxy");
        this.a.setWebViewClient(new tu(this, (byte) 4));
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hl.u(getParentActivity(), false);
        hl.r(this.s);
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
            cc4.g(e, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.r(this.s);
        this.s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                aVar.I(aob.w0(null, aob.G8, false), false);
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
