package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;

public abstract class UserNameResolver$$ExternalSyntheticOutline0 {
    public static void m(int i, BulletinFactory bulletinFactory, Theme.ResourcesProvider resourcesProvider) {
        bulletinFactory.createErrorBulletin(LocaleController.getString(i), resourcesProvider).show();
    }
}
