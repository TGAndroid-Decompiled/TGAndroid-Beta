package org.telegram.messenger;

import j$.util.Objects;
public final class si {
    public final boolean f25484a;
    public final String f25485b;
    public final String f25486c;

    public si(String str, String str2, boolean z9) {
        this.f25484a = z9;
        this.f25485b = str;
        this.f25486c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && si.class == obj.getClass()) {
                si siVar = (si) obj;
                if (this.f25484a == siVar.f25484a && Objects.equals(this.f25485b, siVar.f25485b) && Objects.equals(this.f25486c, siVar.f25486c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25484a), this.f25485b, this.f25486c);
    }
}
