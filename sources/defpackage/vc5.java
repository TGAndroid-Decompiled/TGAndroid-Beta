package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class vc5 extends FrameLayout {
    public final int a;
    public final wjb b;
    public ArrayList c;
    public final FrameLayout d;
    public final q5c e;
    public final l5c f;
    public p8c h;

    public vc5(int i, wjb wjbVar, Activity activity) {
        super(activity);
        this.a = i;
        this.b = wjbVar;
        q5c q5cVar = new q5c(activity, i, 0, false, new ur4(this, (byte) 10), new uc5(this), new uc5(this), wjbVar);
        this.e = q5cVar;
        q5cVar.setClipToPadding(false);
        l5c l5cVar = (l5c) q5cVar.getAdapter();
        this.f = l5cVar;
        l5cVar.r = false;
        addView(q5cVar, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i2 = bkb.l6;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231611);
        frameLayout.addView(imageView, nme.e(56, 56, 49));
        TextView textView = new TextView(activity);
        zkb.X(textView, i2, wjbVar);
        textView.setText(k96.M0(2131749161, null));
        textView.setGravity(17);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, nme.e(210, -2, 17));
        q5cVar.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(p8c p8cVar) {
        this.h = p8cVar;
    }

    public void setOnScrollListener(i49 i49Var) {
        this.e.j(i49Var);
    }
}
