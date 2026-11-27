package defpackage;

import java.io.IOException;
public final class wle extends s6e {
    private static final wle zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private wne zzh;
    private int zzi;

    static {
        wle wleVar = new wle();
        zzb = wleVar;
        s6e.k(wle.class, wleVar);
    }

    public static wle n(byte[] bArr, d2e d2eVar) {
        wle wleVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            Object obj = (s6e) wleVar.d(4);
            try {
                rfe a = zee.c.a(obj.getClass());
                ?? obj2 = new Object();
                d2eVar.getClass();
                a.a(obj, bArr, 0, length, obj2);
                a.zzf(obj);
                wleVar = obj;
            } catch (j8e e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof j8e) {
                    throw ((j8e) e2.getCause());
                }
                throw new IOException(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (mie e3) {
                p3d.l(e3.getMessage());
                return null;
            }
        }
        if (wleVar != null && !s6e.c(wleVar, true)) {
            p3d.l(new mie().getMessage());
            return null;
        }
        return wleVar;
    }

    public static void p(wle wleVar, uoe uoeVar) {
        wleVar.zzi = uoeVar.a;
        wleVar.zzd |= 4;
    }

    public static void q(wle wleVar, wne wneVar) {
        wleVar.zzh = wneVar;
        wleVar.zzd |= 2;
    }

    public static void r(wle wleVar, wse wseVar) {
        wleVar.zzf = wseVar;
        wleVar.zze = 7;
    }

    public static void s(wle wleVar, uve uveVar) {
        wleVar.zzf = uveVar;
        wleVar.zze = 6;
    }

    public static void t(wle wleVar, int i) {
        wleVar.zzg = i - 1;
        wleVar.zzd |= 1;
    }

    public static kle u() {
        return (kle) zzb.f();
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
                    return new u4e(zzb);
                }
                return new wle();
            }
            return new lfe(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", ovd.c, "zzh", cre.class, "zzi", ovd.e, uve.class, wse.class});
        }
        return (byte) 1;
    }

    public final wse o() {
        if (this.zze == 7) {
            return (wse) this.zzf;
        }
        return wse.o();
    }
}
