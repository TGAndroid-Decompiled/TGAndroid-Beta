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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.h9;
import w7.x5;
public final class n1 extends FrameLayout {
    public final e6 f9863a;
    public final h9 f9864b;
    public final TextView[] f9865c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f9866f;

    public n1(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f9865c = new TextView[2];
        this.d = new TextView[2];
        this.f9863a = e6Var;
        setWillNotDraw(false);
        h9 h9Var = new h9(this, false);
        this.f9864b = h9Var;
        h9Var.f24623l = true;
        h9Var.f24627p = AndroidUtilities.dp(75.0f);
        h9Var.f24626o = AndroidUtilities.dp(48.0f);
        h9Var.f24634x = true;
        h9Var.f24630s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9865c[i11] = new TextView(context);
            this.f9865c[i11].setTextColor(i6.v0(i6.G6, e6Var));
            this.f9865c[i11].setTypeface(AndroidUtilities.bold());
            this.f9865c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f9865c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f9865c[i11], x5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(i6.v0(i6.f19237z6, e6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], x5.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.P5, e6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(v8 v8Var) {
        String str;
        h9 h9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = v8Var.f716i;
            str = v8Var.D;
            int size = arrayList.size();
            h9Var = this.f9864b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) v8Var.f716i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            h9Var.l(i11, messageObject.storyItem, v8Var.f713c);
            i11++;
            i10++;
        }
        h9Var.k(i11);
        h9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f9865c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = v8Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), i6.v0(i6.Oh, this.f9863a), null));
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
        TextView[] textViewArr = this.f9865c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, p6.i("@", str2)), i6.v0(i6.Oh, this.f9863a), null));
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
        this.f9864b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = i6.T0("paintDivider", this.f9863a);
        if (T0 == null) {
            T0 = i6.f18958k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
