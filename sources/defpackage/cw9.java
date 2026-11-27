package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class cw9 extends FrameLayout implements snb {
    public final View a;
    public final ImageView b;
    public final e7 c;
    public final xs0 d;
    public final vnb e;

    public cw9(Context context, float f, vnb vnbVar) {
        super(context);
        this.e = vnbVar;
        View view = new View(context);
        this.a = view;
        view.setBackgroundDrawable(aob.b0(hl.L(18.0f), aob.v0(aob.O5, vnbVar)));
        addView(view, tre.i(-1.0f, 36.0f, 8388659, f, 11.0f, f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232753);
        yob.s(imageView, aob.Q5, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.i(36.0f, 36.0f, 8388659, f + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setScaleType(scaleType);
        e7 e7Var = new e7(this, (byte) 3);
        this.c = e7Var;
        imageView2.setImageDrawable(e7Var);
        e7Var.f = hl.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, tre.i(36.0f, 36.0f, 8388661, f, 11.0f, f, 0.0f));
        imageView2.setOnClickListener(new jn8(this, (byte) 18));
        xs0 xs0Var = new xs0(this, context);
        this.d = xs0Var;
        xs0Var.setTextSize(1, 16.0f);
        yob.D(xs0Var, aob.P5, vnbVar);
        yob.X(xs0Var, aob.R5, vnbVar);
        xs0Var.setBackgroundDrawable(null);
        xs0Var.setPadding(0, 0, 0, 0);
        xs0Var.setMaxLines(1);
        xs0Var.setLines(1);
        xs0Var.setSingleLine(true);
        xs0Var.setGravity(tre.y() | 16);
        xs0Var.setImeOptions(268435459);
        yob.l(xs0Var, 30, aob.Di, vnbVar);
        xs0Var.setCursorSize(hl.L(20.0f));
        xs0Var.setCursorWidth(1.5f);
        float f2 = f + 2.0f;
        addView(xs0Var, tre.i(-1.0f, 40.0f, 8388659, f2 + 38.0f, 9.0f, f2 + 30.0f, 0.0f));
        xs0Var.addTextChangedListener(new nh6(this, (byte) 8));
        xs0Var.setOnEditorActionListener(new j(this, (byte) 22));
    }

    public abstract void a(String str);

    public sj2 getProgressDrawable() {
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
                aob.A1(aob.v0(aob.O5, this.e), view.getBackground());
                view.invalidate();
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
