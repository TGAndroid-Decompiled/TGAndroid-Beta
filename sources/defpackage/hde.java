package defpackage;

import java.io.IOException;
public final class hde extends xkd {
    private static volatile dvd zzbg;
    private static final hde zzbir;
    private omd zzbiq = cwd.c;

    static {
        hde hdeVar = new hde();
        zzbir = hdeVar;
        xkd.c(hde.class, hdeVar);
    }

    public static hde f() {
        return zzbir;
    }

    public static hde g(byte[] bArr) {
        xkd xkdVar = (xkd) zzbir.a(4);
        try {
            wvd wvdVar = wvd.c;
            wvdVar.getClass();
            wvdVar.a(xkdVar.getClass()).c(xkdVar, bArr, 0, bArr.length, new Object());
            wvdVar.a(xkdVar.getClass()).b(xkdVar);
            if (xkdVar.zzex == 0) {
                boolean z = true;
                byte byteValue = ((Byte) xkdVar.a(1)).byteValue();
                if (byteValue != 1) {
                    if (byteValue == 0) {
                        z = false;
                    } else {
                        z = wvdVar.a(xkdVar.getClass()).g(xkdVar);
                        xkdVar.a(2);
                    }
                }
                if (z) {
                    return (hde) xkdVar;
                }
                throw new IOException(new rq2().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof xmd) {
                throw ((xmd) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw xmd.a();
        }
    }

    @Override
    public final Object a(int i) {
        dvd dvdVar;
        switch (rde.a[i - 1]) {
            case 1:
                return new hde();
            case 2:
                return new vkd(zzbir);
            case 3:
                return new iwd(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", gde.class});
            case 4:
                return zzbir;
            case 5:
                dvd dvdVar2 = zzbg;
                if (dvdVar2 == null) {
                    synchronized (hde.class) {
                        dvd dvdVar3 = zzbg;
                        dvdVar = dvdVar3;
                        if (dvdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            dvdVar = obj;
                        }
                    }
                    return dvdVar;
                }
                return dvdVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                gxc.b();
                break;
        }
        return null;
    }

    public final omd e() {
        return this.zzbiq;
    }
}
