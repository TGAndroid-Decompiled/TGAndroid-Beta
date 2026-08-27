package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class a extends FrameLayout {

    public final lh.d f5382a;

    public final View f5383b;

    public final c6 f5384c;
    public final Paint d;

    public boolean f5385e;

    public a(Context context, c6 c6Var) {
        super(context);
        this.d = new Paint(1);
        this.f5384c = c6Var;
        View view = new View(context);
        this.f5383b = view;
        addView(view, z5.n(-1, -1));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f5382a = dVar;
        addView(dVar, z5.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.f5385e = true;
        lh.d dVar = this.f5382a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f5383b.setBackgroundColor(g6.v0(g6.f23124h5, this.f5384c));
    }

    public final void b(boolean z10) {
        this.f5382a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5385e) {
            int iV0 = g6.v0(g6.f22999a7, this.f5384c);
            Paint paint = this.d;
            paint.setColor(iV0);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f5385e = false;
        lh.d dVar = this.f5382a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f5385e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.f5385e = false;
        lh.d dVar = this.f5382a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(z10 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5382a.setOnClickListener(onClickListener);
    }
}
