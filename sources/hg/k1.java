package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ma0;
import w7.w5;
public final class k1 extends LinearLayout {
    public final c6 f11296a;
    public final ma0 f11297b;
    public final ImageReceiver f11298c;
    public final TextView d;
    public boolean f11299e;

    public k1(Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11298c = imageReceiver;
        this.f11296a = c6Var;
        setOrientation(1);
        ma0 ma0Var = new ma0();
        this.f11297b = ma0Var;
        int i15 = h6.G6;
        int w02 = h6.w0(i15, c6Var);
        ma0Var.g(h6.m1(0.05f, w02), h6.m1(0.15f, w02), h6.m1(0.1f, w02), h6.m1(0.3f, w02));
        ma0Var.k(4.0f);
        ma0Var.f28486x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTextColor(h6.w0(i15, c6Var));
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 70;
        } else {
            i11 = 18;
        }
        if (z10) {
            i12 = 18;
        } else {
            i12 = 70;
        }
        addView(textView, w5.t(-1, -2, 55, i11, 10, i12, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(h6.w0(h6.f20963z6, c6Var));
        am.j(13.0f, R.string.BusinessProfileLocation, 1, textView2);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 70;
        } else {
            i13 = 18;
        }
        if (z11) {
            i14 = 18;
        } else {
            i14 = 70;
        }
        addView(textView2, w5.t(-1, -2, 55, i13, 0, i14, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f11298c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f11297b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f11298c.setImageBitmap((Drawable) null);
            }
        }
        this.f11299e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f7;
        if (LocaleController.isRTL) {
            width = AndroidUtilities.dp(16.0f);
        } else {
            width = getWidth() - AndroidUtilities.dp(60.0f);
        }
        float f10 = width;
        ImageReceiver imageReceiver = this.f11298c;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f11299e) {
            Paint U0 = h6.U0("paintDivider", this.f11296a);
            if (U0 == null) {
                U0 = h6.f20681k0;
            }
            Paint paint = U0;
            float f11 = 21.33f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 21.33f;
            }
            float dp = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width2 - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11297b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
