package mh;

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
import b2.n0;
import bi.o;
import hg.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.es;
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
    public int f15581a1;
    public int f15582b1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.T0 = paint;
        this.f15581a1 = Integer.MIN_VALUE;
        this.f15582b1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new a0(1, true, 1));
        i(new o(2));
        e eVar = new e(this);
        this.S0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f44872m = false;
        fVar.C = false;
        fVar.o(es.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f7 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f7 = Math.min(f7, childAt.getY());
            }
        }
        return f7;
    }

    public final void C0(int i10, TLRPC.InputGroupCall inputGroupCall) {
        int i11;
        e eVar = this.S0;
        if (eVar.d && (i11 = eVar.e) != -1 && eVar.f15580f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(eVar.f15580f.f18933id, eVar);
        }
        eVar.e = i10;
        eVar.f15580f = inputGroupCall;
        if (eVar.d) {
            eVar.f15579c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f15580f.f18933id);
            eVar.l();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(eVar.f15580f.f18933id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.Z0;
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = measuredHeight + dp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f7 = i10;
        if (f7 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f10 = measuredHeight;
        float f11 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f10, f11, f7, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i10);
        this.f15581a1 = measuredHeight;
        this.f15582b1 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f10);
        canvas.drawRect(0.0f, 0.0f, f11, dp, this.T0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i10, measuredWidth, measuredHeight2);
        this.f15581a1 = i10;
        this.f15582b1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.f15581a1 = Integer.MIN_VALUE;
        this.f15582b1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (y3 < getMeasuredHeight() - this.Z0) {
                return false;
            }
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if (childAt instanceof c) {
                        c cVar = (c) childAt;
                        if (cVar.getVisibility() == 0) {
                            float x11 = x10 - childAt.getX();
                            float y10 = y3 - childAt.getY();
                            n0 n0Var = cVar.f15576w;
                            if (n0Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) n0Var.f2226c).contains(x11, y10);
                            }
                            if (contains) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i10++;
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
        if (this.f15581a1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.f15581a1) {
            return true;
        }
        if (this.f15582b1 != Integer.MIN_VALUE && view.getY() > this.f15582b1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.S0;
        eVar.d = true;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f15580f != null) {
            eVar.f15579c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f15580f.f18933id);
            eVar.l();
            GroupCallMessagesController.getInstance(eVar.e).subscribeToCallMessages(eVar.f15580f.f18933id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.S0;
        eVar.d = false;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f15580f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f15580f.f18933id, eVar);
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
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i10) {
        if (this.Z0 != i10) {
            this.Z0 = i10;
            invalidate();
        }
    }
}
