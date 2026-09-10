package gf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.r6;
public final class b {
    public static volatile b f8784j;
    public final byte[] f8785a;
    public final boolean f8786b;
    public final ByteBuffer f8787c;
    public final String d;
    public final String e;
    public final HashMap f8788f;
    public final HashMap f8789g;
    public final HashMap h;
    public final HashMap f8790i;

    public b() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.f8786b = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
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
            this.f8785a = byteArray;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            this.f8787c = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                inputStream.close();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.d = Locale.getDefault().getCountry().toLowerCase();
            this.f8788f = new HashMap(255);
            this.f8789g = new HashMap(255);
            this.h = new HashMap(10);
            this.f8790i = new HashMap(255);
            int f7 = f(0);
            int i10 = 4;
            int i11 = (f7 * 12) + 4;
            for (int i12 = 0; i12 < f7; i12++) {
                String g10 = g(i10);
                String g11 = g(i10 + 4);
                int f10 = f(i10 + 8) + i11;
                i10 += 12;
                if (g11.equals(this.d)) {
                    this.e = g10;
                }
                this.f8790i.put(g11, g10);
                this.f8788f.put(g10, Integer.valueOf(f10));
                ArrayList arrayList = (ArrayList) this.f8789g.get(g10);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f8789g.put(g10, arrayList);
                }
                arrayList.add(g11);
            }
            String str = this.e;
            if (str != null) {
                a(str);
            }
            this.f8786b = true;
        } catch (Exception e12) {
            e = e12;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
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
            throw th;
        }
    }

    public static b c() {
        b bVar;
        b bVar2 = f8784j;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = f8784j;
                    if (bVar == null) {
                        bVar = new b();
                        f8784j = bVar;
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
        if (aVar == null && (num = (Integer) bVar.f8788f.get(str)) != null) {
            int intValue = num.intValue();
            ?? obj = new Object();
            new ArrayList();
            obj.f8781a = "";
            obj.f8782b = new ArrayList();
            obj.f8783c = new ArrayList();
            obj.d = new ArrayList();
            obj.f8781a = str;
            ArrayList arrayList = (ArrayList) bVar.f8789g.get(str);
            bVar.h.put(str, obj);
            short e = bVar.e(intValue);
            short e7 = bVar.e(intValue + 4);
            short e10 = bVar.e(intValue + 8);
            int i10 = intValue + 12;
            ArrayList arrayList2 = new ArrayList(5);
            while (true) {
                String g10 = bVar.g(i10);
                if (g10.length() == 0) {
                    break;
                }
                arrayList2.add(g10);
                i10 += g10.length() + 1;
            }
            obj.f8782b = arrayList2;
            int i11 = i10 + 1;
            ArrayList arrayList3 = new ArrayList(5);
            while (true) {
                String g11 = bVar.g(i11);
                if (g11.length() == 0) {
                    break;
                }
                arrayList3.add(g11);
                i11 += g11.length() + 1;
            }
            obj.f8783c = arrayList3;
            ArrayList arrayList4 = new ArrayList(e10);
            int i12 = intValue + e;
            int i13 = i12;
            int i14 = 0;
            while (i14 < e10) {
                ?? obj2 = new Object();
                obj2.f8796b = new ArrayList();
                obj2.f8795a = bVar.e(i13);
                short e11 = bVar.e(i13 + 2);
                i13 += 4;
                ArrayList arrayList5 = new ArrayList(e11);
                int i15 = 0;
                while (i15 < e11) {
                    ?? obj3 = new Object();
                    obj3.f8791a = bVar.f(i13);
                    obj3.f8792b = bVar.f(i13 + 4);
                    byte[] bArr = bVar.f8785a;
                    byte b10 = bArr[i13 + 8];
                    obj3.f8793c = bArr[i13 + 9];
                    byte b11 = bArr[i13 + 10];
                    byte b12 = bArr[i13 + 11];
                    obj3.d = bArr[i13 + 12];
                    byte b13 = bArr[i13 + 13];
                    short e12 = bVar.e(i13 + 14);
                    i13 += 16;
                    String g12 = bVar.g(i12 + e7 + e12);
                    obj3.e = g12;
                    int indexOf = g12.indexOf("[[");
                    if (indexOf != -1) {
                        obj3.e = r6.t(obj3.e.substring(0, indexOf), obj3.e.substring(obj3.e.indexOf("]]") + 2));
                    }
                    arrayList5.add(obj3);
                    i15++;
                    bVar = this;
                }
                obj2.f8796b = arrayList5;
                arrayList4.add(obj2);
                i14++;
                bVar = this;
            }
            obj.d = arrayList4;
            return obj;
        }
        return aVar;
    }

    public final String b(String str) {
        String str2;
        if (this.f8786b) {
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
                    int i10 = 0;
                    while (i10 < 3 && i10 < substring.length()) {
                        i10++;
                        aVar = a(substring.substring(0, i10));
                        if (aVar != null) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        return "+" + aVar.a(substring);
                    }
                } else {
                    a a2 = a(this.e);
                    if (a2 != null) {
                        ArrayList arrayList = a2.f8783c;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
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
                            int i12 = 0;
                            while (i12 < 3 && i12 < substring2.length()) {
                                i12++;
                                aVar = a(substring2.substring(0, i12));
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
            } catch (Exception e) {
                FileLog.e(e);
                return str;
            }
        }
        return str;
    }

    public final short e(int i10) {
        if (i10 + 2 <= this.f8785a.length) {
            this.f8787c.position(i10);
            return this.f8787c.getShort();
        }
        return (short) 0;
    }

    public final int f(int i10) {
        if (i10 + 4 <= this.f8785a.length) {
            this.f8787c.position(i10);
            return this.f8787c.getInt();
        }
        return 0;
    }

    public final java.lang.String g(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: gf.b.g(int):java.lang.String");
    }
}
