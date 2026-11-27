package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;
public abstract class s24 extends e {
    @Override
    public final View createView(Context context) {
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        return wmaVar;
    }
}
