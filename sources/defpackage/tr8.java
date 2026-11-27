package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class tr8 extends View {
    public int a;
    public int b;
    public final wr8 c;

    public tr8(wr8 wr8Var, Context context) {
        super(context);
        this.c = wr8Var;
        this.a = 0;
        this.b = 0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3 = this.b;
        ProfileActivity profileActivity = this.c.e;
        int i4 = 0;
        if (i3 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = profileActivity.a.getChildAt(i6);
                profileActivity.a.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0 && S != profileActivity.D3) {
                    i5 += profileActivity.a.getChildAt(i6).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - a.getCurrentActionBarHeight()) - hl.m) - i5;
            if (currentActionBarHeight > profileActivity.d2()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i4 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.a.getMeasuredWidth();
            this.a = i4;
            setMeasuredDimension(measuredWidth, i4);
            return;
        }
        setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
    }
}
