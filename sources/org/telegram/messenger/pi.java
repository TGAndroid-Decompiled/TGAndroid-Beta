package org.telegram.messenger;

import j$.util.Objects;
public final class pi {
    public final boolean f26279a;
    public final String f26280b;
    public final String f26281c;

    public pi(String str, String str2, boolean z10) {
        this.f26279a = z10;
        this.f26280b = str;
        this.f26281c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pi.class == obj.getClass()) {
                pi piVar = (pi) obj;
                if (this.f26279a == piVar.f26279a && Objects.equals(this.f26280b, piVar.f26280b) && Objects.equals(this.f26281c, piVar.f26281c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26279a), this.f26280b, this.f26281c);
    }
}
