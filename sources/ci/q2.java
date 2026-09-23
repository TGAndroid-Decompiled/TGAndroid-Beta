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
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.i90;
public final class q2 extends View {
    public final Paint f5322a;
    public final TextPaint f5323b;
    public final ArrayList f5324c;
    public float[] d;
    public e1 e;
    public final s2 f5325f;

    public q2(s2 s2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f5325f = s2Var;
        Paint paint = new Paint(1);
        this.f5322a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f5323b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f5324c = arrayList;
        setPadding(0, 0, 0, 0);
        if (s2Var.m0(4)) {
            n2 n2Var = new n2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.f3) s2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                n2Var.f5192j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                n2Var.f5196n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(n2Var);
        }
        if (s2Var.m0(0)) {
            arrayList.add(new n2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (s2Var.m0(5)) {
            kd kdVar = ld.f5112b;
            n2[] n2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (kdVar == null) {
                str = "🌤";
            } else {
                str = kdVar.f4929c;
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
            i10 = ((org.telegram.ui.ActionBar.f3) s2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (de0.f("android.permission.ACCESS_COARSE_LOCATION") && kdVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new i90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    n2VarArr[0] = new n2(this, spannableStringBuilder2);
                    ld.a(false, new ai.g3(1, this, n2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            n2 n2Var2 = n2VarArr[0];
            arrayList.add(n2Var2 == null ? new n2(this, spannableStringBuilder) : n2Var2);
        }
        if (s2Var.m0(1)) {
            arrayList.add(new n2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (s2Var.m0(2)) {
            arrayList.add(new n2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (s2Var.m0(3)) {
            arrayList.add(new p2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f5324c;
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
            m2 m2Var = (m2) obj;
            int i13 = m2Var.e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + m2Var.h.d(m2Var.f5161b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            m2 m2Var2 = (m2) obj2;
            m2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[m2Var2.e - 1], 2.0f, getPaddingLeft()) + m2Var2.d, org.telegram.messenger.z0.D(48.0f, m2Var2.e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f5324c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f5324c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f5324c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            m2 m2Var = (m2) obj;
            m2Var.d = f7;
            float dp = m2Var.f5161b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                m2Var.d = 0.0f;
                f7 = m2Var.f5161b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            m2Var.e = i13;
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
            m2 m2Var2 = (m2) obj2;
            int i15 = m2Var2.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + m2Var2.f5161b;
        }
        setMeasuredDimension(size, org.telegram.messenger.z0.D(12.0f, i13 - 1, org.telegram.messenger.z0.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        e1 e1Var;
        boolean z10;
        ArrayList arrayList = this.f5324c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m2Var = (m2) obj;
                if (m2Var.f5163f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                m2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            m2 m2Var2 = (m2) obj2;
            if (m2Var2 != m2Var) {
                m2Var2.f5164g.c(false);
            }
        }
        if (m2Var != null) {
            org.telegram.ui.Components.yc ycVar = m2Var.f5164g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            ycVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && m2Var != null && (e1Var = this.e) != null) {
            e1Var.run(Integer.valueOf(m2Var.f5160a));
        }
        if (m2Var == null) {
            return false;
        }
        return true;
    }
}
