package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class da5 extends RecyclerView {
    public final aa5 T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public ca5 Y0;
    public s95 Z0;
    public int a1;
    public int b1;
    public int c1;

    public da5(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.b1 = Integer.MIN_VALUE;
        this.c1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new as((byte) 7, 1, true));
        i(new br1((byte) 7));
        aa5 aa5Var = new aa5(this);
        this.T0 = aa5Var;
        setAdapter(aa5Var);
        ba5 ba5Var = new ba5(this);
        ba5Var.m = false;
        ba5Var.C = false;
        ba5Var.o(k43.h);
        ba5Var.n(320L);
        setItemAnimator(ba5Var);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                f = Math.min(f, childAt.getY());
            }
        }
        return f;
    }

    public final void F0(int i, TLRPC.InputGroupCall inputGroupCall) {
        int i2;
        aa5 aa5Var = this.T0;
        if (aa5Var.d && (i2 = aa5Var.e) != -1 && aa5Var.f != null) {
            GroupCallMessagesController.getInstance(i2).unsubscribeFromCallMessages(aa5Var.f.id, aa5Var);
        }
        aa5Var.e = i;
        aa5Var.f = inputGroupCall;
        if (aa5Var.d) {
            aa5Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(aa5Var.f.id);
            aa5Var.f();
            GroupCallMessagesController.getInstance(i).subscribeToCallMessages(aa5Var.f.id, aa5Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.a1;
        int L = hl.L(16.0f);
        int i = measuredHeight + L;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f = i;
        if (f < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f2 = measuredHeight;
        float f3 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f2, f3, f, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i);
        this.b1 = measuredHeight;
        this.c1 = i;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f2);
        canvas.drawRect(0.0f, 0.0f, f3, L, this.U0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i, measuredWidth, measuredHeight2);
        this.b1 = i;
        this.c1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.b1 = Integer.MIN_VALUE;
        this.c1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (y >= getMeasuredHeight() - this.a1) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof v95) {
                        v95 v95Var = (v95) childAt;
                        if (v95Var.getVisibility() == 0) {
                            float x2 = x - childAt.getX();
                            float y2 = y - childAt.getY();
                            t95 t95Var = v95Var.x;
                            if (t95Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) t95Var.c).contains(x2, y2);
                            }
                            if (!contains) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.b1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.b1) {
            return true;
        }
        if (this.c1 != Integer.MIN_VALUE && view.getY() > this.c1) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aa5 aa5Var = this.T0;
        aa5Var.d = true;
        int i = aa5Var.e;
        if (i != -1 && aa5Var.f != null) {
            aa5Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(aa5Var.f.id);
            aa5Var.f();
            GroupCallMessagesController.getInstance(aa5Var.e).subscribeToCallMessages(aa5Var.f.id, aa5Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aa5 aa5Var = this.T0;
        aa5Var.d = false;
        int i = aa5Var.e;
        if (i != -1 && aa5Var.f != null) {
            GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(aa5Var.f.id, aa5Var);
        }
    }

    public void setBlurRoot(View view) {
        this.X0 = view;
    }

    public void setClickCellDelegate(s95 s95Var) {
        this.Z0 = s95Var;
    }

    public void setDelegate(ca5 ca5Var) {
        this.Y0 = ca5Var;
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            invalidate();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i) {
        if (this.a1 != i) {
            this.a1 = i;
            invalidate();
        }
    }
}
