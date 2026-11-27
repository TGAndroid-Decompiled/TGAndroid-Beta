package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ap4 extends FrameLayout implements s84, snb {
    public ShapeDrawable a;
    public final vnb b;
    public final x2b c;
    public final TextView d;
    public final fm0 e;

    public ap4(Context context, vnb vnbVar) {
        super(context);
        this.e = new fm0(0, this, k43.h, 380L, false);
        this.b = vnbVar;
        x2b x2bVar = new x2b(vnbVar, context, false);
        this.c = x2bVar;
        addView(x2bVar, tre.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, tre.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z, boolean z2) {
        if (z && this.a == null) {
            this.a = aob.b0(hl.L(10.0f), vm2.o(aob.v0(aob.Nl, this.b), 25));
        }
        fm0 fm0Var = this.e;
        if (fm0Var.f == z && !z2) {
            return;
        }
        fm0Var.a(z, z2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Nl));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            fm0 fm0Var = this.e;
            if (fm0Var.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                br3.b(canvas, this.a, hl.R1(0.9f, 1.0f, fm0Var.e));
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
    public final void t(int i, float f, float f2, t84 t84Var) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f * 255.0f));
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        vnb vnbVar = this.b;
        if (shapeDrawable != null) {
            aob.A1(vm2.o(aob.v0(aob.Nl, vnbVar), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(vm2.o(aob.v0(aob.Nl, vnbVar), 229));
    }

    @Override
    public final void v0(float f, int i) {
    }
}
