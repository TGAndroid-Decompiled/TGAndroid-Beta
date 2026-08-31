package lh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ib1;
public final class f2 extends FrameLayout {
    public final ib1 f12733a;
    public int f12734b;
    public final org.telegram.ui.Components.z5 f12735c;
    public final ArrayList d;
    public final RectF f12736e;
    public final RectF f12737f;
    public final RectF h;
    public final Paint f12738n;
    public int f12739r;

    public f2(Context context, boolean z4) {
        super(context);
        this.d = new ArrayList();
        this.f12736e = new RectF();
        this.f12737f = new RectF();
        this.h = new RectF();
        this.f12738n = new Paint(1);
        this.f12739r = Integer.MIN_VALUE;
        ib1 ib1Var = new ib1(this, context, 2);
        this.f12733a = ib1Var;
        ib1Var.setClipToPadding(false);
        ib1Var.setClipChildren(false);
        ib1Var.setOrientation(0);
        ib1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        if (z4) {
            addView(ib1Var, k7.c6.e(-2, -1, 1));
        } else {
            ib1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.addView(ib1Var, k7.c6.e(-2, -1, 119));
            addView(horizontalScrollView, k7.c6.e(-1, -1, 119));
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f12735c = new org.telegram.ui.Components.z5(ib1Var, 0L, 320L, pr.h);
    }

    public final void a(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z4;
        if (this.f12739r == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f12739r = i10;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        ib1 ib1Var = this.f12733a;
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
                    ib1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                g90 g90Var = new g90(getContext(), null);
                g90Var.setGravity(17);
                g90Var.setText((CharSequence) arrayList.get(i13));
                g90Var.setTypeface(AndroidUtilities.bold());
                g90Var.setTextColor(k6.v(k6.w0(null, k6.f21623b6, false), k6.w0(null, k6.f21641c6, false)));
                g90Var.setTextSize(1, 14.0f);
                g90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                g90Var.setEllipsize(TextUtils.TruncateAt.END);
                g90Var.setSingleLine();
                g90Var.setMaxLines(1);
                k7.e6.b(g90Var, 0.075f, 1.4f);
                ib1Var.addView(g90Var, k7.c6.n(-2, 26));
                arrayList2.add(g90Var);
                i13++;
            }
        }
        this.f12734b = i11;
        if (!z4) {
            this.f12735c.d(i11, true);
        }
        ib1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new d2(i14, 0, callback));
        }
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((TextView) arrayList.get(i10)).setTextColor(k6.v(k6.w0(null, k6.f21623b6, false), k6.w0(null, k6.f21641c6, false)));
                i10++;
            } else {
                this.f12733a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
