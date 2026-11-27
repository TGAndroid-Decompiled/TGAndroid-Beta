package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public abstract class qd8 extends FrameLayout {
    public TLRPC.WebPage E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public x38 M;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public ev3 f;
    public tb h;
    public RadialProgressView n;
    public b8 r;
    public String s;
    public ArrayList w;
    public String x;
    public boolean y;

    public final void a(boolean z) {
        x38 x38Var = this.M;
        boolean z2 = this.H;
        if (!z) {
            if (z2) {
                hl.d3(x38Var, 500L);
            }
        } else if (!z2) {
            hl.r(x38Var);
        }
    }

    public final java.lang.String b(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd8.b(int):java.lang.String");
    }

    public final boolean c() {
        if (this.y && "inapp".equals(uc7.s1(this.a).k4.Q0.f)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.n.getVisibility() != 0) {
            me8 a = fc3.b().a();
            if (a != null) {
                a.b();
                hl.d3(new md8(this, (byte) 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            PhotoViewer photoViewer = this.b;
            if (photoViewer.E != null && photoViewer.g0 != null) {
                photoViewer.V();
                photoViewer.U8.i(photoViewer.E, null, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        if (this.H && this.y) {
            h("pauseVideo();");
            this.H = false;
            a(true);
        }
    }

    public final void f() {
        if (!this.H && this.y) {
            h("playVideo();");
            this.H = true;
            a(false);
        }
    }

    public final void g(String str) {
        String str2;
        double ceil;
        int videoDuration = getVideoDuration() / 1000;
        ArrayList arrayList = this.w;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String k = c00.k(new StringBuilder(), split[0].split("\\$")[0], "2/");
            String str3 = split[0].split("\\$N")[1];
            if (split.length == 3) {
                str2 = split[2].split("M#")[1];
            } else if (split.length == 2) {
                str2 = split[1].split("t#")[1];
            } else {
                str2 = split[3].split("M#")[1];
            }
            if (videoDuration <= 100) {
                ceil = Math.ceil(videoDuration / 25.0f);
            } else if (videoDuration <= 250) {
                ceil = Math.ceil((videoDuration / 2.0f) / 25.0f);
            } else if (videoDuration <= 500) {
                ceil = Math.ceil((videoDuration / 4.0f) / 25.0f);
            } else if (videoDuration <= 1000) {
                ceil = Math.ceil((videoDuration / 5.0f) / 25.0f);
            } else {
                ceil = Math.ceil((videoDuration / 10.0f) / 25.0f);
            }
            int i = (int) ceil;
            for (int i2 = 0; i2 < i; i2++) {
                Locale locale = Locale.ROOT;
                arrayList.add(k + "M" + i2 + str3 + "&sigh=" + str2);
            }
        }
    }

    public float getBufferedPosition() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.J;
    }

    public int getEmbedHeight() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_height;
        }
        return 0;
    }

    public int getEmbedWidth() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_width;
        }
        return 0;
    }

    public int getVideoDuration() {
        return this.I;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j) {
        boolean z = this.H;
        this.J = (int) j;
        if (z) {
            e();
            hl.d3(new kt(this, j, (byte) 25), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ev3 ev3Var = this.f;
        if (ev3Var.getParent() == this) {
            TLRPC.WebPage webPage = this.E;
            int i3 = webPage.embed_width;
            int i4 = 100;
            if (i3 == 0) {
                i3 = 100;
            }
            int i5 = webPage.embed_height;
            if (i5 != 0) {
                i4 = i5;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = i3;
            float f2 = i4;
            float min = Math.min(size / f, size2 / f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ev3Var.getLayoutParams();
            int i6 = (int) (f * min);
            layoutParams.width = i6;
            int i7 = (int) (f2 * min);
            layoutParams.height = i7;
            layoutParams.topMargin = (size2 - i7) / 2;
            layoutParams.leftMargin = (size - i6) / 2;
        }
        super.onMeasure(i, i2);
    }

    public void setPlaybackSpeed(float f) {
        this.F = f;
        if (this.n.getVisibility() != 0) {
            if (this.y) {
                h("setPlaybackSpeed(" + f + ");");
                return;
            }
            return;
        }
        this.G = true;
    }

    public void setTouchDisabled(boolean z) {
        this.L = z;
    }
}
