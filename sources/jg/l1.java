package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.d3;
public final class l1 extends LinearLayout implements p6 {
    public final u6 f15773a;
    public final ea0 f15774b;
    public final ImageReceiver f15775c;
    public final TextView d;
    public boolean e;

    public l1(Context context, u6 u6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15775c = imageReceiver;
        this.f15773a = u6Var;
        setOrientation(1);
        ea0 ea0Var = new ea0();
        this.f15774b = ea0Var;
        int i15 = y6.G6;
        int w02 = y6.w0(i15, u6Var);
        ea0Var.g(y6.o1(0.05f, w02), y6.o1(0.15f, w02), y6.o1(0.1f, w02), y6.o1(0.3f, w02));
        ea0Var.k(4.0f);
        ea0Var.f27805x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        f7.V(textView, i15, u6Var);
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
        addView(textView, kb1.x(-1, -2, 55, i11, 10, i12, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        f7.V(textView2, y6.f23768z6, u6Var);
        d3.o(R.string.BusinessProfileLocation, textView2, 1, 13.0f);
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
        addView(textView2, kb1.x(-1, -2, 55, i13, 0, i14, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f15775c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f15774b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f15775c.setImageBitmap((Drawable) null);
            }
        }
        this.e = z10;
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
        ImageReceiver imageReceiver = this.f15775c;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = y6.V0("paintDivider", this.f15773a);
            if (V0 == null) {
                V0 = y6.f23479k0;
            }
            Paint paint = V0;
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
    public final void updateColors() {
        ea0 ea0Var = this.f15774b;
        if (ea0Var != null) {
            try {
                int w02 = y6.w0(y6.G6, this.f15773a);
                ea0Var.g(y6.o1(0.05f, w02), y6.o1(0.15f, w02), y6.o1(0.1f, w02), y6.o1(0.3f, w02));
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15774b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
