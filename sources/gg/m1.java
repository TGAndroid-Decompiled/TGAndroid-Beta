package gg;

import ai.w8;
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
import org.telegram.ui.Components.l9;
import w7.x5;
public final class m1 extends FrameLayout {
    public final e6 f10728a;
    public final l9 f10729b;
    public final TextView[] f10730c;
    public final TextView[] d;
    public float f10731e;
    public ValueAnimator f10732f;

    public m1(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f10730c = new TextView[2];
        this.d = new TextView[2];
        this.f10728a = e6Var;
        setWillNotDraw(false);
        l9 l9Var = new l9(this, false);
        this.f10729b = l9Var;
        l9Var.f28258l = true;
        l9Var.f28262p = AndroidUtilities.dp(75.0f);
        l9Var.f28261o = AndroidUtilities.dp(48.0f);
        l9Var.f28269x = true;
        l9Var.f28265s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f10730c[i11] = new TextView(context);
            this.f10730c[i11].setTextColor(i6.w0(i6.G6, e6Var));
            this.f10730c[i11].setTypeface(AndroidUtilities.bold());
            this.f10730c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f10730c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f10730c[i11], x5.a(-2.0f, 76.0f, 7.0f, 40.0f, 0.0f, -1, 48));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(i6.w0(i6.f21203z6, e6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], x5.a(-2.0f, 76.0f, 26.33f, 40.0f, 0.0f, -1, 48));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.P5, e6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.a(24.0f, 0.0f, 0.0f, 8.66f, 0.0f, 24, 21));
    }

    public final boolean a(w8 w8Var) {
        String str;
        l9 l9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = w8Var.f899i;
            str = w8Var.D;
            int size = arrayList.size();
            l9Var = this.f10729b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) w8Var.f899i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            l9Var.l(i11, messageObject.storyItem, w8Var.f895c);
            i11++;
            i10++;
        }
        l9Var.k(i11);
        l9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f10730c;
        if (!isEmpty) {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", w8Var.J, "@" + str), i6.w0(i6.Oh, this.f10728a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", w8Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, w8Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f10730c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, sc.v.i("@", str2)), i6.w0(i6.Oh, this.f10728a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f10731e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f10731e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f10731e), 0.0f);
        this.f10729b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = i6.U0("paintDivider", this.f10728a);
        if (U0 == null) {
            U0 = i6.f20923k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
