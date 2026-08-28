package of;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import g7.e6;
import kh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.o9;
public final class h extends b3 {
    public final m f19357f;

    public h(m mVar, Context context) {
        super(context);
        this.f19357f = mVar;
        this.f24126a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        n5 n5Var = new n5(context, 3);
        n5Var.f15750c = new Path();
        Paint paint = new Paint(1);
        n5Var.f15749b = paint;
        paint.setColor(f6.w0(null, f6.f23001d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        n5Var.setWillNotDraw(false);
        n5Var.setOrientation(1);
        n5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        o9 o9Var = new o9(context);
        this.f24127b = o9Var;
        o9Var.setOnClickListener(new View.OnClickListener(this) {
            public final of.h f24050b;

            {
                this.f24050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f24050b.f24127b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f24050b.f19357f.K();
                        return;
                }
            }
        });
        a();
        n5Var.addView(o9Var, e6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f24128c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(f6.w0(null, f6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        n5Var.addView(textView, e6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(f6.w0(null, f6.f23369y6, false));
        n5Var.addView(textView2, e6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f24129e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(v5.f(new float[]{8.0f}, f6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(f6.w0(null, f6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final of.h f24050b;

            {
                this.f24050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f24050b.f24127b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f24050b.f19357f.K();
                        return;
                }
            }
        });
        n5Var.addView(textView3, e6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(n5Var, e6.n(-1, -2));
        set(null);
    }
}
