package defpackage;

import android.widget.ArrayAdapter;
public final class rc extends ArrayAdapter {
    @Override
    public final long getItemId(int i) {
        return i;
    }

    @Override
    public final boolean hasStableIds() {
        return true;
    }
}
