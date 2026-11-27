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
public final class nv0 extends WebView {
    public static final int W = 0;
    public String E;
    public boolean F;
    public nx0 G;
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
    public rv0 R;
    public boolean S;
    public j09 T;
    public qv0 U;
    public Runnable V;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public n01 e;
    public nv0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public nv0(Context context, boolean z, long j) {
        super(context);
        int i = rv0.S0;
        rv0.S0 = i + 1;
        this.a = i;
        this.E = "about:blank";
        this.Q = new HashMap();
        this.c = z;
        b("created new webview " + this);
        setOnLongClickListener(new yu0(this));
        setWebViewClient(new av0(this, z, context));
        setWebChromeClient(new kv0(this, context, z, j));
        setFindListener(new lv0(this));
        if (!z) {
            setDownloadListener(new mv0(this));
        }
    }

    public final void a(wxc wxcVar) {
        uu0 uu0Var;
        if (wxcVar != null) {
            rv0 rv0Var = this.R;
            boolean z = false;
            if (rv0Var != null && (uu0Var = rv0Var.c) != null) {
                int i = wxcVar.e;
                if (i != 0) {
                    uu0Var.o(i, true);
                    this.s = true;
                }
                int i2 = wxcVar.f;
                if (i2 != 0) {
                    this.R.c.o(i2, false);
                    this.w = true;
                } else {
                    i2 = -1;
                }
                Bitmap bitmap = wxcVar.i;
                if (bitmap != null) {
                    rv0 rv0Var2 = this.R;
                    this.P = bitmap;
                    rv0Var2.getClass();
                    this.N = true;
                }
                if (!TextUtils.isEmpty(wxcVar.d)) {
                    String str = wxcVar.d;
                    this.r = str;
                    rv0 rv0Var3 = this.R;
                    this.L = str;
                    rv0Var3.F();
                    z = true;
                }
                if (xea.s0) {
                    setBackgroundColor(i2);
                }
            }
            if (!z) {
                setTitle(null);
                rv0 rv0Var4 = this.R;
                if (rv0Var4 != null) {
                    rv0Var4.F();
                }
            }
        }
    }

    public final void b(String str) {
        cc4.b("[webview] #" + this.a + " " + str);
    }

    public final void c(String str) {
        evaluateJavascript(str, new Object());
    }

    @Override
    public final void clearHistory() {
        b("clearHistory");
        super.clearHistory();
    }

    public final void d(String str, wxc wxcVar) {
        nx0 nx0Var = this.G;
        if (nx0Var != null) {
            nx0Var.dismiss();
            this.G = null;
        }
        a(wxcVar);
        this.d = str;
        String X = rv0.X(str);
        b("loadUrl " + X + " with cached meta");
        super.loadUrl(X);
        rv0 rv0Var = this.R;
        if (rv0Var != null) {
            rv0Var.G(!super.canGoBack(), !canGoForward());
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
            wxc a = wxc.a(this);
            j84 c = j84.c();
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
            n01 n01Var = this.e;
            if (n01Var != null && a != null) {
                n01Var.d = a;
                ptd.c(n01Var);
            }
        }
    }

    public final void f(rv0 rv0Var, qv0 qv0Var) {
        boolean z;
        b("setContainers(" + rv0Var + ", " + qv0Var + ")");
        if (this.R == null && rv0Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.R = rv0Var;
        this.U = qv0Var;
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
        StringBuilder l = xnb.l("loadData ", str, " ", str2, " ");
        l.append(str3);
        b(l.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder l = xnb.l("loadDataWithBaseURL ", str, " ", str2, " ");
        qu6.u(l, str3, " ", str4, " ");
        l.append(str5);
        b(l.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        nx0 nx0Var = this.G;
        if (nx0Var != null) {
            nx0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(j84.c().b(hl.J0(str, true)));
        }
        this.d = str;
        String X = rv0.X(str);
        b("loadUrl " + X + " " + map);
        super.loadUrl(X, map);
        rv0 rv0Var = this.R;
        if (rv0Var != null) {
            rv0Var.G(!super.canGoBack(), !canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        b("attached");
        hl.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        rv0 rv0Var = this.R;
        if (rv0Var == null) {
            b("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = rv0Var.isFocusable();
        b("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        b("detached");
        hl.u(getContext(), false);
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
        qv0 qv0Var = this.U;
        if (qv0Var != null) {
            getScrollX();
            getScrollY();
            ((m) ((zm9) qv0Var).b).M.d0();
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
        nx0 nx0Var = this.G;
        if (nx0Var != null) {
            nx0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(j84.c().b(hl.J0(str, true)));
        }
        this.d = str;
        String X = rv0.X(str);
        b("loadUrl " + X);
        super.loadUrl(X);
        rv0 rv0Var = this.R;
        if (rv0Var != null) {
            rv0Var.G(!super.canGoBack(), !canGoForward());
        }
    }
}
