package fg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends zf.a {
    public CharSequence f6718c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f6719e;
    public Object f6720f;
    public boolean f6721g;
    public long h;
    public int f6722i;
    public int f6723j;
    public List f6724k;
    public int f6725l;
    public TLObject f6726m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        ?? aVar = new zf.a(9, false);
        aVar.f6719e = chat;
        aVar.d = null;
        aVar.f6721g = z10;
        aVar.f6722i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new zf.a(7, false);
        aVar.f6718c = charSequence;
        aVar.f6721g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        ?? aVar = new zf.a(17, z10);
        aVar.f6722i = i10;
        aVar.h = j10;
        aVar.f6726m = tL_starsGiveawayOption;
        aVar.f6721g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i11 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new zf.a(11, z11);
        aVar.f6725l = i10;
        aVar.f6721g = z10;
        aVar.f6720f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new zf.a(6, false);
        aVar.f6718c = str;
        return aVar;
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
    public final boolean a(zf.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).f50845a) == (i11 = this.f50845a)) {
                if (i11 == 0) {
                    if (this.f6721g == aVar2.f6721g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f6722i == aVar2.f6722i && this.h == aVar2.h && this.f6726m == aVar2.f6726m && this.f6721g == aVar2.f6721g && this.f50846b == aVar2.f50846b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f6722i == aVar2.f6722i && g(this.f6724k, aVar2.f6724k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f6722i == aVar2.f6722i && TextUtils.equals(this.f6718c, aVar2.f6718c)) {
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
                int i10 = this.f50845a;
                if (i10 == aVar.f50845a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f6722i == aVar.f6722i && this.f6726m == aVar.f6726m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f6724k, aVar.f6724k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f6718c, aVar.f6718c);
                            }
                            if (this.f6719e == aVar.f6719e && this.f6720f == aVar.f6720f && this.d == aVar.d && this.f6726m == aVar.f6726m && this.f6721g == aVar.f6721g && this.f6722i == aVar.f6722i && this.f6723j == aVar.f6723j && this.h == aVar.h && this.f6725l == aVar.f6725l && TextUtils.equals(this.f6718c, aVar.f6718c)) {
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
