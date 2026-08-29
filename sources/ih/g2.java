package ih;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import i7.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ua1;
public final class g2 extends FrameLayout {
    public final ua1 f9179a;
    public int f9180b;
    public final org.telegram.ui.Components.d6 f9181c;
    public final ArrayList d;
    public final RectF f9182e;
    public final RectF f9183f;
    public final RectF h;
    public final Paint f9184n;
    public int f9185r;

    public g2(Context context, boolean z10) {
        super(context);
        this.d = new ArrayList();
        this.f9182e = new RectF();
        this.f9183f = new RectF();
        this.h = new RectF();
        this.f9184n = new Paint(1);
        this.f9185r = Integer.MIN_VALUE;
        ua1 ua1Var = new ua1(this, context, 2);
        this.f9179a = ua1Var;
        ua1Var.setClipToPadding(false);
        ua1Var.setClipChildren(false);
        ua1Var.setOrientation(0);
        ua1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        if (z10) {
            addView(ua1Var, i7.f6.e(-2, -1, 1));
        } else {
            ua1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.addView(ua1Var, i7.f6.e(-2, -1, 119));
            addView(horizontalScrollView, i7.f6.e(-1, -1, 119));
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f9181c = new org.telegram.ui.Components.d6(ua1Var, 0L, 320L, jr.h);
    }

    public final void a(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z10;
        if (this.f9185r == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9185r = i10;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        ua1 ua1Var = this.f9179a;
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
                    ua1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                y80 y80Var = new y80(getContext(), null);
                y80Var.setGravity(17);
                y80Var.setText((CharSequence) arrayList.get(i13));
                y80Var.setTypeface(AndroidUtilities.bold());
                y80Var.setTextColor(g6.v(g6.w0(null, g6.f23027b6, false), g6.w0(null, g6.c6, false)));
                y80Var.setTextSize(1, 14.0f);
                y80Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                y80Var.setEllipsize(TextUtils.TruncateAt.END);
                y80Var.setSingleLine();
                y80Var.setMaxLines(1);
                h6.b(y80Var, 0.075f, 1.4f);
                ua1Var.addView(y80Var, i7.f6.n(-2, 26));
                arrayList2.add(y80Var);
                i13++;
            }
        }
        this.f9180b = i11;
        if (!z10) {
            this.f9181c.d(i11, true);
        }
        ua1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new e2(i14, 0, callback));
        }
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((TextView) arrayList.get(i10)).setTextColor(g6.v(g6.w0(null, g6.f23027b6, false), g6.w0(null, g6.c6, false)));
                i10++;
            } else {
                this.f9179a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
