package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.na;
import hi.i5;
import org.telegram.messenger.i10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.p9;
public final class h extends e3 {
    public final m f17561f;

    public h(m mVar, Context context) {
        super(context);
        this.f17561f = mVar;
        this.f30654a = i10.f24637t0;
        setOrientation(1);
        u6.h(n6.f29394a7, this, null);
        i5 i5Var = new i5(context, 3);
        i5Var.f14675c = new Path();
        Paint paint = new Paint(1);
        i5Var.f14674b = paint;
        paint.setColor(n6.x0(null, n6.f29451d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        i5Var.setWillNotDraw(false);
        i5Var.setOrientation(1);
        i5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        p9 p9Var = new p9(context);
        this.f30655b = p9Var;
        p9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30623b;

            {
                this.f30623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30623b.f30655b.getImageReceiver().Q0(false);
                        return;
                    default:
                        this.f30623b.f17561f.L();
                        return;
                }
            }
        });
        a();
        i5Var.addView(p9Var, na.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f30656c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        u6.U(textView, n6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5Var.addView(textView, na.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.f29843y6, null);
        i5Var.addView(textView2, na.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f30657e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(b6.f(n6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        u6.U(textView3, n6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30623b;

            {
                this.f30623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30623b.f30655b.getImageReceiver().Q0(false);
                        return;
                    default:
                        this.f30623b.f17561f.L();
                        return;
                }
            }
        });
        i5Var.addView(textView3, na.t(-1, -2, 49, 0, 18, 0, 0));
        addView(i5Var, na.o(-1, -2));
        set(null);
    }
}
