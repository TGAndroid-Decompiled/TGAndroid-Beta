package ii;

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
public final class h5 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.e6 f11407n;
    public final i1 f11408r;
    public f5 f11409s;
    public final ArrayList v;
    public boolean f11410w;

    public h5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = new ArrayList();
        this.f11407n = e6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, e6Var);
        this.f11408r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        i1Var.setTextColorKey(org.telegram.ui.ActionBar.i6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new a4.m(this, 22));
        i1Var.setDelegate(new ei.d5(this, 19));
        addView(i1Var, w7.y5.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        f5 f5Var = this.f11409s;
        if (f5Var != null) {
            q9Var = ((c3) f5Var).f11272a.getTextSelectionHelper();
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
    public final void e() {
        i1 i1Var = this.f11408r;
        i1Var.t();
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11407n;
        i1Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.f11408r;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new e5(layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11210a;
    }

    public final void h() {
        a aVar;
        f5 f5Var = this.f11409s;
        if (f5Var != null && (aVar = this.f11210a) != null) {
            long j3 = aVar.f11209t;
            TL_iv.RichText f7 = g6.f(this.f11408r.getText());
            x3 x3Var = ((c3) f5Var).f11272a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                x3Var.f11739m3.put(Long.valueOf(j3), f7);
            } else {
                x3Var.f11739m3.remove(Long.valueOf(j3));
            }
        }
    }
}
