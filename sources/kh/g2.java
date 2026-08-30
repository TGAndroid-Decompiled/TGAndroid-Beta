package kh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.nr;
import org.telegram.ui.hb1;
public final class g2 extends FrameLayout {
    public final hb1 f10617a;
    public int f10618b;
    public final org.telegram.ui.Components.z5 f10619c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f10620f;
    public final RectF h;
    public final Paint f10621n;
    public int f10622r;

    public g2(Context context, boolean z4) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f10620f = new RectF();
        this.h = new RectF();
        this.f10621n = new Paint(1);
        this.f10622r = Integer.MIN_VALUE;
        hb1 hb1Var = new hb1(this, context, 2);
        this.f10617a = hb1Var;
        hb1Var.setClipToPadding(false);
        hb1Var.setClipChildren(false);
        hb1Var.setOrientation(0);
        hb1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        if (z4) {
            addView(hb1Var, k7.b6.e(-2, -1, 1));
        } else {
            hb1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.addView(hb1Var, k7.b6.e(-2, -1, 119));
            addView(horizontalScrollView, k7.b6.e(-1, -1, 119));
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f10619c = new org.telegram.ui.Components.z5(hb1Var, 0L, 320L, nr.h);
    }

    public final void a(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z4;
        if (this.f10622r == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10622r = i10;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        hb1 hb1Var = this.f10617a;
        if (size != size2) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                CharSequence charSequence = null;
                if (i12 >= arrayList2.size()) {
                    break;
                }
                if (i13 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i13);
                }
                if (charSequence == null) {
                    hb1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                e90 e90Var = new e90(getContext(), null);
                e90Var.setGravity(17);
                e90Var.setText((CharSequence) arrayList.get(i13));
                e90Var.setTypeface(AndroidUtilities.bold());
                e90Var.setTextColor(j6.v(j6.w0(null, j6.f19870b6, false), j6.w0(null, j6.f19888c6, false)));
                e90Var.setTextSize(1, 14.0f);
                e90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                e90Var.setEllipsize(TextUtils.TruncateAt.END);
                e90Var.setSingleLine();
                e90Var.setMaxLines(1);
                k7.d6.b(e90Var, 0.075f, 1.4f);
                hb1Var.addView(e90Var, k7.b6.n(-2, 26));
                arrayList2.add(e90Var);
                i13++;
            }
        }
        this.f10618b = i11;
        if (!z4) {
            this.f10619c.d(i11, true);
        }
        hb1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new e2(i14, 0, callback));
        }
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((TextView) arrayList.get(i10)).setTextColor(j6.v(j6.w0(null, j6.f19870b6, false), j6.w0(null, j6.f19888c6, false)));
                i10++;
            } else {
                this.f10617a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
