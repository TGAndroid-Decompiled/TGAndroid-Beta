package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
public final class j5 extends b0 implements org.telegram.ui.ActionBar.a6, r9 {
    public final org.telegram.ui.ActionBar.f6 f9679n;
    public final k1 f9680r;
    public h5 f9681s;
    public final ArrayList v;
    public boolean f9682w;

    public j5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.f9679n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        k1 k1Var = new k1(context, f6Var);
        this.f9680r = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        k1Var.setAllowNewlines(false);
        k1Var.setInputType(147457);
        k1Var.setGravity(8388659);
        k1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        k1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        k1Var.setTextColorKey(org.telegram.ui.ActionBar.j6.Oh);
        k1Var.setAccentHint(true);
        k1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        k1Var.setListener(new a6.i(this, 24));
        k1Var.setDelegate(new y1(this, 4));
        addView(k1Var, w7.a6.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s9 s9Var;
        h5 h5Var = this.f9681s;
        if (h5Var != null) {
            s9Var = ((e3) h5Var).f9542a.getTextSelectionHelper();
        } else {
            s9Var = null;
        }
        if (s9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                da daVar = (da) arrayList.get(i10);
                canvas.save();
                canvas.translate(daVar.getX(), daVar.getY());
                s9Var.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        k1 k1Var = this.f9680r;
        k1Var.t();
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9679n;
        k1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        k1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        k1 k1Var = this.f9680r;
        Layout layout = k1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new g5(layout, k1Var.getPaddingLeft() + k1Var.getLeft(), k1Var.getPaddingTop() + k1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f9464a;
    }

    public final void h() {
        a aVar;
        h5 h5Var = this.f9681s;
        if (h5Var != null && (aVar = this.f9464a) != null) {
            long j3 = aVar.f9436t;
            TL_iv.RichText f7 = i6.f(this.f9680r.getText());
            z3 z3Var = ((e3) h5Var).f9542a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                z3Var.f10009m3.put(Long.valueOf(j3), f7);
            } else {
                z3Var.f10009m3.remove(Long.valueOf(j3));
            }
        }
    }
}
