package fg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.i9;
import w7.a6;
import zh.u4;
public final class o1 extends FrameLayout {
    public final f6 f8158a;
    public final i9 f8159b;
    public final TextView[] f8160c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f8161f;

    public o1(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f8160c = new TextView[2];
        this.d = new TextView[2];
        this.f8158a = f6Var;
        setWillNotDraw(false);
        i9 i9Var = new i9(this, false);
        this.f8159b = i9Var;
        i9Var.f23943l = true;
        i9Var.f23947p = AndroidUtilities.dp(75.0f);
        i9Var.f23946o = AndroidUtilities.dp(48.0f);
        i9Var.f23954x = true;
        i9Var.f23950s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f8160c[i11] = new TextView(context);
            this.f8160c[i11].setTextColor(j6.v0(j6.G6, f6Var));
            this.f8160c[i11].setTypeface(AndroidUtilities.bold());
            this.f8160c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f8160c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f8160c[i11], a6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            this.d[i11].setTextColor(j6.v0(j6.f18325z6, f6Var));
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], a6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.P5, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, a6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(u4 u4Var) {
        String str;
        i9 i9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = u4Var.f48240i;
            str = u4Var.D;
            int size = arrayList.size();
            i9Var = this.f8159b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) u4Var.f48240i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            i9Var.l(i11, messageObject.storyItem, u4Var.f48237c);
            i11++;
            i10++;
        }
        i9Var.k(i11);
        i9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f8160c;
        if (!isEmpty) {
            TextView textView = textViewArr[0];
            int i12 = u4Var.J;
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", i12, "@" + str), j6.v0(j6.Oh, this.f8158a), null));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", u4Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, u4Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f8160c;
        if (!isEmpty) {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, r6.i("@", str2)), j6.v0(j6.Oh, this.f8158a), null));
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
        this.f8159b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f8158a);
        if (T0 == null) {
            T0 = j6.f18049k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
