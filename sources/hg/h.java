package hg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import di.v5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class h extends c3 {
    public final m f10563f;

    public h(m mVar, Context context) {
        super(context);
        this.f10563f = mVar;
        this.f21012a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        v5 v5Var = new v5(context, 3);
        v5Var.f8001c = new Path();
        Paint paint = new Paint(1);
        v5Var.f8000b = paint;
        paint.setColor(g6.x0(null, g6.f19901d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        v5Var.setWillNotDraw(false);
        v5Var.setOrientation(1);
        v5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        z9 z9Var = new z9(context);
        this.f21013b = z9Var;
        z9Var.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f20943b;

            {
                this.f20943b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20943b.f21013b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20943b.f10563f.K();
                        return;
                }
            }
        });
        a();
        v5Var.addView(z9Var, a6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21014c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(g6.x0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        v5Var.addView(textView, a6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.x0(null, g6.f20288y6, false));
        v5Var.addView(textView2, a6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.x0(null, g6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hg.h f20943b;

            {
                this.f20943b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20943b.f21013b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20943b.f10563f.K();
                        return;
                }
            }
        });
        v5Var.addView(textView3, a6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(v5Var, a6.n(-1, -2));
        set(null);
    }
}
