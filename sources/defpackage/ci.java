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
public final class ci extends LinearLayout {
    public final byte a = 0;
    public boolean b;
    public final View c;
    public final View d;

    public ci(Context context, vnb vnbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, tre.o(-2, -2));
        yob.X(textView, aob.z6, vnbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
        addView(textView, tre.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 3;
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                zh zhVar = (zh) this.c;
                this.b = true;
                Point point = hl.q;
                if (point.x <= point.y) {
                    i3 = 5;
                }
                zhVar.setItemCount(i3);
                biVar.setItemCount(i3);
                zhVar.getLayoutParams().height = hl.L(42.0f) * i3;
                biVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (hl.O1()) {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), hl.L(128.0f));
                } else {
                    ((TextView) this.c).setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
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

    public ci(Activity activity, zh zhVar, bi biVar) {
        super(activity);
        this.c = zhVar;
        this.d = biVar;
        this.b = false;
    }
}
