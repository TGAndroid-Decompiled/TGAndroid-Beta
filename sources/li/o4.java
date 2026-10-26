package li;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.gb1;
public final class o4 extends z implements p6, r9, k0 {
    public static final int M = 0;
    public final Drawable E;
    public final View F;
    public m4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final j0 L;
    public final int f17392n;
    public final u6 f17393r;
    public final Paint f17394s;
    public final Paint v;
    public final Paint f17395w;
    public final TextPaint f17396x;
    public final ImageReceiver f17397y;

    public o4(Context context, int i10, u6 u6Var) {
        super(context);
        this.f17394s = new Paint(1);
        this.v = new Paint(1);
        this.f17395w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f17396x = textPaint;
        this.f17392n = i10;
        this.f17393r = u6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f17397y = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new ig.d0(this, 11));
        addView(view, gb1.i(-1, -2, 51));
        j0 j0Var = new j0(context, u6Var, new jg.i(this));
        this.L = j0Var;
        addView(j0Var.f17306a, gb1.i(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f17653a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23586pe));
        hashSet.add(Integer.valueOf(y6.Gd));
        hashSet.add(Integer.valueOf(y6.f23682uf));
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override
    public final void b() {
        this.L.i();
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.L.c(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    public final void g(a aVar, m4 m4Var) {
        this.f17653a = aVar;
        this.G = m4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public g1 getCaptionEditText() {
        return this.L.f17306a;
    }

    @Override
    public a getRow() {
        return this.f17653a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.f17397y;
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
                    int i13 = MessagesController.getInstance(this.f17392n).mapProvider;
                    this.H = i13;
                    if (i13 == 2) {
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.f17392n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
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
        this.f17397y.onAttachedToWindow();
        this.I = null;
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17397y.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        s9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.f17397y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.f17394s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.E;
            if (drawable != null) {
                int x9 = org.telegram.ui.d3.x(2, centerX, drawable);
                int i10 = org.telegram.ui.d3.i(2, centerY, drawable);
                drawable.setBounds(x9, i10, drawable.getIntrinsicWidth() + x9, drawable.getIntrinsicHeight() + i10);
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
        m4 m4Var = this.G;
        if (m4Var != null && (textSelectionHelper = ((r3) m4Var).f17443a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f25410p0 && R <= textSelectionHelper.f25413s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.f17395w);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.f17397y.setImageCoords(paddingLeft, getPaddingTop(), max, this.K);
        int paddingTop = getPaddingTop() + this.K;
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.L.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.K);
        h();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f22252w > 0 && map.h > 0) {
            this.K = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.f22252w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.K = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }

    @Override
    public final void updateColors() {
        int i10 = y6.f23586pe;
        u6 u6Var = this.f17393r;
        this.f17394s.setColor(y6.w0(i10, u6Var));
        this.v.setColor(y6.w0(y6.Gd, u6Var));
        this.f17395w.setColor(y6.w0(y6.f23682uf, u6Var));
        int i11 = y6.G6;
        this.f17396x.setColor(y6.o1(0.5f, y6.w0(i11, u6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(y6.o1(0.5f, y6.w0(i11, u6Var)), PorterDuff.Mode.SRC_IN));
        j0 j0Var = this.L;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
