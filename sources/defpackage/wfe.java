package defpackage;

import java.io.IOException;
public final class wfe extends mnd {
    private static volatile qxd zzbg;
    private static final wfe zzbir;
    private dpd zzbiq = pyd.c;

    static {
        wfe wfeVar = new wfe();
        zzbir = wfeVar;
        mnd.c(wfe.class, wfeVar);
    }

    public static wfe f() {
        return zzbir;
    }

    public static wfe g(byte[] bArr) {
        mnd mndVar = (mnd) zzbir.a(4);
        try {
            jyd jydVar = jyd.c;
            jydVar.getClass();
            jydVar.a(mndVar.getClass()).c(mndVar, bArr, 0, bArr.length, new Object());
            jydVar.a(mndVar.getClass()).b(mndVar);
            if (mndVar.zzex == 0) {
                boolean z = true;
                byte byteValue = ((Byte) mndVar.a(1)).byteValue();
                if (byteValue != 1) {
                    if (byteValue == 0) {
                        z = false;
                    } else {
                        z = jydVar.a(mndVar.getClass()).g(mndVar);
                        mndVar.a(2);
                    }
                }
                if (z) {
                    return (wfe) mndVar;
                }
                throw new IOException(new zp2().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof mpd) {
                throw ((mpd) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw mpd.a();
        }
    }

    @Override
    public final Object a(int i) {
        qxd qxdVar;
        switch (gge.a[i - 1]) {
            case 1:
                return new wfe();
            case 2:
                return new knd(zzbir);
            case 3:
                return new vyd(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", vfe.class});
            case 4:
                return zzbir;
            case 5:
                qxd qxdVar2 = zzbg;
                if (qxdVar2 == null) {
                    synchronized (wfe.class) {
                        qxd qxdVar3 = zzbg;
                        qxdVar = qxdVar3;
                        if (qxdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            qxdVar = obj;
                        }
                    }
                    return qxdVar;
                }
                return qxdVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                p3d.a();
                break;
        }
        return null;
    }

    public final dpd e() {
        return this.zzbiq;
    }
}
