package org.telegram.messenger;

import j$.util.Objects;
public final class si {
    public final boolean f25480a;
    public final String f25481b;
    public final String f25482c;

    public si(String str, String str2, boolean z9) {
        this.f25480a = z9;
        this.f25481b = str;
        this.f25482c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && si.class == obj.getClass()) {
                si siVar = (si) obj;
                if (this.f25480a == siVar.f25480a && Objects.equals(this.f25481b, siVar.f25481b) && Objects.equals(this.f25482c, siVar.f25482c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25480a), this.f25481b, this.f25482c);
    }
}
