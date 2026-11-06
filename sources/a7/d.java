package a7;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.b0;
import androidx.mediarouter.app.z;
import s4.v;
public final class d implements View.OnClickListener {
    public final int f302a = 0;
    public final Object f303b;
    public final Object f304c;

    public d(Context context, Intent intent) {
        this.f303b = context;
        this.f304c = intent;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f302a) {
            case 0:
                try {
                    ((Context) this.f303b).startActivity((Intent) this.f304c);
                    return;
                } catch (ActivityNotFoundException e10) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
                    return;
                }
            default:
                z zVar = (z) this.f304c;
                b0 b0Var = zVar.f2839z.f2691r;
                v vVar = (v) this.f303b;
                b0Var.D = vVar;
                vVar.l();
                zVar.f2836w.setVisibility(4);
                zVar.f2837x.setVisibility(0);
                return;
        }
    }

    public d(z zVar, v vVar) {
        this.f304c = zVar;
        this.f303b = vVar;
    }
}
