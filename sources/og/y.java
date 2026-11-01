package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u80;
import w7.b6;
public final class y extends FrameLayout {
    public final RadioButton f14237a;
    public final Drawable f14238b;
    public final Drawable f14239c;
    public final f6 d;
    public final f6 e;
    public final TextView f14240f;
    public final SpannableString h;
    public final SpannableString f14241n;
    public TL_stars.TL_starsGiveawayOption f14242r;
    public int f14243s;
    public final t5 f14244w;

    public y(Context context, p6 p6Var) {
        super(context);
        this.f14244w = new t5(this, 0L, 500L, gr.h);
        Drawable f7 = i0.a.f(context, 2131232750);
        this.f14238b = f7;
        a7.y(this, f7, t6.f21002h5, p6Var, PorterDuff.Mode.SRC_IN);
        this.f14239c = i0.a.f(context, 2131232749);
        setWillNotDraw(false);
        f6 f6Var = new f6(context, false, false, false);
        this.d = f6Var;
        a7.Z(f6Var, t6.G6, p6Var);
        f6Var.setTypeface(i0.o());
        f6Var.setTextSize(i0.L(16.0f));
        addView(f6Var, b6.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new u80(i0.L(90.0f), f6Var), 0, 1, 33);
        f6 f6Var2 = new f6(context, false, true, true);
        this.e = f6Var2;
        int i10 = t6.f21331z6;
        a7.Z(f6Var2, i10, p6Var);
        f6Var2.setTextSize(i0.L(13.0f));
        addView(f6Var2, b6.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f14241n = spannableString2;
        spannableString2.setSpan(new u80(i0.L(70.0f), f6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f14240f = textView;
        a7.V(textView, i10, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f14237a = radioButton;
        radioButton.setSize(i0.L(20.0f));
        a7.P(radioButton, t6.f21040j7, t6.E5, p6Var);
        addView(radioButton, b6.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f14242r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.f14244w.e(false, this.f14243s);
        float L = i0.L(24.0f);
        float L2 = i0.L(24.0f);
        float L3 = i0.L(2.5f);
        float L4 = i0.L(64.0f);
        float L5 = i0.L(8.0f);
        for (int ceil = ((int) Math.ceil(e)) - 1; ceil >= 0; ceil--) {
            float i10 = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f7 = (((ceil - 1) - (1.0f - i10)) * L3 * 1.0f) + L4;
            int i11 = (int) f7;
            int i12 = (int) L5;
            int i13 = (int) (f7 + L);
            int i14 = (int) (L5 + L2);
            Drawable drawable = this.f14238b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (i10 * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f14239c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((L3 * e) + i0.L(22.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(56.0f), 1073741824));
    }
}
