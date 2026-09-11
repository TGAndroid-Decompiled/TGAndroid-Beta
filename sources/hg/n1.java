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
import bi.d8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.k9;
import w7.x5;
public final class n1 extends FrameLayout {
    public final f6 f11183a;
    public final k9 f11184b;
    public final TextView[] f11185c;
    public final TextView[] d;
    public float f11186e;
    public ValueAnimator f11187f;

    public n1(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f11185c = new TextView[2];
        this.d = new TextView[2];
        this.f11183a = f6Var;
        setWillNotDraw(false);
        k9 k9Var = new k9(this, false);
        this.f11184b = k9Var;
        k9Var.f27765l = true;
        k9Var.f27769p = AndroidUtilities.dp(75.0f);
        k9Var.f27768o = AndroidUtilities.dp(48.0f);
        k9Var.f27776x = true;
        k9Var.f27772s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f11185c[i11] = new TextView(context);
            this.f11185c[i11].setTextColor(j6.v0(j6.G6, f6Var));
            this.f11185c[i11].setTypeface(AndroidUtilities.bold());
            this.f11185c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f11185c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f11185c[i11], x5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(j6.v0(j6.f21061z6, f6Var));
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
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.P5, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(d8 d8Var) {
        String str;
        k9 k9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = d8Var.f3275i;
            str = d8Var.D;
            int size = arrayList.size();
            k9Var = this.f11184b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) d8Var.f3275i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            k9Var.l(i11, messageObject.storyItem, d8Var.f3271c);
            i11++;
            i10++;
        }
        k9Var.k(i11);
        k9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f11185c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = d8Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), j6.v0(j6.Oh, this.f11183a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", d8Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, d8Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f11185c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, p6.i("@", str2)), j6.v0(j6.Oh, this.f11183a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f11186e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f11186e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f11186e), 0.0f);
        this.f11184b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f11183a);
        if (T0 == null) {
            T0 = j6.f20785k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
