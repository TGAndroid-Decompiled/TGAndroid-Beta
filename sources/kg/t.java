package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import hi.p4;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class t extends FrameLayout {
    public final m5 f18453a;
    public final xh.l f18454b;
    public final m5 f18455c;
    public final h6 d;
    public boolean f18456e;
    public TL_account.TL_businessChatLink f18457f;

    public t(Context context, h6 h6Var) {
        super(context);
        int i7;
        int i10;
        this.d = h6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232202);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i11 = m6.Fi;
        ShapeDrawable L2 = m6.L(L, m6.x0(null, i11, false));
        p6 M = t6.M(i11);
        imageView.setBackground(L2);
        t6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new p4(this, 8));
        addView(imageView, na.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.f18453a = m5Var;
        m5Var.setTextSize(15);
        t6.X(m5Var, m6.G6, null);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        addView(m5Var, na.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        m5 m5Var2 = new m5(context);
        this.f18455c = m5Var2;
        m5Var2.setTextSize(14);
        int i12 = m6.f29758z6;
        t6.X(m5Var2, i12, null);
        if (hd.f24408a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        m5Var2.setGravity(i10);
        addView(m5Var2, na.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.f18454b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        t6.U(lVar, i12, h6Var);
        lVar.setGravity(hd.f24408a0 ? 5 : 3);
        lVar.f60610r = false;
        lVar.setUseAlphaForEmoji(false);
        ls.i(lVar);
        addView(lVar, na.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f18456e) {
            Paint W0 = m6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = m6.f29470k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (hd.f24408a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f24408a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = hd.f24408a0;
        m5 m5Var = this.f18455c;
        m5 m5Var2 = this.f18453a;
        if (z11) {
            m5Var2.setPadding(m5Var.getTextWidth(), 0, 0, 0);
        } else {
            m5Var2.setPadding(0, 0, m5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f18456e ? 1 : 0), 1073741824));
    }
}
