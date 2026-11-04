package org.telegram.messenger;
public final class qo {
    public final int f24922a;
    public final int f24923b;

    public qo(int i3, int i10) {
        this.f24922a = i3;
        this.f24923b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        if (this.f24922a != qoVar.f24922a || this.f24923b != qoVar.f24923b) {
            return false;
        }
        return true;
    }
}
