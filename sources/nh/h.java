package nh;

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
import di.k;
import e2.j0;
import jg.b0;
import org.telegram.messenger.g0;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class h extends RecyclerView {
    public final e S0;
    public final Paint T0;
    public RenderNode U0;
    public float V0;
    public View W0;
    public g X0;
    public a Y0;
    public int Z0;
    public int f20605a1;
    public int f20606b1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.T0 = paint;
        this.f20605a1 = Integer.MIN_VALUE;
        this.f20606b1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new b0(1, true, 1));
        i(new k(4));
        e eVar = new e(this);
        this.S0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f56954m = false;
        fVar.C = false;
        fVar.o(xq.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void D0(int i7, TLRPC.InputGroupCall inputGroupCall) {
        int i10;
        e eVar = this.S0;
        if (eVar.d && (i10 = eVar.f20603e) != -1 && eVar.f20604f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f20604f.f26969id, eVar);
        }
        eVar.f20603e = i7;
        eVar.f20604f = inputGroupCall;
        if (eVar.d) {
            eVar.f20602c = GroupCallMessagesController.getInstance(i7).getCallMessages(eVar.f20604f.f26969id);
            eVar.f();
            GroupCallMessagesController.getInstance(i7).subscribeToCallMessages(eVar.f20604f.f26969id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.Z0;
        int L = g0.L(16.0f);
        int i7 = measuredHeight + L;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i7;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i7);
        this.f20605a1 = measuredHeight;
        this.f20606b1 = i7;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, L, this.T0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i7, measuredWidth, measuredHeight2);
        this.f20605a1 = i7;
        this.f20606b1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.f20605a1 = Integer.MIN_VALUE;
        this.f20606b1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.Z0) {
                return false;
            }
            int childCount = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = getChildAt(i7);
                    if (childAt instanceof c) {
                        c cVar = (c) childAt;
                        if (cVar.getVisibility() == 0) {
                            float x11 = x10 - childAt.getX();
                            float y11 = y10 - childAt.getY();
                            j0 j0Var = cVar.f20600x;
                            if (j0Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) j0Var.f10290c).contains(x11, y11);
                            }
                            if (contains) {
                                z9 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                } else {
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f20605a1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.f20605a1) {
            return true;
        }
        if (this.f20606b1 != Integer.MIN_VALUE && view.getY() > this.f20606b1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.S0;
        eVar.d = true;
        int i7 = eVar.f20603e;
        if (i7 != -1 && eVar.f20604f != null) {
            eVar.f20602c = GroupCallMessagesController.getInstance(i7).getCallMessages(eVar.f20604f.f26969id);
            eVar.f();
            GroupCallMessagesController.getInstance(eVar.f20603e).subscribeToCallMessages(eVar.f20604f.f26969id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.S0;
        eVar.d = false;
        int i7 = eVar.f20603e;
        if (i7 != -1 && eVar.f20604f != null) {
            GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(eVar.f20604f.f26969id, eVar);
        }
    }

    public void setBlurRoot(View view) {
        this.W0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.Y0 = aVar;
    }

    public void setDelegate(g gVar) {
        this.X0 = gVar;
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            invalidate();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                getChildAt(i7).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i7) {
        if (this.Z0 != i7) {
            this.Z0 = i7;
            invalidate();
        }
    }
}
