package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
public final class vw1 extends ImageView {
    public final byte a;
    public final ChatActivityEnterView b;

    public vw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
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
                if (chatActivityEnterView.y1 < 1.0f) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = chatActivityEnterView.B7;
                    if (uptimeMillis < j) {
                        postInvalidateDelayed(Math.max(1L, j - SystemClock.uptimeMillis()));
                        return;
                    } else if (chatActivityEnterView.y1 > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    } else {
                        super.draw(canvas);
                        return;
                    }
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
                post(new fw1(this.b, (byte) 25));
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
                cx1 cx1Var = chatActivityEnterView.y2;
                if (cx1Var != null) {
                    cx1Var.setTranslationX(cx1Var.a);
                    return;
                }
                return;
            case 2:
                super.setAlpha(f);
                cx1 cx1Var2 = chatActivityEnterView.y2;
                if (cx1Var2 != null) {
                    cx1Var2.setTranslationX(cx1Var2.a);
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
