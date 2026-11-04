package org.telegram.messenger;

import j$.util.Objects;
public final class ji {
    public final boolean f23673a;
    public final String f23674b;
    public final String f23675c;

    public ji(String str, String str2, boolean z10) {
        this.f23673a = z10;
        this.f23674b = str;
        this.f23675c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ji.class == obj.getClass()) {
                ji jiVar = (ji) obj;
                if (this.f23673a == jiVar.f23673a && Objects.equals(this.f23674b, jiVar.f23674b) && Objects.equals(this.f23675c, jiVar.f23675c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f23673a), this.f23674b, this.f23675c);
    }
}
