package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.rr;
import w7.y5;
import yf.p;
public final class c extends FrameLayout implements e, x5 {
    public ShapeDrawable f15460a;
    public final d6 f15461b;
    public final f8 f15462c;
    public final TextView d;
    public final le.c e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.e = new le.c(0, this, rr.h, 380L, false);
        this.f15461b = d6Var;
        f8 f8Var = new f8(context, d6Var, false);
        this.f15462c = f8Var;
        addView(f8Var, y5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        ShapeDrawable shapeDrawable = this.f15460a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f15460a == null) {
            this.f15460a = h6.b0(AndroidUtilities.dp(10.0f), i0.a.k(h6.v0(h6.Wk, this.f15461b), 25));
        }
        le.c cVar = this.e;
        if (cVar.f14201f == z10 && !z11) {
            return;
        }
        cVar.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f15460a;
        if (shapeDrawable != null) {
            le.c cVar = this.e;
            if (cVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f15460a, AndroidUtilities.lerp(0.9f, 1.0f, cVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f15460a;
        d6 d6Var = this.f15461b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = h6.b0(AndroidUtilities.dp(10.0f), i0.a.k(h6.v0(h6.Wk, d6Var), 25));
            this.f15460a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(h6.v0(h6.Wk, d6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.e.f14201f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f15462c.d(document, null, null, null, false, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
