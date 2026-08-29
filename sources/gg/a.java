package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class a extends FrameLayout {
    public final nh.d f7276a;
    public final View f7277b;
    public final c6 f7278c;
    public final Paint d;
    public boolean f7279e;

    public a(Context context, c6 c6Var) {
        super(context);
        this.d = new Paint(1);
        this.f7278c = c6Var;
        View view = new View(context);
        this.f7277b = view;
        addView(view, f6.n(-1, -1));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f7276a = dVar;
        addView(dVar, f6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.f7279e = true;
        nh.d dVar = this.f7276a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f7277b.setBackgroundColor(g6.v0(g6.f23133h5, this.f7278c));
    }

    public final void b(boolean z10) {
        this.f7276a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f7279e) {
            int v02 = g6.v0(g6.f23009a7, this.f7278c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f7279e = false;
        nh.d dVar = this.f7276a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f7279e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.f7279e = false;
        nh.d dVar = this.f7276a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            formatString = LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]);
        } else {
            formatString = LocaleController.formatString("OK", R.string.OK, new Object[0]);
        }
        dVar.g(formatString, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7276a.setOnClickListener(onClickListener);
    }
}
