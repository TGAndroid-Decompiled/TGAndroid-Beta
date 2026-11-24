package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ProfileActivity;
public final class vo8 extends TextView implements tjb {
    public final ProfileActivity a;

    public vo8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        setTextColor(bkb.v0(bkb.F6, this.a.A0));
    }
}
