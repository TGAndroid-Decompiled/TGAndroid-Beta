package org.telegram.messenger;

import j$.util.Objects;
public final class si {
    public final boolean f25474a;
    public final String f25475b;
    public final String f25476c;

    public si(String str, String str2, boolean z9) {
        this.f25474a = z9;
        this.f25475b = str;
        this.f25476c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && si.class == obj.getClass()) {
                si siVar = (si) obj;
                if (this.f25474a == siVar.f25474a && Objects.equals(this.f25475b, siVar.f25475b) && Objects.equals(this.f25476c, siVar.f25476c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25474a), this.f25475b, this.f25476c);
    }
}
