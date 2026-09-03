package hg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends bg.b {
    public CharSequence f7050c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f7051f;
    public boolean f7052g;
    public long h;
    public int f7053i;
    public int f7054j;
    public List f7055k;
    public int f7056l;
    public TLObject f7057m;

    public static a b(TLRPC.Chat chat, int i10, boolean z4) {
        ?? bVar = new bg.b(9, false);
        bVar.e = chat;
        bVar.d = null;
        bVar.f7052g = z4;
        bVar.f7053i = i10;
        return bVar;
    }

    public static a c(CharSequence charSequence, boolean z4) {
        ?? bVar = new bg.b(7, false);
        bVar.f7050c = charSequence;
        bVar.f7052g = z4;
        return bVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z4, boolean z10) {
        ?? bVar = new bg.b(17, z4);
        bVar.f7053i = i10;
        bVar.h = j10;
        bVar.f7057m = tL_starsGiveawayOption;
        bVar.f7052g = z10;
        return bVar;
    }

    public static a e(int i10, int i11, boolean z4, ArrayList arrayList) {
        boolean z10;
        if (i11 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? bVar = new bg.b(11, z10);
        bVar.f7056l = i10;
        bVar.f7052g = z4;
        bVar.f7051f = arrayList;
        return bVar;
    }

    public static a f(String str) {
        ?? bVar = new bg.b(6, false);
        bVar.f7050c = str;
        return bVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Integer) list.get(i10)).intValue() != ((Integer) list2.get(i10)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(bg.b bVar) {
        a aVar;
        int i10;
        int i11;
        if (this != bVar) {
            if (a.class == bVar.getClass() && (i10 = (aVar = (a) bVar).f1830a) == (i11 = this.f1830a)) {
                if (i11 == 0) {
                    if (this.f7052g == aVar.f7052g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f7053i == aVar.f7053i && this.h == aVar.h && this.f7057m == aVar.f7057m && this.f7052g == aVar.f7052g && this.f1831b == aVar.f1831b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f7053i == aVar.f7053i && g(this.f7055k, aVar.f7055k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f7053i == aVar.f7053i && TextUtils.equals(this.f7050c, aVar.f7050c)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f1830a;
                if (i10 == aVar.f1830a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f7053i == aVar.f7053i && this.f7057m == aVar.f7057m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f7055k, aVar.f7055k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f7050c, aVar.f7050c);
                            }
                            if (this.e == aVar.e && this.f7051f == aVar.f7051f && this.d == aVar.d && this.f7057m == aVar.f7057m && this.f7052g == aVar.f7052g && this.f7053i == aVar.f7053i && this.f7054j == aVar.f7054j && this.h == aVar.h && this.f7056l == aVar.f7056l && TextUtils.equals(this.f7050c, aVar.f7050c)) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
