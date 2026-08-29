package ih;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e2 implements View.OnClickListener {
    public final int f9118a;
    public final Utilities.Callback f9119b;
    public final int f9120c;

    public e2(int i10, int i11, Utilities.Callback callback) {
        this.f9118a = i11;
        this.f9119b = callback;
        this.f9120c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9118a) {
            case 0:
                Utilities.Callback callback = this.f9119b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f9120c));
                    return;
                }
                return;
            default:
                this.f9119b.run(Integer.valueOf(this.f9120c));
                return;
        }
    }
}
