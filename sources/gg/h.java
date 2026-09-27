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
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class h extends c3 {
    public final m f9740f;

    public h(m mVar, Context context) {
        super(context);
        this.f9740f = mVar;
        this.f20086a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(i6.w0(null, i6.f19001a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.f5787c = new Path();
        Paint paint = new Paint(1);
        w5Var.f5786b = paint;
        paint.setColor(i6.w0(null, i6.f19057d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f20087b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f20050b;

            {
                this.f20050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20050b.f20087b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20050b.f9740f.K();
                        return;
                }
            }
        });
        a();
        w5Var.addView(w9Var, y5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f20088c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(i6.w0(null, i6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, y5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.w0(null, i6.f19442y6, false));
        w5Var.addView(textView2, y5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, i6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.w0(null, i6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f20050b;

            {
                this.f20050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20050b.f20087b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20050b.f9740f.K();
                        return;
                }
            }
        });
        w5Var.addView(textView3, y5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, y5.n(-1, -2));
        set(null);
    }
}
