package hg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import di.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.x9;
public final class h extends b3 {
    public final m f11061f;

    public h(m mVar, Context context) {
        super(context);
        this.f11061f = mVar;
        this.f21637a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        x5 x5Var = new x5(context, 3);
        x5Var.f8387c = new Path();
        Paint paint = new Paint(1);
        x5Var.f8386b = paint;
        paint.setColor(j6.w0(null, j6.f20663d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        x5Var.setWillNotDraw(false);
        x5Var.setOrientation(1);
        x5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        x9 x9Var = new x9(context);
        this.f21638b = x9Var;
        x9Var.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f21601b;

            {
                this.f21601b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21601b.f21638b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21601b.f11061f.K();
                        return;
                }
            }
        });
        a();
        x5Var.addView(x9Var, w7.x5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21639c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        x5Var.addView(textView, w7.x5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.f21042y6, false));
        x5Var.addView(textView2, w7.x5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f21640e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(new float[]{8.0f}, j6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.w0(null, j6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f21601b;

            {
                this.f21601b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21601b.f21638b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f21601b.f11061f.K();
                        return;
                }
            }
        });
        x5Var.addView(textView3, w7.x5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(x5Var, w7.x5.n(-1, -2));
        set(null);
    }
}
