package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;
public abstract class k2f {
    public static final sfe a(hge hgeVar) {
        long j;
        try {
            w9c d = hgeVar.d();
            if (d != null) {
                try {
                    byte b = d.b;
                    byte b2 = d.a;
                    int i = 0;
                    if (b2 != Byte.MIN_VALUE) {
                        if (b2 != -96) {
                            if (b2 != -64) {
                                if (b2 != -32) {
                                    if (b2 != 0 && b2 != 32) {
                                        if (b2 != 64) {
                                            if (b2 == 96) {
                                                hgeVar.h((byte) 96);
                                                String str = new String(hgeVar.j(), StandardCharsets.UTF_8);
                                                b(b, str.length());
                                                return new hfe(str);
                                            }
                                            throw new IOException("Unidentifiable major type: " + ((b2 >> 5) & 7));
                                        }
                                        hgeVar.h((byte) 64);
                                        byte[] j2 = hgeVar.j();
                                        int length = j2.length;
                                        b(b, length);
                                        return new dee(qae.o(length, j2));
                                    }
                                    long b3 = hgeVar.b();
                                    if (b3 > 0) {
                                        j = b3;
                                    } else {
                                        j = ~b3;
                                    }
                                    b(b, j);
                                    return new uee(b3);
                                }
                                return new cee(hgeVar.e());
                            }
                            throw new IOException("Tags are currently unsupported");
                        }
                        long c = hgeVar.c();
                        if (c <= 1000) {
                            b(b, c);
                            int i2 = (int) c;
                            aec[] aecVarArr = new aec[i2];
                            sfe sfeVar = null;
                            int i3 = 0;
                            while (i3 < c) {
                                sfe a = a(hgeVar);
                                if (sfeVar != null && a.compareTo(sfeVar) <= 0) {
                                    throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + sfeVar.toString() + "\nCurrent key: " + a.toString());
                                }
                                aecVarArr[i3] = new aec(a, a(hgeVar), false, (byte) 15);
                                i3++;
                                sfeVar = a;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                aec aecVar = aecVarArr[i];
                                if (!treeMap.containsKey((sfe) aecVar.b)) {
                                    treeMap.put((sfe) aecVar.b, (sfe) aecVar.c);
                                    i++;
                                } else {
                                    throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new dfe(njd.c(treeMap));
                        }
                        throw new IOException("Parser being asked to read a large CBOR map");
                    }
                    long a2 = hgeVar.a();
                    if (a2 <= 1000) {
                        b(b, a2);
                        sfe[] sfeVarArr = new sfe[(int) a2];
                        while (i < a2) {
                            sfeVarArr[i] = a(hgeVar);
                            i++;
                        }
                        return new xde(xhd.B(sfeVarArr));
                    }
                    throw new IOException("Parser being asked to read a large CBOR array");
                } catch (IOException | RuntimeException e) {
                    throw new pee(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            throw new pee(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new IOException(ug8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j < 256) {
                    throw new IOException(ug8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(ug8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(ug8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
