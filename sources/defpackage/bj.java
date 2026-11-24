package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a;
public final class bj extends LinearLayout {
    public final byte a = 0;
    public boolean b;
    public final View c;
    public final View d;

    public bj(Context context, ylb ylbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, qoe.o(-2, -2));
        anb.X(textView, cmb.y6, ylbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(gm.L(40.0f), 0, gm.L(40.0f), gm.L(128.0f));
        addView(textView, qoe.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 3;
        switch (this.a) {
            case 0:
                aj ajVar = (aj) this.d;
                yi yiVar = (yi) this.c;
                this.b = true;
                Point point = gm.q;
                if (point.x <= point.y) {
                    i3 = 5;
                }
                yiVar.setItemCount(i3);
                ajVar.setItemCount(i3);
                yiVar.getLayoutParams().height = gm.L(42.0f) * i3;
                ajVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (gm.O1()) {
                    ((TextView) this.c).setPadding(gm.L(40.0f), 0, gm.L(40.0f), gm.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.c).setPadding(gm.L(40.0f), 0, gm.L(40.0f), gm.L(128.0f));
                } else {
                    ((TextView) this.c).setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
                }
                this.b = false;
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public bj(Activity activity, yi yiVar, aj ajVar) {
        super(activity);
        this.c = yiVar;
        this.d = ajVar;
        this.b = false;
    }
}
