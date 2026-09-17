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
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
public final class j5 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.f6 f13995n;
    public final h1 f13996r;
    public h5 f13997s;
    public final ArrayList v;
    public boolean f13998w;

    public j5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.f13995n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h1 h1Var = new h1(context, f6Var);
        this.f13996r = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        h1Var.setTextColorKey(org.telegram.ui.ActionBar.j6.Oh);
        h1Var.setAccentHint(true);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        h1Var.setListener(new a6.m(this, 28));
        h1Var.setDelegate(new fi.f(this, 28));
        addView(h1Var, w7.x5.e(-1, -2, 51));
        d();
    }

    @Override
    public final void d() {
        h1 h1Var = this.f13996r;
        h1Var.t();
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f13995n;
        h1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        h5 h5Var = this.f13997s;
        if (h5Var != null) {
            q9Var = ((a3) h5Var).f13761a.getTextSelectionHelper();
        } else {
            q9Var = null;
        }
        if (q9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ba baVar = (ba) arrayList.get(i10);
                canvas.save();
                canvas.translate(baVar.getX(), baVar.getY());
                q9Var.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.f13996r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new g5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13749a;
    }

    public final void h() {
        a aVar;
        h5 h5Var = this.f13997s;
        if (h5Var != null && (aVar = this.f13749a) != null) {
            long j3 = aVar.f13748t;
            TL_iv.RichText f7 = i6.f(this.f13996r.getText());
            v3 v3Var = ((a3) h5Var).f13761a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                v3Var.f14257m3.put(Long.valueOf(j3), f7);
            } else {
                v3Var.f14257m3.remove(Long.valueOf(j3));
            }
        }
    }
}
