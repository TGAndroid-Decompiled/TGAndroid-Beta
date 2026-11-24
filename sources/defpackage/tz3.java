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
public final class tz3 {
    public static final int[] h = {cmb.qa, cmb.qb, cmb.Ei, cmb.De, cmb.Ee, cmb.Fe, cmb.Ge, cmb.He};
    public boolean a;
    public boolean b;
    public fnb c;
    public TLRPC.ChatTheme d;
    public String e;
    public final ArrayList f;
    public final int g;

    public tz3(int i, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        String str = tL_theme.emoticon;
        this.e = str;
        this.c = new fnb(str, null);
        this.d = TLRPC.ChatTheme.ofEmoticon(str);
        sz3 sz3Var = new sz3();
        sz3Var.b = tL_theme;
        sz3Var.d = 0;
        arrayList.add(sz3Var);
        sz3 sz3Var2 = new sz3();
        sz3Var2.b = tL_theme;
        sz3Var2.d = 1;
        arrayList.add(sz3Var2);
    }

    public static tz3 a(int i) {
        tz3 tz3Var = new tz3(i);
        tz3Var.e = "❌";
        tz3Var.c = fnb.d("❌");
        tz3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
        tz3Var.b = true;
        sz3 sz3Var = new sz3();
        sz3Var.a = d(true);
        ArrayList arrayList = tz3Var.f;
        arrayList.add(sz3Var);
        sz3 sz3Var2 = new sz3();
        sz3Var2.a = d(false);
        arrayList.add(sz3Var2);
        return tz3Var;
    }

    public static tz3 b(int i) {
        tz3 tz3Var = new tz3(i);
        tz3Var.e = "🏠";
        tz3Var.c = fnb.d("🏠");
        tz3Var.d = TLRPC.ChatTheme.ofEmoticon(tz3Var.e);
        sz3 sz3Var = new sz3();
        sz3Var.a = cmb.O0("Blue");
        sz3Var.e = 99;
        ArrayList arrayList = tz3Var.f;
        arrayList.add(sz3Var);
        sz3 sz3Var2 = new sz3();
        sz3Var2.a = cmb.O0("Day");
        sz3Var2.e = 9;
        arrayList.add(sz3Var2);
        sz3 sz3Var3 = new sz3();
        sz3Var3.a = cmb.O0("Night");
        sz3Var3.e = 0;
        arrayList.add(sz3Var3);
        sz3 sz3Var4 = new sz3();
        sz3Var4.a = cmb.O0("Dark Blue");
        sz3Var4.e = 0;
        arrayList.add(sz3Var4);
        return tz3Var;
    }

    public static tz3 c(int i, TLRPC.TL_theme tL_theme) {
        tz3 tz3Var = new tz3(i);
        String str = tL_theme.emoticon;
        tz3Var.e = str;
        tz3Var.c = new fnb(str, null);
        tz3Var.d = TLRPC.ChatTheme.ofEmoticon(str);
        for (int i2 = 0; i2 < tL_theme.settings.size(); i2++) {
            sz3 sz3Var = new sz3();
            sz3Var.b = tL_theme;
            sz3Var.d = i2;
            tz3Var.f.add(sz3Var);
        }
        return tz3Var;
    }

