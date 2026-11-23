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
import e2.j0;
import fi.k;
import jg.b0;
import org.telegram.messenger.g0;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
public final class h extends RecyclerView {
    public final e T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public g Y0;
    public a Z0;
    public int f21536a1;
    public int f21537b1;
    public int f21538c1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.f21537b1 = Integer.MIN_VALUE;
        this.f21538c1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new b0(1, true, 1));
        i(new k(4));
        e eVar = new e(this);
        this.T0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f59139m = false;
        fVar.C = false;
        fVar.o(nr.h);
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
        e eVar = this.T0;
        if (eVar.d && (i10 = eVar.f21534e) != -1 && eVar.f21535f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f21535f.f28415id, eVar);
        }
        eVar.f21534e = i7;
        eVar.f21535f = inputGroupCall;
        if (eVar.d) {
            eVar.f21533c = GroupCallMessagesController.getInstance(i7).getCallMessages(eVar.f21535f.f28415id);
            eVar.f();
            GroupCallMessagesController.getInstance(i7).subscribeToCallMessages(eVar.f21535f.f28415id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.f21536a1;
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
        this.f21537b1 = measuredHeight;
        this.f21538c1 = i7;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, L, this.U0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i7, measuredWidth, measuredHeight2);
        this.f21537b1 = i7;
        this.f21538c1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.f21537b1 = Integer.MIN_VALUE;
        this.f21538c1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.f21536a1) {
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
                            j0 j0Var = cVar.f21531x;
                            if (j0Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) j0Var.f10436c).contains(x11, y11);
                            }
                            if (contains) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f21537b1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.f21537b1) {
            return true;
        }
        if (this.f21538c1 != Integer.MIN_VALUE && view.getY() > this.f21538c1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.T0;
        eVar.d = true;
        int i7 = eVar.f21534e;
        if (i7 != -1 && eVar.f21535f != null) {
            eVar.f21533c = GroupCallMessagesController.getInstance(i7).getCallMessages(eVar.f21535f.f28415id);
            eVar.f();
            GroupCallMessagesController.getInstance(eVar.f21534e).subscribeToCallMessages(eVar.f21535f.f28415id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.T0;
        eVar.d = false;
        int i7 = eVar.f21534e;
        if (i7 != -1 && eVar.f21535f != null) {
            GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(eVar.f21535f.f28415id, eVar);
        }
    }

    public void setBlurRoot(View view) {
        this.X0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.Z0 = aVar;
    }

    public void setDelegate(g gVar) {
        this.Y0 = gVar;
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
        if (this.f21536a1 != i7) {
            this.f21536a1 = i7;
            invalidate();
        }
    }
}
