package defpackage;

import android.view.ViewGroup;
public final class t20 extends ig5 {
    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            try {
                ((ViewGroup) getParent()).removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
