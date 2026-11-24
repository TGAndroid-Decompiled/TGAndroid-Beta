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
public final class zqa extends FrameLayout {
    public final RadioButton a;
    public final Drawable b;
    public final Drawable c;
    public final hn d;
    public final hn e;
    public final TextView f;
    public final SpannableString h;
    public final SpannableString n;
    public TL_stars.TL_starsGiveawayOption r;
    public int s;
    public final lm w;

    public zqa(Context context, wjb wjbVar) {
        super(context);
        this.w = new lm(this, 0L, 500L, s33.h);
        Drawable d = b00.d(context, 2131232758);
        this.b = d;
        zkb.x(this, d, bkb.g5, wjbVar, PorterDuff.Mode.SRC_IN);
        this.c = b00.d(context, 2131232757);
        setWillNotDraw(false);
        hn hnVar = new hn(context, false, false, false);
        this.d = hnVar;
        zkb.U(hnVar, bkb.F6, wjbVar);
        hnVar.setTypeface(gl.o());
        hnVar.setTextSize(gl.L(16.0f));
        addView(hnVar, nme.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new u86(gl.L(90.0f), hnVar), 0, 1, 33);
        hn hnVar2 = new hn(context, false, true, true);
        this.e = hnVar2;
        int i = bkb.y6;
        zkb.U(hnVar2, i, wjbVar);
        hnVar2.setTextSize(gl.L(13.0f));
        addView(hnVar2, nme.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        spannableString2.setSpan(new u86(gl.L(70.0f), hnVar2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f = textView;
        zkb.X(textView, i, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.i7, bkb.D5, wjbVar);
        addView(radioButton, nme.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.w.e(false, this.s);
        float L = gl.L(24.0f);
        float L2 = gl.L(24.0f);
        float L3 = gl.L(2.5f);
        float L4 = gl.L(64.0f);
        float L5 = gl.L(8.0f);
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
        this.d.setTranslationX((L3 * e) + gl.L(22.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }
}
