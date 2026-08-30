package cf;

import android.app.Activity;
import android.view.View;
import j3.f0;
import org.telegram.ui.LaunchActivity;
public final class e {
    public final Activity f2285a;
    public final ef.a f2286b;
    public String f2287c;
    public int d;
    public int e = 0;
    public boolean f2288f = false;
    public f0 f2289g;
    public int h;
    public int f2290i;
    public View f2291j;
    public View f2292k;

    public e(Activity activity, ef.a aVar) {
        this.f2285a = activity;
        this.f2286b = aVar;
    }

    public final f a() {
        Activity activity = this.f2285a;
        if (activity instanceof df.a) {
            return new f(((LaunchActivity) ((df.a) activity)).f31632j0, this);
        }
        return null;
    }
}
