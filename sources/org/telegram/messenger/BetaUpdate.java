package org.telegram.messenger;
public class BetaUpdate {
    public final String changelog;
    public final String version;
    public final int versionCode;

    public BetaUpdate(String str, int i9, String str2) {
        this.version = str;
        this.versionCode = i9;
        this.changelog = str2;
    }

    public boolean higherThan(BetaUpdate betaUpdate) {
        if (betaUpdate != null) {
            if (!SharedConfig.versionBiggerOrEqual(this.version, betaUpdate.version) || this.versionCode <= betaUpdate.versionCode) {
                return false;
            }
            return true;
        }
        return true;
    }
}
