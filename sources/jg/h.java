package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ja;
import hi.y4;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.i9;
public final class h extends d3 {
    public final m f17082f;

    public h(m mVar, Context context) {
        super(context);
        this.f17082f = mVar;
        this.f30136a = m10.f24940t0;
        setOrientation(1);
        q6.h(j6.f28792a7, this, null);
        y4 y4Var = new y4(context, 3);
        y4Var.f15421c = new Path();
        Paint paint = new Paint(1);
        y4Var.f15420b = paint;
        paint.setColor(j6.x0(null, j6.f28849d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        y4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        i9 i9Var = new i9(context);
        this.f30137b = i9Var;
        i9Var.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30101b;

            {
                this.f30101b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30101b.f30137b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30101b.f17082f.L();
                        return;
                }
            }
        });
        a();
        y4Var.addView(i9Var, ja.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f30138c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        q6.U(textView, j6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        y4Var.addView(textView, ja.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        q6.U(textView2, j6.f29241y6, null);
        y4Var.addView(textView2, ja.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f30139e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(j6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        q6.U(textView3, j6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final jg.h f30101b;

            {
                this.f30101b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30101b.f30137b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f30101b.f17082f.L();
                        return;
                }
            }
        });
        y4Var.addView(textView3, ja.t(-1, -2, 49, 0, 18, 0, 0));
        addView(y4Var, ja.o(-1, -2));
        set(null);
    }
}
