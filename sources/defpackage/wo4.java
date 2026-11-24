package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class wo4 extends FrameLayout implements g94, vlb {
    public ShapeDrawable a;
    public final ylb b;
    public final y0b c;
    public final TextView d;
    public final fn0 e;

    public wo4(Context context, ylb ylbVar) {
        super(context);
        this.e = new fn0(0, this, d53.h, 380L, false);
        this.b = ylbVar;
        y0b y0bVar = new y0b(ylbVar, context, false);
        this.c = y0bVar;
        addView(y0bVar, qoe.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, qoe.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z, boolean z2) {
        if (z && this.a == null) {
            this.a = cmb.b0(gm.L(10.0f), on2.p(cmb.v0(cmb.Ml, this.b), 25));
        }
        fn0 fn0Var = this.e;
        if (fn0Var.f == z && !z2) {
            return;
        }
        fn0Var.a(z, z2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ml));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            fn0 fn0Var = this.e;
            if (fn0Var.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                ur3.b(canvas, this.a, gm.R1(0.9f, 1.0f, fn0Var.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.e.f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        this.d.setText(tL_messages_stickerSet.set.short_name);
        if (!tL_messages_stickerSet.documents.isEmpty()) {
            document = tL_messages_stickerSet.documents.get(0);
        } else {
            document = null;
        }
        this.c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        ylb ylbVar = this.b;
        if (shapeDrawable != null) {
            cmb.A1(on2.p(cmb.v0(cmb.Ml, ylbVar), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(on2.p(cmb.v0(cmb.Ml, ylbVar), 229));
    }

    @Override
    public final void V(float f, int i) {
    }
}
