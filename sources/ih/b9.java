package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends v {
    public final m9 d;

    public b9(Context context, m9 m9Var) {
        super(context);
        this.d = m9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        m9 m9Var = this.d;
        i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
        o5 o5Var = m9Var.f11830w;
        if (o5Var != null && currentPeerView != null) {
            l3 l3Var = currentPeerView.Y0;
            o5Var.setOffset(m9Var.f11784a0);
            if (m9Var.f11830w.f11894f == 1.0f) {
                m9Var.f11806j0.setVisibility(4);
            } else {
                m9Var.f11806j0.setVisibility(0);
            }
            m9Var.f11806j0.B();
            float top = l3Var.getTop() + currentPeerView.getTop();
            float f11 = m9Var.f11830w.f11894f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (l3Var.getMeasuredHeight() > 0) {
                m9Var.f11811m1 = l3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, m9Var.f11830w.f11895n / m9Var.f11811m1, f11);
            m9Var.f11806j0.setPivotY(top);
            m9Var.f11806j0.setPivotX(getMeasuredWidth() / 2.0f);
            m9Var.f11806j0.setScaleX(lerp);
            m9Var.f11806j0.setScaleY(lerp);
            currentPeerView.R2 = true;
            if (m9Var.f11784a0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f11, lerp, m9Var.f11830w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f11592u1.f6248b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f10, m9Var.f11830w.f11894f);
            l3Var.invalidateOutline();
            m9Var.f11806j0.setTranslationY((m9Var.f11830w.f11891b - top) * f11);
        }
        if (currentPeerView != null) {
            m9Var.Z0.setTranslationY(((currentPeerView.Y0.getY() + currentPeerView.getY()) - m9Var.Z0.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        m9 m9Var = this.d;
        if (!m9Var.f11786b || m9Var.f11789c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            m9Var.setKeyboardHeightFromParent(i12);
            size += m9Var.f11810l0;
        }
        int size2 = View.MeasureSpec.getSize(i9);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            m9Var.f11806j0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            m9Var.f11806j0.getLayoutParams().width = i14;
            size2 = i14;
        }
        m9Var.f11828u0.getLayoutParams().height = size + 1;
        m9Var.f11828u0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) m9Var.f11828u0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i9, i10);
    }
}
