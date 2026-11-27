package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class h79 extends vic {
    public final wka W;
    public boolean a0;
    public View b0;
    public View c0;

    public h79(Context context, vnb vnbVar, wka wkaVar) {
        super(context, vnbVar);
        this.W = wkaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void B(int i) {
        wka wkaVar = this.W;
        wkaVar.g("PAGER_TAB_END");
        wkaVar.s();
    }

    @Override
    public final boolean C(MotionEvent motionEvent) {
        boolean z = this.I;
        boolean C = super.C(motionEvent);
        if (z && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                wka wkaVar = this.W;
                wkaVar.g("PAGER_DRAG_ABORTED");
                wkaVar.s();
            }
        }
        return C;
    }

    @Override
    public final void G(View view, float f) {
        if (view.getTranslationX() == f) {
            return;
        }
        super.G(view, f);
        invalidate();
    }

    public final void M(View view) {
        this.b0 = null;
        this.c0 = null;
        wka wkaVar = this.W;
        wkaVar.f("PAGE_BOUND", view, 0, 0, true);
        if (wkaVar.P == null) {
            return;
        }
        if (wkaVar.e0) {
            wkaVar.i("page_bound");
        }
        RecyclerView h = wkaVar.P.h(view);
        wkaVar.b(h);
        wkaVar.P.o(h);
        wkaVar.s();
    }

    public final void N(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            wka wkaVar = this.W;
            boolean o = wkaVar.o(x, y);
            this.a0 = o;
            if (o) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            wkaVar.g(str);
        }
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        if (!this.a0 && this.W.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int save = canvas.save();
        float x = view.getX();
        wka wkaVar = this.W;
        canvas.clipRect(x, -wkaVar.getTopBleed(), view.getX() + view.getWidth(), wkaVar.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        N(motionEvent);
        if (!this.a0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        wka wkaVar = this.W;
        if (motionEvent == null) {
            wkaVar.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return C(null);
        }
        N(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            wkaVar.g(str);
        }
        if (this.a0 || !C(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void v() {
        wka wkaVar = this.W;
        wkaVar.g("PAGER_SCROLL_END");
        wkaVar.s();
    }

    @Override
    public final void w() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override
    public final void x(boolean z) {
        this.W.s();
    }
}
