package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

public abstract class d3 extends zk0 implements NotificationCenter.NotificationCenterDelegate, l1 {
    public final ArrayList T2;
    public final f2.k0 U2;
    public boolean V2;
    public boolean W2;
    public final int X2;
    public boolean Y2;
    public boolean Z2;
    public final a8.b a3;

    public final er f335b3;

    public final ArrayList f336c3;

    public final a5.f f337d3;

    public View f338e3;

    public boolean f339f3;

    public int f340g3;

    public int f341h3;

    public boolean f342i3;

    public boolean f343j3;

    public d3(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T2 = arrayList;
        this.V2 = true;
        this.W2 = true;
        w1 w1Var = (w1) this;
        this.a3 = new a8.b(w1Var, 1);
        this.f335b3 = new er(0.0f, 0.5f, 0.5f, 1.0f);
        this.f336c3 = new ArrayList();
        this.f337d3 = new a5.f(2);
        this.f341h3 = -1;
        this.X2 = i10;
        f2.k0 k0Var = new f2.k0();
        this.U2 = k0Var;
        setLayoutManager(k0Var);
        setAdapter(new a3(w1Var));
        setClipChildren(false);
        setOnScrollListener(new z2(w1Var, 0));
        setOnItemClickListener(new p0(w1Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.T2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.X2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f342i3) {
            ArrayList arrayList = this.f336c3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                c3 c3Var = (c3) getChildAt(i10);
                float measuredHeight = ((c3Var.getMeasuredHeight() + c3Var.getTop()) + (c3Var.getMeasuredHeight() >> 1)) / (c3Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float fClamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                c3Var.f319a = fClamp;
                c3Var.f320b.setTranslationX((1.0f - this.f335b3.getInterpolation(fClamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(c3Var);
            }
            Collections.sort(arrayList, this.f337d3);
            if ((this.W2 || this.f339f3) && arrayList.size() > 0 && !this.T2.isEmpty()) {
                View view = (View) i0.a.i(1, arrayList);
                this.f338e3 = view;
                w1(view, !this.W2);
                this.W2 = false;
                this.f339f3 = false;
            } else if (this.f338e3 != i0.a.i(1, arrayList)) {
                this.f338e3 = (View) i0.a.i(1, arrayList);
                if (this.Z2) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((c3) arrayList.get(i11)).getX(), ((c3) arrayList.get(i11)).getY());
                ((c3) arrayList.get(i11)).draw(canvas);
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
        NotificationCenter.getInstance(this.X2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        x1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.X2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V2 && !this.T2.isEmpty() && getChildCount() > 0) {
            this.V2 = false;
            AndroidUtilities.runOnUIThread(new af.e(this, 4));
        }
        int i14 = this.f341h3;
        if (i14 > 0) {
            f2.o1 o1VarK = K(i14);
            if (o1VarK != null) {
                w1(o1VarK.f5789a, false);
            }
            this.f341h3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f340g3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f340g3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f343j3 != z10) {
            this.f343j3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.a3);
                w1(null, true);
            } else {
                x1();
                this.f339f3 = true;
                invalidate();
            }
        }
    }

    @Override
    public void setOffset(float f10) {
        boolean z10 = Math.abs(f10 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.f342i3 != z10) {
            this.f342i3 = z10;
            invalidate();
        }
    }

    public final void w1(View view, boolean z10) {
        this.Y2 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c3 c3Var = (c3) getChildAt(i10);
            if (c3Var == view) {
                c3Var.a(true, true, z10);
            } else {
                c3Var.a(!this.Y2, false, z10);
            }
        }
    }

    public final void x1() {
        if (this.f343j3) {
            a8.b bVar = this.a3;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 2700L);
        }
    }
}
