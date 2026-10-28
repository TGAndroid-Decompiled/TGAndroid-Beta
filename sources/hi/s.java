package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.y9;
public final class s extends FrameLayout {
    public final u6 f13249a;
    public final y9 f13250b;
    public final j9 f13251c;
    public final r5 d;
    public final TextView e;
    public final TextView f13252f;
    public final ImageView h;
    public final ImageView f13253n;
    public boolean f13254r;

    public s(Context context, int i10, u6 u6Var) {
        super(context);
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        j9 j9Var = new j9((u6) null);
        this.f13251c = j9Var;
        this.f13249a = u6Var;
        y9 y9Var = new y9(context);
        this.f13250b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        j9Var.f29560r = AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(y9Var, kb1.h(28, 28.0f, i11 | 16, 15.0f, 0.0f, 15.0f, 0.0f));
        r5 r5Var = new r5(AndroidUtilities.dp(28.0f), 7, y9Var, false);
        this.d = r5Var;
        r5Var.f32128x = Integer.valueOf(i10);
        LinearLayout d = wh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(y6.w0(y6.G6, u6Var));
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12);
        d.addView(textView, kb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        this.f13252f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(y6.w0(y6.f23749y6, u6Var));
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        d.addView(textView2, kb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 61.0f;
        }
        if (z10) {
            f10 = 61.0f;
        } else {
            f10 = 56.0f;
        }
        addView(d, kb1.h(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.checkbig);
        int w02 = y6.w0(y6.Mh, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(imageView, kb1.h(24, 24.0f, i14 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13253n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.f23521m6, u6Var), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        addView(imageView2, kb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(org.telegram.tgnet.tl.TL_agent.agentProvider r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: hi.s.a(org.telegram.tgnet.tl.TL_agent$agentProvider, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f13254r) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(61.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(61.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, y6.V0("paintDivider", this.f13249a));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.f13254r ? 1 : 0), 1073741824));
    }
}
