package gh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ra1;

public final class j2 extends FrameLayout {

    public final ra1 f7351a;

    public int f7352b;

    public final org.telegram.ui.Components.y5 f7353c;
    public final ArrayList d;

    public final RectF f7354e;

    public final RectF f7355f;
    public final RectF h;

    public final Paint f7356n;

    public int f7357r;

    public j2(Context context, boolean z10) {
        super(context);
        this.d = new ArrayList();
        this.f7354e = new RectF();
        this.f7355f = new RectF();
        this.h = new RectF();
        this.f7356n = new Paint(1);
        this.f7357r = Integer.MIN_VALUE;
        ra1 ra1Var = new ra1(this, context, 2);
        this.f7351a = ra1Var;
        ra1Var.setClipToPadding(false);
        ra1Var.setClipChildren(false);
        ra1Var.setOrientation(0);
        ra1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        if (z10) {
            addView(ra1Var, h7.z5.e(-2, -1, 1));
        } else {
            ra1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.addView(ra1Var, h7.z5.e(-2, -1, 119));
            addView(horizontalScrollView, h7.z5.e(-1, -1, 119));
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f7353c = new org.telegram.ui.Components.y5(ra1Var, 0L, 320L, er.h);
    }

    public final void a(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z10 = this.f7357r == i10;
        this.f7357r = i10;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        ra1 ra1Var = this.f7351a;
        if (size != size2) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i13 < arrayList.size() ? (CharSequence) arrayList.get(i13) : null;
                if (charSequence == null) {
                    ra1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                p80 p80Var = new p80(getContext(), null);
                p80Var.setGravity(17);
                p80Var.setText((CharSequence) arrayList.get(i13));
                p80Var.setTypeface(AndroidUtilities.bold());
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23017b6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23036c6, false)));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                h7.b6.b(p80Var, 0.075f, 1.4f);
                ra1Var.addView(p80Var, h7.z5.n(-2, 26));
                arrayList2.add(p80Var);
                i13++;
            }
        }
        this.f7352b = i11;
        if (!z10) {
            this.f7353c.d(i11, true);
        }
        ra1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new h2(i14, 0, callback));
        }
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                this.f7351a.invalidate();
                return;
            } else {
                ((TextView) arrayList.get(i10)).setTextColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23017b6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23036c6, false)));
                i10++;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
