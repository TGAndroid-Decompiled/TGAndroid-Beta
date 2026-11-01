package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import fe.e;
import fe.f;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.gr;
import rf.o;
import w7.b6;
public final class b extends FrameLayout implements e, k6 {
    public ShapeDrawable f7098a;
    public final p6 f7099b;
    public final d8 f7100c;
    public final TextView d;
    public final fe.b e;

    public b(Context context, p6 p6Var) {
        super(context);
        this.e = new fe.b(0, this, gr.h, 380L, false);
        this.f7099b = p6Var;
        d8 d8Var = new d8(context, p6Var, false);
        this.f7100c = d8Var;
        addView(d8Var, b6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f7098a == null) {
            this.f7098a = t6.d0(i0.L(10.0f), i0.b.o(t6.w0(t6.Kl, this.f7099b), 25));
        }
        fe.b bVar = this.e;
        if (bVar.f7022f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Kl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f7098a;
        if (shapeDrawable != null) {
            fe.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                o.b(canvas, this.f7098a, i0.T1(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.e.f7022f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f7100c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f7098a;
        p6 p6Var = this.f7099b;
        if (shapeDrawable != null) {
            t6.C1(i0.b.o(t6.w0(t6.Kl, p6Var), 25), shapeDrawable);
            this.f7098a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.b.o(t6.w0(t6.Kl, p6Var), 229));
    }

    @Override
    public final void v(int i10, float f7, float f10, f fVar) {
        ShapeDrawable shapeDrawable = this.f7098a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
