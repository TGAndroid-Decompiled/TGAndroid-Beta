package hg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.g8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m9;
import w7.a6;
public final class m1 extends FrameLayout {
    public final c6 f10670a;
    public final m9 f10671b;
    public final TextView[] f10672c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f10673f;

    public m1(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f10672c = new TextView[2];
        this.d = new TextView[2];
        this.f10670a = c6Var;
        setWillNotDraw(false);
        m9 m9Var = new m9(this, false);
        this.f10671b = m9Var;
        m9Var.f27314l = true;
        m9Var.f27318p = AndroidUtilities.dp(75.0f);
        m9Var.f27317o = AndroidUtilities.dp(48.0f);
        m9Var.f27325x = true;
        m9Var.f27321s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f10672c[i11] = new TextView(context);
            this.f10672c[i11].setTextColor(g6.w0(g6.G6, c6Var));
            this.f10672c[i11].setTypeface(AndroidUtilities.bold());
            this.f10672c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f10672c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f10672c[i11], a6.a(-2.0f, 76.0f, 7.0f, 40.0f, 0.0f, -1, 48));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(g6.w0(g6.f20305z6, c6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], a6.a(-2.0f, 76.0f, 26.33f, 40.0f, 0.0f, -1, 48));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.P5, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, a6.a(24.0f, 0.0f, 0.0f, 8.66f, 0.0f, 24, 21));
    }

    public final boolean a(g8 g8Var) {
        String str;
        m9 m9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = g8Var.f3429i;
            str = g8Var.D;
            int size = arrayList.size();
            m9Var = this.f10671b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) g8Var.f3429i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            m9Var.l(i11, messageObject.storyItem, g8Var.f3426c);
            i11++;
            i10++;
        }
        m9Var.k(i11);
        m9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f10672c;
        if (!isEmpty) {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", g8Var.J, "@" + str), g6.w0(g6.Oh, this.f10670a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", g8Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, g8Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f10672c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, t8.b.h("@", str2)), g6.w0(g6.Oh, this.f10670a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.e), 0.0f);
        this.f10671b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = g6.U0("paintDivider", this.f10670a);
        if (U0 == null) {
            U0 = g6.f20022k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
