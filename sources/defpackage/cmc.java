package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public final class cmc extends FrameLayout implements tjb {
    public final wjb a;
    public final w0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final lm f;
    public final Paint h;

    public cmc(Context context, CharSequence[] charSequenceArr, ae9 ae9Var, wjb wjbVar) {
        super(context);
        int i;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = wjbVar;
        w0 w0Var = new w0(this, context, wjbVar);
        this.b = w0Var;
        this.f = new lm(new bmc(this, (byte) 0), 420L, s33.h);
        w0Var.setOrientation(0);
        w0Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            TextView textView = new TextView(context);
            textView.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(6.0f));
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i2]);
            textView.setOnClickListener(new wg(this, ae9Var, i2, (byte) 20));
            ote.a(textView);
            w0 w0Var2 = this.b;
            if (i2 == 0) {
                i = 0;
            } else {
                i = 3;
            }
            w0Var2.addView(textView, nme.q(-2, -2, 0.0f, 19, i, 0, 0, 0));
            this.c[i2] = textView;
        }
        addView(this.b, nme.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i = 0;
        float e = this.f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i < textViewArr.length) {
                float l = Utilities.l(1.0f - Math.abs(e - i));
                TextView textView = textViewArr[i];
                int i2 = bkb.y6;
                wjb wjbVar = this.a;
                textView.setTextColor(bm2.f(l, bkb.v0(i2, wjbVar), bkb.v0(bkb.Ei, wjbVar)));
                i++;
            } else {
                this.b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        w0 w0Var;
        if (this.e && view == (w0Var = this.b)) {
            float N = gl.N(1.67f);
            float N2 = gl.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(bkb.v0(bkb.c6, this.a));
            RectF rectF = gl.P;
            rectF.set(w0Var.getX(), w0Var.getY(), w0Var.getX() + w0Var.getWidth(), w0Var.getY() + w0Var.getHeight());
            canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setSelected(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        a();
    }

    @Override
    public final void updateColors() {
        ShapeDrawable b0;
        a();
        if (this.e) {
            b0 = null;
        } else {
            b0 = bkb.b0(gl.L(18.0f), bkb.v0(bkb.c6, this.a));
        }
        this.b.setBackground(b0);
    }
}
