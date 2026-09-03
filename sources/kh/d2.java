package kh;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d2 implements View.OnClickListener {
    public final int f10646a;
    public final Utilities.Callback f10647b;
    public final int f10648c;

    public d2(int i10, int i11, Utilities.Callback callback) {
        this.f10646a = i11;
        this.f10647b = callback;
        this.f10648c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10646a) {
            case 0:
                Utilities.Callback callback = this.f10647b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f10648c));
                    return;
                }
                return;
            default:
                this.f10647b.run(Integer.valueOf(this.f10648c));
                return;
        }
    }
}
