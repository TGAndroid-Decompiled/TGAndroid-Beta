package bi;

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
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.r90;
public final class d3 extends View {
    public final Paint f2541a;
    public final TextPaint f2542b;
    public final ArrayList f2543c;
    public float[] d;
    public j1 e;
    public final f3 f2544f;

    public d3(f3 f3Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f2544f = f3Var;
        Paint paint = new Paint(1);
        this.f2541a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f2542b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f2543c = arrayList;
        setPadding(0, 0, 0, 0);
        if (f3Var.m0(4)) {
            a3 a3Var = new a3(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                a3Var.f2305j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                a3Var.f2309n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(a3Var);
        }
        if (f3Var.m0(0)) {
            arrayList.add(new a3(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (f3Var.m0(5)) {
            df dfVar = ef.f2680b;
            a3[] a3VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            if (dfVar == null) {
                str = "🌤";
            } else {
                str = dfVar.f2573c;
            }
            sb2.append(str);
            sb2.append(" ");
            if (dfVar == null) {
                if (ef.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = dfVar.a();
            }
            sb2.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (me0.f("android.permission.ACCESS_COARSE_LOCATION") && dfVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new r90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    a3VarArr[0] = new a3(this, spannableStringBuilder2);
                    ef.a(false, new y2(0, this, a3VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            a3 a3Var2 = a3VarArr[0];
            arrayList.add(a3Var2 == null ? new a3(this, spannableStringBuilder) : a3Var2);
        }
        if (f3Var.m0(1)) {
            arrayList.add(new a3(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (f3Var.m0(2)) {
            arrayList.add(new a3(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (f3Var.m0(3)) {
            arrayList.add(new c3(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f2543c;
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
            z2 z2Var = (z2) obj;
            int i13 = z2Var.e - 1;
            float[] fArr2 = this.d;
            float f7 = fArr2[i13];
            if (f7 > 0.0f) {
                fArr2[i13] = f7 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + z2Var.h.d(z2Var.f3998b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            z2 z2Var2 = (z2) obj2;
            z2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[z2Var2.e - 1], 2.0f, getPaddingLeft()) + z2Var2.d, org.telegram.messenger.a2.D(48.0f, z2Var2.e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f2543c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((z2) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f2543c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((z2) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f2543c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f7 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            z2 z2Var = (z2) obj;
            z2Var.d = f7;
            float dp = z2Var.f3998b + AndroidUtilities.dp(10.0f) + f7;
            if (dp > paddingLeft) {
                i13++;
                z2Var.d = 0.0f;
                f7 = z2Var.f3998b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f7 = dp;
            }
            z2Var.e = i13;
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
            z2 z2Var2 = (z2) obj2;
            int i15 = z2Var2.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + z2Var2.f3998b;
        }
        setMeasuredDimension(size, org.telegram.messenger.a2.D(12.0f, i13 - 1, org.telegram.messenger.a2.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var;
        j1 j1Var;
        boolean z10;
        ArrayList arrayList = this.f2543c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z2Var = (z2) obj;
                if (z2Var.f4000f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                z2Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            z2 z2Var2 = (z2) obj2;
            if (z2Var2 != z2Var) {
                z2Var2.f4001g.c(false);
            }
        }
        if (z2Var != null) {
            org.telegram.ui.Components.xc xcVar = z2Var.f4001g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            xcVar.c(z10);
        }
        if (motionEvent.getAction() == 1 && z2Var != null && (j1Var = this.e) != null) {
            j1Var.run(Integer.valueOf(z2Var.f3997a));
        }
        if (z2Var == null) {
            return false;
        }
        return true;
    }
}
