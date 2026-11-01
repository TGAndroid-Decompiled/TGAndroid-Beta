package ng;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends hg.b {
    public CharSequence f13755c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f13756f;
    public boolean f13757g;
    public long h;
    public int f13758i;
    public int f13759j;
    public List f13760k;
    public int f13761l;
    public TLObject f13762m;

    public static a b(int i10, TLRPC.Chat chat, boolean z10) {
        ?? bVar = new hg.b(9, false);
        bVar.e = chat;
        bVar.d = null;
        bVar.f13757g = z10;
        bVar.f13758i = i10;
        return bVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? bVar = new hg.b(7, false);
        bVar.f13755c = charSequence;
        bVar.f13757g = z10;
        return bVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? bVar = new hg.b(17, z10);
        bVar.f13758i = i10;
        bVar.h = j10;
        bVar.f13762m = tL_starsGiveawayOption;
        bVar.f13757g = z11;
        return bVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? bVar = new hg.b(11, z11);
        bVar.f13761l = i10;
        bVar.f13757g = z10;
        bVar.f13756f = arrayList;
        return bVar;
    }

    public static a f(String str) {
        ?? bVar = new hg.b(6, false);
        bVar.f13755c = str;
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
    public final boolean a(hg.b bVar) {
        a aVar;
        int i10;
        int i11;
        if (this != bVar) {
            if (a.class == bVar.getClass() && (i10 = (aVar = (a) bVar).f7681a) == (i11 = this.f7681a)) {
                if (i11 == 0) {
                    if (this.f13757g == aVar.f13757g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f13758i == aVar.f13758i && this.h == aVar.h && this.f13762m == aVar.f13762m && this.f13757g == aVar.f13757g && this.f7682b == aVar.f7682b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f13758i == aVar.f13758i && g(this.f13760k, aVar.f13760k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f13758i == aVar.f13758i && TextUtils.equals(this.f13755c, aVar.f13755c)) {
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
                int i10 = this.f7681a;
                if (i10 == aVar.f7681a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f13758i == aVar.f13758i && this.f13762m == aVar.f13762m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f13760k, aVar.f13760k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f13755c, aVar.f13755c);
                            }
                            if (this.e == aVar.e && this.f13756f == aVar.f13756f && this.d == aVar.d && this.f13762m == aVar.f13762m && this.f13757g == aVar.f13757g && this.f13758i == aVar.f13758i && this.f13759j == aVar.f13759j && this.h == aVar.h && this.f13761l == aVar.f13761l && TextUtils.equals(this.f13755c, aVar.f13755c)) {
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
