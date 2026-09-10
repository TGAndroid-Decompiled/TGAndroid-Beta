package fg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import bi.w6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.w9;
import w7.a6;
public final class h extends b3 {
    public final m f8027f;

    public h(m mVar, Context context) {
        super(context);
        this.f8027f = mVar;
        this.f18910a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        w6 w6Var = new w6(context, 3);
        w6Var.f3831c = new Path();
        Paint paint = new Paint(1);
        w6Var.f3830b = paint;
        paint.setColor(j6.w0(null, j6.f17928d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w6Var.setWillNotDraw(false);
        w6Var.setOrientation(1);
        w6Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.f18911b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) {
            public final fg.h f18872b;

            {
                this.f18872b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18872b.f18911b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f18872b.f8027f.K();
                        return;
                }
            }
        });
        a();
        w6Var.addView(w9Var, a6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f18912c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w6Var.addView(textView, a6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.f18306y6, false));
        w6Var.addView(textView2, a6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(z5.f(new float[]{8.0f}, j6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.w0(null, j6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final fg.h f18872b;

            {
                this.f18872b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18872b.f18911b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f18872b.f8027f.K();
                        return;
                }
            }
        });
        w6Var.addView(textView3, a6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w6Var, a6.n(-1, -2));
        set(null);
    }
}
