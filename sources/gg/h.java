package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ci.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class h extends c3 {
    public final m f10614f;

    public h(m mVar, Context context) {
        super(context);
        this.f10614f = mVar;
        this.f21906a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(i6.x0(null, i6.f20741a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.f6209c = new Path();
        Paint paint = new Paint(1);
        w5Var.f6208b = paint;
        paint.setColor(i6.x0(null, i6.f20797d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        y9 y9Var = new y9(context);
        this.f21907b = y9Var;
        y9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21835b;

            {
                this.f21835b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21835b.f21907b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21835b.f10614f.K();
                        return;
                }
            }
        });
        a();
        w5Var.addView(y9Var, x5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21908c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(i6.x0(null, i6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, x5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.x0(null, i6.f21181y6, false));
        w5Var.addView(textView2, x5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f21909e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(new float[]{8.0f}, i6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.x0(null, i6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21835b;

            {
                this.f21835b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21835b.f21907b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21835b.f10614f.K();
                        return;
                }
            }
        });
        w5Var.addView(textView3, x5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, x5.n(-1, -2));
        set(null);
    }
}
