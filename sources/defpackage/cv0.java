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
public final class cv0 extends WebView {
    public static final int W = 0;
    public String E;
    public boolean F;
    public fx0 G;
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
    public hv0 R;
    public boolean S;
    public ln8 T;
    public gv0 U;
    public Runnable V;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public e01 e;
    public cv0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public cv0(Context context, boolean z, long j) {
        super(context);
        int i = hv0.S0;
        hv0.S0 = i + 1;
        this.a = i;
        this.E = "about:blank";
        this.Q = new HashMap();
        this.c = z;
        b("created new webview " + this);
        setOnLongClickListener(new ou0(this));
        setWebViewClient(new qu0(this, z, context));
        setWebChromeClient(new zu0(this, context, z, j));
        setFindListener(new av0(this));
        if (!z) {
            setDownloadListener(new bv0(this));
        }
    }

    public final void a(htc htcVar) {
        ku0 ku0Var;
        if (htcVar != null) {
            hv0 hv0Var = this.R;
            boolean z = false;
            if (hv0Var != null && (ku0Var = hv0Var.c) != null) {
                int i = htcVar.e;
                if (i != 0) {
                    ku0Var.o(i, true);
                    this.s = true;
                }
                int i2 = htcVar.f;
                if (i2 != 0) {
                    this.R.c.o(i2, false);
                    this.w = true;
                } else {
                    i2 = -1;
                }
                Bitmap bitmap = htcVar.i;
                if (bitmap != null) {
                    hv0 hv0Var2 = this.R;
                    this.P = bitmap;
                    hv0Var2.getClass();
                    this.N = true;
                }
                if (!TextUtils.isEmpty(htcVar.d)) {
                    String str = htcVar.d;
                    this.r = str;
                    hv0 hv0Var3 = this.R;
                    this.L = str;
                    hv0Var3.F();
                    z = true;
                }
                if (gba.s0) {
                    setBackgroundColor(i2);
                }
            }
            if (!z) {
                setTitle(null);
                hv0 hv0Var4 = this.R;
                if (hv0Var4 != null) {
                    hv0Var4.F();
                }
            }
        }
    }

    public final void b(String str) {
        fa4.b("[webview] #" + this.a + " " + str);
    }

    public final void c(String str) {
        evaluateJavascript(str, new Object());
    }

    @Override
    public final void clearHistory() {
        b("clearHistory");
        super.clearHistory();
    }

    public final void d(String str, htc htcVar) {
        fx0 fx0Var = this.G;
        if (fx0Var != null) {
            fx0Var.dismiss();
            this.G = null;
        }
        a(htcVar);
        this.d = str;
        String X = hv0.X(str);
        b("loadUrl " + X + " with cached meta");
        super.loadUrl(X);
        hv0 hv0Var = this.R;
        if (hv0Var != null) {
            hv0Var.G(!super.canGoBack(), !canGoForward());
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
            htc a = htc.a(this);
            o74 c = o74.c();
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
            e01 e01Var = this.e;
            if (e01Var != null && a != null) {
                e01Var.d = a;
                zod.c(e01Var);
            }
        }
    }

    public final void f(hv0 hv0Var, gv0 gv0Var) {
        boolean z;
        b("setContainers(" + hv0Var + ", " + gv0Var + ")");
        if (this.R == null && hv0Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.R = hv0Var;
        this.U = gv0Var;
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
        StringBuilder l = yjb.l("loadData ", str, " ", str2, " ");
        l.append(str3);
        b(l.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder l = yjb.l("loadDataWithBaseURL ", str, " ", str2, " ");
        ls6.u(l, str3, " ", str4, " ");
        l.append(str5);
        b(l.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        fx0 fx0Var = this.G;
        if (fx0Var != null) {
            fx0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(o74.c().b(gl.J0(str, true)));
        }
        this.d = str;
        String X = hv0.X(str);
        b("loadUrl " + X + " " + map);
        super.loadUrl(X, map);
        hv0 hv0Var = this.R;
        if (hv0Var != null) {
            hv0Var.G(!super.canGoBack(), !canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        b("attached");
        gl.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        hv0 hv0Var = this.R;
        if (hv0Var == null) {
            b("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = hv0Var.isFocusable();
        b("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        b("detached");
        gl.u(getContext(), false);
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
        gv0 gv0Var = this.U;
        if (gv0Var != null) {
            getScrollX();
            getScrollY();
            ((m) ((lj9) gv0Var).b).M.d0();
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
        fx0 fx0Var = this.G;
        if (fx0Var != null) {
            fx0Var.dismiss();
            this.G = null;
        }
        if (!this.c) {
            a(o74.c().b(gl.J0(str, true)));
        }
        this.d = str;
        String X = hv0.X(str);
        b("loadUrl " + X);
        super.loadUrl(X);
        hv0 hv0Var = this.R;
        if (hv0Var != null) {
            hv0Var.G(!super.canGoBack(), !canGoForward());
        }
    }
}
