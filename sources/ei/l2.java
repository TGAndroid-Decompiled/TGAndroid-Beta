package ei;

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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.yc;
public final class l2 extends View {
    public final Paint f9363a;
    public final TextPaint f9364b;
    public final ArrayList f9365c;
    public float[] d;
    public d1 e;
    public final n2 f9366f;

    public l2(n2 n2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f9366f = n2Var;
        Paint paint = new Paint(1);
        this.f9363a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9364b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f9365c = arrayList;
        setPadding(0, 0, 0, 0);
        if (n2Var.n0(4)) {
            j2 j2Var = new j2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                j2Var.f9240j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                j2Var.f9244n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(j2Var);
        }
        if (n2Var.n0(0)) {
            arrayList.add(new j2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (n2Var.n0(5)) {
            tc tcVar = uc.f9923b;
            j2[] j2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (tcVar == null) {
                str = "🌤";
            } else {
                str = tcVar.f9871c;
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
            i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (we0.d("android.permission.ACCESS_COARSE_LOCATION") && tcVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new ca0(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    j2VarArr[0] = new j2(this, spannableStringBuilder2);
                    uc.a(false, new ai.o2(7, this, j2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            j2 j2Var2 = j2VarArr[0];
            arrayList.add(j2Var2 == null ? new j2(this, spannableStringBuilder) : j2Var2);
        }
        if (n2Var.n0(1)) {
            arrayList.add(new j2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (n2Var.n0(2)) {
            arrayList.add(new j2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (n2Var.n0(3)) {
            arrayList.add(new k2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f9365c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = 0.0f;
                i11++;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            i2 i2Var = (i2) obj;
            int i13 = i2Var.e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + i2Var.h.d(i2Var.f9189b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            i2 i2Var2 = (i2) obj2;
            i2Var2.a(canvas, com.google.android.gms.internal.play_billing.k3.z((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[i2Var2.e - 1], 2.0f, getPaddingLeft()) + i2Var2.d, org.telegram.messenger.g0.D(48.0f, i2Var2.e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f9365c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f9365c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f9365c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            i2 i2Var = (i2) obj;
            i2Var.d = f7;
            float dp = i2Var.f9189b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                i2Var.d = 0.0f;
                f7 = i2Var.f9189b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            i2Var.e = i13;
        }
        float[] fArr = this.d;
        if (fArr != null && fArr.length == i13) {
            Arrays.fill(fArr, 0.0f);
        } else {
            this.d = new float[i13];
        }
        int size3 = arrayList.size();
        while (i12 < size3) {
            Object obj2 = arrayList.get(i12);
            i12++;
            i2 i2Var2 = (i2) obj2;
            int i15 = i2Var2.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + i2Var2.f9189b;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.D(12.0f, i13 - 1, org.telegram.messenger.g0.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i2 i2Var;
        d1 d1Var;
        boolean z10;
        ArrayList arrayList = this.f9365c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i2Var = (i2) obj;
                if (i2Var.f9191f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                i2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            i2 i2Var2 = (i2) obj2;
            if (i2Var2 != i2Var) {
                i2Var2.f9192g.c(false);
            }
        }
        if (i2Var != null) {
            yc ycVar = i2Var.f9192g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            ycVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && i2Var != null && (d1Var = this.e) != null) {
            d1Var.run(Integer.valueOf(i2Var.f9188a));
        }
        if (i2Var == null) {
            return false;
        }
        return true;
    }
}
