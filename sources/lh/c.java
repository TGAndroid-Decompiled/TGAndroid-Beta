package lh;

import a8.me;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.cj;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final u6 f17025a;
    public final me f17026b;
    public final me f17027c;
    public float d;

    public c(Context context, u6 u6Var, cj cjVar, ch.b bVar) {
        super(context);
        me meVar = new me(this);
        this.f17026b = meVar;
        me meVar2 = new me(this);
        this.f17027c = meVar2;
        this.f17025a = u6Var;
        kh.a c10 = kh.a.c(context, bVar, cjVar, u6Var);
        meVar.f614a = c10;
        c10.setOnClickListener(new bh.f(6));
        gb1.c((kh.a) meVar.f614a, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, bVar, cjVar, u6Var);
        meVar2.f614a = c11;
        c11.setOnClickListener(new bh.f(6));
        gb1.c((kh.a) meVar2.f614a, 0.065f, 2.0f);
        a(meVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(meVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) meVar.f614a, gb1.q(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) meVar2.f614a, gb1.q(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(me meVar, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = y6.Xk;
        u6 u6Var = this.f17025a;
        f7.V(textView, i11, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        f7.y(this, mutate, y6.Wk, u6Var, PorterDuff.Mode.MULTIPLY);
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        meVar.f615b = textView;
        ((kh.a) meVar.f614a).addView(textView, gb1.i(-2, -2, 17));
    }

    public final void b(me meVar) {
        int i10;
        float f7 = this.d * ((oe.b) meVar.f616c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ne.a.f18779a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (meVar == this.f17026b) {
            interpolation *= -1.0f;
        }
        ((kh.a) meVar.f614a).setTranslationX(interpolation);
        ((kh.a) meVar.f614a).setTranslationY(f10);
        ((kh.a) meVar.f614a).setAlpha(f7);
        kh.a aVar = (kh.a) meVar.f614a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (kh.a) this.f17027c.f614a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f17027c);
        b(this.f17026b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f17027c.f614a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f17026b.f614a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f17027c);
            b(this.f17026b);
        }
    }
}
