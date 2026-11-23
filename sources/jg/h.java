package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.na;
import hi.y4;
import org.telegram.messenger.k10;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.q9;
public final class h extends e3 {
    public final m f17459f;

    public h(m mVar, Context context) {
        super(context);
        this.f17459f = mVar;
        this.f30560a = k10.f24932t0;
        setOrientation(1);
        t6.h(m6.f29290a7, this, null);
        y4 y4Var = new y4(context, 3);
        y4Var.f15722c = new Path();
        Paint paint = new Paint(1);
        y4Var.f15721b = paint;
        paint.setColor(m6.x0(null, m6.f29347d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        y4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        q9 q9Var = new q9(context);
        this.f30561b = q9Var;
        q9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30534b;

            {
                this.f30534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30534b.f30561b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30534b.f17459f.L();
                        return;
                }
            }
        });
        a();
        y4Var.addView(q9Var, na.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f30562c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        t6.U(textView, m6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        y4Var.addView(textView, na.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.f29739y6, null);
        y4Var.addView(textView2, na.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f30563e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(a6.f(m6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, m6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30534b;

            {
                this.f30534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30534b.f30561b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30534b.f17459f.L();
                        return;
                }
            }
        });
        y4Var.addView(textView3, na.t(-1, -2, 49, 0, 18, 0, 0));
        addView(y4Var, na.o(-1, -2));
        set(null);
    }
}
