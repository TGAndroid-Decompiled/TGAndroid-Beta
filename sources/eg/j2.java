package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
public abstract class j2 extends rl0 implements NotificationCenter.NotificationCenterDelegate, x0 {
    public final ArrayList U2;
    public final f2.i0 V2;
    public boolean W2;
    public boolean X2;
    public final int Y2;
    public boolean Z2;
    public boolean f5308a3;
    public final androidx.activity.i f5309b3;
    public final mr c3;
    public final ArrayList f5310d3;
    public final e5.e f5311e3;
    public View f5312f3;
    public boolean f5313g3;
    public int f5314h3;
    public int f5315i3;
    public boolean f5316j3;
    public boolean f5317k3;

    public j2(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.U2 = arrayList;
        this.W2 = true;
        this.X2 = true;
        g1 g1Var = (g1) this;
        this.f5309b3 = new androidx.activity.i(g1Var, 18);
        this.c3 = new mr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f5310d3 = new ArrayList();
        this.f5311e3 = new e5.e(2);
        this.f5315i3 = -1;
        this.Y2 = i10;
        f2.i0 i0Var = new f2.i0();
        this.V2 = i0Var;
        setLayoutManager(i0Var);
        setAdapter(new g2(g1Var));
        setClipChildren(false);
        setOnScrollListener(new f2(g1Var, 0));
        setOnItemClickListener(new dg.n(g1Var, 3));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.U2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.Y2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f5316j3) {
            ArrayList arrayList = this.f5310d3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                i2 i2Var = (i2) getChildAt(i10);
                float measuredHeight = ((i2Var.getMeasuredHeight() + i2Var.getTop()) + (i2Var.getMeasuredHeight() >> 1)) / (i2Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                i2Var.f5296a = clamp;
                i2Var.f5297b.setTranslationX((1.0f - this.c3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(i2Var);
            }
            Collections.sort(arrayList, this.f5311e3);
            if ((this.X2 || this.f5313g3) && arrayList.size() > 0 && !this.U2.isEmpty()) {
                View view = (View) kf.k0.i(1, arrayList);
                this.f5312f3 = view;
                v1(view, !this.X2);
                this.X2 = false;
                this.f5313g3 = false;
            } else if (this.f5312f3 != kf.k0.i(1, arrayList)) {
                this.f5312f3 = (View) kf.k0.i(1, arrayList);
                if (this.f5308a3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((i2) arrayList.get(i11)).getX(), ((i2) arrayList.get(i11)).getY());
                ((i2) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        w1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.W2 && !this.U2.isEmpty() && getChildCount() > 0) {
            this.W2 = false;
            AndroidUtilities.runOnUIThread(new e3.h(this, 5));
        }
        int i14 = this.f5315i3;
        if (i14 > 0) {
            f2.l1 K = K(i14);
            if (K != null) {
                v1(K.f5774a, false);
            }
            this.f5315i3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f5314h3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f5314h3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z4) {
        if (this.f5317k3 != z4) {
            this.f5317k3 = z4;
            if (z4) {
                w1();
                this.f5313g3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f5309b3);
            v1(null, true);
        }
    }

    public void setOffset(float f10) {
        boolean z4;
        if (Math.abs(f10 / getMeasuredWidth()) < 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f5316j3 != z4) {
            this.f5316j3 = z4;
            invalidate();
        }
    }

    public final void v1(View view, boolean z4) {
        boolean z10;
        if (view != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z2 = z10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            i2 i2Var = (i2) getChildAt(i10);
            if (i2Var == view) {
                i2Var.a(true, true, z4);
            } else {
                i2Var.a(!this.Z2, false, z4);
            }
        }
    }

    public final void w1() {
        if (!this.f5317k3) {
            return;
        }
        androidx.activity.i iVar = this.f5309b3;
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 2700L);
    }
}
