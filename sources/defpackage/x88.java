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
public final class x88 extends aa8 {
    public final Rect N;
    public final PhotoViewer O;

    public x88(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, a8 a8Var) {
        super(context);
        this.O = photoViewer;
        this.a = y6c.t0;
        this.w = new ArrayList();
        this.M = new w88(this, (byte) 7);
        this.b = photoViewer2;
        this.r = a8Var;
        ku3 ku3Var = new ku3(this, context, context, (byte) 1);
        this.f = ku3Var;
        ku3Var.getSettings().setJavaScriptEnabled(true);
        ku3Var.getSettings().setDomStorageEnabled(true);
        ku3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ku3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ku3Var, true);
        ku3Var.setWebViewClient(new su(this, (byte) 2));
        addView(ku3Var, nme.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, nme.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.x6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, nme.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i = bkb.m6;
        zkb.X(textView2, i, null);
        textView2.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        int i2 = sjb.a;
        textView2.setBackground(sjb.d(0, sjb.b(bkb.w0(null, i, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 0, 8, 0, 0));
        sb sbVar = new sb((byte) 26, context, this);
        this.h = sbVar;
        sbVar.setBackgroundColor(-16777216);
        sbVar.setVisibility(4);
        addView(sbVar, nme.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, nme.e(-2, -2, 17));
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
