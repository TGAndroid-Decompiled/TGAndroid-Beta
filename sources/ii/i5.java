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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
public final class i5 extends a0 implements org.telegram.ui.ActionBar.z5, n9 {
    public final org.telegram.ui.ActionBar.e6 f12493n;
    public final i1 f12494r;
    public g5 f12495s;
    public final ArrayList v;
    public boolean f12496w;

    public i5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = new ArrayList();
        this.f12493n = e6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, e6Var);
        this.f12494r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        i1Var.setTextColorKey(org.telegram.ui.ActionBar.i6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new a4.l(this, 24));
        i1Var.setDelegate(new ei.c5(this, 19));
        addView(i1Var, w7.x5.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        g5 g5Var = this.f12495s;
        if (g5Var != null) {
            o9Var = ((c3) g5Var).f12311a.getTextSelectionHelper();
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
    public final void e() {
        i1 i1Var = this.f12494r;
        i1Var.t();
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12493n;
        i1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.f12494r;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f5(layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12251a;
    }

    public final void h() {
        a aVar;
        g5 g5Var = this.f12495s;
        if (g5Var != null && (aVar = this.f12251a) != null) {
            long j3 = aVar.f12250t;
            TL_iv.RichText f7 = h6.f(this.f12494r.getText());
            x3 x3Var = ((c3) g5Var).f12311a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                x3Var.f12818k3.put(Long.valueOf(j3), f7);
            } else {
                x3Var.f12818k3.remove(Long.valueOf(j3));
            }
        }
    }
}
