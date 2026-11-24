package defpackage;

import java.io.IOException;
public final class gje extends f4e {
    private static final gje zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private gle zzh;
    private int zzi;

    static {
        gje gjeVar = new gje();
        zzb = gjeVar;
        f4e.k(gje.class, gjeVar);
    }

    public static gje n(byte[] bArr, qzd qzdVar) {
        gje gjeVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            Object obj = (f4e) gjeVar.d(4);
            try {
                cde a = kce.c.a(obj.getClass());
                ?? obj2 = new Object();
                qzdVar.getClass();
                a.a(obj, bArr, 0, length, obj2);
                a.zzf(obj);
                gjeVar = obj;
            } catch (IOException e) {
                if (e.getCause() instanceof w5e) {
                    throw ((w5e) e.getCause());
                }
                throw new IOException(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (w5e e2) {
                throw e2;
            } catch (wfe e3) {
                i2d.g(e3.getMessage());
                return null;
            }
        }
        if (gjeVar != null && !f4e.c(gjeVar, true)) {
            i2d.g(new wfe().getMessage());
            return null;
        }
        return gjeVar;
    }

    public static void p(gje gjeVar, fme fmeVar) {
        gjeVar.zzi = fmeVar.a;
        gjeVar.zzd |= 4;
    }

    public static void q(gje gjeVar, gle gleVar) {
        gjeVar.zzh = gleVar;
        gjeVar.zzd |= 2;
    }

    public static void r(gje gjeVar, hqe hqeVar) {
        gjeVar.zzf = hqeVar;
        gjeVar.zze = 7;
    }

    public static void s(gje gjeVar, gte gteVar) {
        gjeVar.zzf = gteVar;
        gjeVar.zze = 6;
    }

    public static void t(gje gjeVar, int i) {
        gjeVar.zzg = i - 1;
        gjeVar.zzd |= 1;
    }

    public static uie u() {
        return (uie) zzb.f();
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
                    return new h2e(zzb);
                }
                return new gje();
            }
            return new wce(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", btd.c, "zzh", ooe.class, "zzi", btd.e, gte.class, hqe.class});
        }
        return (byte) 1;
    }

    public final hqe o() {
        if (this.zze == 7) {
            return (hqe) this.zzf;
        }
        return hqe.o();
    }
}
