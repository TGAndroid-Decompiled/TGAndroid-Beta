package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class nx7 extends FrameLayout {
    public final s09 a;

    public nx7(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setOnClickListener(new m67(this, (byte) 7));
        int L = gm.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, gm.L(32.0f), 0, 0);
        setLayoutParams(new g69(-1, -2));
    }
}
