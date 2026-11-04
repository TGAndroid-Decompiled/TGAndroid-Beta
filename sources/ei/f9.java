package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class f9 extends w {
    public final r9 d;

    public f9(Context context, r9 r9Var) {
        super(context);
        this.d = r9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        r9 r9Var = this.d;
        j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
        s5 s5Var = r9Var.f10960x;
        if (s5Var != null && currentPeerView != null) {
            m3 m3Var = currentPeerView.M0;
            s5Var.setOffset(r9Var.f10923f0);
            if (r9Var.f10960x.f11001f == 1.0f) {
                r9Var.f10939o0.setVisibility(4);
            } else {
                r9Var.f10939o0.setVisibility(0);
            }
            r9Var.f10939o0.B();
            float top = m3Var.getTop() + currentPeerView.getTop();
            float f11 = r9Var.f10960x.f11001f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (m3Var.getMeasuredHeight() > 0) {
                r9Var.f10947r1 = m3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, r9Var.f10960x.f11002n / r9Var.f10947r1, f11);
            r9Var.f10939o0.setPivotY(top);
            r9Var.f10939o0.setPivotX(getMeasuredWidth() / 2.0f);
            r9Var.f10939o0.setScaleX(T1);
            r9Var.f10939o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (r9Var.f10923f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f11, T1, r9Var.f10960x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f10467i1.f4734b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / f10, r9Var.f10960x.f11001f);
            m3Var.invalidateOutline();
            r9Var.f10939o0.setTranslationY((r9Var.f10960x.f10998b - top) * f11);
        }
        if (currentPeerView != null) {
            r9Var.f10921e1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - r9Var.f10921e1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        r9 r9Var = this.d;
        if (!r9Var.f10911b || r9Var.f10914c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = org.telegram.messenger.g0.f22602m;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            r9Var.h(i12);
            size += r9Var.f10943q0;
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            r9Var.f10939o0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            r9Var.f10939o0.getLayoutParams().width = i14;
            size2 = i14;
        }
        r9Var.f10965z0.getLayoutParams().height = size + 1;
        r9Var.f10965z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) r9Var.f10965z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m;
        super.onMeasure(i3, i10);
    }
}
