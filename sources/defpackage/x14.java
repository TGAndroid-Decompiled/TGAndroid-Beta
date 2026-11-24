package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public abstract class x14 extends d {
    @Override
    public final View createView(Context context) {
        cja cjaVar = new cja(context, null);
        this.fragmentView = cjaVar;
        return cjaVar;
    }
}
