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
import c8.ja;
import hi.p5;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
public final class t extends FrameLayout {
    public final j5 f18098a;
    public final xh.l f18099b;
    public final j5 f18100c;
    public final e6 d;
    public boolean f18101e;
    public TL_account.TL_businessChatLink f18102f;

    public t(Context context, e6 e6Var) {
        super(context);
        int i7;
        int i10;
        this.d = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232201);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i11 = j6.Fi;
        ShapeDrawable L2 = j6.L(L, j6.x0(null, i11, false));
        m6 M = q6.M(i11);
        imageView.setBackground(L2);
        q6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new p5(this, 7));
        addView(imageView, ja.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f18098a = j5Var;
        j5Var.setTextSize(15);
        q6.X(j5Var, j6.G6, null);
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j5Var.setGravity(i7);
        addView(j5Var, ja.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.f18100c = j5Var2;
        j5Var2.setTextSize(14);
        int i12 = j6.f29260z6;
        q6.X(j5Var2, i12, null);
        if (hd.f24101a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10);
        addView(j5Var2, ja.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.f18099b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(lVar, i12, e6Var);
        lVar.setGravity(hd.f24101a0 ? 5 : 3);
        lVar.f60034r = false;
        lVar.setUseAlphaForEmoji(false);
        ns.i(lVar);
        addView(lVar, ja.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f18101e) {
            Paint W0 = j6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = j6.f28972k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (hd.f24101a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f24101a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = hd.f24101a0;
        j5 j5Var = this.f18100c;
        j5 j5Var2 = this.f18098a;
        if (z11) {
            j5Var2.setPadding(j5Var.getTextWidth(), 0, 0, 0);
        } else {
            j5Var2.setPadding(0, 0, j5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f18101e ? 1 : 0), 1073741824));
    }
}
