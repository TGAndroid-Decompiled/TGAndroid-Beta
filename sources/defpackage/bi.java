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
public final class bi extends LinearLayout {
    public final byte a = 0;
    public boolean b;
    public final View c;
    public final View d;

    public bi(Context context, wjb wjbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, nme.o(-2, -2));
        zkb.X(textView, bkb.y6, wjbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(gl.L(40.0f), 0, gl.L(40.0f), gl.L(128.0f));
        addView(textView, nme.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 3;
        switch (this.a) {
            case 0:
                ai aiVar = (ai) this.d;
                yh yhVar = (yh) this.c;
                this.b = true;
                Point point = gl.q;
                if (point.x <= point.y) {
                    i3 = 5;
                }
                yhVar.setItemCount(i3);
                aiVar.setItemCount(i3);
                yhVar.getLayoutParams().height = gl.L(42.0f) * i3;
                aiVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.b = true;
                if (gl.O1()) {
                    ((TextView) this.c).setPadding(gl.L(40.0f), 0, gl.L(40.0f), gl.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.c).setPadding(gl.L(40.0f), 0, gl.L(40.0f), gl.L(128.0f));
                } else {
                    ((TextView) this.c).setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
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

    public bi(Activity activity, yh yhVar, ai aiVar) {
        super(activity);
        this.c = yhVar;
        this.d = aiVar;
        this.b = false;
    }
}
