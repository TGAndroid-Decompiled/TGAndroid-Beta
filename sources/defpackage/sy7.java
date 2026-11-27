package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class sy7 extends FrameLayout {
    public final e29 a;

    public sy7(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setOnClickListener(new am7(this, (byte) 6));
        int L = hl.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, hl.L(32.0f), 0, 0);
        setLayoutParams(new r79(-1, -2));
    }
}
