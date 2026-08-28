package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class a extends FrameLayout {
    public final kh.d f4483a;
    public final View f4484b;
    public final b6 f4485c;
    public final Paint d;
    public boolean f4486e;

    public a(Context context, b6 b6Var) {
        super(context);
        this.d = new Paint(1);
        this.f4485c = b6Var;
        View view = new View(context);
        this.f4484b = view;
        addView(view, e6.n(-1, -1));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f4483a = dVar;
        addView(dVar, e6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i9, boolean z10) {
        this.f4486e = true;
        kh.d dVar = this.f4483a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i9, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f4484b.setBackgroundColor(f6.v0(f6.f23072h5, this.f4485c));
    }

    public final void b(boolean z10) {
        this.f4483a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4486e) {
            int v02 = f6.v0(f6.f22947a7, this.f4485c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f4486e = false;
        kh.d dVar = this.f4483a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f4486e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.f4486e = false;
        kh.d dVar = this.f4483a;
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
        this.f4483a.setOnClickListener(onClickListener);
    }
}
