package org.telegram.messenger;

import j$.util.Objects;
public final class qi {
    public final boolean f26424a;
    public final String f26425b;
    public final String f26426c;

    public qi(String str, String str2, boolean z10) {
        this.f26424a = z10;
        this.f26425b = str;
        this.f26426c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qi.class == obj.getClass()) {
                qi qiVar = (qi) obj;
                if (this.f26424a == qiVar.f26424a && Objects.equals(this.f26425b, qiVar.f26425b) && Objects.equals(this.f26426c, qiVar.f26426c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26424a), this.f26425b, this.f26426c);
    }
}
