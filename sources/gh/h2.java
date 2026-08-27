package gh;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class h2 implements View.OnClickListener {

    public final int f7283a;

    public final Utilities.Callback f7284b;

    public final int f7285c;

    public h2(int i10, int i11, Utilities.Callback callback) {
        this.f7283a = i11;
        this.f7284b = callback;
        this.f7285c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7283a) {
            case 0:
                Utilities.Callback callback = this.f7284b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f7285c));
                }
                break;
            default:
                this.f7284b.run(Integer.valueOf(this.f7285c));
                break;
        }
    }
}
