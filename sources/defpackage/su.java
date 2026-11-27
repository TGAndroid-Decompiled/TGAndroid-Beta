package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.ui.j;
import org.telegram.ui.o;
public final class su extends WebChromeClient {
    public final byte a;
    public final KeyEvent.Callback b;

    public su(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void onHideCustomView() {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                super.onHideCustomView();
                o oVar = ((j) callback).y;
                if (oVar.P != null) {
                    oVar.Q.setVisibility(4);
                    oVar.Q.removeView(oVar.P);
                    WebChromeClient.CustomViewCallback customViewCallback = oVar.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        oVar.T.onCustomViewHidden();
                    }
                    oVar.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                iv3 iv3Var = (iv3) callback;
                FrameLayout frameLayout = iv3Var.o1;
                if (iv3Var.n1 != null) {
                    iv3Var.b.setVisibility(0);
                    frameLayout.setVisibility(4);
                    frameLayout.removeView(iv3Var.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = iv3Var.p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        iv3Var.p1.onCustomViewHidden();
                    }
                    iv3Var.n1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                o oVar = ((j) callback).y;
                if (oVar.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                oVar.P = view;
                oVar.T = customViewCallback;
                hl.d3(new c1(this, (byte) 21), 100L);
                return;
            default:
                iv3 iv3Var = (iv3) callback;
                FrameLayout frameLayout = iv3Var.o1;
                if (iv3Var.n1 == null && !iv3Var.I0()) {
                    iv3Var.G0();
                    iv3Var.n1 = view;
                    iv3Var.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, tre.c(-1.0f, -1));
                    iv3Var.p1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                return;
            default:
                onShowCustomView(view, customViewCallback);
                return;
        }
    }
}
