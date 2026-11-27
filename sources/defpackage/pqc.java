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
public final class pqc extends FrameLayout implements snb {
    public final vnb a;
    public final x0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final mm f;
    public final Paint h;

    public pqc(Context context, CharSequence[] charSequenceArr, sh9 sh9Var, vnb vnbVar) {
        super(context);
        int i;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = vnbVar;
        x0 x0Var = new x0(this, context, vnbVar);
        this.b = x0Var;
        this.f = new mm(new oqc(this, (byte) 0), 420L, k43.h);
        x0Var.setOrientation(0);
        x0Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            TextView textView = new TextView(context);
            textView.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(6.0f));
            textView.setTypeface(hl.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i2]);
            textView.setOnClickListener(new ae(this, sh9Var, i2, (byte) 20));
            iye.a(textView);
            x0 x0Var2 = this.b;
            if (i2 == 0) {
                i = 0;
            } else {
                i = 3;
            }
            x0Var2.addView(textView, tre.q(-2, -2, 0.0f, 19, i, 0, 0, 0));
            this.c[i2] = textView;
        }
        addView(this.b, tre.e(-2, -2, 17));
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
                int i2 = aob.z6;
                vnb vnbVar = this.a;
                textView.setTextColor(vm2.f(l, aob.v0(i2, vnbVar), aob.v0(aob.Fi, vnbVar)));
                i++;
            } else {
                this.b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        x0 x0Var;
        if (this.e && view == (x0Var = this.b)) {
            float N = hl.N(1.67f);
            float N2 = hl.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(aob.v0(aob.d6, this.a));
            RectF rectF = hl.P;
            rectF.set(x0Var.getX(), x0Var.getY(), x0Var.getX() + x0Var.getWidth(), x0Var.getY() + x0Var.getHeight());
            canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), paint);
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
            b0 = aob.b0(hl.L(18.0f), aob.v0(aob.d6, this.a));
        }
        this.b.setBackground(b0);
    }
}
