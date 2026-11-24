package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;
public abstract class m4f {
    public static final the a(iie iieVar) {
        long j;
        try {
            xbc d = iieVar.d();
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
                                                iieVar.h((byte) 96);
                                                String str = new String(iieVar.j(), StandardCharsets.UTF_8);
                                                b(b, str.length());
                                                return new ihe(str);
                                            }
                                            throw new IOException("Unidentifiable major type: " + ((b2 >> 5) & 7));
                                        }
                                        iieVar.h((byte) 64);
                                        byte[] j2 = iieVar.j();
                                        int length = j2.length;
                                        b(b, length);
                                        return new ege(rce.o(length, j2));
                                    }
                                    long b3 = iieVar.b();
                                    if (b3 > 0) {
                                        j = b3;
                                    } else {
                                        j = ~b3;
                                    }
                                    b(b, j);
                                    return new vge(b3);
                                }
                                return new dge(iieVar.e());
                            }
                            throw new IOException("Tags are currently unsupported");
                        }
                        long c = iieVar.c();
                        if (c <= 1000) {
                            b(b, c);
                            int i2 = (int) c;
                            rhb[] rhbVarArr = new rhb[i2];
                            the theVar = null;
                            int i3 = 0;
                            while (i3 < c) {
                                the a = a(iieVar);
                                if (theVar != null && a.compareTo(theVar) <= 0) {
                                    throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + theVar.toString() + "\nCurrent key: " + a.toString());
                                }
                                rhbVarArr[i3] = new rhb(a, a(iieVar), false, (byte) 17);
                                i3++;
                                theVar = a;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                rhb rhbVar = rhbVarArr[i];
                                if (!treeMap.containsKey((the) rhbVar.b)) {
                                    treeMap.put((the) rhbVar.b, (the) rhbVar.c);
                                    i++;
                                } else {
                                    throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new ehe(pld.c(treeMap));
                        }
                        throw new IOException("Parser being asked to read a large CBOR map");
                    }
                    long a2 = iieVar.a();
                    if (a2 <= 1000) {
                        b(b, a2);
                        the[] theVarArr = new the[(int) a2];
                        while (i < a2) {
                            theVarArr[i] = a(iieVar);
                            i++;
                        }
                        return new yfe(yjd.B(theVarArr));
                    }
                    throw new IOException("Parser being asked to read a large CBOR array");
                } catch (IOException | RuntimeException e) {
                    throw new qge(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            throw new qge(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new IOException(wi8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j < 256) {
                    throw new IOException(wi8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(wi8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(wi8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
