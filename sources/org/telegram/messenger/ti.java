package org.telegram.messenger;

import j$.util.Objects;
public final class ti {
    public final boolean f18266a;
    public final String f18267b;
    public final String f18268c;

    public ti(String str, String str2, boolean z10) {
        this.f18266a = z10;
        this.f18267b = str;
        this.f18268c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ti.class == obj.getClass()) {
                ti tiVar = (ti) obj;
                if (this.f18266a == tiVar.f18266a && Objects.equals(this.f18267b, tiVar.f18267b) && Objects.equals(this.f18268c, tiVar.f18268c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f18266a), this.f18267b, this.f18268c);
    }
}
