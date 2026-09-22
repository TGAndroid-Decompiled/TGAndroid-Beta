package lh;

import ai.t;
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
import b2.i0;
import gg.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qr;
import org.telegram.ui.LaunchActivity;
public final class h extends RecyclerView {
    public final e U0;
    public final Paint V0;
    public RenderNode W0;
    public float X0;
    public View Y0;
    public g Z0;
    public a f14120a1;
    public int f14121b1;
    public int f14122c1;
    public int f14123d1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.V0 = paint;
        this.f14122c1 = Integer.MIN_VALUE;
        this.f14123d1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new b0(1, true, 1));
        i(new t(2));
        e eVar = new e(this);
        this.U0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f42706m = false;
        fVar.C = false;
        fVar.o(qr.h);
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
        e eVar = this.U0;
        if (eVar.d && (i11 = eVar.e) != -1 && eVar.f14119f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(eVar.f14119f.f18126id, eVar);
        }
        eVar.e = i10;
        eVar.f14119f = inputGroupCall;
        if (eVar.d) {
            eVar.f14118c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f14119f.f18126id);
            eVar.l();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(eVar.f14119f.f18126id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.f14121b1;
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
        this.f14122c1 = measuredHeight;
        this.f14123d1 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f10);
        canvas.drawRect(0.0f, 0.0f, f11, dp, this.V0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i10, measuredWidth, measuredHeight2);
        this.f14122c1 = i10;
        this.f14123d1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.f14122c1 = Integer.MIN_VALUE;
        this.f14123d1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (y3 < getMeasuredHeight() - this.f14121b1) {
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
                            i0 i0Var = cVar.f14115w;
                            if (i0Var == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) i0Var.f3019c).contains(x11, y10);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f14122c1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.f14122c1) {
            return true;
        }
        if (this.f14123d1 != Integer.MIN_VALUE && view.getY() > this.f14123d1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.U0;
        eVar.d = true;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f14119f != null) {
            eVar.f14118c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f14119f.f18126id);
            eVar.l();
            GroupCallMessagesController.getInstance(eVar.e).subscribeToCallMessages(eVar.f14119f.f18126id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.U0;
        eVar.d = false;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f14119f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f14119f.f18126id, eVar);
        }
    }

    public void setBlurRoot(View view) {
        this.Y0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.f14120a1 = aVar;
    }

    public void setDelegate(g gVar) {
        this.Z0 = gVar;
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
        if (this.f14121b1 != i10) {
            this.f14121b1 = i10;
            invalidate();
        }
    }
}
