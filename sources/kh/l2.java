package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.q80;
public final class l2 extends View {
    public final Paint f15582a;
    public final TextPaint f15583b;
    public final ArrayList f15584c;
    public float[] d;
    public e1 f15585e;
    public final n2 f15586f;

    public l2(n2 n2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i9;
        int i10;
        this.f15586f = n2Var;
        Paint paint = new Paint(1);
        this.f15582a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f15583b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f15584c = arrayList;
        setPadding(0, 0, 0, 0);
        if (n2Var.l0(4)) {
            i2 i2Var = new i2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            if (!UserConfig.getInstance(i10).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                i2Var.f15413j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                i2Var.f15417n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(i2Var);
        }
        if (n2Var.l0(0)) {
            arrayList.add(new i2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (n2Var.l0(5)) {
            tc tcVar = uc.f16175b;
            i2[] i2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (tcVar == null) {
                str = "🌤";
            } else {
                str = tcVar.f16113c;
            }
            sb2.append(str);
            sb2.append(" ");
            if (tcVar == null) {
                if (uc.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = tcVar.a();
            }
            sb2.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i9).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (kd0.f("android.permission.ACCESS_COARSE_LOCATION") && tcVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new q80(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    i2VarArr[0] = new i2(this, spannableStringBuilder2);
                    uc.a(false, new fh.f1(9, this, i2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            i2 i2Var2 = i2VarArr[0];
            arrayList.add(i2Var2 == null ? new i2(this, spannableStringBuilder) : i2Var2);
        }
        if (n2Var.l0(1)) {
            arrayList.add(new i2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (n2Var.l0(2)) {
            arrayList.add(new i2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (n2Var.l0(3)) {
            arrayList.add(new k2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f15584c;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h2 h2Var = (h2) obj;
            int i12 = h2Var.f15389e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i12];
            if (f10 > 0.0f) {
                fArr2[i12] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i12] = fArr3[i12] + h2Var.h.d(h2Var.f15387b, false);
        }
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            h2 h2Var2 = (h2) obj2;
            h2Var2.a(canvas, e2.c.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[h2Var2.f15389e - 1], 2.0f, getPaddingLeft()) + h2Var2.d, org.telegram.messenger.l0.D(48.0f, h2Var2.f15389e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f15584c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((h2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f15584c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((h2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f15584c;
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 1;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            h2 h2Var = (h2) obj;
            h2Var.d = f10;
            float dp = h2Var.f15387b + AndroidUtilities.dp(10.0f) + f10;
            if (dp > paddingLeft) {
                i12++;
                h2Var.d = 0.0f;
                f10 = h2Var.f15387b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f10 = dp;
            }
            h2Var.f15389e = i12;
        }
        float[] fArr = this.d;
        if (fArr != null && fArr.length == i12) {
            Arrays.fill(fArr, 0.0f);
        } else {
            this.d = new float[i12];
        }
        int size3 = arrayList.size();
        while (i11 < size3) {
            Object obj2 = arrayList.get(i11);
            i11++;
            h2 h2Var2 = (h2) obj2;
            int i14 = h2Var2.f15389e - 1;
            float[] fArr2 = this.d;
            float f11 = fArr2[i14];
            if (f11 > 0.0f) {
                fArr2[i14] = f11 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i14] = fArr3[i14] + h2Var2.f15387b;
        }
        setMeasuredDimension(size, org.telegram.messenger.l0.D(12.0f, i12 - 1, org.telegram.messenger.l0.D(36.0f, i12, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var;
        e1 e1Var;
        boolean z10;
        ArrayList arrayList = this.f15584c;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                h2Var = (h2) obj;
                if (h2Var.f15390f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                h2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            h2 h2Var2 = (h2) obj2;
            if (h2Var2 != h2Var) {
                h2Var2.f15391g.c(false);
            }
        }
        if (h2Var != null) {
            org.telegram.ui.Components.pc pcVar = h2Var.f15391g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            pcVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && h2Var != null && (e1Var = this.f15585e) != null) {
            e1Var.run(Integer.valueOf(h2Var.f15386a));
        }
        if (h2Var == null) {
            return false;
        }
        return true;
    }
}
