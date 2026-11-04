package mf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.t0;
public final class b {
    public static volatile b f19283j;
    public final byte[] f19284a;
    public final boolean f19285b;
    public final ByteBuffer f19286c;
    public final String d;
    public final String f19287e;
    public final HashMap f19288f;
    public final HashMap f19289g;
    public final HashMap h;
    public final HashMap f19290i;

    public b() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.f19285b = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = t0.f25457b.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f19284a = byteArray;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            this.f19286c = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                inputStream.close();
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            this.d = Locale.getDefault().getCountry().toLowerCase();
            this.f19288f = new HashMap(255);
            this.f19289g = new HashMap(255);
            this.h = new HashMap(10);
            this.f19290i = new HashMap(255);
            int f10 = f(0);
            int i3 = 4;
            int i10 = (f10 * 12) + 4;
            for (int i11 = 0; i11 < f10; i11++) {
                String g7 = g(i3);
                String g10 = g(i3 + 4);
                int f11 = f(i3 + 8) + i10;
                i3 += 12;
                if (g10.equals(this.d)) {
                    this.f19287e = g7;
                }
                this.f19290i.put(g10, g7);
                this.f19288f.put(g7, Integer.valueOf(f11));
                ArrayList arrayList = (ArrayList) this.f19289g.get(g7);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f19289g.put(g7, arrayList);
                }
                arrayList.add(g10);
            }
            String str = this.f19287e;
            if (str != null) {
                a(str);
            }
            this.f19285b = true;
        } catch (Exception e14) {
            e = e14;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e15) {
                    a8.g(e15, true);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e16) {
                    a8.g(e16, true);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e17) {
                    a8.g(e17, true);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e18) {
                    a8.g(e18, true);
                }
            }
            throw th;
        }
    }

    public static b c() {
        b bVar;
        b bVar2 = f19283j;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = f19283j;
                    if (bVar == null) {
                        bVar = new b();
                        f19283j = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static String d(String str, boolean z10) {
        String str2;
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (z10) {
            str2 = "0123456789+";
        } else {
            str2 = "0123456789";
        }
        for (int length = sb2.length() - 1; length >= 0; length--) {
            if (!str2.contains(sb2.substring(length, length + 1))) {
                sb2.deleteCharAt(length);
            }
        }
        return sb2.toString();
    }

    public final a a(String str) {
        Integer num;
        b bVar = this;
        a aVar = (a) bVar.h.get(str);
        if (aVar == null && (num = (Integer) bVar.f19288f.get(str)) != null) {
            int intValue = num.intValue();
            ?? obj = new Object();
            new ArrayList();
            obj.f19280a = "";
            obj.f19281b = new ArrayList();
            obj.f19282c = new ArrayList();
            obj.d = new ArrayList();
            obj.f19280a = str;
            ArrayList arrayList = (ArrayList) bVar.f19289g.get(str);
            bVar.h.put(str, obj);
            short e10 = bVar.e(intValue);
            short e11 = bVar.e(intValue + 4);
            short e12 = bVar.e(intValue + 8);
            int i3 = intValue + 12;
            ArrayList arrayList2 = new ArrayList(5);
            while (true) {
                String g7 = bVar.g(i3);
                if (g7.length() == 0) {
                    break;
                }
                arrayList2.add(g7);
                i3 += g7.length() + 1;
            }
            obj.f19281b = arrayList2;
            int i10 = i3 + 1;
            ArrayList arrayList3 = new ArrayList(5);
            while (true) {
                String g10 = bVar.g(i10);
                if (g10.length() == 0) {
                    break;
                }
                arrayList3.add(g10);
                i10 += g10.length() + 1;
            }
            obj.f19282c = arrayList3;
            ArrayList arrayList4 = new ArrayList(e12);
            int i11 = intValue + e10;
            int i12 = i11;
            int i13 = 0;
            while (i13 < e12) {
                ?? obj2 = new Object();
                obj2.f19297b = new ArrayList();
                obj2.f19296a = bVar.e(i12);
                short e13 = bVar.e(i12 + 2);
                i12 += 4;
                ArrayList arrayList5 = new ArrayList(e13);
                int i14 = 0;
                while (i14 < e13) {
                    ?? obj3 = new Object();
                    obj3.f19291a = bVar.f(i12);
                    obj3.f19292b = bVar.f(i12 + 4);
                    byte[] bArr = bVar.f19284a;
                    byte b10 = bArr[i12 + 8];
                    obj3.f19293c = bArr[i12 + 9];
                    byte b11 = bArr[i12 + 10];
                    byte b12 = bArr[i12 + 11];
                    obj3.d = bArr[i12 + 12];
                    byte b13 = bArr[i12 + 13];
                    short e14 = bVar.e(i12 + 14);
                    i12 += 16;
                    String g11 = bVar.g(i11 + e11 + e14);
                    obj3.f19294e = g11;
                    int indexOf = g11.indexOf("[[");
                    if (indexOf != -1) {
                        obj3.f19294e = t4.c.q(obj3.f19294e.substring(0, indexOf), obj3.f19294e.substring(obj3.f19294e.indexOf("]]") + 2));
                    }
                    arrayList5.add(obj3);
                    i14++;
                    bVar = this;
                }
                obj2.f19297b = arrayList5;
                arrayList4.add(obj2);
                i13++;
                bVar = this;
            }
            obj.d = arrayList4;
            return obj;
        }
        return aVar;
    }

    public final String b(String str) {
        String str2;
        if (this.f19285b) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                for (int length = sb2.length() - 1; length >= 0; length--) {
                    if (!"0123456789+*#".contains(sb2.substring(length, length + 1))) {
                        sb2.deleteCharAt(length);
                    }
                }
                String sb3 = sb2.toString();
                a aVar = null;
                if (sb3.startsWith("+")) {
                    String substring = sb3.substring(1);
                    int i3 = 0;
                    while (i3 < 3 && i3 < substring.length()) {
                        i3++;
                        aVar = a(substring.substring(0, i3));
                        if (aVar != null) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        return "+" + aVar.a(substring);
                    }
                } else {
                    a a10 = a(this.f19287e);
                    if (a10 != null) {
                        ArrayList arrayList = a10.f19282c;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                str2 = (String) obj;
                                if (sb3.startsWith(str2)) {
                                    break;
                                }
                            } else {
                                str2 = null;
                                break;
                            }
                        }
                        if (str2 != null) {
                            String substring2 = sb3.substring(str2.length());
                            int i11 = 0;
                            while (i11 < 3 && i11 < substring2.length()) {
                                i11++;
                                aVar = a(substring2.substring(0, i11));
                                if (aVar != null) {
                                    break;
                                }
                            }
                            if (aVar != null) {
                                substring2 = aVar.a(substring2);
                            }
                            if (substring2.length() == 0) {
                                return str2;
                            }
                            return str2 + " " + substring2;
                        }
                        return a10.a(sb3);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return str;
            }
        }
        return str;
    }

    public final short e(int i3) {
        if (i3 + 2 <= this.f19284a.length) {
            this.f19286c.position(i3);
            return this.f19286c.getShort();
        }
        return (short) 0;
    }

    public final int f(int i3) {
        if (i3 + 4 <= this.f19284a.length) {
            this.f19286c.position(i3);
            return this.f19286c.getInt();
        }
        return 0;
    }

    public final java.lang.String g(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: mf.b.g(int):java.lang.String");
    }
}
