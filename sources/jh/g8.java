package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class g8 extends FrameLayout {

    public final Paint f13370a;

    public final Paint f13371b;

    public final TextView f13372c;
    public final TextView d;

    public final TextView f13373e;

    public g8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f13370a = paint;
        Paint paint2 = new Paint(1);
        this.f13371b = paint2;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f13372c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.StoryError));
        textView.setTextColor(-1);
        addView(textView, h7.z5.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(AndroidUtilities.dp(9.0f));
        addView(textView2, h7.z5.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f13373e = textView3;
        textView3.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        int iDp = AndroidUtilities.dp(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 536870911, 956301311, 956301311));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.TryAgain));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, h7.z5.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fDp = AndroidUtilities.dp(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(fDp, height, AndroidUtilities.dp(10.0f), this.f13370a);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp - AndroidUtilities.dp(1.0f), height - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + fDp, AndroidUtilities.dpf2(1.6f) + height);
        float fDp2 = AndroidUtilities.dp(3.0f);
        float fDp3 = AndroidUtilities.dp(3.0f);
        Paint paint = this.f13371b;
        canvas.drawRoundRect(rectF, fDp2, fDp3, paint);
        rectF.set(fDp - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + height, fDp + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.f13372c;
        TextView textView2 = this.d;
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(0.0f);
            textView2.setVisibility(8);
        } else {
            textView.setTranslationY(-AndroidUtilities.dpf2(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13373e.setOnClickListener(onClickListener);
    }
}
