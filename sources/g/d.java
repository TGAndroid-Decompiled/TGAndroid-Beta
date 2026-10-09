package g;

import android.widget.ArrayAdapter;
public final class d extends ArrayAdapter {
    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final boolean hasStableIds() {
        return true;
    }
}
