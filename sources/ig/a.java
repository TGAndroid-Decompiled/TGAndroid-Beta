package ig;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends cg.b {
    public CharSequence f8060c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f8061e;
    public Object f8062f;
    public boolean f8063g;
    public long h;
    public int f8064i;
    public int f8065j;
    public List f8066k;
    public int f8067l;
    public TLObject f8068m;

    public static a b(TLRPC.Chat chat, int i10, boolean z4) {
        ?? bVar = new cg.b(9, false);
        bVar.f8061e = chat;
        bVar.d = null;
        bVar.f8063g = z4;
        bVar.f8064i = i10;
        return bVar;
    }

    public static a c(CharSequence charSequence, boolean z4) {
        ?? bVar = new cg.b(7, false);
        bVar.f8060c = charSequence;
        bVar.f8063g = z4;
        return bVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z4, boolean z10) {
        ?? bVar = new cg.b(17, z4);
        bVar.f8064i = i10;
        bVar.h = j10;
        bVar.f8068m = tL_starsGiveawayOption;
        bVar.f8063g = z10;
        return bVar;
    }

    public static a e(int i10, int i11, boolean z4, ArrayList arrayList) {
        boolean z10;
        if (i11 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? bVar = new cg.b(11, z10);
        bVar.f8067l = i10;
        bVar.f8063g = z4;
        bVar.f8062f = arrayList;
        return bVar;
    }

    public static a f(String str) {
        ?? bVar = new cg.b(6, false);
        bVar.f8060c = str;
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
    public final boolean a(cg.b bVar) {
        a aVar;
        int i10;
        int i11;
        if (this != bVar) {
            if (a.class == bVar.getClass() && (i10 = (aVar = (a) bVar).f2505a) == (i11 = this.f2505a)) {
                if (i11 == 0) {
                    if (this.f8063g == aVar.f8063g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f8064i == aVar.f8064i && this.h == aVar.h && this.f8068m == aVar.f8068m && this.f8063g == aVar.f8063g && this.f2506b == aVar.f2506b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f8064i == aVar.f8064i && g(this.f8066k, aVar.f8066k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f8064i == aVar.f8064i && TextUtils.equals(this.f8060c, aVar.f8060c)) {
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
                int i10 = this.f2505a;
                if (i10 == aVar.f2505a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f8064i == aVar.f8064i && this.f8068m == aVar.f8068m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f8066k, aVar.f8066k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f8060c, aVar.f8060c);
                            }
                            if (this.f8061e == aVar.f8061e && this.f8062f == aVar.f8062f && this.d == aVar.d && this.f8068m == aVar.f8068m && this.f8063g == aVar.f8063g && this.f8064i == aVar.f8064i && this.f8065j == aVar.f8065j && this.h == aVar.h && this.f8067l == aVar.f8067l && TextUtils.equals(this.f8060c, aVar.f8060c)) {
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
