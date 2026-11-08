package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import fi.a5;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.l9;
public final class i extends d3 {
    public final n f16773f;

    public i(n nVar, Context context) {
        super(context);
        this.f16773f = nVar;
        this.f29015a = p10.f24470s0;
        setOrientation(1);
        r6.i(k6.f27796a7, this, null);
        a5 a5Var = new a5(context, 3);
        a5Var.f11605c = new Path();
        Paint paint = new Paint(1);
        a5Var.f11604b = paint;
        paint.setColor(k6.x0(null, k6.f27852d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        a5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        l9 l9Var = new l9(context);
        this.f29016b = l9Var;
        l9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.i f28986b;

            {
                this.f28986b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f28986b.f29016b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f28986b.f16773f.L();
                        return;
                }
            }
        });
        a();
        a5Var.addView(l9Var, ha.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f29017c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        r6.V(textView, k6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        a5Var.addView(textView, ha.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.f28244y6, null);
        a5Var.addView(textView2, ha.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f29018e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(z5.f(k6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, k6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.i f28986b;

            {
                this.f28986b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f28986b.f29016b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f28986b.f16773f.L();
                        return;
                }
            }
        });
        a5Var.addView(textView3, ha.t(-1, -2, 49, 0, 18, 0, 0));
        addView(a5Var, ha.o(-1, -2));
        set(null);
    }
}
