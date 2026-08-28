package ne;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b {
    public static volatile b f18577j;
    public final byte[] f18578a;
    public final boolean f18579b;
    public final ByteBuffer f18580c;
    public final String d;
    public final String f18581e;
    public final HashMap f18582f;
    public final HashMap f18583g;
    public final HashMap h;
    public final HashMap f18584i;

    public b() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.f18579b = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
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
            this.f18578a = byteArray;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            this.f18580c = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            try {
                inputStream.close();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            this.d = Locale.getDefault().getCountry().toLowerCase();
            this.f18582f = new HashMap(255);
            this.f18583g = new HashMap(255);
            this.h = new HashMap(10);
            this.f18584i = new HashMap(255);
            int f10 = f(0);
            int i9 = 4;
            int i10 = (f10 * 12) + 4;
            for (int i11 = 0; i11 < f10; i11++) {
                String g10 = g(i9);
                String g11 = g(i9 + 4);
                int f11 = f(i9 + 8) + i10;
                i9 += 12;
                if (g11.equals(this.d)) {
                    this.f18581e = g10;
                }
                this.f18584i.put(g11, g10);
                this.f18582f.put(g10, Integer.valueOf(f11));
                ArrayList arrayList = (ArrayList) this.f18583g.get(g10);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f18583g.put(g10, arrayList);
                }
                arrayList.add(g11);
            }
            String str = this.f18581e;
            if (str != null) {
                a(str);
            }
            this.f18579b = true;
        } catch (Exception e14) {
            e = e14;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e17) {
                    FileLog.e(e17);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e18) {
                    FileLog.e(e18);
                }
            }
            throw th;
        }
    }

    public static b c() {
        b bVar;
        b bVar2 = f18577j;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = f18577j;
                    if (bVar == null) {
                        bVar = new b();
                        f18577j = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
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
        if (aVar == null && (num = (Integer) bVar.f18582f.get(str)) != null) {
            int intValue = num.intValue();
            ?? obj = new Object();
            new ArrayList();
            obj.f18574a = "";
            obj.f18575b = new ArrayList();
            obj.f18576c = new ArrayList();
            obj.d = new ArrayList();
            obj.f18574a = str;
            ArrayList arrayList = (ArrayList) bVar.f18583g.get(str);
            bVar.h.put(str, obj);
            short e10 = bVar.e(intValue);
            short e11 = bVar.e(intValue + 4);
            short e12 = bVar.e(intValue + 8);
            int i9 = intValue + 12;
            ArrayList arrayList2 = new ArrayList(5);
            while (true) {
                String g10 = bVar.g(i9);
                if (g10.length() == 0) {
                    break;
                }
                arrayList2.add(g10);
                i9 += g10.length() + 1;
            }
            obj.f18575b = arrayList2;
            int i10 = i9 + 1;
            ArrayList arrayList3 = new ArrayList(5);
            while (true) {
                String g11 = bVar.g(i10);
                if (g11.length() == 0) {
                    break;
                }
                arrayList3.add(g11);
                i10 += g11.length() + 1;
            }
            obj.f18576c = arrayList3;
            ArrayList arrayList4 = new ArrayList(e12);
            int i11 = intValue + e10;
            int i12 = i11;
            int i13 = 0;
            while (i13 < e12) {
                ?? obj2 = new Object();
                obj2.f18591b = new ArrayList();
                obj2.f18590a = bVar.e(i12);
                short e13 = bVar.e(i12 + 2);
                i12 += 4;
                ArrayList arrayList5 = new ArrayList(e13);
                int i14 = 0;
                while (i14 < e13) {
                    ?? obj3 = new Object();
                    obj3.f18585a = bVar.f(i12);
                    obj3.f18586b = bVar.f(i12 + 4);
                    byte[] bArr = bVar.f18578a;
                    byte b10 = bArr[i12 + 8];
                    obj3.f18587c = bArr[i12 + 9];
                    byte b11 = bArr[i12 + 10];
                    byte b12 = bArr[i12 + 11];
                    obj3.d = bArr[i12 + 12];
                    byte b13 = bArr[i12 + 13];
                    short e14 = bVar.e(i12 + 14);
                    i12 += 16;
                    String g12 = bVar.g(i11 + e11 + e14);
                    obj3.f18588e = g12;
                    int indexOf = g12.indexOf("[[");
                    if (indexOf != -1) {
                        obj3.f18588e = ta.b.j(obj3.f18588e.substring(0, indexOf), obj3.f18588e.substring(obj3.f18588e.indexOf("]]") + 2));
                    }
                    arrayList5.add(obj3);
                    i14++;
                    bVar = this;
                }
                obj2.f18591b = arrayList5;
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
        if (this.f18579b) {
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
                    int i9 = 0;
                    while (i9 < 3 && i9 < substring.length()) {
                        i9++;
                        aVar = a(substring.substring(0, i9));
                        if (aVar != null) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        return "+" + aVar.a(substring);
                    }
                } else {
                    a a2 = a(this.f18581e);
                    if (a2 != null) {
                        ArrayList arrayList = a2.f18576c;
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
                        return a2.a(sb3);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return str;
            }
        }
        return str;
    }

    public final short e(int i9) {
        if (i9 + 2 <= this.f18578a.length) {
            this.f18580c.position(i9);
            return this.f18580c.getShort();
        }
        return (short) 0;
    }

    public final int f(int i9) {
        if (i9 + 4 <= this.f18578a.length) {
            this.f18580c.position(i9);
            return this.f18580c.getInt();
        }
        return 0;
    }

    public final java.lang.String g(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ne.b.g(int):java.lang.String");
    }
}
