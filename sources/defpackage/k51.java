package defpackage;

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
import org.telegram.tgnet.tl.TL_account;
public final class k51 extends FrameLayout {
    public final lka a;
    public final xna b;
    public final lka c;
    public final ylb d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public k51(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        this.d = ylbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232206);
        imageView.setPadding(gm.L(9.0f), gm.L(9.0f), gm.L(9.0f), gm.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(36.0f);
        int i3 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.w0(null, i3, false));
        wmb M = anb.M(i3);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, null);
        imageView.setOnClickListener(new j1(this, (byte) 27));
        addView(imageView, qoe.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(15);
        anb.W(lkaVar, cmb.F6, null);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        addView(lkaVar, qoe.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(14);
        int i4 = cmb.y6;
        anb.W(lkaVar2, i4, null);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        lkaVar2.setGravity(i2);
        addView(lkaVar2, qoe.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xna xnaVar = new xna(context);
        this.b = xnaVar;
        xnaVar.setTextSize(1, 13.0f);
        xnaVar.setMaxLines(1);
        xnaVar.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(xnaVar, i4, ylbVar);
        xnaVar.setGravity(jb6.a0 ? 5 : 3);
        xnaVar.r = false;
        xnaVar.setUseAlphaForEmoji(false);
        nm7.i(xnaVar);
        addView(xnaVar, qoe.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = cmb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            float f2 = 64.0f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
            float L = gm.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!jb6.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - gm.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = jb6.a0;
        lka lkaVar = this.c;
        lka lkaVar2 = this.a;
        if (z2) {
            lkaVar2.setPadding(lkaVar.getTextWidth(), 0, 0, 0);
        } else {
            lkaVar2.setPadding(0, 0, lkaVar.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
