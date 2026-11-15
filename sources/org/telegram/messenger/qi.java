package org.telegram.messenger;

import j$.util.Objects;
public final class qi {
    public final boolean f26098a;
    public final String f26099b;
    public final String f26100c;

    public qi(String str, String str2, boolean z10) {
        this.f26098a = z10;
        this.f26099b = str;
        this.f26100c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qi.class == obj.getClass()) {
                qi qiVar = (qi) obj;
                if (this.f26098a == qiVar.f26098a && Objects.equals(this.f26099b, qiVar.f26099b) && Objects.equals(this.f26100c, qiVar.f26100c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26098a), this.f26099b, this.f26100c);
    }
}
