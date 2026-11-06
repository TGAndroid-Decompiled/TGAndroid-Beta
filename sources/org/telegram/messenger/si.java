package org.telegram.messenger;

import j$.util.Objects;
public final class si {
    public final boolean f25466a;
    public final String f25467b;
    public final String f25468c;

    public si(String str, String str2, boolean z9) {
        this.f25466a = z9;
        this.f25467b = str;
        this.f25468c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && si.class == obj.getClass()) {
                si siVar = (si) obj;
                if (this.f25466a == siVar.f25466a && Objects.equals(this.f25467b, siVar.f25467b) && Objects.equals(this.f25468c, siVar.f25468c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25466a), this.f25467b, this.f25468c);
    }
}
