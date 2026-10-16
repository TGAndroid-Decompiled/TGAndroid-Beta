package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
public final class l5 extends a0 implements org.telegram.ui.ActionBar.x5, n9 {
    public final org.telegram.ui.ActionBar.c6 f13393n;
    public final h1 f13394r;
    public j5 f13395s;
    public final ArrayList v;
    public boolean f13396w;

    public l5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = new ArrayList();
        this.f13393n = c6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h1 h1Var = new h1(context, c6Var);
        this.f13394r = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        h1Var.setTextColorKey(org.telegram.ui.ActionBar.g6.Oh);
        h1Var.setAccentHint(true);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        h1Var.setListener(new h5(this, 0));
        h1Var.setDelegate(new f1.a(this, 28));
        addView(h1Var, w7.z5.e(-1, -2, 51));
        d();
    }

    @Override
    public final void d() {
        h1 h1Var = this.f13394r;
        h1Var.t();
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13393n;
        h1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        j5 j5Var = this.f13395s;
        if (j5Var != null) {
            o9Var = ((c3) j5Var).f13176a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                z9 z9Var = (z9) arrayList.get(i10);
                canvas.save();
                canvas.translate(z9Var.getX(), z9Var.getY());
                o9Var.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.f13394r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new i5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13123a;
    }

    public final void h() {
        a aVar;
        j5 j5Var = this.f13395s;
        if (j5Var != null && (aVar = this.f13123a) != null) {
            long j10 = aVar.f13122t;
            TL_iv.RichText f7 = k6.f(this.f13394r.getText());
            x3 x3Var = ((c3) j5Var).f13176a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                x3Var.f13640k3.put(Long.valueOf(j10), f7);
            } else {
                x3Var.f13640k3.remove(Long.valueOf(j10));
            }
        }
    }
}
