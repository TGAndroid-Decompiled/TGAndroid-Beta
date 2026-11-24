package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
public final class tx1 extends ImageView {
    public final byte a;
    public final ChatActivityEnterView b;

    public tx1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (getAlpha() >= 0.5f && this.b.y1 <= 0.0f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                float f = chatActivityEnterView.y1;
                if (f < 1.0f) {
                    if (f > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                    super.draw(canvas);
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                post(new gx1(this.b, (byte) 17));
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setAlpha(float f) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 1:
                super.setAlpha(f);
                cy1 cy1Var = chatActivityEnterView.z2;
                if (cy1Var != null) {
                    cy1Var.setTranslationX(cy1Var.a);
                    return;
                }
                return;
            case 2:
                super.setAlpha(f);
                cy1 cy1Var2 = chatActivityEnterView.z2;
                if (cy1Var2 != null) {
                    cy1Var2.setTranslationX(cy1Var2.a);
                    return;
                }
                return;
            case 3:
                super.setAlpha(f);
                a aVar = chatActivityEnterView.a1;
                if (aVar != null) {
                    aVar.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                a aVar = this.b.a1;
                if (aVar != null) {
                    aVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
