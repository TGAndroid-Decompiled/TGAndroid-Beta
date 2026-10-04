package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.tr;
import w7.z5;
import yf.p;
public final class c extends FrameLayout implements le.d, y5 {
    public ShapeDrawable f16902a;
    public final d6 f16903b;
    public final f8 f16904c;
    public final TextView d;
    public final le.b f16905e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.f16905e = new le.b(0, this, tr.h, 380L, false);
        this.f16903b = d6Var;
        f8 f8Var = new f8(context, d6Var, false);
        this.f16904c = f8Var;
        addView(f8Var, z5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f16902a == null) {
            this.f16902a = i6.b0(AndroidUtilities.dp(10.0f), i0.a.k(i6.v0(i6.Wk, this.f16903b), 25));
        }
        le.b bVar = this.f16905e;
        if (bVar.f15436f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void a0(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f16902a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f16902a;
        if (shapeDrawable != null) {
            le.b bVar = this.f16905e;
            if (bVar.f15435e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f16902a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.f15435e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f16902a;
        d6 d6Var = this.f16903b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = i6.b0(AndroidUtilities.dp(10.0f), i0.a.k(i6.v0(i6.Wk, d6Var), 25));
            this.f16902a = b02;
            b02.setAlpha((int) (this.f16905e.f15435e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(i6.v0(i6.Wk, d6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f16905e.f15436f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f16904c.d(document, null, null, null, false, false);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
