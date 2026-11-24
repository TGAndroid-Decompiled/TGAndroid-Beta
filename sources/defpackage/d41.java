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
public final class d41 extends FrameLayout {
    public final jia a;
    public final wla b;
    public final jia c;
    public final wjb d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public d41(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        this.d = wjbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232205);
        imageView.setPadding(gl.L(9.0f), gl.L(9.0f), gl.L(9.0f), gl.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(36.0f);
        int i3 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i3, false));
        vkb M = zkb.M(i3);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, null);
        imageView.setOnClickListener(new j1(this, (byte) 24));
        addView(imageView, nme.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(15);
        zkb.W(jiaVar, bkb.F6, null);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        addView(jiaVar, nme.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        int i4 = bkb.y6;
        zkb.W(jiaVar2, i4, null);
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        jiaVar2.setGravity(i2);
        addView(jiaVar2, nme.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        wla wlaVar = new wla(context);
        this.b = wlaVar;
        wlaVar.setTextSize(1, 13.0f);
        wlaVar.setMaxLines(1);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(wlaVar, i4, wjbVar);
        wlaVar.setGravity(k96.a0 ? 5 : 3);
        wlaVar.r = false;
        wlaVar.setUseAlphaForEmoji(false);
        kk7.i(wlaVar);
        addView(wlaVar, nme.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = bkb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            Paint paint = U0;
            float f2 = 64.0f;
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 64.0f;
            }
            float L = gl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!k96.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - gl.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = k96.a0;
        jia jiaVar = this.c;
        jia jiaVar2 = this.a;
        if (z2) {
            jiaVar2.setPadding(jiaVar.getTextWidth(), 0, 0, 0);
        } else {
            jiaVar2.setPadding(0, 0, jiaVar.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
