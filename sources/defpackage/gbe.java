package defpackage;

import java.io.IOException;
public final class gbe extends vid {
    private static volatile atd zzbg;
    private static final gbe zzbir;
    private mkd zzbiq = ztd.c;

    static {
        gbe gbeVar = new gbe();
        zzbir = gbeVar;
        vid.c(gbe.class, gbeVar);
    }

    public static gbe f() {
        return zzbir;
    }

    public static gbe g(byte[] bArr) {
        vid vidVar = (vid) zzbir.a(4);
        try {
            ttd ttdVar = ttd.c;
            ttdVar.getClass();
            ttdVar.a(vidVar.getClass()).c(vidVar, bArr, 0, bArr.length, new Object());
            ttdVar.a(vidVar.getClass()).b(vidVar);
            if (vidVar.zzex == 0) {
                boolean z = true;
                byte byteValue = ((Byte) vidVar.a(1)).byteValue();
                if (byteValue != 1) {
                    if (byteValue == 0) {
                        z = false;
                    } else {
                        z = ttdVar.a(vidVar.getClass()).g(vidVar);
                        vidVar.a(2);
                    }
                }
                if (z) {
                    return (gbe) vidVar;
                }
                throw new IOException(new gp2().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof vkd) {
                throw ((vkd) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw vkd.a();
        }
    }

    @Override
    public final Object a(int i) {
        atd atdVar;
        switch (qbe.a[i - 1]) {
            case 1:
                return new gbe();
            case 2:
                return new tid(zzbir);
            case 3:
                return new fud(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", fbe.class});
            case 4:
                return zzbir;
            case 5:
                atd atdVar2 = zzbg;
                if (atdVar2 == null) {
                    synchronized (gbe.class) {
                        atd atdVar3 = zzbg;
                        atdVar = atdVar3;
                        if (atdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            atdVar = obj;
                        }
                    }
                    return atdVar;
                }
                return atdVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                fvc.b();
                break;
        }
        return null;
    }

    public final mkd e() {
        return this.zzbiq;
    }
}
