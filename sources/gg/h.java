package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ci.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.u9;
public final class h extends b3 {
    public final m f9749f;

    public h(m mVar, Context context) {
        super(context);
        this.f9749f = mVar;
        this.f19814a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(i6.w0(null, i6.f18778a7, false));
        x5 x5Var = new x5(context, 3);
        x5Var.f5754c = new Path();
        Paint paint = new Paint(1);
        x5Var.f5753b = paint;
        paint.setColor(i6.w0(null, i6.f18834d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        x5Var.setWillNotDraw(false);
        x5Var.setOrientation(1);
        x5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        u9 u9Var = new u9(context);
        this.f19815b = u9Var;
        u9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f19782b;

            {
                this.f19782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19782b.f19815b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f19782b.f9749f.K();
                        return;
                }
            }
        });
        a();
        x5Var.addView(u9Var, w7.x5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f19816c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(i6.w0(null, i6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        x5Var.addView(textView, w7.x5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.w0(null, i6.f19215y6, false));
        x5Var.addView(textView2, w7.x5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(new float[]{8.0f}, i6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.w0(null, i6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f19782b;

            {
                this.f19782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19782b.f19815b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f19782b.f9749f.K();
                        return;
                }
            }
        });
        x5Var.addView(textView3, w7.x5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(x5Var, w7.x5.n(-1, -2));
        set(null);
    }
}
