package kg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.y5;
public final class n extends y5 {
    public final Bitmap f13787a;

    public n(s sVar) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Bitmap.Config.ARGB_8888);
        this.f13787a = createBitmap;
        Drawable mutate = sVar.getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        super.draw(canvas, charSequence, i10, i11, f9, i12, i13, i14, paint);
        canvas.save();
        canvas.translate(f9, ((i12 + i14) / 2.0f) - AndroidUtilities.dp(12.0f));
        float f10 = this.extraScale;
        canvas.scale(f10, f10, f9 + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        canvas.drawBitmap(this.f13787a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(5.0f) + super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
