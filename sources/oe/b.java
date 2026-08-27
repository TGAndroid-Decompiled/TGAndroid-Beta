package oe;

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

    public static volatile b f19426j;

    public final byte[] f19427a;

    public final boolean f19428b;

    public final ByteBuffer f19429c;
    public final String d;

    public final String f19430e;

    public final HashMap f19431f;

    public final HashMap f19432g;
    public final HashMap h;

    public final HashMap f19433i;

    public b() throws Throwable {
        InputStream inputStreamOpen;
        this.f19428b = false;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i10 = inputStreamOpen.read(bArr, 0, 1024);
                            if (i10 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream2.write(bArr, 0, i10);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        this.f19427a = byteArray;
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
                        this.f19429c = byteBufferWrap;
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        try {
                            inputStreamOpen.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        this.d = Locale.getDefault().getCountry().toLowerCase();
                        this.f19431f = new HashMap(255);
                        this.f19432g = new HashMap(255);
                        this.h = new HashMap(10);
                        this.f19433i = new HashMap(255);
                        int iF = f(0);
                        int i11 = 4;
                        int i12 = (iF * 12) + 4;
                        for (int i13 = 0; i13 < iF; i13++) {
                            String strG = g(i11);
                            String strG2 = g(i11 + 4);
                            int iF2 = f(i11 + 8) + i12;
                            i11 += 12;
                            if (strG2.equals(this.d)) {
                                this.f19430e = strG;
                            }
                            this.f19433i.put(strG2, strG);
                            this.f19431f.put(strG, Integer.valueOf(iF2));
                            ArrayList arrayList = (ArrayList) this.f19432g.get(strG);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.f19432g.put(strG, arrayList);
                            }
                            arrayList.add(strG2);
                        }
                        String str = this.f19430e;
                        if (str != null) {
                            a(str);
                        }
                        this.f19428b = true;
                    } catch (Exception e11) {
                        e = e11;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e14) {
                                FileLog.e(e14);
                            }
                        }
                        if (inputStreamOpen == null) {
                            throw th;
                        }
                        try {
                            inputStreamOpen.close();
                            throw th;
                        } catch (Exception e15) {
                            FileLog.e(e15);
                            throw th;
                        }
                    }
                } catch (Exception e16) {
                    e = e16;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e17) {
            e = e17;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    public static b c() {
        b bVar;
        b bVar2 = f19426j;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = f19426j;
                if (bVar == null) {
                    bVar = new b();
                    f19426j = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static String d(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        String str2 = z10 ? "0123456789+" : "0123456789";
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
        if (aVar != null || (num = (Integer) bVar.f19431f.get(str)) == null) {
            return aVar;
        }
        int iIntValue = num.intValue();
        a aVar2 = new a();
        new ArrayList();
        aVar2.f19423a = "";
        aVar2.f19424b = new ArrayList();
        aVar2.f19425c = new ArrayList();
        aVar2.d = new ArrayList();
        aVar2.f19423a = str;
        bVar.h.put(str, aVar2);
        short sE = bVar.e(iIntValue);
        short sE2 = bVar.e(iIntValue + 4);
        short sE3 = bVar.e(iIntValue + 8);
        int length = iIntValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String strG = bVar.g(length);
            if (strG.length() == 0) {
                break;
            }
            arrayList.add(strG);
            length += strG.length() + 1;
        }
        aVar2.f19424b = arrayList;
        int length2 = length + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String strG2 = bVar.g(length2);
            if (strG2.length() == 0) {
                break;
            }
            arrayList2.add(strG2);
            length2 += strG2.length() + 1;
        }
        aVar2.f19425c = arrayList2;
        ArrayList arrayList3 = new ArrayList(sE3);
        int i10 = iIntValue + sE;
        int i11 = i10;
        int i12 = 0;
        while (i12 < sE3) {
            d dVar = new d();
            dVar.f19440b = new ArrayList();
            dVar.f19439a = bVar.e(i11);
            short sE4 = bVar.e(i11 + 2);
            i11 += 4;
            ArrayList arrayList4 = new ArrayList(sE4);
            int i13 = 0;
            while (i13 < sE4) {
                c cVar = new c();
                cVar.f19434a = bVar.f(i11);
                cVar.f19435b = bVar.f(i11 + 4);
                byte[] bArr = bVar.f19427a;
                byte b10 = bArr[i11 + 8];
                cVar.f19436c = bArr[i11 + 9];
                byte b11 = bArr[i11 + 10];
                byte b12 = bArr[i11 + 11];
                cVar.d = bArr[i11 + 12];
                byte b13 = bArr[i11 + 13];
                short sE5 = bVar.e(i11 + 14);
                i11 += 16;
                String strG3 = bVar.g(i10 + sE2 + sE5);
                cVar.f19437e = strG3;
                int iIndexOf = strG3.indexOf("[[");
                if (iIndexOf != -1) {
                    cVar.f19437e = s3.c.l(cVar.f19437e.substring(0, iIndexOf), cVar.f19437e.substring(cVar.f19437e.indexOf("]]") + 2));
                }
                arrayList4.add(cVar);
                i13++;
                bVar = this;
            }
            dVar.f19440b = arrayList4;
            arrayList3.add(dVar);
            i12++;
            bVar = this;
        }
        aVar2.d = arrayList3;
        return aVar2;
    }

    public final String b(String str) {
        String str2;
        if (this.f19428b) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                for (int length = sb2.length() - 1; length >= 0; length--) {
                    if (!"0123456789+*#".contains(sb2.substring(length, length + 1))) {
                        sb2.deleteCharAt(length);
                    }
                }
                String string = sb2.toString();
                a aVarA = null;
                if (string.startsWith("+")) {
                    String strSubstring = string.substring(1);
                    int i10 = 0;
                    while (i10 < 3 && i10 < strSubstring.length()) {
                        i10++;
                        aVarA = a(strSubstring.substring(0, i10));
                        if (aVarA != null) {
                            break;
                        }
                    }
                    if (aVarA != null) {
                        return "+" + aVarA.a(strSubstring);
                    }
                } else {
                    a aVarA2 = a(this.f19430e);
                    if (aVarA2 != null) {
                        ArrayList arrayList = aVarA2.f19425c;
                        int size = arrayList.size();
                        int i11 = 0;
                        do {
                            if (i11 >= size) {
                                str2 = null;
                                break;
                            }
                            Object obj = arrayList.get(i11);
                            i11++;
                            str2 = (String) obj;
                        } while (!string.startsWith(str2));
                        if (str2 == null) {
                            return aVarA2.a(string);
                        }
                        String strSubstring2 = string.substring(str2.length());
                        int i12 = 0;
                        while (i12 < 3 && i12 < strSubstring2.length()) {
                            i12++;
                            aVarA = a(strSubstring2.substring(0, i12));
                            if (aVarA != null) {
                                break;
                            }
                        }
                        if (aVarA != null) {
                            strSubstring2 = aVarA.a(strSubstring2);
                        }
                        if (strSubstring2.length() == 0) {
                            return str2;
                        }
                        return str2 + " " + strSubstring2;
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return str;
            }
        }
        return str;
    }

    public final short e(int i10) {
        if (i10 + 2 > this.f19427a.length) {
            return (short) 0;
        }
        this.f19429c.position(i10);
        return this.f19429c.getShort();
    }

    public final int f(int i10) {
        if (i10 + 4 > this.f19427a.length) {
            return 0;
        }
        this.f19429c.position(i10);
        return this.f19429c.getInt();
    }

    public final String g(int i10) {
        int i11 = i10;
        while (true) {
            try {
                byte[] bArr = this.f19427a;
                if (i11 >= bArr.length) {
                    return "";
                }
                if (bArr[i11] == 0) {
                    int i12 = i11 - i10;
                    return i10 == i12 ? "" : new String(bArr, i10, i12);
                }
                i11++;
            } catch (Exception e9) {
                e9.printStackTrace();
                return "";
            }
        }
    }
}
