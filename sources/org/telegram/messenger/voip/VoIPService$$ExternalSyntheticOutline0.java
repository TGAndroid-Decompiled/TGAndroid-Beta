package org.telegram.messenger.voip;

import android.content.Context;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public abstract class VoIPService$$ExternalSyntheticOutline0 {
    public static BottomSheet m(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        BottomSheet bottomSheet = new BottomSheet(context, resourcesProvider, z, z2);
        bottomSheet.fixNavigationBar();
        return bottomSheet;
    }
}
