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
public final class nc8 extends qd8 {
    public final Rect N;
    public final PhotoViewer O;

    public nc8(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, b8 b8Var) {
        super(context);
        this.O = photoViewer;
        this.a = yac.t0;
        this.w = new ArrayList();
        this.M = new x38(this, (byte) 22);
        this.b = photoViewer2;
        this.r = b8Var;
        ev3 ev3Var = new ev3(this, context, context, (byte) 1);
        this.f = ev3Var;
        ev3Var.getSettings().setJavaScriptEnabled(true);
        ev3Var.getSettings().setDomStorageEnabled(true);
        ev3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ev3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ev3Var, true);
        ev3Var.setWebViewClient(new tu(this, (byte) 2));
        addView(ev3Var, tre.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, tre.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, tre.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i = aob.n6;
        yob.X(textView2, i, null);
        textView2.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        int i2 = rnb.a;
        textView2.setBackground(rnb.d(0, rnb.b(aob.w0(null, i, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 0, 8, 0, 0));
        tb tbVar = new tb((byte) 27, context, this);
        this.h = tbVar;
        tbVar.setBackgroundColor(-16777216);
        tbVar.setVisibility(4);
        addView(tbVar, tre.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, tre.e(-2, -2, 17));
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
