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
import ci.u6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import w7.z5;
public final class m1 extends FrameLayout {
    public final d6 f11981a;
    public final j9 f11982b;
    public final TextView[] f11983c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f11984f;

    public m1(Context context, d6 d6Var) {
        super(context);
        int i10;
        this.f11983c = new TextView[2];
        this.d = new TextView[2];
        this.f11981a = d6Var;
        setWillNotDraw(false);
        j9 j9Var = new j9(this, false);
        this.f11982b = j9Var;
        j9Var.f27457l = true;
        j9Var.f27461p = AndroidUtilities.dp(75.0f);
        j9Var.f27460o = AndroidUtilities.dp(48.0f);
        j9Var.f27468x = true;
        j9Var.f27464s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f11983c[i11] = new TextView(context);
            this.f11983c[i11].setTextColor(h6.w0(h6.G6, d6Var));
            this.f11983c[i11].setTypeface(AndroidUtilities.bold());
            this.f11983c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f11983c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f11983c[i11], z5.a(-2.0f, 76.0f, 7.0f, 40.0f, 0.0f, -1, 48));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(h6.w0(h6.f21391z6, d6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], z5.a(-2.0f, 76.0f, 26.33f, 40.0f, 0.0f, -1, 48));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.P5, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.a(24.0f, 0.0f, 0.0f, 8.66f, 0.0f, 24, 21));
    }

    public final boolean a(u6 u6Var) {
        String str;
        j9 j9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = u6Var.f5151i;
            str = u6Var.D;
            int size = arrayList.size();
            j9Var = this.f11982b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) u6Var.f5151i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            j9Var.l(i11, messageObject.storyItem, u6Var.f5148c);
            i11++;
            i10++;
        }
        j9Var.k(i11);
        j9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f11983c;
        if (!isEmpty) {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", u6Var.J, "@" + str), h6.w0(h6.Oh, this.f11981a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", u6Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, u6Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f11983c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, r.c.g("@", str2)), h6.w0(h6.Oh, this.f11981a), null));
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
        this.f11982b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.f11981a);
        if (U0 == null) {
            U0 = h6.f21107k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
