package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.pr;
import w7.x5;
import yf.p;
public final class c extends FrameLayout implements le.d, z5 {
    public ShapeDrawable f17029a;
    public final f6 f17030b;
    public final f8 f17031c;
    public final TextView d;
    public final le.b f17032e;

    public c(Context context, f6 f6Var) {
        super(context);
        this.f17032e = new le.b(0, this, pr.h, 380L, false);
        this.f17030b = f6Var;
        f8 f8Var = new f8(context, f6Var, false);
        this.f17031c = f8Var;
        addView(f8Var, x5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        d();
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f17029a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f17029a == null) {
            this.f17029a = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, this.f17030b), 25));
        }
        le.b bVar = this.f17032e;
        if (bVar.f15369f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void d() {
        ShapeDrawable shapeDrawable = this.f17029a;
        f6 f6Var = this.f17030b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, f6Var), 25));
            this.f17029a = b02;
            b02.setAlpha((int) (this.f17032e.f15368e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(j6.v0(j6.Wk, f6Var), 229));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f17029a;
        if (shapeDrawable != null) {
            le.b bVar = this.f17032e;
            if (bVar.f15368e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f17029a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.f15368e));
            }
        }
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.f17032e.f15369f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f17031c.d(document, null, null, null, false, false);
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
