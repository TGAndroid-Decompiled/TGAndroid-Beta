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
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.w9;
import w7.x5;
public final class h extends b3 {
    public final m f9735f;

    public h(m mVar, Context context) {
        super(context);
        this.f9735f = mVar;
        this.f19794a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(h6.w0(null, h6.f18733a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.f5728c = new Path();
        Paint paint = new Paint(1);
        w5Var.f5727b = paint;
        paint.setColor(h6.w0(null, h6.f18789d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f19795b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f19755b;

            {
                this.f19755b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19755b.f19795b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f19755b.f9735f.K();
                        return;
                }
            }
        });
        a();
        w5Var.addView(w9Var, x5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f19796c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(h6.w0(null, h6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, x5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.w0(null, h6.f19170y6, false));
        w5Var.addView(textView2, x5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, h6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.w0(null, h6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final gg.h f19755b;

            {
                this.f19755b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19755b.f19795b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f19755b.f9735f.K();
                        return;
                }
            }
        });
        w5Var.addView(textView3, x5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, x5.n(-1, -2));
        set(null);
    }
}
