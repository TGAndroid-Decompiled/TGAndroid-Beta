package bf;

import android.app.Activity;
import android.view.View;
import j3.f0;
import org.telegram.ui.LaunchActivity;
public final class e {
    public final Activity f1807a;
    public final df.a f1808b;
    public String f1809c;
    public int d;
    public int e = 0;
    public boolean f1810f = false;
    public f0 f1811g;
    public int h;
    public int f1812i;
    public View f1813j;
    public View f1814k;

    public e(Activity activity, df.a aVar) {
        this.f1807a = activity;
        this.f1808b = aVar;
    }

    public final f a() {
        Activity activity = this.f1807a;
        if (activity instanceof cf.a) {
            return new f(((LaunchActivity) ((cf.a) activity)).f31606j0, this);
        }
        return null;
    }
}
