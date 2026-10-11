package ci;

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
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.ja0;
public final class p2 extends View {
    public final Paint f5717a;
    public final TextPaint f5718b;
    public final ArrayList f5719c;
    public float[] d;
    public d1 f5720e;
    public final r2 f5721f;

    public p2(r2 r2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f5721f = r2Var;
        Paint paint = new Paint(1);
        this.f5717a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f5718b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f5719c = arrayList;
        setPadding(0, 0, 0, 0);
        if (r2Var.n0(4)) {
            m2 m2Var = new m2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                m2Var.f5583j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                m2Var.f5587n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(m2Var);
        }
        if (r2Var.n0(0)) {
            arrayList.add(new m2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (r2Var.n0(5)) {
            kd kdVar = ld.f5544b;
            m2[] m2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (kdVar == null) {
                str = "🌤";
            } else {
                str = kdVar.f5351c;
            }
            sb2.append(str);
            sb2.append(" ");
            if (kdVar == null) {
                if (ld.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = kdVar.a();
            }
            sb2.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (ff0.d("android.permission.ACCESS_COARSE_LOCATION") && kdVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new ja0(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    m2VarArr[0] = new m2(this, spannableStringBuilder2);
                    ld.a(false, new ai.h3(1, this, m2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            m2 m2Var2 = m2VarArr[0];
            arrayList.add(m2Var2 == null ? new m2(this, spannableStringBuilder) : m2Var2);
        }
        if (r2Var.n0(1)) {
            arrayList.add(new m2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (r2Var.n0(2)) {
            arrayList.add(new m2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (r2Var.n0(3)) {
            arrayList.add(new o2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f5719c;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            l2 l2Var = (l2) obj;
            int i13 = l2Var.f5381e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + l2Var.h.d(l2Var.f5379b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            l2 l2Var2 = (l2) obj2;
            l2Var2.a(canvas, com.google.android.gms.internal.vision.e2.z((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[l2Var2.f5381e - 1], 2.0f, getPaddingLeft()) + l2Var2.d, org.telegram.messenger.q.D(48.0f, l2Var2.f5381e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f5719c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f5719c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f5719c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            l2 l2Var = (l2) obj;
            l2Var.d = f7;
            float dp = l2Var.f5379b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                l2Var.d = 0.0f;
                f7 = l2Var.f5379b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            l2Var.f5381e = i13;
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
            l2 l2Var2 = (l2) obj2;
            int i15 = l2Var2.f5381e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + l2Var2.f5379b;
        }
        setMeasuredDimension(size, org.telegram.messenger.q.D(12.0f, i13 - 1, org.telegram.messenger.q.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l2 l2Var;
        d1 d1Var;
        boolean z10;
        ArrayList arrayList = this.f5719c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l2Var = (l2) obj;
                if (l2Var.f5382f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                l2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            l2 l2Var2 = (l2) obj2;
            if (l2Var2 != l2Var) {
                l2Var2.f5383g.c(false);
            }
        }
        if (l2Var != null) {
            org.telegram.ui.Components.bd bdVar = l2Var.f5383g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            bdVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && l2Var != null && (d1Var = this.f5720e) != null) {
            d1Var.run(Integer.valueOf(l2Var.f5378a));
        }
        if (l2Var == null) {
            return false;
        }
        return true;
    }
}
