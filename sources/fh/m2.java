package fh;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class m2 implements View.OnClickListener {
    public final int f6621a;
    public final Utilities.Callback f6622b;
    public final int f6623c;

    public m2(int i9, int i10, Utilities.Callback callback) {
        this.f6621a = i10;
        this.f6622b = callback;
        this.f6623c = i9;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6621a) {
            case 0:
                Utilities.Callback callback = this.f6622b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f6623c));
                    return;
                }
                return;
            default:
                this.f6622b.run(Integer.valueOf(this.f6623c));
                return;
        }
    }
}
