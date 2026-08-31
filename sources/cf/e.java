package cf;

import android.app.Activity;
import android.view.View;
import j3.f0;
import org.telegram.ui.LaunchActivity;
public final class e {
    public final Activity f2480a;
    public final ef.a f2481b;
    public String f2482c;
    public int d;
    public int f2483e = 0;
    public boolean f2484f = false;
    public f0 f2485g;
    public int h;
    public int f2486i;
    public View f2487j;
    public View f2488k;

    public e(Activity activity, ef.a aVar) {
        this.f2480a = activity;
        this.f2481b = aVar;
    }

    public final f a() {
        Activity activity = this.f2480a;
        if (activity instanceof df.a) {
            return new f(((LaunchActivity) ((df.a) activity)).f34154j0, this);
        }
        return null;
    }
}
