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
public final class h5 extends a0 implements org.telegram.ui.ActionBar.x5, n9 {
    public final org.telegram.ui.ActionBar.c6 f12462n;
    public final i1 f12463r;
    public f5 f12464s;
    public final ArrayList v;
    public boolean f12465w;

    public h5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = new ArrayList();
        this.f12462n = c6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, c6Var);
        this.f12463r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        i1Var.setTextColorKey(org.telegram.ui.ActionBar.h6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new a4.l(this, 24));
        i1Var.setDelegate(new ei.c5(this, 19));
        addView(i1Var, w7.w5.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        f5 f5Var = this.f12464s;
        if (f5Var != null) {
            o9Var = ((c3) f5Var).f12317a.getTextSelectionHelper();
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
        i1 i1Var = this.f12463r;
        i1Var.t();
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f12462n;
        i1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.f12463r;
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
        return this.f12249a;
    }

    public final void h() {
        a aVar;
        f5 f5Var = this.f12464s;
        if (f5Var != null && (aVar = this.f12249a) != null) {
            long j3 = aVar.f12248t;
            TL_iv.RichText f7 = g6.f(this.f12463r.getText());
            x3 x3Var = ((c3) f5Var).f12317a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                x3Var.f12816k3.put(Long.valueOf(j3), f7);
            } else {
                x3Var.f12816k3.remove(Long.valueOf(j3));
            }
        }
    }
}
