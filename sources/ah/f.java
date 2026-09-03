package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import kf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Components.mr;
public final class f extends FrameLayout implements xd.b, a6 {
    public ShapeDrawable f214a;
    public final f6 f215b;
    public final c8 f216c;
    public final TextView d;
    public final xd.a e;

    public f(Context context, f6 f6Var) {
        super(context);
        this.e = new xd.a(0, this, mr.h, 380L, false);
        this.f215b = f6Var;
        c8 c8Var = new c8(context, f6Var, false);
        this.f216c = c8Var;
        addView(c8Var, b6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ShapeDrawable shapeDrawable = this.f214a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 && this.f214a == null) {
            this.f214a = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, this.f215b), 25));
        }
        xd.a aVar = this.e;
        if (aVar.f46961f == z4 && !z10) {
            return;
        }
        aVar.a(z4, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f214a;
        if (shapeDrawable != null) {
            xd.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.f214a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f214a;
        f6 f6Var = this.f215b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, f6Var), 25));
            this.f214a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(j6.v0(j6.Wk, f6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.e.f46961f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f216c.d(document, null, null, null, false, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
