package lh;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d2 implements View.OnClickListener {
    public final int f12663a;
    public final Utilities.Callback f12664b;
    public final int f12665c;

    public d2(int i10, int i11, Utilities.Callback callback) {
        this.f12663a = i11;
        this.f12664b = callback;
        this.f12665c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12663a) {
            case 0:
                Utilities.Callback callback = this.f12664b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f12665c));
                    return;
                }
                return;
            default:
                this.f12664b.run(Integer.valueOf(this.f12665c));
                return;
        }
    }
}
