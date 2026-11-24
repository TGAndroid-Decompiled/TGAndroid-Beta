package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.ui.m;
public final class mw0 extends WebView {
    public static final int W = 0;
    public String E;
    public boolean F;
    public my0 G;
    public int H;
    public int I;
    public Runnable J;
    public boolean K;
    public String L;
    public String M;
    public boolean N;
    public boolean O;
    public Bitmap P;
    public final HashMap Q;
    public qw0 R;
    public boolean S;
    public cf9 T;
    public pw0 U;
    public Runnable V;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public m11 e;
    public mw0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public mw0(Context context, boolean z, long j) {
        super(context);
        int i = qw0.S0;
        qw0.S0 = i + 1;
        this.a = i;
        this.E = "about:blank";
        this.Q = new HashMap();
        this.c = z;
        b("created new webview " + this);
        setOnLongClickListener(new yv0(this));
        setWebViewClient(new aw0(this, z, context));
        setWebChromeClient(new jw0(this, context, z, j));
        setFindListener(new kw0(this));
        if (!z) {
            setDownloadListener(new lw0(this));
        }
    }

    public final void a(ivc ivcVar) {
        uv0 uv0Var;
        if (ivcVar != null) {
            qw0 qw0Var = this.R;
            boolean z = false;
            if (qw0Var != null && (uv0Var = qw0Var.c) != null) {
                int i = ivcVar.e;
                if (i != 0) {
                    uv0Var.o(i, true);
                    this.s = true;
                }
                int i2 = ivcVar.f;
                if (i2 != 0) {
                    this.R.c.o(i2, false);
                    this.w = true;
                } else {
                    i2 = -1;
                }
                Bitmap bitmap = ivcVar.i;
                if (bitmap != null) {
                    qw0 qw0Var2 = this.R;
                    this.P = bitmap;
                    qw0Var2.getClass();
                    this.N = true;
                }
                if (!TextUtils.isEmpty(ivcVar.d)) {
                    String str = ivcVar.d;
                    this.r = str;
                    qw0 qw0Var3 = this.R;
                    this.L = str;
                    qw0Var3.F();
                    z = true;
                }
                if (gda.s0) {
                    setBackgroundColor(i2);
                }
            }
            if (!z) {
                setTitle(null);
                qw0 qw0Var4 = this.R;
                if (qw0Var4 != null) {
                    qw0Var4.F();
                }
            }
        }
    }

    public final void b(String str) {
        fc4.b("[webview] #" + this.a + " " + str);
    }

    public final void c(String str) {
        evaluateJavascript(str, new Object());
    }

    @Override
    public final void clearHistory() {
        b("clearHistory");
        super.clearHistory();
    }

    public final void d(String str, ivc ivcVar) {
        my0 my0Var = this.G;
        if (my0Var != null) {
            my0Var.dismiss();
            this.G = null;
        }
        a(ivcVar);
        this.d = str;
        String X = qw0.X(str);
        b("loadUrl " + X + " with cached meta");
        super.loadUrl(X);
        qw0 qw0Var = this.R;
        if (qw0Var != null) {
            qw0Var.G(!super.canGoBack(), !canGoForward());
        }
    }

    @Override
    public final void destroy() {
        b("destroy");
        super.destroy();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (!this.c) {
            ivc a = ivc.a(this);
            x84 c = x84.c();
            if (a == null) {
                c.getClass();
            } else {
                if (((HashMap) c.d) == null) {
                    c.d = new HashMap();
                }
                if (!TextUtils.isEmpty(a.b)) {
                    ((HashMap) c.d).put(a.b, a);
                    c.d();
                    c.e();
                }
            }
            m11 m11Var = this.e;
            if (m11Var != null && a != null) {
                m11Var.d = a;
                crd.c(m11Var);
            }
        }
    }

