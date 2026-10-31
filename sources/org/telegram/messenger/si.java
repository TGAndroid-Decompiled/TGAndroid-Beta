package org.telegram.messenger;

import j$.util.Objects;
public final class si {
    public final boolean f17915a;
    public final String f17916b;
    public final String f17917c;

    public si(String str, String str2, boolean z10) {
        this.f17915a = z10;
        this.f17916b = str;
        this.f17917c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && si.class == obj.getClass()) {
                si siVar = (si) obj;
                if (this.f17915a == siVar.f17915a && Objects.equals(this.f17916b, siVar.f17916b) && Objects.equals(this.f17917c, siVar.f17917c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f17915a), this.f17916b, this.f17917c);
    }
}
