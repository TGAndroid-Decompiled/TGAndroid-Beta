package org.telegram.messenger;

import j$.util.Objects;
public final class pi {
    public final boolean f26253a;
    public final String f26254b;
    public final String f26255c;

    public pi(String str, String str2, boolean z10) {
        this.f26253a = z10;
        this.f26254b = str;
        this.f26255c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pi.class == obj.getClass()) {
                pi piVar = (pi) obj;
                if (this.f26253a == piVar.f26253a && Objects.equals(this.f26254b, piVar.f26254b) && Objects.equals(this.f26255c, piVar.f26255c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26253a), this.f26254b, this.f26255c);
    }
}
