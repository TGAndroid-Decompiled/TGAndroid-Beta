package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;

public final class c1 extends FrameLayout {

    public final ImageView f312a;

    public final h5 f313b;

    public final w f314c;
    public final h5 d;

    public b1 f315e;

    public a1 f316f;

    public c1(i1 i1Var, Context context, c6 c6Var) {
        super(context);
        setPadding(((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0);
        ImageView imageView = new ImageView(context);
        this.f312a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Lj, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f313b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(g6.v0(g6.f23161j5, c6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, z5.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        w wVar = new w(this, context, c6Var);
        this.f314c = wVar;
        wVar.setWillNotDraw(false);
        wVar.addView(h5Var2, z5.e(-2, -2, 17));
        addView(wVar, z5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f316f != null ? 49.0f : 36.0f), 1073741824));
    }
}
