package jf;

import android.app.Activity;
import android.view.View;
import i2.i0;
import org.telegram.ui.LaunchActivity;
public final class e {
    public final Activity f9852a;
    public final lf.a f9853b;
    public String f9854c;
    public int d;
    public int e = 0;
    public boolean f9855f = false;
    public i0 f9856g;
    public int h;
    public int f9857i;
    public View f9858j;
    public View f9859k;

    public e(Activity activity, lf.a aVar) {
        this.f9852a = activity;
        this.f9853b = aVar;
    }

    public final f a() {
        Activity activity = this.f9852a;
        if (activity instanceof kf.a) {
            return new f(((LaunchActivity) ((kf.a) activity)).m0, this);
        }
        return null;
    }
}
