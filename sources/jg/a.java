package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a extends FrameLayout {
    public final qh.d f10006a;
    public final View f10007b;
    public final g6 f10008c;
    public final Paint d;
    public boolean f10009e;

    public a(Context context, g6 g6Var) {
        super(context);
        this.d = new Paint(1);
        this.f10008c = g6Var;
        View view = new View(context);
        this.f10007b = view;
        addView(view, c6.n(-1, -1));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f10006a = dVar;
        addView(dVar, c6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z4) {
        this.f10009e = true;
        qh.d dVar = this.f10006a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z4);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z4, true);
        this.f10007b.setBackgroundColor(k6.v0(k6.f21733h5, this.f10008c));
    }

    public final void b(boolean z4) {
        this.f10006a.setLoading(z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f10009e) {
            int v02 = k6.v0(k6.f21607a7, this.f10008c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z4) {
        this.f10009e = false;
        qh.d dVar = this.f10006a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f10009e = z4;
    }

    public void setOkStyle(boolean z4) {
        String formatString;
        this.f10009e = false;
        qh.d dVar = this.f10006a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z4) {
            formatString = LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]);
        } else {
            formatString = LocaleController.formatString("OK", R.string.OK, new Object[0]);
        }
        dVar.g(formatString, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10006a.setOnClickListener(onClickListener);
    }
}
