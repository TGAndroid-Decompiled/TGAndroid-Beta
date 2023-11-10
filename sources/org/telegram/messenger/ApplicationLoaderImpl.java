package org.telegram.messenger;
public class ApplicationLoaderImpl extends ApplicationLoader {
    @Override
    protected String onGetApplicationId() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }
}
