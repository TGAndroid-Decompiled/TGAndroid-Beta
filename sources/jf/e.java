package jf;

import android.app.Activity;
import android.view.View;
import i2.i0;
import org.telegram.ui.LaunchActivity;
public final class e {
    public final Activity f9853a;
    public final lf.a f9854b;
    public String f9855c;
    public int d;
    public int e = 0;
    public boolean f9856f = false;
    public i0 f9857g;
    public int h;
    public int f9858i;
    public View f9859j;
    public View f9860k;

    public e(Activity activity, lf.a aVar) {
        this.f9853a = activity;
        this.f9854b = aVar;
    }

    public final f a() {
        Activity activity = this.f9853a;
        if (activity instanceof kf.a) {
            return new f(((LaunchActivity) ((kf.a) activity)).m0, this);
        }
        return null;
    }
}
