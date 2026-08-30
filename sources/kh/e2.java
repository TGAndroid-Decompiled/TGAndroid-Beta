package kh;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e2 implements View.OnClickListener {
    public final int f10556a;
    public final Utilities.Callback f10557b;
    public final int f10558c;

    public e2(int i10, int i11, Utilities.Callback callback) {
        this.f10556a = i11;
        this.f10557b = callback;
        this.f10558c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10556a) {
            case 0:
                Utilities.Callback callback = this.f10557b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f10558c));
                    return;
                }
                return;
            default:
                this.f10557b.run(Integer.valueOf(this.f10558c));
                return;
        }
    }
}
