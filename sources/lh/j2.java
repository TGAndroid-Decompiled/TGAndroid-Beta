package lh;

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
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.u80;

public final class j2 extends View {

    public final Paint f16168a;

    public final TextPaint f16169b;

    public final ArrayList f16170c;
    public float[] d;

    public d1 f16171e;

    public final l2 f16172f;

    public j2(l2 l2Var, Context context) {
        String strA;
        super(context);
        this.f16172f = l2Var;
        Paint paint = new Paint(1);
        this.f16168a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f16169b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f16170c = arrayList;
        setPadding(0, 0, 0, 0);
        if (l2Var.m0(4)) {
            g2 g2Var = new g2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).isPremium()) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                g2Var.f16025j = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                g2Var.f16029n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(g2Var);
        }
        if (l2Var.m0(0)) {
            arrayList.add(new g2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (l2Var.m0(5)) {
            pc pcVar = qc.f16608b;
            g2[] g2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pcVar == null ? "🌤" : pcVar.f16550c);
            sb2.append(" ");
            if (pcVar == null) {
                strA = qc.b() ? "24°C" : "72°F";
            } else {
                strA = pcVar.a();
            }
            sb2.append(strA);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            CharSequence charSequence = charSequenceReplaceEmoji;
            if (MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).storyWeatherPreload && pd0.f("android.permission.ACCESS_COARSE_LOCATION") && pcVar == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                spannableStringBuilder.setSpan(new u80(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder.length(), 33);
                g2VarArr[0] = new g2(this, spannableStringBuilder);
                qc.a(false, new gh.d1(9, this, g2VarArr));
                charSequence = spannableStringBuilder;
            }
            charSequence = charSequenceReplaceEmoji;
            charSequence = charSequenceReplaceEmoji;
            g2 g2Var2 = g2VarArr[0];
            arrayList.add(g2Var2 == null ? new g2(this, charSequence) : g2Var2);
        }
        if (l2Var.m0(1)) {
            arrayList.add(new g2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (l2Var.m0(2)) {
            arrayList.add(new g2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (l2Var.m0(3)) {
            arrayList.add(new i2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f16170c;
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            f2 f2Var = (f2) obj;
            int i13 = f2Var.f15952e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i13];
            if (f10 > 0.0f) {
                fArr2[i13] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + f2Var.h.d(f2Var.f15950b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            f2 f2Var2 = (f2) obj2;
            f2Var2.a(canvas, com.google.android.recaptcha.internal.a.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[f2Var2.f15952e - 1], 2.0f, getPaddingLeft()) + f2Var2.d, org.telegram.messenger.y1.D(48.0f, f2Var2.f15952e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f16170c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f16170c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f16170c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float fDp = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            f2 f2Var = (f2) obj;
            f2Var.d = fDp;
            float fDp2 = f2Var.f15950b + AndroidUtilities.dp(10.0f) + fDp;
            if (fDp2 > paddingLeft) {
                i13++;
                f2Var.d = 0.0f;
                fDp = f2Var.f15950b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                fDp = fDp2;
            }
            f2Var.f15952e = i13;
        }
        float[] fArr = this.d;
        if (fArr == null || fArr.length != i13) {
            this.d = new float[i13];
        } else {
            Arrays.fill(fArr, 0.0f);
        }
        int size3 = arrayList.size();
        while (i12 < size3) {
            Object obj2 = arrayList.get(i12);
            i12++;
            f2 f2Var2 = (f2) obj2;
            int i15 = f2Var2.f15952e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + f2Var2.f15950b;
        }
        setMeasuredDimension(size, org.telegram.messenger.y1.D(12.0f, i13 - 1, org.telegram.messenger.y1.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var;
        d1 d1Var;
        ArrayList arrayList = this.f16170c;
        int size = arrayList.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                f2Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            f2Var = (f2) obj;
        } while (!f2Var.f15953f.contains(motionEvent.getX(), motionEvent.getY()));
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            f2 f2Var2 = (f2) obj2;
            if (f2Var2 != f2Var) {
                f2Var2.f15954g.c(false);
            }
        }
        if (f2Var != null) {
            f2Var.f15954g.c((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
        }
        if (motionEvent.getAction() == 1 && f2Var != null && (d1Var = this.f16171e) != null) {
            d1Var.run(Integer.valueOf(f2Var.f15949a));
        }
        return f2Var != null;
    }
}
