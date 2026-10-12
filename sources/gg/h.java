package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ci.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.y9;
public final class h extends c3 {
    public final m f10612f;

    public h(m mVar, Context context) {
        super(context);
        this.f10612f = mVar;
        this.f21669a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(h6.x0(null, h6.f20504a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.f6207c = new Path();
        Paint paint = new Paint(1);
        w5Var.f6206b = paint;
        paint.setColor(h6.x0(null, h6.f20560d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        y9 y9Var = new y9(context);
        this.f21670b = y9Var;
        y9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21600b;

            {
                this.f21600b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21600b.f21670b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21600b.f10612f.K();
                        return;
                }
            }
        });
        a();
        w5Var.addView(y9Var, w7.w5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21671c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(h6.x0(null, h6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, w7.w5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.x0(null, h6.f20946y6, false));
        w5Var.addView(textView2, w7.w5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f21672e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, h6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.x0(null, h6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21600b;

            {
                this.f21600b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21600b.f21670b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21600b.f10612f.K();
                        return;
                }
            }
        });
        w5Var.addView(textView3, w7.w5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, w7.w5.n(-1, -2));
        set(null);
    }
}
