package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g8;
import org.telegram.ui.Components.wr;
import xf.p;
public final class c extends FrameLayout implements le.d, a6 {
    public ShapeDrawable f13662a;
    public final f6 f13663b;
    public final g8 f13664c;
    public final TextView d;
    public final le.b e;

    public c(Context context, f6 f6Var) {
        super(context);
        this.e = new le.b(0, this, wr.h, 380L, false);
        this.f13663b = f6Var;
        g8 g8Var = new g8(context, f6Var, false);
        this.f13664c = g8Var;
        addView(g8Var, w7.a6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, w7.a6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.f13662a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.f13662a == null) {
            this.f13662a = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, this.f13663b), 25));
        }
        le.b bVar = this.e;
        if (bVar.f12870f == z10 && !z11) {
            return;
        }
        bVar.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f13662a;
        if (shapeDrawable != null) {
            le.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.f13662a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        ShapeDrawable shapeDrawable = this.f13662a;
        f6 f6Var = this.f13663b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, f6Var), 25));
            this.f13662a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(j6.v0(j6.Wk, f6Var), 229));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean isSelected() {
        return this.e.f12870f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.f13664c.d(document, null, null, null, false, false);
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
