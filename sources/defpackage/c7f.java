package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;
public abstract class c7f {
    public static final jke a(yke ykeVar) {
        long j;
        try {
            wdc d = ykeVar.d();
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
                                                ykeVar.h((byte) 96);
                                                String str = new String(ykeVar.j(), StandardCharsets.UTF_8);
                                                b(b, str.length());
                                                return new yje(str);
                                            }
                                            throw new IOException("Unidentifiable major type: " + ((b2 >> 5) & 7));
                                        }
                                        ykeVar.h((byte) 64);
                                        byte[] j2 = ykeVar.j();
                                        int length = j2.length;
                                        b(b, length);
                                        return new uie(gfe.o(length, j2));
                                    }
                                    long b3 = ykeVar.b();
                                    if (b3 > 0) {
                                        j = b3;
                                    } else {
                                        j = ~b3;
                                    }
                                    b(b, j);
                                    return new lje(b3);
                                }
                                return new tie(ykeVar.e());
                            }
                            throw new IOException("Tags are currently unsupported");
                        }
                        long c = ykeVar.c();
                        if (c <= 1000) {
                            b(b, c);
                            int i2 = (int) c;
                            zhc[] zhcVarArr = new zhc[i2];
                            jke jkeVar = null;
                            int i3 = 0;
                            while (i3 < c) {
                                jke a = a(ykeVar);
                                if (jkeVar != null && a.compareTo(jkeVar) <= 0) {
                                    throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + jkeVar.toString() + "\nCurrent key: " + a.toString());
                                }
                                zhcVarArr[i3] = new zhc(a, a(ykeVar), false, (byte) 15);
                                i3++;
                                jkeVar = a;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                zhc zhcVar = zhcVarArr[i];
                                if (!treeMap.containsKey((jke) zhcVar.b)) {
                                    treeMap.put((jke) zhcVar.b, (jke) zhcVar.c);
                                    i++;
                                } else {
                                    throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new uje(eod.c(treeMap));
                        }
                        throw new IOException("Parser being asked to read a large CBOR map");
                    }
                    long a2 = ykeVar.a();
                    if (a2 <= 1000) {
                        b(b, a2);
                        jke[] jkeVarArr = new jke[(int) a2];
                        while (i < a2) {
                            jkeVarArr[i] = a(ykeVar);
                            i++;
                        }
                        return new oie(omd.B(jkeVarArr));
                    }
                    throw new IOException("Parser being asked to read a large CBOR array");
                } catch (IOException | RuntimeException e) {
                    throw new gje(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            throw new gje(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new IOException(ik8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j < 256) {
                    throw new IOException(ik8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(ik8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(ik8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