    public static bmb d(boolean z) {
        bmb B0;
        String string;
        if (z) {
            B0 = cmb.J;
        } else {
            B0 = cmb.B0();
        }
        if (z != B0.o()) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            if (z) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            B0 = cmb.O0(string);
            if (B0 == null) {
                if (z) {
                    str = "Dark Blue";
                }
                B0 = cmb.O0(str);
            }
        }
        return new bmb(B0);
    }

    public static int f(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null) {
            return cmb.D0(i);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return cmb.D0(i);
    }

    public static void o(int i, long j, qac qacVar, TLRPC.WallPaper wallPaper) {
        if (wallPaper.pattern) {
            gm.c3(new al3(i, zsc.b(wallPaper), !TextUtils.isEmpty(wallPaper.slug), wallPaper, new h72(qacVar, (byte) 1)));
            return;
        }
        uf2.e(i);
        uf2.s.c(new fu(j, new qu0(i, j, qacVar, wallPaper), (byte) 9));
    }

    public static void q(bmb bmbVar, int i) {
        String str;
        String str2;
        SparseArray sparseArray;
        amb ambVar;
        if (bmbVar != null) {
            if (i < 0 || (sparseArray = bmbVar.b0) == null || ((ambVar = (amb) sparseArray.get(i)) != null && !ambVar.z)) {
                if (!bmbVar.k().equals("Blue") || i != 99) {
                    if (!bmbVar.k().equals("Day") || i != 9) {
                        if (!bmbVar.k().equals("Night") || i != 0) {
                            if (bmbVar.k().equals("Dark Blue") && i == 0) {
                                return;
                            }
                            if (bmbVar.o()) {
                                str = "lastDarkCustomTheme";
                                str2 = "lastDarkCustomThemeAccentId";
                            } else {
                                str = "lastDayCustomTheme";
                                str2 = "lastDayCustomThemeAccentId";
                            }
                            a.b.getSharedPreferences("themeconfig", 0).edit().putString(str, bmbVar.k()).putInt(str2, i).apply();
                        }
                    }
                }
            }
        }
    }

    public final TLRPC.Document e() {
        TLRPC.ChatTheme chatTheme = this.d;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return brb.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return hs6.d0(this.g).V(((TLRPC.TL_chatTheme) this.d).emoticon);
        }
        return null;
    }

    public final SparseIntArray g(int i, int i2) {
        amb ambVar;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        bmb bmbVar;
        bmb O0;
        amb ambVar2;
        ArrayList arrayList = this.f;
        SparseIntArray sparseIntArray2 = ((sz3) arrayList.get(i2)).f;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        bmb i3 = i(i2);
        if (i3 == null) {
            int i4 = ((sz3) arrayList.get(i2)).d;
            el5 el5Var = (el5) arrayList.get(i2);
            TLRPC.TL_theme tL_theme = ((sz3) arrayList.get(i2)).b;
            if (el5Var != null) {
                O0 = cmb.O0(cmb.q0(((sz3) el5Var).b(i4)));
            } else {
                O0 = cmb.O0("Blue");
            }
            if (O0 != null) {
                bmb bmbVar2 = new bmb(O0);
                if (el5Var != null) {
                    sz3 sz3Var = (sz3) el5Var;
                    ambVar2 = bmbVar2.c(sz3Var.a(), sz3Var.b(i4), tL_theme, i, true);
                } else {
                    ambVar2 = null;
                }
                if (ambVar2 != null) {
                    bmbVar2.u(ambVar2.a);
                }
                ambVar = ambVar2;
                i3 = bmbVar2;
            }
            ambVar = null;
        } else {
            SparseArray sparseArray = i3.b0;
            if (sparseArray != null) {
                ambVar = (amb) sparseArray.get(((sz3) arrayList.get(i2)).e);
            }
            ambVar = null;
        }
        if (i3 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (i3.b != null) {
            sparseIntArray = cmb.R0(new File(i3.b), null, strArr);
        } else {
            String str = i3.d;
            if (str != null) {
                sparseIntArray = cmb.R0(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i5 = 0;
        ((sz3) arrayList.get(i2)).g = strArr[0];
        if (ambVar != null) {
            SparseIntArray clone = sparseIntArray.clone();
            ambVar.d(sparseIntArray, clone);
            fnb fnbVar = this.c;
            if (fnbVar != null && !TextUtils.isEmpty(fnbVar.b) && (bmbVar = ambVar.b) != null && bmbVar.b == null && !bmbVar.o()) {
                amb.g(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray sparseIntArray3 = cmb.hm;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        ((sz3) arrayList.get(i2)).f = sparseIntArray4;
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
                fc4.g(e, true);
                return sparseIntArray4;
            }
        }
    }

    public final long h(int i) {
        return ((sz3) this.f.get(i)).a();
    }

    public final bmb i(int i) {
        return ((sz3) this.f.get(i)).a;
    }

    public final TLRPC.WallPaper j(int i) {
        sz3 sz3Var = (sz3) this.f.get(i);
        TLRPC.ThemeSettings b = sz3Var.b(sz3Var.d);
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
                    ((sz3) arrayList.get(i3)).h = f(g, cmb.qa);
                    ((sz3) arrayList.get(i3)).i = f(g, cmb.qb);
                    ((sz3) arrayList.get(i3)).j = f(g, cmb.Ei);
                    ((sz3) arrayList.get(i3)).k = g.get(cmb.De, 0);
                    ((sz3) arrayList.get(i3)).l = g.get(cmb.Ee, 0);
                    ((sz3) arrayList.get(i3)).m = g.get(cmb.Fe, 0);
                    ((sz3) arrayList.get(i3)).n = g.get(cmb.Ge, 0);
                    g.get(cmb.He, 0);
                    ((sz3) arrayList.get(i3)).getClass();
                    if (((sz3) arrayList.get(i3)).a != null && ((sz3) arrayList.get(i3)).a.k().equals("Blue")) {
                        if (((sz3) arrayList.get(i3)).e >= 0) {
                            i2 = ((sz3) arrayList.get(i3)).e;
                        } else {
                            i2 = ((sz3) arrayList.get(i3)).a.Z;
                        }
                        if (i2 == 99) {
                            ((sz3) arrayList.get(i3)).k = -2368069;
                            ((sz3) arrayList.get(i3)).l = -9722489;
                            ((sz3) arrayList.get(i3)).m = -2762611;
                            ((sz3) arrayList.get(i3)).n = -7817084;
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
        o(this.g, j.id, new rz3(resultCallback, h2, (byte) 0), j);
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
        Bitmap bitmap = (Bitmap) uf2.e(this.g).a.get(Long.valueOf(h2));
        if (bitmap == null) {
            bitmap = f0f.b("thumb_" + h2);
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
        gn5 c = gn5.c(bc4.w(document.thumbs, 140, false, null, false), j.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        imageReceiver.d0(c, "120_140", null, null, null, 1);
        imageReceiver.h1 = new d12(resultCallback, h2, (byte) 5);
        fn5.z().I(imageReceiver, null);
    }

    public tz3(int i) {
        this.f = new ArrayList();
        this.g = i;
    }

    public tz3(int i, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = i;
        this.a = false;
        this.e = tL_chatThemeUniqueGift.gift.slug;
        this.c = fnb.c(tL_chatThemeUniqueGift);
        this.d = tL_chatThemeUniqueGift;
        sz3 sz3Var = new sz3();
        sz3Var.c = tL_chatThemeUniqueGift;
        sz3Var.d = 0;
        arrayList.add(sz3Var);
        sz3 sz3Var2 = new sz3();
        sz3Var2.c = tL_chatThemeUniqueGift;
        sz3Var2.d = 1;
        arrayList.add(sz3Var2);
    }
}
