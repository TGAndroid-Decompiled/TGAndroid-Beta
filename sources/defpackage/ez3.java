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
public final class ez3 {
    public static final int[] h = {aob.ra, aob.rb, aob.Fi, aob.Ee, aob.Fe, aob.Ge, aob.He, aob.Ie};
    public boolean a;
    public boolean b;
    public dpb c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public ez3(int i, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new dpb(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        dz3 dz3Var = new dz3();
        dz3Var.b = tL_theme;
        dz3Var.d = 0;
        arrayList.add(dz3Var);
        dz3 dz3Var2 = new dz3();
        dz3Var2.b = tL_theme;
        dz3Var2.d = 1;
        arrayList.add(dz3Var2);
    }

    public static ez3 a(int i) {
        ez3 ez3Var = new ez3(i);
        ez3Var.e = "❌";
        ez3Var.c = dpb.d("❌");
        ez3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        ez3Var.b = true;
        dz3 dz3Var = new dz3();
        dz3Var.a = d(true);
        ArrayList arrayList = ez3Var.f;
        arrayList.add(dz3Var);
        dz3 dz3Var2 = new dz3();
        dz3Var2.a = d(false);
        arrayList.add(dz3Var2);
        return ez3Var;
    }

    public static ez3 b(int i) {
        ez3 ez3Var = new ez3(i);
        ez3Var.e = "🏠";
        ez3Var.c = dpb.d("🏠");
        ez3Var.d = TLRPC.ChatTheme.ofEmoticon(ez3Var.e);
        dz3 dz3Var = new dz3();
        dz3Var.a = aob.O0("Blue");
        dz3Var.e = 99;
        ArrayList arrayList = ez3Var.f;
        arrayList.add(dz3Var);
        dz3 dz3Var2 = new dz3();
        dz3Var2.a = aob.O0("Day");
        dz3Var2.e = 9;
        arrayList.add(dz3Var2);
        dz3 dz3Var3 = new dz3();
        dz3Var3.a = aob.O0("Night");
        dz3Var3.e = 0;
        arrayList.add(dz3Var3);
        dz3 dz3Var4 = new dz3();
        dz3Var4.a = aob.O0("Dark Blue");
        dz3Var4.e = 0;
        arrayList.add(dz3Var4);
        return ez3Var;
    }

    public static ez3 c(int i, TLRPC.TL_theme tL_theme) {
        ez3 ez3Var = new ez3(i);
        String str = tL_theme.emoticon;
        ez3Var.e = str;
        ez3Var.c = new dpb(str, null);
        ez3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i2 = 0; i2 < tL_theme.settings.size(); i2++) {
            dz3 dz3Var = new dz3();
            dz3Var.b = tL_theme;
            dz3Var.d = i2;
            ez3Var.f.add(dz3Var);
        }
        return ez3Var;
    }

