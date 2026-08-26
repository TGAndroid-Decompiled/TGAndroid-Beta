package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public abstract class VoIPService$$ExternalSyntheticOutline0 {
    public static BottomSheet m(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheet = new BottomSheet(context, z, z2, resourcesProvider);
        bottomSheet.fixNavigationBar();
        return bottomSheet;
    }
}
