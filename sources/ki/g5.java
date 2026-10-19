package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
public final class g5 extends a0 implements org.telegram.ui.ActionBar.y5, m9 {
    public final org.telegram.ui.ActionBar.d6 f15284n;
    public final h1 f15285r;
    public e5 f15286s;
    public final ArrayList v;
    public boolean f15287w;

    public g5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.v = new ArrayList();
        this.f15284n = d6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h1 h1Var = new h1(context, d6Var);
        this.f15285r = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        h1Var.setTextColorKey(h6.Oh);
        h1Var.setAccentHint(true);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        h1Var.setListener(new k2.w0(this, 3));
        h1Var.setDelegate(new j5.b(this, 8));
        addView(h1Var, w7.z5.e(-1, -2, 51));
        d();
    }

    @Override
    public final void d() {
        h1 h1Var = this.f15285r;
        h1Var.t();
        int i10 = h6.Oh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f15284n;
        h1Var.setTextColor(h6.w0(i10, d6Var));
        h1Var.setHintTextColor(h6.m1(0.5f, h6.w0(i10, d6Var)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        e5 e5Var = this.f15286s;
        if (e5Var != null) {
            n9Var = ((b3) e5Var).f15144a.getTextSelectionHelper();
        } else {
            n9Var = null;
        }
        if (n9Var != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                y9 y9Var = (y9) arrayList.get(i10);
                canvas.save();
                canvas.translate(y9Var.getX(), y9Var.getY());
                n9Var.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.f15285r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new d5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f15111a;
    }

    public final void h() {
        a aVar;
        e5 e5Var = this.f15286s;
        if (e5Var != null && (aVar = this.f15111a) != null) {
            long j10 = aVar.f15110t;
            TL_iv.RichText f7 = e6.f(this.f15285r.getText());
            w3 w3Var = ((b3) e5Var).f15144a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                w3Var.f15602k3.put(Long.valueOf(j10), f7);
            } else {
                w3Var.f15602k3.remove(Long.valueOf(j10));
            }
        }
    }
}
