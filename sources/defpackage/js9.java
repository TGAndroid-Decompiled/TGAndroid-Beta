package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class js9 extends FrameLayout implements tjb {
    public final View a;
    public final ImageView b;
    public final d7 c;
    public final ps0 d;
    public final wjb e;

    public js9(Context context, float f, wjb wjbVar) {
        super(context);
        this.e = wjbVar;
        View view = new View(context);
        this.a = view;
        view.setBackgroundDrawable(bkb.b0(gl.L(18.0f), bkb.v0(bkb.N5, wjbVar)));
        addView(view, nme.i(-1.0f, 36.0f, 8388659, f, 11.0f, f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232742);
        zkb.s(imageView, bkb.P5, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.i(36.0f, 36.0f, 8388659, f + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setScaleType(scaleType);
        d7 d7Var = new d7(this, (byte) 3);
        this.c = d7Var;
        imageView2.setImageDrawable(d7Var);
        d7Var.f = gl.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, nme.i(36.0f, 36.0f, 8388661, f, 11.0f, f, 0.0f));
        imageView2.setOnClickListener(new ik8(this, (byte) 16));
        ps0 ps0Var = new ps0(this, context);
        this.d = ps0Var;
        ps0Var.setTextSize(1, 16.0f);
        zkb.D(ps0Var, bkb.O5, wjbVar);
        zkb.X(ps0Var, bkb.Q5, wjbVar);
        ps0Var.setBackgroundDrawable(null);
        ps0Var.setPadding(0, 0, 0, 0);
        ps0Var.setMaxLines(1);
        ps0Var.setLines(1);
        ps0Var.setSingleLine(true);
        ps0Var.setGravity(nme.y() | 16);
        ps0Var.setImeOptions(268435459);
        zkb.l(ps0Var, 30, bkb.Ci, wjbVar);
        ps0Var.setCursorSize(gl.L(20.0f));
        ps0Var.setCursorWidth(1.5f);
        float f2 = f + 2.0f;
        addView(ps0Var, nme.i(-1.0f, 40.0f, 8388659, f2 + 38.0f, 9.0f, f2 + 30.0f, 0.0f));
        ps0Var.addTextChangedListener(new jf6(this, (byte) 7));
        ps0Var.setOnEditorActionListener(new j(this, (byte) 22));
    }

    public abstract void a(String str);

    public wi2 getProgressDrawable() {
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
                bkb.A1(bkb.v0(bkb.N5, this.e), view.getBackground());
                view.invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
