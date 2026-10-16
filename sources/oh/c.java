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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.es;
import w7.z5;
import zf.q;
public final class c extends FrameLayout implements ne.d, x5 {
    public ShapeDrawable f16348a;
    public final c6 f16349b;
    public final f8 f16350c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, c6 c6Var) {
        super(context);
        this.e = new ne.b(0, this, es.h, 380L, false);
        this.f16349b = c6Var;
        f8 f8Var = new f8(context, c6Var, false);
        this.f16350c = f8Var;
        addView(f8Var, z5.a(45.0f, 0.0f, 8.0f, 0.0f, 0.0f, 45, 49));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 5.0f, -1, 80));
        d();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f16348a == null) {
            this.f16348a = g6.c0(AndroidUtilities.dp(10.0f), i0.a.k(g6.w0(g6.Wk, this.f16349b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f16004f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void d() {
        ShapeDrawable shapeDrawable = this.f16348a;
        c6 c6Var = this.f16349b;
        if (shapeDrawable != null) {
            ShapeDrawable c02 = g6.c0(AndroidUtilities.dp(10.0f), i0.a.k(g6.w0(g6.Wk, c6Var), 25));
            this.f16348a = c02;
            c02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(g6.w0(g6.Wk, c6Var), 229));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f16348a;
        if (shapeDrawable != null) {
            ne.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                q.b(canvas, this.f16348a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.e.f16004f;
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f16348a;
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
        this.f16350c.d(document, null, null, null, false, false);
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
