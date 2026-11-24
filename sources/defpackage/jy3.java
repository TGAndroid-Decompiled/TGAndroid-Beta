package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class jy3 {
    public static final int[] h = {bkb.qa, bkb.qb, bkb.Ei, bkb.De, bkb.Ee, bkb.Fe, bkb.Ge, bkb.He};
    public boolean a;
    public boolean b;
    public elb c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public jy3(int i, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new elb(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        iy3 iy3Var = new iy3();
        iy3Var.b = tL_theme;
        iy3Var.d = 0;
        arrayList.add(iy3Var);
        iy3 iy3Var2 = new iy3();
        iy3Var2.b = tL_theme;
        iy3Var2.d = 1;
        arrayList.add(iy3Var2);
    }

    public static jy3 a(int i) {
        jy3 jy3Var = new jy3(i);
        jy3Var.e = "❌";
        jy3Var.c = elb.d("❌");
        jy3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        jy3Var.b = true;
        iy3 iy3Var = new iy3();
        iy3Var.a = d(true);
        ArrayList arrayList = jy3Var.f;
        arrayList.add(iy3Var);
        iy3 iy3Var2 = new iy3();
        iy3Var2.a = d(false);
        arrayList.add(iy3Var2);
        return jy3Var;
    }

    public static jy3 b(int i) {
        jy3 jy3Var = new jy3(i);
        jy3Var.e = "🏠";
        jy3Var.c = elb.d("🏠");
        jy3Var.d = TLRPC.ChatTheme.ofEmoticon(jy3Var.e);
        iy3 iy3Var = new iy3();
        iy3Var.a = bkb.O0("Blue");
        iy3Var.e = 99;
        ArrayList arrayList = jy3Var.f;
        arrayList.add(iy3Var);
        iy3 iy3Var2 = new iy3();
        iy3Var2.a = bkb.O0("Day");
        iy3Var2.e = 9;
        arrayList.add(iy3Var2);
        iy3 iy3Var3 = new iy3();
        iy3Var3.a = bkb.O0("Night");
        iy3Var3.e = 0;
        arrayList.add(iy3Var3);
        iy3 iy3Var4 = new iy3();
        iy3Var4.a = bkb.O0("Dark Blue");
        iy3Var4.e = 0;
        arrayList.add(iy3Var4);
        return jy3Var;
    }

    public static jy3 c(int i, TLRPC.TL_theme tL_theme) {
        jy3 jy3Var = new jy3(i);
        String str = tL_theme.emoticon;
        jy3Var.e = str;
        jy3Var.c = new elb(str, null);
        jy3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i2 = 0; i2 < tL_theme.settings.size(); i2++) {
            iy3 iy3Var = new iy3();
            iy3Var.b = tL_theme;
            iy3Var.d = i2;
            jy3Var.f.add(iy3Var);
        }
        return jy3Var;
    }

    public static akb d(boolean z) {
        akb B0;
        String string;
        if (z) {
            B0 = bkb.J;
        } else {
            B0 = bkb.B0();
        }
        if (z != B0.o()) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            B0 = bkb.O0(string);
            if (B0 == null) {
                if (z) {
                    str = "Dark Blue";
                }
                B0 = bkb.O0(str);
            }
        }
        return new akb(B0);
    }

    public static int f(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null) {
            return bkb.D0(i);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        return bkb.D0(i);
    }

    public static void o(int i, long j, p8c p8cVar, TLRPC.WallPaper wallPaper) {
        if (wallPaper.pattern) {
            gl.c3(new pj3(i, xqc.b(wallPaper), !TextUtils.isEmpty(wallPaper.slug), wallPaper, new w52(p8cVar, (byte) 1)));
            return;
        }
        je2.e(i);
        je2.s.c(new et(j, new it0(i, j, p8cVar, wallPaper), (byte) 9));
    }

    public static void q(akb akbVar, int i) {
        String str;
        String str2;
        SparseArray sparseArray;
        zjb zjbVar;
        if (akbVar != null) {
            if (i < 0 || (sparseArray = akbVar.b0) == null || ((zjbVar = (zjb) sparseArray.get(i)) != null && !zjbVar.z)) {
                if (!akbVar.k().equals("Blue") || i != 99) {
                    if (!akbVar.k().equals("Day") || i != 9) {
                        if (!akbVar.k().equals("Night") || i != 0) {
                            if (akbVar.k().equals("Dark Blue") && i == 0) {
                                return;
                            }
                            if (akbVar.o()) {
                                str = "lastDarkCustomTheme";
                                str2 = "lastDarkCustomThemeAccentId";
                            } else {
                                str = "lastDayCustomTheme";
                                str2 = "lastDayCustomThemeAccentId";
                            }
                            a.b.getSharedPreferences("themeconfig", 0).edit().putString(str, akbVar.k()).putInt(str2, i).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return apb.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return hq6.d0(this.g).V(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i, int i2) {
        zjb zjbVar;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        akb akbVar;
        akb O0;
        zjb zjbVar2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray2 = ((iy3) arrayList.get(i2)).f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        akb i3 = i(i2);
        if (i3 == null) {
            int i4 = ((iy3) arrayList.get(i2)).d;
            fj5 fj5Var = (fj5) arrayList.get(i2);
            TLRPC.TL_theme tL_theme = ((iy3) arrayList.get(i2)).b;
            if (fj5Var != null) {
                O0 = bkb.O0(bkb.q0(((iy3) fj5Var).b(i4)));
            } else {
                O0 = bkb.O0("Blue");
            }
            if (O0 != null) {
                akb akbVar2 = new akb(O0);
                if (fj5Var != null) {
                    iy3 iy3Var = (iy3) fj5Var;
                    zjbVar2 = akbVar2.c(iy3Var.a(), iy3Var.b(i4), tL_theme, i, true);
                } else {
                    zjbVar2 = null;
                }
                if (zjbVar2 != null) {
                    akbVar2.u(zjbVar2.a);
                }
                zjbVar = zjbVar2;
                i3 = akbVar2;
            }
            zjbVar = null;
        } else {
            SparseArray sparseArray = i3.b0;
            if (sparseArray != null) {
                zjbVar = (zjb) sparseArray.get(((iy3) arrayList.get(i2)).e);
            }
            zjbVar = null;
        }
        if (i3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i3.b != null) {
            sparseIntArray = bkb.R0(new File(i3.b), null, strArr);
        } else {
            String str = i3.d;
            if (str != null) {
                sparseIntArray = bkb.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i5 = 0;
        ((iy3) arrayList.get(i2)).g = strArr[0];
        if (zjbVar != null) {
            SparseIntArray clone = sparseIntArray.clone();
            zjbVar.d(sparseIntArray, clone);
            elb elbVar = this.c;
            if (elbVar != null && !TextUtils.isEmpty(elbVar.b) && (akbVar = zjbVar.b) != null && akbVar.b == null && !akbVar.o()) {
                zjb.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = bkb.hm;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((iy3) arrayList.get(i2)).f = sparseIntArray4;
        while (true) {
            try {
                int[] iArr = h;
                if (i5 < iArr.length) {
                    int i6 = iArr[i5];
                    int indexOfKey2 = sparseIntArray.indexOfKey(i6);
                    if (indexOfKey2 >= 0) {
                        sparseIntArray4.put(i6, sparseIntArray.valueAt(indexOfKey2));
                    } else {
                        int i7 = sparseIntArray3.get(i6, -1);
                        if (i7 >= 0 && (indexOfKey = sparseIntArray.indexOfKey(i7)) >= 0) {
                            sparseIntArray4.put(i6, sparseIntArray.valueAt(indexOfKey));
                        }
                    }
                    i5++;
                } else {
                    return sparseIntArray4;
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return sparseIntArray4;
            }
        }
    }

    public final long h(int i) {
        return ((iy3) this.f.get(i)).a();
    }

    public final akb i(int i) {
        return ((iy3) this.f.get(i)).a;
    }

    public final TLRPC.WallPaper j(int i) {
        iy3 iy3Var = (iy3) this.f.get(i);
        TLRPC.ThemeSettings b = iy3Var.b(iy3Var.d);
        if (b != null) {
            return b.wallpaper;
        }
        return null;
    }

    public final void k() {
        g(0, 0);
        g(0, 1);
    }

    public final boolean l() {
        if (!this.a && !this.b) {
            return false;
        }
        return true;
    }

    public final void m(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) != null) {
                    SparseIntArray g = g(i, i3);
                    ((iy3) arrayList.get(i3)).h = f(g, bkb.qa);
                    ((iy3) arrayList.get(i3)).i = f(g, bkb.qb);
                    ((iy3) arrayList.get(i3)).j = f(g, bkb.Ei);
                    ((iy3) arrayList.get(i3)).k = g.get(bkb.De, 0);
                    ((iy3) arrayList.get(i3)).l = g.get(bkb.Ee, 0);
                    ((iy3) arrayList.get(i3)).m = g.get(bkb.Fe, 0);
                    ((iy3) arrayList.get(i3)).n = g.get(bkb.Ge, 0);
                    g.get(bkb.He, 0);
                    ((iy3) arrayList.get(i3)).getClass();
                    if (((iy3) arrayList.get(i3)).a != null && ((iy3) arrayList.get(i3)).a.k().equals("Blue")) {
                        if (((iy3) arrayList.get(i3)).e >= 0) {
                            i2 = ((iy3) arrayList.get(i3)).e;
                        } else {
                            i2 = ((iy3) arrayList.get(i3)).a.Z;
                        }
                        if (i2 == 99) {
                            ((iy3) arrayList.get(i3)).k = -2368069;
                            ((iy3) arrayList.get(i3)).l = -9722489;
                            ((iy3) arrayList.get(i3)).m = -2762611;
                            ((iy3) arrayList.get(i3)).n = -7817084;
                        }
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void n(int i, ResultCallback resultCallback) {
        TLRPC.WallPaper j = j(i);
        if (j == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long h2 = h(i);
        o(this.g, j.id, new hy3(resultCallback, h2, (byte) 0), j);
    }

    public final void p(int i, ResultCallback resultCallback) {
        TLRPC.WallPaper j = j(i);
        if (j == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long h2 = h(i);
        if (h2 == 0) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        Bitmap bitmap = (Bitmap) je2.e(this.g).a.get(Long.valueOf(h2));
        if (bitmap == null) {
            bitmap = dye.b("thumb_" + h2);
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(h2), bitmap));
                return;
            }
            return;
        }
        TLRPC.Document document = j.document;
        if (document == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(h2), null));
                return;
            }
            return;
        }
        gl5 c = gl5.c(ba4.w(document.thumbs, 140, false, null, false), j.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        imageReceiver.d0(c, "120_140", null, null, null, 1);
        imageReceiver.h1 = new rz1(resultCallback, h2, (byte) 5);
        fl5.z().I(imageReceiver, null);
    }

    public jy3(int i) {
        this.f = new ArrayList();
        this.g = i;
    }

    public jy3(int i, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = elb.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        iy3 iy3Var = new iy3();
        iy3Var.c = tL_chatThemeUniqueGift;
        iy3Var.d = 0;
        arrayList.add(iy3Var);
        iy3 iy3Var2 = new iy3();
        iy3Var2.c = tL_chatThemeUniqueGift;
        iy3Var2.d = 1;
        arrayList.add(iy3Var2);
    }
}
