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
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class h extends c3 {
    public final m f10601f;

    public h(m mVar, Context context) {
        super(context);
        this.f10601f = mVar;
        this.f21871a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(i6.w0(null, i6.f20771a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.f6233c = new Path();
        Paint paint = new Paint(1);
        w5Var.f6232b = paint;
        paint.setColor(i6.w0(null, i6.f20827d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f21872b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21832b;

            {
                this.f21832b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21832b.f21872b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21832b.f10601f.K();
                        return;
                }
            }
        });
        a();
        w5Var.addView(w9Var, z5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21873c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(i6.w0(null, i6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, z5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.w0(null, i6.f21214y6, false));
        w5Var.addView(textView2, z5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f21874e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(x5.f(new float[]{8.0f}, i6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.w0(null, i6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f21832b;

            {
                this.f21832b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21832b.f21872b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21832b.f10601f.K();
                        return;
                }
            }
        });
        w5Var.addView(textView3, z5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, z5.n(-1, -2));
        set(null);
    }
}
