package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class lu9 extends FrameLayout implements vlb {
    public final View a;
    public final ImageView b;
    public final d7 c;
    public final vc d;
    public final ylb e;

    public lu9(Context context, float f, ylb ylbVar) {
        super(context);
        this.e = ylbVar;
        View view = new View(context);
        this.a = view;
        view.setBackgroundDrawable(cmb.b0(gm.L(18.0f), cmb.v0(cmb.N5, ylbVar)));
        addView(view, qoe.i(-1.0f, 36.0f, 8388659, f, 11.0f, f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232754);
        anb.s(imageView, cmb.P5, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.i(36.0f, 36.0f, 8388659, f + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setScaleType(scaleType);
        d7 d7Var = new d7(this, (byte) 3);
        this.c = d7Var;
        imageView2.setImageDrawable(d7Var);
        d7Var.f = gm.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, qoe.i(36.0f, 36.0f, 8388661, f, 11.0f, f, 0.0f));
        imageView2.setOnClickListener(new wk8(this, (byte) 19));
        vc vcVar = new vc(this, context);
        this.d = vcVar;
        vcVar.setTextSize(1, 16.0f);
        anb.D(vcVar, cmb.O5, ylbVar);
        anb.X(vcVar, cmb.Q5, ylbVar);
        vcVar.setBackgroundDrawable(null);
        vcVar.setPadding(0, 0, 0, 0);
        vcVar.setMaxLines(1);
        vcVar.setLines(1);
        vcVar.setSingleLine(true);
        vcVar.setGravity(qoe.y() | 16);
        vcVar.setImeOptions(268435459);
        anb.l(vcVar, 30, cmb.Ci, ylbVar);
        vcVar.setCursorSize(gm.L(20.0f));
        vcVar.setCursorWidth(1.5f);
        float f2 = f + 2.0f;
        addView(vcVar, qoe.i(-1.0f, 40.0f, 8388659, f2 + 38.0f, 9.0f, f2 + 30.0f, 0.0f));
        vcVar.addTextChangedListener(new og6(this, (byte) 8));
        vcVar.setOnEditorActionListener(new j(this, (byte) 23));
    }

    public abstract void a(String str);

    public kk2 getProgressDrawable() {
        return this.c;
    }

    public View getSearchBackground() {
        return this.a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.a;
        if (view != null) {
            try {
                cmb.A1(cmb.v0(cmb.N5, this.e), view.getBackground());
                view.invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