    public static znb d(boolean z) {
        znb B0;
        String string;
        if (z) {
            B0 = aob.J;
        } else {
            B0 = aob.B0();
        }
        if (z != B0.o()) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            B0 = aob.O0(string);
            if (B0 == null) {
                if (z) {
                    str = "Dark Blue";
                }
                B0 = aob.O0(str);
            }
        }
        return new znb(B0);
    }

    public static int f(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null) {
            return aob.D0(i);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        return aob.D0(i);
    }

    public static void o(int i, long j, pcc pccVar, TLRPC.WallPaper wallPaper) {
        if (wallPaper.pattern) {
            hl.c3(new hk3(i, lvc.b(wallPaper), !TextUtils.isEmpty(wallPaper.slug), wallPaper, new m62(pccVar, (byte) 1)));
            return;
        }
        af2.e(i);
        af2.s.c(new kt(j, new qt0(i, j, pccVar, wallPaper), (byte) 9));
    }

    public static void q(znb znbVar, int i) {
        String str;
        String str2;
        SparseArray sparseArray;
        ynb ynbVar;
        if (znbVar != null) {
            if (i < 0 || (sparseArray = znbVar.b0) == null || ((ynbVar = (ynb) sparseArray.get(i)) != null && !ynbVar.z)) {
                if (!znbVar.k().equals("Blue") || i != 99) {
                    if (!znbVar.k().equals("Day") || i != 9) {
                        if (!znbVar.k().equals("Night") || i != 0) {
                            if (znbVar.k().equals("Dark Blue") && i == 0) {
                                return;
                            }
                            if (znbVar.o()) {
                                str = "lastDarkCustomTheme";
                                str2 = "lastDarkCustomThemeAccentId";
                            } else {
                                str = "lastDayCustomTheme";
                                str2 = "lastDayCustomThemeAccentId";
                            }
                            a.b.getSharedPreferences("themeconfig", 0).edit().putString(str, znbVar.k()).putInt(str2, i).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return atb.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ls6.d0(this.g).V(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i, int i2) {
        ynb ynbVar;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        znb znbVar;
        znb O0;
        ynb ynbVar2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray2 = ((dz3) arrayList.get(i2)).f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        znb i3 = i(i2);
        if (i3 == null) {
            int i4 = ((dz3) arrayList.get(i2)).d;
            hl5 hl5Var = (hl5) arrayList.get(i2);
            TLRPC.TL_theme tL_theme = ((dz3) arrayList.get(i2)).b;
            if (hl5Var != null) {
                O0 = aob.O0(aob.q0(((dz3) hl5Var).b(i4)));
            } else {
                O0 = aob.O0("Blue");
            }
            if (O0 != null) {
                znb znbVar2 = new znb(O0);
                if (hl5Var != null) {
                    dz3 dz3Var = (dz3) hl5Var;
                    ynbVar2 = znbVar2.c(dz3Var.a(), dz3Var.b(i4), tL_theme, i, true);
                } else {
                    ynbVar2 = null;
                }
                if (ynbVar2 != null) {
                    znbVar2.u(ynbVar2.a);
                }
                ynbVar = ynbVar2;
                i3 = znbVar2;
            }
            ynbVar = null;
        } else {
            SparseArray sparseArray = i3.b0;
            if (sparseArray != null) {
                ynbVar = (ynb) sparseArray.get(((dz3) arrayList.get(i2)).e);
            }
            ynbVar = null;
        }
        if (i3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i3.b != null) {
            sparseIntArray = aob.R0(new File(i3.b), null, strArr);
        } else {
            String str = i3.d;
            if (str != null) {
                sparseIntArray = aob.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i5 = 0;
        ((dz3) arrayList.get(i2)).g = strArr[0];
        if (ynbVar != null) {
            SparseIntArray clone = sparseIntArray.clone();
            ynbVar.d(sparseIntArray, clone);
            dpb dpbVar = this.c;
            if (dpbVar != null && !TextUtils.isEmpty(dpbVar.b) && (znbVar = ynbVar.b) != null && znbVar.b == null && !znbVar.o()) {
                ynb.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = aob.im;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((dz3) arrayList.get(i2)).f = sparseIntArray4;
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
                cc4.g(e, true);
                return sparseIntArray4;
            }
        }
    }

    public final long h(int i) {
        return ((dz3) this.f.get(i)).a();
    }

    public final znb i(int i) {
        return ((dz3) this.f.get(i)).a;
    }

    public final TLRPC.WallPaper j(int i) {
        dz3 dz3Var = (dz3) this.f.get(i);
        TLRPC.ThemeSettings b = dz3Var.b(dz3Var.d);
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
                    ((dz3) arrayList.get(i3)).h = f(g, aob.ra);
                    ((dz3) arrayList.get(i3)).i = f(g, aob.rb);
                    ((dz3) arrayList.get(i3)).j = f(g, aob.Fi);
                    ((dz3) arrayList.get(i3)).k = g.get(aob.Ee, 0);
                    ((dz3) arrayList.get(i3)).l = g.get(aob.Fe, 0);
                    ((dz3) arrayList.get(i3)).m = g.get(aob.Ge, 0);
                    ((dz3) arrayList.get(i3)).n = g.get(aob.He, 0);
                    g.get(aob.Ie, 0);
                    ((dz3) arrayList.get(i3)).getClass();
                    if (((dz3) arrayList.get(i3)).a != null && ((dz3) arrayList.get(i3)).a.k().equals("Blue")) {
                        if (((dz3) arrayList.get(i3)).e >= 0) {
                            i2 = ((dz3) arrayList.get(i3)).e;
                        } else {
                            i2 = ((dz3) arrayList.get(i3)).a.Z;
                        }
                        if (i2 == 99) {
                            ((dz3) arrayList.get(i3)).k = -2368069;
                            ((dz3) arrayList.get(i3)).l = -9722489;
                            ((dz3) arrayList.get(i3)).m = -2762611;
                            ((dz3) arrayList.get(i3)).n = -7817084;
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
        o(this.g, j.id, new cz3(resultCallback, h2, (byte) 0), j);
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
        Bitmap bitmap = (Bitmap) af2.e(this.g).a.get(Long.valueOf(h2));
        if (bitmap == null) {
            bitmap = v2f.b("thumb_" + h2);
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
        jn5 c = jn5.c(xb4.w(document.thumbs, 140, false, null, false), j.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        imageReceiver.d0(c, "120_140", null, null, null, 1);
        imageReceiver.h1 = new i02(resultCallback, h2, (byte) 5);
        in5.z().I(imageReceiver, null);
    }

    public ez3(int i) {
        this.f = new ArrayList();
        this.g = i;
    }

    public ez3(int i, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = dpb.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        dz3 dz3Var = new dz3();
        dz3Var.c = tL_chatThemeUniqueGift;
        dz3Var.d = 0;
        arrayList.add(dz3Var);
        dz3 dz3Var2 = new dz3();
        dz3Var2.c = tL_chatThemeUniqueGift;
        dz3Var2.d = 1;
        arrayList.add(dz3Var2);
    }
}
