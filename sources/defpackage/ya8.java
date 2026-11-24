package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class ya8 extends bc8 {
    public final Rect N;
    public final PhotoViewer O;

    public ya8(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, a8 a8Var) {
        super(context);
        this.O = photoViewer;
        this.a = z8c.t0;
        this.w = new ArrayList();
        this.M = new q78(this, (byte) 14);
        this.b = photoViewer2;
        this.r = a8Var;
        vv3 vv3Var = new vv3(this, context, context, (byte) 1);
        this.f = vv3Var;
        vv3Var.getSettings().setJavaScriptEnabled(true);
        vv3Var.getSettings().setDomStorageEnabled(true);
        vv3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        vv3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(vv3Var, true);
        vv3Var.setWebViewClient(new sv(this, (byte) 2));
        addView(vv3Var, qoe.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, qoe.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.x6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, qoe.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i = cmb.m6;
        anb.X(textView2, i, null);
        textView2.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        int i2 = ulb.a;
        textView2.setBackground(ulb.d(0, ulb.b(cmb.w0(null, i, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        sb sbVar = new sb((byte) 27, context, this);
        this.h = sbVar;
        sbVar.setBackgroundColor(-16777216);
        sbVar.setVisibility(4);
        addView(sbVar, qoe.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, qoe.e(-2, -2, 17));
        this.N = new Rect();
    }

    public final void j(Canvas canvas, int i, int i2) {
        Bitmap n = this.O.B4.n();
        if (n != null) {
            float min = Math.min(i / n.getWidth(), i2 / n.getHeight());
            int width = (int) (n.getWidth() * min);
            int height = (int) (n.getHeight() * min);
            int i3 = (i2 - height) / 2;
            int i4 = (i - width) / 2;
            Rect rect = this.N;
            rect.set(i4, i3, width + i4, height + i3);
            canvas.drawBitmap(n, (Rect) null, rect, (Paint) null);
        }
    }
}
