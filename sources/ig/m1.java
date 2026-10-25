package ig;

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
import di.t6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.p10;
public final class m1 extends FrameLayout {
    public final u6 f14163a;
    public final l9 f14164b;
    public final TextView[] f14165c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f14166f;

    public m1(Context context, u6 u6Var) {
        super(context);
        int i10;
        this.f14165c = new TextView[2];
        this.d = new TextView[2];
        this.f14163a = u6Var;
        setWillNotDraw(false);
        l9 l9Var = new l9(this, false);
        this.f14164b = l9Var;
        l9Var.f30115l = true;
        l9Var.f30119p = AndroidUtilities.dp(75.0f);
        l9Var.f30118o = AndroidUtilities.dp(48.0f);
        l9Var.f30126x = true;
        l9Var.f30122s = AndroidUtilities.dp(22.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f14165c[i11] = new TextView(context);
            f7.V(this.f14165c[i11], y6.G6, u6Var);
            this.f14165c[i11].setTypeface(AndroidUtilities.bold());
            this.f14165c[i11].setTextSize(1, 14.0f);
            TextView textView = this.f14165c[i11];
            int i12 = 8;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            addView(this.f14165c[i11], gb1.h(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i11] = new TextView(context);
            f7.V(this.d[i11], y6.f23765z6, u6Var);
            this.d[i11].setTextSize(1, 12.0f);
            TextView textView2 = this.d[i11];
            if (i11 == 0) {
                i12 = 0;
            }
            textView2.setVisibility(i12);
            addView(this.d[i11], gb1.h(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        f7.t(imageView, y6.P5, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(t6 t6Var) {
        String str;
        l9 l9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = t6Var.f9493i;
            str = t6Var.D;
            int size = arrayList.size();
            l9Var = this.f14164b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) t6Var.f9493i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            l9Var.l(i11, messageObject.storyItem, t6Var.f9490c);
            i11++;
            i10++;
        }
        l9Var.k(i11);
        l9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.f14165c;
        if (!isEmpty) {
            textViewArr[0].setText(c(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", t6Var.J, b10.j("@", str))));
        } else {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", t6Var.J));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, t6Var.C));
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.f14165c;
        if (!isEmpty) {
            textViewArr[1].setText(c(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, b10.j("@", str2))));
        } else {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i10 = y6.Oh;
        u6 u6Var = this.f14163a;
        SpannableStringBuilder replaceSingleLinkKey = AndroidUtilities.replaceSingleLinkKey(str, i10, u6Var, null);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) replaceSingleLinkKey.getSpans(0, replaceSingleLinkKey.length(), CharacterStyle.class);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                int spanStart = replaceSingleLinkKey.getSpanStart(characterStyleArr[i11]);
                int spanEnd = replaceSingleLinkKey.getSpanEnd(characterStyleArr[i11]);
                replaceSingleLinkKey.removeSpan(characterStyleArr[i11]);
                replaceSingleLinkKey.setSpan(new p10(y6.Oh, u6Var), spanStart, spanEnd, 0);
            }
            return replaceSingleLinkKey;
        } catch (Exception e) {
            FileLog.e(e);
            return replaceSingleLinkKey;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.e), 0.0f);
        this.f14164b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint V0 = y6.V0("paintDivider", this.f14163a);
        if (V0 == null) {
            V0 = y6.f23476k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), V0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
