package hg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ei.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class h extends b3 {
    public final m f11873f;

    public h(m mVar, Context context) {
        super(context);
        this.f11873f = mVar;
        this.f22036a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(h6.x0(null, h6.f20931a7, false));
        m5 m5Var = new m5(context, 3);
        m5Var.f9469c = new Path();
        Paint paint = new Paint(1);
        m5Var.f9468b = paint;
        paint.setColor(h6.x0(null, h6.f20989d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        m5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f22037b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f21967b;

            {
                this.f21967b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21967b.f22037b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21967b.f11873f.K();
                        return;
                }
            }
        });
        a();
        m5Var.addView(w9Var, z5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f22038c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(h6.x0(null, h6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        m5Var.addView(textView, z5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.x0(null, h6.f21377y6, false));
        m5Var.addView(textView2, z5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(x5.f(new float[]{8.0f}, h6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.x0(null, h6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f21967b;

            {
                this.f21967b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21967b.f22037b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21967b.f11873f.K();
                        return;
                }
            }
        });
        m5Var.addView(textView3, z5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(m5Var, z5.n(-1, -2));
        set(null);
    }
}
