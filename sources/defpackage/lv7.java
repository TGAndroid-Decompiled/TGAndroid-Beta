package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class lv7 extends FrameLayout {
    public final ry8 a;

    public lv7(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setOnClickListener(new fr7(this, (byte) 4));
        int L = gl.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, gl.L(32.0f), 0, 0);
        setLayoutParams(new e49(-1, -2));
    }
}
