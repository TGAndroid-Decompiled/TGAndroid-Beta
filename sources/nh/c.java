package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.is;
import yf.p;
public final class c extends FrameLayout implements me.d, x5 {
    public ShapeDrawable f16945a;
    public final d6 f16946b;
    public final f8 f16947c;
    public final TextView d;
    public final me.b f16948e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.f16948e = new me.b(0, this, is.h, 380L, false);
        this.f16946b = d6Var;
        f8 f8Var = new f8(context, d6Var, false);
        this.f16947c = f8Var;
        addView(f8Var, w7.x5.a(45.0f, 0.0f, 8.0f, 0.0f, 0.0f, 45, 49));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 5.0f, -1, 80));
        e();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f16945a == null) {
            this.f16945a = h6.c0(AndroidUtilities.dp(10.0f), i0.a.k(h6.w0(h6.Wk, this.f16946b), 25));
        }
        me.b bVar = this.f16948e;
        if (bVar.f16402f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f16945a;
        if (shapeDrawable != null) {
            me.b bVar = this.f16948e;
            if (bVar.f16401e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f16945a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.f16401e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f16945a;
        d6 d6Var = this.f16946b;
        if (shapeDrawable != null) {
            ShapeDrawable c02 = h6.c0(AndroidUtilities.dp(10.0f), i0.a.k(h6.w0(h6.Wk, d6Var), 25));
            this.f16945a = c02;
            c02.setAlpha((int) (this.f16948e.f16401e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(h6.w0(h6.Wk, d6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f16948e.f16402f;
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f16945a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f16947c.d(document, null, null, null, false, false);
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
