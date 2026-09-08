package ig;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import w7.x5;
public final class k1 extends LinearLayout {
    public final f6 f12157a;
    public final h90 f12158b;
    public final ImageReceiver f12159c;
    public final TextView d;
    public boolean f12160e;

    public k1(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12159c = imageReceiver;
        this.f12157a = f6Var;
        setOrientation(1);
        h90 h90Var = new h90();
        this.f12158b = h90Var;
        int i15 = j6.G6;
        int v02 = j6.v0(i15, f6Var);
        h90Var.f(j6.l1(0.05f, v02), j6.l1(0.15f, v02), j6.l1(0.1f, v02), j6.l1(0.3f, v02));
        h90Var.j(4.0f);
        h90Var.f26717w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTextColor(j6.v0(i15, f6Var));
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
        addView(textView, x5.t(-1, -2, 55, i11, 10, i12, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(j6.v0(j6.f21088z6, f6Var));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
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
        addView(textView2, x5.t(-1, -2, 55, i13, 0, i14, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f12159c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f12158b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f12159c.setImageBitmap((Drawable) null);
            }
        }
        this.f12160e = z10;
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
        ImageReceiver imageReceiver = this.f12159c;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f12160e) {
            Paint T0 = j6.T0("paintDivider", this.f12157a);
            if (T0 == null) {
                T0 = j6.f20812k0;
            }
            Paint paint = T0;
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
        if (drawable != this.f12158b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
