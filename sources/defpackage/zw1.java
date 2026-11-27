package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zw1 extends iz1 {
    public final Rect G;
    public final ChatActivityEnterView H;

    public zw1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.j0()) {
            if (chatActivityEnterView.p1 == null) {
                Drawable mutate = getResources().getDrawable(2131231504).mutate();
                chatActivityEnterView.p1 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = hl.L(12.0f);
            chatActivityEnterView.p1.setBounds(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
            chatActivityEnterView.p1.draw(canvas);
        } else if (chatActivityEnterView.b1) {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Rect rect = this.G;
            rect.set(0, 0, measuredWidth2, measuredHeight2);
            rect.inset(hl.L(7.5f), hl.L(7.5f));
            if (getCurrentState() == gz1.b) {
                drawable = chatActivityEnterView.C4;
            } else {
                drawable = chatActivityEnterView.B4;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
