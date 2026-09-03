package ig;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.mq;
public final class f0 extends z8 {
    public final f6 v;

    public f0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.v = f6Var;
    }

    public void setBackground(boolean z4) {
        int i10;
        Context context = getContext();
        if (z4) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = j6.f19846b7;
        f6 f6Var = this.v;
        mq mqVar = new mq(new ColorDrawable(j6.v0(j6.f19827a7, f6Var)), j6.U0(context, i10, j6.v0(i11, f6Var)), 0, 0);
        mqVar.f27116w = true;
        setBackground(mqVar);
    }
}
