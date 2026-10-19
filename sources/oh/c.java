package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Components.bs;
import w7.z5;
import zf.p;
public final class c extends FrameLayout implements ne.d, y5 {
    public ShapeDrawable f17746a;
    public final d6 f17747b;
    public final e8 f17748c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.e = new ne.b(0, this, bs.h, 380L, false);
        this.f17747b = d6Var;
        e8 e8Var = new e8(context, d6Var, false);
        this.f17748c = e8Var;
        addView(e8Var, z5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        d();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f17746a == null) {
            this.f17746a = h6.c0(AndroidUtilities.dp(10.0f), i0.a.o(h6.w0(h6.Wk, this.f17747b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f17384f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void d() {
        ShapeDrawable shapeDrawable = this.f17746a;
        d6 d6Var = this.f17747b;
        if (shapeDrawable != null) {
            ShapeDrawable c02 = h6.c0(AndroidUtilities.dp(10.0f), i0.a.o(h6.w0(h6.Wk, d6Var), 25));
            this.f17746a = c02;
            c02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.o(h6.w0(h6.Wk, d6Var), 229));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f17746a;
        if (shapeDrawable != null) {
            ne.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f17746a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.e.f17384f;
    }

    @Override
    public final void r(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f17746a;
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
        this.f17748c.d(document, null, null, null, false, false);
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
