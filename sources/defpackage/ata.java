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
public final class ata extends FrameLayout {
    public final RadioButton a;
    public final Drawable b;
    public final Drawable c;
    public final io d;
    public final io e;
    public final TextView f;
    public final SpannableString h;
    public final SpannableString n;
    public TL_stars.TL_starsGiveawayOption r;
    public int s;
    public final ln w;

    public ata(Context context, ylb ylbVar) {
        super(context);
        this.w = new ln(this, 0L, 500L, d53.h);
        Drawable d = b10.d(context, 2131232770);
        this.b = d;
        anb.x(this, d, cmb.g5, ylbVar, PorterDuff.Mode.SRC_IN);
        this.c = b10.d(context, 2131232769);
        setWillNotDraw(false);
        io ioVar = new io(context, false, false, false);
        this.d = ioVar;
        anb.U(ioVar, cmb.F6, ylbVar);
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(16.0f));
        addView(ioVar, qoe.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ta6(gm.L(90.0f), ioVar), 0, 1, 33);
        io ioVar2 = new io(context, false, true, true);
        this.e = ioVar2;
        int i = cmb.y6;
        anb.U(ioVar2, i, ylbVar);
        ioVar2.setTextSize(gm.L(13.0f));
        addView(ioVar2, qoe.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        spannableString2.setSpan(new ta6(gm.L(70.0f), ioVar2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f = textView;
        anb.X(textView, i, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, cmb.i7, cmb.D5, ylbVar);
        addView(radioButton, qoe.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.w.e(false, this.s);
        float L = gm.L(24.0f);
        float L2 = gm.L(24.0f);
        float L3 = gm.L(2.5f);
        float L4 = gm.L(64.0f);
        float L5 = gm.L(8.0f);
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
        this.d.setTranslationX((L3 * e) + gm.L(22.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }
}
