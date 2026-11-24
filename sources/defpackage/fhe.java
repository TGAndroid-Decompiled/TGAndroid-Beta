package defpackage;

import java.io.IOException;
public final class fhe extends c2e {
    private static final fhe zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private fje zzh;
    private int zzi;

    static {
        fhe fheVar = new fhe();
        zzb = fheVar;
        c2e.k(fhe.class, fheVar);
    }

    public static fhe n(byte[] bArr, nxd nxdVar) {
        fhe fheVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            Object obj = (c2e) fheVar.d(4);
            try {
                bbe a = jae.c.a(obj.getClass());
                ?? obj2 = new Object();
                nxdVar.getClass();
                a.a(obj, bArr, 0, length, obj2);
                a.zzf(obj);
                fheVar = obj;
            } catch (IOException e) {
                if (e.getCause() instanceof t3e) {
                    throw ((t3e) e.getCause());
                }
                throw new IOException(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (t3e e2) {
                throw e2;
            } catch (vde e3) {
                fvc.h(e3.getMessage());
                return null;
            }
        }
        if (fheVar != null && !c2e.c(fheVar, true)) {
            fvc.h(new vde().getMessage());
            return null;
        }
        return fheVar;
    }

    public static void p(fhe fheVar, dke dkeVar) {
        fheVar.zzi = dkeVar.a;
        fheVar.zzd |= 4;
    }

    public static void q(fhe fheVar, fje fjeVar) {
        fheVar.zzh = fjeVar;
        fheVar.zzd |= 2;
    }

    public static void r(fhe fheVar, eoe eoeVar) {
        fheVar.zzf = eoeVar;
        fheVar.zze = 7;
    }

    public static void s(fhe fheVar, dre dreVar) {
        fheVar.zzf = dreVar;
        fheVar.zze = 6;
    }

    public static void t(fhe fheVar, int i) {
        fheVar.zzg = i - 1;
        fheVar.zzd |= 1;
    }

    public static tge u() {
        return (tge) zzb.f();
    }

    @Override
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new e0e(zzb);
                }
                return new fhe();
            }
            return new vae(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", yqd.c, "zzh", lme.class, "zzi", yqd.e, dre.class, eoe.class});
        }
        return (byte) 1;
    }

    public final eoe o() {
        if (this.zze == 7) {
            return (eoe) this.zzf;
        }
        return eoe.o();
    }
}
