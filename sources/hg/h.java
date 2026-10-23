package hg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ei.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class h extends a3 {
    public final m f11898f;

    public h(m mVar, Context context) {
        super(context);
        this.f11898f = mVar;
        this.f22079a = UserConfig.selectedAccount;
        setOrientation(1);
        r6.i(k6.f21125a7, this, null);
        m5 m5Var = new m5(context, 3);
        m5Var.f9478c = new Path();
        Paint paint = new Paint(1);
        m5Var.f9477b = paint;
        paint.setColor(k6.x0(null, k6.f21183d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        m5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f22080b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f24021b;

            {
                this.f24021b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f24021b.f22080b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f24021b.f11898f.L();
                        return;
                }
            }
        });
        a();
        m5Var.addView(w9Var, z5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f22081c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        r6.W(textView, k6.G6, null);
        textView.setTypeface(AndroidUtilities.bold());
        m5Var.addView(textView, z5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        r6.W(textView2, k6.f21571y6, null);
        m5Var.addView(textView2, z5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(a6.f(new float[]{8.0f}, k6.Oh));
        textView3.setTextSize(1, 14.0f);
        r6.W(textView3, k6.Sh, null);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f24021b;

            {
                this.f24021b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f24021b.f22080b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f24021b.f11898f.L();
                        return;
                }
            }
        });
        m5Var.addView(textView3, z5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(m5Var, z5.n(-1, -2));
        set(null);
    }
}
