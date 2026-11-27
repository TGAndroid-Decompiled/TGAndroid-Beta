package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class wbd extends c4 {
    public static final Parcelable.Creator<wbd> CREATOR = new m9d((byte) 19);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final int d;

    public wbd(gfe gfeVar, gfe gfeVar2, gfe gfeVar3, int i) {
        this.a = gfeVar;
        this.b = gfeVar2;
        this.c = gfeVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wbd) {
            wbd wbdVar = (wbd) obj;
            if (vue.a(this.a, wbdVar.a) && vue.a(this.b, wbdVar.b) && vue.a(this.c, wbdVar.c) && this.d == wbdVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] p;
        byte[] p2;
        byte[] bArr = null;
        gfe gfeVar = this.a;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        String b = lsd.b(p);
        gfe gfeVar2 = this.b;
        if (gfeVar2 == null) {
            p2 = null;
        } else {
            p2 = gfeVar2.p();
        }
        String b2 = lsd.b(p2);
        gfe gfeVar3 = this.c;
        if (gfeVar3 != null) {
            bArr = gfeVar3.p();
        }
        String b3 = lsd.b(bArr);
        StringBuilder l = xnb.l("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        l.append(b3);
        l.append(", getPinUvAuthProtocol=");
        return uh9.l(l, this.d, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        byte[] p2;
        int r = bye.r(parcel, 20293);
        byte[] bArr = null;
        gfe gfeVar = this.a;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        bye.c(parcel, 1, p);
        gfe gfeVar2 = this.b;
        if (gfeVar2 == null) {
            p2 = null;
        } else {
            p2 = gfeVar2.p();
        }
        bye.c(parcel, 2, p2);
        gfe gfeVar3 = this.c;
        if (gfeVar3 != null) {
            bArr = gfeVar3.p();
        }
        bye.c(parcel, 3, bArr);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
