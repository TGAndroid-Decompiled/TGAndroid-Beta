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
public final class yxc extends FrameLayout {
    public static final int f = 0;
    public final vnb a;
    public final ab9 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public yxc(Context context, vnb vnbVar) {
        super(context);
        ab9 ab9Var = new ab9(this);
        this.b = ab9Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = vnbVar;
        int v0 = aob.v0(aob.Zl, vnbVar);
        ab9Var.B = v0;
        ab9Var.A = v0;
        ab9Var.z = v0;
        ab9Var.x = aob.p1(0.1f, v0);
        ab9Var.j = false;
        ab9Var.i = false;
        ab9Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ab9 ab9Var = this.b;
        float[] fArr = ab9Var.e;
        float L = hl.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = ab9Var.e;
        float L2 = hl.L(10.0f);
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
        rectF2.set(0.0f, 0.0f, hl.L(3.0f), getHeight());
        ab9Var.f(canvas, rectF2, 1.0f);
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
        vnb vnbVar = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(hl.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            yob.X(textView, aob.Zl, vnbVar);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(hl.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            yob.X(textView2, aob.j5, vnbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            yob.X(textView3, aob.j5, vnbVar);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, tre.o(-1, -2));
        }
        if (z) {
            f2 = 56.0f;
        } else {
            f2 = 0.0f;
        }
        addView(linearLayout, tre.d(-1, -2.0f, 51, 0.0f, 0.0f, f2, 0.0f));
        if (z) {
            de0 de0Var = new de0(getContext());
            de0Var.setRoundRadius(hl.L(6.0f));
            int L = hl.L(6.0f);
            int i = aob.j5;
            ShapeDrawable b0 = aob.b0(L, aob.p1(0.08f, aob.v0(i, vnbVar)));
            uob K = yob.K(0.08f, i);
            de0Var.setBackground(b0);
            yob.j(de0Var, b0, K, null, vnbVar);
            addView(de0Var, tre.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w = xb4.w(webPage.photo.sizes, 40, false, null, false);
            de0Var.g(1, 0L, jn5.f(xb4.w(webPage.photo.sizes, hl.L(36.0f), false, w, true), webPage.photo), jn5.f(w, webPage.photo), webPage, "48_48", "48_48_b", null);
        }
        setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(7.0f), hl.L(6.0f));
    }
}
