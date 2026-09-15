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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
public final class g5 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.e6 f11391n;
    public final i1 f11392r;
    public e5 f11393s;
    public final ArrayList v;
    public boolean f11394w;

    public g5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = new ArrayList();
        this.f11391n = e6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, e6Var);
        this.f11392r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        i1Var.setTextColorKey(i6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new a4.m(this, 22));
        i1Var.setDelegate(new ei.d5(this, 20));
        addView(i1Var, w7.x5.e(-1, -2, 51));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        e5 e5Var = this.f11393s;
        if (e5Var != null) {
            q9Var = ((b3) e5Var).f11254a.getTextSelectionHelper();
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
        i1 i1Var = this.f11392r;
        i1Var.t();
        int i10 = i6.Oh;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11391n;
        i1Var.setTextColor(i6.v0(i10, e6Var));
        i1Var.setHintTextColor(i6.l1(0.5f, i6.v0(i10, e6Var)));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.f11392r;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new d5(layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop(), 0));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11217a;
    }

    public final void h() {
        a aVar;
        e5 e5Var = this.f11393s;
        if (e5Var != null && (aVar = this.f11217a) != null) {
            long j3 = aVar.f11216t;
            TL_iv.RichText f7 = f6.f(this.f11392r.getText());
            w3 w3Var = ((b3) e5Var).f11254a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                w3Var.f11719m3.put(Long.valueOf(j3), f7);
            } else {
                w3Var.f11719m3.remove(Long.valueOf(j3));
            }
        }
    }
}
