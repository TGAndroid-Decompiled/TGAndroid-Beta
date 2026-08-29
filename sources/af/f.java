package af;

import android.app.Activity;
import android.view.View;
import j3.k0;
import org.telegram.ui.LaunchActivity;
public final class f {
    public final Activity f386a;
    public final cf.a f387b;
    public String f388c;
    public int d;
    public int f389e = 0;
    public boolean f390f = false;
    public k0 f391g;
    public int h;
    public int f392i;
    public View f393j;
    public View f394k;

    public f(Activity activity, cf.a aVar) {
        this.f386a = activity;
        this.f387b = aVar;
    }

    public final g a() {
        Activity activity = this.f386a;
        if (activity instanceof bf.a) {
            return new g(((LaunchActivity) ((bf.a) activity)).f35579i0, this);
        }
        return null;
    }
}
