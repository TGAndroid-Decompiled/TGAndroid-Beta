package ig;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import fi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;
public final class i extends z2 {
    public final n f14071f;

    public i(n nVar, Context context) {
        super(context);
        this.f14071f = nVar;
        this.f25778a = UserConfig.selectedAccount;
        setOrientation(1);
        f7.i(y6.f23299a7, this, null);
        l5 l5Var = new l5(context, 3);
        l5Var.f11172c = new Path();
        Paint paint = new Paint(1);
        l5Var.f11171b = paint;
        paint.setColor(y6.x0(null, y6.f23356d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        l5Var.setWillNotDraw(false);
        l5Var.setOrientation(1);
        l5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        y9 y9Var = new y9(context);
        this.f25779b = y9Var;
        y9Var.setOnClickListener(new View.OnClickListener(this) {
            public final ig.i f25747b;

            {
                this.f25747b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f25747b.f25779b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f25747b.f14071f.L();
                        return;
                }
            }
        });
        a();
        l5Var.addView(y9Var, gb1.u(130, 130, 49));
        TextView textView = new TextView(context);
        this.f25780c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        f7.V(textView, y6.G6, null);
        textView.setTypeface(AndroidUtilities.bold());
        l5Var.addView(textView, gb1.x(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        f7.V(textView2, y6.f23748y6, null);
        l5Var.addView(textView2, gb1.x(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(o6.f(new float[]{8.0f}, y6.Oh));
        textView3.setTextSize(1, 14.0f);
        f7.V(textView3, y6.Sh, null);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ig.i f25747b;

            {
                this.f25747b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f25747b.f25779b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f25747b.f14071f.L();
                        return;
                }
            }
        });
        l5Var.addView(textView3, gb1.x(-1, -2, 49, 0, 18, 0, 0));
        addView(l5Var, gb1.r(-1, -2));
        set(null);
    }
}
