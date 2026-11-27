package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class we5 extends FrameLayout {
    public final int a;
    public final vnb b;
    public ArrayList c;
    public final FrameLayout d;
    public final q9c e;
    public final l9c f;
    public pcc h;

    public we5(int i, vnb vnbVar, Activity activity) {
        super(activity);
        this.a = i;
        this.b = vnbVar;
        q9c q9cVar = new q9c(activity, i, 0, false, new yt4(this, (byte) 10), new ve5(this), new ve5(this), vnbVar);
        this.e = q9cVar;
        q9cVar.setClipToPadding(false);
        l9c l9cVar = (l9c) q9cVar.getAdapter();
        this.f = l9cVar;
        l9cVar.r = false;
        addView(q9cVar, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i2 = aob.m6;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231611);
        frameLayout.addView(imageView, tre.e(56, 56, 49));
        TextView textView = new TextView(activity);
        yob.X(textView, i2, vnbVar);
        textView.setText(ob6.M0(2131749107, null));
        textView.setGravity(17);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, tre.e(210, -2, 17));
        q9cVar.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(pcc pccVar) {
        this.h = pccVar;
    }

    public void setOnScrollListener(v79 v79Var) {
        this.e.j(v79Var);
    }
}
