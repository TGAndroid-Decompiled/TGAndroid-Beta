package of;

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
import g7.e6;
import ih.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b9;
public final class i1 extends FrameLayout {
    public final b6 f19366a;
    public final b9 f19367b;
    public final TextView[] f19368c;
    public final TextView[] d;
    public float f19369e;
    public ValueAnimator f19370f;

    public i1(Context context, b6 b6Var) {
        super(context);
        int i9;
        this.f19368c = new TextView[2];
        this.d = new TextView[2];
        this.f19366a = b6Var;
        setWillNotDraw(false);
        b9 b9Var = new b9(this, false);
        this.f19367b = b9Var;
        b9Var.f27083l = true;
        b9Var.f27087p = AndroidUtilities.dp(75.0f);
        b9Var.f27086o = AndroidUtilities.dp(48.0f);
        b9Var.f27094x = true;
        b9Var.f27090s = AndroidUtilities.dp(22.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f19368c[i10] = new TextView(context);
            this.f19368c[i10].setTextColor(f6.v0(f6.G6, b6Var));
            this.f19368c[i10].setTypeface(AndroidUtilities.bold());
            this.f19368c[i10].setTextSize(1, 14.0f);
            TextView textView = this.f19368c[i10];
            int i11 = 8;
            if (i10 == 0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            textView.setVisibility(i9);
            addView(this.f19368c[i10], e6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            this.d[i10].setTextColor(f6.v0(f6.f23386z6, b6Var));
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView2.setVisibility(i11);
            addView(this.d[i10], e6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.P5, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, e6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(h6 h6Var) {
        String str;
        b9 b9Var;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = h6Var.f11851i;
            str = h6Var.D;
            int size = arrayList.size();
            b9Var = this.f19367b;
            if (i9 >= size || i10 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) h6Var.f11851i.get(i9);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            b9Var.l(i10, messageObject.storyItem, h6Var.f11847c);
            i10++;
            i9++;
        }
        b9Var.k(i10);
        b9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f19368c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i11 = h6Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i11, "@" + str), f6.v0(f6.Oh, this.f19366a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", h6Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, h6Var.C));
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i9, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f19368c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i9, ta.b.d("@", str2)), f6.v0(f6.Oh, this.f19366a), null));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i9));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f19369e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f19369e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.f19369e), 0.0f);
        this.f19367b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = f6.T0("paintDivider", this.f19366a);
        if (T0 == null) {
            T0 = f6.f23121k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
