package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import fi.b6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.k00;
public final class k1 extends FrameLayout {
    public final h6 f17550a;
    public final d9 f17551b;
    public final TextView[] f17552c;
    public final TextView[] d;
    public float f17553e;
    public ValueAnimator f17554f;

    public k1(Context context, h6 h6Var) {
        super(context);
        int i7;
        this.f17552c = new TextView[2];
        this.d = new TextView[2];
        this.f17550a = h6Var;
        setWillNotDraw(false);
        d9 d9Var = new d9(this, false);
        this.f17551b = d9Var;
        d9Var.f34396l = true;
        d9Var.f34400p = org.telegram.messenger.g0.L(75.0f);
        d9Var.f34399o = org.telegram.messenger.g0.L(48.0f);
        d9Var.f34407x = true;
        d9Var.f34403s = org.telegram.messenger.g0.L(22.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f17552c[i10] = new TextView(context);
            t6.U(this.f17552c[i10], m6.G6, h6Var);
            this.f17552c[i10].setTypeface(org.telegram.messenger.g0.o());
            this.f17552c[i10].setTextSize(1, 14.0f);
            TextView textView = this.f17552c[i10];
            int i11 = 8;
            if (i10 == 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            textView.setVisibility(i7);
            addView(this.f17552c[i10], na.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            t6.U(this.d[i10], m6.f29758z6, h6Var);
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView2.setVisibility(i11);
            addView(this.d[i10], na.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView e10 = o10.e(context, 2131232061);
        t6.s(e10, m6.P5, h6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, na.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(b6 b6Var) {
        String str;
        d9 d9Var;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = b6Var.f12040i;
            str = b6Var.D;
            int size = arrayList.size();
            d9Var = this.f17551b;
            if (i7 >= size || i10 >= 3) {
                break;
            }
            gj gjVar = (gj) b6Var.f12040i.get(i7);
            long j3 = gjVar.f24182l.dialogId;
            TextUtils.isEmpty(str);
            d9Var.j(i10, b6Var.f12036c, gjVar.f24182l);
            i10++;
            i7++;
        }
        d9Var.i(i10);
        d9Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f17552c;
        if (!isEmpty) {
            textViewArr[0].setText(c(hd.K("HashtagStoriesFoundChannel", b6Var.J, ' ', p5.c.k("@", str))));
        } else {
            textViewArr[0].setText(hd.H(' ', "HashtagStoriesFound", b6Var.J));
        }
        this.d[0].setText(hd.a0(null, null, 2131749155, b6Var.C));
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i7, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f17552c;
        if (!isEmpty) {
            textViewArr[1].setText(c(hd.K("HashtagMessagesFoundChannel", i7, ' ', p5.c.k("@", str2))));
        } else {
            textViewArr[1].setText(hd.H(' ', "HashtagMessagesFound", i7));
        }
        this.d[1].setText(hd.a0(null, null, 2131749164, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i7 = m6.Fi;
        h6 h6Var = this.f17550a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i7, h6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new k00(m6.Fi, h6Var), spanStart, spanEnd, 0);
            }
            return Q2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return Q2;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f17553e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f17553e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(org.telegram.messenger.g0.W1(this.f17553e, 0, -org.telegram.messenger.g0.L(62.0f)), 0.0f);
        this.f17551b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.f17550a);
        if (W0 == null) {
            W0 = m6.f29470k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
