package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pq1 implements View.OnTouchListener {
    public View a;
    public n8 b;
    public final Rect c = new Rect();
    public boolean d;
    public boolean e;
    public final ru4 f;
    public final int[] h;
    public View n;
    public float r;
    public float s;
    public final ImageView w;
    public final zu1 x;

    public pq1(zu1 zu1Var, ImageView imageView) {
        this.x = zu1Var;
        this.w = imageView;
        ru4 ru4Var = new ru4((Context) null, new kj4(this, (byte) 13));
        this.f = ru4Var;
        this.h = new int[2];
        ru4Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.a = view;
        if (motionEvent.getAction() == 0) {
            this.r = motionEvent.getX();
            this.s = motionEvent.getY();
            this.e = false;
        }
        this.f.a(motionEvent);
        if (this.b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x = motionEvent.getX() + iArr[0];
            float y = motionEvent.getY() + iArr[1];
            this.b.getContentView().getLocationOnScreen(iArr);
            float f = x - iArr[0];
            float f2 = y - iArr[1];
            this.n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b.getContentView();
            for (int i = 0; i < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                Rect rect = this.c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f, (int) f2)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f, f2 - childAt.getTop());
                        this.n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.r) > hl.e * 2.0f) || Math.abs(motionEvent.getY() - this.s) > hl.e * 2.0f) {
            this.e = true;
            this.a.setPressed(false);
            this.a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.b == null && (view2 = this.a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
