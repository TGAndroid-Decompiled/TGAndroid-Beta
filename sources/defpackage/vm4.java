package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vm4 extends FrameLayout implements x74, tjb {
    public ShapeDrawable a;
    public final wjb b;
    public final xya c;
    public final TextView d;
    public final fm0 e;

    public vm4(Context context, wjb wjbVar) {
        super(context);
        this.e = new fm0(0, this, s33.h, 380L, false);
        this.b = wjbVar;
        xya xyaVar = new xya(wjbVar, context, false);
        this.c = xyaVar;
        addView(xyaVar, nme.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, nme.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z, boolean z2) {
        if (z && this.a == null) {
            this.a = bkb.b0(gl.L(10.0f), bm2.o(bkb.v0(bkb.Ml, this.b), 25));
        }
        fm0 fm0Var = this.e;
        if (fm0Var.f == z && !z2) {
            return;
        }
        fm0Var.a(z, z2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ml));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            fm0 fm0Var = this.e;
            if (fm0Var.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                kq3.b(canvas, this.a, gl.R1(0.9f, 1.0f, fm0Var.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean isSelected() {
        return this.e.f;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f * 255.0f));
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
        this.c.d(document, null, null, null, false, false);
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        wjb wjbVar = this.b;
        if (shapeDrawable != null) {
            bkb.A1(bm2.o(bkb.v0(bkb.Ml, wjbVar), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(bm2.o(bkb.v0(bkb.Ml, wjbVar), 229));
    }

    @Override
    public final void F(float f, int i) {
    }
}
