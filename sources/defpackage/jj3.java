package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
public final class jj3 extends lk3 {
    public final oj3 f;

    public jj3(oj3 oj3Var, Context context) {
        super(context);
        this.f = oj3Var;
        this.a = y6c.t0;
        setOrientation(1);
        zkb.h(bkb.Z6, null, this);
        f7 f7Var = new f7(context, (byte) 2);
        f7Var.b = new Path();
        Paint paint = new Paint(1);
        f7Var.c = paint;
        paint.setColor(bkb.w0(null, bkb.c6, false));
        paint.setShadowLayer(gl.L(1.33f), 0.0f, gl.L(0.33f), 503316480);
        f7Var.setWillNotDraw(false);
        f7Var.setOrientation(1);
        f7Var.setPadding(gl.L(32.0f), gl.L(16.0f), gl.L(32.0f), gl.L(32.0f));
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setOnClickListener(new View.OnClickListener(this) {
            public final jj3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                jj3 jj3Var = this.b;
                switch (b) {
                    case 0:
                        jj3Var.b.getImageReceiver().w0(false);
                        return;
                    default:
                        jj3Var.f.L();
                        return;
                }
            }
        });
        a();
        f7Var.addView(be0Var, nme.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        zkb.X(textView, bkb.F6, null);
        textView.setTypeface(gl.o());
        f7Var.addView(textView, nme.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.x6, null);
        f7Var.addView(textView2, nme.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(sjb.f(bkb.Ei, 8.0f));
        textView3.setTextSize(1, 14.0f);
        zkb.X(textView3, bkb.Ii, null);
        textView3.setTypeface(gl.o());
        textView3.setPadding(gl.L(14.0f), gl.L(14.0f), gl.L(14.0f), gl.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jj3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                jj3 jj3Var = this.b;
                switch (b) {
                    case 0:
                        jj3Var.b.getImageReceiver().w0(false);
                        return;
                    default:
                        jj3Var.f.L();
                        return;
                }
            }
        });
        f7Var.addView(textView3, nme.t(-1, -2, 49, 0, 18, 0, 0));
        addView(f7Var, nme.o(-1, -2));
        set(null);
    }
}
