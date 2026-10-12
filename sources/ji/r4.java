package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
public final class r4 extends a0 implements org.telegram.ui.ActionBar.x5, n9, l0 {
    public static final int M = 0;
    public final Drawable E;
    public final View F;
    public p4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final k0 L;
    public final int f13498n;
    public final org.telegram.ui.ActionBar.c6 f13499r;
    public final Paint f13500s;
    public final Paint v;
    public final Paint f13501w;
    public final TextPaint f13502x;
    public final ImageReceiver f13503y;

    public r4(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13500s = new Paint(1);
        this.v = new Paint(1);
        this.f13501w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f13502x = textPaint;
        this.f13498n = i10;
        this.f13499r = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f13503y = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new o4(this, 0));
        addView(view, w7.a6.e(-1, -2, 51));
        k0 k0Var = new k0(context, c6Var, new qb.c(this, 28));
        this.L = k0Var;
        addView(k0Var.f13367a, w7.a6.e(-2, -2, 51));
        d();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f13119a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13103b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.L.f(i10, i11);
    }

    @Override
    public final void b() {
        this.L.i();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.pe;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13499r;
        this.f13500s.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.v.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gd, c6Var));
        this.f13501w.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20224uf, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        this.f13502x.setColor(org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)), PorterDuff.Mode.SRC_IN));
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.L.c(canvas);
    }

    @Override
    public final int e() {
        return 0;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    @Override
    public h1 getCaptionEditText() {
        return this.L.f13367a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f13119a;
    }

    public final void h(a aVar, p4 p4Var) {
        this.f13119a = aVar;
        this.G = p4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.f13503y;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.K;
            if (measuredWidth > 0 && i10 > 0) {
                float f7 = AndroidUtilities.density;
                int i11 = (int) (measuredWidth / f7);
                int i12 = (int) (i10 / f7);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
                if (!str.equals(this.I)) {
                    this.I = str;
                    int i13 = MessagesController.getInstance(this.f13498n).mapProvider;
                    this.H = i13;
                    if (i13 == 2) {
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f13498n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.setImageBitmap((Drawable) null);
        this.I = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13503y.onAttachedToWindow();
        this.I = null;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13503y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        o9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f13503y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f13500s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.E;
            if (drawable != null) {
                int u10 = org.telegram.ui.Cells.d0.u(2, centerX, drawable);
                int d = org.telegram.ui.Cells.d0.d(2, centerY, drawable);
                drawable.setBounds(u10, d, drawable.getIntrinsicWidth() + u10, drawable.getIntrinsicHeight() + d);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.H == 2 && imageReceiver.hasNotThumb()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.J.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.J.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.J.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.J.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.J.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        p4 p4Var = this.G;
        if (p4Var != null && (textSelectionHelper = ((t3) p4Var).f13526a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f21637p0 && R <= textSelectionHelper.f21640s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.f13501w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.f13503y.setImageCoords(paddingLeft, getPaddingTop(), max, this.K);
        int paddingTop = getPaddingTop() + this.K;
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.L.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.K);
        i();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f19437w > 0 && map.h > 0) {
            this.K = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.f19437w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.K = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }
}
