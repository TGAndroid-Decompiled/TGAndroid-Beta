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
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y8;
public final class l1 extends FrameLayout {
    public final f6 f16828a;
    public final y8 f16829b;
    public final TextView[] f16830c;
    public final TextView[] d;
    public float f16831e;
    public ValueAnimator f16832f;

    public l1(Context context, f6 f6Var) {
        super(context);
        int i7;
        this.f16830c = new TextView[2];
        this.d = new TextView[2];
        this.f16828a = f6Var;
        setWillNotDraw(false);
        y8 y8Var = new y8(this, false);
        this.f16829b = y8Var;
        y8Var.f40554l = true;
        y8Var.f40558p = org.telegram.messenger.g0.L(75.0f);
        y8Var.f40557o = org.telegram.messenger.g0.L(48.0f);
        y8Var.f40565x = true;
        y8Var.f40561s = org.telegram.messenger.g0.L(22.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f16830c[i10] = new TextView(context);
            r6.V(this.f16830c[i10], k6.G6, f6Var);
            this.f16830c[i10].setTypeface(org.telegram.messenger.g0.o());
            this.f16830c[i10].setTextSize(1, 14.0f);
            TextView textView = this.f16830c[i10];
            int i11 = 8;
            if (i10 == 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            textView.setVisibility(i7);
            addView(this.f16830c[i10], ha.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            r6.V(this.d[i10], k6.f28258z6, f6Var);
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView2.setVisibility(i11);
            addView(this.d[i10], ha.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232059);
        r6.t(e10, k6.P5, f6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, ha.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(di.k6 k6Var) {
        String str;
        y8 y8Var;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = k6Var.f9643i;
            str = k6Var.D;
            int size = arrayList.size();
            y8Var = this.f16829b;
            if (i7 >= size || i10 >= 3) {
                break;
            }
            ij ijVar = (ij) k6Var.f9643i.get(i7);
            long j3 = ijVar.f23241l.dialogId;
            TextUtils.isEmpty(str);
            y8Var.j(i10, k6Var.f9639c, ijVar.f23241l);
            i10++;
            i7++;
        }
        y8Var.i(i10);
        y8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f16830c;
        if (!isEmpty) {
            textViewArr[0].setText(c(hd.K("HashtagStoriesFoundChannel", k6Var.J, ' ', rf.b.i("@", str))));
        } else {
            textViewArr[0].setText(hd.H(' ', "HashtagStoriesFound", k6Var.J));
        }
        this.d[0].setText(hd.a0(null, null, 2131749347, k6Var.C));
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i7, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f16830c;
        if (!isEmpty) {
            textViewArr[1].setText(c(hd.K("HashtagMessagesFoundChannel", i7, ' ', rf.b.i("@", str2))));
        } else {
            textViewArr[1].setText(hd.H(' ', "HashtagMessagesFound", i7));
        }
        this.d[1].setText(hd.a0(null, null, 2131749356, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i7 = k6.Ci;
        f6 f6Var = this.f16828a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i7, f6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new xz(k6.Ci, f6Var), spanStart, spanEnd, 0);
            }
            return Q2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return Q2;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f16831e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f16831e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(org.telegram.messenger.g0.W1(this.f16831e, 0, -org.telegram.messenger.g0.L(62.0f)), 0.0f);
        this.f16829b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = k6.W0("paintDivider", this.f16828a);
        if (W0 == null) {
            W0 = k6.f27971k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
