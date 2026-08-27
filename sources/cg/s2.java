package cg;

import org.telegram.messenger.AndroidUtilities;

public final class s2 extends gg.d {
    @Override
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}
