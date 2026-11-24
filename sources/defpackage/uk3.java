package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
public final class uk3 extends vl3 {
    public final zk3 f;

    public uk3(zk3 zk3Var, Context context) {
        super(context);
        this.f = zk3Var;
        this.a = z8c.t0;
        setOrientation(1);
        anb.h(cmb.Z6, null, this);
        f7 f7Var = new f7(context, (byte) 2);
        f7Var.b = new Path();
        Paint paint = new Paint(1);
        f7Var.c = paint;
        paint.setColor(cmb.w0(null, cmb.c6, false));
        paint.setShadowLayer(gm.L(1.33f), 0.0f, gm.L(0.33f), 503316480);
        f7Var.setWillNotDraw(false);
        f7Var.setOrientation(1);
        f7Var.setPadding(gm.L(32.0f), gm.L(16.0f), gm.L(32.0f), gm.L(32.0f));
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final uk3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                uk3 uk3Var = this.b;
                switch (b) {
                    case 0:
                        uk3Var.b.getImageReceiver().w0(false);
                        return;
                    default:
                        uk3Var.f.L();
                        return;
                }
            }
        });
        a();
        f7Var.addView(bf0Var, qoe.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        anb.X(textView, cmb.F6, null);
        textView.setTypeface(gm.o());
        f7Var.addView(textView, qoe.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.x6, null);
        f7Var.addView(textView2, qoe.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(ulb.f(cmb.Ei, 8.0f));
        textView3.setTextSize(1, 14.0f);
        anb.X(textView3, cmb.Ii, null);
        textView3.setTypeface(gm.o());
        textView3.setPadding(gm.L(14.0f), gm.L(14.0f), gm.L(14.0f), gm.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final uk3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                uk3 uk3Var = this.b;
                switch (b) {
                    case 0:
                        uk3Var.b.getImageReceiver().w0(false);
                        return;
                    default:
                        uk3Var.f.L();
                        return;
                }
            }
        });
        f7Var.addView(textView3, qoe.t(-1, -2, 49, 0, 18, 0, 0));
        addView(f7Var, qoe.o(-1, -2));
        set(null);
    }
}
