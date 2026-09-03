package lh;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d2 implements View.OnClickListener {
    public final int f12665a;
    public final Utilities.Callback f12666b;
    public final int f12667c;

    public d2(int i10, int i11, Utilities.Callback callback) {
        this.f12665a = i11;
        this.f12666b = callback;
        this.f12667c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12665a) {
            case 0:
                Utilities.Callback callback = this.f12666b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f12667c));
                    return;
                }
                return;
            default:
                this.f12666b.run(Integer.valueOf(this.f12667c));
                return;
        }
    }
}
