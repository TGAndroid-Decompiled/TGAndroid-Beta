package oh;

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
import d2.l0;
import ei.l;
import kg.y;
import org.telegram.messenger.g0;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class h extends RecyclerView {
    public final e T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public g Y0;
    public a Z0;
    public int f21125a1;
    public int f21126b1;
    public int f21127c1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.f21126b1 = Integer.MIN_VALUE;
        this.f21127c1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new y(1, true, 1));
        i(new l(4));
        e eVar = new e(this);
        this.T0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f55567m = false;
        fVar.C = false;
        fVar.o(xq.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.1474836E9f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void D0(int i3, TLRPC.InputGroupCall inputGroupCall) {
        int i10;
        e eVar = this.T0;
        if (eVar.d && (i10 = eVar.f21123e) != -1 && eVar.f21124f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f21124f.f27018id, eVar);
        }
        eVar.f21123e = i3;
        eVar.f21124f = inputGroupCall;
        if (eVar.d) {
            eVar.f21122c = GroupCallMessagesController.getInstance(i3).getCallMessages(eVar.f21124f.f27018id);
            eVar.f();
            GroupCallMessagesController.getInstance(i3).subscribeToCallMessages(eVar.f21124f.f27018id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.f21125a1;
        int L = g0.L(16.0f);
        int i3 = measuredHeight + L;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i3;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i3);
        this.f21126b1 = measuredHeight;
        this.f21127c1 = i3;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, L, this.U0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i3, measuredWidth, measuredHeight2);
        this.f21126b1 = i3;
        this.f21127c1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.f21126b1 = Integer.MIN_VALUE;
        this.f21127c1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (y9 < getMeasuredHeight() - this.f21125a1) {
                return false;
            }
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof c) {
                        c cVar = (c) childAt;
                        if (cVar.getVisibility() == 0) {
                            float x11 = x10 - childAt.getX();
                            float y10 = y9 - childAt.getY();
                            l0 l0Var = cVar.f21120x;
                            if (l0Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) l0Var.f8175c).contains(x11, y10);
                            }
                            if (contains) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3++;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f21126b1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.f21126b1) {
            return true;
        }
        if (this.f21127c1 != Integer.MIN_VALUE && view.getY() > this.f21127c1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.T0;
        eVar.d = true;
        int i3 = eVar.f21123e;
        if (i3 != -1 && eVar.f21124f != null) {
            eVar.f21122c = GroupCallMessagesController.getInstance(i3).getCallMessages(eVar.f21124f.f27018id);
            eVar.f();
            GroupCallMessagesController.getInstance(eVar.f21123e).subscribeToCallMessages(eVar.f21124f.f27018id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.T0;
        eVar.d = false;
        int i3 = eVar.f21123e;
        if (i3 != -1 && eVar.f21124f != null) {
            GroupCallMessagesController.getInstance(i3).unsubscribeFromCallMessages(eVar.f21124f.f27018id, eVar);
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
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i3) {
        if (this.f21125a1 != i3) {
            this.f21125a1 = i3;
            invalidate();
        }
    }
}
