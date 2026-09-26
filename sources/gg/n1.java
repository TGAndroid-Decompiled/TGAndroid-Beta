package gg;

import ai.v8;
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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import w7.y5;
public final class n1 extends FrameLayout {
    public final d6 f9849a;
    public final j9 f9850b;
    public final TextView[] f9851c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f9852f;

    public n1(Context context, d6 d6Var) {
        super(context);
        int i10;
        this.f9851c = new TextView[2];
        this.d = new TextView[2];
        this.f9849a = d6Var;
        setWillNotDraw(false);
        j9 j9Var = new j9(this, false);
        this.f9850b = j9Var;
        j9Var.f25339l = true;
        j9Var.f25343p = AndroidUtilities.dp(75.0f);
        j9Var.f25342o = AndroidUtilities.dp(48.0f);
        j9Var.f25350x = true;
        j9Var.f25346s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9851c[i11] = new TextView(context);
            this.f9851c[i11].setTextColor(h6.v0(h6.G6, d6Var));
            this.f9851c[i11].setTypeface(AndroidUtilities.bold());
            this.f9851c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f9851c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f9851c[i11], y5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(h6.v0(h6.f19461z6, d6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], y5.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.P5, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, y5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(v8 v8Var) {
        String str;
        j9 j9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = v8Var.f725i;
            str = v8Var.D;
            int size = arrayList.size();
            j9Var = this.f9850b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) v8Var.f725i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            j9Var.l(i11, messageObject.storyItem, v8Var.f722c);
            i11++;
            i10++;
        }
        j9Var.k(i11);
        j9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f9851c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = v8Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), h6.v0(h6.Oh, this.f9849a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", v8Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, v8Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f9851c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, v7.j.g("@", str2)), h6.v0(h6.Oh, this.f9849a), null));
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
        this.f9850b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f9849a);
        if (T0 == null) {
            T0 = h6.f19180k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
