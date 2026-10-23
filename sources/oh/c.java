package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Components.bs;
import w7.z5;
import zf.p;
public final class c extends FrameLayout implements ne.d, b6 {
    public ShapeDrawable f17809a;
    public final g6 f17810b;
    public final e8 f17811c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, g6 g6Var) {
        super(context);
        this.e = new ne.b(0, this, bs.h, 380L, false);
        this.f17810b = g6Var;
        e8 e8Var = new e8(context, g6Var, false);
        this.f17811c = e8Var;
        addView(e8Var, z5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f17809a == null) {
            this.f17809a = k6.c0(AndroidUtilities.dp(10.0f), i0.a.o(k6.w0(k6.Wk, this.f17810b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f17447f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Wk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f17809a;
        if (shapeDrawable != null) {
            ne.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f17809a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.e.f17447f;
    }

    @Override
    public final void o(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f17809a;
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
        this.f17811c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.f17809a;
        g6 g6Var = this.f17810b;
        if (shapeDrawable != null) {
            k6.z1(i0.a.o(k6.w0(k6.Wk, g6Var), 25), shapeDrawable);
            this.f17809a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(k6.w0(k6.Wk, g6Var), 229));
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
