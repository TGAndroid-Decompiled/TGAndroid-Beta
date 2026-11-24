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
public final class b85 extends RecyclerView {
    public final y75 T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public a85 Y0;
    public q75 Z0;
    public int a1;
    public int b1;
    public int c1;

    public b85(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.b1 = Integer.MIN_VALUE;
        this.c1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new zr((byte) 7, 1, true));
        i(new oq1((byte) 7));
        y75 y75Var = new y75(this);
        this.T0 = y75Var;
        setAdapter(y75Var);
        z75 z75Var = new z75(this);
        z75Var.m = false;
        z75Var.C = false;
        z75Var.o(s33.h);
        z75Var.n(320L);
        setItemAnimator(z75Var);
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
        y75 y75Var = this.T0;
        if (y75Var.d && (i2 = y75Var.e) != -1 && y75Var.f != null) {
            GroupCallMessagesController.getInstance(i2).unsubscribeFromCallMessages(y75Var.f.id, y75Var);
        }
        y75Var.e = i;
        y75Var.f = inputGroupCall;
        if (y75Var.d) {
            y75Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(y75Var.f.id);
            y75Var.f();
            GroupCallMessagesController.getInstance(i).subscribeToCallMessages(y75Var.f.id, y75Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.a1;
        int L = gl.L(16.0f);
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
                    if (childAt instanceof t75) {
                        t75 t75Var = (t75) childAt;
                        if (t75Var.getVisibility() == 0) {
                            float x2 = x - childAt.getX();
                            float y2 = y - childAt.getY();
                            r75 r75Var = t75Var.x;
                            if (r75Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) r75Var.c).contains(x2, y2);
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
        y75 y75Var = this.T0;
        y75Var.d = true;
        int i = y75Var.e;
        if (i != -1 && y75Var.f != null) {
            y75Var.c = GroupCallMessagesController.getInstance(i).getCallMessages(y75Var.f.id);
            y75Var.f();
            GroupCallMessagesController.getInstance(y75Var.e).subscribeToCallMessages(y75Var.f.id, y75Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y75 y75Var = this.T0;
        y75Var.d = false;
        int i = y75Var.e;
        if (i != -1 && y75Var.f != null) {
            GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(y75Var.f.id, y75Var);
        }
    }

    public void setBlurRoot(View view) {
        this.X0 = view;
    }

    public void setClickCellDelegate(q75 q75Var) {
        this.Z0 = q75Var;
    }

    public void setDelegate(a85 a85Var) {
        this.Y0 = a85Var;
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
