package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import hi.x4;
import org.telegram.messenger.j10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.q9;
public final class h extends e3 {
    public final m f17465f;

    public h(m mVar, Context context) {
        super(context);
        this.f17465f = mVar;
        this.f30563a = j10.f24770t0;
        setOrientation(1);
        u6.h(n6.f29337a7, this, null);
        x4 x4Var = new x4(context, 3);
        x4Var.f15725c = new Path();
        Paint paint = new Paint(1);
        x4Var.f15724b = paint;
        paint.setColor(n6.x0(null, n6.f29394d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        x4Var.setWillNotDraw(false);
        x4Var.setOrientation(1);
        x4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        q9 q9Var = new q9(context);
        this.f30564b = q9Var;
        q9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30537b;

            {
                this.f30537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30537b.f30564b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30537b.f17465f.L();
                        return;
                }
            }
        });
        a();
        x4Var.addView(q9Var, ma.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f30565c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        u6.U(textView, n6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        x4Var.addView(textView, ma.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.f29786y6, null);
        x4Var.addView(textView2, ma.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f30566e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(b6.f(n6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        u6.U(textView3, n6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30537b;

            {
                this.f30537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30537b.f30564b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30537b.f17465f.L();
                        return;
                }
            }
        });
        x4Var.addView(textView3, ma.t(-1, -2, 49, 0, 18, 0, 0));
        addView(x4Var, ma.o(-1, -2));
        set(null);
    }
}
