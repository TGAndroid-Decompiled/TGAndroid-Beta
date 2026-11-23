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
import hi.z4;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
public final class t extends FrameLayout {
    public final n5 f18572a;
    public final xh.l f18573b;
    public final n5 f18574c;
    public final i6 d;
    public boolean f18575e;
    public TL_account.TL_businessChatLink f18576f;

    public t(Context context, i6 i6Var) {
        super(context);
        int i7;
        int i10;
        this.d = i6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232205);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i11 = n6.Fi;
        ShapeDrawable L2 = n6.L(L, n6.x0(null, i11, false));
        q6 M = u6.M(i11);
        imageView.setBackground(L2);
        u6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new z4(this, 8));
        addView(imageView, na.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.f18572a = n5Var;
        n5Var.setTextSize(15);
        u6.X(n5Var, n6.G6, null);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        addView(n5Var, na.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.f18574c = n5Var2;
        n5Var2.setTextSize(14);
        int i12 = n6.f29862z6;
        u6.X(n5Var2, i12, null);
        if (gd.f24314a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        n5Var2.setGravity(i10);
        addView(n5Var2, na.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.f18573b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        u6.U(lVar, i12, i6Var);
        lVar.setGravity(gd.f24314a0 ? 5 : 3);
        lVar.f60728r = false;
        lVar.setUseAlphaForEmoji(false);
        ks.i(lVar);
        addView(lVar, na.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f18575e) {
            Paint W0 = n6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = n6.f29574k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (gd.f24314a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24314a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = gd.f24314a0;
        n5 n5Var = this.f18574c;
        n5 n5Var2 = this.f18572a;
        if (z11) {
            n5Var2.setPadding(n5Var.getTextWidth(), 0, 0, 0);
        } else {
            n5Var2.setPadding(0, 0, n5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f18575e ? 1 : 0), 1073741824));
    }
}
