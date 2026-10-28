package fi;

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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.ye0;
public final class j2 extends View {
    public final Paint f11040a;
    public final TextPaint f11041b;
    public final ArrayList f11042c;
    public float[] d;
    public d1 e;
    public final l2 f11043f;

    public j2(l2 l2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f11043f = l2Var;
        Paint paint = new Paint(1);
        this.f11040a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f11041b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f11042c = arrayList;
        setPadding(0, 0, 0, 0);
        if (l2Var.o0(4)) {
            h2 h2Var = new h2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                h2Var.f10941j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.o1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                h2Var.f10945n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(h2Var);
        }
        if (l2Var.o0(0)) {
            arrayList.add(new h2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (l2Var.o0(5)) {
            pc pcVar = qc.f11506b;
            h2[] h2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (pcVar == null) {
                str = "🌤";
            } else {
                str = pcVar.f11454c;
            }
            sb2.append(str);
            sb2.append(" ");
            if (pcVar == null) {
                if (qc.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = pcVar.a();
            }
            sb2.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (ye0.d("android.permission.ACCESS_COARSE_LOCATION") && pcVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new fa0(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    h2VarArr[0] = new h2(this, spannableStringBuilder2);
                    qc.a(false, new ai.n1(8, this, h2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            h2 h2Var2 = h2VarArr[0];
            arrayList.add(h2Var2 == null ? new h2(this, spannableStringBuilder) : h2Var2);
        }
        if (l2Var.o0(1)) {
            arrayList.add(new h2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (l2Var.o0(2)) {
            arrayList.add(new h2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (l2Var.o0(3)) {
            arrayList.add(new i2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f11042c;
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
            g2 g2Var = (g2) obj;
            int i13 = g2Var.e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + g2Var.h.d(g2Var.f10892b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            g2 g2Var2 = (g2) obj2;
            g2Var2.a(canvas, c3.h0.B((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[g2Var2.e - 1], 2.0f, getPaddingLeft()) + g2Var2.d, wh.b(48.0f, g2Var2.e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f11042c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f11042c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f11042c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            g2 g2Var = (g2) obj;
            g2Var.d = f7;
            float dp = g2Var.f10892b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                g2Var.d = 0.0f;
                f7 = g2Var.f10892b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            g2Var.e = i13;
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
            g2 g2Var2 = (g2) obj2;
            int i15 = g2Var2.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + g2Var2.f10892b;
        }
        setMeasuredDimension(size, wh.b(12.0f, i13 - 1, wh.b(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        d1 d1Var;
        boolean z10;
        ArrayList arrayList = this.f11042c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                g2Var = (g2) obj;
                if (g2Var.f10894f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                g2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            g2 g2Var2 = (g2) obj2;
            if (g2Var2 != g2Var) {
                g2Var2.f10895g.c(false);
            }
        }
        if (g2Var != null) {
            xc xcVar = g2Var.f10895g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            xcVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && g2Var != null && (d1Var = this.e) != null) {
            d1Var.run(Integer.valueOf(g2Var.f10891a));
        }
        if (g2Var == null) {
            return false;
        }
        return true;
    }
}
