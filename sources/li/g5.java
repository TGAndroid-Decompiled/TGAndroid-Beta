package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.kb1;
public final class g5 extends z implements p6, r9 {
    public final u6 f17263n;
    public final g1 f17264r;
    public e5 f17265s;
    public final ArrayList v;
    public boolean f17266w;

    public g5(Context context, u6 u6Var) {
        super(context);
        this.v = new ArrayList();
        this.f17263n = u6Var;
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g1 g1Var = new g1(context, u6Var);
        this.f17264r = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(8388659);
        g1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        g1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        g1Var.setTextColorKey(y6.Oh);
        g1Var.setAccentHint(true);
        g1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        g1Var.setListener(new e3(this, 1));
        g1Var.setDelegate(new jg.e1(this, 12));
        addView(g1Var, kb1.i(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Oh));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s9 s9Var;
        e5 e5Var = this.f17265s;
        if (e5Var != null) {
            s9Var = ((a3) e5Var).f17079a.getTextSelectionHelper();
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
                s9Var.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        g1 g1Var = this.f17264r;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new d5(layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop(), 0));
    }

    public final void g() {
        a aVar;
        e5 e5Var = this.f17265s;
        if (e5Var != null && (aVar = this.f17652a) != null) {
            long j10 = aVar.f17068t;
            TL_iv.RichText f7 = f6.f(this.f17264r.getText());
            v3 v3Var = ((a3) e5Var).f17079a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                v3Var.f17566u3.put(Long.valueOf(j10), f7);
            } else {
                v3Var.f17566u3.remove(Long.valueOf(j10));
            }
        }
    }

    public a getRow() {
        return this.f17652a;
    }

    @Override
    public final void updateColors() {
        g1 g1Var = this.f17264r;
        g1Var.updateColors();
        int i10 = y6.Oh;
        u6 u6Var = this.f17263n;
        g1Var.setTextColor(y6.w0(i10, u6Var));
        g1Var.setHintTextColor(y6.o1(0.5f, y6.w0(i10, u6Var)));
    }
}
