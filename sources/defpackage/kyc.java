package defpackage;
public class kyc {
    public static final gyc c;
    public static final hyc d;
    public static final iyc e;
    public static final kyc[] f;
    public final lyc a;
    public final byte b;
    kyc EF0;
    kyc EF1;
    kyc EF2;

    static {
        kyc kycVar = new kyc("DOUBLE", 0, lyc.d, 1);
        kyc kycVar2 = new kyc("FLOAT", 1, lyc.c, 5);
        lyc lycVar = lyc.b;
        kyc kycVar3 = new kyc("INT64", 2, lycVar, 0);
        kyc kycVar4 = new kyc("UINT64", 3, lycVar, 0);
        lyc lycVar2 = lyc.a;
        kyc kycVar5 = new kyc("INT32", 4, lycVar2, 0);
        kyc kycVar6 = new kyc("FIXED64", 5, lycVar, 1);
        kyc kycVar7 = new kyc("FIXED32", 6, lycVar2, 5);
        kyc kycVar8 = new kyc("BOOL", 7, lyc.e, 0);
        ?? kycVar9 = new kyc("STRING", 8, lyc.f, 2);
        c = kycVar9;
        lyc lycVar3 = lyc.r;
        ?? kycVar10 = new kyc("GROUP", 9, lycVar3, 3);
        d = kycVar10;
        ?? kycVar11 = new kyc("MESSAGE", 10, lycVar3, 2);
        e = kycVar11;
        f = new kyc[]{kycVar, kycVar2, kycVar3, kycVar4, kycVar5, kycVar6, kycVar7, kycVar8, kycVar9, kycVar10, kycVar11, new kyc("BYTES", 11, lyc.h, 2), new kyc("UINT32", 12, lycVar2, 0), new kyc("ENUM", 13, lyc.n, 0), new kyc("SFIXED32", 14, lycVar2, 5), new kyc("SFIXED64", 15, lycVar, 1), new kyc("SINT32", 16, lycVar2, 0), new kyc("SINT64", 17, lycVar, 0)};
    }

    public kyc(String str, int i, lyc lycVar, int i2) {
        this.a = lycVar;
        this.b = i2;
    }

    public static kyc valueOf(String str) {
        return (kyc) Enum.valueOf(kyc.class, str);
    }

    public static kyc[] values() {
        return (kyc[]) f.clone();
    }
}
