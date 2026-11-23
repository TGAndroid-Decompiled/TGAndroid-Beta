package org.telegram.messenger;

import j$.util.Objects;
public final class qi {
    public final boolean f26460a;
    public final String f26461b;
    public final String f26462c;

    public qi(String str, String str2, boolean z10) {
        this.f26460a = z10;
        this.f26461b = str;
        this.f26462c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qi.class == obj.getClass()) {
                qi qiVar = (qi) obj;
                if (this.f26460a == qiVar.f26460a && Objects.equals(this.f26461b, qiVar.f26461b) && Objects.equals(this.f26462c, qiVar.f26462c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f26460a), this.f26461b, this.f26462c);
    }
}
