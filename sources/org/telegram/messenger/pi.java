package org.telegram.messenger;

import j$.util.Objects;
public final class pi {
    public final boolean f26345a;
    public final String f26346b;
    public final String f26347c;

    public pi(String str, String str2, boolean z10) {
        this.f26345a = z10;
        this.f26346b = str;
        this.f26347c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pi.class == obj.getClass()) {
                pi piVar = (pi) obj;
                if (this.f26345a == piVar.f26345a && Objects.equals(this.f26346b, piVar.f26346b) && Objects.equals(this.f26347c, piVar.f26347c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26345a), this.f26346b, this.f26347c);
    }
}
