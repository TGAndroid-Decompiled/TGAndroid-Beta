package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadioButton;
public final class ava extends FrameLayout {
    public final RadioButton a;
    public final Drawable b;
    public final Drawable c;
    public final in d;
    public final in e;
    public final TextView f;
    public final SpannableString h;
    public final SpannableString n;
    public TL_stars.TL_starsGiveawayOption r;
    public int s;
    public final mm w;

    public ava(Context context, vnb vnbVar) {
        super(context);
        this.w = new mm(this, 0L, 500L, k43.h);
        Drawable e = c00.e(context, 2131232776);
        this.b = e;
        yob.x(this, e, aob.h5, vnbVar, PorterDuff.Mode.SRC_IN);
        this.c = c00.e(context, 2131232775);
        setWillNotDraw(false);
        in inVar = new in(context, false, false, false);
        this.d = inVar;
        yob.U(inVar, aob.G6, vnbVar);
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(16.0f));
        addView(inVar, tre.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ya6(hl.L(90.0f), inVar), 0, 1, 33);
        in inVar2 = new in(context, false, true, true);
        this.e = inVar2;
        int i = aob.z6;
        yob.U(inVar2, i, vnbVar);
        inVar2.setTextSize(hl.L(13.0f));
        addView(inVar2, tre.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        spannableString2.setSpan(new ya6(hl.L(70.0f), inVar2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f = textView;
        yob.X(textView, i, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.j7, aob.E5, vnbVar);
        addView(radioButton, tre.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.w.e(false, this.s);
        float L = hl.L(24.0f);
        float L2 = hl.L(24.0f);
        float L3 = hl.L(2.5f);
        float L4 = hl.L(64.0f);
        float L5 = hl.L(8.0f);
        for (int ceil = ((int) Math.ceil(e)) - 1; ceil >= 0; ceil--) {
            float i = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f = (((ceil - 1) - (1.0f - i)) * L3 * 1.0f) + L4;
            int i2 = (int) f;
            int i3 = (int) L5;
            int i4 = (int) (f + L);
            int i5 = (int) (L5 + L2);
            Drawable drawable = this.b;
            drawable.setBounds(i2, i3, i4, i5);
            int i6 = (int) (i * 255.0f);
            drawable.setAlpha(i6);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i2, i3, i4, i5);
            drawable2.setAlpha(i6);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((L3 * e) + hl.L(22.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
    }
}
