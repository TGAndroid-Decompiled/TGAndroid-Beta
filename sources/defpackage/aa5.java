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
public final class aa5 extends RecyclerView {
    public final x95 T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public z95 Y0;
    public p95 Z0;
    public int a1;
    public int b1;
    public int c1;

    public aa5(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.b1 = Integer.MIN_VALUE;
        this.c1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new zs((byte) 7, 1, true));
        i(new as1((byte) 7));
        x95 x95Var = new x95(this);
        this.T0 = x95Var;
        setAdapter(x95Var);
        y95 y95Var = new y95(this);
        y95Var.m = false;
        y95Var.C = false;
        y95Var.o(d53.h);
        y95Var.n(320L);
        setItemAnimator(y95Var);
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

    public final void E0(int i, TLRPC.InputGroupCall inputGroupCall) {
        int i2;
        x95 x95Var = this.T0;
        if (x95Var.d && (i2 = x95Var.e) != -1 && x95Var.f != null) {
            GroupCallMessagesController.getInstance(i2).unsubscribeFromCallMessages(x95Var.f.id, x95Var);
        }
        x95Var.e = i;
        x95Var.f = inputGroupCall;
        if (x95Var.d) {
            x95Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(x95Var.f.id);
            x95Var.f();
            GroupCallMessagesController.getInstance(i).subscribeToCallMessages(x95Var.f.id, x95Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.a1;
        int L = gm.L(16.0f);
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
                    if (childAt instanceof s95) {
                        s95 s95Var = (s95) childAt;
                        if (s95Var.getVisibility() == 0) {
                            float x2 = x - childAt.getX();
                            float y2 = y - childAt.getY();
                            q95 q95Var = s95Var.x;
                            if (q95Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) q95Var.c).contains(x2, y2);
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
        x95 x95Var = this.T0;
        x95Var.d = true;
        int i = x95Var.e;
        if (i != -1 && x95Var.f != null) {
            x95Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(x95Var.f.id);
            x95Var.f();
            GroupCallMessagesController.getInstance(x95Var.e).subscribeToCallMessages(x95Var.f.id, x95Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x95 x95Var = this.T0;
        x95Var.d = false;
        int i = x95Var.e;
        if (i != -1 && x95Var.f != null) {
            GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(x95Var.f.id, x95Var);
        }
    }

    public void setBlurRoot(View view) {
        this.X0 = view;
    }

    public void setClickCellDelegate(p95 p95Var) {
        this.Z0 = p95Var;
    }

    public void setDelegate(z95 z95Var) {
        this.Y0 = z95Var;
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
