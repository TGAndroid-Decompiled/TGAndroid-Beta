package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import gi.y4;
import org.telegram.messenger.h10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.k9;
public final class h extends d3 {
    public final m f17034f;

    public h(m mVar, Context context) {
        super(context);
        this.f17034f = mVar;
        this.f29078a = h10.f22829t0;
        setOrientation(1);
        r6.i(k6.f27824a7, this, null);
        y4 y4Var = new y4(context, 3);
        y4Var.f13935c = new Path();
        Paint paint = new Paint(1);
        y4Var.f13934b = paint;
        paint.setColor(k6.x0(null, k6.f27878d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        y4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        k9 k9Var = new k9(context);
        this.f29079b = k9Var;
        k9Var.setOnClickListener(new View.OnClickListener(this) {
            public final kg.h f29044b;

            {
                this.f29044b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29044b.f29079b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f29044b.f17034f.L();
                        return;
                }
            }
        });
        a();
        y4Var.addView(k9Var, mf.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f29080c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        r6.V(textView, k6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        y4Var.addView(textView, mf.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.f28273y6, null);
        y4Var.addView(textView2, mf.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f29081e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(k6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, k6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final kg.h f29044b;

            {
                this.f29044b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f29044b.f29079b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f29044b.f17034f.L();
                        return;
                }
            }
        });
        y4Var.addView(textView3, mf.t(-1, -2, 49, 0, 18, 0, 0));
        addView(y4Var, mf.o(-1, -2));
        set(null);
    }
}