    public final void f(qw0 qw0Var, pw0 pw0Var) {
        boolean z;
        b("setContainers(" + qw0Var + ", " + pw0Var + ")");
        if (this.R == null && qw0Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.R = qw0Var;
        this.U = pw0Var;
        if (z && !this.c) {
            c("window.__tg__postBackgroundChange && window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.P;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.l(getScrollY() / max);
    }

    public int getSearchCount() {
        return this.I;
    }

    public int getSearchIndex() {
        return this.H;
    }

    @Override
    public String getTitle() {
        return this.L;
    }

    @Override
    public String getUrl() {
        if (this.F) {
            return this.E;
        }
        return super.getUrl();
    }

    @Override
    public final void goBack() {
        b("goBack");
        super.goBack();
    }

    @Override
    public final void goForward() {
        b("goForward");
        super.goForward();
    }

    @Override
    public final void loadData(String str, String str2, String str3) {
        this.d = null;
        StringBuilder m = mlb.m("loadData ", str, " ", str2, " ");
        m.append(str3);
        b(m.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder m = mlb.m("loadDataWithBaseURL ", str, " ", str2, " ");
        kt6.v(m, str3, " ", str4, " ");
        m.append(str5);
        b(m.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        my0 my0Var = this.G;
        if (my0Var != null) {
            my0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(x84.c().b(gm.J0(str, true)));
        }
        this.d = str;
        String X = qw0.X(str);
        b("loadUrl " + X + " " + map);
        super.loadUrl(X, map);
        qw0 qw0Var = this.R;
        if (qw0Var != null) {
            qw0Var.G(!super.canGoBack(), !canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        b("attached");
        gm.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        qw0 qw0Var = this.R;
        if (qw0Var == null) {
            b("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = qw0Var.isFocusable();
        b("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        b("detached");
        gm.u(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    public final void onPause() {
        b("onPause");
        super.onPause();
    }

    @Override
    public final void onResume() {
        b("onResume");
        super.onResume();
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        pw0 pw0Var = this.U;
        if (pw0Var != null) {
            getScrollX();
            getScrollY();
            ((m) ((nl9) pw0Var).b).M.d0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.R != null && motionEvent.getAction() == 0) {
            this.R.Q = System.currentTimeMillis();
            if (this.R.Q0 == null) {
                getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void pauseTimers() {
        b("pauseTimers");
        super.pauseTimers();
    }

    @Override
    public final void postUrl(String str, byte[] bArr) {
        b("postUrl " + str + " " + bArr);
        super.postUrl(str, bArr);
    }

    @Override
    public final void reload() {
        CookieManager.getInstance().flush();
        b("reload");
        super.reload();
    }

    @Override
    public final void resumeTimers() {
        b("resumeTimers");
        super.resumeTimers();
    }

    public void setCloseListener(Runnable runnable) {
        this.V = runnable;
    }

    @Override
    public void setFocusable(int i) {
        b("setFocusable " + i);
        super.setFocusable(i);
    }

    @Override
    public void setFocusableInTouchMode(boolean z) {
        b("setFocusableInTouchMode " + z);
        super.setFocusableInTouchMode(z);
    }

    @Override
    public void setFocusedByDefault(boolean z) {
        b("setFocusedByDefault " + z);
        super.setFocusedByDefault(z);
    }

    public void setScrollProgress(float f) {
        setScrollY((int) (f * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override
    public void setScrollX(int i) {
        super.setScrollX(i);
    }

    @Override
    public void setScrollY(int i) {
        super.setScrollY(i);
    }

    public void setTitle(String str) {
        this.L = str;
    }

    @Override
    public final void stopLoading() {
        b("stopLoading");
        super.stopLoading();
    }

    @Override
    public final void stopNestedScroll() {
        b("stopNestedScroll");
        super.stopNestedScroll();
    }

    @Override
    public void setFocusable(boolean z) {
        b("setFocusable " + z);
        super.setFocusable(z);
    }

    @Override
    public final void loadUrl(String str) {
        my0 my0Var = this.G;
        if (my0Var != null) {
            my0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(x84.c().b(gm.J0(str, true)));
        }
        this.d = str;
        String X = qw0.X(str);
        b("loadUrl " + X);
        super.loadUrl(X);
        qw0 qw0Var = this.R;
        if (qw0Var != null) {
            qw0Var.G(!super.canGoBack(), !canGoForward());
        }
    }
}
