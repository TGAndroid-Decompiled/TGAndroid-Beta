package kg;

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
import b8.mf;
import ei.l6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.w8;
public final class h1 extends FrameLayout {
    public final e6 f17035a;
    public final w8 f17036b;
    public final TextView[] f17037c;
    public final TextView[] d;
    public float f17038e;
    public ValueAnimator f17039f;

    public h1(Context context, e6 e6Var) {
        super(context);
        int i3;
        this.f17037c = new TextView[2];
        this.d = new TextView[2];
        this.f17035a = e6Var;
        setWillNotDraw(false);
        w8 w8Var = new w8(this, false);
        this.f17036b = w8Var;
        w8Var.f39956l = true;
        w8Var.f39960p = org.telegram.messenger.g0.L(75.0f);
        w8Var.f39959o = org.telegram.messenger.g0.L(48.0f);
        w8Var.f39967x = true;
        w8Var.f39963s = org.telegram.messenger.g0.L(22.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f17037c[i10] = new TextView(context);
            r6.V(this.f17037c[i10], k6.G6, e6Var);
            this.f17037c[i10].setTypeface(org.telegram.messenger.g0.o());
            this.f17037c[i10].setTextSize(1, 14.0f);
            TextView textView = this.f17037c[i10];
            int i11 = 8;
            if (i10 == 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
            addView(this.f17037c[i10], mf.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            r6.V(this.d[i10], k6.f28290z6, e6Var);
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView2.setVisibility(i11);
            addView(this.d[i10], mf.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232059);
        r6.t(e10, k6.P5, e6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(l6 l6Var) {
        String str;
        w8 w8Var;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = l6Var.f10876i;
            str = l6Var.D;
            int size = arrayList.size();
            w8Var = this.f17036b;
            if (i3 >= size || i10 >= 3) {
                break;
            }
            zi ziVar = (zi) l6Var.f10876i.get(i3);
            long j10 = ziVar.f26871l.dialogId;
            TextUtils.isEmpty(str);
            w8Var.j(i10, l6Var.f10872c, ziVar.f26871l);
            i10++;
            i3++;
        }
        w8Var.i(i10);
        w8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f17037c;
        if (!isEmpty) {
            textViewArr[0].setText(c(bd.K("HashtagStoriesFoundChannel", l6Var.J, ' ', t4.c.f("@", str))));
        } else {
            textViewArr[0].setText(bd.H(' ', "HashtagStoriesFound", l6Var.J));
        }
        this.d[0].setText(bd.a0(null, null, 2131749356, l6Var.C));
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i3, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f17037c;
        if (!isEmpty) {
            textViewArr[1].setText(c(bd.K("HashtagMessagesFoundChannel", i3, ' ', t4.c.f("@", str2))));
        } else {
            textViewArr[1].setText(bd.H(' ', "HashtagMessagesFound", i3));
        }
        this.d[1].setText(bd.a0(null, null, 2131749365, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i3 = k6.Ci;
        e6 e6Var = this.f17035a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i3, e6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new tz(k6.Ci, e6Var), spanStart, spanEnd, 0);
            }
            return Q2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return Q2;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f17038e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f17038e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(org.telegram.messenger.g0.W1(this.f17038e, 0, -org.telegram.messenger.g0.L(62.0f)), 0.0f);
        this.f17036b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = k6.W0("paintDivider", this.f17035a);
        if (W0 == null) {
            W0 = k6.f28002k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
