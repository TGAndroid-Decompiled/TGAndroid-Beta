package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class jtc extends FrameLayout {
    public static final int f = 0;
    public final wjb a;
    public final n79 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public jtc(Context context, wjb wjbVar) {
        super(context);
        n79 n79Var = new n79(this);
        this.b = n79Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = wjbVar;
        int v0 = bkb.v0(bkb.Yl, wjbVar);
        n79Var.B = v0;
        n79Var.A = v0;
        n79Var.z = v0;
        n79Var.x = bkb.p1(0.1f, v0);
        n79Var.j = false;
        n79Var.i = false;
        n79Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        n79 n79Var = this.b;
        float[] fArr = n79Var.e;
        float L = gl.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = n79Var.e;
        float L2 = gl.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, gl.L(3.0f), getHeight());
        n79Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z;
        float f2;
        removeAllViews();
        if (webPage.photo != null) {
            z = true;
        } else {
            z = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        wjb wjbVar = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(gl.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            zkb.X(textView, bkb.Yl, wjbVar);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(gl.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            zkb.X(textView2, bkb.i5, wjbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            zkb.X(textView3, bkb.i5, wjbVar);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, nme.o(-1, -2));
        }
        if (z) {
            f2 = 56.0f;
        } else {
            f2 = 0.0f;
        }
        addView(linearLayout, nme.d(-1, -2.0f, 51, 0.0f, 0.0f, f2, 0.0f));
        if (z) {
            be0 be0Var = new be0(getContext());
            be0Var.setRoundRadius(gl.L(6.0f));
            int L = gl.L(6.0f);
            int i = bkb.i5;
            ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.08f, bkb.v0(i, wjbVar)));
            vkb K = zkb.K(0.08f, i);
            be0Var.setBackground(b0);
            zkb.j(be0Var, b0, K, null, wjbVar);
            addView(be0Var, nme.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w = ba4.w(webPage.photo.sizes, 40, false, null, false);
            be0Var.g(1, 0L, gl5.f(ba4.w(webPage.photo.sizes, gl.L(36.0f), false, w, true), webPage.photo), gl5.f(w, webPage.photo), webPage, "48_48", "48_48_b", null);
        }
        setPadding(gl.L(10.0f), gl.L(2.0f), gl.L(7.0f), gl.L(6.0f));
    }
}
