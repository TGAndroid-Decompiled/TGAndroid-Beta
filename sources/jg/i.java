package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import fi.a5;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.k9;
public final class i extends d3 {
    public final n f16773f;

    public i(n nVar, Context context) {
        super(context);
        this.f16773f = nVar;
        this.f29030a = p10.f24474s0;
        setOrientation(1);
        t6.h(m6.f27834a7, this, null);
        a5 a5Var = new a5(context, 3);
        a5Var.f11610c = new Path();
        Paint paint = new Paint(1);
        a5Var.f11609b = paint;
        paint.setColor(m6.x0(null, m6.f27890d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        a5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        k9 k9Var = new k9(context);
        this.f29031b = k9Var;
        k9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.i f29001b;

            {
                this.f29001b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29001b.f29031b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f29001b.f16773f.L();
                        return;
                }
            }
        });
        a();
        a5Var.addView(k9Var, ha.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f29032c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        t6.U(textView, m6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        a5Var.addView(textView, ha.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.f28282y6, null);
        a5Var.addView(textView2, ha.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f29033e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(b6.f(m6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, m6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.i f29001b;

            {
                this.f29001b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29001b.f29031b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f29001b.f16773f.L();
                        return;
                }
            }
        });
        a5Var.addView(textView3, ha.t(-1, -2, 49, 0, 18, 0, 0));
        addView(a5Var, ha.o(-1, -2));
        set(null);
    }
}
