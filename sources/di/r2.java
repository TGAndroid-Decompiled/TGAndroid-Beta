package di;

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
public final class r2 extends View {
    public final Paint f8085a;
    public final TextPaint f8086b;
    public final ArrayList f8087c;
    public float[] d;
    public e1 f8088e;
    public final t2 f8089f;

    public r2(t2 t2Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f8089f = t2Var;
        Paint paint = new Paint(1);
        this.f8085a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8086b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f8087c = arrayList;
        setPadding(0, 0, 0, 0);
        if (t2Var.m0(4)) {
            o2 o2Var = new o2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                o2Var.f7748j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                o2Var.f7752n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(o2Var);
        }
        if (t2Var.m0(0)) {
            arrayList.add(new o2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (t2Var.m0(5)) {
            nd ndVar = od.f7837b;
            o2[] o2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (ndVar == null) {
                str = "🌤";
            } else {
                str = ndVar.f7734c;
            }
            sb2.append(str);
            sb2.append(" ");
            if (ndVar == null) {
                if (od.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = ndVar.a();
            }
            sb2.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (de0.f("android.permission.ACCESS_COARSE_LOCATION") && ndVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new i90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    o2VarArr[0] = new o2(this, spannableStringBuilder2);
                    od.a(false, new m2(0, this, o2VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            o2 o2Var2 = o2VarArr[0];
            arrayList.add(o2Var2 == null ? new o2(this, spannableStringBuilder) : o2Var2);
        }
        if (t2Var.m0(1)) {
            arrayList.add(new o2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (t2Var.m0(2)) {
            arrayList.add(new o2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (t2Var.m0(3)) {
            arrayList.add(new q2(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f8087c;
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
            n2 n2Var = (n2) obj;
            int i13 = n2Var.f7702e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + n2Var.h.d(n2Var.f7700b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n2 n2Var2 = (n2) obj2;
            n2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[n2Var2.f7702e - 1], 2.0f, getPaddingLeft()) + n2Var2.d, org.telegram.messenger.w1.D(48.0f, n2Var2.f7702e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f8087c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((n2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f8087c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((n2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f8087c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            n2 n2Var = (n2) obj;
            n2Var.d = f7;
            float dp = n2Var.f7700b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                n2Var.d = 0.0f;
                f7 = n2Var.f7700b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            n2Var.f7702e = i13;
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
            n2 n2Var2 = (n2) obj2;
            int i15 = n2Var2.f7702e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + n2Var2.f7700b;
        }
        setMeasuredDimension(size, org.telegram.messenger.w1.D(12.0f, i13 - 1, org.telegram.messenger.w1.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n2 n2Var;
        e1 e1Var;
        boolean z10;
        ArrayList arrayList = this.f8087c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n2Var = (n2) obj;
                if (n2Var.f7703f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                n2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            n2 n2Var2 = (n2) obj2;
            if (n2Var2 != n2Var) {
                n2Var2.f7704g.c(false);
            }
        }
        if (n2Var != null) {
            org.telegram.ui.Components.zc zcVar = n2Var.f7704g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            zcVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && n2Var != null && (e1Var = this.f8088e) != null) {
            e1Var.run(Integer.valueOf(n2Var.f7699a));
        }
        if (n2Var == null) {
            return false;
        }
        return true;
    }
}
