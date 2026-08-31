package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.pr;
public final class d extends FrameLayout implements xd.b, b6 {
    public ShapeDrawable f1986a;
    public final g6 f1987b;
    public final d8 f1988c;
    public final TextView d;
    public final xd.a f1989e;

    public d(Context context, g6 g6Var) {
        super(context);
        this.f1989e = new xd.a(0, this, pr.h, 380L, false);
        this.f1987b = g6Var;
        d8 d8Var = new d8(context, g6Var, false);
        this.f1988c = d8Var;
        addView(d8Var, c6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, c6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ShapeDrawable shapeDrawable = this.f1986a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 && this.f1986a == null) {
            this.f1986a = k6.b0(AndroidUtilities.dp(10.0f), i0.a.k(k6.v0(k6.Wk, this.f1987b), 25));
        }
        xd.a aVar = this.f1989e;
        if (aVar.f50505f == z4 && !z10) {
            return;
        }
        aVar.a(z4, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f1986a;
        if (shapeDrawable != null) {
            xd.a aVar = this.f1989e;
            if (aVar.f50504e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.f1986a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.f50504e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f1986a;
        g6 g6Var = this.f1987b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = k6.b0(AndroidUtilities.dp(10.0f), i0.a.k(k6.v0(k6.Wk, g6Var), 25));
            this.f1986a = b02;
            b02.setAlpha((int) (this.f1989e.f50504e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(k6.v0(k6.Wk, g6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f1989e.f50505f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f1988c.d(document, null, null, null, false, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
