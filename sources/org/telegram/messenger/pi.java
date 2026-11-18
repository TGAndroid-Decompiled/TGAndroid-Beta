package org.telegram.messenger;

import j$.util.Objects;
public final class pi {
    public final boolean f26251a;
    public final String f26252b;
    public final String f26253c;

    public pi(String str, String str2, boolean z10) {
        this.f26251a = z10;
        this.f26252b = str;
        this.f26253c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pi.class == obj.getClass()) {
                pi piVar = (pi) obj;
                if (this.f26251a == piVar.f26251a && Objects.equals(this.f26252b, piVar.f26252b) && Objects.equals(this.f26253c, piVar.f26253c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26251a), this.f26252b, this.f26253c);
    }
}
